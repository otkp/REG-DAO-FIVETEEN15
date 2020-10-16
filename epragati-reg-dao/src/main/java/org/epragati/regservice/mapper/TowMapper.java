package org.epragati.regservice.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.payment.mapper.ApplicantDeatilsMapper;
import org.epragati.regservice.dto.TrasnferOfOwnerShipDTO;
import org.epragati.regservice.vo.TowVO;
import org.epragati.util.payment.FinanceTowEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class TowMapper extends BaseMapper<TrasnferOfOwnerShipDTO, TowVO> {
	
	@Autowired
	private ApplicantDeatilsMapper applicantDeatilsMapper;

	@Override
	public TowVO convertEntity(TrasnferOfOwnerShipDTO dto) {

		TowVO vo = new TowVO();
		funPoint(dto.getSeller(), vo::setSeller);
		funPoint(dto.getBuyer(), vo::setBuyer);
		funPoint(dto.getTransferType(), vo::setTransferType);
		funPoint(dto.getTokenNo(), vo::setToken);
		funPoint(dto.isTokenStatus(), vo::setTokenStatus);
		funPoint(dto.getTokenNoGeneratedTime(), vo::setTokenNoGeneratedTime);
		funPoint(dto.getTokenUsedTime(), vo::setTokenUsedTime);
		funPoint(dto.getSellerAadhaarNo(), vo::setSellerAadhaarNo);
		if(dto.getBuyerServiceType()!=null){
			funPoint(dto.getBuyerServiceType(), vo::setBuyerServices);
		}
		if(!StringUtils.isEmpty(dto.getBuyerAadhaarNo())){
			vo.setBuyerAadhaarNo(Long.parseLong(dto.getBuyerAadhaarNo()));
		}
		if(dto.getBuyerApplicantDetails()!=null){
        vo.setBuyerBasicDetails(applicantDeatilsMapper.convertEntity(dto.getBuyerApplicantDetails()));
		}
		if(dto.getSellerFinanceStatus()!=null && dto.getSellerFinanceStatus().equalsIgnoreCase(FinanceTowEnum.CONTINUEWITHFINANCE.toString())){
			 vo.setSellerFinancierType(dto.getSellerFinanceType());
		}
		
		
		return vo;
	}

	@Override
	public TrasnferOfOwnerShipDTO convertVO(TowVO vo) {

		TrasnferOfOwnerShipDTO dto = new TrasnferOfOwnerShipDTO();
		funPoint(vo.getSeller(), dto::setSeller);
		funPoint(vo.getBuyer(), dto::setBuyer);
		funPoint(vo.getTransferType(), dto::setTransferType);
		funPoint(vo.getToken(), dto::setTokenNo);
		funPoint(vo.isTokenStatus(), dto::setTokenStatus);
		funPoint(vo.getTokenNoGeneratedTime(), dto::setTokenNoGeneratedTime);
		funPoint(vo.getTokenUsedTime(), dto::setTokenUsedTime);
		funPoint(vo.getSellerAadhaarNo(), dto::setSellerAadhaarNo);
		
		
		return dto;
	}

}
