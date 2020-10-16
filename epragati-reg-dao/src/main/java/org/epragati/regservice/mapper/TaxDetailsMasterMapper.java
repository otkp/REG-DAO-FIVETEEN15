package org.epragati.regservice.mapper;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.TaxComponentDTO;
import org.epragati.master.dto.TaxDetailsDTO;
import org.springframework.stereotype.Component;


@Component
public class TaxDetailsMasterMapper extends BaseMapper<TaxDetailsDTO, TaxDetailsMasterVO> {


	@Override
	public TaxDetailsMasterVO convertEntity(TaxDetailsDTO dto) {
		TaxDetailsMasterVO vo = new TaxDetailsMasterVO();
		funPoint(dto.getApplicationNo(), vo::setApplicationNo);
		funPoint(dto.getTrNo(), vo::setTrNo);
		funPoint(dto.getPermitType(), vo::setPermitType);
		funPoint(dto.getPaymentPeriod(), vo::setPaymentPeriod);
		funPoint(dto.getTaxPeriodFrom(), vo::setTaxPeriodFrom);
		funPoint(dto.getTaxPeriodEnd(), vo::setTaxPeriodEnd);
		funPoint(dto.getTaxAmount(), vo::setTaxAmount);
		funPoint(dto.getCessFee(), vo::setCessFee);
		funPoint(dto.getCessPeriodEnd(), vo::setCessPeriodEnd);
		funPoint(dto.getCessPeriodFrom(), vo::setCessPeriodFrom);
		funPoint(dto.getTaxPaidDate(), vo::setTaxPaidDate);
		funPoint(dto.getClassOfVehicle(), vo::setClassOfVehicle);
		funPoint(dto.getSecondVehicleTaxPaid(), vo::setSecondVehicleTaxPaid);
		funPoint(dto.getSecondVehicleDiffTaxPaid(), vo::setSecondVehicleDiffTaxPaid);
		funPoint(dto.getInvoiceValue(), vo::setInvoiceValue);
		funPoint(dto.getGreenTaxAmount(), vo::setGreenTaxAmount);
		funPoint(dto.getGreenTaxPeriodEnd(), vo::setGreenTaxPeriodEnd);
		funPoint(dto.getGreenTaxPeriodFrom(), vo::setGreenTaxPeriodFrom);
		funPoint(dto.getPayTaxType(), vo::setPayTaxType);
		funPoint(dto.getTotalAmount(), vo::setTaxAmount);
		funPoint(dto.getServiceFee(), vo::setServiceFee);
		funPoint(dto.getRemarks(), vo::setRemarks);
		funPoint(dto.getStateCode(), vo::setStateCode);
		funPoint(dto.getOfficeCode(), vo::setOfficeCode);
	
		return vo;
		
	
	}
	
	
	public TaxDetailsMasterVO converttaxDetails(List<TaxDetailsDTO> dto,List<String> taxTypes) {
		
		TaxDetailsMasterVO vo = new TaxDetailsMasterVO();
		vo = this.convertEntity(dto.stream().findFirst().get());
		LocalDate taxValidity = null ;
		for(TaxDetailsDTO tax : dto) {
		for (Map<String, TaxComponentDTO> map : tax.getTaxDetails()) {

			for (Entry<String, TaxComponentDTO> entry : map.entrySet()) {
				if (taxTypes.stream().anyMatch(key -> key.equalsIgnoreCase(entry.getKey()))) {
					if(taxValidity != null && !taxValidity.equals(entry.getValue().getValidityTo())) {
						break;
					}
					taxValidity = entry.getValue().getValidityTo();
					//vo.setCurrentQuaterTax(entry.getValue());
					if(vo.getCurrentQuaterTax() == null) {
						vo.setCurrentQuaterTax(entry.getValue());
					}else {
						vo.setDiffTax(vo.getCurrentQuaterTax());
						vo.setCurrentQuaterTax(entry.getValue());
					}
				}
			}
		}
		}
		return vo;
		
	}

}
