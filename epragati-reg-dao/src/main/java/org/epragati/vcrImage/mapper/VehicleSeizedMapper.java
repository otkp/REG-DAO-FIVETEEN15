package org.epragati.vcrImage.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.vcr.vo.VehicleIeSeizedVO;
import org.epragati.vcrImage.dto.VehicleSeizedDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class VehicleSeizedMapper extends BaseMapper<VehicleSeizedDTO, VehicleIeSeizedVO> {

	private static final Logger logger = LoggerFactory.getLogger(VehicleSeizedMapper.class);

	@Override
	public VehicleIeSeizedVO convertEntity(VehicleSeizedDTO dto) {
		logger.warn("converting VehicleSeizedDTO to VO");
		VehicleIeSeizedVO vo = new VehicleIeSeizedVO();
		BeanUtils.copyProperties(dto, vo);
		return vo;
	}

	@Override
	public VehicleSeizedDTO convertVO(VehicleIeSeizedVO vo) {
		logger.warn("converting VehicleSeizedVo to DTO");
		VehicleSeizedDTO dto = new VehicleSeizedDTO();
		BeanUtils.copyProperties(vo, dto);
		return dto;
	}

}
