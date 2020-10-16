package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.StateDTO;
import org.epragati.master.vo.StateVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class StateMapper extends BaseMapper<StateDTO, StateVO> {

	public StateVO masterStateVO;
	public StateDTO masterStateDTO;

	@Override
	public StateVO convertEntity(StateDTO stateDTO) {
		masterStateVO = new StateVO();
		funPoint(stateDTO.getCountryId(), masterStateVO::setCountryId);
		funPoint(stateDTO.getStateId(), masterStateVO::setStateId);
		funPoint(stateDTO.getStateName(), masterStateVO::setStateName);
		funPoint(stateDTO.getStateStatus(), masterStateVO::setStateStatus);
		funPoint(stateDTO.getCreatedBy(), masterStateVO::setCreatedBy);
		funPoint(stateDTO.getCreatedDate(), masterStateVO::setCreatedDate);
		funPoint(stateDTO.getModifiedBy(), masterStateVO::setModifiedBy);
		funPoint(stateDTO.getModifiedDate(), masterStateVO::setModifiedDate);
		funPoint(stateDTO.getStateName(), masterStateVO::setName);
		return masterStateVO;
	}

	public StateVO stateLimitedFields(StateDTO stateDTO) {
		masterStateVO = new StateVO();
		funPoint(stateDTO.getStateName(), masterStateVO::setStateName);
		return masterStateVO;
	}

	@Override
	public List<StateVO> convertEntity(List<StateDTO> stateDTOList) {
		return stateDTOList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}

	@Override
	public StateDTO convertVO(StateVO stateVO) {
		masterStateDTO = new StateDTO();
		funPoint(stateVO.getName(), masterStateDTO::setStateName);
		funPoint(stateVO.getCountryId(), masterStateDTO::setCountryId);
		funPoint(stateVO.getStateId(), masterStateDTO::setStateId);
		funPoint(stateVO.getStateName(), masterStateDTO::setStateName);
		funPoint(stateVO.getStateStatus(), masterStateDTO::setStateStatus);
		funPoint(stateVO.getCreatedBy(), masterStateDTO::setCreatedBy);
		funPoint(stateVO.getCreatedDate(), masterStateDTO::setCreatedDate);
		funPoint(stateVO.getModifiedBy(), masterStateDTO::setModifiedBy);
		funPoint(stateVO.getModifiedDate(), masterStateDTO::setModifiedDate);
		
		return masterStateDTO;
	}

	@Override
	public List<StateDTO> convertVO(List<StateVO> stateVOList) {
		return stateVOList.stream().map(e -> convertVO(e)).collect(Collectors.toList());
	}

}
