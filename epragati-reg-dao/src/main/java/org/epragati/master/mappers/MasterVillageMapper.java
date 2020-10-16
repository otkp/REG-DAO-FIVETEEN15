package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.MasterVillageDTO;
import org.epragati.master.vo.MasterVillageVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class MasterVillageMapper extends BaseMapper<MasterVillageDTO, MasterVillageVO> {

	public MasterVillageVO masterVillageVO;
	public MasterVillageDTO masterVillageDTO;
	
	
	@Override
	public MasterVillageVO convertEntity(MasterVillageDTO masterVillageDTO) {
		
		masterVillageVO = new MasterVillageVO();
		funPoint(masterVillageDTO.getMandalId(), masterVillageVO::setMandalId);
		funPoint(masterVillageDTO.getStatus(), masterVillageVO::setStatus);
		funPoint(masterVillageDTO.getVillageCode(), masterVillageVO::setVillageCode);
		funPoint(masterVillageDTO.getVillageId(), masterVillageVO::setVillageId);
		funPoint(masterVillageDTO.getVillageName(), masterVillageVO::setVillageName);
		return masterVillageVO;
	}
	
	@Override
	public List<MasterVillageVO> convertEntity(List<MasterVillageDTO> masterVillageDTOList) {
		return masterVillageDTOList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}
	
	@Override
	public MasterVillageDTO convertVO(MasterVillageVO masterVillageVO) {
		
		masterVillageDTO = new MasterVillageDTO();
		funPoint(masterVillageVO.getMandalId(), masterVillageDTO::setMandalId);
		funPoint(masterVillageVO.getStatus(), masterVillageDTO::setStatus);
		funPoint(masterVillageVO.getVillageCode(), masterVillageDTO::setVillageCode);
		funPoint(masterVillageVO.getVillageId(), masterVillageDTO::setVillageId);
		funPoint(masterVillageVO.getVillageName(), masterVillageDTO::setVillageName);
		return masterVillageDTO;
	}
	
	@Override
	public List<MasterVillageDTO> convertVO(List<MasterVillageVO> masterVillageVOList) {
		return masterVillageVOList.stream().map(e -> convertVO(e)).collect(Collectors.toList());
	}

}
