package org.epragati.dispatcher.mapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.dispatcher.dto.DispatcherSubmissionDTO;
import org.epragati.dispatcher.dto.RecordsDTO;
import org.epragati.dispatcher.vo.DispatcherSubmissionVO;
import org.epragati.master.dto.RegistrationDetailsDTO;
import org.epragati.payment.report.vo.OsDataEntryFinalVO;
import org.epragati.payment.report.vo.OsDataEntryReport;
import org.epragati.regservice.dto.ActionDetails;
import org.epragati.regservice.dto.NOCDetailsDTO;
import org.epragati.regservice.dto.RegServiceDTO;
import org.epragati.util.RoleEnum;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class DispatcherMapper extends BaseMapper<DispatcherSubmissionDTO, DispatcherSubmissionVO> {

	public static final String DISPATCH = "Dispatcher_Report.jasper";

	@Override
	public DispatcherSubmissionVO convertEntity(DispatcherSubmissionDTO dto) {

		DispatcherSubmissionVO dispatcherSubmissionVO = new DispatcherSubmissionVO();

		funPoint(dto.getApplicationNo(), dispatcherSubmissionVO::setApplicationNo);
		funPoint(dto.getName(), dispatcherSubmissionVO::setUserName);
		funPoint(dto.getPostedDate(), dispatcherSubmissionVO::setPostedDate);
		funPoint(dto.getEmsNumber(), dispatcherSubmissionVO::setEmsNumber);
		funPoint(dto.getOfficeCode(), dispatcherSubmissionVO::setOfficeCode);
		funPoint(dto.getPrNo(), dispatcherSubmissionVO::setPrNo);
		funPoint(dto.getRemarks(), dispatcherSubmissionVO::setRemarks);
		funPoint(dto.getDispatchedBy(), dispatcherSubmissionVO::setDispatchedBy);
		funPoint(dto.getMobileNo(), dispatcherSubmissionVO::setMobileNo);
		funPoint(dto.getPinCode(), dispatcherSubmissionVO::setPincode);
		funPoint(dto.getReturnReason(), dispatcherSubmissionVO::setReturnReason);
		funPoint(dto.getReturnDate(), dispatcherSubmissionVO::setReturnDate);
		funPoint(dto.getDeliveryDate(), dispatcherSubmissionVO::setDeliveryDate);
		dispatcherSubmissionVO.setIsDateEdit(Boolean.FALSE);
		return dispatcherSubmissionVO;
	}

	@Override
	public List<DispatcherSubmissionVO> convertEntity(List<DispatcherSubmissionDTO> dtos) {
		// TODO Auto-generated method stub
		return dtos.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}

	@Override
	public List<DispatcherSubmissionDTO> convertVO(List<DispatcherSubmissionVO> vos) {

		List<DispatcherSubmissionDTO> dispatcherDTO = new ArrayList<>();

		List<DispatcherSubmissionVO> listSize = new ArrayList<>();

		vos.parallelStream().forEach(vo -> {

			/**
			 * checking fields validation is-empty, is-null, if found thean it not allowed
			 */

			if (StringUtils.isBlank(vo.getRemarks()) || StringUtils.isBlank(vo.getEmsNumber())) {

				listSize.add(vo);

			} else {

				DispatcherSubmissionDTO dto = new DispatcherSubmissionDTO();

				/*
				 * dto.setApplicationNo(vo.getApplicationNo());
				 * dto.setEmsNumber(vo.getEmsNumber());
				 */
				// LocalDate localDate = LocalDate.parse(vo.getPostedDate(), DATEFORMATTER);

				// LocalDateTime localDateTime = LocalDateTime.of(localDate,
				// LocalDateTime.now().toLocalTime());

				// dto.setPostedDate(vo.getPostedDate());
				// dto.setRemarks(vo.getRemarks());
				// dto.setApplicationNo(vo.getApplicationNo());
				// dto.setPrNo(vo.getPrNo());
				// dto.setName(vo.getUserName());
				// dto.setEmsNumber(vo.getEmsNumber());
				//
				// dto.setDispatchedBy(vo.getDispatchedBy());
				// dto.setOfficeCode(vo.getOfficeCode());

				dto = convertVO(vo);
				dispatcherDTO.add(dto);

			}

		});

		// Removing null objects from list
		vos.removeAll(listSize);

		/**
		 * checking how many object property found null
		 */
//		if (!(listSize.isEmpty())) {
//			// throw new DispatcherSubmissionUtilMapper(listSize);
//			DispatcherSubMapperAndServiceUtil.assignApplication(listSize);
//
//		}
		return dispatcherDTO;
	}

	@Override
	public DispatcherSubmissionDTO convertVO(DispatcherSubmissionVO vo) {
		// TODO Auto-generated method stub
		DispatcherSubmissionDTO dispatcherSubmissionDTO = new DispatcherSubmissionDTO();

		funPoint(vo.getApplicationNo(), dispatcherSubmissionDTO::setApplicationNo);
		funPoint(vo.getUserName(), dispatcherSubmissionDTO::setName);
		funPoint(vo.getPostedDate(), dispatcherSubmissionDTO::setPostedDate);
		funPoint(vo.getEmsNumber(), dispatcherSubmissionDTO::setEmsNumber);
		funPoint(vo.getOfficeCode(), dispatcherSubmissionDTO::setOfficeCode);
		funPoint(vo.getPrNo(), dispatcherSubmissionDTO::setPrNo);
		funPoint(vo.getRemarks(), dispatcherSubmissionDTO::setRemarks);
		funPoint(vo.getDispatchedBy(), dispatcherSubmissionDTO::setDispatchedBy);
		funPoint(vo.getMobileNo(), dispatcherSubmissionDTO::setMobileNo);
		funPoint(vo.getPincode(), dispatcherSubmissionDTO::setPinCode);
		funPoint(vo.getReturnReason(), dispatcherSubmissionDTO::setReturnReason);
		funPoint(vo.getReturnDate(), dispatcherSubmissionDTO::setReturnDate);

		return dispatcherSubmissionDTO;
	}

	public RecordsDTO recordsMapping(RegistrationDetailsDTO registerDTO) {
		RecordsDTO recordsDTO = new RecordsDTO();

		funPoint(registerDTO.getApplicationNo(), recordsDTO::setApplicationNo);
		funPoint(registerDTO.getPrNo(), recordsDTO::setPrNo);
		funPoint(registerDTO.getApplicantDetails().getDisplayName(), recordsDTO::setUserName);
		funPoint(LocalDateTime.now(), recordsDTO::setPostedDate);
		if (registerDTO.getApplicantDetails().getContact() != null) {
			if (registerDTO.getApplicantDetails().getContact().getMobile() != null) {
				funPoint(registerDTO.getApplicantDetails().getContact().getMobile(), recordsDTO::setMobileNo);
			}
			if (registerDTO.getApplicantDetails().getPresentAddress().getPostOffice() != null && registerDTO
					.getApplicantDetails().getPresentAddress().getPostOffice().getPostOfficeCode() != null) {
				funPoint(registerDTO.getApplicantDetails().getPresentAddress().getPostOffice().getPostOfficeCode(),
						recordsDTO::setPinCode);
			}
		}
		/*
		 * recordsDTO.setApplicationNo(registerDTO.getApplicationNo());
		 * recordsDTO.setPrNo(registerDTO.getPrNo());
		 * recordsDTO.setUserName(registerDTO.getApplicantDetails().getDisplayName());
		 */
		// recordsDTO.setPostedDate(LocalDateTime.now());

		/*
		 * long autoIdIncrement=dispatcherRepository.count();
		 * recordsDTO.setId(String.valueOf(++autoIdIncrement));
		 */
		return recordsDTO;
	}

	public Map<String, LocalDateTime> stringToDateConvertor(String from, String to) {
		String datePart[] = from.split("-");

		int dd = Integer.parseInt(datePart[0]);
		int mm = Integer.parseInt(datePart[1]);
		int yyyy = Integer.parseInt(datePart[2]);

		String dateFrom = LocalDate.of(yyyy, mm, dd).toString() + "T00:00:00.000Z";
		ZonedDateTime zdt = ZonedDateTime.parse(dateFrom);
		LocalDateTime localDateTime = zdt.toLocalDateTime();

		String datePart1[] = to.split("-");

		dd = Integer.parseInt(datePart1[0]);
		mm = Integer.parseInt(datePart1[1]);
		yyyy = Integer.parseInt(datePart1[2]);

		String dateFrom1 = LocalDate.of(yyyy, mm, dd).toString() + "T23:59:59.999Z";
		ZonedDateTime zdt1 = ZonedDateTime.parse(dateFrom1);
		LocalDateTime localDateTime1 = zdt1.toLocalDateTime();

		Map<String, LocalDateTime> dates = new HashMap<>();

		dates.put("from", localDateTime);
		dates.put("to", localDateTime1);
		return dates;
	}
	
	private String getValue(String value) {
		if (StringUtils.isNotBlank(value)) {
			return value;
		}
		return StringUtils.EMPTY;
	}
	
	public OsDataEntryFinalVO convertEntityToVo(List<RegServiceDTO> listOfRecords, HashMap<String, Double> hashMap) {
		List<OsDataEntryReport> throughMvi = new ArrayList<OsDataEntryReport>();
		List<OsDataEntryReport> throughOnline = new ArrayList<OsDataEntryReport>();
		String applicationStatus =StringUtils.EMPTY;
		Set<String> keySet = hashMap.keySet();
		for (RegServiceDTO a : listOfRecords) {
			OsDataEntryReport osDataEntryReport = new OsDataEntryReport();
			 applicationStatus = a.getApplicationStatus() != null
					? getValue(a.getApplicationStatus().getDescription())
					: StringUtils.EMPTY;
			funPoint(a.getApplicationNo(), osDataEntryReport::setApplicationNo);
			funPoint(applicationStatus, osDataEntryReport::setApplicationStatus);
			funPoint(a.getPrNo(), osDataEntryReport::setPrNo);
			funPoint(a.getRegistrationDetails().getClassOfVehicle(), osDataEntryReport::setClassOfVehicle);
			funPoint(a.getRegistrationDetails().getVehicleType(), osDataEntryReport::setVehicleType);
			if (a.getnOCDetails() != null) {
				NOCDetailsDTO getnOCDetails = a.getnOCDetails();
				String issuedDate = getnOCDetails.getIssueDate() != null
						? getValue(getnOCDetails.getIssueDate().toString())
						: StringUtils.EMPTY;
				String dateOfEntry = getnOCDetails.getDateOfEntry() != null
						? getValue(getnOCDetails.getIssueDate().toString())
						: StringUtils.EMPTY;
				String rtaOffice = getnOCDetails.getRtaOffice() != null ? getValue(getnOCDetails.getRtaOffice())
						: StringUtils.EMPTY;
				String state = getnOCDetails.getState() != null ? getValue(getnOCDetails.getState())
						: StringUtils.EMPTY;
				funPoint(issuedDate, osDataEntryReport::setNocIssuedDate);
				funPoint(dateOfEntry, osDataEntryReport::setStateEntryDate);
				funPoint(rtaOffice.concat(state), osDataEntryReport::setStateName);
			}
			if (a.getRegistrationDetails() != null && a.getRegistrationDetails().getApplicantDetails() != null) {
				funPoint(a.getRegistrationDetails().getApplicantDetails().getDisplayName(),
						osDataEntryReport::setOwnerName);
			}
			if (keySet.contains(a.getApplicationNo())) {
				funPoint(hashMap.get(a.getApplicationNo()), osDataEntryReport::setTaxAmount);
				if (a.getTaxDetails() != null) {
					funPoint(a.getTaxDetails().getTaxType(), osDataEntryReport::setTaxType);
					String date = a.getTaxDetails().getPaymentDAte() == null ? StringUtils.EMPTY
							: getValue(a.getTaxDetails().getPaymentDAte().toString());
					funPoint(date, osDataEntryReport::setPaymentDate);
					throughOnline.add(osDataEntryReport);
					continue;
				}
			} else {
				if (a.getTaxDetails() != null) {
//					funPoint(a.getTaxDetails().getMvi(), osDataEntryReport::setMviName);
					funPoint(a.getTaxDetails().getVcrno(), osDataEntryReport::setVcrNo);
					funPoint(a.getTaxDetails().getTaxAmount(), osDataEntryReport::setMviAmount);
					String date = a.getTaxDetails().getPaymentDAte() == null ? StringUtils.EMPTY
							: getValue(a.getTaxDetails().getPaymentDAte().toString());
					funPoint(date, osDataEntryReport::setPaymentDate);
					List<ActionDetails> actionDetails = a.getActionDetails();
					if (!CollectionUtils.isEmpty(actionDetails)) {
						List<ActionDetails> actionList = actionDetails.stream()
								.filter(action -> RoleEnum.roleList().contains(action.getRole()))
								.collect(Collectors.toList());
						Map<String, List<String>> rolesMap = new HashMap<String, List<String>>();
						for (ActionDetails actions : actionList) {
							List<String> dateAndName = new ArrayList<String>();
							String approvedDate = actions.getlUpdate() != null
									? getValue(actions.getlUpdate().toString())
									: StringUtils.EMPTY;
							String adminName = actions.getRole() != null ? getValue(actions.getRole())
									: StringUtils.EMPTY;
							String userName = actions.getUserId() != null ? getValue(actions.getUserId())
									: StringUtils.EMPTY;
							String status = actions.getStatus() != null ? getValue(actions.getStatus())
									: StringUtils.EMPTY;
							dateAndName.add(userName);
							dateAndName.add(approvedDate);
							dateAndName.add(status);
							rolesMap.put(adminName, dateAndName);
							funPoint(rolesMap, osDataEntryReport::setRoles);
						}
					}
				}
			}
			throughMvi.add(osDataEntryReport);
		}
		OsDataEntryFinalVO osDataEntryFinalVO = new OsDataEntryFinalVO();
		Map<String, List<OsDataEntryReport>> throughMviCollAmount = new HashMap<String, List<OsDataEntryReport>>();
		Map<String, List<OsDataEntryReport>> throughOnlinePay = new HashMap<String, List<OsDataEntryReport>>();
		throughMviCollAmount.put("throughMviCollAmount", throughMvi);
		throughOnlinePay.put("throughOnlinePay", throughOnline);
		funPoint(throughMviCollAmount, osDataEntryFinalVO::setThroughMviCollRecords);
		funPoint(throughOnlinePay, osDataEntryFinalVO::setThroughOnlinePayRecords);
		funPoint(throughMvi.size(), osDataEntryFinalVO::setThroughMviCollAmount);
		funPoint(throughOnline.size(), osDataEntryFinalVO::setThroughOnlinePay);
		return osDataEntryFinalVO;
	}

	public void mappingNonPayTax(List<String> noTaxRecordFoundList, List<RegServiceDTO> listOfRecords,
			OsDataEntryFinalVO osDataEntryFinalVO) {
		Map<String, List<OsDataEntryReport>> noTaxes = new HashMap<String, List<OsDataEntryReport>>();
		List<RegServiceDTO> noTax = listOfRecords.stream()
				.filter(p -> noTaxRecordFoundList.contains(p.getApplicationNo())).collect(Collectors.toList());
		List<OsDataEntryReport> list=new ArrayList<OsDataEntryReport>();
		noTax.forEach(tax -> {
			OsDataEntryReport osDataEntryReport = new OsDataEntryReport();
			funPoint(tax.getApplicationNo(), osDataEntryReport::setApplicationNo);
			funPoint(tax.getPrNo(), osDataEntryReport::setPrNo);
			if (tax.getRegistrationDetails() != null) {
				funPoint(tax.getRegistrationDetails().getClassOfVehicle(), osDataEntryReport::setClassOfVehicle);
				funPoint(tax.getRegistrationDetails().getVehicleType(), osDataEntryReport::setVehicleType);
				if (tax.getRegistrationDetails().getApplicantDetails() != null) {
					if (tax.getRegistrationDetails() != null
							&& tax.getRegistrationDetails().getApplicantDetails() != null) {
						funPoint(tax.getRegistrationDetails().getApplicantDetails().getDisplayName(),
								osDataEntryReport::setOwnerName);
					}
				}
			}
			list.add(osDataEntryReport);
		});
		noTaxes.put("noTax", list);
		osDataEntryFinalVO.setNoTaxRecordCount(list.size());
		int size = list.size();
		osDataEntryFinalVO.setNoTaxRecords(noTaxes);
		if (osDataEntryFinalVO.getThroughMviCollRecords() != null) {
			List<OsDataEntryReport> mviList = osDataEntryFinalVO.getThroughMviCollRecords().get("throughMviCollAmount");
			List<OsDataEntryReport> onlineList = osDataEntryFinalVO.getThroughOnlinePayRecords()
					.get("throughOnlinePay");
			if (!CollectionUtils.isEmpty(mviList))
				size = size + mviList.size();

			if (!CollectionUtils.isEmpty(onlineList))
				size = size + onlineList.size();

		}
		funPoint(size, osDataEntryFinalVO::setTotalRecords);
		
	}
}


