package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.MasterVariantDTO;
import org.epragati.master.vo.MasterVariantVO;
import org.springframework.stereotype.Component;
/**
 * 
 * @author krishnarjun.pampana
 *
 */

@Component
public class MasterVaraintMapper extends BaseMapper<MasterVariantDTO,MasterVariantVO>{

	@Override
	public MasterVariantVO convertEntity(MasterVariantDTO dto) {
		
		MasterVariantVO masterVariantVO = new MasterVariantVO();
		funPoint(dto.getModelDesc(), masterVariantVO::setModelDesc);
		funPoint(dto.getBodyTypeID(), masterVariantVO::setBodyTypeID);
		funPoint(dto.getMid(), masterVariantVO::setMid);
		funPoint(dto.getBsAllowed(), masterVariantVO::setBsAllowed);
		if(StringUtils.isNoneEmpty(dto.getUlw())){
			Double d = Double.parseDouble(dto.getUlw());
			masterVariantVO.setUlw(d.intValue());
		}
		if(StringUtils.isNoneEmpty(dto.getRlw())){
			Double d = Double.parseDouble(dto.getRlw());
			masterVariantVO.setRlw(d.intValue());
		}
		funPoint(dto.getFuel(), masterVariantVO::setFuel);
		funPoint(dto.getFuelType(), masterVariantVO::setFuelType);
		funPoint(dto.getWheelBase(), masterVariantVO::setWheelBase);
		funPoint(dto.getSeatCapacity(), masterVariantVO::setSeatCapacity);
		funPoint(dto.getCc(), masterVariantVO::setCc);
		funPoint(dto.getFuel(), masterVariantVO::setFuel);
		return masterVariantVO;
	}
	
	@Override
	public List<MasterVariantVO> convertEntity(List<MasterVariantDTO> dtos) {
		return dtos.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}
	public MasterVariantVO convertRequiredEntity(MasterVariantDTO dto) {
		MasterVariantVO masterVariantVO = new MasterVariantVO();
		funPoint(dto.getModelDesc(), masterVariantVO::setModelDesc);
		return masterVariantVO;
	}
	
	public List<MasterVariantVO> convertRequiredList(List<MasterVariantDTO> dtos) {
		return dtos.stream().map(e -> convertRequiredEntity(e)).collect(Collectors.toList());
	}
	
	@Override
	public MasterVariantDTO convertVO(MasterVariantVO vo) {
		MasterVariantDTO masterVariantDto = new MasterVariantDTO();
		funPoint(vo.getModelDesc().toUpperCase(), masterVariantDto::setModelDesc);
		funPoint(vo.getBodyTypeID(), masterVariantDto::setBodyTypeID);
		funPoint(vo.getMid(), masterVariantDto::setMid);
		funPoint(vo.getBsAllowed(), masterVariantDto::setBsAllowed);
		if(vo.getUlw()!=null){
		masterVariantDto.setUlw(vo.getUlw().toString());
		}
		if(vo.getRlw()!=null){
					masterVariantDto.setRlw(vo.getRlw().toString());
		}
		funPoint(vo.getFuel(), masterVariantDto::setFuel);
		funPoint(vo.getFuelType(), masterVariantDto::setFuelType);
		funPoint(vo.getWheelBase(), masterVariantDto::setWheelBase);
		funPoint(vo.getSeatCapacity(), masterVariantDto::setSeatCapacity);
		funPoint(vo.getCc(), masterVariantDto::setCc);
		funPoint(vo.getAxle(), masterVariantDto::setAxle);
		funPoint(vo.getFaWt(), masterVariantDto::setFaWt);
		funPoint(vo.getCylinder(), masterVariantDto::setCylinder);
		funPoint(vo.getHeight(), masterVariantDto::setHeight);
		funPoint(vo.getOaWt(), masterVariantDto::setOaWt);
		funPoint(vo.getLength(), masterVariantDto::setLength);
		funPoint(vo.getSeatCapacity(), masterVariantDto::setSeatCapacity);
		funPoint(vo.getVehicleClassID(), masterVariantDto::setVehicleClassID);
		//funPoint(vo.getVehicleMkSerialNO(), masterVariantDto::setVehicleMkSerialNO);
		funPoint(vo.getGcw(), masterVariantDto::setGcw);
		funPoint(vo.getGcwc(), masterVariantDto::setGcwc);
		return masterVariantDto;
		
	}
}
