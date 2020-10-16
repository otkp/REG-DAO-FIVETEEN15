package org.epragati.master.mappers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.RegistrationDetailsDTO;
import org.epragati.master.dto.RoleActionDTO;
import org.epragati.master.dto.StagingRegistrationDetailsDTO;
import org.epragati.rta.reports.vo.CitizenEnclosuresVO;
import org.epragati.rta.reports.vo.StagingRejectedListVO;
import org.epragati.util.RoleEnum;
import org.epragati.util.StatusRegistration;
import org.epragati.util.payment.ServiceEnum;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class StagingDetailsMapper extends BaseMapper<StagingRegistrationDetailsDTO, RegistrationDetailsDTO> {

	private String replaceDefaults(String input) {

		if (StringUtils.isBlank(input)) {
			return StringUtils.EMPTY;
		}
		return input;
	}

	@Override
	public RegistrationDetailsDTO convertEntity(StagingRegistrationDetailsDTO dto) {

		RegistrationDetailsDTO regdto = new RegistrationDetailsDTO();

		BeanUtils.copyProperties(dto, regdto);

		funPoint(dto.getActionDetails(), regdto::setActionDetails);

		funPoint(dto.getActionDetailsLog(), regdto::setActionDetailsLog);

		regdto.setActionStatus(dto.getActionStatus());

		regdto.setAlterVehicleDetails(dto.getAlterVehicleDetails());

		regdto.setAgreementDate(dto.getAgreementDate());

		// regdto.setAllowForOtherServiceByDataEntry(dto.geta);
		regdto.setApplicantDetails(dto.getApplicantDetails());

		regdto.setInvoiceDetails(dto.getInvoiceDetails());
		// TR
		regdto.setTrNo(dto.getTrNo());
		// PR
		regdto.setPrNo(dto.getPrNo());

		regdto.setClassOfVehicle(dto.getClassOfVehicle());

		regdto.setVahanDetails(dto.getVahanDetails());

		regdto.setApplicationNo(dto.getApplicationNo());

		regdto.setCesFee(dto.getCesFee());

		regdto.setClassOfVehicleDesc(dto.getClassOfVehicleDesc());

		regdto.setIsTrExpired(dto.getIsTrExpired());

		regdto.setVehicleDetails(dto.getVehicleDetails());

		regdto.setTrValidUpto(dto.getTrValidUpto());

		regdto.setPucDetailsDTO(dto.getPucDetailsDTO());

		regdto.setPrValidUpto(dto.getPrValidUpto());

		regdto.setInsuranceDetails(dto.getInsuranceDetails());

		regdto.setInsuranceType(dto.getInsuranceType());

		regdto.setFeeDetails(dto.getFeeDetails());

		return regdto;
	}

	public List<CitizenEnclosuresVO> convertDetails(StagingRegistrationDetailsDTO staging) {

		CitizenEnclosuresVO vo = new CitizenEnclosuresVO();
		List<CitizenEnclosuresVO> finalList = new ArrayList<>();

		vo.setApplicantName(staging.getApplicantDetails().getFirstName());
		vo.setApplStatus(staging.getApplicationStatus());
		vo.setApplicationNo(staging.getApplicationNo());
		vo.setCov(staging.getClassOfVehicleDesc());
		if (staging.getVahanDetails() != null) {
			vo.setChassisNo(staging.getVahanDetails().getChassisNumber());
			vo.setEngineNo(staging.getVahanDetails().getEngineNumber());
		}
		vo.setServiceType(Arrays.asList(ServiceEnum.FR));
		if (staging.getCreatedDate() != null) {
			vo.setAppliedDate(staging.getCreatedDate().toLocalDate());
		}
		if (staging.getFlowDetailsLog() != null) {

			staging.getFlowDetailsLog().stream().forEach(flow -> {
				Map<Integer, List<RoleActionDTO>> flowDetails = flow.getFlowDetails();

				Collection<List<RoleActionDTO>> roleActionDTO = flowDetails.values();
				roleActionDTO.stream().forEach(b -> {
					for (RoleActionDTO c : b) {
						if ((c.getRole()).equalsIgnoreCase(RoleEnum.MVI.getName())) {
							vo.setMviUserId(c.getUserId());
							vo.setMviApprovedDate(c.getActionTime().toLocalDate());
						}
						if ((c.getRole()).equalsIgnoreCase(RoleEnum.CCO.getName())) {
							vo.setCcouserId(c.getUserId());
							vo.setCcoApprovedDate(c.getActionTime().toLocalDate());
						}
						if ((c.getRole()).equalsIgnoreCase(RoleEnum.AO.getName())) {
							vo.setAoUserId(c.getUserId());
							vo.setAoApprovedDate(c.getActionTime().toLocalDate());
						}
						if ((c.getRole()).equalsIgnoreCase(RoleEnum.RTO.getName())) {
							vo.setRtouserId(c.getUserId());
							vo.setRtoApprovedDate(c.getActionTime().toLocalDate());
						}
					}
				});
			});
		}
		finalList.add(vo);
		return finalList;
	}

	public StagingRejectedListVO convertHistory(StagingRegistrationDetailsDTO dto) {

		StagingRejectedListVO vo = new StagingRejectedListVO();

		if (dto.getTrNo() != null)
			vo.setTrNo(dto.getTrNo());

		if (dto.getApplicantDetails() != null && dto.getApplicantDetails().getDisplayName() != null)
			vo.setName(dto.getApplicantDetails().getDisplayName().toUpperCase());

		if (dto.getClassOfVehicleDesc() != null)
			vo.setCov(dto.getClassOfVehicleDesc());
		if (dto.getInvoiceDetails() != null && dto.getInvoiceDetails().getInvoiceValue() != null)
			vo.setInvoiceAmount(dto.getInvoiceDetails().getInvoiceValue().toString());

		if (dto.getApplicantDetails().getContact() != null
				&& dto.getApplicantDetails().getContact().getMobile() != null)
			vo.setMobileNo(dto.getApplicantDetails().getContact().getMobile());

		if (dto.getDealerDetails() != null && dto.getDealerDetails().getDealerName() != null)
			vo.setDealerName(dto.getDealerDetails().getDealerName().toUpperCase());

		if (dto.getRejectionHistory() != null && dto.getRejectionHistory().getSecondVehicleId() != null)
			vo.setSecondVehNo(dto.getRejectionHistory().getSecondVehicleId());
		if (dto.getApplicationStatus().equalsIgnoreCase(StatusRegistration.REJECTED.getDescription())) {
			if (dto.getlUpdate() != null)
				vo.setRejectedDate(dto.getlUpdate().toLocalDate());
		}
		if (dto.getApplicantDetails().getPresentAddress() != null) {
			vo.setApplicantAddress(replaceDefaults(
					dto.getApplicantDetails().getPresentAddress().getDoorNo() == null ? StringUtils.EMPTY
							: dto.getApplicantDetails().getPresentAddress().getDoorNo())
					+ " , "
					+ replaceDefaults(
							dto.getApplicantDetails().getPresentAddress().getTownOrCity() == null ? StringUtils.EMPTY
									: dto.getApplicantDetails().getPresentAddress().getTownOrCity().toUpperCase())

					+ " , "
					+ replaceDefaults(
							dto.getApplicantDetails().getPresentAddress().getStreetName() == null ? StringUtils.EMPTY
									: dto.getApplicantDetails().getPresentAddress().getStreetName().toUpperCase())
					+ " , "
					+ replaceDefaults(dto.getApplicantDetails().getPresentAddress().getMandal().getMandalName() == null
							? StringUtils.EMPTY
							: dto.getApplicantDetails().getPresentAddress().getMandal().getMandalName().toUpperCase())
					+ " , "
					+ replaceDefaults(
							dto.getApplicantDetails().getPresentAddress().getDistrict().getDistrictName() == null
									? StringUtils.EMPTY
									: dto.getApplicantDetails().getPresentAddress().getDistrict().getDistrictName()));
		}
		vo.setDealerAddress(dto.getDealerDetails() == null || dto.getDealerDetails().getAddress() == null
				|| dto.getDealerDetails().getAddress().getDoorNo() == null
						? StringUtils.EMPTY
						: dto.getDealerDetails().getAddress().getDoorNo().toUpperCase() + "/n"
								+ dto.getDealerDetails().getAddress() == null
								|| dto.getDealerDetails().getAddress().getMandal() == null
								|| dto.getDealerDetails().getAddress().getMandal().getMandalName() == null
										? StringUtils.EMPTY
										: dto.getDealerDetails().getAddress().getMandal().getMandalName().toUpperCase()
												+ "/n" + dto.getDealerDetails().getAddress().getDistrict() == null
														? StringUtils.EMPTY
														: dto.getDealerDetails().getAddress().getDistrict()
																.getDistrictName().toUpperCase());

		if (dto.getDealerDetails().getAddress() != null) {
			vo.setDealerAddress(replaceDefaults(
					dto.getDealerDetails().getAddress().getDoorNo() == null ? StringUtils.EMPTY
							: dto.getDealerDetails().getAddress().getDoorNo())
					+ " , "
					+ replaceDefaults(dto.getDealerDetails().getAddress().getMandal() == null
							&& dto.getDealerDetails().getAddress().getMandal().getMandalName() == null
									? StringUtils.EMPTY
									: dto.getDealerDetails().getAddress().getMandal().getMandalName().toUpperCase())
					+ " , "
					+ replaceDefaults(dto.getDealerDetails().getAddress().getDistrict() == null
							&& dto.getDealerDetails().getAddress().getDistrict().getDistrictName() == null
									? StringUtils.EMPTY
									: dto.getDealerDetails().getAddress().getDistrict().getDistrictName()
											.toUpperCase()));
		}
		
		if (dto.getApplicationStatus() != null) {
			if (dto.getApplicationStatus().equals(StatusRegistration.REJECTED.getDescription())) {
				vo.setStatus("REJECTED");
			}
			else if (dto.getApplicationStatus().equals(StatusRegistration.TAXPENDING.getDescription())
					|| dto.getApplicationStatus().equals(StatusRegistration.SECORINVALIDPENDING.getDescription())
					|| dto.getApplicationStatus().equals(StatusRegistration.SECORINVALIDFAILED.getDescription())
					|| dto.getApplicationStatus().equals(StatusRegistration.SECORINVALIDINITIATED.getDescription())) {
				vo.setStatus("TAX PENDING");
			}
			else if (dto.getApplicationStatus().equals(StatusRegistration.SECORINVALIDDONE.getDescription())
					|| dto.getApplicationStatus().equals(StatusRegistration.TAXPAID.getDescription())) {
				vo.setStatus("TAX PAID");
			} else
				vo.setStatus("TO BE APPROVED");
		}
		return vo;
	}

}
