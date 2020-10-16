package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.RegistrationDetailsDTO;
import org.epragati.master.vo.RegistrationDetailsVO;
import org.epragati.payment.mapper.ApplicantDeatilsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Component
public class RegistrationMapper extends BaseMapper<RegistrationDetailsDTO, RegistrationDetailsVO> {


	@Autowired
	private ApplicantDeatilsMapper applicantDetailsMapper;

	@Autowired
	private ActionDetailsMapper actionDetailsMapper;
	@Autowired
	private FinanceDetailsMapper financeDetailsMapper;

	@Autowired
	private VahanDetailsMapper vahanDetailsMapper;

	@Autowired
	private PanDetailsMapper panDetailsMapper;

	@Autowired
	private InsuranceDetailsMapper insuranceMapper;

	@Autowired
	private InvoiceDetailsMapper invoiceDetailsMapper;

	@Autowired
	private OfficeMapper officeDetailsMapper;

	@Autowired
	private DealerDetailsMapper dealerDetailsMapper;

	@Autowired
	private RejectionHistoryMapper rejectionHistoryMapper;
	
	@Autowired
	private RegistrationValidityMapper registrationValidityMapper;

	@Override
	public RegistrationDetailsVO convertEntity(RegistrationDetailsDTO dto) {

		RegistrationDetailsVO registrationDetailsVO = new RegistrationDetailsVO();
		if (dto.getApplicantDetails() != null) {
			registrationDetailsVO.setApplicantDetails(applicantDetailsMapper.convertEntity(dto.getApplicantDetails()));
		}

		if (dto.getActionDetails() != null) {
			registrationDetailsVO.setActionDetails(actionDetailsMapper.convertEntity(dto.getActionDetails()));
		}

		funPoint(dto.getApplicationNo(), registrationDetailsVO::setApplicationNo);
		funPoint(dto.getApplicationStatus(), registrationDetailsVO::setApplicationStatus);
		funPoint(dto.getIteration(), registrationDetailsVO::setIteration);
		funPoint(dto.getOwnerType(), registrationDetailsVO::setOwnerType);
		funPoint(dto.getIsTrailer(), registrationDetailsVO::setIsTrailer);
		//funPoint(dto.getAadharNo(), registrationDetailsVO::setAadharNo);
		funPoint(dto.getVehicleType(), registrationDetailsVO::setVehicleType);
		funPoint(dto.getClassOfVehicle(), registrationDetailsVO::setClassOfVehicle);
		funPoint(dto.getTaxType(), registrationDetailsVO::setTaxType);
		funPoint(dto.getTaxAmount(), registrationDetailsVO::setTaxAmount);
		funPoint(dto.getTaxvalidity(), registrationDetailsVO::setTaxvalidity);
		funPoint(dto.getCesFee(), registrationDetailsVO::setCesFee);
		funPoint(dto.getCesValidity(), registrationDetailsVO::setCesValidity);
		funPoint(dto.getIsFinancier(), registrationDetailsVO::setIsFinancier);
		if (dto.getFinanceDetails() != null) {
			registrationDetailsVO.setFinanceDetails(financeDetailsMapper.convertEntity(dto.getFinanceDetails()));
		}

		if (dto.getVahanDetails() != null) {
			registrationDetailsVO.setVahanDetails(vahanDetailsMapper.convertEntity(dto.getVahanDetails()));
		}

		funPoint(dto.getTrNo(), registrationDetailsVO::setTrNo);
		funPoint(dto.getStageNo(), registrationDetailsVO::setStageNo);
		funPoint(dto.getPrNo(), registrationDetailsVO::setPrNo);

		if (dto.getPanDetails() != null) {

			registrationDetailsVO.setPanDetails(panDetailsMapper.convertEntity(dto.getPanDetails()));
		}

		if (dto.getInsuranceDetails() != null) {

			registrationDetailsVO.setInsuranceDetails(insuranceMapper.convertEntity(dto.getInsuranceDetails()));
		}

		if (dto.getInvoiceDetails() != null) {

			registrationDetailsVO.setInvoiceDetails(invoiceDetailsMapper.convertEntity(dto.getInvoiceDetails()));
		}

		if (dto.getOfficeDetails() != null) {

			registrationDetailsVO.setOfficeDetails(officeDetailsMapper.convertEntity(dto.getOfficeDetails()));
		}

		if (dto.getDealerDetails() != null) {

			registrationDetailsVO.setDealerDetails(dealerDetailsMapper.convertEntity(dto.getDealerDetails()));
		}

		funPoint(dto.getSpecialNumberRequired(), registrationDetailsVO::setSpecialNumberRequired);
		
		if(dto.getRegistrationValidity()!=null){
			registrationDetailsVO.setRegistrationValidity(registrationValidityMapper.convertEntity(dto.getRegistrationValidity()));
		}
		funPoint(dto.isCardPrinted(), registrationDetailsVO::setCardPrinted);

		return registrationDetailsVO;

	}
}
