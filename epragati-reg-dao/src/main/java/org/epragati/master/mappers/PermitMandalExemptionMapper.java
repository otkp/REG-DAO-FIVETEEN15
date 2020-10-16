package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.permits.dto.PermitMandalExemptionDTO;
import org.epragati.permits.vo.PermitMandalExemptionVO;

public class PermitMandalExemptionMapper extends BaseMapper<PermitMandalExemptionDTO, PermitMandalExemptionVO> {

	@Override
	public PermitMandalExemptionVO convertEntity(PermitMandalExemptionDTO dto) {
		PermitMandalExemptionVO vo = new PermitMandalExemptionVO();
		funPoint(dto.getMandalName(), vo::setMandalName);
		funPoint(dto.getMandalCode(), vo::setMandalCode);
		funPoint(dto.getCovcode(), vo::setCovcode);
		return vo;
	}
	
	@Override
	public PermitMandalExemptionDTO convertVO(PermitMandalExemptionVO vo) {
		PermitMandalExemptionDTO dto = new PermitMandalExemptionDTO();
		funPoint(vo.getMandalName(), dto::setMandalName);
		funPoint(vo.getMandalCode(), dto::setMandalCode);
		funPoint(vo.getCovcode(), dto::setCovcode);
		return dto;
	}
}
