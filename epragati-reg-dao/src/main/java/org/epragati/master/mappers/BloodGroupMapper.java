package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.BloodGroupDTO;
import org.epragati.master.vo.BloodGroupVO;
import org.springframework.stereotype.Component;

/**
 * @author sairam.cheruku
 *
 */
@Component
public class BloodGroupMapper extends BaseMapper<BloodGroupDTO, BloodGroupVO> {

	/**
	 * Converting on DTO to VO
	 * 
	 */

	@Override
	public BloodGroupVO convertEntity(BloodGroupDTO dto) {
		BloodGroupVO masterBloodGroupVO = new BloodGroupVO();
		funPoint(dto.getActive(), masterBloodGroupVO::setActive);
		funPoint(dto.getBloodGrpName(), masterBloodGroupVO::setBloodGrpName);
		//funPoint(dto.getCreatedOn(), masterBloodGroupVO::setCreatedOn);
		funPoint(dto.getId(), masterBloodGroupVO::setId);
		funPoint(dto.getSlNo(), masterBloodGroupVO::setSlNo);
		return masterBloodGroupVO;
	}

	/**
	 * Converting of VO to DTO
	 * 
	 */

	@Override
	public BloodGroupDTO convertVO(BloodGroupVO vo) {
		BloodGroupDTO masterBloodGroupDTO = new BloodGroupDTO();

		funPoint(vo.getActive(), masterBloodGroupDTO::setActive);
		funPoint(vo.getBloodGrpName(), masterBloodGroupDTO::setBloodGrpName);
		//funPoint(vo.getCreatedOn(), masterBloodGroupDTO::setCreatedOn);
		funPoint(vo.getId(), masterBloodGroupDTO::setId);
		funPoint(vo.getSlNo(), masterBloodGroupDTO::setSlNo);
		return masterBloodGroupDTO;

	}
	
	public BloodGroupVO convertRequired(BloodGroupDTO dto){
		BloodGroupVO bloodGroupVO = new BloodGroupVO();
		funPoint(dto.getSlNo(), bloodGroupVO::setSlNo);
		funPoint(dto.getBloodGrpName(), bloodGroupVO::setBloodGrpName);
		return bloodGroupVO;
	}
	public List<BloodGroupVO> convertDTOs(List<BloodGroupDTO> dtos) {
		return dtos.stream().map(e -> convertRequired(e)).collect(Collectors.toList());
	}

}
