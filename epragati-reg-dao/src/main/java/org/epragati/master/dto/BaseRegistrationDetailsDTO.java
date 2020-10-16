package org.epragati.master.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.common.dto.FlowDTO;
import org.epragati.constants.OwnerTypeEnum;
import org.epragati.dispatcher.dto.DispatcherSubmissionDTO;
import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.payment.dto.FeeDetailsDTO;
import org.epragati.permits.dto.PermitDetailsDTO;
import org.epragati.regservice.dto.AlterationDTO;
import org.epragati.regservice.dto.NOCDetailsDTO;
import org.epragati.regservice.dto.PUCDetailsDTO;
import org.epragati.regservice.dto.SlotDetailsDTO;
import org.epragati.regservice.dto.TheftVehicleDetailsDTO;
import org.epragati.sn.vo.BidAlterDetailsVO;
import org.epragati.tax.vo.TaxTypeEnum;
import org.epragati.util.StatusRegistration;
import org.epragati.util.document.KeyValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@Data
@Document(collection = "registration_details")
@CompoundIndexes({
		/*
		 * @CompoundIndex(name = "application_number", def = "{'applicationNo': 1}"),
		 * 
		 * @CompoundIndex(name = "officeDetails_officeCode_and_applicationStatus", def =
		 * "{'officeDetails.officeCode': 1, 'applicationStatus': 1}"),
		 * 
		 * @CompoundIndex(name = "financeDetails_status_and_financeDetails_userId", def
		 * = "{'financeDetails.status': 1, 'financeDetails.userId': 1}"),
		 * 
		 * @CompoundIndex(name =
		 * "lockedDetails_lockedBy_and_lockedDetails_lockedByRole", def =
		 * "{'lockedDetails.lockedBy': 1, 'lockedDetails.lockedByRole': 1}"),
		 * 
		 * @CompoundIndex(name = "stageNo_and_dealerDetails_dealerId", def =
		 * "{'stageNo': 1, 'dealerDetails.dealerId': 1}"),
		 * 
		 * @CompoundIndex(name = "financeDetails_token", def =
		 * "{'financeDetails.token': 1}"),
		 * 
		 * @CompoundIndex(name =
		 * "'vahanDetails_engineNumber_and_vahanDetails_chassisNumber", def =
		 * "{'vahanDetails.engineNumber': 1, 'vahanDetails.chassisNumber': 1}"),
		 * 
		 * @CompoundIndex(name = "trNo", def = "{'trNo': 1}"),
		 * 
		 * @CompoundIndex(name = "trNo_and_applicantDetails_contact_mobile", def =
		 * "{'trNo': 1, 'applicantDetails.contact.mobile': 1}"), // @CompoundIndex(name
		 * = // "insuranceDetails_company_and_insuranceDetails_policyNumber", def = //
		 * "{'insuranceDetails.company': 1, 'insuranceDetails.policyNumber': 1}"),
		 * 
		 * @CompoundIndex(name = "stageNo", def = "{'stageNo': 1}"),
		 * 
		 * @CompoundIndex(name = "applicationNo", def = "{'applicationNo': 1}"),
		 * 
		 * @CompoundIndex(name = "financeDetails_token", def =
		 * "{'financeDetails.token': 1}"),
		 * 
		 * @CompoundIndex(name = "dealerDetails_dealerId_and_applicationNo", def =
		 * "{'dealerDetails.dealerId': 1, 'applicationNo': 1}"),
		 * 
		 * @CompoundIndex(name = "dealerDetails_dealerId_and_trNo", def =
		 * "{'dealerDetails.dealerId': 1, 'trNo': 1}"),
		 * 
		 * @CompoundIndex(name = "dealerId_and_chassisNumber_and_engineNumber", def =
		 * "{'dealerDetails.dealerId': 1, 'vahanDetails.chassisNumber': 1, 'vahanDetails.engineNumber': 1}"
		 * )
		 */
})
public class BaseRegistrationDetailsDTO extends BaseEntity implements Cloneable {

	@Id
	private String applicationNo;

	private String status;

	private boolean isAnyChallan;

	private LocalDate lastChallanDate;

	private PreviousApplicationDetailsDTO previoudApplicationDetais;

	private ApplicantDetailsDTO applicantDetails;

	private String applicationStatus;

	private VahanDetailsDTO vahanDetails;

	private PanDetailsDTO panDetails;

	private Boolean isPanRequired = false;

	private SecondVehicleDetailsDTO secondVehicleDetails;

	private FinanceDetailsDTO financeDetails;

	private Boolean insuranceType = false;

	private InsuranceDetailsDTO insuranceDetails;

	private boolean isAssigned = false;

	private String trNo;

	private String prNo;

	private String oldPrNo;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime prGeneratedDate;

	private Integer stageNo;

	private Integer iteration;

	private boolean iterationFlag;

	private ActionDetailsDTO actionDetails;

	private List<ActionDetailsDTO> actionDetailsLog;

	private String vehicleType;

	private OwnerTypeEnum ownerType;

	private List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures;

	private FlowDTO flowDetails;

	private List<FlowDTO> flowDetailsLog;

	private List<LockedDetailsDTO> lockedDetails;

	private Boolean isTrailer = false;

	private String classOfVehicle;

	private String classOfVehicleDesc;

	private String taxType;

	private HSRPStatusDTO hsrpStatusDetails;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime trGeneratedDate;

	private InvoiceDetailsDTO invoiceDetails;

	private OfficeDTO officeDetails;

	private DealerDetailsDTO dealerDetails;

	private Long taxAmount;
	private Long taxArrears;

	private Boolean isFinancier = false;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate taxvalidity;

	private RejectionHistoryDTO rejectionHistory;

	private List<RejectionHistoryDTO> rejectionHistoryLog;

	private Long cesFee;

	private Double hsrpfee;

	private LocalDate cesValidity;

	private Boolean specialNumberRequired = false;

	private DisabledDataDTO disabledData;

	private Boolean isAvailablePresentAddrsProof = false;

