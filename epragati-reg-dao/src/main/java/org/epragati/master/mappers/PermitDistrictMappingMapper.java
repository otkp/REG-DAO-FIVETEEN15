package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.permits.dto.PermitDistrictMappingDTO;
import org.epragati.permits.vo.PermitDistrictMappingVO;
import org.springframework.stereotype.Component;

@Component
public class PermitDistrictMappingMapper extends BaseMapper<PermitDistrictMappingDTO, PermitDistrictMappingVO> {

	@Override
	public PermitDistrictMappingVO convertEntity(PermitDistrictMappingDTO dto) {
		PermitDistrictMappingVO vo = new PermitDistrictMappingVO();
		funPoint(dto.getDistictName(), vo::setDistictName);
		funPoint(dto.getStatus(), vo::setStatus);
		funPoint(dto.getDistrictCode(), vo::setDistrictCode);
		funPoint(dto.getNeighbourDistrict(), vo::setNeighbourDistrict);
		funPoint(dto.getNeighbourDistrictcode(), vo::setNeighbourDistrictcode);
		return vo;
	}

	@Override
	public PermitDistrictMappingDTO convertVO(PermitDistrictMappingVO vo) {
		PermitDistrictMappingDTO dto = new PermitDistrictMappingDTO();
		funPoint(dto.getDistictName(), vo::setDistictName);
		funPoint(dto.getStatus(), vo::setStatus);
		funPoint(dto.getDistrictCode(), vo::setDistrictCode);
		funPoint(dto.getNeighbourDistrict(), vo::setNeighbourDistrict);
		funPoint(dto.getNeighbourDistrictcode(), vo::setNeighbourDistrictcode);
		return dto;
	}

}
