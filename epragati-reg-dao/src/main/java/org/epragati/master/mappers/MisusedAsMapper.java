package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.MisusedAsDTO;
import org.epragati.master.vo.MisusedAsVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class MisusedAsMapper extends BaseMapper<MisusedAsDTO, MisusedAsVO> {

	@Override
	public MisusedAsVO convertEntity(MisusedAsDTO dto) {
		MisusedAsVO vo = new MisusedAsVO();
		BeanUtils.copyProperties(dto, vo);
		return vo;
	}

	@Override
	public MisusedAsDTO convertVO(MisusedAsVO vo) {
		MisusedAsDTO dto = new MisusedAsDTO();
		BeanUtils.copyProperties(vo, dto);
		return dto;
	}

}
