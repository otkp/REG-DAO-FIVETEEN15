package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.permits.dto.PermitGoodsDetailsDTO;
import org.epragati.permits.vo.PermitGoodsDetailsVO;
import org.springframework.stereotype.Component;

@Component
public class PermitGoodsDetailsMapper extends BaseMapper<PermitGoodsDetailsDTO, PermitGoodsDetailsVO> {

	@Override
	public PermitGoodsDetailsVO convertEntity(PermitGoodsDetailsDTO dto) {
		PermitGoodsDetailsVO vo = new PermitGoodsDetailsVO();
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getPermitAllowedgoods(), vo::setPermitAllowedgoods);
		funPoint(dto.getPermitType(), vo::setPermitType);
		funPoint(dto.getDescription(), vo::setDescription);
		funPoint(dto.getBodyTypeDesc(), vo::setBodyTypeDesc);
		funPoint(dto.getStatus(), vo::setStatus);
		return vo;
	}

	@Override
	public PermitGoodsDetailsDTO convertVO(PermitGoodsDetailsVO vo) {
		PermitGoodsDetailsDTO dto = new PermitGoodsDetailsDTO();
		funPoint(vo.getId(), dto::setId);
		funPoint(vo.getPermitAllowedgoods(), dto::setPermitAllowedgoods);
		funPoint(vo.getPermitType(), dto::setPermitType);
		funPoint(vo.getDescription(), dto::setDescription);
		funPoint(vo.getBodyTypeDesc(), dto::setBodyTypeDesc);
		funPoint(vo.getStatus(), dto::setStatus);
		return dto;
	}

}
