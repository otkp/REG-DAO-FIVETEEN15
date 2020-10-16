package org.epragati.master.mappers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.epragati.common.dto.FlowDTO;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.flow.vo.FlowVO;
import org.epragati.master.dto.RoleActionDTO;
import org.epragati.master.vo.RoleActionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FlowMapper extends BaseMapper<FlowDTO, FlowVO>{
	
	@Autowired
	private RoleActionMapper roleActionMapper;
	
	
	FlowDTO flowDTO;
	FlowVO flowVO;
	@Override
	public FlowVO convertEntity(FlowDTO flowDTO) {
		Map<Integer,List<RoleActionVO>> map=new HashMap<Integer,List<RoleActionVO>>();
		flowVO=new FlowVO();
		funPoint(flowDTO.getFlowId(), flowVO::setFlowId);
		funPoint(flowDTO.isStatus(), flowVO::setStatus);
		Set<Integer> keys=flowDTO.getFlowDetails().keySet();
		
		for(Integer key:keys) {
	List<RoleActionVO> actionvo=roleActionMapper.convertEntity(flowDTO.getFlowDetails().get(key));
	map.put(key, actionvo);
		}
		
		if(flowDTO.getFlowDetails()!=null) {
			flowVO.setFlowDetails(map);
		}
		return flowVO;
	}
	
	
	
	
	@Override
	public FlowDTO convertVO(FlowVO flowVO) {
	Map<Integer,List<RoleActionDTO>> map=new HashMap<Integer,List<RoleActionDTO>>(); 
		flowDTO=new FlowDTO();
		funPoint(flowVO.getFlowId(), flowDTO::setFlowId);
		funPoint(flowVO.isStatus(), flowDTO::setStatus);
Set<Integer> keys=flowVO.getFlowDetails().keySet();
		
		for(Integer key:keys) {
	List<RoleActionDTO> actionDTO=roleActionMapper.convertVO(flowVO.getFlowDetails().get(key));
	map.put(key,actionDTO);
		}
		
		if(flowVO.getFlowDetails()!=null) {
			flowDTO.setFlowDetails(map);
		}
		return flowDTO;
	}

}
