package org.epragati.master.mappers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.epragati.rta.reports.vo.RegDtlsForMiningVO;
import org.apache.commons.lang3.StringUtils;
import org.epragati.aadhaar.AadhaarRequestVO;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.constants.OwnerTypeEnum;
import org.epragati.dispatcher.mapper.DispatcherMapper;
import org.epragati.exception.BadRequestException;
import org.epragati.hsrp.vo.DataVO;
import org.epragati.master.dao.FcDetailsDAO;
import org.epragati.master.dao.MasterPayperiodDAO;
import org.epragati.master.dao.OfficeDAO;
import org.epragati.master.dao.RegServiceDAO;
import org.epragati.master.dao.UserDAO;
import org.epragati.master.dto.ApplicantDetailsDTO;
import org.epragati.master.dto.FcDetailsDTO;
import org.epragati.master.dto.OfficeDTO;
import org.epragati.master.dto.RegistrationDetailsDTO;
import org.epragati.master.dto.StagingRegistrationDetailsDTO;
import org.epragati.master.dto.TaxDetailsDTO;
import org.epragati.master.dto.TrGeneratedReportDTO;
import org.epragati.master.dto.VahanDetailsDTO;
import org.epragati.master.vo.ApplicantDetailsVO;
import org.epragati.master.vo.ContactVO;
import org.epragati.master.vo.FinanceDetailsVO;
import org.epragati.master.vo.FinanceSeedDetailsVO;
import org.epragati.master.vo.InvoiceDetailsVO;
import org.epragati.master.vo.OfficeVO;
import org.epragati.master.vo.RegistrationDetailsVO;
import org.epragati.master.vo.StagingRegistrationDetailsVO;
import org.epragati.master.vo.VahanDetailsVO;
import org.epragati.payment.mapper.ApplicantDeatilsMapper;
import org.epragati.permits.dto.PermitDetailsDTO;
import org.epragati.regservice.dto.RegServiceDTO;
import org.epragati.regservice.mapper.NOCDetailsMapper;
import org.epragati.regservice.mapper.PUCDetailsMapper;
import org.epragati.regservice.mapper.TheftVehcileDetailsMapper;
import org.epragati.regservice.vo.ApplicationSearchVO;
import org.epragati.regservice.vo.CitizenApplicationSearchResponceVO;
import org.epragati.regservice.vo.RegServiceVO;
import org.epragati.rta.reports.vo.CitizenSearchReportVO;
import org.epragati.util.DateConverters;
import org.epragati.util.StatusRegistration;
import org.epragati.util.payment.ServiceEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class RegistrationDetailsMapper<T extends StagingRegistrationDetailsDTO>
		extends BaseMapper<StagingRegistrationDetailsDTO, RegistrationDetailsVO> {

	private static final Logger logger = LoggerFactory.getLogger(RegistrationDetailsMapper.class);

	@Autowired
	private RegServiceDAO regServiceDAO;
	
	@Autowired
	private ApplicantDeatilsMapper applicantDetailsMapper;

	@Autowired
	private DispatcherMapper dispatcherMapper;

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
	private FlowMapper flowMapper;

	@Autowired
	private OfficeDAO officeDAO;

	@Autowired
	private UserDAO userDAO;

	@Autowired
	private RegistrationValidityMapper registrationValidityMapper;

	@Autowired
	private PermitDetailsMapper permitDetailsMapper;

	@Autowired
	private RegVehicleDetailsMapper vehicleDetailsMapper;

	@Autowired
	private FcDetailsDAO fcDetailsDAO;

	@Autowired
	private FcDetailsMapper fcDetailsMapper;

	@Autowired
	private MasterPayperiodDAO masterPayperiodDAO;

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private PUCDetailsMapper pUCDetailsMapper;

	@Autowired
	private NOCDetailsMapper nocDetailsMapper;

	@Autowired
	private ContactMapper contactMapper;

	@Autowired
	private TheftVehcileDetailsMapper theftMapper;

	@Autowired
	private ApplicantAddressMapper applicantAddressMapper;

	@Autowired
	private ClassOfVehiclesLogMapper classOfVehiclesLogMapper;

	@Override
	public RegistrationDetailsVO convertEntity(StagingRegistrationDetailsDTO dto) {

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
		funPoint(dto.getVehicleType(), registrationDetailsVO::setVehicleType);
		funPoint(dto.getClassOfVehicle(), registrationDetailsVO::setClassOfVehicle);
		funPoint(dto.getClassOfVehicleDesc(), registrationDetailsVO::setClassOfVehicleDesc);
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
		funPoint(dto.getInsuranceType(), registrationDetailsVO::setInsuranceType);
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
		funPoint(dto.getIsAvailablePresentAddrsProof(), registrationDetailsVO::setIsAvailablePresentAddrsProof);
		funPoint(dto.getPresentAddrsProofBelongsTo(), registrationDetailsVO::setPresentAddrsProofBelongsTo);
		funPoint(dto.getNameOfPresentAddrsProofBelongsTo(), registrationDetailsVO::setNameOfPresentAddrsProofBelongsTo);

		if (dto.getFlowDetails() != null) {
			registrationDetailsVO.setFlowDetails(flowMapper.convertEntity(dto.getFlowDetails()));
		}
		if (dto.getFlowDetailsLog() != null) {
			registrationDetailsVO.setFlowDetailsLog(flowMapper.convertEntity(dto.getFlowDetailsLog()));
		}

		funPoint(dto.getIsPanRequired(), registrationDetailsVO::setIsPanRequired);
		funPoint(dto.getIsSecondVehicleDisplayCheck(), registrationDetailsVO::setIsSecondVehicleDisplayCheck);
		if (dto.getRejectionHistory() != null) {
			registrationDetailsVO.setRejectionHistory(rejectionHistoryMapper.convertEntity(dto.getRejectionHistory()));
		}
		if (dto.getRejectionHistoryLog() != null) {
			registrationDetailsVO
					.setRejectionHistoryLog(rejectionHistoryMapper.convertEntity(dto.getRejectionHistoryLog()));
		}
		funPoint(dto.isSecondVehicleTaxPaid(), registrationDetailsVO::setSecondVehicleTaxPaid);
		funPoint(dto.isCardPrinted(), registrationDetailsVO::setCardPrinted);
		if (dto.getRegistrationValidity() != null) {
			registrationDetailsVO
					.setRegistrationValidity(registrationValidityMapper.convertEntity(dto.getRegistrationValidity()));
		}
		if (dto.getVehicleDetails() != null) {
			registrationDetailsVO.setVehicleDetails(vehicleDetailsMapper.convertEntity(dto.getVehicleDetails()));
		}
		funPoint(dto.getIsCentralGovernamentOrDefenceEmployee(),
				registrationDetailsVO::setIsCentralGovernamentOrDefenceEmployee);
		funPoint(dto.getLastName(), registrationDetailsVO::setLastName);
		funPoint(dto.getApprovalStage(), registrationDetailsVO::setApprovalStage);
		funPoint(dto.isBodyBuilding(), registrationDetailsVO::setBodyBuilding);
		if (dto.getPucDetailsDTO() != null) {
			registrationDetailsVO.setPucDetailsVO(pUCDetailsMapper.convertEntity(dto.getPucDetailsDTO()));
		}
		if (dto.getNocDetails() != null) {
			registrationDetailsVO.setNocDetails(nocDetailsMapper.convertEntity(dto.getNocDetails()));
		}
		funPoint(dto.isAllowForOtherServiceByDataEntry(), registrationDetailsVO::setAllowForOtherServiceByDataEntry);
		if (dto.getCovHistory() != null) {
			registrationDetailsVO.setCovHistory(classOfVehiclesLogMapper.convertEntity(dto.getCovHistory()));
		}
		return registrationDetailsVO;
	}

	public RegistrationDetailsVO limitedFiledsForDashBoard(StagingRegistrationDetailsDTO dto) {
		RegistrationDetailsVO registrationDetailsVO = new RegistrationDetailsVO();
		if (dto.getApplicantDetails() != null) {
			registrationDetailsVO
					.setApplicantDetails(applicantDetailsMapper.dashBoardLimitedFields(dto.getApplicantDetails()));
		}
		if (dto.getRejectionHistory() != null) {
			registrationDetailsVO.setRejectionHistory(rejectionHistoryMapper.convertEntity(dto.getRejectionHistory()));
		}
		if (dto.getRejectionHistoryLog() != null) {
			registrationDetailsVO
					.setRejectionHistoryLog(rejectionHistoryMapper.convertEntity(dto.getRejectionHistoryLog()));
		}
		funPoint(dto.getApplicationNo(), registrationDetailsVO::setApplicationNo);
		funPoint(dto.getVehicleType(), registrationDetailsVO::setVehicleType);
		funPoint(dto.getClassOfVehicle(), registrationDetailsVO::setClassOfVehicle);
		funPoint(dto.getApplicationStatus(), registrationDetailsVO::setApplicationStatus);
		funPoint(dto.getIteration(), registrationDetailsVO::setIteration);
		funPoint(dto.getTrNo(), registrationDetailsVO::setTrNo);
		if (dto.getOfficeDetails() != null) {
			registrationDetailsVO.setOfficeDetails(officeDetailsMapper.dashBoardLimitedFileds(dto.getOfficeDetails()));
		}
		if (dto.getVahanDetails() != null) {
			registrationDetailsVO.setVahanDetails(vahanDetailsMapper.dashBoardLimitedFields(dto.getVahanDetails()));
		}
		if (dto.getFinanceDetails() != null) {
			registrationDetailsVO.setFinanceDetails(financeDetailsMapper.limitedFields(dto.getFinanceDetails()));
		}
		registrationDetailsVO.setTaxType(dto.getTaxType());
		if (dto.getInvoiceDetails() != null) {
			registrationDetailsVO
					.setInvoiceDetails(invoiceDetailsMapper.dashBoardLimitedFields(dto.getInvoiceDetails()));
		}
		registrationDetailsVO.setlUpdate(dto.getlUpdate());
		funPoint(dto.getApplicationStatus(), registrationDetailsVO::setApplicationStatus);
		if (dto.getCovHistory() != null) {
			registrationDetailsVO.setCovHistory(classOfVehiclesLogMapper.convertEntity(dto.getCovHistory()));
		}
		return registrationDetailsVO;

	}

	public RegistrationDetailsVO convertEntity(RegistrationDetailsDTO dto) {

		RegistrationDetailsVO registrationDetailsVO = new RegistrationDetailsVO();
		registrationDetailsVO.setRegVehicleWithTR(dto.isRegVehicleWithTR());
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
		// funPoint(dto.getAadharNo(), registrationDetailsVO::setAadharNo);
		funPoint(dto.getVehicleType(), registrationDetailsVO::setVehicleType);
		/*
		 * funPoint(dto.getChassisNumber(), registrationDetailsVO::setChassisNumber);
		 * funPoint(dto.getEngineNumber(), registrationDetailsVO::setEngineNumber);
		 * funPoint(dto.getMakersName(), registrationDetailsVO::setMakersName);
		 * funPoint(dto.getMakerClass(), registrationDetailsVO::setMakerClass);
		 * funPoint(dto.getDealerSelectedMakerName(),
		 * registrationDetailsVO::setDealerSelectedMakerName);
		 * funPoint(dto.getDealerSelectedMakerClass(),
		 * registrationDetailsVO::setDealerSelectedMakerClass);
		 */
		funPoint(dto.getClassOfVehicle(), registrationDetailsVO::setClassOfVehicle);
		funPoint(dto.getClassOfVehicleDesc(), registrationDetailsVO::setClassOfVehicleDesc);
		funPoint(dto.getTaxType(), registrationDetailsVO::setTaxType);
		/*
		 * funPoint(dto.getBodyType(), registrationDetailsVO::setBodyType);
		 * funPoint(dto.getManufacturedMonthYear(),
		 * registrationDetailsVO::setManufacturedMonthYear);
		 */
		funPoint(dto.getTaxAmount(), registrationDetailsVO::setTaxAmount);

		funPoint(dto.getCesFee(), registrationDetailsVO::setCesFee);
		funPoint(dto.getCesValidity(), registrationDetailsVO::setCesValidity);
		funPoint(dto.getIsFinancier(), registrationDetailsVO::setIsFinancier);

		if (dto.getFinanceDetails() != null) {
			FinanceDetailsVO financeVO = financeDetailsMapper.convertEntity(dto.getFinanceDetails());
			registrationDetailsVO.setFinanceDetails(financeVO);
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

		funPoint(dto.getInsuranceType(), registrationDetailsVO::setInsuranceType);

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
		funPoint(dto.getIsAvailablePresentAddrsProof(), registrationDetailsVO::setIsAvailablePresentAddrsProof);
		funPoint(dto.getPresentAddrsProofBelongsTo(), registrationDetailsVO::setPresentAddrsProofBelongsTo);
		funPoint(dto.getNameOfPresentAddrsProofBelongsTo(), registrationDetailsVO::setNameOfPresentAddrsProofBelongsTo);

		if (dto.getFlowDetails() != null) {
			registrationDetailsVO.setFlowDetails(flowMapper.convertEntity(dto.getFlowDetails()));
		}
		if (dto.getFlowDetailsLog() != null) {
			registrationDetailsVO.setFlowDetailsLog(flowMapper.convertEntity(dto.getFlowDetailsLog()));
		}

		funPoint(dto.getIsPanRequired(), registrationDetailsVO::setIsPanRequired);
		funPoint(dto.getIsSecondVehicleDisplayCheck(), registrationDetailsVO::setIsSecondVehicleDisplayCheck);
		if (dto.getRejectionHistory() != null) {
			registrationDetailsVO.setRejectionHistory(rejectionHistoryMapper.convertEntity(dto.getRejectionHistory()));
		}
		if (dto.getRejectionHistoryLog() != null) {
			registrationDetailsVO
					.setRejectionHistoryLog(rejectionHistoryMapper.convertEntity(dto.getRejectionHistoryLog()));
		}
		funPoint(dto.isSecondVehicleTaxPaid(), registrationDetailsVO::setSecondVehicleTaxPaid);
		funPoint(dto.isCardPrinted(), registrationDetailsVO::setCardPrinted);
		funPoint(dto.isDuplicate(), registrationDetailsVO::setDuplicate);
		if (dto.getRegistrationValidity() != null) {
			registrationDetailsVO
					.setRegistrationValidity(registrationValidityMapper.convertEntity(dto.getRegistrationValidity()));
		}
		/*
		 * if (dto.getPermitDetails() != null) {
		 * registrationDetailsVO.setPermitDetails(permitDetailsMapper.convertEntity(dto.
		 * getPermitDetails())); }
		 */
		if (dto.getVehicleDetails() != null) {
			registrationDetailsVO.setVehicleDetails(vehicleDetailsMapper.convertEntity(dto.getVehicleDetails()));
		}

		funPoint(dto.getApprovalStage(), registrationDetailsVO::setApprovalStage);
		funPoint(dto.getIsCentralGovernamentOrDefenceEmployee(),
				registrationDetailsVO::setIsCentralGovernamentOrDefenceEmployee);
		funPoint(dto.getLastName(), registrationDetailsVO::setLastName);
		funPoint(dto.isBodyBuilding(), registrationDetailsVO::setBodyBuilding);
		funPoint(dto.getLastName(), registrationDetailsVO::setLastName);
		funPoint(dto.getApprovalStage(), registrationDetailsVO::setApprovalStage);
		funPoint(dto.isBodyBuilding(), registrationDetailsVO::setBodyBuilding);
		funPoint(dto.getPrGeneratedDate(), registrationDetailsVO::setPrGeneratedDate);
		funPoint(dto.getTrIssueDate(), registrationDetailsVO::setTrIssueDate);
		funPoint(dto.getPrIssueDate(), registrationDetailsVO::setPrIssueDate);
		if (dto.getPucDetailsDTO() != null) {
			registrationDetailsVO.setPucDetailsVO(pUCDetailsMapper.convertEntity(dto.getPucDetailsDTO()));
		}
		if (dto.getNocDetails() != null) {
			registrationDetailsVO.setNocDetails(nocDetailsMapper.convertEntity(dto.getNocDetails()));
		}
		funPoint(dto.isAllowForOtherServiceByDataEntry(), registrationDetailsVO::setAllowForOtherServiceByDataEntry);
		funPoint(dto.isRegVehicleWithPR(), registrationDetailsVO::setRegVehicleWithPR);
		funPoint(dto.isRegVehicleWithTR(), registrationDetailsVO::setRegVehicleWithTR);
		funPoint(dto.getApplicantType(), registrationDetailsVO::setApplicantType);
		if (dto.getTheftDetails() != null) {
			registrationDetailsVO.setTheftDetails(theftMapper.convertEntity(dto.getTheftDetails()));
		}
		funPoint(dto.isDataInsertedByDataEntry(), registrationDetailsVO::setDataInsertedByDataEntry);

		// for dispatcher module
		funPoint(dto.isCardDispatched(), registrationDetailsVO::setCardDispatched);

		if (dto.getDispatcherFormSubmissionDTO() != null) {
			registrationDetailsVO.setDispatcherFormSubmissionVO(
					dispatcherMapper.convertEntity(dto.getDispatcherFormSubmissionDTO()));
		}
		if (dto.getApplicantType() != null && dto.getApplicantType().equals("OTHERSTATE")
				&& !dto.isRegVehicleWithPR()) {
			funPoint(dto.getIsFirstVehicle(), registrationDetailsVO::setIsFirstVehicle);
		}
		funPoint(dto.isWeightAltDone(), registrationDetailsVO::setWeightAltDone);
		if (dto.getCovHistory() != null) {
			registrationDetailsVO.setCovHistory(classOfVehiclesLogMapper.convertEntity(dto.getCovHistory()));
		}
		return registrationDetailsVO;

	}

	public RegistrationDetailsVO limitedDashBoardfields(RegistrationDetailsDTO dto) {
		RegistrationDetailsVO registrationDetailsVO = new RegistrationDetailsVO();
		registrationDetailsVO.setTrNo(dto.getTrNo());
		registrationDetailsVO.setVehicleType(dto.getVehicleType());
		registrationDetailsVO.setPrNo(dto.getPrNo());
		registrationDetailsVO.setClassOfVehicle(dto.getClassOfVehicle());
		registrationDetailsVO.setOwnerType(dto.getOwnerType());
		registrationDetailsVO.setRegVehicleWithPR(dto.isRegVehicleWithPR());
		registrationDetailsVO.setIteration(dto.getIteration());
		registrationDetailsVO.setTrNo(dto.getTrNo());
		if (dto.getInvoiceDetails() != null) {
			registrationDetailsVO
					.setInvoiceDetails(invoiceDetailsMapper.dashBoardLimitedFields(dto.getInvoiceDetails()));
		}
		if (dto.getApplicantDetails() != null) {
			registrationDetailsVO.setApplicantDetails(
					applicantDetailsMapper.limitedApplicantDetailsdtoToVo(dto.getApplicantDetails()));
		}
		return registrationDetailsVO;

	}

	public RegistrationDetailsVO limitedDtoToVo(RegistrationDetailsDTO dto) {

		RegistrationDetailsVO registrationDetailsVO = new RegistrationDetailsVO();
		if (dto.getApplicantDetails() != null) {
			registrationDetailsVO.setApplicantDetails(
					applicantDetailsMapper.limitedApplicantDetailsdtoToVo(dto.getApplicantDetails()));
		}

		funPoint(dto.getPrNo(), registrationDetailsVO::setPrNo);
		funPoint(dto.getTrNo(), registrationDetailsVO::setTrNo);
		funPoint(dto.getApplicationNo(), registrationDetailsVO::setApplicationNo);
		funPoint(dto.getApplicationStatus(), registrationDetailsVO::setApplicationStatus);
		// for engine & chassis no validation added officeDetails also
		if (dto.getOfficeDetails() != null) {
			registrationDetailsVO.setOfficeDetails(officeDetailsMapper.convertEntity(dto.getOfficeDetails()));
		}
		return registrationDetailsVO;

	}

	public RegistrationDetailsVO aadharDataMapping(RegistrationDetailsDTO dto) {

		RegistrationDetailsVO registrationDetailsVO = new RegistrationDetailsVO();
		if (dto.getApplicantDetails() != null) {
			registrationDetailsVO.setApplicantDetails(
					applicantDetailsMapper.limitedApplicantDetailsdtoToVo(dto.getApplicantDetails()));
		}

		funPoint(dto.getPrNo(), registrationDetailsVO::setPrNo);
		return registrationDetailsVO;

	}

	@Override
	public StagingRegistrationDetailsDTO convertVO(RegistrationDetailsVO vo) {

		StagingRegistrationDetailsDTO registrationDetailsDTO = new StagingRegistrationDetailsDTO();
		if (vo.getApplicantDetails() != null) {
			registrationDetailsDTO.setApplicantDetails(applicantDetailsMapper.convertVO(vo.getApplicantDetails()));
		}

		if (vo.getActionDetails() != null) {
			registrationDetailsDTO.setActionDetails(actionDetailsMapper.convertVO(vo.getActionDetails()));
		}

		funPoint(vo.getApplicationNo(), registrationDetailsDTO::setApplicationNo);
		funPoint(vo.getApplicationStatus(), registrationDetailsDTO::setApplicationStatus);
		funPoint(vo.getIteration(), registrationDetailsDTO::setIteration);

		if (vo.getFinanceDetails() != null) {
			registrationDetailsDTO.setFinanceDetails(financeDetailsMapper.convertVO(vo.getFinanceDetails()));
		}

		if (vo.getVahanDetails() != null) {
			registrationDetailsDTO.setVahanDetails(vahanDetailsMapper.convertVO(vo.getVahanDetails()));
		}

		funPoint(vo.getTrNo(), registrationDetailsDTO::setTrNo);
		funPoint(vo.getStageNo(), registrationDetailsDTO::setStageNo);
		funPoint(vo.getPrNo(), registrationDetailsDTO::setPrNo);
		funPoint(vo.getOwnerType(), registrationDetailsDTO::setOwnerType);
		funPoint(vo.getIsTrailer(), registrationDetailsDTO::setIsTrailer);
		// funPoint(vo.getAadharNo(), registrationDetailsDTO::setAadharNo);
		funPoint(vo.getVehicleType(), registrationDetailsDTO::setVehicleType);
		/*
		 * funPoint(vo.getChassisNumber(), registrationDetailsDTO::setChassisNumber);
		 * funPoint(vo.getEngineNumber(), registrationDetailsDTO::setEngineNumber);
		 * funPoint(vo.getMakersName(), registrationDetailsDTO::setMakersName);
		 * funPoint(vo.getMakerClass(), registrationDetailsDTO::setMakerClass);
		 * funPoint(vo.getDealerSelectedMakerName(),
		 * registrationDetailsDTO::setDealerSelectedMakerName);
		 * funPoint(vo.getDealerSelectedMakerClass(),
		 * registrationDetailsDTO::setDealerSelectedMakerClass);
		 */
		funPoint(vo.getClassOfVehicle(), registrationDetailsDTO::setClassOfVehicle);
		funPoint(vo.getClassOfVehicleDesc(), registrationDetailsDTO::setClassOfVehicleDesc);
		funPoint(vo.getTaxType(), registrationDetailsDTO::setTaxType);
		/*
		 * funPoint(vo.getBodyType(), registrationDetailsDTO::setBodyType);
		 * funPoint(vo.getManufacturedMonthYear(),
		 * registrationDetailsDTO::setManufacturedMonthYear);
		 */
		funPoint(vo.getTaxAmount(), registrationDetailsDTO::setTaxAmount);
		funPoint(vo.getTaxvalidity(), registrationDetailsDTO::setTaxvalidity);
		funPoint(vo.getCesFee(), registrationDetailsDTO::setCesFee);
		funPoint(vo.getCesValidity(), registrationDetailsDTO::setCesValidity);
		funPoint(vo.getIsFinancier(), registrationDetailsDTO::setIsFinancier);
		if (vo.getPanDetails() != null) {
			registrationDetailsDTO.setPanDetails(panDetailsMapper.convertVO(vo.getPanDetails()));
		}

		if (vo.getInvoiceDetails() != null) {
			registrationDetailsDTO.setInvoiceDetails(invoiceDetailsMapper.convertVO(vo.getInvoiceDetails()));
		}

		if (vo.getOfficeDetails() != null) {
			registrationDetailsDTO.setOfficeDetails(officeDetailsMapper.convertVO(vo.getOfficeDetails()));
		}

		if (vo.getDealerDetails() != null) {
			registrationDetailsDTO.setDealerDetails(dealerDetailsMapper.convertVO(vo.getDealerDetails()));
		}

		if (vo.getInsuranceDetails() != null) {

			registrationDetailsDTO.setInsuranceDetails(insuranceMapper.convertVO(vo.getInsuranceDetails()));
		}

		funPoint(vo.getInsuranceType(), registrationDetailsDTO::setInsuranceType);

		funPoint(vo.getSpecialNumberRequired(), registrationDetailsDTO::setSpecialNumberRequired);
		funPoint(vo.getIsAvailablePresentAddrsProof(), registrationDetailsDTO::setIsAvailablePresentAddrsProof);
		funPoint(vo.getPresentAddrsProofBelongsTo(), registrationDetailsDTO::setPresentAddrsProofBelongsTo);
		funPoint(vo.getNameOfPresentAddrsProofBelongsTo(), registrationDetailsDTO::setNameOfPresentAddrsProofBelongsTo);

		if (vo.getFlowDetails() != null) {
			registrationDetailsDTO.setFlowDetails(flowMapper.convertVO(vo.getFlowDetails()));
		}
		if (vo.getFlowDetailsLog() != null) {
			registrationDetailsDTO.setFlowDetailsLog(flowMapper.convertVO(vo.getFlowDetailsLog()));
		}

		funPoint(vo.getIsPanRequired(), registrationDetailsDTO::setIsPanRequired);
		funPoint(vo.getIsSecondVehicleDisplayCheck(), registrationDetailsDTO::setIsSecondVehicleDisplayCheck);
		if (vo.getRejectionHistory() != null) {
			registrationDetailsDTO.setRejectionHistory(rejectionHistoryMapper.convertVO(vo.getRejectionHistory()));
		}
		if (vo.getRejectionHistoryLog() != null) {
			registrationDetailsDTO
					.setRejectionHistoryLog(rejectionHistoryMapper.convertVO(vo.getRejectionHistoryLog()));
		}
		funPoint(vo.isSecondVehicleTaxPaid(), registrationDetailsDTO::setSecondVehicleTaxPaid);
		funPoint(vo.isCardPrinted(), registrationDetailsDTO::setCardPrinted);
		funPoint(vo.isDuplicate(), registrationDetailsDTO::setDuplicate);
		if (vo.getRegistrationValidity() != null) {
			registrationDetailsDTO
					.setRegistrationValidity(registrationValidityMapper.convertVO(vo.getRegistrationValidity()));
		}
		/*
		 * if (vo.getPermitDetails() != null) {
		 * registrationDetailsDTO.setPermitDetails(permitDetailsMapper.convertVO(vo.
		 * getPermitDetails())); }
		 */
		if (vo.getVehicleDetails() != null) {
			registrationDetailsDTO.setVehicleDetails(vehicleDetailsMapper.convertVO(vo.getVehicleDetails()));
		}
		funPoint(vo.getApprovalStage(), registrationDetailsDTO::setApprovalStage);
		funPoint(vo.getPrIssueDate(), registrationDetailsDTO::setPrIssueDate);
		funPoint(vo.getPrValidUpto(), registrationDetailsDTO::setPrValidUpto);
		funPoint(vo.getPrIssuingAuthority(), registrationDetailsDTO::setPrIssuingAuthority);
		funPoint(vo.getIsFirstVehicle(), registrationDetailsDTO::setIsFirstVehicle);
		funPoint(vo.getTrIssueDate(), registrationDetailsDTO::setTrIssueDate);
		funPoint(vo.getTrValidUpto(), registrationDetailsDTO::setTrValidUpto);
		funPoint(vo.getTrIssuingAuthority(), registrationDetailsDTO::setTrIssuingAuthority);

		funPoint(vo.isRegVehicleWithPR(), registrationDetailsDTO::setRegVehicleWithPR);
		funPoint(vo.isRegVehicleWithTR(), registrationDetailsDTO::setRegVehicleWithTR);
		funPoint(vo.isTaxPaidByVcr(), registrationDetailsDTO::setTaxPaidByVcr);

		if (vo.getPucDetailsVO() != null) {
			registrationDetailsDTO.setPucDetailsDTO(pUCDetailsMapper.convertVO(vo.getPucDetailsVO()));
		}
		funPoint(vo.isAllowForOtherServiceByDataEntry(), registrationDetailsDTO::setAllowForOtherServiceByDataEntry);

		// for dispatcher module
		funPoint(vo.isCardDispatched(), registrationDetailsDTO::setCardDispatched);

		if (vo.getDispatcherFormSubmissionVO() != null) {
			registrationDetailsDTO
					.setDispatcherFormSubmissionDTO(dispatcherMapper.convertVO(vo.getDispatcherFormSubmissionVO()));
		}
		funPoint(vo.getApplicantType(), registrationDetailsDTO::setApplicantType);
		funPoint(vo.isWeightAltDone(), registrationDetailsDTO::setWeightAltDone);
		if (vo.getCovHistory() != null) {
			registrationDetailsDTO.setCovHistory(classOfVehiclesLogMapper.convertVO(vo.getCovHistory()));
		}
		funPoint(vo.getIsCentralGovernamentOrDefenceEmployee(),
				registrationDetailsDTO::setIsCentralGovernamentOrDefenceEmployee);
		return registrationDetailsDTO;

	}

	public abstract T getInstance();

	public RegistrationDetailsVO convertVOWithLimitedField(RegistrationDetailsVO vo) {

		RegistrationDetailsVO registrationDetailsVO = new RegistrationDetailsVO();

		ApplicantDetailsVO applicantDetailsVO = new ApplicantDetailsVO();
		ContactVO contactVO = new ContactVO();
		VahanDetailsVO vahanDetailsVo = new VahanDetailsVO();
		InvoiceDetailsVO invoiceDetailsVO = new InvoiceDetailsVO();
		OfficeVO officeVo = new OfficeVO();

		funPoint(vo.getApplicantDetails().getAadharNo(), applicantDetailsVO::setAadharNo);
		funPoint(vo.getApplicantDetails().getFirstName(), applicantDetailsVO::setFirstName);
		funPoint(vo.getApplicantDetails().getLastName(), applicantDetailsVO::setLastName);
		funPoint(vo.getApplicantDetails().getMiddleName(), applicantDetailsVO::setMiddleName);
		funPoint(vo.getApplicantDetails().getDisplayName(), applicantDetailsVO::setDisplayName);
		funPoint(vo.getApplicantDetails().getContact().getAlternateMobile(), contactVO::setAlternateMobile);
		funPoint(vo.getApplicantDetails().getContact().getEmail(), contactVO::setEmail);
		funPoint(vo.getApplicantDetails().getContact().getMobile(), contactVO::setMobile);
		funPoint(vo.getApplicantDetails().getContact().getPhone(), contactVO::setPhone);
		funPoint(vo.getVahanDetails().getBodyTypeDesc(), vahanDetailsVo::setBodyTypeDesc);
		funPoint(vo.getVahanDetails().getInsuranceCompany(), vahanDetailsVo::setInsuranceCompany);
		funPoint(vo.getVahanDetails().getInsurancePolicyNumber(), vahanDetailsVo::setInsurancePolicyNumber);
		funPoint(vo.getVahanDetails().getMakersModel(), vahanDetailsVo::setMakersModel);
		funPoint(vo.getVahanDetails().getMakersDesc(), vahanDetailsVo::setMakersDesc);
		funPoint(vo.getInvoiceDetails().getInvoiceDate(), invoiceDetailsVO::setInvoiceDate);
		funPoint(vo.getInvoiceDetails().getInvoiceNo(), invoiceDetailsVO::setInvoiceNo);
		funPoint(vo.getInvoiceDetails().getInvoiceValue(), invoiceDetailsVO::setInvoiceValue);
		applicantDetailsVO.setContact(contactVO);
		// funPoint(vo.getFinancierToken(), registrationDetailsDTO::setFinancierToken);
		registrationDetailsVO.setApplicantDetails(applicantDetailsVO);
		registrationDetailsVO.setInvoiceDetails(invoiceDetailsVO);
		registrationDetailsVO.setVahanDetails(vahanDetailsVo);
		funPoint(vo.getApplicationNo(), registrationDetailsVO::setApplicationNo);
		funPoint(vo.getApplicationStatus(), registrationDetailsVO::setApplicationStatus);
		funPoint(vo.getStageNo(), registrationDetailsVO::setStageNo);

		funPoint(vo.getVehicleType(), registrationDetailsVO::setVehicleType);

		funPoint(vo.getOfficeDetails().getLatitude(), officeVo::setLatitude);
		funPoint(vo.getOfficeDetails().getLongitude(), officeVo::setLongitude);
		funPoint(vo.getOfficeDetails().getOffice(), officeVo::setOffice);
		funPoint(vo.getOfficeDetails().getOfficeAddress1(), officeVo::setOfficeAddress1);
		funPoint(vo.getOfficeDetails().getOfficeAddress2(), officeVo::setOfficeAddress2);
		funPoint(vo.getOfficeDetails().getOfficeCity(), officeVo::setOfficeCity);
		funPoint(vo.getOfficeDetails().getOfficeCode(), officeVo::setOfficeCode);
		funPoint(vo.getOfficeDetails().getOfficeDdo(), officeVo::setOfficeDdo);
		funPoint(vo.getOfficeDetails().getOfficeDist(), officeVo::setOfficeDist);
		funPoint(vo.getOfficeDetails().getOfficeGeocode(), officeVo::setOfficeGeocode);
		funPoint(vo.getOfficeDetails().getOfficeId(), officeVo::setOfficeId);
		funPoint(vo.getOfficeDetails().getOfficeMandal(), officeVo::setOfficeMandal);
		funPoint(vo.getOfficeDetails().getOfficeName(), officeVo::setOfficeName);
		funPoint(vo.getOfficeDetails().getOfficeType(), officeVo::setOfficeType);
		funPoint(vo.getOfficeDetails().getOfficeVillage(), officeVo::setOfficeVillage);
		funPoint(vo.getOfficeDetails().getStatus(), officeVo::setStatus);
		registrationDetailsVO.setOfficeDetails(officeVo);
		funPoint(vo.getlUpdate(), registrationDetailsVO::setlUpdate);
		return registrationDetailsVO;

	}

	public List<AadhaarRequestVO> aadharRelatedData(List<RegistrationDetailsDTO> regList) {
		List<AadhaarRequestVO> regVOList = new ArrayList<>();

		List<String> twoWhheledCOvs = new ArrayList<>();
		List<String> threeWhheledCOvs = new ArrayList<>();
		List<String> goodsCovs = new ArrayList<>();
		List<String> busesCovs = new ArrayList<>();

		twoWhheledCOvs.add("MCYN");
		twoWhheledCOvs.add("MMCN");
		twoWhheledCOvs.add("MCPT");
		twoWhheledCOvs.add("IVCN");
		twoWhheledCOvs.add("MCTT");

		threeWhheledCOvs.add("ARKT");
		threeWhheledCOvs.add("ARPN");
		threeWhheledCOvs.add("TGVT");
		threeWhheledCOvs.add("ERKT");
		threeWhheledCOvs.add("ECRT");

		goodsCovs.add("GCRT");
		goodsCovs.add("ARVT");
		goodsCovs.add("AUTT");

		// busesCovs.add("")
		busesCovs = Arrays.asList(new String[] { "CMVT", "AMBT", "AABT", "EIBT", "COCT", "SCRT", "TOVT", "PSVT", "FFVT",
				"HERT", "LIBT", "MACT", "MAXT", "MOCT", "OBT" });

		String wheel = "Wheel";

		for (RegistrationDetailsDTO reg : regList) {
			AadhaarRequestVO vo = new AadhaarRequestVO();
			if (reg.getApplicantDetails() != null && reg.getApplicantDetails().getDisplayName() != null) {
				vo.setName(reg.getApplicantDetails().getDisplayName());
			}
			vo.setPrNo(reg.getPrNo());
			vo.setAadhaarNo(reg.getApplicantDetails().getAadharNo());
			// vo.setCov(reg.getClassOfVehicle());

			if (threeWhheledCOvs.contains(reg.getClassOfVehicle())) {
				// vo.setCov("3 "+wheel);
				throw new BadRequestException(
						"Aadhaar Details Not found for :" + reg.getApplicantDetails().getAadharNo());
			} else if (twoWhheledCOvs.contains(reg.getClassOfVehicle())) {
				// vo.setCov("2 "+wheel);
				throw new BadRequestException(
						"Aadhaar Details Not found for :" + reg.getApplicantDetails().getAadharNo());
			} else if (goodsCovs.contains(reg.getClassOfVehicle())) {
				try {
					Integer gvw = reg.getVahanDetails().getGvw();

					if (gvw <= 16200) {
						vo.setCov("6 " + wheel);
					}
					if (gvw > 16200 && gvw <= 25000) {
						vo.setCov("10 " + wheel);
					}
					if (gvw > 25000 && gvw <= 31000) {
						vo.setCov("12 " + wheel);
					}
				} catch (Exception e) {
					vo.setCov("4 " + wheel);
				}
			} else if (busesCovs.contains(reg.getClassOfVehicle())) {

				try {
					int seatingCapacity = Integer.parseInt(reg.getVahanDetails().getSeatingCapacity());

					if (seatingCapacity <= 20) {
						vo.setCov("4 " + wheel);
					}
					if (seatingCapacity > 20) {
						vo.setCov("6 " + wheel);
					}
				} catch (Exception e) {
					vo.setCov("4 " + wheel);
				}
			}

			else {
				vo.setCov("4 " + wheel);
			}

			if (reg.getApplicantDetails().getPresentAddress() != null) {

				StringBuilder address = new StringBuilder();

				if (StringUtils.isNoneBlank(reg.getApplicantDetails().getPresentAddress().getDoorNo())) {
					address.append("," + reg.getApplicantDetails().getPresentAddress().getDoorNo());
				}

				if (reg.getApplicantDetails().getPresentAddress().getMandal() != null) {
					if (StringUtils
							.isNoneBlank(reg.getApplicantDetails().getPresentAddress().getMandal().getMandalName())) {
						address.append("," + reg.getApplicantDetails().getPresentAddress().getMandal().getMandalName());
					}
				}

				if (reg.getApplicantDetails().getPresentAddress().getDistrict() != null) {
					if (StringUtils.isNoneBlank(
							reg.getApplicantDetails().getPresentAddress().getDistrict().getDistrictName())) {
						address.append(
								"," + reg.getApplicantDetails().getPresentAddress().getDistrict().getDistrictName());
					}
				}
				if (address.length() > 0) {
					address.delete(0, 1);
				}
				vo.setAddress(address.toString());
			} else {
				vo.setAddress(StringUtils.EMPTY);
			}

			regVOList.add(vo);
		}

		twoWhheledCOvs.clear();
		threeWhheledCOvs.clear();
		goodsCovs.clear();
		busesCovs = null;

		return regVOList;
	}

	public RegistrationDetailsVO convertDtoToVoWithLimitedFields(StagingRegistrationDetailsDTO dto) {
		RegistrationDetailsVO registrationDetailsVO = new RegistrationDetailsVO();
		ApplicantDetailsVO applicantDetailsVO = new ApplicantDetailsVO();
		ContactVO contactVO = new ContactVO();
		VahanDetailsVO vahanDetailsVO = new VahanDetailsVO();
		InvoiceDetailsVO invoiceDetailsVO = new InvoiceDetailsVO();
		// OfficeVO officeVO = registrationDetailsVO.getOffice();

		funPoint(dto.getApplicantDetails().getLastName(), applicantDetailsVO::setLastName);
		funPoint(dto.getApplicantDetails().getDisplayName(), applicantDetailsVO::setDisplayName);
		funPoint(dto.getApplicantDetails().getMiddleName(), applicantDetailsVO::setMiddleName);
		funPoint(dto.getApplicantDetails().getAadharNo(), applicantDetailsVO::setAadharNo);
		funPoint(dto.getApplicantDetails().getFirstName(), applicantDetailsVO::setFirstName);
		funPoint(dto.getApplicantDetails().getContact().getAlternateMobile(), contactVO::setAlternateMobile);
		funPoint(dto.getApplicantDetails().getContact().getEmail(), contactVO::setEmail);
		funPoint(dto.getApplicantDetails().getContact().getMobile(), contactVO::setMobile);
		funPoint(dto.getApplicantDetails().getContact().getPhone(), contactVO::setPhone);
		funPoint(dto.getVahanDetails().getBodyTypeDesc(), vahanDetailsVO::setBodyTypeDesc);
		funPoint(dto.getVahanDetails().getInsuranceCompany(), vahanDetailsVO::setInsuranceCompany);
		funPoint(dto.getVahanDetails().getInsurancePolicyNumber(), vahanDetailsVO::setInsurancePolicyNumber);
		funPoint(dto.getVahanDetails().getMakersModel(), vahanDetailsVO::setMakersModel);
		funPoint(dto.getVahanDetails().getMakersDesc(), vahanDetailsVO::setMakersDesc);
		funPoint(dto.getInvoiceDetails().getInvoiceDate(), invoiceDetailsVO::setInvoiceDate);
		funPoint(dto.getInvoiceDetails().getInvoiceNo(), invoiceDetailsVO::setInvoiceNo);
		funPoint(dto.getInvoiceDetails().getInvoiceValue(), invoiceDetailsVO::setInvoiceValue);

		applicantDetailsVO.setContact(contactVO);
		registrationDetailsVO.setApplicantDetails(applicantDetailsVO);
		registrationDetailsVO.setVahanDetails(vahanDetailsVO);
		registrationDetailsVO.setInvoiceDetails(invoiceDetailsVO);

		registrationDetailsVO.setApplicantDetails(applicantDetailsMapper.convertEntity(dto.getApplicantDetails()));

		funPoint(dto.getApplicationNo(), registrationDetailsVO::setApplicationNo);
		funPoint(dto.getStageNo(), registrationDetailsVO::setStageNo);
		funPoint(dto.getApplicationStatus(), registrationDetailsVO::setApplicationStatus);

		funPoint(dto.getVehicleType(), registrationDetailsVO::setVehicleType);
		funPoint(dto.getlUpdate(), registrationDetailsVO::setlUpdate);
		registrationDetailsVO.setOfficeDetails(officeDetailsMapper.convertEntity(dto.getOfficeDetails()));

		/*
		 * funPoint(dto.getOffice().getLatitude(), officeVO::setLatitude);
		 * funPoint(dto.getOffice().getLongitude(), officeVO::setLongitude);
		 * funPoint(dto.getOffice().getOffice(), officeVO::setOffice);
		 * funPoint(dto.getOffice().getOfficeAddress1(), officeVO::setOfficeAddress1);
		 * funPoint(dto.getOffice().getOfficeAddress2(), officeVO::setOfficeAddress2);
		 * funPoint(dto.getOffice().getOfficeCity(), officeVO::setOfficeCity);
		 * funPoint(dto.getOffice().getOfficeCode(), officeVO::setOfficeCode);
		 * funPoint(dto.getOffice().getOfficeDdo(), officeVO::setOfficeDdo);
		 * funPoint(dto.getOffice().getOfficeDist(), officeVO::setOfficeDist);
		 * funPoint(dto.getOffice().getOfficeGeocode(), officeVO::setOfficeGeocode);
		 * funPoint(dto.getOffice().getOfficeId(), officeVO::setOfficeId);
		 * funPoint(dto.getOffice().getOfficeMandal(), officeVO::setOfficeMandal);
		 * funPoint(dto.getOffice().getOfficeName(), officeVO::setOfficeName);
		 * funPoint(dto.getOffice().getOfficeType(), officeVO::setOfficeType);
		 * funPoint(dto.getOffice().getOfficeVillage(), officeVO::setOfficeVillage);
		 * funPoint(dto.getOffice().getStatus(), officeVO::setStatus);
		 */
		return registrationDetailsVO;

	}

	public List<RegistrationDetailsVO> convertVOWithLimitedFieldList(
			List<RegistrationDetailsVO> registrationDetailsVO) {
		return registrationDetailsVO.stream().map(e -> convertVOWithLimitedField(e)).collect(Collectors.toList());
	}

	@Override
	public List<RegistrationDetailsVO> convertEntity(List<StagingRegistrationDetailsDTO> registrationDetailsDTO) {
		return registrationDetailsDTO.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}

	//
	public DataVO convertRegDTOtoDataVO(StagingRegistrationDetailsDTO dto) {
		DataVO dataVO = new DataVO();
		funPoint(replaceDefaults(dto.getOfficeDetails().getOfficeCode()), dataVO::setRtoCode);
		funPoint(replaceDefaults(dto.getOfficeDetails().getOfficeName()), dataVO::setRtoName);

		funPoint(replaceDefaults(dto.getOfficeDetails().getHsrpOffice()), dataVO::setAffixationCenterCode);

		// Todo need to confirm TransactionNo input value
		funPoint(replaceDefaults(dto.getApplicationNo()), dataVO::setTransactionNo);
		// not changed to localdata
		funPoint(replaceDefaults(DateConverters.convertHSRLocalDateFormat(dto.getTrGeneratedDate())),
				dataVO::setTransactionDate);
		// funPoint(getAuthorizationRefNo, dataVO::setAuthorizationRefNo);
		// praveen
		funPoint(replaceDefaults(DateConverters.convertHSRLocalDateFormat(dto.getTrGeneratedDate())),
				dataVO::setAuthorizationDate);
		funPoint(replaceDefaults(dto.getVahanDetails().getEngineNumber()), dataVO::setEngineNo);
		funPoint(replaceDefaults(dto.getVahanDetails().getChassisNumber()), dataVO::setChassisNo);
		funPoint("", dataVO::setPrNumber);
		funPoint(replaceDefaults(dto.getApplicantDetails().getFirstName()), dataVO::setOwnerName);
		funPoint(replaceDefaults(this.ownrAddress(dto)), dataVO::setOwnerAddress);
		funPoint(replaceDefaults(dto.getApplicantDetails().getContact().getEmail()), dataVO::setOwnerEmailId);
		funPoint(
				replaceDefaults(
						dto.getApplicantDetails().getPresentAddress().getPostOffice().getPostOfficeCode().toString()),
				dataVO::setOwnerPinCode);
		funPoint(replaceDefaults(dto.getApplicantDetails().getContact().getMobile()), dataVO::setMobileNo);
		funPoint(replaceDefaults(dto.getClassOfVehicleDesc()), dataVO::setVehicleType);
		// Todo need to confirm TransType input value NB
		funPoint("NB", dataVO::setTransType);
		// String
		// vehicleClassDec=dto.getVehicleType()+dto.getVahanDetails().getVehicleClass();
		funPoint(replaceDefaults(dto.getVehicleType()), dataVO::setVehicleClassType);

		funPoint(replaceDefaults(dto.getVahanDetails().getManufacturedMonthYear()), dataVO::setMfrsName);
		funPoint(replaceDefaults(dto.getVahanDetails().getMakersModel()), dataVO::setModelName);
		funPoint(replaceDefaults(dto.getHsrpfee().toString()), dataVO::setHsrpFee);
		funPoint("N", dataVO::setOldNewFlag);
		funPoint("", dataVO::setGovtVehicleTag);
		funPoint(DateConverters.convertHSRLocalDateFormat(LocalDateTime.now()), dataVO::setTimeStamp);
		funPoint(replaceDefaults(dto.getTrNo()), dataVO::setTrNumber);
		funPoint(replaceDefaults(dto.getDealerDetails().getDealerName()), dataVO::setDealerName);
		funPoint(replaceDefaults(dto.getDealerDetails().getDealerMail()), dataVO::setDealerMail);
		funPoint(replaceDefaults(dto.getDealerDetails().getDealerId()), dataVO::setDealerRtoCode);
		funPoint("", dataVO::setRegDate);
		if (dto.getPrGeneratedDate() != null) {
			funPoint(replaceDefault(DateConverters.convertHSRLocalDateFormat(dto.getPrGeneratedDate())),
					dataVO::setRegDate);
		}
		// iteration_no need to come
		return dataVO;
	}

	public List<RegistrationDetailsVO> dashBoardLimitedFields(
			List<StagingRegistrationDetailsDTO> registrationDetailsDTO) {
		List<RegistrationDetailsVO> stagingList = new ArrayList<>();
		for (StagingRegistrationDetailsDTO staging : registrationDetailsDTO) {
			RegistrationDetailsVO registrationDetailsVO = new RegistrationDetailsVO();
			if (staging.getApplicantDetails() != null) {
				registrationDetailsVO.setApplicantDetails(
						applicantDetailsMapper.dashBoardLimitedFields(staging.getApplicantDetails()));
			}
			funPoint(staging.getApplicationNo(), registrationDetailsVO::setApplicationNo);
			funPoint(staging.getApplicationStatus(), registrationDetailsVO::setApplicationStatus);
			funPoint(staging.getTaxType(), registrationDetailsVO::setTaxType);
			funPoint(staging.getVehicleType(), registrationDetailsVO::setVehicleType);
			funPoint(staging.getClassOfVehicle(), registrationDetailsVO::setClassOfVehicle);
			if (staging.getInvoiceDetails() != null) {
				registrationDetailsVO
						.setInvoiceDetails(invoiceDetailsMapper.dashBoardLimitedFields(staging.getInvoiceDetails()));
			}
			if (staging.getOfficeDetails() != null) {

				registrationDetailsVO
						.setOfficeDetails(officeDetailsMapper.dashBoardLimitedFileds(staging.getOfficeDetails()));

			}
			if (staging.getVahanDetails() != null) {
				registrationDetailsVO
						.setVahanDetails(vahanDetailsMapper.dashBoardLimitedFields(staging.getVahanDetails()));
			}

			if (staging.getInsuranceDetails() != null) {

				registrationDetailsVO
						.setInsuranceDetails(insuranceMapper.dashBoardLimitedFields(staging.getInsuranceDetails()));
			}
			registrationDetailsVO.setTrNo(staging.getTrNo());
			registrationDetailsVO.setStageNo(staging.getStageNo());

			stagingList.add(registrationDetailsVO);
		}
		return stagingList;
	}

	private String ownrAddress(StagingRegistrationDetailsDTO input) {
		String address = null;
		if (input.getApplicantDetails().getPresentAddress() != null) {
			address = replaceDefaults(input.getApplicantDetails().getPresentAddress().getDoorNo()) + " "
					+ replaceDefaults(input.getApplicantDetails().getPresentAddress().getStreetName()) + " "
					+ replaceDefaults(input.getApplicantDetails().getPresentAddress().getTownOrCity()) + " "
					+ replaceDefaults(
							input.getApplicantDetails().getPresentAddress().getVillage() == null ? StringUtils.EMPTY
									: input.getApplicantDetails().getPresentAddress().getVillage().getVillageName())
					+ " "
					+ replaceDefaults(input.getApplicantDetails().getPresentAddress().getMandal() == null ? ""
							: input.getApplicantDetails().getPresentAddress().getMandal().getMandalName())
					+ " "
					+ replaceDefaults(
							input.getApplicantDetails().getPresentAddress().getDistrict() == null ? ""
									: input.getApplicantDetails().getPresentAddress().getDistrict().getDistrictName())
					+ " "
					+ replaceDefaults(input.getApplicantDetails().getPresentAddress().getState() == null ? ""
							: input.getApplicantDetails().getPresentAddress().getState().getStateName())
					+ " "
					+ replaceDefaults(input.getApplicantDetails().getPresentAddress().getPostOffice() == null ? ""
							: input.getApplicantDetails().getPresentAddress().getPostOffice().getPostOfficeCode()
									.toString());
		}
		return address;

	}

	private String replaceDefaults(String input) {

		if (StringUtils.isBlank(input)) {
			return StringUtils.EMPTY;
		}
		return input;
	}

	private String replaceDefault(Object input) {

		if (null == input) {
			return StringUtils.EMPTY;
		}
		return input.toString();
	}

	public RegServiceDTO createNew(RegistrationDetailsDTO registrationDetailsDTO, RegServiceVO input) {

		RegServiceDTO regServiceDTO = new RegServiceDTO();
		registrationDetailsDTO.setDealerDetails(null);
		registrationDetailsDTO.getApplicantDetails().setBloodGrp(null);
		registrationDetailsDTO.getApplicantDetails().setQualification(null);
		regServiceDTO.setRegistrationDetails(registrationDetailsDTO);
		regServiceDTO.setAadhaarNo(input.getAadhaarNo());
		funPoint(input.getTrNo(), regServiceDTO::setTrNo);
		funPoint(input.getPrNo(), regServiceDTO::setPrNo);
		regServiceDTO.setServiceIds(input.getServiceIds());
		regServiceDTO.setGatewayType(input.getGatewayType());
		regServiceDTO.setServiceType(input.getServiceType());
		regServiceDTO.setCreatedDate(LocalDateTime.now());
		if (input.getContactDetails() != null) {
			regServiceDTO.setContactDetails(contactMapper.convertVO(input.getContactDetails()));
		}
		regServiceDTO.setSpecialNoRequired(input.isSpecialNoRequired());
		regServiceDTO.setFinancerRequired(input.isFinancerRequired());
		if (StringUtils.isNoneBlank(input.getTaxType())) {
			regServiceDTO.setTaxType(input.getTaxType());
		}
		funPoint(input.getStageCarriageType(), regServiceDTO::setStageCarriageType);
		funPoint(input.getStageCarriageServiceType(), regServiceDTO::setStageCarriageServiceType);
		return regServiceDTO;

	}

	private String getOffice(String officeCode) {

		Optional<OfficeDTO> officeDtoOptional = officeDAO.findByOfficeCode(officeCode);

		if (!officeDtoOptional.isPresent()) {

			throw new BadRequestException("Not able to found Office details by code:" + officeCode);
		}

		return officeDtoOptional.get().getOfficeCode();

	}

	public RegistrationDetailsDTO convertVOForOtherState(RegistrationDetailsVO vo) {

		RegistrationDetailsDTO registrationDetailsDTO = new RegistrationDetailsDTO();
		if (vo.getApplicantDetails() != null) {
			registrationDetailsDTO.setApplicantDetails(applicantDetailsMapper.convertVO(vo.getApplicantDetails()));
		}

		if (vo.getActionDetails() != null) {
			registrationDetailsDTO.setActionDetails(actionDetailsMapper.convertVO(vo.getActionDetails()));
		}

		funPoint(vo.getApplicationNo(), registrationDetailsDTO::setApplicationNo);
		funPoint(vo.getApplicationStatus(), registrationDetailsDTO::setApplicationStatus);
		funPoint(vo.getIteration(), registrationDetailsDTO::setIteration);

		if (vo.getFinanceDetails() != null) {
			registrationDetailsDTO.setFinanceDetails(financeDetailsMapper.convertVO(vo.getFinanceDetails()));
		}

		if (vo.getVahanDetails() != null) {
			registrationDetailsDTO.setVahanDetails(vahanDetailsMapper.convertVO(vo.getVahanDetails()));
		}

		funPoint(vo.getTrNo(), registrationDetailsDTO::setTrNo);
		// funPoint(vo.getStageNo(), registrationDetailsDTO::setStageNo);
		funPoint(vo.getPrNo(), registrationDetailsDTO::setPrNo);
		funPoint(vo.getOwnerType(), registrationDetailsDTO::setOwnerType);
		funPoint(vo.getIsTrailer(), registrationDetailsDTO::setIsTrailer);
		funPoint(vo.getVehicleType(), registrationDetailsDTO::setVehicleType);
		funPoint(vo.getClassOfVehicle(), registrationDetailsDTO::setClassOfVehicle);
		funPoint(vo.getClassOfVehicleDesc(), registrationDetailsDTO::setClassOfVehicleDesc);
		funPoint(vo.getTaxType(), registrationDetailsDTO::setTaxType);
		funPoint(vo.getTaxAmount(), registrationDetailsDTO::setTaxAmount);
		funPoint(vo.getTaxvalidity(), registrationDetailsDTO::setTaxvalidity);
		funPoint(vo.getCesFee(), registrationDetailsDTO::setCesFee);
		funPoint(vo.getCesValidity(), registrationDetailsDTO::setCesValidity);
		funPoint(vo.getIsFinancier(), registrationDetailsDTO::setIsFinancier);
		if (vo.getPanDetails() != null) {
			registrationDetailsDTO.setPanDetails(panDetailsMapper.convertVO(vo.getPanDetails()));
		}

		if (vo.getInvoiceDetails() != null) {
			registrationDetailsDTO.setInvoiceDetails(invoiceDetailsMapper.convertVO(vo.getInvoiceDetails()));
		}

		if (vo.getOfficeDetails() != null) {
			registrationDetailsDTO.setOfficeDetails(officeDetailsMapper.convertVO(vo.getOfficeDetails()));
		}

		if (vo.getDealerDetails() != null) {
			registrationDetailsDTO.setDealerDetails(dealerDetailsMapper.convertVO(vo.getDealerDetails()));
		}

		if (vo.getInsuranceDetails() != null) {

			registrationDetailsDTO.setInsuranceDetails(insuranceMapper.convertVO(vo.getInsuranceDetails()));
		}

		funPoint(vo.getInsuranceType(), registrationDetailsDTO::setInsuranceType);

		funPoint(vo.getSpecialNumberRequired(), registrationDetailsDTO::setSpecialNumberRequired);
		funPoint(vo.getIsAvailablePresentAddrsProof(), registrationDetailsDTO::setIsAvailablePresentAddrsProof);
		funPoint(vo.getPresentAddrsProofBelongsTo(), registrationDetailsDTO::setPresentAddrsProofBelongsTo);
		funPoint(vo.getNameOfPresentAddrsProofBelongsTo(), registrationDetailsDTO::setNameOfPresentAddrsProofBelongsTo);

		if (vo.getFlowDetails() != null) {
			registrationDetailsDTO.setFlowDetails(flowMapper.convertVO(vo.getFlowDetails()));
		}
		if (vo.getFlowDetailsLog() != null) {
			registrationDetailsDTO.setFlowDetailsLog(flowMapper.convertVO(vo.getFlowDetailsLog()));
		}

		funPoint(vo.getIsPanRequired(), registrationDetailsDTO::setIsPanRequired);
		funPoint(vo.getIsSecondVehicleDisplayCheck(), registrationDetailsDTO::setIsSecondVehicleDisplayCheck);
		if (vo.getRejectionHistory() != null) {
			registrationDetailsDTO.setRejectionHistory(rejectionHistoryMapper.convertVO(vo.getRejectionHistory()));
		}
		if (vo.getRejectionHistoryLog() != null) {
			registrationDetailsDTO
					.setRejectionHistoryLog(rejectionHistoryMapper.convertVO(vo.getRejectionHistoryLog()));
		}
		funPoint(vo.isSecondVehicleTaxPaid(), registrationDetailsDTO::setSecondVehicleTaxPaid);
		funPoint(vo.isCardPrinted(), registrationDetailsDTO::setCardPrinted);
		if (vo.getRegistrationValidity() != null) {
			registrationDetailsDTO
					.setRegistrationValidity(registrationValidityMapper.convertVO(vo.getRegistrationValidity()));
		}
		/*
		 * if (vo.getPermitDetails() != null) {
		 * registrationDetailsDTO.setPermitDetails(permitDetailsMapper.convertVO(vo.
		 * getPermitDetails())); }
		 */
		if (vo.getVehicleDetails() != null) {
			registrationDetailsDTO.setVehicleDetails(vehicleDetailsMapper.convertVO(vo.getVehicleDetails()));
		}

		return registrationDetailsDTO;

	}

	public RegistrationDetailsVO convertMandalDetailsDTOtoVO(StagingRegistrationDetailsDTO dto) {
		RegistrationDetailsVO vo = new RegistrationDetailsVO();
		if (dto.getApplicantDetails() != null) {
			vo.setApplicantDetails(applicantDetailsMapper.convertEntity(dto.getApplicantDetails()));
		}
		return vo;
	}

	private void validateChassisNO(ApplicationSearchVO applicationSearchVO, VahanDetailsDTO vahanDetails) {
		if (StringUtils.isBlank(applicationSearchVO.getChassisNo())) {
			throw new BadRequestException("Please provide chassis numbers ");
		}
		if (StringUtils.isBlank(vahanDetails.getChassisNumber())) {
			throw new BadRequestException("Chassis number  not found in REG document");
		}
		if (!vahanDetails.getChassisNumber().equalsIgnoreCase(applicationSearchVO.getChassisNo())) {
			logger.info("provided chassis no : [{}], actual chassis no: [{}]", applicationSearchVO.getChassisNo(),
					vahanDetails.getChassisNumber());
			throw new BadRequestException("Please provide correct chassis numbers ");
		}
	}

	public CitizenSearchReportVO convertSpecificFieldsForCitizenSearchForRegistration(
			RegistrationDetailsDTO registrationDetailsDTO, ApplicationSearchVO applicationSearchVO) {
		CitizenSearchReportVO searchVo = new CitizenSearchReportVO();
		if (registrationDetailsDTO.getVahanDetails() == null) {
			throw new BadRequestException("vahan details not found in Registration details document");
		}
		if (applicationSearchVO.getIsRta().equals(Boolean.FALSE)) {
			validateChassisNO(applicationSearchVO, registrationDetailsDTO.getVahanDetails());
		}
		funPoint(registrationDetailsDTO.getApplicationNo(), searchVo::setApplicationNumber);
		funPoint(registrationDetailsDTO.getApplicantDetails().getFirstName(), searchVo::setApplicantName);
		funPoint(registrationDetailsDTO.getApplicantDetails().getFatherName(), searchVo::setFatherName);
		if (StringUtils.isNotBlank(registrationDetailsDTO.getApplicationStatus())) {
			searchVo.setApplicationStatus(
					StatusRegistration.getStatusCode(registrationDetailsDTO.getApplicationStatus()));
		}
		funPoint(registrationDetailsDTO.getTrNo(), searchVo::setTrNo);
		funPoint(registrationDetailsDTO.getPrNo(), searchVo::setPrNo);

		return searchVo;
	}

	public CitizenSearchReportVO convertSpecificFieldsForCitizenSearch(
			StagingRegistrationDetailsDTO stagingRegistrationDetailsDTO, ApplicationSearchVO applicationSearchVO) {
		CitizenSearchReportVO searchVo = new CitizenSearchReportVO();
		if (stagingRegistrationDetailsDTO.getVahanDetails() == null) {
			throw new BadRequestException("vahan details not found in staging details document");
		}
		validateChassisNO(applicationSearchVO, stagingRegistrationDetailsDTO.getVahanDetails());
		funPoint(stagingRegistrationDetailsDTO.getApplicationNo(), searchVo::setApplicationNumber);
		funPoint(stagingRegistrationDetailsDTO.getApplicantDetails().getFirstName(), searchVo::setApplicantName);
		funPoint(stagingRegistrationDetailsDTO.getApplicantDetails().getFatherName(), searchVo::setFatherName);
		if (StringUtils.isNotBlank(stagingRegistrationDetailsDTO.getApplicationStatus())) {
			searchVo.setApplicationStatus(
					StatusRegistration.getStatusCode(stagingRegistrationDetailsDTO.getApplicationStatus()));
		}
		funPoint(stagingRegistrationDetailsDTO.getTrNo(), searchVo::setTrNo);
		return searchVo;
	}

	public StagingRegistrationDetailsVO convertStageVO(StagingRegistrationDetailsDTO dto) {

		StagingRegistrationDetailsVO registrationDetailsVO = new StagingRegistrationDetailsVO();
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
		// funPoint(dto.getAadharNo(), registrationDetailsVO::setAadharNo);
		funPoint(dto.getVehicleType(), registrationDetailsVO::setVehicleType);
		/*
		 * funPoint(dto.getChassisNumber(), registrationDetailsVO::setChassisNumber);
		 * funPoint(dto.getEngineNumber(), registrationDetailsVO::setEngineNumber);
		 * funPoint(dto.getMakersName(), registrationDetailsVO::setMakersName);
		 * funPoint(dto.getMakerClass(), registrationDetailsVO::setMakerClass);
		 * funPoint(dto.getDealerSelectedMakerName(),
		 * registrationDetailsVO::setDealerSelectedMakerName);
		 * funPoint(dto.getDealerSelectedMakerClass(),
		 * registrationDetailsVO::setDealerSelectedMakerClass);
		 */
		funPoint(dto.getClassOfVehicle(), registrationDetailsVO::setClassOfVehicle);
		funPoint(dto.getClassOfVehicleDesc(), registrationDetailsVO::setClassOfVehicleDesc);
		funPoint(dto.getTaxType(), registrationDetailsVO::setTaxType);
		/*
		 * funPoint(dto.getBodyType(), registrationDetailsVO::setBodyType);
		 * funPoint(dto.getManufacturedMonthYear(),
		 * registrationDetailsVO::setManufacturedMonthYear);
		 */
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

		funPoint(dto.getInsuranceType(), registrationDetailsVO::setInsuranceType);

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
		funPoint(dto.getIsAvailablePresentAddrsProof(), registrationDetailsVO::setIsAvailablePresentAddrsProof);
		funPoint(dto.getPresentAddrsProofBelongsTo(), registrationDetailsVO::setPresentAddrsProofBelongsTo);
		funPoint(dto.getNameOfPresentAddrsProofBelongsTo(), registrationDetailsVO::setNameOfPresentAddrsProofBelongsTo);

		if (dto.getFlowDetails() != null) {
			registrationDetailsVO.setFlowDetails(flowMapper.convertEntity(dto.getFlowDetails()));
		}
		if (dto.getFlowDetailsLog() != null) {
			registrationDetailsVO.setFlowDetailsLog(flowMapper.convertEntity(dto.getFlowDetailsLog()));
		}

		funPoint(dto.getIsPanRequired(), registrationDetailsVO::setIsPanRequired);
		funPoint(dto.getIsSecondVehicleDisplayCheck(), registrationDetailsVO::setIsSecondVehicleDisplayCheck);
		if (dto.getRejectionHistory() != null) {
			registrationDetailsVO.setRejectionHistory(rejectionHistoryMapper.convertEntity(dto.getRejectionHistory()));
		}
		if (dto.getRejectionHistoryLog() != null) {
			registrationDetailsVO
					.setRejectionHistoryLog(rejectionHistoryMapper.convertEntity(dto.getRejectionHistoryLog()));
		}
		funPoint(dto.isSecondVehicleTaxPaid(), registrationDetailsVO::setSecondVehicleTaxPaid);
		funPoint(dto.isCardPrinted(), registrationDetailsVO::setCardPrinted);
		if (dto.getRegistrationValidity() != null) {
			registrationDetailsVO
					.setRegistrationValidity(registrationValidityMapper.convertEntity(dto.getRegistrationValidity()));
		}

		/*
		 * if (dto.getPermitDetails() != null) {
		 * registrationDetailsVO.setPermitDetails(permitDetailsMapper.convertEntity(dto.
		 * getPermitDetails())); }
		 */
		if (dto.getVehicleDetails() != null) {
			registrationDetailsVO.setVehicleDetails(vehicleDetailsMapper.convertEntity(dto.getVehicleDetails()));
		}
		funPoint(dto.getIsCentralGovernamentOrDefenceEmployee(),
				registrationDetailsVO::setIsCentralGovernamentOrDefenceEmployee);
		funPoint(dto.getLastName(), registrationDetailsVO::setLastName);
		funPoint(dto.getApprovalStage(), registrationDetailsVO::setApprovalStage);
		funPoint(dto.isBodyBuilding(), registrationDetailsVO::setBodyBuilding);
		if (dto.getPucDetailsDTO() != null) {
			registrationDetailsVO.setPucDetailsVO(pUCDetailsMapper.convertEntity(dto.getPucDetailsDTO()));
		}
		if (dto.getNocDetails() != null) {
			registrationDetailsVO.setNocDetails(nocDetailsMapper.convertEntity(dto.getNocDetails()));
		}
		funPoint(dto.isAllowForOtherServiceByDataEntry(), registrationDetailsVO::setAllowForOtherServiceByDataEntry);
		funPoint(dto.isApprovedByAutomation(), registrationDetailsVO::setApprovedByAutomation);
		return registrationDetailsVO;

	}

	public CitizenApplicationSearchResponceVO converSpecificicFireldForReport(RegistrationDetailsDTO dto) {
		CitizenApplicationSearchResponceVO vo = new CitizenApplicationSearchResponceVO();
		funPoint(dto.getPrNo(), vo::setRegistraionNumber);
		if (dto.getOwnerType().equals(OwnerTypeEnum.Individual)) {
			funPoint(dto.getApplicantDetails().getFirstName(), vo::setOwnerName);
		} else {
			funPoint(dto.getApplicantDetails().getEntityName(), vo::setOwnerName);
		}
		funPoint(dto.getOwnerType(), vo::setOwnerType);
		funPoint(dto.getTrNo(), vo::setTrNo);
		funPoint(dto.getClassOfVehicle(), vo::setClassOfVehicleCode);
		funPoint(dto.getClassOfVehicleDesc(), vo::setClassOfVehicle);
		funPoint(dto.getVahanDetails().getMakersDesc(), vo::setMakerName);
		funPoint(dto.getVahanDetails().getMakersModel(), vo::setMakerClass);
		funPoint(dto.getVahanDetails().getManufacturedMonthYear(), vo::setMonthAndYear);

		funPoint(dto.getVahanDetails().getGvw(), vo::setRlw);

		funPoint(dto.getOfficeDetails().getOfficeName(), vo::setRegistrationAuthority);
		funPoint(dto.getVahanDetails().getColor(), vo::setColor);
		funPoint(dto.getVahanDetails().getFuelDesc(), vo::setFuelType);
		if (dto.getFinanceDetails() != null && StringUtils.isNotBlank(dto.getFinanceDetails().getFinancerName())) {
			vo.setFinancierName(dto.getFinanceDetails().getFinancerName());
		}
		if (dto.getRegistrationValidity() != null && dto.getRegistrationValidity().getPrGeneratedDate() != null) {
			vo.setDateOfRegistration(dto.getRegistrationValidity().getPrGeneratedDate());
			if (dto.getRegistrationValidity().getRegistrationValidity() != null) {
				vo.setRegistrationValidUpto(dto.getRegistrationValidity().getRegistrationValidity().toLocalDate());
			}
		}

		if (dto.getApplicantDetails().getPresentAddress() != null) {
			vo.setPresentAddress(applicantAddressMapper.convertEntity(dto.getApplicantDetails().getPresentAddress()));
		}

		if (dto.getApplicantDetails() != null) {
			funPoint(dto.getApplicantDetails().getGender(), vo::setGender);
			funPoint(dto.getApplicantDetails().getDisplayName(), vo::setDisplayName);
			if (dto.getApplicantDetails().getContact() != null) {
				funPoint(dto.getApplicantDetails().getContact().getMobile(), vo::setMobile);
			}
		}
		if (dto.getOfficeDetails() != null) {
			funPoint(dto.getOfficeDetails().getOfficeName(), vo::setOfficeName);
			funPoint(dto.getOfficeDetails().getOfficeCode(), vo::setOfficeCode);
		}
		return vo;
	}

	public Optional<RegistrationDetailsVO> convertVehicleDetails(RegistrationDetailsDTO dto) {

		RegistrationDetailsVO registrationDetailsVO = new RegistrationDetailsVO();

		funPoint(dto.getApplicationNo(), registrationDetailsVO::setApplicationNo);
		funPoint(dto.getClassOfVehicle(), registrationDetailsVO::setClassOfVehicle);
		funPoint(dto.getApplicationNo(), registrationDetailsVO::setApplicationNo);
		funPoint(dto.getVehicleType(), registrationDetailsVO::setVehicleType);
		funPoint(dto.getPrNo(), registrationDetailsVO::setPrNo);
		funPoint(dto.getTrNo(), registrationDetailsVO::setTrNo);
		funPoint(dto.getTrValidUpto(), registrationDetailsVO::setTrValidUpto);

		if (dto.getInsuranceDetails() != null)
			registrationDetailsVO.setInsuranceDetails(insuranceMapper.convertEntity(dto.getInsuranceDetails()));

		if (dto.getApplicantDetails() != null)
			registrationDetailsVO.setApplicantDetails(this.convertApplicantDetails(dto.getApplicantDetails()));

		if (dto.getVehicleDetails() != null)
			funPoint(vehicleDetailsMapper.convertEntity(dto.getVehicleDetails()),
					registrationDetailsVO::setVehicleDetails);
		if (dto.getPucDetailsDTO() != null)
			funPoint(pUCDetailsMapper.convertEntity(dto.getPucDetailsDTO()), registrationDetailsVO::setPucDetailsVO);
		if (dto.getInvoiceDetails() != null)
			funPoint(invoiceDetailsMapper.convertEntity(dto.getInvoiceDetails()),
					registrationDetailsVO::setInvoiceDetails);
		if (dto.getRegistrationValidity() != null)
			funPoint(registrationValidityMapper.convertEntity(dto.getRegistrationValidity()),
					registrationDetailsVO::setRegistrationValidity);

		if (dto.getVahanDetails() != null)
			funPoint(vahanDetailsMapper.convertEntity(dto.getVahanDetails()), registrationDetailsVO::setVahanDetails);
		if (dto.getOfficeDetails() != null) {
			funPoint(officeDetailsMapper.convertEntity(dto.getOfficeDetails()),
					registrationDetailsVO::setOfficeDetails);
		}
		if (dto.getOwnerType() != null) {
			funPoint(dto.getOwnerType(), registrationDetailsVO::setOwnerType);
		}
		return Optional.of(registrationDetailsVO);
	}

	public ApplicantDetailsVO convertApplicantDetails(ApplicantDetailsDTO dto) {
		ApplicantDetailsVO ownerDetils = new ApplicantDetailsVO();
		BeanUtils.copyProperties(dto, ownerDetils);
		if (dto.getContact() != null) {
			ownerDetils.setContact(contactMapper.convertEntity(dto.getContact()));
		}
		if (dto.getPresentAddress() != null)
			ownerDetils.setPermanantAddress(applicantAddressMapper.convertEntity(dto.getPresentAddress()));
		if (dto.getOtherStateAddress() != null)
			ownerDetils.setPresentAddress(applicantAddressMapper.convertEntity(dto.getOtherStateAddress()));
		return ownerDetils;

	}

	public TrGeneratedReportDTO convertTrgenratedReportDTO(StagingRegistrationDetailsDTO dto) {
		TrGeneratedReportDTO trReportDTO = new TrGeneratedReportDTO();
		if (dto.getApplicantDetails() != null) {

			funPoint(dto.getApplicantDetails().getApplicantNo(), trReportDTO::setApplicantNo);
			funPoint(dto.getApplicantDetails().getDisplayName(), trReportDTO::setApplicantDisplayName);
			funPoint(dto.getApplicantDetails().getFirstName(), trReportDTO::setApplicantFirstName);
			funPoint(dto.getApplicantDetails().getLastName(), trReportDTO::setApplicantLastName);
			funPoint(dto.getApplicantDetails().getMiddleName(), trReportDTO::setApplicantMiddleName);
			funPoint(dto.getApplicantDetails().getFatherName(), trReportDTO::setApplicantFatherName);

			if (dto.getApplicantDetails().getContact() != null) {

				funPoint(dto.getApplicantDetails().getContact().getMobile(), trReportDTO::setApplicantMobile);
				funPoint(dto.getApplicantDetails().getContact().getPhone(), trReportDTO::setApplicantPhone);
				funPoint(dto.getApplicantDetails().getContact().getAlternateMobile(),
						trReportDTO::setApplicantAlternateMobile);
				funPoint(dto.getApplicantDetails().getContact().getEmail(), trReportDTO::setApplicantEmail);

			}

			if (dto.getApplicantDetails().getQualification() != null) {

				funPoint(dto.getApplicantDetails().getBloodGrp().getSlNo(), trReportDTO::setBloodSlNo);
				funPoint(dto.getApplicantDetails().getBloodGrp().getBloodGrpName(), trReportDTO::setBloodGrpName);
			}

			funPoint(dto.getApplicantDetails().getIsDifferentlyAbled(), trReportDTO::setIsDifferentlyAbled);

			if (dto.getApplicantDetails().getPresentAddress() != null) {

				trReportDTO.setApplicantDoorNo(dto.getApplicantDetails().getPresentAddress().getDoorNo());
				trReportDTO.setApplicantStreetName(dto.getApplicantDetails().getPresentAddress().getStreetName());
				trReportDTO.setApplicantTownOrCity(dto.getApplicantDetails().getPresentAddress().getTownOrCity());
				trReportDTO.setApplicantOtherCountry(dto.getApplicantDetails().getPresentAddress().getOtherCountry());
				trReportDTO.setApplicantOtherState(dto.getApplicantDetails().getPresentAddress().getOtherState());
				trReportDTO.setApplicantOtherDistrict(dto.getApplicantDetails().getPresentAddress().getOtherDistrict());
				trReportDTO.setApplicantOtherMandal(dto.getApplicantDetails().getPresentAddress().getOtherMandal());
				trReportDTO.setApplicantOtherVillage(dto.getApplicantDetails().getPresentAddress().getOtherVillage());
				trReportDTO.setApplicantOtherPinCode(dto.getApplicantDetails().getPresentAddress().getOtherPinCode());

				if (dto.getApplicantDetails().getPresentAddress().getMandal() != null) {
					funPoint(dto.getApplicantDetails().getPresentAddress().getMandal().getMandalCode(),
							trReportDTO::setApplicantMandalCode);
					funPoint(dto.getApplicantDetails().getPresentAddress().getMandal().getMandalName(),
							trReportDTO::setApplicantMandalName);
				}
				if (dto.getApplicantDetails().getPresentAddress().getDistrict() != null) {
					funPoint(dto.getApplicantDetails().getPresentAddress().getDistrict().getDistricCode(),
							trReportDTO::setApplicantDistricCode);
					funPoint(dto.getApplicantDetails().getPresentAddress().getDistrict().getDistrictName(),
							trReportDTO::setApplicantDistrictName);
				}
				if (dto.getApplicantDetails().getPresentAddress().getState() != null) {
					funPoint(dto.getApplicantDetails().getPresentAddress().getState().getStateId(),
							trReportDTO::setApplicantStateId);
					funPoint(dto.getApplicantDetails().getPresentAddress().getState().getStateName(),
							trReportDTO::setApplicantStateName);
				}
				if (dto.getApplicantDetails().getPresentAddress().getCountry() != null) {
					funPoint(dto.getApplicantDetails().getPresentAddress().getCountry().getCountryId(),
							trReportDTO::setApplicantCountryId);
					funPoint(dto.getApplicantDetails().getPresentAddress().getCountry().getCountryName(),
							trReportDTO::setApplicantCountryName);
				}
				if (dto.getApplicantDetails().getPresentAddress().getPostOffice() != null) {
					funPoint(dto.getApplicantDetails().getPresentAddress().getPostOffice().getPostOfficeCode(),
							trReportDTO::setApplicantPostOfficeCode);
					funPoint(dto.getApplicantDetails().getPresentAddress().getPostOffice().getPostOfficeId(),
							trReportDTO::setApplicantPostOfficeId);
					funPoint(dto.getApplicantDetails().getPresentAddress().getPostOffice().getPostOfficeName(),
							trReportDTO::setApplicantPostOfficeName);
				}
				if (dto.getApplicantDetails().getPresentAddress().getVillage() != null) {
					funPoint(dto.getApplicantDetails().getPresentAddress().getVillage().getVillageCode(),
							trReportDTO::setApplicantVillageCode);
					funPoint(dto.getApplicantDetails().getPresentAddress().getVillage().getVillageId(),
							trReportDTO::setApplicantVillageId);
					funPoint(dto.getApplicantDetails().getPresentAddress().getVillage().getVillageName(),
							trReportDTO::setApplicantVillageName);
				}

			}
			if (dto.getApplicantDetails().getAadharResponse() != null) {

				trReportDTO.setApplicantAadharResponse(dto.getApplicantDetails().getAadharResponse());
			}

			funPoint(dto.getApplicantDetails().getIsAadhaarValidated(), trReportDTO::setIsAadhaarValidated);

			// funPoint(dto.getApplicantDetails().getStatus(),
			// trReportDTO::setApplicantStatus);

			funPoint(dto.getApplicantDetails().getNationality(), trReportDTO::setNationality);
			funPoint(dto.getApplicantDetails().getSameAsAadhar(), trReportDTO::setSameAsAadhar);
			funPoint(dto.getApplicantDetails().getAadharNo(), trReportDTO::setApplicantAadharNo);
			funPoint(dto.getApplicantDetails().getGender(), trReportDTO::setApplicantGender);
			funPoint(dto.getApplicantDetails().getDateOfBirth(), trReportDTO::setApplicantDateOfBirth);
			// funPoint(dto.getApplicantDetails().getDocumentId(),
			// trReportDTO::setApplicantDocumentId);
			// funPoint(dto.getApplicantDetails().getCreatedDate(),
			// trReportDTO::setApplicantCreatedDate);
			funPoint(dto.getApplicantDetails().getIsAvailablePresentAddrsProof(),
					trReportDTO::setIsAvailablePresentAddrsProof);
			funPoint(dto.getApplicantDetails().getPresentAddrsProofBelongsTo(),
					trReportDTO::setApplicantPresentAddrsProofBelongsTo);
			funPoint(dto.getApplicantDetails().getNameOfPresentAddrsProofBelongsTo(),
					trReportDTO::setApplicantNameOfPresentAddrsProofBelongsTo);

			funPoint(dto.getApplicantDetails().getRepresentativeName(), trReportDTO::setRepresentativeName);
			funPoint(dto.getApplicantDetails().getRepresentativeName(), trReportDTO::setRepresentativeName);
			funPoint(dto.getApplicantDetails().getCreatedDate(), trReportDTO::setApplicantCreatedDate);
			funPoint(dto.getApplicantDetails().getlUpdate(), trReportDTO::setApplicantLUpdate);
			funPoint(dto.getApplicantDetails().getCreatedDateStr(), trReportDTO::setApplicantcreatedDateStr);
//			if (dto.getApplicantDetails().getOwnerContact() != null) {
//
//				trReportDTO.setApplicantOwnerContact(contactMapper.convertdto.getApplicantDetails()(dto.getApplicantDetails().getOwnerContact()));
//			}
		}

		funPoint(dto.getApplicationNo(), trReportDTO::setApplicationNo);
		funPoint(dto.getApplicationNo(), trReportDTO::setApplicationId);
		funPoint(dto.getApplicationStatus(), trReportDTO::setApplicationStatus);
		funPoint(dto.getIteration(), trReportDTO::setIteration);
		funPoint(dto.getOwnerType(), trReportDTO::setOwnerType);
		funPoint(dto.getIsTrailer(), trReportDTO::setIsTrailer);
		funPoint(dto.getVehicleType(), trReportDTO::setVehicleType);
		funPoint(dto.getClassOfVehicle(), trReportDTO::setClassOfVehicle);
		funPoint(dto.getClassOfVehicleDesc(), trReportDTO::setClassOfVehicleDesc);
		funPoint(dto.getTaxType(), trReportDTO::setTaxType);
		funPoint(dto.getTaxAmount(), trReportDTO::setTaxAmount);
		funPoint(dto.getTaxvalidity(), trReportDTO::setTaxvalidity);
		funPoint(dto.getCesFee(), trReportDTO::setCesFee);
		funPoint(dto.getCesValidity(), trReportDTO::setCesValidity);
		funPoint(dto.getIsFinancier(), trReportDTO::setIsFinancier);
		funPoint(dto.getTrNo(), trReportDTO::setTrNo);
		funPoint(dto.getStageNo(), trReportDTO::setStageNo);
		funPoint(dto.getPrNo(), trReportDTO::setPrNo);

		funPoint(dto.getSpecialNumberRequired(), trReportDTO::setSpecialNumberRequired);
		funPoint(dto.getIsAvailablePresentAddrsProof(), trReportDTO::setIsAvailablePresentAddrsProof);
		funPoint(dto.getPresentAddrsProofBelongsTo(), trReportDTO::setPresentAddrsProofBelongsTo);
		funPoint(dto.getNameOfPresentAddrsProofBelongsTo(), trReportDTO::setNameOfPresentAddrsProofBelongsTo);
		funPoint(dto.getIsPanRequired(), trReportDTO::setIsPanRequired);
		funPoint(dto.getIsSecondVehicleDisplayCheck(), trReportDTO::setIsSecondVehicleDisplayCheck);
		funPoint(dto.isSecondVehicleTaxPaid(), trReportDTO::setSecondVehicleTaxPaid);
		funPoint(dto.isCardPrinted(), trReportDTO::setCardPrinted);
		funPoint(dto.isAllowForOtherServiceByDataEntry(), trReportDTO::setAllowForOtherServiceByDataEntry);
		funPoint(dto.getIsCentralGovernamentOrDefenceEmployee(), trReportDTO::setIsCentralGovernamentOrDefenceEmployee);
		funPoint(dto.getLastName(), trReportDTO::setLastName);
		funPoint(dto.getApprovalStage(), trReportDTO::setApprovalStage);
		funPoint(dto.isBodyBuilding(), trReportDTO::setBodyBuilding);
		if (dto.getOfficeDetails() != null) {
			funPoint(dto.getOfficeDetails().getOfficeCode(), trReportDTO::setOfficeCode);
			funPoint(dto.getOfficeDetails().getOfficeName(), trReportDTO::setOfficeName);

			funPoint(dto.getOfficeDetails().getOfficeAddress1(), trReportDTO::setOfficeAddress1);
			funPoint(dto.getOfficeDetails().getOfficeAddress2(), trReportDTO::setOfficeAddress2);
			funPoint(dto.getOfficeDetails().getOfficeVillage(), trReportDTO::setOfficeVillage);
			funPoint(dto.getOfficeDetails().getOfficeMandal(), trReportDTO::setOfficeMandal);
			funPoint(dto.getOfficeDetails().getOfficeCity(), trReportDTO::setOfficeCity);

		}

		if (dto.getInvoiceDetails() != null) {
			funPoint(dto.getInvoiceDetails().getInvoiceNo(), trReportDTO::setInvoiceNo);
			funPoint(dto.getInvoiceDetails().getInvoiceValue(), trReportDTO::setInvoiceValue);
			funPoint(dto.getInvoiceDetails().getInvoiceDate(), trReportDTO::setInvoiceDate);
			funPoint(dto.getInvoiceDetails().getInvoiceDateForOther(), trReportDTO::setInvoiceDateForOther);

		}

		if (dto.getFinanceDetails() != null) {
			funPoint(dto.getFinanceDetails().getFinancerName(), trReportDTO::setFinancerName);
			funPoint(dto.getFinanceDetails().getUserId(), trReportDTO::setFinancierUserId);
			funPoint(dto.getFinanceDetails().getToken(), trReportDTO::setFinancierTokenNo);
			funPoint(dto.getFinanceDetails().getTokenGeneratedTime(), trReportDTO::setFinancierTokenGeneratedTime);
			funPoint(dto.getFinanceDetails().getAddress(), trReportDTO::setFinancieraddress);
			funPoint(dto.getFinanceDetails().getSanctionedAmount(), trReportDTO::setFinanciersanctionedAmount);
			funPoint(dto.getFinanceDetails().getAgreementDate(), trReportDTO::setFinancierAgreementDate);
			funPoint(dto.getFinanceDetails().getLastUpdated(), trReportDTO::setFinancierLastUpdated);
			funPoint(dto.getFinanceDetails().getComments(), trReportDTO::setFinancierComments);
			funPoint(dto.getFinanceDetails().getQuotationValue(), trReportDTO::setFinancierQuotationValue);
		}
		funPoint(dto.getDealerDetails().getDealerId(), trReportDTO::setDealerId);
		funPoint(dto.getTrGeneratedDate(), trReportDTO::setTrGeneratedDate);
		funPoint(dto.getPaymentTransactionNo(), trReportDTO::setPaymentTransactionNo);

		if (dto.getVahanDetails() != null) {
			funPoint(dto.getVahanDetails().getBodyTypeDesc(), trReportDTO::setBodyTypeDesc);
			funPoint(dto.getVahanDetails().getChassisNumber(), trReportDTO::setChassisNumber);
			funPoint(dto.getVahanDetails().getColor(), trReportDTO::setColor);
			funPoint(dto.getVahanDetails().getCubicCapacity(), trReportDTO::setCubicCapacity);
			funPoint(dto.getVahanDetails().getEngineNumber(), trReportDTO::setEngineNumber);
			funPoint(dto.getVahanDetails().getFinancer(), trReportDTO::setFinancer);
			funPoint(dto.getVahanDetails().getFirstName(), trReportDTO::setFirstName);
			funPoint(dto.getVahanDetails().getFitUpto(), trReportDTO::setFitUpto);
			funPoint(dto.getVahanDetails().getFuelDesc(), trReportDTO::setFuelDesc);
			funPoint(dto.getVahanDetails().getInsuranceCompany(), trReportDTO::setInsuranceCompany);
			funPoint(dto.getVahanDetails().getInsurancePolicyNumber(), trReportDTO::setInsurancePolicyNumber);
			funPoint(dto.getVahanDetails().getInsuranceUpto(), trReportDTO::setInsuranceUpto);
			funPoint(dto.getVahanDetails().getMakersModel(), trReportDTO::setMakersModel);
			if (StringUtils.isNotBlank(dto.getVahanDetails().getMakersDesc())) {
				funPoint(dto.getVahanDetails().getMakersDesc().toUpperCase(), trReportDTO::setMakersDesc);
			}
			funPoint(dto.getVahanDetails().getManufacturedMonthYear(), trReportDTO::setManufacturedMonthYear);
			funPoint(dto.getVahanDetails().getModel(), trReportDTO::setModel);
			funPoint(dto.getVahanDetails().getName(), trReportDTO::setName);
			funPoint(dto.getVahanDetails().getNoCyl(), trReportDTO::setNoCyl);
			funPoint(dto.getVahanDetails().getOwnerName(), trReportDTO::setOwnerName);
			funPoint(dto.getVahanDetails().getOwnerSr(), trReportDTO::setOwnerSr);
			// funPoint(dto.getVahanDetails() .getPermanentAddress(),
			// trReportDTO::setPermanentAddress);
			funPoint(dto.getVahanDetails().getPresentAddress(), trReportDTO::setPresentAddress);
			funPoint(dto.getVahanDetails().getRegisteredAt(), trReportDTO::setRegisteredAt);
			funPoint(dto.getVahanDetails().getRegistrationDate(), trReportDTO::setRegistrationDate);
			// funPoint(dto.getVahanDetails() .getRegistrationNumber(),
			// trReportDTO::setRegistrationNumber);
			funPoint(dto.getVahanDetails().getGvw(), trReportDTO::setGvw);
			funPoint(dto.getVahanDetails().getSeatingCapacity(), trReportDTO::setSeatingCapacity);
			funPoint(dto.getVahanDetails().getSleeperCapacity(), trReportDTO::setSleeperCapacity);
			funPoint(dto.getVahanDetails().getStandCapacity(), trReportDTO::setStandCapacity);
			funPoint(dto.getVahanDetails().getStatusAsOn(), trReportDTO::setStatusAsOn);
			funPoint(dto.getVahanDetails().getStatusMessage(), trReportDTO::setStatusMessage);
			funPoint(dto.getVahanDetails().getTaxUpto(), trReportDTO::setTaxUpto);
			funPoint(dto.getVahanDetails().getUnladenWeight(), trReportDTO::setUnladenWeight);
			funPoint(dto.getVahanDetails().getVehicleClass(), trReportDTO::setVehicleClass);
			funPoint(dto.getVahanDetails().getWheelbase(), trReportDTO::setWheelbase);
			funPoint(dto.getVahanDetails().isUsed(), trReportDTO::setUsed);

			/** newly added **/
			funPoint(dto.getVahanDetails().getWheelbase(), trReportDTO::setWheelbase);
			funPoint(dto.getVahanDetails().getEnginePower(), trReportDTO::setEnginePower);
			funPoint(dto.getVahanDetails().getFrontAxleDesc(), trReportDTO::setFrontAxleDesc);
			funPoint(dto.getVahanDetails().getFrontAxleWeight(), trReportDTO::setFrontAxleWeight);
			funPoint(dto.getVahanDetails().getGvw(), trReportDTO::setGvw);
			funPoint(dto.getVahanDetails().getHeight(), trReportDTO::setHeight);
			funPoint(dto.getVahanDetails().getLength(), trReportDTO::setLength);
			funPoint(dto.getVahanDetails().getFuelDesc(), trReportDTO::setFuelDesc);

			funPoint(dto.getVahanDetails().getPollutionNormsDesc(), trReportDTO::setPollutionNormsDesc);
			funPoint(dto.getVahanDetails().getO1AxleDesc(), trReportDTO::setO1AxleDesc);
			funPoint(dto.getVahanDetails().getO1AxleWeight(), trReportDTO::setO1AxleWeight);
			funPoint(dto.getVahanDetails().getO2AxleDesc(), trReportDTO::setO2AxleDesc);
			funPoint(dto.getVahanDetails().getO2AxleWeight(), trReportDTO::setO2AxleWeight);
			funPoint(dto.getVahanDetails().getO3AxleDesc(), trReportDTO::setO3AxleDesc);
			funPoint(dto.getVahanDetails().getO3AxleWeight(), trReportDTO::setO3AxleWeight);
			funPoint(dto.getVahanDetails().getO4AxleDesc(), trReportDTO::setO4AxleDesc);
			funPoint(dto.getVahanDetails().getO4AxleWeight(), trReportDTO::setO4AxleWeight);
			funPoint(dto.getVahanDetails().getO5AxleDesc(), trReportDTO::setO5AxleDesc);
			funPoint(dto.getVahanDetails().getO5AxleWeight(), trReportDTO::setO5AxleWeight);
			funPoint(dto.getVahanDetails().getO5AxleDesc(), trReportDTO::setO5AxleDesc);
			funPoint(dto.getVahanDetails().getO5AxleWeight(), trReportDTO::setO5AxleWeight);
			funPoint(dto.getVahanDetails().getRearAxleDesc(), trReportDTO::setRearAxleDesc);
			funPoint(dto.getVahanDetails().getRearAxleWeight(), trReportDTO::setRearAxleWeight);
			funPoint(dto.getVahanDetails().getUnladenWeight(), trReportDTO::setUnladenWeight);
			funPoint(dto.getVahanDetails().getWidth(), trReportDTO::setWidth);
			funPoint(dto.getVahanDetails().getTandemAxelDescp(), trReportDTO::setTandemAxelDescp);
			funPoint(dto.getVahanDetails().getTandemAxelWeight(), trReportDTO::setTandemAxelWeight);
			funPoint(dto.getVahanDetails().getDealerSelectedMakerName(), trReportDTO::setDealerSelectedMakerName);
			funPoint(dto.getVahanDetails().getDealerSelectedMakerClass(), trReportDTO::setDealerSelectedMakerClass);
			funPoint(dto.getVahanDetails().getDealerSelectedBodyType(), trReportDTO::setDealerSelectedBodyType);

			funPoint(dto.getVahanDetails().getMakersName(), trReportDTO::setMakersName);
			funPoint(dto.getVahanDetails().getDealerCovType(), trReportDTO::setDealerCovType);
			funPoint(dto.getVahanDetails().getExShowroomPrice(), trReportDTO::setExShowroomPrice);
//				if (dto.getVahanDetails().getTrailerChassisDetailsDTO() != null) {
//					funPoint(dto.getVahanDetails().getTrailerChassisDetailsDTO().get, trReportDTO::setGvw);
//					funPoint(dto.getVahanDetails().getTrailerChassisDetailsDTO().getChassisNo(), trReportDTO::setChassisNo);
//					funPoint(dto.getVahanDetails().getTrailerChassisDetailsDTO().getGtw(), trReportDTO::setGtw);
//					funPoint(dto.getVahanDetails().getTrailerChassisDetailsDTO().getUlw(), trReportDTO::setUlw);
//					funPoint(dto.getVahanDetails().getTrailerChassisDetailsDTO().getMakerName(), trReportDTO::setMakerName);
//					funPoint(dto.getVahanDetails().getTrailerChassisDetailsDTO().getColour(), trReportDTO::setColor);
//				}
//				if (dto.getVahanDetails().getHarvestersDetails() != null) {
//					trReportDTO.setHarvestersDetails(
//							harvestersDetailsMapper.convertEntity(dto.getVahanDetails() .getHarvestersDetails()));
//				}
			funPoint(dto.getVahanDetails().getOldGvw(), trReportDTO::setOldGvw);

		}
		if (dto.getPanDetails() != null) {
			funPoint(dto.getPanDetails().getPanNo(), trReportDTO::setPanNo);
			funPoint(dto.getPanDetails().isPanVerifiedInOnlne(), trReportDTO::setPanVerifiedInOnlne);
		}
		if (dto.getInsuranceDetails() != null) {
			funPoint(dto.getInsuranceDetails().getCompany(), trReportDTO::setInsuranceCompany);
//				funPoint(dto.getInsuranceDetails().getId(), trReportDTO::setInsurance);
			funPoint(dto.getInsuranceDetails().getPolicyNumber(), trReportDTO::setInsurancePolicyNumber);
			funPoint(dto.getInsuranceDetails().getPolicyType(), trReportDTO::setInsurancePolicyType);
			funPoint(dto.getInsuranceDetails().getTenure(), trReportDTO::setInsuranceTenure);
			funPoint(dto.getInsuranceDetails().getValidTill(), trReportDTO::setInsuranceValidTill);
			funPoint(dto.getInsuranceDetails().getValidFrom(), trReportDTO::setInsuranceValidFrom);
			funPoint(dto.getInsuranceDetails().getValidTillForOther(), trReportDTO::setInsuranceValidTillForOther);
			funPoint(dto.getInsuranceDetails().getValidFromForOther(), trReportDTO::setInsuranceValidFromForOther);
		}

		funPoint(dto.getCreatedDate(), trReportDTO::setCreatedDate);
		funPoint(dto.getModifiedDate(), trReportDTO::setModifiedDate);
		funPoint(dto.getlUpdate(), trReportDTO::setlUpdate);

//			if (dto.getNocDetails() != null) {
//				registrationDetailsVO.setNocDetails(nocDetailsMapper.convertEntity(dto.getNocDetails()));
//			}
//			
//			if (dto.getCovHistory() != null) {
//				registrationDetailsVO.setCovHistory(classOfVehiclesLogMapper.convertEntity(dto.getCovHistory()));
//			}
//		
		return trReportDTO;
	}

	public RegDtlsForMiningVO convertRegDetailsmaining(PermitDetailsDTO permitDetailsDTO,
			RegistrationDetailsDTO registrationDetailsDTO, FcDetailsDTO fcDetailsDTO, TaxDetailsDTO taxDetailsDTO) {

		RegDtlsForMiningVO vo = new RegDtlsForMiningVO();

		vo.setPrNo(registrationDetailsDTO.getPrNo());

		if (registrationDetailsDTO.getVahanDetails() != null) {

			vo.setFuel(replaceDefaults(registrationDetailsDTO.getVahanDetails().getFuelDesc() == null ? StringUtils.EMPTY
					: registrationDetailsDTO.getVahanDetails().getFuelDesc()));

			vo.setMakersClass(replaceDefaults(
					registrationDetailsDTO.getVahanDetails().getMakersModel() == null ? StringUtils.EMPTY
							: registrationDetailsDTO.getVahanDetails().getMakersModel()));

			vo.setMakersName(
					replaceDefaults(registrationDetailsDTO.getVahanDetails().getMakersDesc() == null ? StringUtils.EMPTY
							: registrationDetailsDTO.getVahanDetails().getMakersDesc()));

			vo.setEngineNo(replaceDefaults(
					registrationDetailsDTO.getVahanDetails().getEngineNumber() == null ? StringUtils.EMPTY
							: registrationDetailsDTO.getVahanDetails().getEngineNumber()));

			vo.setChassisNo(replaceDefaults(
					registrationDetailsDTO.getVahanDetails().getChassisNumber() == null ? StringUtils.EMPTY
							: registrationDetailsDTO.getVahanDetails().getChassisNumber()));

			vo.setGvw(replaceDefaults(registrationDetailsDTO.getVahanDetails().getGvw() == null ? StringUtils.EMPTY
					: registrationDetailsDTO.getVahanDetails().getGvw().toString()));

			vo.setUlw(replaceDefaults(
					registrationDetailsDTO.getVahanDetails().getUnladenWeight() == null ? StringUtils.EMPTY
							: registrationDetailsDTO.getVahanDetails().getUnladenWeight().toString()));

			vo.setMakeYear(replaceDefaults(registrationDetailsDTO.getVahanDetails().getManufacturedMonthYear() == null
					? StringUtils.EMPTY
					: "01-" + registrationDetailsDTO.getVahanDetails().getManufacturedMonthYear().substring(0, 2) + "-"
							+ registrationDetailsDTO.getVahanDetails().getManufacturedMonthYear().substring(2, 6)));

		}

		if (registrationDetailsDTO.getApplicantDetails() != null) {

			vo.setOwnerName(replaceDefaults(
					registrationDetailsDTO.getApplicantDetails().getDisplayName() == null ? StringUtils.EMPTY
							: registrationDetailsDTO.getApplicantDetails().getDisplayName()));

			vo.setFatherName(replaceDefaults(
					registrationDetailsDTO.getApplicantDetails().getFatherName() == null ? StringUtils.EMPTY
							: registrationDetailsDTO.getApplicantDetails().getFatherName()));

			vo.setMobileNo(replaceDefaults(
					registrationDetailsDTO.getApplicantDetails().getContact().getMobile() == null ? StringUtils.EMPTY
							: registrationDetailsDTO.getApplicantDetails().getContact().getMobile()));

			if (registrationDetailsDTO.getApplicantDetails().getPresentAddress() != null) {
				vo.setAddress(replaceDefaults(
						registrationDetailsDTO.getApplicantDetails().getPresentAddress().getDoorNo() == null
								? StringUtils.EMPTY
								: registrationDetailsDTO.getApplicantDetails().getPresentAddress().getDoorNo())
						+ " , "
						+ replaceDefaults(
								registrationDetailsDTO.getApplicantDetails().getPresentAddress().getTownOrCity() == null
										? StringUtils.EMPTY
										: registrationDetailsDTO.getApplicantDetails().getPresentAddress()
												.getTownOrCity().toUpperCase())

						+ " , "
						+ replaceDefaults(
								registrationDetailsDTO.getApplicantDetails().getPresentAddress().getStreetName() == null
										? StringUtils.EMPTY
										: registrationDetailsDTO.getApplicantDetails().getPresentAddress()
												.getStreetName().toUpperCase())
						+ " , "
						+ replaceDefaults(registrationDetailsDTO.getApplicantDetails().getPresentAddress().getMandal()
								.getMandalName() == null
										? StringUtils.EMPTY
										: registrationDetailsDTO.getApplicantDetails().getPresentAddress().getMandal()
												.getMandalName().toUpperCase())
						+ " , "
						+ replaceDefaults(registrationDetailsDTO.getApplicantDetails().getPresentAddress().getDistrict()
								.getDistrictName() == null ? StringUtils.EMPTY
										: registrationDetailsDTO.getApplicantDetails().getPresentAddress().getDistrict()
												.getDistrictName()));
			}
		}

		vo.setVehicleClass(replaceDefaults(registrationDetailsDTO.getClassOfVehicleDesc() == null ? StringUtils.EMPTY
				: registrationDetailsDTO.getClassOfVehicleDesc()));
		
		vo.setVehicleType(replaceDefaults(registrationDetailsDTO.getVehicleType() == null ? StringUtils.EMPTY
				: registrationDetailsDTO.getVehicleType().equalsIgnoreCase("T") ? "TRANSPORT"
						: registrationDetailsDTO.getVehicleType().equalsIgnoreCase("N") ? "NON TRANSPORT"
								: StringUtils.EMPTY));

		if (registrationDetailsDTO.getPrGeneratedDate() != null) {
			vo.setRegistrationDate(registrationDetailsDTO.getPrGeneratedDate().toLocalDate());
		}

		if (fcDetailsDTO.getFcValidUpto() != null) {
			vo.setFcValidUpto(fcDetailsDTO.getFcValidUpto());
		}
		if (permitDetailsDTO.getPermitValidityDetails() != null
				&& permitDetailsDTO.getPermitValidityDetails().getPermitValidTo() != null) {
			vo.setPermitValidUpto(permitDetailsDTO.getPermitValidityDetails().getPermitValidTo());
		}
		if (taxDetailsDTO.getTaxPeriodEnd() != null) {
			vo.setTaxValidUpto(taxDetailsDTO.getTaxPeriodEnd());
		}

		return vo;
	}
	
	public FinanceSeedDetailsVO convertLimitedFieldsForRegistration(
			RegistrationDetailsDTO registrationDetailsDTO) {
		FinanceSeedDetailsVO vo = new FinanceSeedDetailsVO();
		if (registrationDetailsDTO.getApplicantDetails()!=null && StringUtils.isNotBlank(registrationDetailsDTO.getApplicantDetails().getDisplayName())) {
			vo.setUserName(registrationDetailsDTO.getApplicantDetails().getDisplayName());
		}
		funPoint(registrationDetailsDTO.getClassOfVehicle(), vo::setClassOfVehicle);
		funPoint(registrationDetailsDTO.getClassOfVehicleDesc(), vo::setClassOfVehicleDesc);
		funPoint(registrationDetailsDTO.getVehicleType(), vo::setVehicleType);
		if (registrationDetailsDTO.getVahanDetails()!=null && StringUtils.isNotBlank(registrationDetailsDTO.getVahanDetails().getMakersModel())) {
			vo.setMakersModel(registrationDetailsDTO.getVahanDetails().getMakersModel());
		}
		if (registrationDetailsDTO.getVahanDetails()!=null && StringUtils.isNotBlank(registrationDetailsDTO.getVahanDetails().getChassisNumber())) {
			vo.setChassisNo(registrationDetailsDTO.getVahanDetails().getChassisNumber());
		}
		funPoint(registrationDetailsDTO.getPrNo(), vo::setPrNo);
		if (registrationDetailsDTO.getApplicantDetails()!=null && StringUtils.isNotBlank(registrationDetailsDTO.getApplicantDetails().getFatherName())) {
			vo.setFatherName(registrationDetailsDTO.getApplicantDetails().getFatherName());
		}
		if (registrationDetailsDTO.getApplicantDetails().getPresentAddress()!=null) {
			vo.setApplicantAddressVO(applicantAddressMapper.convertEntity(registrationDetailsDTO.getApplicantDetails().getPresentAddress()));
		}
		if (registrationDetailsDTO.getFinanceDetails()!=null) {
			vo.setOfflineFinanceDetails(financeDetailsMapper.convertEntity(registrationDetailsDTO.getFinanceDetails()));
		}
		if (registrationDetailsDTO.getOfficeDetails()!=null && StringUtils.isNotBlank(registrationDetailsDTO.getOfficeDetails().getOfficeCode())) {
			vo.setOfficeCode(registrationDetailsDTO.getOfficeDetails().getOfficeCode());
		}
		
		return vo;
	}
	public List<AadhaarRequestVO> aadharRelatedDataForEPrgathi(List<RegistrationDetailsDTO> regList) {
		List<AadhaarRequestVO> regVOList = new ArrayList<>();
		
		regList.stream().forEach(reg -> {
			RegServiceDTO dto =new RegServiceDTO();
			List<RegServiceDTO> regSerRecords = regServiceDAO.findByPrNo(reg.getPrNo());
			
			if (!regSerRecords.isEmpty()) {
			regSerRecords.sort((s1, s2) -> s2.getlUpdate().compareTo(s1.getlUpdate()));
			 dto = regSerRecords.stream().findFirst().get();
			
			}
			boolean isTrue=dto.getServiceIds().stream().anyMatch(p1 -> p1.equals(ServiceEnum.RCCANCELLATION.getId()) || p1.equals(ServiceEnum.ISSUEOFNOC.getId()));
			
			if(!isTrue) {
				
			
			AadhaarRequestVO vo = new AadhaarRequestVO();
			if (reg.getApplicantDetails() != null) {
				funPoint(reg.getApplicantDetails().getDisplayName(), vo::setName);
				funPoint(reg.getApplicantDetails().getFatherName(), vo::setFatherName);

				if (reg.getApplicantDetails().getPresentAddress() != null) {
					StringBuilder address = new StringBuilder();
					if (StringUtils.isNoneBlank(reg.getApplicantDetails().getPresentAddress().getDoorNo())) {
						address.append("," + reg.getApplicantDetails().getPresentAddress().getDoorNo());
					}

					if (reg.getApplicantDetails().getPresentAddress().getMandal() != null) {
						if (StringUtils.isNoneBlank(
								reg.getApplicantDetails().getPresentAddress().getMandal().getMandalName())) {
							address.append(
									"," + reg.getApplicantDetails().getPresentAddress().getMandal().getMandalName());
						}
					}
					if (reg.getApplicantDetails().getPresentAddress().getDistrict() != null) {
						if (StringUtils.isNoneBlank(
								reg.getApplicantDetails().getPresentAddress().getDistrict().getDistrictName())) {
							address.append(","
									+ reg.getApplicantDetails().getPresentAddress().getDistrict().getDistrictName());
						}
					}
					if (address.length() > 0) {
						address.delete(0, 1);
					}
					vo.setAddress(address.toString());
					vo.setPresentAddress(applicantAddressMapper
							.applicantlimitedFields(reg.getApplicantDetails().getPresentAddress()));
				} else {
					vo.setAddress(StringUtils.EMPTY);
				}
			}
			if (reg.getVahanDetails() != null) {
				funPoint(reg.getVahanDetails().getMakersDesc(), vo::setMakerName);
				funPoint(reg.getVahanDetails().getMakersModel(), vo::setMakerClass);
			}
			funPoint(reg.getApplicantDetails().getAadharNo(), vo::setAadhaarNo);
			funPoint(reg.getClassOfVehicle(), vo::setCovCode);
			funPoint(reg.getClassOfVehicleDesc(), vo::setCovDecription);
			funPoint(reg.getPrNo(), vo::setPrNo);

			funPoint(reg.getVehicleType(), vo::setVehicleType);
			if (reg.getPrGeneratedDate() != null) {
				funPoint(reg.getPrGeneratedDate(), vo::setRegistrationDate);
			}
			regVOList.add(vo);
			}
		});

		return regVOList;
	}
}