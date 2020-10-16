package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.RolesDTO;
import org.epragati.master.vo.RolesVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class RolesMapper extends BaseMapper<RolesDTO, RolesVO> {

	/**
	 * dto to vo conversion
	 */

	@Override
	public RolesVO convertEntity(RolesDTO dto) {
		RolesVO rolesVO = new RolesVO();
		funPoint(dto.getName(), rolesVO::setName);
		funPoint(dto.getUserNo(), rolesVO::setUserNo);
		funPoint(dto.getRoleId(), rolesVO::setRoleId);
		funPoint(dto.getStatus(), rolesVO::setStatus);
		funPoint(dto.getDescription(), rolesVO::setDescription);
		funPoint(dto.getMenuCodes(), rolesVO::setMenuCodes);
		funPoint(dto.getCreatedBy(), rolesVO::setCreatedBy);
		funPoint(dto.getCreatedDate(), rolesVO::setCreatedDate);
		funPoint(dto.getlUpdate(), rolesVO::setlUpdate);
		return rolesVO;
	}

	/**
	 * 
	 * dto list to vo list conversion
	 */
	public List<RolesVO> convertEntity(List<RolesDTO> dtos) {
		return dtos.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}
	
	@Override
	public RolesDTO convertVO(RolesVO vo) {
		RolesDTO rolesDTO = new RolesDTO();
		funPoint(vo.getName(), rolesDTO::setName);
		funPoint(vo.getUserNo(), rolesDTO::setUserNo);
		funPoint(vo.getRoleId(), rolesDTO::setRoleId);
		funPoint(vo.getStatus(), rolesDTO::setStatus);
		funPoint(vo.getMenuCodes(), rolesDTO::setMenuCodes);
		funPoint(vo.getDescription(), rolesDTO::setDescription);
		funPoint(vo.getCreatedBy(), rolesDTO::setCreatedBy);
		funPoint(vo.getCreatedDate(), rolesDTO::setCreatedDate);
		funPoint(vo.getlUpdate(), rolesDTO::setlUpdate);
		return rolesDTO;
	}
	
	public List<RolesDTO> convertVO(List<RolesVO> vos) {
		return vos.stream().map(e -> convertVO(e)).collect(Collectors.toList());
	}

}
