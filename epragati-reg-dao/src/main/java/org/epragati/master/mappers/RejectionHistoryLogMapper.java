package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.RejectionHistoryLogDTO;
import org.epragati.master.vo.RejectionHistoryLogVO;
import org.springframework.stereotype.Component;

@Component
public class RejectionHistoryLogMapper extends BaseMapper<RejectionHistoryLogDTO, RejectionHistoryLogVO>{

	@Override
	public RejectionHistoryLogVO convertEntity(RejectionHistoryLogDTO dto) {
		RejectionHistoryLogVO vo = new RejectionHistoryLogVO();

		funPoint(dto.getApplicationNo(), vo::setApplicationNo);
		funPoint(dto.getModule(), vo::setModule);
		funPoint(dto.getActionTime(), vo::setActionTime);
		funPoint(dto.getIsSecondVehicleRejected(), vo::setIsSecondVehicleRejected);
		funPoint(dto.getSecondVehicleNotRejectedReason(), vo::setSecondVehicleNotRejectedReason);
		funPoint(dto.getSecondVehicleId(), vo::setSecondVehicleId);
		funPoint(dto.getIsInvalidVehicleRejection(), vo::setIsInvalidVehicleRejection);
		funPoint(dto.getInvalidVehicleRejectionReason(), vo::setInvalidVehicleRejectionReason);
		funPoint(dto.getIsDocumentRejected(), vo::setIsDocumentRejected);
		funPoint(dto.getDocumentRejectedReason(), vo::setDocumentRejectedReason);
		funPoint(dto.getIterationNo(), vo::setIterationNo);
		funPoint(dto.getClassOfVehicle(), vo::setClassOfVehicle);
		funPoint(dto.getActionBy(), vo::setActionBy);
		funPoint(dto.getRole(), vo::setRole);
		return vo;
	}

	@Override
	public RejectionHistoryLogDTO convertVO(RejectionHistoryLogVO vo) {
		RejectionHistoryLogDTO dto = new RejectionHistoryLogDTO();
		funPoint(vo.getApplicationNo(), dto::setApplicationNo);
		funPoint(vo.getModule(), dto::setModule);
		funPoint(vo.getActionTime(), dto::setActionTime);
		funPoint(vo.getIsSecondVehicleRejected(), dto::setIsSecondVehicleRejected);
		funPoint(vo.getSecondVehicleNotRejectedReason(), dto::setSecondVehicleNotRejectedReason);
		funPoint(vo.getSecondVehicleId(), dto::setSecondVehicleId);
		funPoint(vo.getIsInvalidVehicleRejection(), dto::setIsInvalidVehicleRejection);
		funPoint(vo.getInvalidVehicleRejectionReason(), dto::setInvalidVehicleRejectionReason);
		funPoint(vo.getIsDocumentRejected(), dto::setIsDocumentRejected);
		funPoint(vo.getDocumentRejectedReason(), dto::setDocumentRejectedReason);
		funPoint(vo.getIterationNo(), dto::setIterationNo);
		funPoint(vo.getClassOfVehicle(), dto::setClassOfVehicle);
		funPoint(vo.getActionBy(), dto::setActionBy);
		funPoint(vo.getRole(), dto::setRole);
		return dto;

	}
}
