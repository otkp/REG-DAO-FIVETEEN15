package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.OwnershipDTO;
import org.epragati.master.vo.OwnershipVO;
import org.springframework.stereotype.Component;

@Component
public class OwnershipMapper extends BaseMapper<OwnershipDTO, OwnershipVO>{

	@Override
	public OwnershipVO convertEntity(OwnershipDTO dto) {
		OwnershipVO masterOwnershipVO= new OwnershipVO();
		funPoint(dto.getoId(), masterOwnershipVO::setoId);
		funPoint(dto.getCode(), masterOwnershipVO::setCode);
		funPoint(dto.getDescription(), masterOwnershipVO::setDescription);
		funPoint(dto.getCreatedDate(), masterOwnershipVO::setCreatedDate);
		funPoint(dto.getlUpdate(), masterOwnershipVO::setlUpdate);
		funPoint(dto.getStatus(),  masterOwnershipVO::setStatus);
		return masterOwnershipVO;
	}
	
	@Override
	public OwnershipDTO convertVO(OwnershipVO vo){
		OwnershipDTO masterOwnershipDTO = new OwnershipDTO();
		funPoint(vo.getoId(), masterOwnershipDTO::setoId);
		funPoint(vo.getCode(), masterOwnershipDTO::setCode);
		funPoint(vo.getDescription(), masterOwnershipDTO::setDescription);
		funPoint(vo.getCreatedDate(), masterOwnershipDTO::setCreatedDate);
		funPoint(vo.getlUpdate(), masterOwnershipDTO::setlUpdate);
		funPoint(vo.getStatus(),  masterOwnershipDTO::setStatus);
		return masterOwnershipDTO;
	}
	
	public OwnershipVO convertRequired(OwnershipDTO dto){
		OwnershipVO masterOwnershipVO= new OwnershipVO();
		funPoint(dto.getCode(), masterOwnershipVO::setCode);
		funPoint(dto.getDescription(), masterOwnershipVO::setDescription);
		return masterOwnershipVO;
	}
	public List<OwnershipVO> convertDTOs(List<OwnershipDTO> dtos) {
		return dtos.stream().map(e -> convertRequired(e)).collect(Collectors.toList());
	}
}
