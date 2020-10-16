package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.RejectionHistoryDTO;
import org.epragati.master.vo.RejectionHistoryVO;
import org.springframework.stereotype.Component;

@Component
public class RejectionHistoryMapper extends BaseMapper<RejectionHistoryDTO, RejectionHistoryVO> {

	@Override
	public RejectionHistoryVO convertEntity(RejectionHistoryDTO dto) {
		RejectionHistoryVO vo = new RejectionHistoryVO();

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
		funPoint(dto.getFatherName(), vo::setFatherName);
		funPoint(dto.getFullName(), vo::setFullName);
		funPoint(dto.getDateOfBirth(), vo::setDateOfBirth);
		funPoint(dto.getAddress(), vo::setAddress);

		return vo;
	}

	@Override
	public RejectionHistoryDTO convertVO(RejectionHistoryVO vo) {
		RejectionHistoryDTO dto = new RejectionHistoryDTO();
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
		funPoint(vo.getFullName(), dto::setFullName);
		funPoint(vo.getFatherName(), dto::setFatherName);
		funPoint(vo.getDateOfBirth(), dto::setDateOfBirth);
		funPoint(vo.getAddress(), dto::setAddress);

		return dto;

	}
}
