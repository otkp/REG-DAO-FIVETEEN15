package org.epragati.regservice.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import org.epragati.cfst.vcr.dao.VcrTaxDetailsDTO;
import org.epragati.common.dto.BaseEntity;
import org.epragati.constants.TransferType;
import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.master.dto.ApplicantAddressDTO;
import org.epragati.master.dto.ApplicantDetailsDTO;
import org.epragati.master.dto.ContactDTO;
import org.epragati.master.dto.FcDetailsDTO;
import org.epragati.master.dto.FinanceDetailsDTO;
import org.epragati.master.dto.InsuranceDetailsDTO;
import org.epragati.master.dto.LockedDetailsDTO;
import org.epragati.master.dto.MasterFCQuestionsDTO;
import org.epragati.master.dto.MasterRcCancellationQuestionsDTO;
import org.epragati.master.dto.MotorDrivingSchoolDTO;
import org.epragati.master.dto.OfficeDTO;
import org.epragati.master.dto.RCCancellationDTO;
import org.epragati.master.dto.RegistrationDetailsDTO;
import org.epragati.master.dto.ShowCauseDetailsDTO;
import org.epragati.payment.dto.BreakPaymentsSaveDTO;
import org.epragati.payment.dto.ChalanaDetailsDTO;
import org.epragati.payment.dto.FeeDetailsDTO;
import org.epragati.permits.dto.OtherStateTemporaryPermitDetailsDTO;
import org.epragati.permits.dto.PermitDetailsDTO;
import org.epragati.tax.vo.TaxTypeEnum;
import org.epragati.util.StatusRegistration;
import org.epragati.util.document.KeyValue;
import org.epragati.util.payment.ServiceEnum;
import org.epragati.vcrImage.dto.OtherVoluntaryTax;
import org.epragati.vcrImage.dto.VoluntaryTaxDTO;
import org.springframework.data.annotation.Id;
//import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author naga.pulaparthi
 *
 */
