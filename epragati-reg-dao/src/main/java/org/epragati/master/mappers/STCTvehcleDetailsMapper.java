package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.permits.dto.STCTvehcleDetailsDTO;
import org.epragati.permits.vo.STCTvehcleDetailsVO;
import org.springframework.stereotype.Component;

@Component
public class STCTvehcleDetailsMapper extends BaseMapper<STCTvehcleDetailsDTO, STCTvehcleDetailsVO>{

	@Override
	public STCTvehcleDetailsVO convertEntity(STCTvehcleDetailsDTO dto) {
		STCTvehcleDetailsVO vo = new STCTvehcleDetailsVO();
		funPoint(dto.getCoordinatorName(), vo::setCoordinatorName);
		funPoint(dto.getCoordinatorAddress(), vo::setCoordinatorAddress);
		return vo;
	}
	
	@Override
	public STCTvehcleDetailsDTO convertVO(STCTvehcleDetailsVO vo) {
		STCTvehcleDetailsDTO dto = new STCTvehcleDetailsDTO();
		funPoint(vo.getCoordinatorName(), dto::setCoordinatorName);
		funPoint(vo.getCoordinatorAddress(), dto::setCoordinatorAddress);
		return dto;
	}

}
