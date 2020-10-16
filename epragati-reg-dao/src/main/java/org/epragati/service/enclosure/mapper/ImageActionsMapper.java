package org.epragati.service.enclosure.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.dto.enclosure.ImageActionsDTO;
import org.epragati.service.enclosure.vo.ImageActionsVO;
import org.springframework.stereotype.Component;
@Component
public class ImageActionsMapper extends BaseMapper<ImageActionsDTO, ImageActionsVO>{

	@Override
	public ImageActionsVO convertEntity(ImageActionsDTO dto) {
		// TODO Auto-generated method stub
		
		
		return null;
	}
	
	@Override
	public ImageActionsDTO convertVO(ImageActionsVO vo)
	{
		ImageActionsDTO dto=new ImageActionsDTO();
		funPoint(vo.getAction(), dto::setAction);
		funPoint(vo.getComments(),dto::setComments);
		funPoint(vo.getName(), dto::setName);
		funPoint(vo.getRole(),dto::setRole);
		return dto;
	}

}
