package org.epragati.master.mappers;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.NonPaymentDetailsDTO;
import org.epragati.master.dto.NonPaymentDetailsHistoryDTO;
import org.epragati.payment.report.vo.NonPaymentDetailsVO;
import org.epragati.permits.dto.FcReportsDemoDTO;
import org.epragati.permits.dto.FitnessReportsDemoVO;
import org.springframework.stereotype.Component;

@Component
public class NonPaymentDetailsMapper extends BaseMapper<NonPaymentDetailsDTO, NonPaymentDetailsVO> {

	@Override
	public NonPaymentDetailsVO convertEntity(NonPaymentDetailsDTO nonPaymentDetailsdto) {

		NonPaymentDetailsVO nonPaymentDetailsVO = new NonPaymentDetailsVO();
		funPoint(nonPaymentDetailsdto.getPrNo(), nonPaymentDetailsVO::setPrNo);
		funPoint(nonPaymentDetailsdto.getCov(), nonPaymentDetailsVO::setCov);
		funPoint(nonPaymentDetailsdto.getOfficeCode(), nonPaymentDetailsVO::setOfficeCode);
		funPoint(nonPaymentDetailsdto.getOwnerName(), nonPaymentDetailsVO::setOwnerName);
		funPoint(nonPaymentDetailsdto.getOwnerAddress(), nonPaymentDetailsVO::setOwnerAddress);
		funPoint(nonPaymentDetailsdto.getTaxValidity(), nonPaymentDetailsVO::setTaxValidity);
		funPoint(nonPaymentDetailsdto.getFinancerName(), nonPaymentDetailsVO::setFinancerName);
		funPoint(nonPaymentDetailsdto.getFinancerAddress(), nonPaymentDetailsVO::setFinancerAddress);
		funPoint(nonPaymentDetailsdto.getPermitValidity(), nonPaymentDetailsVO::setPermitValidity);
		funPoint(nonPaymentDetailsdto.getFcValidity(), nonPaymentDetailsVO::setFcValidity);
		funPoint(nonPaymentDetailsdto.getScNo(), nonPaymentDetailsVO::setScNo);
		funPoint(nonPaymentDetailsdto.getSectionCode(), nonPaymentDetailsVO::setSectionCode);
		funPoint(nonPaymentDetailsdto.getQuarterEndDate(), nonPaymentDetailsVO::setQuarterEndDate);
		funPoint(nonPaymentDetailsdto.getPendingQuarters(), nonPaymentDetailsVO::setPendingQuarters);
		funPoint(nonPaymentDetailsdto.getFatherName(), nonPaymentDetailsVO::setFatherName);
		funPoint(nonPaymentDetailsdto.getMobileNo(), nonPaymentDetailsVO::setMobileNo);
		funPoint(nonPaymentDetailsdto.getGvw(), nonPaymentDetailsVO::setGvw);
		funPoint(nonPaymentDetailsdto.getMandalName(), nonPaymentDetailsVO::setMandalName);
		return nonPaymentDetailsVO;
	}

	public List<NonPaymentDetailsVO> convertEntity(List<NonPaymentDetailsDTO> nonPaymentDtoList) {
		return nonPaymentDtoList.stream().map(e -> convertlimtedfileds(e)).collect(Collectors.toList());
	}

	public NonPaymentDetailsVO convertlimtedfileds(NonPaymentDetailsDTO nonPaymentDetailsdto) {

		NonPaymentDetailsVO nonPaymentDetailsVO = new NonPaymentDetailsVO();
		funPoint(nonPaymentDetailsdto.getPrNo(), nonPaymentDetailsVO::setPrNo);
		funPoint(nonPaymentDetailsdto.getScNo(), nonPaymentDetailsVO::setScNo);
		funPoint(nonPaymentDetailsdto.getSectionCode(), nonPaymentDetailsVO::setSectionCode);
		funPoint(nonPaymentDetailsdto.getCov(), nonPaymentDetailsVO::setCov);
		funPoint(nonPaymentDetailsdto.getTaxValidity(), nonPaymentDetailsVO::setTaxValidity);
		funPoint(nonPaymentDetailsdto.getOwnerName(), nonPaymentDetailsVO::setOwnerName);
		funPoint(nonPaymentDetailsdto.getOwnerAddress(), nonPaymentDetailsVO::setOwnerAddress);
		funPoint(nonPaymentDetailsdto.getFinancerName(), nonPaymentDetailsVO::setFinancerName);
		funPoint(nonPaymentDetailsdto.getFinancerAddress(), nonPaymentDetailsVO::setFinancerAddress);

		return nonPaymentDetailsVO;
	}

