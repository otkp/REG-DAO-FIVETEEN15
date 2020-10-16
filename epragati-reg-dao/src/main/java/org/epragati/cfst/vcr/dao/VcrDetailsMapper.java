package org.epragati.cfst.vcr.dao;

import java.time.LocalDateTime;

import org.epragati.cfstVcr.vo.VcrBookingData;
import org.epragati.common.mappers.BaseMapper;
import org.springframework.stereotype.Component;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Component
public class VcrDetailsMapper extends BaseMapper<VcrDetailsDto, VcrBookingData>{

	@Override
	public VcrBookingData convertEntity(VcrDetailsDto dto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public VcrDetailsDto convertVO(VcrBookingData vo){
		
		VcrDetailsDto vcrDetailsDto =new VcrDetailsDto();
		
		funPoint(vo.getVcrNum(),vcrDetailsDto::setVcrNum);
		funPoint(vo.getRegNo(),vcrDetailsDto::setRegNo);
		funPoint(vo.getDlNumber(),vcrDetailsDto::setDlNumber);
		funPoint(vo.getBookedByMvi(),vcrDetailsDto::setBookedByMvi);
		funPoint(vo.getBookedDate(),vcrDetailsDto::setBookedDate);
		funPoint(vo.getBookedTime(),vcrDetailsDto::setBookedTime);
		funPoint(vo.getPlaceBooked(),vcrDetailsDto::setPlaceBooked);
		funPoint(vo.getVcrStatus(),vcrDetailsDto::setVcrStatus);
		funPoint(vo.getIdType(),vcrDetailsDto::setIdType);
		funPoint(vo.getVehsezdFlag(),vcrDetailsDto::setVehsezdFlag);
		if(vo.getOffenseDetails()!=null && !vo.getOffenseDetails().isEmpty()){
			
			vcrDetailsDto.setOffenseDetails(vo.getOffenseDetails());
			
		}
		vcrDetailsDto.setCreatedDate(LocalDateTime.now());
		vcrDetailsDto.setCreatedDateStr(LocalDateTime.now().toString());
		return vcrDetailsDto; 
		
	}
	
	
	
}
