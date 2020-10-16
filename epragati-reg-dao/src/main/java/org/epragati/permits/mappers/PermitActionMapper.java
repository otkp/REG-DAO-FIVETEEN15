package org.epragati.permits.mappers;

import java.time.LocalDate;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.permits.dto.PermitActionsDTO;
import org.epragati.permits.vo.PermitActionVO;
import org.springframework.stereotype.Component;


@Component
public class PermitActionMapper extends BaseMapper<PermitActionsDTO, PermitActionVO>{

	@Override
	public PermitActionVO convertEntity(PermitActionsDTO permitActionDto) {
		
		PermitActionVO permitActionVO =new PermitActionVO();
		funPoint(permitActionDto.getOfficeMemoNumber(), permitActionVO::setOfficeMemoNumber);
		funPoint(permitActionDto.getMemoDate(), permitActionVO::setMemoDate);
		funPoint(permitActionDto.getFromDate(), permitActionVO::setFromDate);
		funPoint(permitActionDto.getToDate(), permitActionVO::setToDate);
		funPoint(permitActionDto.getSource(), permitActionVO::setSource);
		funPoint(permitActionDto.getReferenceNumber(), permitActionVO::setReferenceNumber);
		funPoint(permitActionDto.getReferenceDate(), permitActionVO::setReferenceDate);
		funPoint(permitActionDto.getSectionOrRule(), permitActionVO::setSectionOrRule);
		funPoint(permitActionDto.isPunishment(), permitActionVO::setPunishment);
		funPoint(permitActionDto.getPunishmentComments(), permitActionVO::setPunishmentComments);
		funPoint(permitActionDto.isShowCauseIssued(), permitActionVO::setShowCauseIssued);
		funPoint(permitActionDto.getShowCauseIssuedComments(),permitActionVO::setShowCauseIssuedComments);
		funPoint(permitActionDto.getOrderNumber(),permitActionVO::setOrderNumber);
		funPoint(permitActionDto.getOrderDate(), permitActionVO::setOrderDate);
		funPoint(permitActionDto.getMviName(), permitActionVO::setMviName);
		funPoint(permitActionDto.getRemarks(), permitActionVO::setRemarks);
		funPoint(permitActionDto.getRevocationDate(), permitActionVO::setRevocationDate);
		funPoint(permitActionDto.getReason(), permitActionVO::setReason);
		funPoint(permitActionDto.getActionBy(), permitActionVO::setActionBy);
		funPoint(permitActionDto.getActionBy(), permitActionVO::setActionBy);
		funPoint(permitActionDto.getMviInspection(), permitActionVO::setMviInspection);
		funPoint(permitActionDto.getMviInspectioncomments(), permitActionVO::setMviInspectioncomments);
		funPoint(permitActionDto.getReferenceBy(), permitActionVO::setReferenceBy);
		funPoint(permitActionDto.getFinalStatus(), permitActionVO::setFinalStatus);
		funPoint(permitActionDto.getReasonForAo(), permitActionVO::setReasonForAo);
		
		return permitActionVO;
		
	}
	
@Override
public PermitActionsDTO convertVO(PermitActionVO permitActionsVO) {
		
		PermitActionsDTO permitActionsDto = new PermitActionsDTO();
		
		funPoint(permitActionsVO.getOfficeMemoNumber(), permitActionsDto::setOfficeMemoNumber);
		funPoint(permitActionsVO.getMemoDate(), permitActionsDto::setMemoDate);
		if(permitActionsVO.getFromDate().isBefore(LocalDate.now())||
				permitActionsVO.getFromDate().equals(LocalDate.now())){
		funPoint(permitActionsVO.getFromDate(), permitActionsDto::setFromDate);
		}
		funPoint(permitActionsVO.getToDate(), permitActionsDto::setToDate);
		funPoint(permitActionsVO.getSource(), permitActionsDto::setSource);
		funPoint(permitActionsVO.getReferenceNumber(), permitActionsDto::setReferenceNumber);
		funPoint(permitActionsVO.getReferenceDate(), permitActionsDto::setReferenceDate);
		funPoint(permitActionsVO.getSectionOrRule(), permitActionsDto::setSectionOrRule);
		funPoint(permitActionsVO.isPunishment(), permitActionsDto::setPunishment);
		funPoint(permitActionsVO.getPunishmentComments(), permitActionsDto::setPunishmentComments);
		funPoint(permitActionsVO.isShowCauseIssued(), permitActionsDto::setShowCauseIssued);
		funPoint(permitActionsVO.getShowCauseIssuedComments(), permitActionsDto::setShowCauseIssuedComments);
		funPoint(permitActionsVO.getOrderNumber(),permitActionsDto::setOrderNumber);
		funPoint(permitActionsVO.getOrderDate(), permitActionsDto::setOrderDate);
		funPoint(permitActionsVO.getMviName(), permitActionsDto::setMviName);
		funPoint(permitActionsVO.getRemarks(), permitActionsDto::setRemarks);
		funPoint(permitActionsVO.getRevocationDate(), permitActionsDto::setRevocationDate);
		funPoint(permitActionsVO.getReason(), permitActionsDto::setReason);
		funPoint(permitActionsVO.getMviInspection(), permitActionsDto::setMviInspection);
		funPoint(permitActionsVO.getMviInspectioncomments(), permitActionsDto::setMviInspectioncomments);
		funPoint(permitActionsVO.getReferenceBy(), permitActionsDto::setReferenceBy);
		funPoint(permitActionsVO.getFinalStatus(), permitActionsDto::setFinalStatus);
		funPoint(permitActionsVO.getReasonForAo(), permitActionsDto::setReasonForAo);
		return permitActionsDto;
	}


}
