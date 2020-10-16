package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.GatewayTypeDTO;
import org.epragati.master.vo.GatewayTypeVO;
import org.springframework.stereotype.Component;

/**
 * @author sairam.cheruku
 *
 */
@Component
public class GatewayTypeMapper extends BaseMapper<GatewayTypeDTO, GatewayTypeVO> {

	@Override
	public GatewayTypeVO convertEntity(GatewayTypeDTO dto) {
		GatewayTypeVO masterGatewayTypeVo = new GatewayTypeVO();
		funPoint(dto.getGtid(), masterGatewayTypeVo::setGtid);
		funPoint(dto.getDescription(), masterGatewayTypeVo::setDescription);
		funPoint(dto.getStatus(), masterGatewayTypeVo::setStatus);
		funPoint(dto.getCreateddate(), masterGatewayTypeVo::setCreateddate);
		funPoint(dto.getLupdate(), masterGatewayTypeVo::setLupdate);
		return masterGatewayTypeVo;
	}

	@Override
	public GatewayTypeDTO convertVO(GatewayTypeVO vo) {
		GatewayTypeDTO masterGatewayTypeDTO = new GatewayTypeDTO();
		funPoint(vo.getGtid(), masterGatewayTypeDTO::setGtid);
		funPoint(vo.getDescription(), masterGatewayTypeDTO::setDescription);
		funPoint(vo.getStatus(), masterGatewayTypeDTO::setStatus);
		funPoint(vo.getCreateddate(), masterGatewayTypeDTO::setCreateddate);
		funPoint(vo.getLupdate(), masterGatewayTypeDTO::setLupdate);
		return masterGatewayTypeDTO;
	}

}
