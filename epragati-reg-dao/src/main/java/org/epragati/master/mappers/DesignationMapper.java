package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.DesignationDTO;
import org.epragati.master.vo.DesignationVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class DesignationMapper extends BaseMapper<DesignationDTO, DesignationVO> {

	public DesignationVO designationVO;
	public DesignationDTO designationDTO;
	
	@Override
	public DesignationVO convertEntity(DesignationDTO designationDTO) {
		designationVO=new DesignationVO();
		funPoint(designationDTO.getDeptId(), designationVO::setDeptId);
		funPoint(designationDTO.getDesigId(), designationVO::setDesigId);
		funPoint(designationDTO.getDesigName(), designationVO::setDesigName);
		funPoint(designationDTO.getDesigStatus(), designationVO::setDesigStatus);
		funPoint(designationDTO.getCreatedBy(), designationVO::setCreatedBy);
		funPoint(designationDTO.getCreatedDate(), designationVO::setCreatedDate);
		funPoint(designationDTO.getModifiedBy(), designationVO::setModifiedBy);
		funPoint(designationDTO.getModifiedDate(), designationVO::setModifiedDate);
		return designationVO;
	}
	
	@Override
	public List<DesignationVO> convertEntity(List<DesignationDTO> designationDTOList) {
		return designationDTOList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}
	
	@Override
	public DesignationDTO convertVO(DesignationVO designationVO) {
		designationDTO=new DesignationDTO();
		funPoint(designationVO.getDeptId(), designationDTO::setDeptId);
		funPoint(designationVO.getDesigId(), designationDTO::setDesigId);
		funPoint(designationVO.getDesigName(), designationDTO::setDesigName);
		funPoint(designationVO.getDesigStatus(), designationDTO::setDesigStatus);
		funPoint(designationVO.getCreatedBy(), designationDTO::setCreatedBy);
		funPoint(designationVO.getCreatedDate(), designationDTO::setCreatedDate);
		funPoint(designationVO.getModifiedBy(), designationDTO::setModifiedBy);
		funPoint(designationVO.getModifiedDate(), designationDTO::setModifiedDate);
		return designationDTO;
	}
	
	@Override
	public List<DesignationDTO> convertVO(List<DesignationVO> designationVOList) {
		return designationVOList.stream().map(e -> convertVO(e)).collect(Collectors.toList());
	}

}