	private String presentAddrsProofBelongsTo;

	private String nameOfPresentAddrsProofBelongsTo;

	private RegistrationValidityDTO registrationValidity;

	private boolean secondVehicleTaxPaid;
	private Boolean isSecondVehicleDisplayCheck;

	private boolean isRejectedByEnclosure;

	private boolean isCfstSync;

	private PermitDetailsDTO permitDetails;

	private VehicleDetailsDTO vehicleDetails;

	private boolean isCardPrinted;

	private boolean isDuplicate;

	private Boolean isCentralGovernamentOrDefenceEmployee = Boolean.FALSE;
	private String lastName;

	private AlterationDTO alterVehicleDetails;

	private SlotDetailsDTO slotDetails;

	private List<SlotDetailsDTO> slotDetailsLog;

	private String gatewayTypeEnum;

	// NN , PN, SN
	private String prType;

	private boolean bodyBuilding;

	private FeeDetailsDTO feeDetails;

	private String approvalStage;

	private Long penalty;
	private Long penaltyArrears;

	private boolean diffTaxPaid = false;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate prIssueDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate prValidUpto;

	private String prIssuingAuthority;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate trIssueDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate trValidUpto;

	private String trIssuingAuthority;

	private boolean isRegVehicleWithPR;
	private boolean isRegVehicleWithTR;

	private boolean isTaxPaidByVcr;

	private List<BidAlterDetailsVO> bidAlterDetails;

	private List<BidAlterDetailsVO> bidAlterDetailsLogs;

	private PUCDetailsDTO pucDetailsDTO;

	private boolean isDataInsertedByDataEntry;

	private Boolean isTrExpired;

	private LocalDateTime reassignmentDoneDate;

	private List<Integer> serviceIds;

	private NOCDetailsDTO nocDetails;

	private List<PrBackUpDetailsDTO> prBackUpDetailsList;

	private boolean isAllowForOtherServiceByDataEntry;

	private boolean isAllowForReassignment = Boolean.FALSE;

	private String paymentTransactionNo;
	private boolean isRequiredToBlock;

	private String actionStatus;

	private StatusRegistration.TheftState theftState;

	private TheftVehicleDetailsDTO theftDetails;

	private LocalDateTime terminationDate;
	private LocalDateTime agreementDate;
	private boolean isCfxIssued = Boolean.FALSE;
	private TaxTypeEnum.TaxPayType payTaxType;

	private boolean isVehicleStoppaged = Boolean.FALSE;
	private LocalDate stoppageDate;

	private long taxExemMonths;
	private boolean isVehicleStoppageRevoked = Boolean.FALSE;
	private LocalDate vehicleStoppageRevokedDate;

	private String permitActionStatus;

	private boolean isCardDispatched;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDateTime cardPrintedDate;

	private String applicantType;
	private DispatcherSubmissionDTO dispatcherFormSubmissionDTO;

	private Boolean isActive;
	
	private Boolean isduplicateRecord;

	private boolean isMVIDoneForIvcn = false;

	private boolean isFromReassigment;

	private boolean isNeedToUpdatePrNoInFc;

	private String movedSource;

	private List<String> schedulerIssues;

	private boolean isWeightAltDone;

	private Boolean isvahanSync = Boolean.FALSE;

	private List<ClassOfVehiclesLogDTO> covHistory;

	private Boolean isvahanSyncSkip = Boolean.FALSE;

	private boolean isApprovedByAutomation;

	private boolean bodyBuildingDone;
	
	private List<String> jsonPaths;
	
	private boolean isRcCancelled = Boolean.FALSE;
	
	private Boolean isScNoGenerated = Boolean.FALSE;
	
	private LocalDate autoApprovalInitiatedDate;

	private LocalDate autoActionDate;

	private String autoActionStatus;
	
	private String processActionStatus;
	
	private String stageCarriageType;
	
	private String reqAuthType;

	public String getProcessActionStatus() {
		return processActionStatus;
	}

	public void setProcessActionStatus(String processActionStatus) {
		this.processActionStatus = processActionStatus;
	}

	public LocalDate getAutoApprovalInitiatedDate() {
		return autoApprovalInitiatedDate;
	}

	public void setAutoApprovalInitiatedDate(LocalDate autoApprovalInitiatedDate) {
		this.autoApprovalInitiatedDate = autoApprovalInitiatedDate;
	}

	public LocalDate getAutoActionDate() {
		return autoActionDate;
	}

	public void setAutoActionDate(LocalDate autoActionDate) {
		this.autoActionDate = autoActionDate;
	}

	public String getAutoActionStatus() {
		return autoActionStatus;
	}

	public void setAutoActionStatus(String autoActionStatus) {
		this.autoActionStatus = autoActionStatus;
	}

	public boolean isRcCancelled() {
		return isRcCancelled;
	}

	public void setRcCancelled(boolean isRcCancelled) {
		this.isRcCancelled = isRcCancelled;
	}

	public LocalDate getRcCancelledDate() {
		return rcCancelledDate;
	}

	public void setRcCancelledDate(LocalDate rcCancelledDate) {
		this.rcCancelledDate = rcCancelledDate;
	}

	private LocalDate rcCancelledDate;

	public List<String> getJsonPaths() {
		return jsonPaths;
	}

	public void setJsonPaths(List<String> jsonPaths) {
		this.jsonPaths = jsonPaths;
	}

	public boolean isBodyBuildingDone() {
		return bodyBuildingDone;
	}

	public void setBodyBuildingDone(boolean bodyBuildingDone) {
		this.bodyBuildingDone = bodyBuildingDone;
	}

	public boolean isApprovedByAutomation() {
		return isApprovedByAutomation;
	}

	public void setApprovedByAutomation(boolean isApprovedByAutomation) {
		this.isApprovedByAutomation = isApprovedByAutomation;
	}

	public Boolean getIsvahanSyncSkip() {
		return isvahanSyncSkip;
	}

