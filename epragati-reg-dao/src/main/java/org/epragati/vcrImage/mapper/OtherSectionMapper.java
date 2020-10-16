package org.epragati.vcrImage.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.vcr.vo.OtherSectionVO;
import org.epragati.vcrImage.dto.OtherSectionDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class OtherSectionMapper extends BaseMapper<OtherSectionDTO, OtherSectionVO>{

	private static final Logger logger = LoggerFactory.getLogger(OtherSectionMapper.class);
	
	@Override
	public OtherSectionVO convertEntity(OtherSectionDTO dto) {
		logger.warn("converting OtherSectionDTO to VO");
		OtherSectionVO vo = new OtherSectionVO();
		funPoint(dto.getMviRemark(), vo::setMviRemark);
		BeanUtils.copyProperties(dto, vo);
		return vo;
	}
	
	@Override
	public OtherSectionDTO convertVO(OtherSectionVO vo) {
		logger.warn("converting OtherSectionVO to DTO");
		OtherSectionDTO dto = new OtherSectionDTO();
		funPoint(vo.getMviRemark(), dto::setMviRemark);
		BeanUtils.copyProperties(vo, dto);
		return dto;
	}

}