@Document(collection = "registration_services_approved")
public class RegServiceApprovedDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5813880471210186933L;

	@Id
	private String applicationNo;

	private String aadhaarUid;

	private Boolean isSameAsAadhaar;

	private TheftVehicleDetailsDTO theftDetails;

	private List<TheftVehicleDetailsDTO> theftDetailsLog;

	private String prNo;

	private String aadhaarNo;

	private RegistrationDetailsDTO registrationDetails;

	private ApplicantAddressDTO presentAdderss;

	private OfficeDTO officeDetails;

	private SlotDetailsDTO slotDetails;

	private List<SlotDetailsDTO> slotDetailsLog;

	private FeeDetailsDTO feeDetails;

	private List<FeeDetailsDTO> feeDetailsLog;

	private List<ServiceEnum> serviceType;

	private Set<Integer> serviceIds;

	private ApplicantDetailsDTO basicApplicantDetails;

	private StatusRegistration applicationStatus;

	private AlterationDTO alterationDetails;

	private List<AlterationDTO> alterationDetailsLog;

	private TrasnferOfOwnerShipDTO buyerDetails;

	private Integer iterationCount;

	private String officeCode;

	private List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures;

	private String gatewayType;

	private BreakPaymentsSaveDTO breakPayments;

	private String trNo;

	private String status;

	private List<LockedDetailsDTO> lockedDetails;

	// TODO: Due to indexing name issue changed the name from permitsDetails to
	// pdetails
	private PermitDetailsDTO pdtl;

	private List<PermitDetailsDTO> permitDetailsListDTO;

	private DuplicateDetailsDTO duplicateDetails;

	private FcDetailsDTO fcDetails;

	private NOCDetailsDTO nOCDetails;

	private PUCDetailsDTO pucDetails;

	private TaxDetailsDTO taxDetails;

	private ShowCauseDetailsDTO showCauseDetails;

	private GreenTaxDTO greenTaxDetails;
	private Long taxAmount;
	private Long taxArrears;
	private LocalDate taxvalidity;
	private Long cesFee;
	private LocalDate cesValidity;
	private Long penalty;
	private Long penaltyArrears;
	private String taxType;
	private Long greenTaxAmount;
	private LocalDate greenTaxvalidity;
	private TaxTypeEnum.TaxPayType payTaxType;
	private Long quaterTaxForNewGo;
	private String hptStatus;
	private List<ActionDetails> actionDetails;

	private InsuranceDetailsDTO insuranceDetails;

	private Integer currentIndex;

	private boolean isSpecialNoRequired;
	private boolean isFinancerRequired;

	private FinanceDetailsDTO financeDetails;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDateTime approvedDate;

	private String approvedDateStr;

	private String mviOfficeCode;
	private String oldMviOfficeCode;

	private OfficeDTO mviOfficeDetails;
	private OfficeDTO oldMviOfficeDetails;

	private String previousPrNo;
	private boolean previousPrNoExist;
	private String paymentTransactionNo;

	private String token;
	private ServiceEnum.Flow flowId;

	private boolean isFinancierDoneByOnline;

	private ContactDTO contactDetails;

	private String reasonForChangeOffice;
	private OfficeDTO newOfficeDetails;
	private Boolean isFor2Years;
	private Boolean isFor1Years;
	private Boolean isFor6Months;
	private LocalDate reInspectionDate;
	private Boolean isHPADone = Boolean.FALSE;
	private Boolean isHPTDone = Boolean.FALSE;

	private LocalDateTime tokenGeneratedDate;
	private LocalDate hptTerminatedDate;

	private List<PermitDetailsDTO> permitDetailsLog;
	private List<MasterFCQuestionsDTO> fcQstList;
	private String reasonForRejection;
	private Boolean fitnessOtherStation = Boolean.FALSE;
	private boolean isAllowFcForOtherStation = Boolean.FALSE;
	private boolean isPaidPyamentsForFC = Boolean.FALSE;
	private boolean isCfxIssued = Boolean.FALSE;

	private VehicleStoppageDetailsDTO vehicleStoppageDetails;
	private TransferType.permitTranfer citizenCOAPermitStatus;

	private Set<String> currentRoles;
	private Boolean taxExcemption = Boolean.FALSE;
	private String permitCode;

	private ContactDTO usersContactDetails;

	private boolean isPaidPyamentsForRenewal;
	private boolean isNeedToUpdatePrNoInFc;

	private String freshRcFinanceToken;
	private LocalDate osDateofentry;

	private Boolean citizenPayAcceptance;

	private boolean mviDone = Boolean.FALSE;

	private ApplicationStatusDetails otherStateNOCActionDetails;

	private StatusRegistration otherStateNOCStatus;

	private Boolean otherStateFianContinue;
	private boolean weightAlt;
	private Integer gvw;
	private boolean osNewCombinatonsDataEntry;
	private Boolean osSecondVechicleFoundRTO;
	private Boolean isPRNoRequiredosSVRejected;
	private Boolean isTSApplication;
	private BileteralTaxDTO bileteralTaxDetails;

	private VcrTaxDetailsDTO vcrDetails;

	private List<String> schedulerIssues;
	private List<String> vcrNosList;

	private OtherStateTemporaryPermitDetailsDTO otherStateTemporaryPermitDetails;

	private RCCancellationDTO rcCancellation;

	private LocalDate dateOfCompletion;
	private VoluntaryTaxDTO voluntaryTaxDetails;
	private FreshRcDTO freshRcdetails;

	private Boolean isScNoGenerated = Boolean.FALSE;

	private MotorDrivingSchoolDTO motorDrivingSchoolDTO;

	private List<ChalanaDetailsDTO> challanDetails;

	private LocalDateTime consolidateUpdatedTime;

	private boolean consolidateUpdated;
	private LocalDate lastTaxPaidUpTo;

	private List<MasterRcCancellationQuestionsDTO> rcQuesList;

	private boolean isAoDone;

	private Boolean isOtherState = Boolean.FALSE;

	private String dtcOfficeCode;

	private boolean getOtherStateDataFromVahanService;

	private Boolean recordSyncStatus;
	private Boolean deductionMode;

	private LocalDate autoApprovalInitiatedDate;

	private LocalDate autoActionDate;

	private String autoActionStatus;

	private LocalDateTime cancelledDate;

	private String cancelledIpAddress;

	private String cancelledBy;

	private String cancellationRemarks;
	private OtherVoluntaryTax otherStateVoluntaryTax;

	private String stageCarriageType;

	private String stageCarriageServiceType;
	
	private Boolean isFcReupload;
	
	private String reqSerAuthType;
	
	private Boolean isStoppageReupload;
	
	private String transactionType;
	
	
	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	private Boolean specificVcrPayment= Boolean.FALSE;

	public LocalDateTime getCancelledDate() {
		return cancelledDate;
	}

	public void setCancelledDate(LocalDateTime cancelledDate) {
		this.cancelledDate = cancelledDate;
	}

	public String getCancelledIpAddress() {
		return cancelledIpAddress;
	}

	public void setCancelledIpAddress(String cancelledIpAddress) {
		this.cancelledIpAddress = cancelledIpAddress;
	}

	public String getCancelledBy() {
		return cancelledBy;
	}

	public void setCancelledBy(String cancelledBy) {
		this.cancelledBy = cancelledBy;
	}

	public String getCancellationRemarks() {
		return cancellationRemarks;
	}

	public void setCancellationRemarks(String cancellationRemarks) {
		this.cancellationRemarks = cancellationRemarks;
	}

	/**
	 * @return the recordSyncStatus
	 */
	public Boolean getRecordSyncStatus() {
		return recordSyncStatus;
	}

	/**
	 * @param recordSyncStatus the recordSyncStatus to set
	 */
	public void setRecordSyncStatus(Boolean recordSyncStatus) {
		this.recordSyncStatus = recordSyncStatus;
	}

	/**
	 * @return the getOtherStateDataFromVahanService
	 */
	public boolean isGetOtherStateDataFromVahanService() {
		return getOtherStateDataFromVahanService;
	}

	/**
	 * @param getOtherStateDataFromVahanService the
	 *                                          getOtherStateDataFromVahanService to
	 *                                          set
	 */
	public void setGetOtherStateDataFromVahanService(boolean getOtherStateDataFromVahanService) {
		this.getOtherStateDataFromVahanService = getOtherStateDataFromVahanService;
	}

	public boolean isConsolidateUpdated() {
		return consolidateUpdated;
	}

	public void setConsolidateUpdated(boolean consolidateUpdated) {
		this.consolidateUpdated = consolidateUpdated;
	}

	public String getRecieptNo() {
		return recieptNo;
	}

	public void setRecieptNo(String recieptNo) {
		this.recieptNo = recieptNo;
	}

	private String recieptNo;

	public LocalDateTime getConsolidateUpdatedTime() {
		return consolidateUpdatedTime;
	}

	public void setConsolidateUpdatedTime(LocalDateTime consolidateUpdatedTime) {
		this.consolidateUpdatedTime = consolidateUpdatedTime;
	}

	public List<ChalanaDetailsDTO> getChallanDetails() {
		return challanDetails;
	}

	public void setChallanDetails(List<ChalanaDetailsDTO> challanDetails) {
		this.challanDetails = challanDetails;
	}

	public MotorDrivingSchoolDTO getMotorDrivingSchoolDTO() {
		return motorDrivingSchoolDTO;
	}

	public void setMotorDrivingSchoolDTO(MotorDrivingSchoolDTO motorDrivingSchoolDTO) {
		this.motorDrivingSchoolDTO = motorDrivingSchoolDTO;
	}

	public FreshRcDTO getFreshRcdetails() {
		return freshRcdetails;
	}

	public void setFreshRcdetails(FreshRcDTO freshRcdetails) {
		this.freshRcdetails = freshRcdetails;
	}

	private TransferType.permitTranfer citizenCOARecommendationLetterStatus;

	public VcrTaxDetailsDTO getVcrDetails() {
		return vcrDetails;
	}

	public void setVcrDetails(VcrTaxDetailsDTO vcrDetails) {
		this.vcrDetails = vcrDetails;
	}

	public Boolean getIsTSApplication() {
		return isTSApplication;
	}

	public void setIsTSApplication(Boolean isTSApplication) {
		this.isTSApplication = isTSApplication;
	}

	public Boolean getOtherStateFianContinue() {
		return otherStateFianContinue;
	}

	public void setOtherStateFianContinue(Boolean otherStateFianContinue) {
		this.otherStateFianContinue = otherStateFianContinue;
	}

	public StatusRegistration getOtherStateNOCStatus() {
		return otherStateNOCStatus;
	}

	public void setOtherStateNOCStatus(StatusRegistration otherStateNOCStatus) {
		this.otherStateNOCStatus = otherStateNOCStatus;
	}

	public ApplicationStatusDetails getOtherStateNOCActionDetails() {
		return otherStateNOCActionDetails;
	}

	public void setOtherStateNOCActionDetails(ApplicationStatusDetails otherStateNOCActionDetails) {
		this.otherStateNOCActionDetails = otherStateNOCActionDetails;
	}

	public Boolean getCitizenPayAcceptance() {
		return citizenPayAcceptance;
	}

	public void setCitizenPayAcceptance(Boolean citizenPayAcceptance) {
		this.citizenPayAcceptance = citizenPayAcceptance;
	}

	/**
	 * @return the usersContactDetails
	 */
	public ContactDTO getUsersContactDetails() {
		return usersContactDetails;
	}

	/**
	 * @param usersContactDetails the usersContactDetails to sets
	 */
	public void setUsersContactDetails(ContactDTO usersContactDetails) {
		this.usersContactDetails = usersContactDetails;
	}

	/**
	 * @return the citizenCOAPermitStatus
	 */
	public TransferType.permitTranfer getCitizenCOAPermitStatus() {
		return citizenCOAPermitStatus;
	}

	/**
	 * @param citizenCOAPermitStatus the citizenCOAPermitStatus to set
	 */
	public void setCitizenCOAPermitStatus(TransferType.permitTranfer citizenCOAPermitStatus) {
		this.citizenCOAPermitStatus = citizenCOAPermitStatus;
	}

	public Boolean getFitnessOtherStation() {
		return fitnessOtherStation;
	}

	public void setFitnessOtherStation(Boolean fitnessOtherStation) {
		this.fitnessOtherStation = fitnessOtherStation;
	}

	public String getReasonForRejection() {
		return reasonForRejection;
	}

	public void setReasonForRejection(String reasonForRejection) {
		this.reasonForRejection = reasonForRejection;
	}

	public List<MasterFCQuestionsDTO> getFcQstList() {
		return fcQstList;
	}

	public void setFcQstList(List<MasterFCQuestionsDTO> fcQstList) {
		this.fcQstList = fcQstList;
	}

	public LocalDate getReInspectionDate() {
		return reInspectionDate;
	}

	public void setReInspectionDate(LocalDate reInspectionDate) {
		this.reInspectionDate = reInspectionDate;
	}

	public Boolean getIsFor2Years() {
		return isFor2Years;
	}

	public void setIsFor2Years(Boolean isFor2Years) {
		this.isFor2Years = isFor2Years;
	}

	public Boolean getIsFor1Years() {
		return isFor1Years;
	}

	public void setIsFor1Years(Boolean isFor1Years) {
		this.isFor1Years = isFor1Years;
	}

	public Boolean getIsFor6Months() {
		return isFor6Months;
	}

	public void setIsFor6Months(Boolean isFor6Months) {
		this.isFor6Months = isFor6Months;
	}

	public OfficeDTO getNewOfficeDetails() {
		return newOfficeDetails;
	}

	public void setNewOfficeDetails(OfficeDTO newOfficeDetails) {
		this.newOfficeDetails = newOfficeDetails;
	}

	public String getReasonForChangeOffice() {
		return reasonForChangeOffice;
	}

	public void setReasonForChangeOffice(String reasonForChangeOffice) {
		this.reasonForChangeOffice = reasonForChangeOffice;
	}

	public boolean isFinancierDoneByOnline() {
		return isFinancierDoneByOnline;
	}

	public void setFinancierDoneByOnline(boolean isFinancierDoneByOnline) {
		this.isFinancierDoneByOnline = isFinancierDoneByOnline;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public List<TheftVehicleDetailsDTO> getTheftDetailsLog() {
		return theftDetailsLog;
	}

	public void setTheftDetailsLog(List<TheftVehicleDetailsDTO> theftDetailsLog) {
		this.theftDetailsLog = theftDetailsLog;
	}

	public String getPreviousPrNo() {
		return previousPrNo;
	}

	public void setPreviousPrNo(String previousPrNo) {
		this.previousPrNo = previousPrNo;
	}

	public boolean isPreviousPrNoExist() {
		return previousPrNoExist;
	}

	public void setPreviousPrNoExist(boolean previousPrNoExist) {
		this.previousPrNoExist = previousPrNoExist;
	}

	public boolean isSpecialNoRequired() {
		return isSpecialNoRequired;
	}

	public void setSpecialNoRequired(boolean isSpecialNoRequired) {
		this.isSpecialNoRequired = isSpecialNoRequired;
	}

	public boolean isFinancerRequired() {
		return isFinancerRequired;
	}

	public void setFinancerRequired(boolean isFinancerRequired) {
		this.isFinancerRequired = isFinancerRequired;
	}

	public void setFcDetails(FcDetailsDTO fcDetails) {
		this.fcDetails = fcDetails;
	}

	public NOCDetailsDTO getnOCDetails() {
		return nOCDetails;
	}

	public void setnOCDetails(NOCDetailsDTO nOCDetails) {
		this.nOCDetails = nOCDetails;
	}

	public PUCDetailsDTO getPucDetails() {
		return pucDetails;
	}

	public void setPucDetails(PUCDetailsDTO pucDetails) {
		this.pucDetails = pucDetails;
	}

	public TaxDetailsDTO getTaxDetails() {
		return taxDetails;
	}

	public void setTaxDetails(TaxDetailsDTO taxDetails) {
		this.taxDetails = taxDetails;
	}

	public GreenTaxDTO getGreenTaxDetails() {
		return greenTaxDetails;
	}

	public void setGreenTaxDetails(GreenTaxDTO greenTaxDetails) {
		this.greenTaxDetails = greenTaxDetails;
	}

	/**
	 * @return the duplicateDetailsDTO
	 */
	public DuplicateDetailsDTO getDuplicateDetails() {
		return duplicateDetails;
	}

	/**
	 * @param duplicateDetailsDTO the duplicateDetailsDTO to set
	 */
	public void setDuplicateDetails(DuplicateDetailsDTO duplicateDetails) {
		this.duplicateDetails = duplicateDetails;
	}

	/**
	 * @return the permitDetails
	 */
	public PermitDetailsDTO getPdtl() {
		return pdtl;
	}

	/**
	 * @param permitDetails the permitDetails to set
	 */
	public void setPdtl(PermitDetailsDTO pdtl) {
		this.pdtl = pdtl;
	}

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
	 * @return the breakPayments
	 */
	public BreakPaymentsSaveDTO getBreakPayments() {
		return breakPayments;
	}

	/**
	 * @param breakPayments the breakPayments to set
	 */
	public void setBreakPayments(BreakPaymentsSaveDTO breakPayments) {
		this.breakPayments = breakPayments;
	}

	/**
	 * @return the serviceIds
	 */
	public Set<Integer> getServiceIds() {
		return serviceIds;
	}

	/**
	 * @param serviceIds the serviceIds to set
	 */
	public void setServiceIds(Set<Integer> serviceIds) {
		this.serviceIds = serviceIds;
	}

	/**
	 * @return the gatewayType
	 */
	public String getGatewayType() {
		return gatewayType;
	}

	/**
	 * @param gatewayType the gatewayType to set
	 */
	public void setGatewayType(String gatewayType) {
		this.gatewayType = gatewayType;
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
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	/**
	 * @return the iterationCount
	 */
	public Integer getIterationCount() {
		return iterationCount;
	}

	/**
	 * @param iterationCount the iterationCount to set
	 */
	public void setIterationCount(Integer iterationCount) {
		this.iterationCount = iterationCount;
	}

	/**
	 * @return the presentAdderss
	 */
	public ApplicantAddressDTO getPresentAdderss() {
		return presentAdderss;
	}

	/**
	 * @param presentAdderss the presentAdderss to set
	 */
	public void setPresentAdderss(ApplicantAddressDTO presentAdderss) {
		this.presentAdderss = presentAdderss;
	}

	/**
	 * @return the applicationNo
	 */
	public String getApplicationNo() {
		return applicationNo;
	}

	/**
	 * @param applicationNo the applicationNo to set
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	/**
	 * @return the isSameAsAadhaar
	 */
	public Boolean getIsSameAsAadhaar() {
		return isSameAsAadhaar;
	}

	/**
	 * @param isSameAsAadhaar the isSameAsAadhaar to set
	 */
	public void setIsSameAsAadhaar(Boolean isSameAsAadhaar) {
		this.isSameAsAadhaar = isSameAsAadhaar;
	}

	/**
	 * @return the officeDetails
	 */
	public OfficeDTO getOfficeDetails() {
		return officeDetails;
	}

	/**
	 * @param officeDetails the officeDetails to set
	 */
	public void setOfficeDetails(OfficeDTO officeDetails) {
		this.officeDetails = officeDetails;
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
	 * @return the serviceType
	 */
	public List<ServiceEnum> getServiceType() {
		return serviceType;
	}

	/**
	 * @param serviceType the serviceType to set
	 */
	public void setServiceType(List<ServiceEnum> serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * @return the basicApplicantDetails
	 */
	public ApplicantDetailsDTO getBasicApplicantDetails() {
		return basicApplicantDetails;
	}

	/**
	 * @param basicApplicantDetails the basicApplicantDetails to set
	 */
	public void setBasicApplicantDetails(ApplicantDetailsDTO basicApplicantDetails) {
		this.basicApplicantDetails = basicApplicantDetails;
	}

	/**
	 * @return the applicationStatus
	 */
	public List<SlotDetailsDTO> getSlotDetailsLog() {
		return slotDetailsLog;
	}

	public TrasnferOfOwnerShipDTO getBuyerDetails() {
		return buyerDetails;
	}

	public void setBuyerDetails(TrasnferOfOwnerShipDTO buyerDetails) {
		this.buyerDetails = buyerDetails;
	}

	public void setSlotDetailsLog(List<SlotDetailsDTO> slotDetailsLog) {
		this.slotDetailsLog = slotDetailsLog;
	}

	public List<FeeDetailsDTO> getFeeDetailsLog() {
		return feeDetailsLog;
	}

	public void setFeeDetailsLog(List<FeeDetailsDTO> feeDetailsLog) {
		this.feeDetailsLog = feeDetailsLog;
	}

	public String getAadhaarUid() {
		return aadhaarUid;
	}

	public void setAadhaarUid(String aadhaarUid) {
		this.aadhaarUid = aadhaarUid;
	}

	public AlterationDTO getAlterationDetails() {
		return alterationDetails;
	}

	public void setAlterationDetails(AlterationDTO alterationDetails) {
		this.alterationDetails = alterationDetails;
	}

	public RegistrationDetailsDTO getRegistrationDetails() {
		return registrationDetails;
	}

	public void setRegistrationDetails(RegistrationDetailsDTO registrationDetails) {
		this.registrationDetails = registrationDetails;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getAadhaarNo() {
		return aadhaarNo;
	}

	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}

	/**
	 * @return the trNo
	 */
	public String getTrNo() {
		return trNo;
	}

	/**
	 * @param trNo the trNo to set
	 */
	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the applicationStatus
	 */
	public StatusRegistration getApplicationStatus() {
		return applicationStatus;
	}

	/**
	 * @param applicationStatus the applicationStatus to set
	 */
	public void setApplicationStatus(StatusRegistration applicationStatus) {
		this.applicationStatus = applicationStatus;
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

	/**
	 * @return the taxType
	 */
	public String getTaxType() {
		return taxType;
	}

	/**
	 * @param taxType the taxType to set
	 */
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	/**
	 * @return the greenTaxAmount
	 */
	public Long getGreenTaxAmount() {
		return greenTaxAmount;
	}

	/**
	 * @param greenTaxAmount the greenTaxAmount to set
	 */
	public void setGreenTaxAmount(Long greenTaxAmount) {
		this.greenTaxAmount = greenTaxAmount;
	}

	/**
	 * @return the greenTaxvalidity
	 */
	public LocalDate getGreenTaxvalidity() {
		return greenTaxvalidity;
	}

	/**
	 * @param greenTaxvalidity the greenTaxvalidity to set
	 */
	public void setGreenTaxvalidity(LocalDate greenTaxvalidity) {
		this.greenTaxvalidity = greenTaxvalidity;
	}

	public List<ActionDetails> getActionDetails() {
		return actionDetails;
	}

	public void setActionDetails(List<ActionDetails> actionDetails) {
		this.actionDetails = actionDetails;
	}

	public FcDetailsDTO getFcDetails() {
		return fcDetails;
	}

	/**
	 * @return the currentIndex
	 */
	public Integer getCurrentIndex() {
		return currentIndex;
	}

	/**
	 * @param currentIndex the currentIndex to set
	 */
	public void setCurrentIndex(Integer currentIndex) {
		this.currentIndex = currentIndex;
	}

	/**
	 * @return the financeDetails
	 */
	public FinanceDetailsDTO getFinanceDetails() {
		return financeDetails;
	}

	/**
	 * @param financeDetails the financeDetails to set
	 */
	public void setFinanceDetails(FinanceDetailsDTO financeDetails) {
		this.financeDetails = financeDetails;
	}

	/**
	 * @return the insuranceDetails
	 */
	public InsuranceDetailsDTO getInsuranceDetails() {
		return insuranceDetails;
	}

	/**
	 * @param insuranceDetails the insuranceDetails to set
	 */
	public void setInsuranceDetails(InsuranceDetailsDTO insuranceDetails) {
		this.insuranceDetails = insuranceDetails;
	}

	/**
	 * @return the alterationDetailsLog
	 */
	public List<AlterationDTO> getAlterationDetailsLog() {
		return alterationDetailsLog;
	}

	/**
	 * @param alterationDetailsLog the alterationDetailsLog to set
	 */
	public void setAlterationDetailsLog(List<AlterationDTO> alterationDetailsLog) {
		this.alterationDetailsLog = alterationDetailsLog;
	}

	/**
	 * @return the approvedDate
	 */
	public LocalDateTime getApprovedDate() {
		return approvedDate;
	}

	/**
	 * @param approvedDate the approvedDate to set
	 */
	public void setApprovedDate(LocalDateTime approvedDate) {
		this.approvedDate = approvedDate;
	}

	/**
	 * @return the mviOfficeCode
	 */
	public String getMviOfficeCode() {
		return mviOfficeCode;
	}

	/**
	 * @param mviOfficeCode the mviOfficeCode to set
	 */
	public void setMviOfficeCode(String mviOfficeCode) {
		this.mviOfficeCode = mviOfficeCode;
	}

	/**
	 * @return the mviOfficeDetails
	 */
	public OfficeDTO getMviOfficeDetails() {
		return mviOfficeDetails;
	}

	/**
	 * @param mviOfficeDetails the mviOfficeDetails to set
	 */
	public void setMviOfficeDetails(OfficeDTO mviOfficeDetails) {
		this.mviOfficeDetails = mviOfficeDetails;
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

	/**
	 * @return the theftDetails
	 */
	public TheftVehicleDetailsDTO getTheftDetails() {
		return theftDetails;
	}

	/**
	 * @param theftDetails the theftDetails to set
	 */
	public void setTheftDetails(TheftVehicleDetailsDTO theftDetails) {
		this.theftDetails = theftDetails;
	}

	public String getApprovedDateStr() {
		return approvedDateStr;
	}

	public void setApprovedDateStr(String approvedDateStr) {
		this.approvedDateStr = approvedDateStr;
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

	/**
	 * @return the flowId
	 */
	public ServiceEnum.Flow getFlowId() {
		return flowId;
	}

	/**
	 * @param flowId the flowId to set
	 */
	public void setFlowId(ServiceEnum.Flow flowId) {
		this.flowId = flowId;
	}

	/**
	 * @return the contactDetails
	 */
	public ContactDTO getContactDetails() {
		return contactDetails;
	}

	/**
	 * @param contactDetails the contactDetails to set
	 */
	public void setContactDetails(ContactDTO contactDetails) {
		this.contactDetails = contactDetails;
	}

	/**
	 * @return the isHPTDone
	 */
	public Boolean getIsHPTDone() {
		return isHPTDone;
	}

	/**
	 * @param isHPTDone the isHPTDone to set
	 */
	public void setIsHPTDone(Boolean isHPTDone) {
		this.isHPTDone = isHPTDone;
	}

	/**
	 * @return the isHPADone
	 */
	public Boolean getIsHPADone() {
		return isHPADone;
	}

	/**
	 * @param isHPADone the isHPADone to set
	 */
	public void setIsHPADone(Boolean isHPADone) {
		this.isHPADone = isHPADone;
	}

	/**
	 * <<<<<<< HEAD
	 * 
	 * @return the tokenGeneratedDate
	 */
	public LocalDateTime getTokenGeneratedDate() {
		return tokenGeneratedDate;
	}

	/**
	 * @param tokenGeneratedDate the tokenGeneratedDate to set
	 */
	public void setTokenGeneratedDate(LocalDateTime tokenGeneratedDate) {
		this.tokenGeneratedDate = tokenGeneratedDate;
	}

	/**
	 * @return the isFinanceOnline =======
	 * @return the permitDetailsLog >>>>>>> 62ff5870f691937631bf0bf5b4d6eef3300501dc
	 */
	public List<PermitDetailsDTO> getPermitDetailsLog() {
		return permitDetailsLog;
	}

	/**
	 * @param permitDetailsLog the permitDetailsLog to set
	 */
	public void setPermitDetailsLog(List<PermitDetailsDTO> permitDetailsLog) {
		this.permitDetailsLog = permitDetailsLog;
	}

	/**
	 * @return the isAllowFcForOtherStation
	 */
	public boolean isAllowFcForOtherStation() {
		return isAllowFcForOtherStation;
	}

	/**
	 * @param isAllowFcForOtherStation the isAllowFcForOtherStation to set
	 */
	public void setAllowFcForOtherStation(boolean isAllowFcForOtherStation) {
		this.isAllowFcForOtherStation = isAllowFcForOtherStation;
	}

	/**
	 * 
	 * @return the permitDetailsListDTO
	 */
	public List<PermitDetailsDTO> getPermitDetailsListDTO() {
		return permitDetailsListDTO;
	}

	/**
	 * @param permitDetailsListDTO the permitDetailsListDTO to set
	 */
	public void setPermitDetailsListDTO(List<PermitDetailsDTO> permitDetailsListDTO) {
		this.permitDetailsListDTO = permitDetailsListDTO;
	}

	/**
	 * @return the isPaidPyamentsForFC
	 */
	public boolean isPaidPyamentsForFC() {
		return isPaidPyamentsForFC;
	}

	/**
	 * @param isPaidPyamentsForFC the isPaidPyamentsForFC to set
	 */
	public void setPaidPyamentsForFC(boolean isPaidPyamentsForFC) {
		this.isPaidPyamentsForFC = isPaidPyamentsForFC;
	}

	/**
	 * @return the oldMviOfficeCode
	 */
	public String getOldMviOfficeCode() {
		return oldMviOfficeCode;
	}

	/**
	 * @param oldMviOfficeCode the oldMviOfficeCode to set
	 */
	public void setOldMviOfficeCode(String oldMviOfficeCode) {
		this.oldMviOfficeCode = oldMviOfficeCode;
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
	 * @return the vehicleStoppageDetails
	 */
	public VehicleStoppageDetailsDTO getVehicleStoppageDetails() {
		return vehicleStoppageDetails;
	}

	/**
	 * @param vehicleStoppageDetails the vehicleStoppageDetails to set
	 */
	public void setVehicleStoppageDetails(VehicleStoppageDetailsDTO vehicleStoppageDetails) {
		this.vehicleStoppageDetails = vehicleStoppageDetails;
	}

	/**
	 * @return the currentRoles
	 */
	public Set<String> getCurrentRoles() {
		return currentRoles;
	}

	/**
	 * @param currentRoles the currentRoles to set
	 */
	public void setCurrentRoles(Set<String> currentRoles) {
		this.currentRoles = currentRoles;
	}

	/**
	 * @return the taxExcemption
	 */
	public Boolean getTaxExcemption() {
		return taxExcemption;
	}

	/**
	 * @param taxExcemption the taxExcemption to set
	 */
	public void setTaxExcemption(Boolean taxExcemption) {
		this.taxExcemption = taxExcemption;
	}

	/**
	 * @return the permitCode
	 */
	public String getPermitCode() {
		return permitCode;
	}

	/**
	 * @param permitCode the permitCode to set
	 */
	public void setPermitCode(String permitCode) {
		this.permitCode = permitCode;
	}

	/**
	 * @return the quaterTaxForNewGo
	 */
	public Long getQuaterTaxForNewGo() {
		return quaterTaxForNewGo;
	}

	/**
	 * @param quaterTaxForNewGo the quaterTaxForNewGo to set
	 */
	public void setQuaterTaxForNewGo(Long quaterTaxForNewGo) {
		this.quaterTaxForNewGo = quaterTaxForNewGo;
	}

	public boolean isPaidPyamentsForRenewal() {
		return isPaidPyamentsForRenewal;
	}

	public void setPaidPyamentsForRenewal(boolean isPaidPyamentsForRenewal) {
		this.isPaidPyamentsForRenewal = isPaidPyamentsForRenewal;
	}

	/**
	 * @return the hptStatus
	 */
	public String getHptStatus() {
		return hptStatus;
	}

	/**
	 * @param hptStatus the hptStatus to set
	 */
	public void setHptStatus(String hptStatus) {
		this.hptStatus = hptStatus;
	}

	public boolean isNeedToUpdatePrNoInFc() {
		return isNeedToUpdatePrNoInFc;
	}

	public void setNeedToUpdatePrNoInFc(boolean isNeedToUpdatePrNoInFc) {
		this.isNeedToUpdatePrNoInFc = isNeedToUpdatePrNoInFc;
	}

	/**
	 * @return the freshRcFinanceToken
	 */
	public String getFreshRcFinanceToken() {
		return freshRcFinanceToken;
	}

	/**
	 * @param freshRcFinanceToken the freshRcFinanceToken to set
	 */
	public void setFreshRcFinanceToken(String freshRcFinanceToken) {
		this.freshRcFinanceToken = freshRcFinanceToken;
	}

	/**
	 * @return the hptTerminatedDate
	 */
	public LocalDate getHptTerminatedDate() {
		return hptTerminatedDate;
	}

	/**
	 * @param hptTerminatedDate the hptTerminatedDate to set
	 */
	public void setHptTerminatedDate(LocalDate hptTerminatedDate) {
		this.hptTerminatedDate = hptTerminatedDate;
	}

	public LocalDate getOsDateofentry() {
		return osDateofentry;
	}

	public void setOsDateofentry(LocalDate osDateofentry) {
		this.osDateofentry = osDateofentry;
	}

	public boolean isMviDone() {
		return mviDone;
	}

	public void setMviDone(boolean mviDone) {
		this.mviDone = mviDone;
	}

	public boolean isWeightAlt() {
		return weightAlt;
	}

	public void setWeightAlt(boolean weightAlt) {
		this.weightAlt = weightAlt;
	}

	public Integer getGvw() {
		return gvw;
	}

	public void setGvw(Integer gvw) {
		this.gvw = gvw;
	}

	public boolean getOsNewCombinatonsDataEntry() {
		return osNewCombinatonsDataEntry;
	}

	public void setOsNewCombinatonsDataEntry(boolean osNewCombinatonsDataEntry) {
		this.osNewCombinatonsDataEntry = osNewCombinatonsDataEntry;
	}

	public BileteralTaxDTO getBileteralTaxDetails() {
		return bileteralTaxDetails;
	}

	public void setBileteralTaxDetails(BileteralTaxDTO bileteralTaxDetails) {
		this.bileteralTaxDetails = bileteralTaxDetails;
	}

	/**
	 * @return the isFinanceOnline
	 */
	private String representativeUidToken;

	public String getRepresentativeUidToken() {
		return representativeUidToken;
	}

	public void setRepresentativeUidToken(String representativeUidToken) {
		this.representativeUidToken = representativeUidToken;
	}

	public OfficeDTO getOldMviOfficeDetails() {
		return oldMviOfficeDetails;
	}

	public void setOldMviOfficeDetails(OfficeDTO oldMviOfficeDetails) {
		this.oldMviOfficeDetails = oldMviOfficeDetails;
	}

	/**
	 * @return the osSecondVechicleFoundRTO
	 */
	public Boolean getOsSecondVechicleFoundRTO() {
		return osSecondVechicleFoundRTO;
	}

	/**
	 * @param osSecondVechicleFoundRTO the osSecondVechicleFoundRTO to set
	 */
	public void setOsSecondVechicleFoundRTO(Boolean osSecondVechicleFoundRTO) {
		this.osSecondVechicleFoundRTO = osSecondVechicleFoundRTO;
	}

	/**
	 * @return the isPRNoRequiredosSVRejected
	 */
	public Boolean getIsPRNoRequiredosSVRejected() {
		return isPRNoRequiredosSVRejected;
	}

	/**
	 * @param isPRNoRequiredosSVRejected the isPRNoRequiredosSVRejected to set
	 */
	public void setIsPRNoRequiredosSVRejected(Boolean isPRNoRequiredosSVRejected) {
		this.isPRNoRequiredosSVRejected = isPRNoRequiredosSVRejected;
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

	public List<String> getVcrNosList() {
		return vcrNosList;
	}

	public void setVcrNosList(List<String> vcrNosList) {
		this.vcrNosList = vcrNosList;
	}

	/**
	 * @return the otherStateTemporaryPermitDetails
	 */
	public OtherStateTemporaryPermitDetailsDTO getOtherStateTemporaryPermitDetails() {
		return otherStateTemporaryPermitDetails;
	}

	/**
	 * @param otherStateTemporaryPermitDetails the otherStateTemporaryPermitDetails
	 *                                         to set
	 */
	public void setOtherStateTemporaryPermitDetails(
			OtherStateTemporaryPermitDetailsDTO otherStateTemporaryPermitDetails) {
		this.otherStateTemporaryPermitDetails = otherStateTemporaryPermitDetails;
	}

	public RCCancellationDTO getRcCancellation() {
		return rcCancellation;
	}

	public void setRcCancellation(RCCancellationDTO rcCancellation) {
		this.rcCancellation = rcCancellation;
	}

	public LocalDate getDateOfCompletion() {
		return dateOfCompletion;
	}

	public void setDateOfCompletion(LocalDate dateOfCompletion) {
		this.dateOfCompletion = dateOfCompletion;
	}

	public VoluntaryTaxDTO getVoluntaryTaxDetails() {
		return voluntaryTaxDetails;
	}

	public void setVoluntaryTaxDetails(VoluntaryTaxDTO voluntaryTaxDetails) {
		this.voluntaryTaxDetails = voluntaryTaxDetails;
	}

	public TransferType.permitTranfer getCitizenCOARecommendationLetterStatus() {
		return citizenCOARecommendationLetterStatus;
	}

	public void setCitizenCOARecommendationLetterStatus(
			TransferType.permitTranfer citizenCOARecommendationLetterStatus) {
		this.citizenCOARecommendationLetterStatus = citizenCOARecommendationLetterStatus;
	}

	public ShowCauseDetailsDTO getShowCauseDetails() {
		return showCauseDetails;
	}

	public void setShowCauseDetails(ShowCauseDetailsDTO showCauseDetails) {
		this.showCauseDetails = showCauseDetails;
	}

	public Boolean getIsScNoGenerated() {
		return isScNoGenerated;
	}

	public void setIsScNoGenerated(Boolean isScNoGenerated) {
		this.isScNoGenerated = isScNoGenerated;
	}

	/**
	 * @return the lastTaxPaidUpTo
	 */
	public LocalDate getLastTaxPaidUpTo() {
		return lastTaxPaidUpTo;
	}

	/**
	 * @param lastTaxPaidUpTo the lastTaxPaidUpTo to set
	 */
	public void setLastTaxPaidUpTo(LocalDate lastTaxPaidUpTo) {
		this.lastTaxPaidUpTo = lastTaxPaidUpTo;
	}

	/**
	 * @return the rcQuesList
	 */
	public List<MasterRcCancellationQuestionsDTO> getRcQuesList() {
		return rcQuesList;
	}

	/**
	 * @param rcQuesList the rcQuesList to set
	 */
	public void setRcQuesList(List<MasterRcCancellationQuestionsDTO> rcQuesList) {
		this.rcQuesList = rcQuesList;
	}

	public boolean isAoDone() {
		return isAoDone;
	}

	public void setAoDone(boolean isAoDone) {
		this.isAoDone = isAoDone;
	}

	public Boolean getIsOtherState() {
		return isOtherState;
	}

	public void setIsOtherState(Boolean isOtherState) {
		this.isOtherState = isOtherState;
	}

	public String getDtcOfficeCode() {
		return dtcOfficeCode;
	}

	public void setDtcOfficeCode(String dtcOfficeCode) {
		this.dtcOfficeCode = dtcOfficeCode;
	}

	public Boolean getDeductionMode() {
		return deductionMode;
	}

	public void setDeductionMode(Boolean deductionMode) {
		this.deductionMode = deductionMode;
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

	public OtherVoluntaryTax getOtherStateVoluntaryTax() {
		return otherStateVoluntaryTax;
	}

	public void setOtherStateVoluntaryTax(OtherVoluntaryTax otherStateVoluntaryTax) {
		this.otherStateVoluntaryTax = otherStateVoluntaryTax;
	}

	/**
	 * @return the stageCarriageType
	 */
	public String getStageCarriageType() {
		return stageCarriageType=null;
	}

	/**
	 * @param stageCarriageType the stageCarriageType to set
	 */
	public void setStageCarriageType(String stageCarriageType) {
		this.stageCarriageType = null;
	}

	/**
	 * @return the stageCarriageServiceType
	 */
	public String getStageCarriageServiceType() {
		return stageCarriageServiceType=null;
	}

	/**
	 * @param stageCarriageServiceType the stageCarriageServiceType to set
	 */
	public void setStageCarriageServiceType(String stageCarriageServiceType) {
		this.stageCarriageServiceType = null;
	}

	public Boolean getIsFcReupload() {
		return isFcReupload;
	}

	public void setIsFcReupload(Boolean isFcReupload) {
		this.isFcReupload = isFcReupload;
	}

	public String getReqSerAuthType() {
		return reqSerAuthType;
	}

	public void setReqSerAuthType(String reqSerAuthType) {
		this.reqSerAuthType = reqSerAuthType;
	}

	public Boolean getSpecificVcrPayment() {
		return specificVcrPayment;
	}

	public void setSpecificVcrPayment(Boolean specificVcrPayment) {
		this.specificVcrPayment = specificVcrPayment;
	}

	public Boolean getIsStoppageReupload() {
		return isStoppageReupload;
	}

	public void setIsStoppageReupload(Boolean isStoppageReupload) {
		this.isStoppageReupload = isStoppageReupload;
	}
	
	
}
