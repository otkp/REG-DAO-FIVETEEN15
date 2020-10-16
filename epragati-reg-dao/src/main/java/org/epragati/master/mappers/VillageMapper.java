package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.VillageDTO;
import org.epragati.master.vo.VillageVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class VillageMapper extends BaseMapper<VillageDTO, VillageVO>{

	public VillageVO villageVO;
	public VillageDTO villageDTO;
	
	@Override
	public VillageVO convertEntity(VillageDTO villageDTO) {
		villageVO = new VillageVO();
		funPoint(villageDTO.getMandalId(), villageVO::setMandalId);
		funPoint(villageDTO.getStatus(), villageVO::setStatus);
		funPoint(villageDTO.getVillageCode(), villageVO::setVillageCode);
		funPoint(villageDTO.getVillageId(), villageVO::setVillageId);
		funPoint(villageDTO.getVillageName(), villageVO::setVillageName);
		return villageVO;
	}
	@Override
	public List<VillageVO> convertEntity(List<VillageDTO> villageDTOList){
		return villageDTOList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}
	@Override
	public VillageDTO convertVO(VillageVO villageVO) {
		villageDTO = new VillageDTO();
		funPoint(villageVO.getMandalId(), villageDTO::setMandalId);
		funPoint(villageVO.getStatus(), villageDTO::setStatus);
		funPoint(villageVO.getVillageCode(), villageDTO::setVillageCode);
		funPoint(villageVO.getVillageId(), villageDTO::setVillageId);
		funPoint(villageVO.getVillageName(), villageDTO::setVillageName);
		return villageDTO;
	}
	@Override
	public List<VillageDTO> convertVO(List<VillageVO> villageVOList){
		return villageVOList.stream().map(e -> convertVO(e)).collect(Collectors.toList());
	}
}