	public void setIsvahanSyncSkip(Boolean isvahanSyncSkip) {
		this.isvahanSyncSkip = isvahanSyncSkip;
	}

	/**
	 * @return the isvahanSync
	 */
	public Boolean getIsvahanSync() {
		return isvahanSync;
	}

	/**
	 * @param isvahanSync the isvahanSync to set
	 */
	public void setIsvahanSync(Boolean isvahanSync) {
		this.isvahanSync = isvahanSync;
	}

	public DispatcherSubmissionDTO getDispatcherFormSubmissionDTO() {
		return dispatcherFormSubmissionDTO;
	}

	public void setDispatcherFormSubmissionDTO(DispatcherSubmissionDTO dispatcherFormSubmissionDTO) {
		this.dispatcherFormSubmissionDTO = dispatcherFormSubmissionDTO;
	}

	public boolean isCardDispatched() {
		return isCardDispatched;
	}

	public void setCardDispatched(boolean isCardDispatched) {
		this.isCardDispatched = isCardDispatched;
	}

	public LocalDateTime getTerminationDate() {
		return terminationDate;
	}

	public void setTerminationDate(LocalDateTime terminationDate) {
		this.terminationDate = terminationDate;
	}

	public LocalDateTime getAgreementDate() {
		return agreementDate;
	}

	public void setAgreementDate(LocalDateTime agreementDate) {
		this.agreementDate = agreementDate;
	}

	public boolean isRequiredToBlock() {
		return isRequiredToBlock;
	}

	public void setRequiredToBlock(boolean isRequiredToBlock) {
		this.isRequiredToBlock = isRequiredToBlock;
	}

	/**
	 * @return the nocDetails
	 */
	public NOCDetailsDTO getNocDetails() {
		return nocDetails;
	}

	/**
	 * @param nocDetails the nocDetails to set
	 */
	public void setNocDetails(NOCDetailsDTO nocDetails) {
		this.nocDetails = nocDetails;
	}

	/**
	 * @return the prBackUpDetailsList
	 */
	public List<PrBackUpDetailsDTO> getPrBackUpDetailsList() {
		return prBackUpDetailsList;
	}

	/**
	 * @param prBackUpDetailsList the prBackUpDetailsList to set
	 */
	public void setPrBackUpDetailsList(List<PrBackUpDetailsDTO> prBackUpDetailsList) {
		this.prBackUpDetailsList = prBackUpDetailsList;
	}

	public List<Integer> getServiceIds() {
		return serviceIds;
	}

	public void setServiceIds(List<Integer> serviceIds) {
		this.serviceIds = serviceIds;
	}

	public boolean isDataInsertedByDataEntry() {
		return isDataInsertedByDataEntry;
	}

	public void setDataInsertedByDataEntry(boolean isDataInsertedByDataEntry) {
		this.isDataInsertedByDataEntry = isDataInsertedByDataEntry;
	}

	public boolean isTaxPaidByVcr() {
		return isTaxPaidByVcr;
	}

	public void setTaxPaidByVcr(boolean isTaxPaidByVcr) {
		this.isTaxPaidByVcr = isTaxPaidByVcr;
	}

	public boolean isRegVehicleWithPR() {
		return isRegVehicleWithPR;
	}

	public void setRegVehicleWithPR(boolean isRegVehicleWithPR) {
		this.isRegVehicleWithPR = isRegVehicleWithPR;
	}

	public boolean isRegVehicleWithTR() {
		return isRegVehicleWithTR;
	}

	public void setRegVehicleWithTR(boolean isRegVehicleWithTR) {
		this.isRegVehicleWithTR = isRegVehicleWithTR;
	}

	public LocalDate getTrIssueDate() {
		return trIssueDate;
	}

	public void setTrIssueDate(LocalDate trIssueDate) {
		this.trIssueDate = trIssueDate;
	}

	public LocalDate getTrValidUpto() {
		return trValidUpto;
	}

	public void setTrValidUpto(LocalDate trValidUpto) {
		this.trValidUpto = trValidUpto;
	}

	public String getTrIssuingAuthority() {
		return trIssuingAuthority;
	}

	public void setTrIssuingAuthority(String trIssuingAuthority) {
		this.trIssuingAuthority = trIssuingAuthority;
	}

	public LocalDate getPrIssueDate() {
		return prIssueDate;
	}

	public void setPrIssueDate(LocalDate prIssueDate) {
		this.prIssueDate = prIssueDate;
	}

	public LocalDate getPrValidUpto() {
		return prValidUpto;
	}

	public void setPrValidUpto(LocalDate prValidUpto) {
		this.prValidUpto = prValidUpto;
	}

	public String getPrIssuingAuthority() {
		return prIssuingAuthority;
	}

	public void setPrIssuingAuthority(String prIssuingAuthority) {
		this.prIssuingAuthority = prIssuingAuthority;
	}

	/**
	 * @return the diffTaxPaid
	 */
	public boolean isDiffTaxPaid() {
		return diffTaxPaid;
	}

	/**
	 * @param diffTaxPaid the diffTaxPaid to set
	 */
	public void setDiffTaxPaid(boolean diffTaxPaid) {
		this.diffTaxPaid = diffTaxPaid;
	}

	/**
	 * @return the penalty
	 */
	public Long getPenalty() {
		return penalty;
	}

	/**
	 * @param penalty the penalty to set
	 */
	public void setPenalty(Long penalty) {
		this.penalty = penalty;
	}

	public String getApprovalStage() {
		return approvalStage;
	}

	public void setApprovalStage(String approvalStage) {
		this.approvalStage = approvalStage;
	}

	/**
	 * @return the feeDetails
	 */
	public FeeDetailsDTO getFeeDetails() {
		return feeDetails;
	}

	/**
	 * @param feeDetails the feeDetails to set
	 */
	public void setFeeDetails(FeeDetailsDTO feeDetails) {
		this.feeDetails = feeDetails;
	}

	/**
	 * @return the prType
	 */
	public String getPrType() {
		return prType;
	}

