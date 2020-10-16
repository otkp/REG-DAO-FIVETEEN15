package org.epragati.regservice.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dao.OfficeDAO;
import org.epragati.master.dto.OfficeDTO;
import org.epragati.master.dto.StagingRegistrationDetailsDTO;
import org.epragati.regservice.dto.RegServiceDTO;
import org.epragati.regservice.dto.RegServiceReportDTO;
import org.epragati.rta.reports.vo.RegServiceReportVO;
import org.epragati.util.payment.ServiceEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class RegServiceReportMapper extends BaseMapper<RegServiceReportDTO,RegServiceReportVO> {
	
	@Autowired
	private OfficeDAO officeDAO;
	
	@Override
	public RegServiceReportVO convertEntity(RegServiceReportDTO dto) {
		RegServiceReportVO regSerDTO = new RegServiceReportVO();
		funPoint(dto.getClassOfVehicle(), regSerDTO::setClassOfVehicle);
		if(StringUtils.isNoneBlank(dto.getCovDesc())) {
			funPoint(dto.getCovDesc(), regSerDTO::setClassOfVehicle);
		}
		
		funPoint(dto.getAadhaarNumber(), regSerDTO::setAadhaarNumber);
		funPoint(dto.getApplicantFatherName(), regSerDTO::setApplicantFatherName);
		funPoint(dto.getApplicationCurrentStatus(), regSerDTO::setApplicationCurrentStatus);
		funPoint(dto.getApplicationNumber(), regSerDTO::setApplicationNumber);
		funPoint(dto.getApplicationIteration(), regSerDTO::setApplicationIteration);
		funPoint(dto.getCitizenServicesNames(), regSerDTO::setCitizenServicesNames);
		funPoint(dto.getApplicantName(), regSerDTO::setApplicantName);
		funPoint(dto.getCreatedDate(), regSerDTO::setCreatedDate);
		funPoint(dto.getDistrictId(),regSerDTO::setDistrictId);
		funPoint(dto.getLastUpdatedDate(), regSerDTO::setLastUpdatedDate);
		funPoint(dto.getOfficeCode(), regSerDTO::setOfficeCode);
		funPoint(dto.getOfficeName(), regSerDTO::setOfficeName);
		funPoint(dto.getOwnerType(), regSerDTO::setOwnerType);
		funPoint(dto.getVehicleType(), regSerDTO::setVehicleType);
		if(dto.getVehicleType().equals("T")) {
			/*
			 * funpoint(dto.getPermitNumber(),regSerDTO::setPermitNumber);
			 * funpoint(dto.getFitnessNumber(),regSerDTO::setFitnessNumber);
			 */
			
		}
		funPoint(dto.getChassisNumber(), regSerDTO::setChassisNumber);
		funPoint(dto.getEngineNumber(), regSerDTO::setEngineNumber);
		funPoint(dto.getPrNumber(), regSerDTO::setPrNumber);
		funPoint(dto.getTrNumber(), regSerDTO::setTrNumber);
		funPoint("127.0.0.1", regSerDTO::setIpAddress);
		funPoint("WEB", regSerDTO::setAppSource);

	   /* private String vcrNumber;*/

		
		return regSerDTO;
	}
	

	public RegServiceReportDTO converDto(RegServiceDTO dto) {
		RegServiceReportDTO regSerDTO = new RegServiceReportDTO();
		funPoint(dto.getAadhaarNo(), regSerDTO::setAadhaarNumber);
		if(dto.getRegistrationDetails()!=null) {
			funPoint(dto.getRegistrationDetails().getClassOfVehicle(), regSerDTO::setClassOfVehicle);
			funPoint(dto.getRegistrationDetails().getApplicantDetails().getFatherName(), regSerDTO::setApplicantFatherName);
			funPoint(dto.getRegistrationDetails().getApplicantDetails().getFirstName(), regSerDTO::setApplicantName);
			funPoint(dto.getRegistrationDetails().getVehicleType(), regSerDTO::setVehicleType);
			funPoint(dto.getRegistrationDetails().getVahanDetails().getChassisNumber(), regSerDTO::setChassisNumber);
			funPoint(dto.getRegistrationDetails().getVahanDetails().getEngineNumber(), regSerDTO::setEngineNumber);
			funPoint(dto.getRegistrationDetails().getPrNo(), regSerDTO::setPrNumber);
			funPoint(dto.getRegistrationDetails().getTrNo(), regSerDTO::setTrNumber);
			funPoint(dto.getRegistrationDetails().getOwnerType().toString(), regSerDTO::setOwnerType);
			funPoint(dto.getRegistrationDetails().getClassOfVehicleDesc(), regSerDTO::setCovDesc);

		}
		funPoint(dto.getApplicationStatus().toString(), regSerDTO::setApplicationCurrentStatus);
		funPoint(dto.getApplicationNo(), regSerDTO::setApplicationNumber);
		funPoint(dto.getIterationCount(), regSerDTO::setApplicationIteration);
		funPoint(dto.getServiceType(), regSerDTO::setCitizenServicesNames);
		funPoint(dto.getCreatedDate(), regSerDTO::setCreatedDate);
		funPoint(dto.getlUpdate(), regSerDTO::setLastUpdatedDate);
		funPoint("", regSerDTO::setIpAddress);
		funPoint("WEB", regSerDTO::setAppSource);
		funPoint("", regSerDTO::setVcrNumber);
		
		if(dto.getOfficeDetails()!=null) {
			
			funPoint(dto.getOfficeDetails().getOfficeCode(), regSerDTO::setOfficeCode);
			funPoint(dto.getOfficeDetails().getOfficeName(), regSerDTO::setOfficeName);
			if(dto.getOfficeDetails().getDistrict()!=null) {
				funPoint(dto.getOfficeDetails().getDistrict(),regSerDTO::setDistrictId);
			}else {
				Optional<OfficeDTO> officeDTO = officeDAO.findByOfficeCode(dto.getOfficeDetails().getOfficeCode());
				if(officeDTO.isPresent()) {
					funPoint(officeDTO.get().getDistrict(),regSerDTO::setDistrictId);
				}
			}			
		}	
		funPoint("",regSerDTO::setPermitNumber);
		funPoint("",regSerDTO::setFitnessNumber);
		if(dto.getRegistrationDetails().getVehicleType().equals("T")) {
			if(dto.getPdtl()!=null && dto.getPdtl().getPermitNo()!=null) {
				funPoint(dto.getPdtl().getPermitNo(),regSerDTO::setPermitNumber);
			}
			if(dto.getFcDetails()!=null && dto.getFcDetails().getFcNumber()!=null) {
				funPoint(dto.getFcDetails().getFcNumber(),regSerDTO::setFitnessNumber);
			}
		}
		if(dto.getReInspectionDate()!=null) {
			regSerDTO.setReInspectionDate(dto.getReInspectionDate());
		}
		if(StringUtils.isNoneBlank(dto.getReasonForRejection())) {
			regSerDTO.setReasonForRejection(dto.getReasonForRejection());
		}
		return regSerDTO;
	}
	
	
	public RegServiceReportDTO convertRegToEodReport(StagingRegistrationDetailsDTO stagingDTO) {
		RegServiceReportDTO regSerDTO = new RegServiceReportDTO();
		
		    funPoint(getValue(stagingDTO.getApplicantDetails().getAadharNo()), regSerDTO::setAadhaarNumber);
			funPoint(getValue(stagingDTO.getClassOfVehicle()), regSerDTO::setClassOfVehicle);
			funPoint(getValue(stagingDTO.getApplicantDetails().getFatherName()), regSerDTO::setApplicantFatherName);
			funPoint(getValue(stagingDTO.getApplicantDetails().getFirstName()), regSerDTO::setApplicantName);
			funPoint(getValue(stagingDTO.getVehicleType()), regSerDTO::setVehicleType);
			funPoint(getValue(stagingDTO.getVahanDetails().getChassisNumber()), regSerDTO::setChassisNumber);
			funPoint(getValue(stagingDTO.getVahanDetails().getEngineNumber()), regSerDTO::setEngineNumber);
			funPoint(getValue(stagingDTO.getPrNo()), regSerDTO::setPrNumber);
			funPoint(getValue(stagingDTO.getTrNo()), regSerDTO::setTrNumber);
			funPoint(stagingDTO.getOwnerType().toString(), regSerDTO::setOwnerType);
			funPoint(getValue(stagingDTO.getClassOfVehicleDesc()), regSerDTO::setCovDesc);
			
			funPoint("", regSerDTO::setIpAddress);
			funPoint("WEB", regSerDTO::setAppSource);
			
			if(stagingDTO.getOfficeDetails()!=null) {
				
				funPoint(getValue(stagingDTO.getOfficeDetails().getOfficeCode()), regSerDTO::setOfficeCode);
				funPoint(getValue(stagingDTO.getOfficeDetails().getOfficeName()), regSerDTO::setOfficeName);
				if(stagingDTO.getOfficeDetails().getDistrict()!=null) {
					funPoint(stagingDTO.getOfficeDetails().getDistrict(),regSerDTO::setDistrictId);
				}else {
					Optional<OfficeDTO> officeDTO = officeDAO.findByOfficeCode(stagingDTO.getOfficeDetails().getOfficeCode());
					if(officeDTO.isPresent()) {
						funPoint(officeDTO.get().getDistrict(),regSerDTO::setDistrictId);
					}
				}			
			}
			
			funPoint(stagingDTO.getApplicationStatus().toString(), regSerDTO::setApplicationCurrentStatus);
			funPoint(stagingDTO.getApplicationNo(), regSerDTO::setApplicationNumber);
			funPoint(stagingDTO.getIteration(), regSerDTO::setApplicationIteration);
			if(!CollectionUtils.isEmpty(stagingDTO.getServiceIds())) {
				List<ServiceEnum> serviceNames = new ArrayList<>();
				for(Integer service : stagingDTO.getServiceIds()) {
					serviceNames.add(ServiceEnum.getServiceEnumById(service));
				}
				funPoint(serviceNames, regSerDTO::setCitizenServicesNames);
			}
			
			funPoint(stagingDTO.getCreatedDate(), regSerDTO::setCreatedDate);
			funPoint(stagingDTO.getlUpdate(), regSerDTO::setLastUpdatedDate);
		return regSerDTO;	
		
	}
	
	private String getValue(String value) {
		if (StringUtils.isNotBlank(value)) {
			return value;
		}
		return StringUtils.EMPTY;
	}
}
