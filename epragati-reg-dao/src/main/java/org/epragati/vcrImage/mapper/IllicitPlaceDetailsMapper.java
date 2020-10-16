package org.epragati.vcrImage.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.vcr.vo.IllicitPlaceDetailsVO;
import org.epragati.vcrImage.dto.IllicitPlaceDetailsDTO;
import org.springframework.stereotype.Component;

@Component
public class IllicitPlaceDetailsMapper extends BaseMapper<IllicitPlaceDetailsDTO, IllicitPlaceDetailsVO>{

	@Override
	public IllicitPlaceDetailsVO convertEntity(IllicitPlaceDetailsDTO dto) {
		IllicitPlaceDetailsVO vo = new IllicitPlaceDetailsVO();
		funPoint(dto.getFrom(), vo::setFrom);
		funPoint(dto.getTo(), vo::setTo);
		funPoint(dto.getIndividualFare(), vo::setIndividualFare);
		funPoint(dto.getPointToPoint(), vo::setPointToPoint);
		funPoint(dto.getBetweenStages(), vo::setBetweenStages);
		return vo;
	}
	
	@Override
	public IllicitPlaceDetailsDTO convertVO(IllicitPlaceDetailsVO dto) {
		IllicitPlaceDetailsDTO vo = new IllicitPlaceDetailsDTO();
		funPoint(dto.getFrom(), vo::setFrom);
		funPoint(dto.getTo(), vo::setTo);
		funPoint(dto.getIndividualFare(), vo::setIndividualFare);
		funPoint(dto.getPointToPoint(), vo::setPointToPoint);
		funPoint(dto.getBetweenStages(), vo::setBetweenStages);
		return vo;
	}

}
