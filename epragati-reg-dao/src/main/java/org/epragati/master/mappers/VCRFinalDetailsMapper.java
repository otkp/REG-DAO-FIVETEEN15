package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.StateDTO;
import org.epragati.master.vo.ApplicantAddressVO;
import org.epragati.master.vo.ApplicantDetailsVO;
import org.epragati.master.vo.InsuranceDetailsVO;
import org.epragati.master.vo.InvoiceDetailsVO;
import org.epragati.master.vo.RegistrationDetailsVO;
import org.epragati.master.vo.StateVO;
import org.epragati.master.vo.VahanDetailsVO;
import org.epragati.vcrImage.dto.OwnerDetailsDto;
import org.epragati.vcrImage.dto.RegistrationVcr;
import org.epragati.vcrImage.dto.ValidityDetailsDTO;
import org.epragati.vcrImage.dto.VcrFinalServiceDTO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author krishnarjun.pampana
 *
 */

@Component
public class VCRFinalDetailsMapper extends BaseMapper<VcrFinalServiceDTO, RegistrationDetailsVO>  {

	@Override
	public RegistrationDetailsVO convertEntity(VcrFinalServiceDTO dto) {
		// TODO Auto-generated method stub
		if(dto!=null){
			RegistrationDetailsVO regVo = new RegistrationDetailsVO();
			StateVO state = new StateVO();
		if(dto.getRegistration()!=null){
			funPoint(dto.getRegistration().getRegNo(),regVo::setPrNo);	
			funPoint(dto.getRegistration().getTrNo(),regVo::setTrNo);
			regVo.setVehicleType("N");
			if(dto.getRegistration().isTransport()){
				regVo.setVehicleType("T");
			}
			if(dto.getRegistration().getState()!=null){
				StateDTO stateDto = dto.getRegistration().getState();
				state.setStateId(stateDto.getStateId());
				state.setStateName(stateDto.getStateName());
				state.setCountryId(stateDto.getCountryId());
			}
			
			if(dto.getRegistration().getInvoiceAmmount()!=null){
				InvoiceDetailsVO invoice = new InvoiceDetailsVO();
				funPoint(dto.getRegistration().getInvoiceAmmount().doubleValue(),invoice::setInvoiceValue);	
				regVo.setInvoiceDetails(invoice);
			}
			RegistrationVcr vcr = dto.getRegistration();
			VahanDetailsVO vahanDetails = new VahanDetailsVO();
			funPoint(vcr.getChassisNumber(), vahanDetails::setChassisNumber);
			funPoint(vcr.getEngineNumber(), vahanDetails::setEngineNumber);
			funPoint(vcr.getUlw(), vahanDetails::setUnladenWeight);
			if(vcr.getSeatingCapacity()!=null){
				funPoint(vcr.getSeatingCapacity().toString(), vahanDetails::setSeatingCapacity);
			}
			funPoint(vcr.getFuelDesc(), vahanDetails::setFuelDesc);
			funPoint(vcr.getGvwc(), vahanDetails::setGvw);
			funPoint(vcr.getOwnerType(), regVo::setOwnerType);
			funPoint(vcr.getMakersModel(), vahanDetails::setMakersModel);
			regVo.setVahanDetails(vahanDetails);
		}
		if(dto.getOwnerDetails()!=null){
			OwnerDetailsDto ownerDto =  dto.getOwnerDetails();
			ApplicantDetailsVO appVo = new ApplicantDetailsVO();
			funPoint(ownerDto.getFullName(), appVo::setFirstName);
			funPoint(ownerDto.getMobileNo(), appVo::setMobile);
			if(ownerDto.getAddress()!=null){
				ApplicantAddressVO vo = new ApplicantAddressVO();
				funPoint(ownerDto.getAddress(), vo::setDoorNo);
				
				vo.setState(state);
				appVo.setPermanantAddress(vo);
			}	
			regVo.setApplicantDetails(appVo);
		}
		if(dto.getValidityDetails()!=null){
			ValidityDetailsDTO valDto = dto.getValidityDetails();
			InsuranceDetailsVO insuranceVo = new InsuranceDetailsVO();
			funPoint(valDto.getIcValidUpto(), insuranceVo::setValidTill);
			regVo.setInsuranceDetails(insuranceVo);
		}
		if(dto.getRegistration()!=null && dto.getRegistration().getClasssOfVehicle()!=null){
			funPoint(dto.getRegistration().getClasssOfVehicle().getCovcode(), regVo::setClassOfVehicle);
		}
	
		
		
		return regVo;
		}	
		return null;
	}



}

