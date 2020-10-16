package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.permits.dto.PermitClassDTO;
import org.epragati.permits.vo.PermitClassVO;
import org.springframework.stereotype.Component;

@Component
public class PermitClassMapper extends BaseMapper<PermitClassDTO, PermitClassVO> {

	@Override
	public PermitClassVO convertEntity(PermitClassDTO dto) {
		PermitClassVO vo = new PermitClassVO();
		funPoint(dto.getPermitClassId(), vo::setPermitClassId);
		funPoint(dto.getDescription(), vo::setDescription);
		funPoint(dto.getStatus(), vo::setStatus);
		funPoint(dto.getCode(), vo::setCode);
		return vo;
	}

	@Override
	public PermitClassDTO convertVO(PermitClassVO vo) {
		PermitClassDTO dto = new PermitClassDTO();
		funPoint(vo.getPermitClassId(), dto::setPermitClassId);
		funPoint(vo.getDescription(), dto::setDescription);
		funPoint(vo.getStatus(), dto::setStatus);
		funPoint(vo.getCode(), dto::setCode);
		return dto;
	}

}
