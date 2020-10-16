package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.BodyTypeDTO;
import org.epragati.master.vo.BodyTypeVO;
import org.springframework.stereotype.Component;
@Component
public class BodyTypeMapper extends BaseMapper<BodyTypeDTO, BodyTypeVO> {

	@Override
	public BodyTypeVO convertEntity(BodyTypeDTO dto) {
		BodyTypeVO bodyTypeVO = new BodyTypeVO();
		funPoint(dto.getBodyType(), bodyTypeVO::setBodyType);
		funPoint(dto.getBodyTypeId(), bodyTypeVO::setBodyTypeId);
		funPoint(dto.getStatus(), bodyTypeVO::setStatus);
		return bodyTypeVO;
	}

	@Override
	public BodyTypeDTO convertVO(BodyTypeVO vo) {
		BodyTypeDTO bodyTypeDTO=new BodyTypeDTO();
		funPoint(vo.getBodyType(), bodyTypeDTO::setBodyType);
		funPoint(vo.getBodyTypeId(), bodyTypeDTO::setBodyTypeId);
		funPoint(vo.getStatus(), bodyTypeDTO::setStatus);
		return bodyTypeDTO;
	}
	
	public BodyTypeVO convertRequired(BodyTypeDTO dto){
		BodyTypeVO bodyTypeVO = new BodyTypeVO();
		funPoint(dto.getBodyType(), bodyTypeVO::setBodyType);
		funPoint(dto.getBodyTypeId(), bodyTypeVO::setBodyTypeId);
		return bodyTypeVO;
	}
	public List<BodyTypeVO> convertDTOs(List<BodyTypeDTO> dtos) {
		return dtos.stream().map(e -> convertRequired(e)).collect(Collectors.toList());
	}

}