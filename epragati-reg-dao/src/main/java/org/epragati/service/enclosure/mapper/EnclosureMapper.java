package org.epragati.service.enclosure.mapper;


import org.epragati.common.mappers.BaseMapper;
import org.epragati.constants.EnclosureType;
import org.epragati.payment.dto.Enclosures;
import org.epragati.service.enclosure.vo.EnclouserVO;

import org.springframework.stereotype.Component;

@Component
public class EnclosureMapper extends BaseMapper<Enclosures, EnclouserVO> {
	
	@Override
	public EnclouserVO convertEntity(Enclosures entity) {
		
		EnclouserVO enclosure = new EnclouserVO();
		
		funPoint(entity.getEnclosureId(), enclosure::setId);
		funPoint(entity.getDetails(), enclosure::setDetails);
		funPoint(entity.getNoOfAttachments(), enclosure::setNoOfAttachments);
		funPoint(EnclosureType.getEnclosureType(entity.getProof()), enclosure::setType);
		funPoint(entity.getIsRequired() , enclosure :: setIsRequired);
		
		return enclosure;
	}
}