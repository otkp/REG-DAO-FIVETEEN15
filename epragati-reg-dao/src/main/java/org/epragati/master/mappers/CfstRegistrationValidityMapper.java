package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.RegistrationValidityDTO;
import org.epragati.master.vo.CfstRegistrationValidityVO;
import org.springframework.stereotype.Component;

@Component
public class CfstRegistrationValidityMapper extends BaseMapper<RegistrationValidityDTO, CfstRegistrationValidityVO> {

	@Override
	public CfstRegistrationValidityVO convertEntity(RegistrationValidityDTO dto) {
		// TODO Auto-generated method stub

		CfstRegistrationValidityVO registrationValidityVO = new CfstRegistrationValidityVO();
		funPoint(dto.getCessValidity(), registrationValidityVO::setCessValidity);
		funPoint(dto.getGreenTaxValidity(), registrationValidityVO::setGreenTaxValidity);
		
		funPoint(dto.getQuarterlyTaxValidity(), registrationValidityVO::setQuarterlyTaxValidity);
		funPoint(dto.getRegistrationValidity(), registrationValidityVO::setRegistrationValidity);
		funPoint(dto.getFinanceAgreementDate(), registrationValidityVO::setFinanceAgreementDate);
		funPoint(dto.getFcValidity(), registrationValidityVO::setFcValidity);
		
		funPoint(dto.getPrGeneratedDate(), registrationValidityVO::setPrGeneratedDate);
		funPoint(dto.getTrValidity(), registrationValidityVO::setTrValidity);
		funPoint(dto.getTrGeneratedDate(), registrationValidityVO::setTrGeneratedDate);
		funPoint(dto.getTaxValidity(), registrationValidityVO::setTaxValidity);
		
		return registrationValidityVO;
	}

}
