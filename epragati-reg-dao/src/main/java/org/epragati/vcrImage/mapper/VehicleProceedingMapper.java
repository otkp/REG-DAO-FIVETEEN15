package org.epragati.vcrImage.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.vcr.vo.VehicleProceedingVO;
import org.epragati.vcrImage.dto.VehicleProceedingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleProceedingMapper extends BaseMapper<VehicleProceedingDTO, VehicleProceedingVO> {

	@Autowired
	private FromVcrMapper fromMapper;
	@Autowired
	private ToVcrMapper toMapper;

	@Override
	public VehicleProceedingVO convertEntity(VehicleProceedingDTO dto) {
		VehicleProceedingVO vo = new VehicleProceedingVO();

		funPoint(dto.getRemarks(), vo::setRemarks);
		vo.setFrom(fromMapper.convertEntity(dto.getFrom()));
		vo.setTo(toMapper.convertEntity(dto.getTo()));
		return vo;
	}

	@Override
	public VehicleProceedingDTO convertVO(VehicleProceedingVO vo) {
		VehicleProceedingDTO dto = new VehicleProceedingDTO();
		funPoint(vo.getRemarks(), dto::setRemarks);
		dto.setFrom(fromMapper.convertVO(vo.getFrom()));
		dto.setTo(toMapper.convertVO(vo.getTo()));
		return dto;
	}

}