	public NonPaymentDetailsVO convertFieldsToPrint(NonPaymentDetailsDTO nonPaymentDetailsdto) {
		NonPaymentDetailsVO nonPaymentDetailsVO = new NonPaymentDetailsVO();
		funPoint(nonPaymentDetailsdto.getPrNo(), nonPaymentDetailsVO::setPrNo);
		funPoint(nonPaymentDetailsdto.getScNo(), nonPaymentDetailsVO::setScNo);
		funPoint(nonPaymentDetailsdto.getTaxValidity(), nonPaymentDetailsVO::setTaxValidity);
		return nonPaymentDetailsVO;
	}

	public NonPaymentDetailsVO convertFieldsToDisplay(NonPaymentDetailsDTO nonPaymentDetailsdto) {
		NonPaymentDetailsVO nonPaymentDetailsVO = new NonPaymentDetailsVO();
		funPoint(nonPaymentDetailsdto.getPrNo(), nonPaymentDetailsVO::setPrNo);
		funPoint(nonPaymentDetailsdto.getScNo(), nonPaymentDetailsVO::setScNo);
		funPoint(nonPaymentDetailsdto.getScNoIssuedOn(), nonPaymentDetailsVO::setScNoIssuedOn);
		funPoint(nonPaymentDetailsdto.getMviName(), nonPaymentDetailsVO::setMviName);
		return nonPaymentDetailsVO;
	}

	public List<NonPaymentDetailsVO> convertEntityLimitedList(List<NonPaymentDetailsDTO> nonPaymentDtoList) {
		return nonPaymentDtoList.stream().map(e -> convertFieldsToDisplay(e)).collect(Collectors.toList());
	}

	public FitnessReportsDemoVO convertToFcVO(FcReportsDemoDTO fcReportsDemoDTO,
			FitnessReportsDemoVO fitnessReportsDemoVO) {
		funPoint(fcReportsDemoDTO.getPrNo(), fitnessReportsDemoVO::setPrNo);
		funPoint(fcReportsDemoDTO.getFctype(), fitnessReportsDemoVO::setFctype);
		funPoint(fcReportsDemoDTO.getFcNumber(), fitnessReportsDemoVO::setFcNumber);
		funPoint(fcReportsDemoDTO.getFcIssuedDate(), fitnessReportsDemoVO::setFcIssuedDate);
		funPoint(fcReportsDemoDTO.getInspectedDate(), fitnessReportsDemoVO::setInspectedDate);
		funPoint(fcReportsDemoDTO.getInspectedMviName(), fitnessReportsDemoVO::setInspectedMviName);
		funPoint(fcReportsDemoDTO.getFcValidUpto(), fitnessReportsDemoVO::setFcValidUpto);
//		funPoint(fcReportsDemoDTO.getClassOfVehicle(), fitnessReportsDemoVO::setClassOfVehicle);
		funPoint(fcReportsDemoDTO.getUserId(), fitnessReportsDemoVO::setUserId);
		funPoint(fcReportsDemoDTO.getOfficeCode(), fitnessReportsDemoVO::setOfficeCode);
		funPoint(fcReportsDemoDTO.getOfficeName(), fitnessReportsDemoVO::setOfficeName);
		funPoint(fcReportsDemoDTO.getEngineNo(), fitnessReportsDemoVO::setEngineNo);
		funPoint(fcReportsDemoDTO.getChassisNo(), fitnessReportsDemoVO::setChassisNo);

		return fitnessReportsDemoVO;

	}

	public NonPaymentDetailsHistoryDTO convertHistory(NonPaymentDetailsDTO nonPayment) {
		NonPaymentDetailsHistoryDTO nonPaymentHistory = new NonPaymentDetailsHistoryDTO();
		nonPaymentHistory.setNonPayment(nonPayment);
		nonPaymentHistory.setCreatedDate(LocalDateTime.now());
		nonPaymentHistory.setlUpdate(LocalDateTime.now());
		return nonPaymentHistory;
	}
	
	public List<NonPaymentDetailsVO> convertEntityList(List<NonPaymentDetailsDTO> nonPaymentDtoList){
		  return nonPaymentDtoList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
		}
}
