package org.epragati.regservice.mapper;


import org.epragati.common.mappers.BaseMapper;
import org.epragati.regservice.dto.GreenTaxDTO;
import org.epragati.regservice.vo.GreenTaxVO;
import org.springframework.stereotype.Component;

@Component
public class GreenTaxMapper extends BaseMapper<GreenTaxDTO, GreenTaxVO> {

	@Override
	public GreenTaxVO convertEntity(GreenTaxDTO dto) {
		
		GreenTaxVO vo = new GreenTaxVO();
		
		funPoint(dto.getChallanNo(), vo::setChallanNo);
		funPoint(dto.getTaxAmount(), vo::setTaxAmount);
		funPoint(dto.getPaymentDate(), vo::setPaymentDate);
		funPoint(dto.getValidUpto(), vo::setValidUpto);
		
		return vo;
		
	}
	
	@Override
	public GreenTaxDTO convertVO(GreenTaxVO vo) {
		
		GreenTaxDTO dto = new GreenTaxDTO();
		
		funPoint(vo.getChallanNo(), dto::setChallanNo);
		funPoint(vo.getTaxAmount(), dto::setTaxAmount);
		funPoint(vo.getPaymentDate(), dto::setPaymentDate);
		funPoint(vo.getValidUpto(), dto::setValidUpto);
		
		return dto;
	}

}
