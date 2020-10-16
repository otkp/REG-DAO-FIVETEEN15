package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.RegistrationValidityDTO;
import org.epragati.master.vo.RegistrationValidityVO;
import org.springframework.stereotype.Component;

@Component
public class RegistrationValidityMapper extends BaseMapper<RegistrationValidityDTO, RegistrationValidityVO> {

	@Override
	public RegistrationValidityVO convertEntity(RegistrationValidityDTO dto) {
		// TODO Auto-generated method stub

		RegistrationValidityVO registrationValidityVO = new RegistrationValidityVO();
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

	@Override
	public RegistrationValidityDTO convertVO(RegistrationValidityVO vo) {
		RegistrationValidityDTO registrationValidityDTO = new RegistrationValidityDTO();
		funPoint(vo.getCessValidity(), registrationValidityDTO::setCessValidity);
		funPoint(vo.getGreenTaxValidity(), registrationValidityDTO::setGreenTaxValidity);
	
		funPoint(vo.getQuarterlyTaxValidity(), registrationValidityDTO::setQuarterlyTaxValidity);
		funPoint(vo.getRegistrationValidity(), registrationValidityDTO::setRegistrationValidity);
		return registrationValidityDTO;

	}

}
