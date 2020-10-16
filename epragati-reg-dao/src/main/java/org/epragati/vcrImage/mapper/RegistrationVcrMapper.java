package org.epragati.vcrImage.mapper;

import org.apache.commons.lang3.StringUtils;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.mappers.MasterCovMapper;
import org.epragati.master.mappers.StateMapper;
import org.epragati.master.vo.MasterCovVO;
import org.epragati.payment.report.vo.VCRNonPaymentDetailsVO;
import org.epragati.vcr.vo.RegistrationVcrVo;
import org.epragati.vcrImage.dto.RegistrationVcr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistrationVcrMapper extends BaseMapper<RegistrationVcr, RegistrationVcrVo> {

	@Autowired
	private StateMapper stateMapper;
	@Autowired
	private MasterCovMapper masterCovMapper;

	@Override
	public RegistrationVcrVo convertEntity(RegistrationVcr dto) {
		RegistrationVcrVo registrationVo = new RegistrationVcrVo();

		funPoint(dto.isUnregisteredVehicle(), registrationVo::setUnregisteredVehicle);
		funPoint(dto.isOtherState(), registrationVo::setOtherState);
		funPoint(dto.isEngineNoAndChessisNoNotAvailable(), registrationVo::setEngineNoAndChessisNoNotAvailable);
		funPoint(dto.isTransport(), registrationVo::setTransport);
		registrationVo.setTrValidity(dto.getTrValidity());
		funPoint(dto.getInvoiceAmmount(), registrationVo::setInvoiceAmmount);
		funPoint(dto.getRegNo(), registrationVo::setRegNo);
		if(dto.getState()!=null) {
			registrationVo.setState(stateMapper.convertEntity(dto.getState()));
		}
		if(dto.getClasssOfVehicle()!=null) {
			registrationVo.setClasssOfVehicle(masterCovMapper.convertEntity(dto.getClasssOfVehicle()));
		}
		
		funPoint(dto.getIncomingOrOutgoing(), registrationVo::setIncomingOrOutgoing);
		funPoint(dto.getChassisNumber(), registrationVo::setChassisNumber);
		funPoint(dto.getEngineNumber(), registrationVo::setEngineNumber);
		funPoint(dto.getSeatingCapacity(), registrationVo::setSeatingCapacity);
		funPoint(dto.getGvwc(), registrationVo::setGvw);
		funPoint(dto.getUlw(), registrationVo::setUlw);
		funPoint(dto.getRegApplicationNo(), registrationVo::setRegApplicationNo);
		funPoint(dto.isOtherStateRegister(), registrationVo::setOtherStateRegister);
		funPoint(dto.isOtherStateUnregister(), registrationVo::setOtherStateUnregister);
		funPoint(dto.getOwnerType(), registrationVo::setOwnerType);
		funPoint(dto.getFuelDesc(), registrationVo::setFuelDesc);
		funPoint(dto.getTaxCalculationDateForLifeTax(), registrationVo::setTaxCalculationDateForLifeTax);
		funPoint(dto.getPrGeneratedDate(), registrationVo::setPrGeneratedDate);
		funPoint(dto.getTrNo(), registrationVo::setTrNo);
		funPoint(dto.getFirstVehicle(), registrationVo::setFirstVehicle);
		funPoint(dto.getBodyTypeDesc(), registrationVo::setBodyTypeDesc);
		funPoint(dto.getNocIssued(),registrationVo::setNocIssued);
		funPoint(dto.getTaxCalculationDateForQuarterlyTax(),registrationVo::setTaxCalculationDateForQuarterlyTax);
		funPoint(dto.getDateOfCompletion(),registrationVo::setDateOfCompletion);
		
		return registrationVo;
	}

	public RegistrationVcrVo convertLimited(RegistrationVcr dto) {
		RegistrationVcrVo registrationVo = new RegistrationVcrVo();
		MasterCovVO masterCovVO = new MasterCovVO();
		if(dto.getClasssOfVehicle()!=null &&dto.getClasssOfVehicle().getCovdescription()!=null ) {
		masterCovVO.setCovdescription(dto.getClasssOfVehicle().getCovdescription());
		}
		registrationVo.setClasssOfVehicle(masterCovVO);
		if (StringUtils.isNotEmpty(dto.getRegNo())) {
			funPoint(dto.getRegNo(), registrationVo::setRegNo);
		} else if (StringUtils.isNotEmpty(dto.getTrNo())) {
			funPoint(dto.getTrNo(), registrationVo::setRegNo);
		} else {
			funPoint(dto.getChassisNumber(), registrationVo::setRegNo);
		}
		return registrationVo;
	}

	@Override
	public RegistrationVcr convertVO(RegistrationVcrVo vo) {
		RegistrationVcr registrationDto = new RegistrationVcr();

		funPoint(vo.isUnregisteredVehicle(), registrationDto::setUnregisteredVehicle);
		funPoint(vo.isOtherState(), registrationDto::setOtherState);
		funPoint(vo.isEngineNoAndChessisNoNotAvailable(), registrationDto::setEngineNoAndChessisNoNotAvailable);
		funPoint(vo.isTransport(), registrationDto::setTransport);
		registrationDto.setTrValidity(vo.getTrValidity());
		funPoint(vo.getInvoiceAmmount(), registrationDto::setInvoiceAmmount);
		funPoint(vo.getRegNo(), registrationDto::setRegNo);
		registrationDto.setState(stateMapper.convertVO(vo.getState()));
		registrationDto.setClasssOfVehicle(masterCovMapper.convertVO(vo.getClasssOfVehicle()));
		funPoint(vo.getIncomingOrOutgoing(), registrationDto::setIncomingOrOutgoing);
		funPoint(vo.getChassisNumber(), registrationDto::setChassisNumber);
		funPoint(vo.getEngineNumber(), registrationDto::setEngineNumber);
		funPoint(vo.getSeatingCapacity(), registrationDto::setSeatingCapacity);
		funPoint(vo.getGvw(), registrationDto::setGvwc);
		funPoint(vo.getUlw(), registrationDto::setUlw);
		funPoint(vo.getRegApplicationNo(), registrationDto::setRegApplicationNo);
		funPoint(vo.isOtherStateRegister(), registrationDto::setOtherStateRegister);
		funPoint(vo.isOtherStateUnregister(), registrationDto::setOtherStateUnregister);
		funPoint(vo.getOwnerType(), registrationDto::setOwnerType);
		funPoint(vo.getFuelDesc(), registrationDto::setFuelDesc);
		funPoint(vo.getTaxCalculationDateForLifeTax(), registrationDto::setTaxCalculationDateForLifeTax);
		funPoint(vo.getPrGeneratedDate(), registrationDto::setPrGeneratedDate);
		funPoint(vo.getTrNo(), registrationDto::setTrNo);
		funPoint(vo.getMakersModel(), registrationDto::setMakersModel);
		funPoint(vo.getFirstVehicle(), registrationDto::setFirstVehicle);
		funPoint(vo.getBodyTypeDesc(), registrationDto::setBodyTypeDesc);
		funPoint(vo.isNocIssued(),registrationDto::setNocIssued);
		funPoint(vo.getTaxCalculationDateForQuarterlyTax(),registrationDto::setTaxCalculationDateForQuarterlyTax);
		funPoint(vo.getDateOfCompletion(),registrationDto::setDateOfCompletion);
		return registrationDto;
	}

	
	public VCRNonPaymentDetailsVO convertVcrNonPaymentReg(VCRNonPaymentDetailsVO vCRNonPaymentDetailsVO,
			RegistrationVcr registrationVcr) {
		funPoint(registrationVcr.getRegNo(), vCRNonPaymentDetailsVO::setPrNo);
		funPoint(registrationVcr.getTrNo(), vCRNonPaymentDetailsVO::setTrNo);
		funPoint(registrationVcr.getRegApplicationNo(), vCRNonPaymentDetailsVO::setRegApplicationNo);
		if(registrationVcr.getClasssOfVehicle()!=null){
			masterCovMapper.convertVcrCov(vCRNonPaymentDetailsVO,registrationVcr.getClasssOfVehicle());
		}
		return vCRNonPaymentDetailsVO;
	}
}
