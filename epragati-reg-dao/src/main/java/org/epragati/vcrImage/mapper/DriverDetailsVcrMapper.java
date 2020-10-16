package org.epragati.vcrImage.mapper;

import java.util.ArrayList;
import java.util.List;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.MasterCovDTO;
import org.epragati.master.mappers.MasterCovMapper;
import org.epragati.master.mappers.VcrGoodsMapper;
import org.epragati.vcr.vo.DriverDetailsVcrVo;
import org.epragati.vcrImage.dto.DriverDetailsVcrDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DriverDetailsVcrMapper extends BaseMapper<DriverDetailsVcrDTO, DriverDetailsVcrVo> {

	@Autowired
	private VcrGoodsMapper vcrGoodsMapper;
	@Autowired
	private MasterCovMapper masterCovMapper;

	@Override
	public DriverDetailsVcrVo convertEntity(DriverDetailsVcrDTO dto) {
		DriverDetailsVcrVo vo = new DriverDetailsVcrVo();
		BeanUtils.copyProperties(dto, vo);
		vo.setGoodsDescription(vcrGoodsMapper.convertEntity(dto.getGoodsDescription()));
		return vo;
	}

	@Override
	public DriverDetailsVcrDTO convertVO(DriverDetailsVcrVo vo) {
		DriverDetailsVcrDTO dto = new DriverDetailsVcrDTO();
		BeanUtils.copyProperties(vo, dto);

		if (vo.getClasssOfVehicle() != null && !vo.getClasssOfVehicle().isEmpty()) {
			dto.setClasssOfVehicle(masterCovMapper.convertDTOsForDriver(vo.getClasssOfVehicle()));
		}
		dto.setGoodsDescription(vcrGoodsMapper.convertVO(vo.getGoodsDescription()));
		return dto;
	}

}
