package org.epragati.vcrImage.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.mappers.MisusedAsMapper;
import org.epragati.master.mappers.OffenceMapper;
import org.epragati.vcr.vo.OffenceVcrVO;
import org.epragati.vcrImage.dto.OffenceVcrDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OffenceVcrMapper extends BaseMapper<OffenceVcrDTO, OffenceVcrVO> {
	@Autowired
	private MisusedAsMapper misusedAsMapper;
	@Autowired
	private OffenceMapper offenceMapper;

	@Override
	public OffenceVcrVO convertEntity(OffenceVcrDTO dto) {
		OffenceVcrVO vo = new OffenceVcrVO();

		BeanUtils.copyProperties(dto, vo);
		if(dto.getMisusedAs()!=null) {
			vo.setMisusedAs(misusedAsMapper.convertEntity(dto.getMisusedAs()));
		}
		if(dto.getOffence()!=null) {
			vo.setOffence(offenceMapper.convertEntity(dto.getOffence()));
		}
		

		return vo;
	}


	public OffenceVcrVO convertLimited(OffenceVcrDTO dto) {
		OffenceVcrVO vo = new OffenceVcrVO();
		vo.setOffence(offenceMapper.convertLimied(dto.getOffence()));
		return vo;
	}

	@Override
	public OffenceVcrDTO convertVO(OffenceVcrVO vo) {
		OffenceVcrDTO dto = new OffenceVcrDTO();
		BeanUtils.copyProperties(vo, dto);
		if(vo.getMisusedAs()!=null) {
			dto.setMisusedAs(misusedAsMapper.convertVO(vo.getMisusedAs()));
		}
		dto.setOffence(offenceMapper.convertVO(vo.getOffence()));

		return dto;
	}

}
