package org.epragati.cfst.vcr.dao;

import org.epragati.cfstVcr.vo.VcrTaxDetails;
import org.epragati.common.mappers.BaseMapper;
import org.springframework.stereotype.Component;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Component
public class VcrTaxPaidMapper extends BaseMapper<VcrTaxDetailsDTO, VcrTaxDetails>{

	@Override
	public VcrTaxDetails convertEntity(VcrTaxDetailsDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public VcrTaxDetailsDTO convertVO(VcrTaxDetails vo){
		
		VcrTaxDetailsDTO vcrDetailsDto =new VcrTaxDetailsDTO();
		funPoint(vo.getBookDate(),vcrDetailsDto::setBookDate);
		funPoint(vo.getCfAmnt(),vcrDetailsDto::setCfAmnt);
		funPoint(vo.getChallanNo(),vcrDetailsDto::setChallanNo);
		funPoint(vo.getManVcrNo(),vcrDetailsDto::setManVcrNo);
		funPoint(vo.getMviCode(),vcrDetailsDto::setMviCode);
		funPoint(vo.getMviName(),vcrDetailsDto::setMviName);
		funPoint(vo.getOfficeCode(),vcrDetailsDto::setOfficeCode);
		funPoint(vo.getPaymtDate(),vcrDetailsDto::setPaymtDate);
		funPoint(vo.getRegnNo(),vcrDetailsDto::setRegnNo);
		funPoint(vo.getTaxAmt(),vcrDetailsDto::setTaxAmt);
		funPoint(vo.getVcrNo(),vcrDetailsDto::setVcrNo);
		funPoint(vo.getVehicles(),vcrDetailsDto::setVehicles);
		
		return vcrDetailsDto; 
		
	}
	

}
