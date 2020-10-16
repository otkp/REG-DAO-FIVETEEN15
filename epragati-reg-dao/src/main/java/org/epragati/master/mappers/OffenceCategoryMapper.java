package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.OffenceCategory;
import org.epragati.master.vo.OffenceCategoryVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class OffenceCategoryMapper extends BaseMapper<OffenceCategory, OffenceCategoryVO> {

	@Override
	public OffenceCategoryVO convertEntity(OffenceCategory dto) {
		
		OffenceCategoryVO vo=new OffenceCategoryVO();
		BeanUtils.copyProperties(dto, vo);
		return vo;
	}
	
	@Override
	public OffenceCategory convertVO(OffenceCategoryVO vo) {
		OffenceCategory dto=new OffenceCategory();
		BeanUtils.copyProperties(vo, dto);
		return dto;
	}

}