	/**
	 * @return the reassignmentDoneDate
	 */
	public LocalDateTime getReassignmentDoneDate() {
		return reassignmentDoneDate;
	}

	/**
	 * @param reassignmentDoneDate the reassignmentDoneDate to set
	 */
	public void setReassignmentDoneDate(LocalDateTime reassignmentDoneDate) {
		this.reassignmentDoneDate = reassignmentDoneDate;
	}

	/**
	 * @param prType the prType to set
	 */
	public void setPrType(String prType) {
		this.prType = prType;
	}

	/**
	 * @return the alterVehicleDetails
	 */
	public AlterationDTO getAlterVehicleDetails() {
		return alterVehicleDetails;
	}

	/**
	 * @param alterVehicleDetails the alterVehicleDetails to set
	 */
	public void setAlterVehicleDetails(AlterationDTO alterVehicleDetails) {
		this.alterVehicleDetails = alterVehicleDetails;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the vehicleDetails
	 */
	public VehicleDetailsDTO getVehicleDetails() {
		return vehicleDetails;
	}

	/**
	 * @param vehicleDetails the vehicleDetails to set
	 */
	public void setVehicleDetails(VehicleDetailsDTO vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	/**
	 * @return the permitDetails
	 */

	public PermitDetailsDTO getPermitDetails() {
		return permitDetails;
	}

	/**
	 * @param permitDetails the permitDetails to set
	 */
	public void setPermitDetails(PermitDetailsDTO permitDetails) {
		this.permitDetails = permitDetails;
	}

	/**
	 * @return the iterationFlag
	 */
	public boolean isIterationFlag() {
		return iterationFlag;
	}

	/**
	 * @param iterationFlag the iterationFlag to set
	 */
	public void setIterationFlag(boolean iterationFlag) {
		this.iterationFlag = iterationFlag;
	}

	/**
	 * @return the secondVehicleTaxPaid
	 */
	public boolean isSecondVehicleTaxPaid() {
		return secondVehicleTaxPaid;
	}

	/**
	 * @param secondVehicleTaxPaid the secondVehicleTaxPaid to set
	 */
	public void setSecondVehicleTaxPaid(boolean secondVehicleTaxPaid) {
		this.secondVehicleTaxPaid = secondVehicleTaxPaid;
	}

	/**
	 * @return the cesFee
	 */
	public Long getCesFee() {
		return cesFee;
	}

	/**
	 * @param cesFee the cesFee to set
	 */
	public void setCesFee(Long cesFee) {
		this.cesFee = cesFee;
	}

	/**
	 * @return the cesValidity
	 */
	public LocalDate getCesValidity() {
		return cesValidity;
	}

	/**
	 * @param cesValidity the cesValidity to set
	 */
	public void setCesValidity(LocalDate cesValidity) {
		this.cesValidity = cesValidity;
	}

	/**
	 * @return the rejectionHistory
	 */
	public RejectionHistoryDTO getRejectionHistory() {
		return rejectionHistory;
	}

	/**
	 * @param rejectionHistory the rejectionHistory to set
	 */
	public void setRejectionHistory(RejectionHistoryDTO rejectionHistory) {
		this.rejectionHistory = rejectionHistory;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @return the lockedDetails
	 */
	public List<LockedDetailsDTO> getLockedDetails() {
		return lockedDetails;
	}

	/**
	 * @param lockedDetails the lockedDetails to set
	 */
	public void setLockedDetails(List<LockedDetailsDTO> lockedDetails) {
		this.lockedDetails = lockedDetails;
	}

	/**
	 * @return the taxvalidity
	 */
	public LocalDate getTaxvalidity() {
		return taxvalidity;
	}

	/**
	 * @param taxvalidity the taxvalidity to set
	 */
	public void setTaxvalidity(LocalDate taxvalidity) {
		this.taxvalidity = taxvalidity;
	}

	/**
	 * @return the taxAmount
	 */
	public Long getTaxAmount() {
		return taxAmount;
	}

	/**
	 * @param taxAmount the taxAmount to set
	 */
	public void setTaxAmount(Long taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getApplicationNo() {
		return applicationNo;
	}

	/**
	 * @return the trGeneratedDate
	 */
	public LocalDateTime getTrGeneratedDate() {
		return trGeneratedDate;
	}

	/**
	 * @param trGeneratedDate the trGeneratedDate to set
	 */
	public void setTrGeneratedDate(LocalDateTime trGeneratedDate) {
		this.trGeneratedDate = trGeneratedDate;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public ApplicantDetailsDTO getApplicantDetails() {
		return applicantDetails;
	}

	/**
	 * @return the isFirstVehicle
	 */

	/**
	 * @param isFirstVehicle the isFirstVehicle to set
	 */

	public void setApplicantDetails(ApplicantDetailsDTO applicantDetails) {
		this.applicantDetails = applicantDetails;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	/**
	 * @return the enclosures
	 */
	public List<KeyValue<String, List<ImageEnclosureDTO>>> getEnclosures() {
		return enclosures;
	}

	/**
	 * @param enclosures the enclosures to set
	 */
	public void setEnclosures(List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures) {
		this.enclosures = enclosures;
	}

	/**
	 * @return the enclosure
	 */

	/**
	 * @param enclosure the enclosure to set
	 */

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public VahanDetailsDTO getVahanDetails() {
		return vahanDetails;
	}

	public void setVahanDetails(VahanDetailsDTO vahanDetails) {
		this.vahanDetails = vahanDetails;
	}

	public PanDetailsDTO getPanDetails() {
		return panDetails;
	}

	public void setPanDetails(PanDetailsDTO panDetails) {
		this.panDetails = panDetails;
	}

	public FinanceDetailsDTO getFinanceDetails() {
		return financeDetails;
	}

	public void setFinanceDetails(FinanceDetailsDTO financeDetails) {
		this.financeDetails = financeDetails;
	}

	public InsuranceDetailsDTO getInsuranceDetails() {
		return insuranceDetails;
	}

	public void setInsuranceDetails(InsuranceDetailsDTO insuranceDetails) {
		this.insuranceDetails = insuranceDetails;
	}

	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public Integer getStageNo() {
		return stageNo;
	}

	public void setStageNo(Integer stageNo) {
		this.stageNo = stageNo;
	}

	public Integer getIteration() {
		return iteration;
	}

	public void setIteration(Integer iteration) {
		this.iteration = iteration;
	}

	public ActionDetailsDTO getActionDetails() {
		return actionDetails;
	}

	public void setActionDetails(ActionDetailsDTO actionDetails) {
		this.actionDetails = actionDetails;
	}

	public List<ActionDetailsDTO> getActionDetailsLog() {
		return actionDetailsLog;
	}

	public void setActionDetailsLog(List<ActionDetailsDTO> actionDetailsList) {
		this.actionDetailsLog = actionDetailsList;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	/*
	 * public List<KeyValue<String, List<ImageEnclosureDTO>>> getEnclosures() {
	 * return enclosures; }
	 * 
	 * public void setEnclosures(List<KeyValue<String, List<ImageEnclosureDTO>>>
	 * enclosures) { this.enclosures = enclosures; }
	 */
	public FlowDTO getFlowDetails() {
		return flowDetails;
	}

	/**
	 * @return the isFirstVehicle
	 */
	public Boolean getIsFirstVehicle() {
		return isFirstVehicle;
	}

	/**
	 * @param isFirstVehicle the isFirstVehicle to set
	 */
	public void setIsFirstVehicle(Boolean isFirstVehicle) {
		this.isFirstVehicle = isFirstVehicle;
	}

	public void setFlowDetails(FlowDTO flowDetails) {
		this.flowDetails = flowDetails;
	}

	public List<FlowDTO> getFlowDetailsLog() {
		if (flowDetailsLog == null)
			flowDetailsLog = new ArrayList<FlowDTO>();

		return flowDetailsLog;
	}

	public void setFlowDetailsLog(List<FlowDTO> flowDetailsLog) {
		this.flowDetailsLog = flowDetailsLog;
	}

	public Boolean getIsTrailer() {
		return isTrailer;
	}

	public void setIsTrailer(Boolean isTrailer) {
		this.isTrailer = isTrailer;
	}

	/*
	 * public String getAadharNo() { return aadharNo; }
	 * 
	 * public void setAadharNo(String aadharNo) { this.aadharNo = aadharNo; }
	 */

	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	/**
	 * @return the ownerType
	 */
	public OwnerTypeEnum getOwnerType() {
		return ownerType;
	}

	/**
	 * @param ownerType the ownerType to set
	 */
	public void setOwnerType(OwnerTypeEnum ownerType) {
		this.ownerType = ownerType;
	}

	public InvoiceDetailsDTO getInvoiceDetails() {
		return invoiceDetails;
	}

	public void setInvoiceDetails(InvoiceDetailsDTO invoiceDetails) {
		
		this.invoiceDetails = invoiceDetails;
	}

	public OfficeDTO getOfficeDetails() {
		return officeDetails;
	}

	public void setOfficeDetails(OfficeDTO officeDetails) {
		this.officeDetails = officeDetails;
	}

	public DealerDetailsDTO getDealerDetails() {
		return dealerDetails;
	}

	public void setDealerDetails(DealerDetailsDTO dealerDetails) {
		this.dealerDetails = dealerDetails;
	}

	/**
	 * @return the isFinancier
	 */
	public Boolean getIsFinancier() {
		return isFinancier;
	}

	/**
	 * @param isFinancier the isFinancier to set
	 */
	public void setIsFinancier(Boolean isFinancier) {
		this.isFinancier = isFinancier;
	}

	/**
	 * @return the isAssigned
	 */
	public boolean isAssigned() {
		return isAssigned;
	}

	/**
	 * @param isAssigned the isAssigned to set
	 */
	public void setAssigned(boolean isAssigned) {
		this.isAssigned = isAssigned;
	}

	/**
	 * @return the numberPreferenceType
	 */

	/**
	 * @return the hsrpfee
	 */
	public Double getHsrpfee() {
		return hsrpfee;
	}

	/**
	 * @param hsrpfee the hsrpfee to set
	 */
	public void setHsrpfee(Double hsrpfee) {
		this.hsrpfee = hsrpfee;
	}

	/**
	 * @return the secondVehicleDetails
	 */
	public SecondVehicleDetailsDTO getSecondVehicleDetails() {
		return secondVehicleDetails;
	}

	private Boolean isFirstVehicle;

	/**
	 * @param secondVehicleDetails the secondVehicleDetails to set
	 */
	public void setSecondVehicleDetails(SecondVehicleDetailsDTO secondVehicleDetails) {
		this.secondVehicleDetails = secondVehicleDetails;
	}

	/**
	 * @return the hsrpStatusDetails
	 */
	public HSRPStatusDTO getHsrpStatusDetails() {
		return hsrpStatusDetails;
	}

	/**
	 * @param hsrpStatusDetails the hsrpStatusDetails to set
	 */
	public void setHsrpStatusDetails(HSRPStatusDTO hsrpStatusDetails) {
		this.hsrpStatusDetails = hsrpStatusDetails;
	}

	/**
	 * @return the disabledData
	 */
	public DisabledDataDTO getDisabledData() {
		return disabledData;
	}

	/**
	 * @param disabledData the disabledData to set
	 */
	public void setDisabledData(DisabledDataDTO disabledData) {
		this.disabledData = disabledData;
	}

	/**
	 * @return the prGeneratedDate
	 */
	public LocalDateTime getPrGeneratedDate() {
		if (prGeneratedDate == null) {
			if (registrationValidity != null && registrationValidity.getPrGeneratedDate() != null) {
				prGeneratedDate = registrationValidity.getPrGeneratedDate().atStartOfDay();
			}
		}
		return prGeneratedDate;
	}

	/**
	 * @param prGeneratedDate the prGeneratedDate to set
	 */
	public void setPrGeneratedDate(LocalDateTime prGeneratedDate) {
		this.prGeneratedDate = prGeneratedDate;
	}

	/**
	 * @return the specialNumberRequired
	 */
	public Boolean getSpecialNumberRequired() {
		return specialNumberRequired;
	}

	/**
	 * @param specialNumberRequired the specialNumberRequired to set
	 */
	public void setSpecialNumberRequired(Boolean specialNumberRequired) {
		this.specialNumberRequired = specialNumberRequired;
	}

	/**
	 * @return the isAvailablePresentAddrsProof
	 */
	public Boolean getIsAvailablePresentAddrsProof() {
		return isAvailablePresentAddrsProof;
	}

	/**
	 * @param isAvailablePresentAddrsProof the isAvailablePresentAddrsProof to set
	 */
	public void setIsAvailablePresentAddrsProof(Boolean isAvailablePresentAddrsProof) {
		this.isAvailablePresentAddrsProof = isAvailablePresentAddrsProof;
	}

	/**
	 * @return the presentAddrsProofBelongsTo
	 */
	public String getPresentAddrsProofBelongsTo() {
		return presentAddrsProofBelongsTo;
	}

	/**
	 * @param presentAddrsProofBelongsTo the presentAddrsProofBelongsTo to set
	 */
	public void setPresentAddrsProofBelongsTo(String presentAddrsProofBelongsTo) {
		this.presentAddrsProofBelongsTo = presentAddrsProofBelongsTo;
	}

	/**
	 * @return the nameOfPresentAddrsProofBelongsTo
	 */
	public String getNameOfPresentAddrsProofBelongsTo() {
		return nameOfPresentAddrsProofBelongsTo;
	}

	/**
	 * @param nameOfPresentAddrsProofBelongsTo the nameOfPresentAddrsProofBelongsTo
	 *                                         to set
	 */
	public void setNameOfPresentAddrsProofBelongsTo(String nameOfPresentAddrsProofBelongsTo) {
		this.nameOfPresentAddrsProofBelongsTo = nameOfPresentAddrsProofBelongsTo;
	}

	/**
	 * @return the registrationValidity
	 */
	public RegistrationValidityDTO getRegistrationValidity() {
		return registrationValidity;
	}

	/**
	 * @param registrationValidity the registrationValidity to set
	 */
	public void setRegistrationValidity(RegistrationValidityDTO registrationValidity) {
		this.registrationValidity = registrationValidity;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Boolean getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(Boolean insuranceType) {
		this.insuranceType = insuranceType;
	}

	public Boolean getIsPanRequired() {
		return isPanRequired;
	}

	public void setIsPanRequired(Boolean isPanRequired) {
		this.isPanRequired = isPanRequired;
	}

	/**
	 * @return the classOfVehicleDesc
	 */
	public String getClassOfVehicleDesc() {
		return classOfVehicleDesc;
	}

	/**
	 * @param classOfVehicleDesc the classOfVehicleDesc to set
	 */
	public void setClassOfVehicleDesc(String classOfVehicleDesc) {
		this.classOfVehicleDesc = classOfVehicleDesc;
	}

	public Boolean getIsSecondVehicleDisplayCheck() {
		return isSecondVehicleDisplayCheck;
	}

	public void setIsSecondVehicleDisplayCheck(Boolean isSecondVehicleDisplayCheck) {
		this.isSecondVehicleDisplayCheck = isSecondVehicleDisplayCheck;
	}

	/**
	 * @return the rejectionHistoryLog
	 */
	public List<RejectionHistoryDTO> getRejectionHistoryLog() {
		return rejectionHistoryLog;
	}

	/**
	 * @param rejectionHistoryLog the rejectionHistoryLog to set
	 */
	public void setRejectionHistoryLog(List<RejectionHistoryDTO> rejectionHistoryLog) {
		this.rejectionHistoryLog = rejectionHistoryLog;
	}

	public boolean isRejectedByEnclosure() {
		return isRejectedByEnclosure;
	}

	public void setRejectedByEnclosure(boolean isRejectedByEnclosure) {
		this.isRejectedByEnclosure = isRejectedByEnclosure;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getLastChallanDate() {
		return lastChallanDate;
	}

	public void setLastChallanDate(LocalDate lastChallanDate) {
		this.lastChallanDate = lastChallanDate;
	}

	public PreviousApplicationDetailsDTO getPrevioudApplicationDetais() {
		return previoudApplicationDetais;
	}

	public void setPrevioudApplicationDetais(PreviousApplicationDetailsDTO previoudApplicationDetais) {
		this.previoudApplicationDetais = previoudApplicationDetais;
	}

	public boolean isAnyChallan() {
		return isAnyChallan;
	}

	public void setAnyChallan(boolean isAnyChallan) {
		this.isAnyChallan = isAnyChallan;
	}

	/**
	 * @return the isCfstSync
	 */
	public boolean isCfstSync() {
		return isCfstSync;
	}

	/**
	 * @param isCfstSync the isCfstSync to set
	 */
	public void setCfstSync(boolean isCfstSync) {
		this.isCfstSync = isCfstSync;
	}

	public boolean isCardPrinted() {
		return isCardPrinted;
	}

	public void setCardPrinted(boolean isCardPrinted) {
		this.isCardPrinted = isCardPrinted;
	}

	/**
	 * @return the isDuplicate
	 */
	public boolean isDuplicate() {
		return isDuplicate;
	}

	/**
	 * @param isDuplicate the isDuplicate to set
	 */
	public void setDuplicate(boolean isDuplicate) {
		this.isDuplicate = isDuplicate;
	}

	/**
	 * @return the slotDetails
	 */
	public SlotDetailsDTO getSlotDetails() {
		return slotDetails;
	}

	/**
	 * @param slotDetails the slotDetails to set
	 */
	public void setSlotDetails(SlotDetailsDTO slotDetails) {
		this.slotDetails = slotDetails;
	}

	/**
	 * @return the slotDetailsLog
	 */
	public List<SlotDetailsDTO> getSlotDetailsLog() {
		return slotDetailsLog;
	}

	/**
	 * @param slotDetailsLog the slotDetailsLog to set
	 */
	public void setSlotDetailsLog(List<SlotDetailsDTO> slotDetailsLog) {
		this.slotDetailsLog = slotDetailsLog;
	}

	/**
	 * @return the gatewayTypeEnum
	 */
	public String getGatewayTypeEnum() {
		return gatewayTypeEnum;
	}

	/**
	 * @param gatewayTypeEnum the gatewayTypeEnum to set
	 */
	public void setGatewayTypeEnum(String gatewayTypeEnum) {
		this.gatewayTypeEnum = gatewayTypeEnum;
	}

	/**
	 * @return the bodyBuilding
	 */
	public boolean isBodyBuilding() {
		return bodyBuilding;
	}

	/**
	 * @param bodyBuilding the bodyBuilding to set
	 */
	public void setBodyBuilding(boolean bodyBuilding) {
		this.bodyBuilding = bodyBuilding;
	}

	/**
	 * @return the bidAlterDetails
	 */
	public List<BidAlterDetailsVO> getBidAlterDetails() {
		return bidAlterDetails;
	}

	/**
	 * @param bidAlterDetails the bidAlterDetails to set
	 */
	public void setBidAlterDetails(List<BidAlterDetailsVO> bidAlterDetails) {
		this.bidAlterDetails = bidAlterDetails;
	}

	/**
	 * @return the pucDetailsDTO
	 */
	public PUCDetailsDTO getPucDetailsDTO() {
		return pucDetailsDTO;
	}

	/**
	 * @param pucDetailsDTO the pucDetailsDTO to set
	 */
	public void setPucDetailsDTO(PUCDetailsDTO pucDetailsDTO) {
		this.pucDetailsDTO = pucDetailsDTO;
	}

	/**
	 * @return the isTrExpired
	 */
	public Boolean getIsTrExpired() {
		return isTrExpired;
	}

	/**
	 * @param isTrExpired the isTrExpired to set
	 */
	public void setIsTrExpired(Boolean isTrExpired) {
		this.isTrExpired = isTrExpired;
	}

	public boolean isAllowForOtherServiceByDataEntry() {
		return isAllowForOtherServiceByDataEntry;
	}

	public void setAllowForOtherServiceByDataEntry(boolean isAllowForOtherServiceByDataEntry) {
		this.isAllowForOtherServiceByDataEntry = isAllowForOtherServiceByDataEntry;
	}

	/**
	 * @return the isAllowForReassignment
	 */
	public boolean isAllowForReassignment() {
		return isAllowForReassignment;
	}

	/**
	 * @param isAllowForReassignment the isAllowForReassignment to set
	 */
	public void setAllowForReassignment(boolean isAllowForReassignment) {
		this.isAllowForReassignment = isAllowForReassignment;
	}

	/**
	 * @return the paymentTransactionNo
	 */
	public String getPaymentTransactionNo() {
		return paymentTransactionNo;
	}

	/**
	 * @param paymentTransactionNo the paymentTransactionNo to set
	 */
	public void setPaymentTransactionNo(String paymentTransactionNo) {
		this.paymentTransactionNo = paymentTransactionNo;
	}

	public String getActionStatus() {
		return actionStatus;
	}

	public void setActionStatus(String actionStatus) {
		this.actionStatus = actionStatus;
	}

	/**
	 * @return the theftState
	 */
	public StatusRegistration.TheftState getTheftState() {
		return theftState;
	}

	/**
	 * @param theftState the theftState to set
	 */
	public void setTheftState(StatusRegistration.TheftState theftState) {
		this.theftState = theftState;
	}

	/**
	 * @return the taxArrears
	 */
	public Long getTaxArrears() {
		return taxArrears;
	}

	/**
	 * @param taxArrears the taxArrears to set
	 */
	public void setTaxArrears(Long taxArrears) {
		this.taxArrears = taxArrears;
	}

	/**
	 * @return the penaltyArrears
	 */
	public Long getPenaltyArrears() {
		return penaltyArrears;
	}

	/**
	 * @param penaltyArrears the penaltyArrears to set
	 */
	public void setPenaltyArrears(Long penaltyArrears) {
		this.penaltyArrears = penaltyArrears;
	}

	public TheftVehicleDetailsDTO getTheftDetails() {
		return theftDetails;
	}

	public void setTheftDetails(TheftVehicleDetailsDTO theftDetails) {
		this.theftDetails = theftDetails;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	/**
	 * @return the isCfxIssued
	 */
	public boolean isCfxIssued() {
		return isCfxIssued;
	}

	/**
	 * @param isCfxIssued the isCfxIssued to set
	 */
	public void setCfxIssued(boolean isCfxIssued) {
		this.isCfxIssued = isCfxIssued;
	}

	public String getPermitActionStatus() {
		return permitActionStatus;
	}

	public void setPermitActionStatus(String permitActionStatus) {
		this.permitActionStatus = permitActionStatus;
	}

	/**
	 * @return the payTaxType
	 */
	public TaxTypeEnum.TaxPayType getPayTaxType() {
		return payTaxType;
	}

	/**
	 * @param payTaxType the payTaxType to set
	 */
	public void setPayTaxType(TaxTypeEnum.TaxPayType payTaxType) {
		this.payTaxType = payTaxType;
	}

	/**
	 * @return the isVehicleStoppaged
	 */
	public boolean isVehicleStoppaged() {
		return isVehicleStoppaged;
	}

	/**
	 * @param isVehicleStoppaged the isVehicleStoppaged to set
	 */
	public void setVehicleStoppaged(boolean isVehicleStoppaged) {
		this.isVehicleStoppaged = isVehicleStoppaged;
	}

	/**
	 * @return the stoppageDate
	 */
	public LocalDate getStoppageDate() {
		return stoppageDate;
	}

	/**
	 * @param stoppageDate the stoppageDate to set
	 */
	public void setStoppageDate(LocalDate stoppageDate) {
		this.stoppageDate = stoppageDate;
	}

	/**
	 * @return the taxExemMonths
	 */
	public long getTaxExemMonths() {
		return taxExemMonths;
	}

	/**
	 * @param taxExemMonths the taxExemMonths to set
	 */
	public void setTaxExemMonths(long taxExemMonths) {
		this.taxExemMonths = taxExemMonths;
	}

	/**
	 * @return the isVehicleStoppageRevoked
	 */
	public boolean isVehicleStoppageRevoked() {
		return isVehicleStoppageRevoked;
	}

	/**
	 * @param isVehicleStoppageRevoked the isVehicleStoppageRevoked to set
	 */
	public void setVehicleStoppageRevoked(boolean isVehicleStoppageRevoked) {
		this.isVehicleStoppageRevoked = isVehicleStoppageRevoked;
	}

	/**
	 * @return the vehicleStoppageRevokedDate
	 */
	public LocalDate getVehicleStoppageRevokedDate() {
		return vehicleStoppageRevokedDate;
	}

	/**
	 * @param vehicleStoppageRevokedDate the vehicleStoppageRevokedDate to set
	 */
	public void setVehicleStoppageRevokedDate(LocalDate vehicleStoppageRevokedDate) {
		this.vehicleStoppageRevokedDate = vehicleStoppageRevokedDate;
	}

	public String getApplicantType() {
		return applicantType;
	}

	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
	}

	/**
	 * @return the isActive
	 */
	public Boolean getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the oldPrNo
	 */
	public String getOldPrNo() {
		return oldPrNo;
	}

	/**
	 * @param oldPrNo the oldPrNo to set
	 */
	public void setOldPrNo(String oldPrNo) {
		this.oldPrNo = oldPrNo;
	}

	public boolean isMVIDoneForIvcn() {
		return isMVIDoneForIvcn;
	}

	public void setMVIDoneForIvcn(boolean isMVIDoneForIvcn) {
		this.isMVIDoneForIvcn = isMVIDoneForIvcn;
	}

	/**
	 * @return the isFromReassigment
	 */
	public boolean isFromReassigment() {
		return isFromReassigment;
	}

	/**
	 * @param isFromReassigment the isFromReassigment to set
	 */
	public void setFromReassigment(boolean isFromReassigment) {
		this.isFromReassigment = isFromReassigment;
	}

	public LocalDateTime getCardPrintedDate() {
		return cardPrintedDate;
	}

	public void setCardPrintedDate(LocalDateTime cardPrintedDate) {
		this.cardPrintedDate = cardPrintedDate;
	}

	/**
	 * @return the isNeedToUpdatePrNoInFc
	 */
	public boolean isNeedToUpdatePrNoInFc() {
		return isNeedToUpdatePrNoInFc;
	}

	/**
	 * @param isNeedToUpdatePrNoInFc the isNeedToUpdatePrNoInFc to set
	 */
	public void setIsNeedToUpdatePrNoInFc(boolean isNeedToUpdatePrNoInFc) {
		this.isNeedToUpdatePrNoInFc = isNeedToUpdatePrNoInFc;
	}

	public String getMovedSource() {
		return movedSource;
	}

	public void setMovedSource(String movedSource) {
		this.movedSource = movedSource;
	}

	/**
	 * @return the schedulerIssues
	 */
	public List<String> getSchedulerIssues() {
		return schedulerIssues;
	}

	/**
	 * @param schedulerIssues the schedulerIssues to set
	 */
	public void setSchedulerIssues(List<String> schedulerIssues) {
		this.schedulerIssues = schedulerIssues;
	}

	public boolean isWeightAltDone() {
		return isWeightAltDone;
	}

	public void setWeightAltDone(boolean isWeightAltDone) {
		this.isWeightAltDone = isWeightAltDone;
	}

	/**
	 * @return the isCentralGovernamentOrDefenceEmployee
	 */
	public Boolean getIsCentralGovernamentOrDefenceEmployee() {
		return isCentralGovernamentOrDefenceEmployee;
	}

	/**
	 * @param isCentralGovernamentOrDefenceEmployee the
	 *                                              isCentralGovernamentOrDefenceEmployee
	 *                                              to set
	 */
	public void setIsCentralGovernamentOrDefenceEmployee(Boolean isCentralGovernamentOrDefenceEmployee) {
		this.isCentralGovernamentOrDefenceEmployee = isCentralGovernamentOrDefenceEmployee;
	}

	public List<BidAlterDetailsVO> getBidAlterDetailsLogs() {
		return bidAlterDetailsLogs;
	}

	public void setBidAlterDetailsLogs(List<BidAlterDetailsVO> bidAlterDetailsLogs) {
		this.bidAlterDetailsLogs = bidAlterDetailsLogs;
	}

	public List<ClassOfVehiclesLogDTO> getCovHistory() {
		return covHistory;
	}

	public void setCovHistory(List<ClassOfVehiclesLogDTO> covHistory) {
		this.covHistory = covHistory;
	}

	public Boolean getIsScNoGenerated() {
		return isScNoGenerated;
	}

	public void setIsScNoGenerated(Boolean isScNoGenerated) {
		this.isScNoGenerated = isScNoGenerated;
	}

	public Boolean getIsduplicateRecord() {
		return isduplicateRecord;
	}

	public void setIsduplicateRecord(Boolean isduplicateRecord) {
		this.isduplicateRecord = isduplicateRecord;
	}

	/**
	 * @return the stageCarriageType
	 */
	public String getStageCarriageType() {
		return stageCarriageType;
	}

	/**
	 * @param stageCarriageType the stageCarriageType to set
	 */
	public void setStageCarriageType(String stageCarriageType) {
		this.stageCarriageType = stageCarriageType;
	}

	public String getReqAuthType() {
		return reqAuthType;
	}

	public void setReqAuthType(String reqAuthType) {
		this.reqAuthType = reqAuthType;
	}
	
	
	
}