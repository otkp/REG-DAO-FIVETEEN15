package org.epragati.regservice.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.regservice.dto.TaxDetailsDTO;
import org.epragati.regservice.vo.TaxDetailsVO;
import org.epragati.util.DateConverters;
import org.epragati.vcrImage.dto.OtherVoluntaryTax;
import org.springframework.stereotype.Component;

@Component
public class TaxDetailsMapper extends BaseMapper<TaxDetailsDTO, TaxDetailsVO> {

	@Override
	public TaxDetailsVO convertEntity(TaxDetailsDTO dto) {
		TaxDetailsVO vo = new TaxDetailsVO();
		
		funPoint(dto.getPaymentDAte(), vo::setPaymentDAte);
		funPoint(dto.getTaxAmount(), vo::setTaxAmount);
		funPoint(dto.getTaxType(), vo::setTaxType);
		funPoint(dto.getValidUpto(), vo::setValidUpto);
		funPoint(dto.getVcrno(), vo::setVcrno);
		funPoint(dto.getMvi(), vo::setMvi);
		return vo;
	}
	@Override
	public TaxDetailsDTO convertVO(TaxDetailsVO vo) {
		
		TaxDetailsDTO dto = new TaxDetailsDTO();
		
		funPoint(vo.getPaymentDAte(), dto::setPaymentDAte);
		funPoint(vo.getTaxAmount(), dto::setTaxAmount);
		funPoint(vo.getTaxType(), dto::setTaxType);
		funPoint(vo.getValidUpto(), dto::setValidUpto);
		funPoint(vo.getVcrno(), dto::setVcrno);
		funPoint(vo.getMvi(), dto::setMvi);
		funPoint(vo.getCollectedAmount(), dto::setCollectedAmount);
		funPoint(vo.getDate(), dto::setDate);
		funPoint(vo.getVcrTaxvalidUpto(), dto::setVcrTaxvalidUpto);
		
		
		return dto;
	}
	
	public TaxDetailsVO convertEntityforOtherStateVoluntaryTax(OtherVoluntaryTax dto) {
		TaxDetailsVO vo = new TaxDetailsVO();
//		vo.setTaxPaymentDAte(DateConverters.StringLocalDateTime(dto.getTaxvalidFrom()));
		vo.setTaxAmount(Long.valueOf(dto.getTax()));
		vo.setTaxType(dto.getTaxType());
		vo.setValidUpto(DateConverters.StringLocalDate(dto.getTaxvalidUpto()));
		vo.setValidfrom(DateConverters.StringLocalDate(dto.getTaxvalidFrom()));

		return vo;
	}
}
