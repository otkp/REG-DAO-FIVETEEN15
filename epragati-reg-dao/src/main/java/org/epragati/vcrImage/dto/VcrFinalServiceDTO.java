package org.epragati.vcrImage.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.constants.DisposalType;
import org.epragati.master.dto.TaxHelper;
import org.epragati.payment.dto.ChalanaDetailsDTO;
import org.epragati.regservice.dto.ActionDetails;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "table_vcr_details")
public class VcrFinalServiceDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private Vcr vcr;
	private RegistrationVcr registration;
	private ValidityDetailsDTO validityDetails;
	private OwnerDetailsDto ownerDetails;
	private DriverDetailsVcrDTO driver;
	private VehicleProceedingDTO vehicleProceeding;
	private OffenceVcrDTO offence;
	private SeizedAndDocumentImpoundedDTO seizedAndDocumentImpounded;
	private Boolean isVcrClosed = Boolean.FALSE;
	private String officeCode;
	private String mviOfficeCode;
	private List<OtherSectionDTO> otherSections;
	private Integer offencetotal;

	private DisposalType disposalType;
	private boolean partialDisposal;
	private boolean finalDisposal;
	private String orderNo;
	private LocalDate orderDate;
	private String courtName;
	private String caseNo;
	private LocalDate collectedDate;
	private Integer fineCollected;
	private String permitNo;
	private String proceedingNo;
	private String licenseNo;
	private String registrationNo;
	private LocalDate proceedingDate;
	private Boolean partiallyClosed;
	private String pilledCov;
	private String pilledPermit;
	private String pilledRouteCode;
	private Integer pilledSeatings;
	private List<IllicitPlaceDetailsDTO> illicitPlaceDetails;
	private String pilledMeasurements;
	private String pilledGoods;
	private List<ActionDetails> actions;

	private String username;
	private LocalDateTime paidDate;

	private boolean paymentIntiated;

	private String transactionNo;

	private boolean isTaxPaid;
	private Long serviceFee;
	private Double tax;
	private Long penalty;
	private Double taxArrears;
	private Long penaltyArrears;
	private Boolean cfxIssued;
	private String officeName;
	private Boolean saveDoc;
	private boolean vehicleHaveAitp;
	private String paymentType;
	private String challanNo;
	private String recieptNo;
	private String tresuryName;
	private String tresuryAmount;
	private LocalDate challanDate;
	private boolean isAnnualTax;

	private boolean consolidateUpdated;
	private String designation;
	private Boolean vehicleSeized;
	private Double releaseOrderFee;
	private Double greenTax;
	private Double cess;
	private LocalDate taxValidityForTaxPaid;
	private LocalDate greentaxValidityForTaxPaid;

	private Boolean deductionMode;
	private Boolean voluntaryMode;

	private String serviceApplicationNo;
	private TaxHelper taxAmountForPrint;
	private Boolean paymentDone;

	private Boolean isScVcrNoGenerated = Boolean.FALSE;

	private String vcrNonApplicationStatus;

	private String isScNoVcrIssuedRole; 

	private String isScNoVcrIssuedBy; 

	private String isScNoVcr;
	private String errorMsg;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate scVcrNoIssuedOn;
	private Boolean isRoadSafety;

	private Boolean iseVcr;
	private String senderMobileNo;
	private LocalDate senderDate;

	private Boolean isEvcrPrinted;
	private String eVcrPrintedBy;
	private LocalDateTime eVcrPrintedDate;

	private List<EVcrPrintedDTO> evcrPrintedLog;
	
	private SpeedGunDTO speedGunDTO;
	private Boolean isSpeedGun;
	
	private Boolean isSpeedGunVcrPrinted;
	private String SpeedGunVcrPrintedBy;
	private LocalDateTime SpeedGunVcrPrintedDate;
	private List<SpeedGunPrintDTO> SpeedGunVcrPrintedLog;
	
	private Boolean isChallanModified;

	public Boolean getIsSpeedGunVcrPrinted() {
		return isSpeedGunVcrPrinted;
	}

	public void setIsSpeedGunVcrPrinted(Boolean isSpeedGunVcrPrinted) {
		this.isSpeedGunVcrPrinted = isSpeedGunVcrPrinted;
	}

	public String getSpeedGunVcrPrintedBy() {
		return SpeedGunVcrPrintedBy;
	}

	public void setSpeedGunVcrPrintedBy(String speedGunVcrPrintedBy) {
		SpeedGunVcrPrintedBy = speedGunVcrPrintedBy;
	}

	public LocalDateTime getSpeedGunVcrPrintedDate() {
		return SpeedGunVcrPrintedDate;
	}

	public void setSpeedGunVcrPrintedDate(LocalDateTime speedGunVcrPrintedDate) {
		SpeedGunVcrPrintedDate = speedGunVcrPrintedDate;
	}

	public List<SpeedGunPrintDTO> getSpeedGunVcrPrintedLog() {
		return SpeedGunVcrPrintedLog;
	}

	public void setSpeedGunVcrPrintedLog(List<SpeedGunPrintDTO> speedGunVcrPrintedLog) {
		SpeedGunVcrPrintedLog = speedGunVcrPrintedLog;
	}

	/**
	 * @return the isSpeedGun
	 */
	public Boolean getIsSpeedGun() {
		return isSpeedGun;
	}

	/**
	 * @param isSpeedGun the isSpeedGun to set
	 */
	public void setIsSpeedGun(Boolean isSpeedGun) {
		this.isSpeedGun = isSpeedGun;
	}

	/**
	 * @return the speedGunDTO
	 */
	public SpeedGunDTO getSpeedGunDTO() {
		return speedGunDTO;
	}

	/**
	 * @param speedGunDTO the speedGunDTO to set
	 */
	public void setSpeedGunDTO(SpeedGunDTO speedGunDTO) {
		this.speedGunDTO = speedGunDTO;
	}

	
	public List<EVcrPrintedDTO> getEvcrPrintedLog() {
		return evcrPrintedLog;
	}

	public void setEvcrPrintedLog(List<EVcrPrintedDTO> evcrPrintedLog) {
		this.evcrPrintedLog = evcrPrintedLog;
	}

	public Boolean getIsEvcrPrinted() {
		return isEvcrPrinted;
	}

	public void setIsEvcrPrinted(Boolean isEvcrPrinted) {
		this.isEvcrPrinted = isEvcrPrinted;
	}

	public String geteVcrPrintedBy() {
		return eVcrPrintedBy;
	}

	public void seteVcrPrintedBy(String eVcrPrintedBy) {
		this.eVcrPrintedBy = eVcrPrintedBy;
	}

	public LocalDateTime geteVcrPrintedDate() {
		return eVcrPrintedDate;
	}

	public void seteVcrPrintedDate(LocalDateTime eVcrPrintedDate) {
		this.eVcrPrintedDate = eVcrPrintedDate;
	}

	public LocalDate getSenderDate() {
		return senderDate;
	}

	public void setSenderDate(LocalDate senderDate) {
		this.senderDate = senderDate;
	}

	public String getSenderMobileNo() {
		return senderMobileNo;
	}

	public void setSenderMobileNo(String senderMobileNo) {
		this.senderMobileNo = senderMobileNo;
	}

	public Boolean getIseVcr() {
		return iseVcr;
	}

	public void setIseVcr(Boolean iseVcr) {
		this.iseVcr = iseVcr;
	}



	public String getIsScNoVcr() {
		return isScNoVcr;
	}

	public void setIsScNoVcr(String isScNoVcr) {
		this.isScNoVcr = isScNoVcr;
	}

	public String getIsScNoVcrIssuedRole() {
		return isScNoVcrIssuedRole;
	}

	public void setIsScNoVcrIssuedRole(String isScNoVcrIssuedRole) {
		this.isScNoVcrIssuedRole = isScNoVcrIssuedRole;
	}

	public String getIsScNoVcrIssuedBy() {
		return isScNoVcrIssuedBy;
	}

	public void setIsScNoVcrIssuedBy(String isScNoVcrIssuedBy) {
		this.isScNoVcrIssuedBy = isScNoVcrIssuedBy;
	}


	public Boolean getIsScVcrNoGenerated() {
		return isScVcrNoGenerated;
	}

	public void setIsScVcrNoGenerated(Boolean isScVcrNoGenerated) {
		this.isScVcrNoGenerated = isScVcrNoGenerated;
	}


	public String getVcrNonApplicationStatus() {
		return vcrNonApplicationStatus;
	}

	public void setVcrNonApplicationStatus(String vcrNonApplicationStatus) {
		this.vcrNonApplicationStatus = vcrNonApplicationStatus;
	}

	public LocalDate getScVcrNoIssuedOn() {
		return scVcrNoIssuedOn;
	}

	public void setScVcrNoIssuedOn(LocalDate scVcrNoIssuedOn) {
		this.scVcrNoIssuedOn = scVcrNoIssuedOn;
	}

	public Double getGreenTax() {
		return greenTax;
	}

	public void setGreenTax(Double greenTax) {
		this.greenTax = greenTax;
	}

	public Double getReleaseOrderFee() {
		return releaseOrderFee;
	}

	public void setReleaseOrderFee(Double releaseOrderFee) {
		this.releaseOrderFee = releaseOrderFee;
	}

	public List<ChalanaDetailsDTO> getChallanDetails() {
		return challanDetails;
	}

	public void setChallanDetails(List<ChalanaDetailsDTO> challanDetails) {
		this.challanDetails = challanDetails;
	}

	private List<ChalanaDetailsDTO> challanDetails;

	public boolean isConsolidateUpdated() {
		return consolidateUpdated;
	}

	public void setConsolidateUpdated(boolean consolidateUpdated) {
		this.consolidateUpdated = consolidateUpdated;
	}

	public String getTresuryName() {
		return tresuryName;
	}

	public void setTresuryName(String tresuryName) {
		this.tresuryName = tresuryName;
	}

	public String getTresuryAmount() {
		return tresuryAmount;
	}

	public void setTresuryAmount(String tresuryAmount) {
		this.tresuryAmount = tresuryAmount;
	}

	public LocalDate getChallanDate() {
		return challanDate;
	}

	public void setChallanDate(LocalDate challanDate) {
		this.challanDate = challanDate;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getChallanNo() {
		return challanNo;
	}

	public void setChallanNo(String challanNo) {
		this.challanNo = challanNo;
	}

	public String getRecieptNo() {
		return recieptNo;
	}

	public void setRecieptNo(String recieptNo) {
		this.recieptNo = recieptNo;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public boolean isTaxPaid() {
		return isTaxPaid;
	}

	public void setTaxPaid(boolean isTaxPaid) {
		this.isTaxPaid = isTaxPaid;
	}

	public String getTransactionNo() {
		return transactionNo;
	}

	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}

	public Vcr getVcr() {
		return vcr;
	}

	public void setVcr(Vcr vcr) {
		this.vcr = vcr;
	}

	public RegistrationVcr getRegistration() {
		return registration;
	}

	public void setRegistration(RegistrationVcr registration) {
		this.registration = registration;
	}

	public OwnerDetailsDto getOwnerDetails() {
		return ownerDetails;
	}

	public void setOwnerDetails(OwnerDetailsDto ownerDetails) {
		this.ownerDetails = ownerDetails;
	}

	public DriverDetailsVcrDTO getDriver() {
		return driver;
	}

	public void setDriver(DriverDetailsVcrDTO driver) {
		this.driver = driver;
	}

	public VehicleProceedingDTO getVehicleProceeding() {
		return vehicleProceeding;
	}

	public void setVehicleProceeding(VehicleProceedingDTO vehicleProceeding) {
		this.vehicleProceeding = vehicleProceeding;
	}

	public OffenceVcrDTO getOffence() {
		return offence;
	}

	public void setOffence(OffenceVcrDTO offence) {
		this.offence = offence;
	}

	public SeizedAndDocumentImpoundedDTO getSeizedAndDocumentImpounded() {
		return seizedAndDocumentImpounded;
	}

	public void setSeizedAndDocumentImpounded(SeizedAndDocumentImpoundedDTO seizedAndDocumentImpounded) {
		this.seizedAndDocumentImpounded = seizedAndDocumentImpounded;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ValidityDetailsDTO getValidityDetails() {
		return validityDetails;
	}

	public void setValidityDetails(ValidityDetailsDTO validityDetails) {
		this.validityDetails = validityDetails;
	}

	public Boolean getIsVcrClosed() {
		return isVcrClosed;
	}

	public void setIsVcrClosed(Boolean isVcrClosed) {
		this.isVcrClosed = isVcrClosed;
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

	public String getMviOfficeCode() {
		return mviOfficeCode;
	}

	public void setMviOfficeCode(String mviOfficeCode) {
		this.mviOfficeCode = mviOfficeCode;
	}

	public List<OtherSectionDTO> getOtherSections() {
		return otherSections;
	}

	public void setOtherSections(List<OtherSectionDTO> otherSections) {
		this.otherSections = otherSections;
	}

	public Integer getOffencetotal() {
		return offencetotal;
	}

	public void setOffencetotal(Integer offencetotal) {
		this.offencetotal = offencetotal;
	}

	public DisposalType getDisposalType() {
		return disposalType;
	}

	public void setDisposalType(DisposalType disposalType) {
		this.disposalType = disposalType;
	}

	public boolean isPartialDisposal() {
		return partialDisposal;
	}

	public void setPartialDisposal(boolean partialDisposal) {
		this.partialDisposal = partialDisposal;
	}

	public boolean isFinalDisposal() {
		return finalDisposal;
	}

	public void setFinalDisposal(boolean finalDisposal) {
		this.finalDisposal = finalDisposal;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getCourtName() {
		return courtName;
	}

	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}

	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public LocalDate getCollectedDate() {
		return collectedDate;
	}

	public void setCollectedDate(LocalDate collectedDate) {
		this.collectedDate = collectedDate;
	}

	public Integer getFineCollected() {
		return fineCollected;
	}

	public void setFineCollected(Integer fineCollected) {
		this.fineCollected = fineCollected;
	}

	public String getPermitNo() {
		return permitNo;
	}

	public void setPermitNo(String permitNo) {
		this.permitNo = permitNo;
	}

	public String getProceedingNo() {
		return proceedingNo;
	}

	public void setProceedingNo(String proceedingNo) {
		this.proceedingNo = proceedingNo;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public LocalDate getProceedingDate() {
		return proceedingDate;
	}

	public void setProceedingDate(LocalDate proceedingDate) {
		this.proceedingDate = proceedingDate;
	}

	public Boolean getPartiallyClosed() {
		return partiallyClosed;
	}

	public void setPartiallyClosed(Boolean partiallyClosed) {
		this.partiallyClosed = partiallyClosed;
	}

	public String getPilledCov() {
		return pilledCov;
	}

	public void setPilledCov(String pilledCov) {
		this.pilledCov = pilledCov;
	}

	public String getPilledPermit() {
		return pilledPermit;
	}

	public void setPilledPermit(String pilledPermit) {
		this.pilledPermit = pilledPermit;
	}

	public String getPilledRouteCode() {
		return pilledRouteCode;
	}

	public void setPilledRouteCode(String pilledRouteCode) {
		this.pilledRouteCode = pilledRouteCode;
	}

	public Integer getPilledSeatings() {
		return pilledSeatings;
	}

	public void setPilledSeatings(Integer pilledSeatings) {
		this.pilledSeatings = pilledSeatings;
	}

	public List<ActionDetails> getActions() {
		return actions;
	}

	public void setActions(List<ActionDetails> actions) {
		this.actions = actions;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDateTime getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(LocalDateTime paidDate) {
		this.paidDate = paidDate;
	}

	public boolean isPaymentIntiated() {
		return paymentIntiated;
	}

	public void setPaymentIntiated(boolean paymentIntiated) {
		this.paymentIntiated = paymentIntiated;
	}

	public Long getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(Long serviceFee) {
		this.serviceFee = serviceFee;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Long getPenalty() {
		return penalty;
	}

	public void setPenalty(Long penalty) {
		this.penalty = penalty;
	}

	public Double getTaxArrears() {
		return taxArrears;
	}

	public void setTaxArrears(Double taxArrears) {
		this.taxArrears = taxArrears;
	}

	public Long getPenaltyArrears() {
		return penaltyArrears;
	}

	public void setPenaltyArrears(Long penaltyArrears) {
		this.penaltyArrears = penaltyArrears;
	}

	public List<IllicitPlaceDetailsDTO> getIllicitPlaceDetails() {
		return illicitPlaceDetails;
	}

	public void setIllicitPlaceDetails(List<IllicitPlaceDetailsDTO> illicitPlaceDetails) {
		this.illicitPlaceDetails = illicitPlaceDetails;
	}

	public String getPilledMeasurements() {
		return pilledMeasurements;
	}

	public void setPilledMeasurements(String pilledMeasurements) {
		this.pilledMeasurements = pilledMeasurements;
	}

	public String getPilledGoods() {
		return pilledGoods;
	}

	public void setPilledGoods(String pilledGoods) {
		this.pilledGoods = pilledGoods;
	}

	public Boolean getCfxIssued() {
		return cfxIssued;
	}

	public void setCfxIssued(Boolean cfxIssued) {
		this.cfxIssued = cfxIssued;
	}

	public Boolean getSaveDoc() {
		return saveDoc;
	}

	public void setSaveDoc(Boolean saveDoc) {
		this.saveDoc = saveDoc;
	}

	public boolean isVehicleHaveAitp() {
		return vehicleHaveAitp;
	}

	public void setVehicleHaveAitp(boolean vehicleHaveAitp) {
		this.vehicleHaveAitp = vehicleHaveAitp;
	}

	public boolean isAnnualTax() {
		return isAnnualTax;
	}

	public void setAnnualTax(boolean isAnnualTax) {
		this.isAnnualTax = isAnnualTax;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Boolean getVehicleSeized() {
		return vehicleSeized;
	}

	public void setVehicleSeized(Boolean vehicleSeized) {
		this.vehicleSeized = vehicleSeized;
	}

	public Double getCess() {
		return cess;
	}

	public void setCess(Double cess) {
		this.cess = cess;
	}

	public LocalDate getTaxValidityForTaxPaid() {
		return taxValidityForTaxPaid;
	}

	public void setTaxValidityForTaxPaid(LocalDate taxValidityForTaxPaid) {
		this.taxValidityForTaxPaid = taxValidityForTaxPaid;
	}

	public LocalDate getGreentaxValidityForTaxPaid() {
		return greentaxValidityForTaxPaid;
	}

	public void setGreentaxValidityForTaxPaid(LocalDate greentaxValidityForTaxPaid) {
		this.greentaxValidityForTaxPaid = greentaxValidityForTaxPaid;
	}

	public Boolean getDeductionMode() {
		return deductionMode;
	}

	public void setDeductionMode(Boolean deductionMode) {
		this.deductionMode = deductionMode;
	}

	public Boolean getVoluntaryMode() {
		return voluntaryMode;
	}

	public void setVoluntaryMode(Boolean voluntaryMode) {
		this.voluntaryMode = voluntaryMode;
	}

	public String getServiceApplicationNo() {
		return serviceApplicationNo;
	}

	public void setServiceApplicationNo(String serviceApplicationNo) {
		this.serviceApplicationNo = serviceApplicationNo;
	}

	public TaxHelper getTaxAmountForPrint() {
		return taxAmountForPrint;
	}

	public void setTaxAmountForPrint(TaxHelper taxAmountForPrint) {
		this.taxAmountForPrint = taxAmountForPrint;
	}

	public Boolean getPaymentDone() {
		return paymentDone;
	}

	public void setPaymentDone(Boolean paymentDone) {
		this.paymentDone = paymentDone;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Boolean getIsRoadSafety() {
		return isRoadSafety;
	}

	public void setIsRoadSafety(Boolean isRoadSafety) {
		this.isRoadSafety = isRoadSafety;
	}

	public Boolean getIsChallanModified() {
		return isChallanModified;
	}

	public void setIsChallanModified(Boolean isChallanModified) {
		this.isChallanModified = isChallanModified;
	}

	

}
