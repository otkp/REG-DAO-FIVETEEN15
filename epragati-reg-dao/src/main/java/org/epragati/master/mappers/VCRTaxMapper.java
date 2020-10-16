package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.TaxDetailsDTO;
import org.epragati.vcrImage.dto.ValidityDetailsDTO;
import org.epragati.vcrImage.dto.VcrFinalServiceDTO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Component
public class VCRTaxMapper  extends BaseMapper<VcrFinalServiceDTO, TaxDetailsDTO> {
	
    // In VehicleDetailsAndPermitDetailsVO add TaxDetailsDTO already giving to UI so temporary purpose added TaxDetailsDTO
	@Override
	public TaxDetailsDTO convertEntity(VcrFinalServiceDTO dto) {
		// TODO Auto-generated method stub
		
		if(dto.getValidityDetails()!=null){
			TaxDetailsDTO taxDto = new TaxDetailsDTO();
			ValidityDetailsDTO validityDto = dto.getValidityDetails();
			funPoint(validityDto.getTaxPaymentDate(),taxDto::setTaxPeriodFrom);
			funPoint(validityDto.getTaxValidUpto(),taxDto::setTaxPeriodEnd);
			if(validityDto.getPaidAmmount()!=null){
				taxDto.setTaxAmount(validityDto.getPaidAmmount().longValue());
			}
			return taxDto;
		}
		return null;
	}

}
