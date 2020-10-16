package org.epragati.master.mappers;


import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.StoppageQuationsSubOptions;
import org.epragati.master.vo.StoppageQuationsSubOptionsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StoppageQuationsSubOptionsMapper extends BaseMapper<StoppageQuationsSubOptions, StoppageQuationsSubOptionsVO>{

	@Autowired
	private StoppageQuationsSubOptionsSupportMapper stoppageQuationsSubOptionsSupportMapper;
	@Override
	public StoppageQuationsSubOptionsVO convertEntity(StoppageQuationsSubOptions dto) {
		StoppageQuationsSubOptionsVO vo = new StoppageQuationsSubOptionsVO();
		funPoint(dto.getLabel(), vo::setLabel);
		funPoint(dto.getName(), vo::setName);
		funPoint(dto.getValue(), vo::setValue);
		funPoint(dto.getType(), vo::setType);
		funPoint(dto.getContent(), vo::setContent);
		if(dto.getSupports() != null) {
			vo.setSupports(stoppageQuationsSubOptionsSupportMapper.convertEntity(dto.getSupports()));
		}
		funPoint(dto.isBooleanValue(), vo::setBooleanValue);
		funPoint(dto.isCommentsRequired(), vo::setCommentsRequired);
		funPoint(dto.getComments(), vo::setComments);
		funPoint(dto.getRadioButton(), vo::setRadioButton);
		return vo;
	}

	@Override
	public StoppageQuationsSubOptions convertVO(StoppageQuationsSubOptionsVO vo) {
		
		StoppageQuationsSubOptions dto = new StoppageQuationsSubOptions();
		
		funPoint(vo.getLabel(), dto::setLabel);
		funPoint(vo.getName(), dto::setName);
		funPoint(vo.getValue(), dto::setValue);
		funPoint(vo.getType(), dto::setType);
		funPoint(vo.getContent(), dto::setContent);
		if(vo.getSupports() != null) {
			dto.setSupports(stoppageQuationsSubOptionsSupportMapper.convertVO(vo.getSupports()));
		}
		funPoint(vo.isBooleanValue(), dto::setBooleanValue);
		funPoint(vo.isCommentsRequired(), dto::setCommentsRequired);
		funPoint(vo.getComments(), dto::setComments);
		funPoint(vo.getRadioButton(), dto::setRadioButton);
		return dto;
	}
	
}
