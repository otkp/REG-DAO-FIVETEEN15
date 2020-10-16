package org.epragati.vcrImage.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.vcr.vo.ValidityDetailsVo;
import org.epragati.vcrImage.dto.ValidityDetailsDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ValidityDetailsMapper extends BaseMapper<ValidityDetailsDTO, ValidityDetailsVo> {

	@Override
	public ValidityDetailsVo convertEntity(ValidityDetailsDTO dto) {
		ValidityDetailsVo vo = new ValidityDetailsVo();

		BeanUtils.copyProperties(dto, vo);
		return vo;
	}

	@Override
	public ValidityDetailsDTO convertVO(ValidityDetailsVo vo) {
		ValidityDetailsDTO dto = new ValidityDetailsDTO();
		BeanUtils.copyProperties(vo, dto);
		return dto;
	}

}
