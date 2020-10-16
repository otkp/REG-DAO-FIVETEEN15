package org.epragati.actions.mapper;

import java.time.LocalDate;

import org.epragati.actions.dto.RCActionsDetailsDTO;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.rcactions.RCActionsDetailsVO;
import org.springframework.stereotype.Component;

@Component
public class SuspensionDetailsMapper  extends BaseMapper<RCActionsDetailsDTO, RCActionsDetailsVO> {

	@Override
	public RCActionsDetailsVO convertEntity(RCActionsDetailsDTO suspensionDetaildtoEntry) {
		
		RCActionsDetailsVO suspensionDetailsVO = new RCActionsDetailsVO();
		
		funPoint(suspensionDetaildtoEntry.getOfficeMemoNumber(), suspensionDetailsVO::setOfficeMemoNumber);
		funPoint(suspensionDetaildtoEntry.getMemoDate(), suspensionDetailsVO::setMemoDate);
		funPoint(suspensionDetaildtoEntry.getFromDate(), suspensionDetailsVO::setFromDate);
		funPoint(suspensionDetaildtoEntry.getToDate(), suspensionDetailsVO::setToDate);
		funPoint(suspensionDetaildtoEntry.getSource(), suspensionDetailsVO::setSource);
		funPoint(suspensionDetaildtoEntry.getReferenceNumber(), suspensionDetailsVO::setReferenceNumber);
		funPoint(suspensionDetaildtoEntry.getReferenceDate(), suspensionDetailsVO::setReferenceDate);
		funPoint(suspensionDetaildtoEntry.getSectionOrRule(), suspensionDetailsVO::setSectionOrRule);
		funPoint(suspensionDetaildtoEntry.isPunishment(), suspensionDetailsVO::setPunishment);
		funPoint(suspensionDetaildtoEntry.getPunishmentComments(), suspensionDetailsVO::setPunishmentComments);
		funPoint(suspensionDetaildtoEntry.isShowCauseIssued(), suspensionDetailsVO::setShowCauseIssued);
		funPoint(suspensionDetaildtoEntry.getShowCauseIssuedComments(),suspensionDetailsVO::setShowCauseIssuedComments);
		funPoint(suspensionDetaildtoEntry.getOrderNumber(),suspensionDetailsVO::setOrderNumber);
		funPoint(suspensionDetaildtoEntry.getOrderDate(), suspensionDetailsVO::setOrderDate);
		funPoint(suspensionDetaildtoEntry.getMviName(), suspensionDetailsVO::setMviName);
		funPoint(suspensionDetaildtoEntry.getRemarks(), suspensionDetailsVO::setRemarks);
		funPoint(suspensionDetaildtoEntry.getRevocationDate(), suspensionDetailsVO::setRevocationDate);
		funPoint(suspensionDetaildtoEntry.getReason(), suspensionDetailsVO::setReason);
		funPoint(suspensionDetaildtoEntry.getActionBy(), suspensionDetailsVO::setActionBy);
		funPoint(suspensionDetaildtoEntry.getActionBy(), suspensionDetailsVO::setActionBy);
		funPoint(suspensionDetaildtoEntry.getMviInspection(), suspensionDetailsVO::setMviInspection);
		funPoint(suspensionDetaildtoEntry.getMviInspectioncomments(), suspensionDetailsVO::setMviInspectioncomments);
		funPoint(suspensionDetaildtoEntry.getReferenceBy(), suspensionDetailsVO::setReferenceBy);
		funPoint(suspensionDetaildtoEntry.getFinalStatus(), suspensionDetailsVO::setFinalStatus);
		funPoint(suspensionDetaildtoEntry.getReasonForAo(), suspensionDetailsVO::setReasonForAo);
		return suspensionDetailsVO;
	}
	
	@Override
	public RCActionsDetailsDTO convertVO(RCActionsDetailsVO suspensionDetailVO) {
		
		RCActionsDetailsDTO suspensionDetailsDto = new RCActionsDetailsDTO();
		
		funPoint(suspensionDetailVO.getOfficeMemoNumber(), suspensionDetailsDto::setOfficeMemoNumber);
		funPoint(suspensionDetailVO.getMemoDate(), suspensionDetailsDto::setMemoDate);
		if(suspensionDetailVO.getFromDate().isBefore(LocalDate.now())||
				suspensionDetailVO.getFromDate().equals(LocalDate.now())){
		funPoint(suspensionDetailVO.getFromDate(), suspensionDetailsDto::setFromDate);
		}
		funPoint(suspensionDetailVO.getToDate(), suspensionDetailsDto::setToDate);
		funPoint(suspensionDetailVO.getSource(), suspensionDetailsDto::setSource);
		funPoint(suspensionDetailVO.getReferenceNumber(), suspensionDetailsDto::setReferenceNumber);
		funPoint(suspensionDetailVO.getReferenceDate(), suspensionDetailsDto::setReferenceDate);
		funPoint(suspensionDetailVO.getSectionOrRule(), suspensionDetailsDto::setSectionOrRule);
		funPoint(suspensionDetailVO.isPunishment(), suspensionDetailsDto::setPunishment);
		funPoint(suspensionDetailVO.getPunishmentComments(), suspensionDetailsDto::setPunishmentComments);
		funPoint(suspensionDetailVO.isShowCauseIssued(), suspensionDetailsDto::setShowCauseIssued);
		funPoint(suspensionDetailVO.getShowCauseIssuedComments(), suspensionDetailsDto::setShowCauseIssuedComments);
		funPoint(suspensionDetailVO.getOrderNumber(),suspensionDetailsDto::setOrderNumber);
		funPoint(suspensionDetailVO.getOrderDate(), suspensionDetailsDto::setOrderDate);
		funPoint(suspensionDetailVO.getMviName(), suspensionDetailsDto::setMviName);
		funPoint(suspensionDetailVO.getRemarks(), suspensionDetailsDto::setRemarks);
		funPoint(suspensionDetailVO.getRevocationDate(), suspensionDetailsDto::setRevocationDate);
		funPoint(suspensionDetailVO.getReason(), suspensionDetailsDto::setReason);
		funPoint(suspensionDetailVO.getMviInspection(), suspensionDetailsDto::setMviInspection);
		funPoint(suspensionDetailVO.getMviInspectioncomments(), suspensionDetailsDto::setMviInspectioncomments);
		funPoint(suspensionDetailVO.getReferenceBy(), suspensionDetailsDto::setReferenceBy);
		funPoint(suspensionDetailVO.getFinalStatus(), suspensionDetailsDto::setFinalStatus);
		funPoint(suspensionDetailVO.getReasonForAo(), suspensionDetailsDto::setReasonForAo);
		return suspensionDetailsDto;
	}
	}
	
