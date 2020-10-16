package org.epragati.vcrImage.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.regservice.mapper.ActionDetailMapper;
import org.epragati.vcr.vo.VoluntaryTaxVO;
import org.epragati.vcrImage.dto.VoluntaryTaxDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VoluntaryTaxMapper extends BaseMapper<VoluntaryTaxDTO, VoluntaryTaxVO>{

	@Autowired
	private ActionDetailMapper actionDetailMapper;
	@Override
	public VoluntaryTaxVO convertEntity(VoluntaryTaxDTO dto) {
		VoluntaryTaxVO vo = new VoluntaryTaxVO();
		funPoint(dto.getApplicationNo(), vo::setApplicationNo);
		funPoint(dto.getRegNo(), vo::setRegNo);
		funPoint(dto.getTrNo(), vo::setTrNo);
		funPoint(dto.getChassisNo(), vo::setChassisNo);
		funPoint(dto.getClassOfVehicle(), vo::setClassOfVehicle);
		funPoint(dto.getClassOfVehicleDesc(), vo::setClassOfVehicleDesc);
		funPoint(dto.getSeatingCapacity(), vo::setSeatingCapacity);
		funPoint(dto.getGvw(), vo::setGvw);
		funPoint(dto.getUlw(), vo::setUlw);
		funPoint(dto.getOwnerName(), vo::setOwnerName);
		funPoint(dto.getState(), vo::setState);
		funPoint(dto.getAddress(), vo::setAddress);
		funPoint(dto.getTaxType(), vo::setTaxType);
		funPoint(dto.getTaxvalidUpto(), vo::setTaxvalidUpto);
		funPoint(dto.getPermitNo(), vo::setPermitNo);
		funPoint(dto.getPermitValidUpTo(), vo::setPermitValidUpTo);
		funPoint(dto.getRemarks(), vo::setRemarks);
		funPoint(dto.getGoodsDescription(), vo::setGoodsDescription);
		funPoint(dto.getNoofPassengers(), vo::setNoofPassengers);
		funPoint(dto.getHomeStateUnregister(), vo::setHomeStateUnregister);
		funPoint(dto.getOtherStateUnregister(), vo::setOtherStateUnregister);
		funPoint(dto.getOtherStateRegister(), vo::setOtherStateRegister);
		funPoint(dto.getFuelDesc(), vo::setFuelDesc);
		funPoint(dto.getOwnerType(), vo::setOwnerType);
		funPoint(dto.getTaxCalculationDateForLifeTax(), vo::setTaxCalculationDateForLifeTax);
		funPoint(dto.getPrGeneratedDate(), vo::setPrGeneratedDate);
		funPoint(dto.getVehicleType(), vo::setVehicleType);
		funPoint(dto.getGatewayType(), vo::setGatewayType);
		funPoint(dto.getMakersModel(), vo::setMakersModel);
		funPoint(dto.getInvoiceValue(), vo::setInvoiceValue);
		funPoint(dto.getDateOfCompletion(), vo::setDateOfCompletion);
		funPoint(dto.isNocIssued(), vo::setNocIssued);
		funPoint(dto.isWithTP(), vo::setWithTP);
		funPoint(dto.getNocDate(), vo::setNocDate);
		funPoint(dto.getPermitCode(), vo::setPermitCode);
		funPoint(dto.getFirstVehicle(), vo::setFirstVehicle);
		if(dto.getActions()!= null && !dto.getActions().isEmpty()) {
			vo.setActions(actionDetailMapper.convertEntity(dto.getActions()));
		}
		funPoint(dto.getPaidDate(), vo::setPaidDate);
		funPoint(dto.getTax(), vo::setTax);
		funPoint(dto.getTaxvalidUpto(), vo::setTaxvalidUpto);
		funPoint(dto.getPenalty(), vo::setPenalty);
		funPoint(dto.getTaxArrears(), vo::setTaxArrears);
		funPoint(dto.getPenaltyArrears(), vo::setPenaltyArrears);
		funPoint(dto.getServiceFee(), vo::setServiceFee);
		funPoint(dto.getTotalAmount(), vo::setTotalAmount);
		funPoint(dto.getFcValidity(), vo::setFcValidity);
		funPoint(dto.getOfficeCode(), vo::setOfficeCode);
		funPoint(dto.getUserId(), vo::setUserId);
		funPoint(dto.isVehicleHaveAitp(), vo::setVehicleHaveAitp);
		funPoint(dto.getAllowNextQuarterTax(), vo::setAllowNextQuarterTax);
		funPoint(dto.getTaxvalidFrom(), vo::setTaxvalidFrom);
		return vo;
	}
	@Override
	public VoluntaryTaxDTO convertVO(VoluntaryTaxVO dto) {
		VoluntaryTaxDTO vo = new VoluntaryTaxDTO();
		funPoint(dto.getApplicationNo(), vo::setApplicationNo);
		funPoint(dto.getRegNo(), vo::setRegNo);
		funPoint(dto.getTrNo(), vo::setTrNo);
		funPoint(dto.getChassisNo(), vo::setChassisNo);
		funPoint(dto.getClassOfVehicle(), vo::setClassOfVehicle);
		funPoint(dto.getClassOfVehicleDesc(), vo::setClassOfVehicleDesc);
		funPoint(dto.getSeatingCapacity(), vo::setSeatingCapacity);
		funPoint(dto.getGvw(), vo::setGvw);
		funPoint(dto.getUlw(), vo::setUlw);
		funPoint(dto.getOwnerName(), vo::setOwnerName);
		funPoint(dto.getState(), vo::setState);
		funPoint(dto.getAddress(), vo::setAddress);
		funPoint(dto.getTaxType(), vo::setTaxType);
		funPoint(dto.getTaxvalidUpto(), vo::setTaxvalidUpto);
		funPoint(dto.getPermitNo(), vo::setPermitNo);
		funPoint(dto.getPermitValidUpTo(), vo::setPermitValidUpTo);
		funPoint(dto.getRemarks(), vo::setRemarks);
		funPoint(dto.getGoodsDescription(), vo::setGoodsDescription);
		funPoint(dto.getNoofPassengers(), vo::setNoofPassengers);
		funPoint(dto.getHomeStateUnregister(), vo::setHomeStateUnregister);
		funPoint(dto.getOtherStateUnregister(), vo::setOtherStateUnregister);
		funPoint(dto.getOtherStateRegister(), vo::setOtherStateRegister);
		funPoint(dto.getFuelDesc(), vo::setFuelDesc);
		funPoint(dto.getOwnerType(), vo::setOwnerType);
		funPoint(dto.getTaxCalculationDateForLifeTax(), vo::setTaxCalculationDateForLifeTax);
		funPoint(dto.getPrGeneratedDate(), vo::setPrGeneratedDate);
		funPoint(dto.getVehicleType(), vo::setVehicleType);
		funPoint(dto.getGatewayType(), vo::setGatewayType);
		funPoint(dto.getMakersModel(), vo::setMakersModel);
		funPoint(dto.getInvoiceValue(), vo::setInvoiceValue);
		funPoint(dto.getDateOfCompletion(), vo::setDateOfCompletion);
		funPoint(dto.isNocIssued(), vo::setNocIssued);
		funPoint(dto.isWithTP(), vo::setWithTP);
		funPoint(dto.getFirstVehicle(), vo::setFirstVehicle);
		if(dto.getActions()!= null && !dto.getActions().isEmpty()) {
			vo.setActions(actionDetailMapper.convertVO(dto.getActions()));
		}
		funPoint(dto.getPaidDate(), vo::setPaidDate);
		funPoint(dto.getTax(), vo::setTax);
		funPoint(dto.getTaxvalidUpto(), vo::setTaxvalidUpto);
		funPoint(dto.getPenalty(), vo::setPenalty);
		funPoint(dto.getTaxArrears(), vo::setTaxArrears);
		funPoint(dto.getPenaltyArrears(), vo::setPenaltyArrears);
		funPoint(dto.getServiceFee(), vo::setServiceFee);
		funPoint(dto.getTotalAmount(), vo::setTotalAmount);
		funPoint(dto.getFcValidity(), vo::setFcValidity);
		funPoint(dto.getOfficeCode(), vo::setOfficeCode);
		funPoint(dto.getUserId(), vo::setUserId);
		funPoint(dto.isVehicleHaveAitp(), vo::setVehicleHaveAitp);
		funPoint(dto.getAllowNextQuarterTax(), vo::setAllowNextQuarterTax);
		funPoint(dto.getTaxvalidFrom(), vo::setTaxvalidFrom);
		return vo;
	}
}
