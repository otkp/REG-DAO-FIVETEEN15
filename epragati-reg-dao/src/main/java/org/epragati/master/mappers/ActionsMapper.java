package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.ActionsDTO;
import org.epragati.master.vo.ActionsVO;
import org.springframework.stereotype.Component;

@Component
public class ActionsMapper extends BaseMapper<ActionsDTO, ActionsVO>{

	@Override
	public ActionsVO convertEntity(ActionsDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	public ActionsDTO convertVo(ActionsVO vo)
	{
		ActionsDTO dto=new ActionsDTO();
		funPoint(vo.get_id(), dto::set_id);
		funPoint(vo.getActionName(),dto::setActionName);
		return dto;
		
	}
	@Override
	public List<ActionsDTO> convertVO(List<ActionsVO> vos) {
		return vos.stream().map(e -> convertVO(e)).collect(Collectors.toList());
	}
}
