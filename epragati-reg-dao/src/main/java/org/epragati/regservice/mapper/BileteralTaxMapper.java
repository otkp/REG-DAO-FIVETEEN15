package org.epragati.regservice.mapper;


import org.epragati.common.mappers.BaseMapper;
import org.epragati.regservice.dto.BileteralTaxDTO;
import org.epragati.regservice.vo.BileteralTaxVO;
import org.springframework.stereotype.Component;

@Component
public class BileteralTaxMapper extends BaseMapper<BileteralTaxDTO, BileteralTaxVO>{


	@Override
	public BileteralTaxVO convertEntity(BileteralTaxDTO dto) {
		BileteralTaxVO vo = new BileteralTaxVO();
		funPoint(dto.getPurpose(), vo::setPurpose);
		funPoint(dto.getPrNo(), vo::setPrNo);
		funPoint(dto.getClassOfVehicle(), vo::setClassOfVehicle);
		funPoint(dto.getGvw(), vo::setGvw);
		funPoint(dto.getOwnerName(), vo::setOwnerName);
		funPoint(dto.getContactNo(), vo::setContactNo);
		funPoint(dto.getHomeTaxValidTo(), vo::setHomeTaxValidTo);
		funPoint(dto.getIcValidTo(), vo::setIcValidTo);
		funPoint(dto.getPermitNo(), vo::setPermitNo);
		funPoint(dto.getPermitIssuedBy(), vo::setPermitIssuedBy);
		funPoint(dto.getPermitValidFrom(), vo::setPermitValidFrom);
		funPoint(dto.getPermitValidTo(), vo::setPermitValidTo);
		funPoint(dto.getFcValidFrom(), vo::setFcValidFrom);
		funPoint(dto.getFcValidTo(), vo::setFcValidTo);
		funPoint(dto.getRecommendationLetterNo(), vo::setRecommendationLetterNo);
		funPoint(dto.getRecommendationLatterDate(), vo::setRecommendationLatterDate);
		funPoint(dto.getRlIssuedBy(), vo::setRlIssuedBy);
		funPoint(dto.getPaymentperoid(), vo::setPaymentperoid);
		funPoint(dto.getPaymentType(), vo::setPaymentType);
		funPoint(dto.getCspPuNo(), vo::setCspPuNo);
		funPoint(dto.getOwnerAddress(), vo::setOwnerAddress);
		funPoint(dto.getChassisNumber(), vo::setChassisNumber);
		funPoint(dto.getDistrict(), vo::setDistrict);
		funPoint(dto.isStatus(), vo::setStatus);
		funPoint(dto.getApplicationFee(), vo::setApplicationFee);
		funPoint(dto.getServiceFee(), vo::setServiceFee);
		funPoint(dto.getTax(), vo::setTax);
		funPoint(dto.getPenality(), vo::setPenality);
		funPoint(dto.getApprovedDate(), vo::setApprovedDate);
		funPoint(dto.getValidityTo(), vo::setValidityTo);
		funPoint(dto.getOfficeCode(), vo::setOfficeCode);
		funPoint(dto.getCovCode(), vo::setCovCode);
		funPoint(dto.getApplicationNo(), vo::setApplicationNo);
		return vo;
	}

	@Override
	public BileteralTaxDTO convertVO(BileteralTaxVO dto) {
		BileteralTaxDTO vo = new BileteralTaxDTO();
		funPoint(dto.getPurpose(), vo::setPurpose);
		funPoint(dto.getPrNo(), vo::setPrNo);
		funPoint(dto.getClassOfVehicle(), vo::setClassOfVehicle);
		funPoint(dto.getGvw(), vo::setGvw);
		funPoint(dto.getOwnerName(), vo::setOwnerName);
		funPoint(dto.getContactNo(), vo::setContactNo);
		funPoint(dto.getHomeTaxValidTo(), vo::setHomeTaxValidTo);
		funPoint(dto.getIcValidTo(), vo::setIcValidTo);
		funPoint(dto.getPermitNo(), vo::setPermitNo);
		funPoint(dto.getPermitIssuedBy(), vo::setPermitIssuedBy);
		funPoint(dto.getPermitValidFrom(), vo::setPermitValidFrom);
		funPoint(dto.getPermitValidTo(), vo::setPermitValidTo);
		funPoint(dto.getFcValidFrom(), vo::setFcValidFrom);
		funPoint(dto.getFcValidTo(), vo::setFcValidTo);
		funPoint(dto.getRecommendationLetterNo(), vo::setRecommendationLetterNo);
		funPoint(dto.getRecommendationLatterDate(), vo::setRecommendationLatterDate);
		funPoint(dto.getRlIssuedBy(), vo::setRlIssuedBy);
		funPoint(dto.getPaymentperoid(), vo::setPaymentperoid);
		funPoint(dto.getPaymentType(), vo::setPaymentType);
		funPoint(dto.getCspPuNo(), vo::setCspPuNo);
		funPoint(dto.getOwnerAddress(), vo::setOwnerAddress);
		funPoint(dto.getChassisNumber(), vo::setChassisNumber);
		funPoint(dto.getDistrict(), vo::setDistrict);
		funPoint(dto.isStatus(), vo::setStatus);
		funPoint(dto.getApplicationFee(), vo::setApplicationFee);
		funPoint(dto.getServiceFee(), vo::setServiceFee);
		funPoint(dto.getTax(), vo::setTax);
		funPoint(dto.getPenality(), vo::setPenality);
		return vo;
	}
	
	
}
