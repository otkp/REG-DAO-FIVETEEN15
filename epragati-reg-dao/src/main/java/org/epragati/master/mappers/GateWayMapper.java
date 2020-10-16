package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.GateWayDTO;
import org.epragati.master.vo.GateWayVO;
import org.springframework.stereotype.Component;

@Component
public class GateWayMapper extends BaseMapper<GateWayDTO, GateWayVO> {

	@Override
	public GateWayVO convertEntity(GateWayDTO dto) {
		GateWayVO gateWayVo = new GateWayVO();
		funPoint(dto.getId(), gateWayVo::setId);
		funPoint(dto.getGateWayType(), gateWayVo::setGateWayType);
		funPoint(dto.getGatewayDetails(), gateWayVo::setGatewayDetails);
		return gateWayVo;
	}

	@Override
	public GateWayDTO convertVO(GateWayVO vo) {
		GateWayDTO gateWayDTO = new GateWayDTO();
		funPoint(vo.getId(), gateWayDTO::setId);
		funPoint(vo.getGateWayType(), gateWayDTO::setGateWayType);
		funPoint(vo.getGatewayDetails(), gateWayDTO::setGatewayDetails);
		return gateWayDTO;
	}

}
