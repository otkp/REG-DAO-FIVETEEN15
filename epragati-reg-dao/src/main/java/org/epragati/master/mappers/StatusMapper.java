package org.epragati.master.mappers;

import java.util.ArrayList;
import java.util.List;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.StatusDTO;
import org.epragati.master.vo.StatusVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saikiran.kola
 *
 */
@Component
public class StatusMapper extends BaseMapper<StatusDTO, StatusVO> {

	@Override
	public StatusVO convertEntity(StatusDTO dto) {
		StatusVO masterStatusVO = new StatusVO();
		funPoint(dto.getCreatedDate(), masterStatusVO::setCreatedDate);
		funPoint(dto.getDescription(), masterStatusVO::setDescription);
		funPoint(dto.getlUpdate(), masterStatusVO::setlUpdate);
		funPoint(dto.getsId(), masterStatusVO::setsId);
		funPoint(dto.getStatus(), masterStatusVO::setStatus);
		// TODO Auto-generated method stub
		return masterStatusVO;
	}

	public List<StatusVO> convertEntity(List<StatusDTO> dtoList) {
		
		List<StatusVO> masterStatuslist=new ArrayList<>();
		for(StatusDTO masterStatusDTO :dtoList ) {
			StatusVO masterStatusVO =new StatusVO();
			funPoint(masterStatusDTO.getCreatedDate(), masterStatusVO::setCreatedDate);
			funPoint(masterStatusDTO.getDescription(), masterStatusVO::setDescription);
			funPoint(masterStatusDTO.getlUpdate(), masterStatusVO::setlUpdate);
			funPoint(masterStatusDTO.getsId(), masterStatusVO::setsId);
			funPoint(masterStatusDTO.getStatus(), masterStatusVO::setStatus);
			masterStatuslist.add(masterStatusVO);
	}
		return masterStatuslist;
}}