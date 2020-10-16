package org.epragati.gstn.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.gstn.dto.EntityAddressDTO;
import org.epragati.gstn.vo.EntityAddressVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class EntityAddressMapper extends BaseMapper<EntityAddressDTO, EntityAddressVO>{

	@Override
	public EntityAddressDTO convertVO(EntityAddressVO vo) {
		EntityAddressDTO dto = new EntityAddressDTO();
		funPoint(vo.getBnm(), dto::setBnm);
		funPoint(vo.getSt(), dto::setSt);
		funPoint(vo.getLoc(), dto::setLoc);
		funPoint(vo.getBno(), dto::setBno);
		funPoint(vo.getStcd(), dto::setStcd);
		funPoint(vo.getDst(), dto::setDst);
		funPoint(vo.getCity(), dto::setCity);
		funPoint(vo.getFlno(), dto::setFlno);
		funPoint(vo.getLt(), dto::setLt);
		funPoint(vo.getPncd(), dto::setPncd);
		funPoint(vo.getLg(), dto::setLg);
		return dto;
	}

	@Override
	public EntityAddressVO convertEntity(EntityAddressDTO dto) {
		EntityAddressVO vo = new EntityAddressVO();
		funPoint(dto.getBnm(), vo::setBnm);
		funPoint(dto.getSt(), vo::setSt);
		funPoint(dto.getLoc(), vo::setLoc);
		funPoint(dto.getBno(), vo::setBno);
		funPoint(dto.getStcd(), vo::setStcd);
		funPoint(dto.getDst(), vo::setDst);
		funPoint(dto.getCity(), vo::setCity);
		funPoint(dto.getFlno(), vo::setFlno);
		funPoint(dto.getLt(), vo::setLt);
		funPoint(dto.getPncd(), vo::setPncd);
		funPoint(dto.getLg(), vo::setLg);
		return vo;
	}

}
