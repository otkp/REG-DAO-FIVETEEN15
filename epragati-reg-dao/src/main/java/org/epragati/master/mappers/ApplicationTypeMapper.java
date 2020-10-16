package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.ApplicationTypeDTO;
import org.epragati.master.vo.ApplicationTypeVO;
import org.springframework.stereotype.Component;
@Component
public class ApplicationTypeMapper extends BaseMapper<ApplicationTypeDTO, ApplicationTypeVO> {

	@Override
	public ApplicationTypeVO convertEntity(ApplicationTypeDTO dto) {

		ApplicationTypeVO applicationTypeVO = new ApplicationTypeVO();
		funPoint(dto.getId(), applicationTypeVO::setId);
		funPoint(dto.getType(), applicationTypeVO::setType);
		return applicationTypeVO;
	}

	@Override
	public ApplicationTypeDTO convertVO(ApplicationTypeVO vo) {

		ApplicationTypeDTO applicationTypeDTO = new ApplicationTypeDTO();
		funPoint(vo.getId(), applicationTypeDTO::setId);
		funPoint(vo.getType(), applicationTypeDTO::setType);
		return applicationTypeDTO;

	}
}
