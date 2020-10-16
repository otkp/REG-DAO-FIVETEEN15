package org.epragati.vcrImage.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.mappers.DistrictMapper;
import org.epragati.master.mappers.StateMapper;
import org.epragati.vcr.vo.ToVcrVO;
import org.epragati.vcrImage.dto.ToVcrDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ToVcrMapper extends BaseMapper<ToVcrDTO, ToVcrVO> {
	@Autowired
	private StateMapper statemapper;
	@Autowired
	private DistrictMapper districtMapper;

	@Override
	public ToVcrVO convertEntity(ToVcrDTO dto) {
		ToVcrVO vo = new ToVcrVO();
		funPoint(dto.getPlace(), vo::setPlace);
		vo.setState(statemapper.convertEntity(dto.getState()));
		vo.setDistrict(districtMapper.convertEntity(dto.getDistrict()));
		return vo;
	}

	@Override
	public ToVcrDTO convertVO(ToVcrVO vo) {
		ToVcrDTO dto = new ToVcrDTO();
		dto.setPlace(vo.getPlace());
		dto.setState(statemapper.convertVO(vo.getState()));
		dto.setDistrict(districtMapper.convertVO(vo.getDistrict()));
		return dto;
	}

}
