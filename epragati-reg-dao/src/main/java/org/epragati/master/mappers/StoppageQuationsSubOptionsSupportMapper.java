package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.StoppageQuationsSubOptionsSupport;
import org.epragati.master.vo.StoppageQuationsSubOptionsSupportVO;
import org.springframework.stereotype.Component;

@Component
public class StoppageQuationsSubOptionsSupportMapper extends BaseMapper<StoppageQuationsSubOptionsSupport, StoppageQuationsSubOptionsSupportVO>{

	@Override
	public StoppageQuationsSubOptionsSupportVO convertEntity(StoppageQuationsSubOptionsSupport dto) {
		StoppageQuationsSubOptionsSupportVO vo = new StoppageQuationsSubOptionsSupportVO();
		funPoint(dto.getLabel(), vo::setLabel);
		funPoint(dto.getType(), vo::setType);
		funPoint(dto.getContent(), vo::setContent);
		funPoint(dto.getValue(), vo::setValue);
		funPoint(dto.getName(), vo::setName);
		return vo;
	}

	@Override
	public StoppageQuationsSubOptionsSupport convertVO(StoppageQuationsSubOptionsSupportVO vo) {
		
		StoppageQuationsSubOptionsSupport dto = new StoppageQuationsSubOptionsSupport();
		funPoint(vo.getLabel(), dto::setLabel);
		funPoint(vo.getType(), dto::setType);
		funPoint(vo.getContent(), dto::setContent);
		funPoint(vo.getValue(), dto::setValue);
		funPoint(vo.getName(), dto::setName);
		return dto;
	}
}
