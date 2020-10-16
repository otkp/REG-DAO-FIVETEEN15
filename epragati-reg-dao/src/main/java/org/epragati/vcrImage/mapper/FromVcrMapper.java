package org.epragati.vcrImage.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.mappers.DistrictMapper;
import org.epragati.master.mappers.StateMapper;
import org.epragati.vcr.vo.FromVcrVo;
import org.epragati.vcrImage.dto.FromVcrDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FromVcrMapper extends BaseMapper<FromVcrDTO, FromVcrVo> {
	@Autowired
	private StateMapper statemapper;
	@Autowired
	private DistrictMapper districtMapper;

	@Override
	public FromVcrVo convertEntity(FromVcrDTO dto) {
		FromVcrVo vo = new FromVcrVo();
		funPoint(dto.getPlace(), vo::setPlace);
		vo.setState(statemapper.convertEntity(dto.getState()));
		vo.setDistrict(districtMapper.convertEntity(dto.getDistrict()));
		return vo;
	}

	@Override
	public FromVcrDTO convertVO(FromVcrVo vo) {
		FromVcrDTO dto = new FromVcrDTO();
		dto.setPlace(vo.getPlace());
		dto.setState(statemapper.convertVO(vo.getState()));
		dto.setDistrict(districtMapper.convertVO(vo.getDistrict()));
		return dto;
	}

}
