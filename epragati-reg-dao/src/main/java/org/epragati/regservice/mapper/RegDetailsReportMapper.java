package org.epragati.regservice.mapper;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.epragati.common.dao.ErrorTrackLogDAO;
import org.epragati.common.dto.ErrorTrackLogDTO;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.common.vo.UserStatusEnum;
import org.epragati.master.dao.FcDetailsDAO;
import org.epragati.master.dao.TaxDetailsDAO;
import org.epragati.master.dto.FcDetailsDTO;
import org.epragati.master.dto.RegistrationDetailsDTO;
import org.epragati.master.dto.TaxDetailsDTO;
import org.epragati.permits.dao.PermitDetailsDAO;
import org.epragati.permits.dto.PermitDetailsDTO;
import org.epragati.reports.dao.RegDetailsReportDAO;
import org.epragati.reports.dto.RegDetailsReportDTO;
import org.epragati.rta.reports.vo.RegDetailsReportVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegDetailsReportMapper extends BaseMapper<RegistrationDetailsDTO, RegDetailsReportDTO> {

	@Autowired
	private ErrorTrackLogDAO errorTrackLogDAO;

	@Autowired
	private RegDetailsReportDAO regDetailsReportDAO;

	@Autowired
	private TaxDetailsDAO taxDetailsDAO;

	@Autowired
	private FcDetailsDAO fcDetailsDAO;

	@Autowired
	private PermitDetailsDAO permitDAO;

	@Override
	public RegDetailsReportDTO convertEntity(RegistrationDetailsDTO dto) {

		try {
			
			RegDetailsReportDTO reportDto = null;
			Optional<RegDetailsReportDTO> regReportDto = regDetailsReportDAO
					.findBychassisNumber(dto.getVahanDetails().getChassisNumber());
			if (regReportDto.isPresent() && !regReportDto.get().getPrNo().equalsIgnoreCase(dto.getPrNo())) {
				reportDto = regReportDto.get();
				reportDto.setChassisStatus(UserStatusEnum.INACTIVE.toString());
				regDetailsReportDAO.save(reportDto);
			}
			reportDto = new RegDetailsReportDTO();
			reportDto.setApplicationNumber(dto.getApplicationNo());
			Optional<TaxDetailsDTO> taxDTO = taxDetailsDAO
					.findByApplicationNoOrderByCreatedDateDesc(dto.getApplicationNo());
			if (taxDTO.isPresent()) {
				TaxDetailsDTO tax = taxDTO.get();
				funPoint(getValue(tax.getPaymentPeriod()), reportDto::setTaxType);
				funPoint(tax.getTaxPeriodFrom(), reportDto::setTaxValidityFrom);
				funPoint(tax.getTaxAmount(), reportDto::setTaxAmount);
				funPoint(tax.getTaxPeriodEnd(), reportDto::setTaxValidityTo);
			}

			reportDto.setChassisStatus(UserStatusEnum.ACTIVE.toString());
			funPoint(dto.getPrNo(), reportDto::setPrNo);
			funPoint(getValue(dto.getTrNo()), reportDto::setTrNo);
			funPoint(dto.getClassOfVehicleDesc(), reportDto::setClassOfVehicle);
			funPoint(dto.getVahanDetails().getChassisNumber(), reportDto::setChassisNumber);
			if (dto.getlUpdate() != null) {
				reportDto.setLastUpdatedDate(dto.getlUpdate());
			}
			if (dto.getCreatedDate() != null) {
				reportDto.setCreatedDate(dto.getCreatedDate());
			}
			if (dto.getOfficeDetails() != null) {
				reportDto.setDistrictId(dto.getOfficeDetails().getDistrict());
				reportDto.setOfficeCode(getValue(dto.getOfficeDetails().getOfficeCode()));
				reportDto.setOfficeName(getValue(dto.getOfficeDetails().getOfficeName()));
			}
			if (dto.getFinanceDetails() != null) {
				funPoint(getValue(dto.getFinanceDetails().getStatus()), reportDto::setFinanceStatus);
				if (dto.getFinanceDetails().getFinanceType() != null) {
					funPoint(getValue(dto.getFinanceDetails().getFinanceType().getFinanceType()),
							reportDto::setFinanceType);
				}
				funPoint(getValue(dto.getFinanceDetails().getUserId()), reportDto::setFinanceName);
			}
			if (dto.getApplicantDetails() != null) {
				funPoint(getValue(dto.getApplicantDetails().getAadharNo()), reportDto::setAadhaarNumber);
				funPoint(getValue(dto.getApplicantDetails().getFirstName()), reportDto::setApplicantName);
				funPoint(getValue(dto.getApplicantDetails().getFatherName()), reportDto::setFatherName);
			}
			if (dto.getOwnerType() != null) {
				funPoint(dto.getOwnerType().toString(), reportDto::setOwnerType);
			}
			funPoint(getValue(dto.getVehicleType()), reportDto::setVehicleType);
			if (dto.getVehicleType().equalsIgnoreCase("T")) {
				Optional<FcDetailsDTO> fcDto = fcDetailsDAO.findByPrNoOrderByCreatedDateDesc(dto.getPrNo());
				if (fcDto.isPresent()) {
					FcDetailsDTO fitness = fcDto.get();
					funPoint(fitness.getFcNumber(), reportDto::setFitnessNumber);
					funPoint(fitness.getFcValidUpto(), reportDto::setFitnessValidityTo);
				}
				List<PermitDetailsDTO> permitDto = permitDAO.findByPrNoAndPermitStatus(dto.getPrNo(), "Active");
				if (!permitDto.isEmpty()) {
					PermitDetailsDTO permit = permitDto.stream().findFirst().get();
					funPoint(permit.getPermitNo(), reportDto::setPermitNumber);
					if (permit.getPermitType() != null && permit.getPermitValidityDetails() != null) {
						funPoint(permit.getPermitType().getPermitType(), reportDto::setPermitType);
						funPoint(permit.getPermitValidityDetails().getPermitValidTo(), reportDto::setPermitValidityTo);
					}
				}
			}

			if (dto.getInvoiceDetails() != null) {
				funPoint(getValue(dto.getInvoiceDetails().getInvoiceNo()), reportDto::setInvoiceNumber);
				reportDto.setInvoiceAmount(dto.getInvoiceDetails().getInvoiceValue());
			}
			if (dto.getDealerDetails() != null) {
				funPoint(getValue(dto.getDealerDetails().getDealerId()), reportDto::setDealerId);
			}

			if (dto.getRegistrationValidity() != null) {
				reportDto.setRegistrationValidity(dto.getRegistrationValidity());
			}
			if (dto.getVehicleDetails() != null) {
				reportDto.setVehicleDetails(dto.getVehicleDetails());
			}

			return reportDto;
		} catch (Exception e) {
			ErrorTrackLogDTO errorTrackLog = new ErrorTrackLogDTO();
			errorTrackLog.setPrNo(dto.getPrNo());
			errorTrackLog.setCreatedDate(LocalDateTime.now());
			errorTrackLog.setModuleCode("REGDETAILSREPORT");
			errorTrackLog.setApplicationNo(dto.getApplicationNo());
			errorTrackLog.setError(e.getMessage());
			errorTrackLogDAO.save(errorTrackLog);
		}
		return null;
	}

	private String getValue(String value) {
		if (StringUtils.isNotBlank(value)) {
			return value;
		}
		return StringUtils.EMPTY;
	}

	public List<RegDetailsReportVO> convertToVO(List<RegDetailsReportDTO> dtoList) {
		List<RegDetailsReportVO> regDetailsList = new ArrayList<RegDetailsReportVO>();
		dtoList.stream().forEach(dto -> {
			RegDetailsReportVO regVO = new RegDetailsReportVO();
			regVO.setPrNo(dto.getPrNo());
			regVO.setTrNo(dto.getTrNo());
			regVO.setDealerName(dto.getDealerId());
			regVO.setInvoiceAmount(dto.getInvoiceAmount());
			if (dto.getVehicleDetails() != null) {
				regVO.setMakersDesc(dto.getVehicleDetails().getMakersDesc());
				regVO.setMakersModel(dto.getVehicleDetails().getMakersModel());
			}
			regVO.setTaxType(dto.getTaxType());
			regVO.setTaxAmount(dto.getTaxAmount());
			regVO.setApplicantName(dto.getApplicantName());
			regVO.setOfficeCode(dto.getOfficeCode());
			regDetailsList.add(regVO);
		});

		return regDetailsList;

	}
}
