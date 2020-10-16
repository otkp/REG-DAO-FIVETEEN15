package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;

import org.epragati.constants.OwnerTypeEnum;
import org.epragati.dispatcher.dto.DispatcherSubmissionDTO;
import org.epragati.payment.dto.FeesDTO;
import org.epragati.payment.dto.PaymentGatewayTypeDTO;
import org.epragati.regservice.dto.IssuingAuthorityDetailsDTO;
import org.epragati.regservice.dto.PoliceClearanceCertificateDTO;
import org.epragati.regservice.dto.TheftVehicleDetailsDTO;
import org.epragati.tax.vo.TaxTypeEnum;
import org.epragati.util.StatusRegistration;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "staging_registration_details_report")
public class TrGeneratedReportDTO implements Serializable {

	/**
	 * yugandhar peddi
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String applicationId;

	private String status;

	private boolean isAnyChallan;

	private LocalDate lastChallanDate;

	private String applicantNo;

	private String applicantDisplayName;

	private String applicantFirstName;

	private String applicantLastName;

	private String applicantMiddleName;

	private String applicantFatherName;
	private String applicantMobile;

	private String applicantPhone;

	private String applicantAlternateMobile;

	private String applicantEmail;

	private Boolean isDifferentlyAbled = false;
	private String type;

	private String applicantDoorNo;

	private String applicantStreetName;

	private String applicantTownOrCity;

	private Integer applicantMandalCode;

	private String applicantMandalName;
	private Integer applicantDistricCode;
	private String applicantDistrictName;

	private String applicantStateId;

	private String applicantStateName;
	private Integer applicantCountryId;

	private String applicantCountryName;

	private String applicantOtherMandal;

	private String applicantOtherDistrict;

	private String applicantOtherState;
	private String applicantOtherPinCode;

	private String applicantOtherVillage;

	private String applicantOtherCountry;

	private Integer applicantVillageCode;

	private Integer applicantVillageId;

	private String applicantVillageName;

	private Boolean isDeathMandal;
	private AadhaarDetailsResponseDTO applicantAadharResponse;
	private Boolean isAadhaarValidated;

	private String applicantCreatedBy;
	private String applicantModifiedBy;
	private String applicantUpdatedBy;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime applicantCreatedDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime applicantModifiedDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime applicantLUpdate;
	private String ipAddress;
	private String migrationSource;
	private boolean isMigrated;
	private String remarks;
	private String applicantcreatedDateStr;
	private String applicantmodifiedDateStr;
	private String source;
	private Boolean isMoved;
	private String reqHeaderId;
	private Integer qulificationCode;
	private Integer applicantPostOfficeCode;
	private Integer applicantPostOfficeId;
	private String applicantPostOfficeName;
	private String qulificationDescription;
	private String bloodSlNo;

	private String bloodGrpName;
	private String nationality;
	private Boolean sameAsAadhar = false;

	// @Indexed(name = "aadharNo")
	private String applicantAadharNo;

	private String applicantGender;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate applicantDateOfBirth;
	private Boolean isAvailablePresentAddrsProoff = false;

	private String applicantPresentAddrsProofBelongsTo;

	private String applicantNameOfPresentAddrsProofBelongsTo;

	private String representativeName;

	private String entityName;

	private String regId;

	private String uidToken;

	private String applicantTypeaadhar;

	private String presentAddressFrom;
	private Boolean insuranceType = false;
	private String panNo;
	private boolean isPanVerifiedInOnlne;

	private String secondVehicleComments;
	private boolean isSecondVehicle;
	private String secondVehicleNo;

	private String financierTokenNo;
	private LocalDateTime financierTokenGeneratedTime;
	private String financerName;

	private Boolean isPanRequired;

	private String financierUserId;

	private String financieraddress;
	private Double financiersanctionedAmount;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate financierAgreementDate;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime financierLastUpdated;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime financierCreatedDate;
	private String financierComments;

	private Integer financierQuotationValue;

	private String insuranceCompany;

	private String insurancePolicyType;

	private String insurancePolicyNumber;
	private String ApplicationStatus;
	private Integer insuranceTenure;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate insuranceCancelledDate;
	private String insuranceCancelledReason;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate insuranceValidTill;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate insuranceValidFrom;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate insuranceValidTillForOther;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate insuranceValidFromForOther;

	private boolean isAssigned = false;

	private String trNo;

	private String prNo;

	private String oldPrNo;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime prGeneratedDate;

	private Integer stageNo;

	private Integer iteration;

	private boolean iterationFlag;
	private String vehicleType;

	private OwnerTypeEnum ownerType;
	private Boolean isTrailer = false;

	private String classOfVehicle;

	private String classOfVehicleDesc;

	private String taxType;
	private boolean trStatus;
	private boolean prStatus;
	private String hrspOfficeCode;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime trGeneratedDate;
	private Long taxAmount;
	private Long taxArrears;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate taxvalidity;
	private String invoiceNo;
	private Double invoiceValue;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate invoiceDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate invoiceDateForOther;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate purchaseDateForOther;
	private String officeCode;
	private String officeName;

	private String officeAddress1;

	private String officeAddress2;

	private String officeCity;

	private Integer officeVillage;

	private String officeMandal;
	private String dealerId;
	private Boolean isFinancier;

	private Long cesFee;

	private Double hsrpfee;

	private LocalDate cesValidity;

	private Boolean specialNumberRequired = false;
	private Boolean isAvailablePresentAddrsProof = false;

	private String presentAddrsProofBelongsTo;

	private String nameOfPresentAddrsProofBelongsTo;

	private boolean disabled;
	private String disabledComment;
	private String disabilityCov;

	private LocalDateTime registrationValidityDTOTrValidity;
	private LocalDateTime registrationValidityDTORegistrationValidity;
	private LocalDateTime registrationValidityDTOQuarterlyTaxValidity;
	private LocalDate registrationValidityDTOTaxValidity;
	private LocalDateTime registrationValidityDTOGreenTaxValidity;
	private LocalDate registrationValidityDTOCessValidity;
	private LocalDate registrationValidityDTOFinanceAgreementDate;
	private LocalDate registrationValidityDTOPrGeneratedDate;
	private LocalDate registrationValidityDTOTrGeneratedDate;

	private boolean secondVehicleTaxPaid;
	private Boolean isSecondVehicleDisplayCheck;

	private boolean isRejectedByEnclosure;

	private boolean isCfstSync;
	private boolean isCardPrinted;

	private boolean isDuplicate;

	private Boolean isCentralGovernamentOrDefenceEmployee = Boolean.FALSE;
	private String lastName;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate slotDate;
	private String slotTime;
	@JsonFormat(pattern = "dd-MM-yyyy HH:MM:SS")
	private LocalDateTime slotCreatedDate;
	private String SlotStatus;
	private String SlotStatusComment;

	private String gatewayTypeEnum;

	// NN , PN, SN
	private String prType;

	private boolean bodyBuilding;

	private List<FeesDTO> feeDetails;
	private Double totalFees;
	private PaymentGatewayTypeDTO paymentGatewayTypeDto;
	private String payStatus;
	private double refundAmound;
	private String role;

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

	private boolean isDataInsertedByDataEntry;

	private Boolean isTrExpired;

	private LocalDateTime reassignmentDoneDate;
	private List<Integer> serviceIds;
	private String registrationValidityDTOPrGeneratedDateStr;
	private String registrationValidityDTOTrGeneratedDateStr;
	private LocalDate registrationValidityDTOFcValidity;

	private String applicationNo;

	private String nocState;

	private String nocDistrict;

	private String nocRtaOffice;

	private String NocPeriodOfStay;

	private PoliceClearanceCertificateDTO policeClearanceDetails;

	private IssuingAuthorityDetailsDTO issueAuthorityDetails;

	private String nOCIssuedRtaOffice;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate nocIssueDate;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate nocDateOfEntry;

	private boolean isNocIssued;

	private String nocCancellationReason;

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

	private Boolean isduplicateRecord;

	// vahandetail start

	private String chassisNumber;
	private String engineNumber;
	private String ownerName;
	private String name;
	// private String makersDesc;
	private String model;
	// private String permanentAddress;
	private String color;
	// private String fuelDesc;
	private String manufacturedMonthYear;
	private String vehicleClass;
	private String makersModel;
	// private String gvw;
	// private String unladenWeight;
	private String seatingCapacity;
	private String statusMessage;

	private String registrationDate;
	private String ownerSr;
	private String firstName;
	private String presentAddress;
	private String bodyTypeDesc;
	private String fitUpto;
	private String taxUpto;
	private String financer;

	private String insuranceUpto;
	private String noCyl;
	private String cubicCapacity;
	private String sleeperCapacity;
	private String standCapacity;
	private String registeredAt;
	private String statusAsOn;
	private Integer exShowroomPrice;
	private boolean isUsed;

	private Double enginePower;
	private String frontAxleDesc;
	private Integer frontAxleWeight;
	private String fuelDesc;
	private Integer gvw;
	private Double height;
	private Double length;
	private String makersDesc;

	private String pollutionNormsDesc;
	private String o1AxleDesc;
	private Integer o1AxleWeight;
	private String o2AxleDesc;
	private Integer o2AxleWeight;
	private String o3AxleDesc;
	private Integer o3AxleWeight;
	private String o4AxleDesc;
	private Integer o4AxleWeight;
	private String o5AxleDesc;
	private Integer o5AxleWeight;
	private String rearAxleDesc;
	private Integer rearAxleWeight;
	private Integer unladenWeight;
	private Integer wheelbase;
	private Double width;

	private String tandemAxelDescp;
	private Integer tandemAxelWeight;

	private String makersName;

	private String dealerSelectedMakerName;

	private String dealerSelectedMakerClass;

	private String dealerSelectedBodyType;
	private List<String> dealerCovType;

	private String appNo;

	private String axleType;

	private Boolean isNonVahanData = false;

	private String harvestersMakerName;
	private String harvestersMakerClass;
	private String harvestersChassisNumber;
	private Integer harvestersUlw;
	private Integer harvestersRlw;

	private Boolean vahanstatus = false;

	private LocalDateTime vahanCreatedeDate;

	private Integer oldGvw;

	private Integer trailerGvw;
	private Integer gtw;
	private String trailerChassisNo;
	private Integer trailerUlw;
	private String trailerMakerName;
	private String trailerColour;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime createdDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime modifiedDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime lUpdate;

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isAnyChallan() {
		return isAnyChallan;
	}

	public void setAnyChallan(boolean isAnyChallan) {
		this.isAnyChallan = isAnyChallan;
	}

	public LocalDate getLastChallanDate() {
		return lastChallanDate;
	}

	public void setLastChallanDate(LocalDate lastChallanDate) {
		this.lastChallanDate = lastChallanDate;
	}

	public String getApplicantNo() {
		return applicantNo;
	}

	public void setApplicantNo(String applicantNo) {
		this.applicantNo = applicantNo;
	}

	public String getApplicantDisplayName() {
		return applicantDisplayName;
	}

	public void setApplicantDisplayName(String applicantDisplayName) {
		this.applicantDisplayName = applicantDisplayName;
	}

	public String getApplicantFirstName() {
		return applicantFirstName;
	}

	public void setApplicantFirstName(String applicantFirstName) {
		this.applicantFirstName = applicantFirstName;
	}

	public String getApplicantLastName() {
		return applicantLastName;
	}

	public void setApplicantLastName(String applicantLastName) {
		this.applicantLastName = applicantLastName;
	}

	public String getApplicantMiddleName() {
		return applicantMiddleName;
	}

	public void setApplicantMiddleName(String applicantMiddleName) {
		this.applicantMiddleName = applicantMiddleName;
	}

	public String getApplicantFatherName() {
		return applicantFatherName;
	}

	public void setApplicantFatherName(String applicantFatherName) {
		this.applicantFatherName = applicantFatherName;
	}

	public String getApplicantMobile() {
		return applicantMobile;
	}

	public void setApplicantMobile(String applicantMobile) {
		this.applicantMobile = applicantMobile;
	}

	public String getApplicantPhone() {
		return applicantPhone;
	}

	public void setApplicantPhone(String applicantPhone) {
		this.applicantPhone = applicantPhone;
	}

	public String getApplicantAlternateMobile() {
		return applicantAlternateMobile;
	}

	public void setApplicantAlternateMobile(String applicantAlternateMobile) {
		this.applicantAlternateMobile = applicantAlternateMobile;
	}

	public String getApplicantEmail() {
		return applicantEmail;
	}

	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}

	public Boolean getIsDifferentlyAbled() {
		return isDifferentlyAbled;
	}

	public void setIsDifferentlyAbled(Boolean isDifferentlyAbled) {
		this.isDifferentlyAbled = isDifferentlyAbled;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getApplicantDoorNo() {
		return applicantDoorNo;
	}

	public void setApplicantDoorNo(String applicantDoorNo) {
		this.applicantDoorNo = applicantDoorNo;
	}

	public String getApplicantStreetName() {
		return applicantStreetName;
	}

	public void setApplicantStreetName(String applicantStreetName) {
		this.applicantStreetName = applicantStreetName;
	}

	public String getApplicantTownOrCity() {
		return applicantTownOrCity;
	}

	public void setApplicantTownOrCity(String applicantTownOrCity) {
		this.applicantTownOrCity = applicantTownOrCity;
	}

	public Integer getApplicantMandalCode() {
		return applicantMandalCode;
	}

	public void setApplicantMandalCode(Integer applicantMandalCode) {
		this.applicantMandalCode = applicantMandalCode;
	}

	public String getApplicantMandalName() {
		return applicantMandalName;
	}

	public Integer getApplicantVillageCode() {
		return applicantVillageCode;
	}

	public void setApplicantVillageCode(Integer applicantVillageCode) {
		this.applicantVillageCode = applicantVillageCode;
	}

	public Integer getApplicantVillageId() {
		return applicantVillageId;
	}

	public void setApplicantVillageId(Integer applicantVillageId) {
		this.applicantVillageId = applicantVillageId;
	}

	public String getApplicantVillageName() {
		return applicantVillageName;
	}

	public void setApplicantVillageName(String applicantVillageName) {
		this.applicantVillageName = applicantVillageName;
	}

	public void setApplicantMandalName(String applicantMandalName) {
		this.applicantMandalName = applicantMandalName;
	}

	public Integer getApplicantDistricCode() {
		return applicantDistricCode;
	}

	public void setApplicantDistricCode(Integer applicantDistricCode) {
		this.applicantDistricCode = applicantDistricCode;
	}

	public String getApplicantDistrictName() {
		return applicantDistrictName;
	}

	public void setApplicantDistrictName(String applicantDistrictName) {
		this.applicantDistrictName = applicantDistrictName;
	}

	public String getApplicantStateId() {
		return applicantStateId;
	}

	public Integer getApplicantPostOfficeCode() {
		return applicantPostOfficeCode;
	}

	public void setApplicantPostOfficeCode(Integer applicantPostOfficeCode) {
		this.applicantPostOfficeCode = applicantPostOfficeCode;
	}

	public Integer getApplicantPostOfficeId() {
		return applicantPostOfficeId;
	}

	public void setApplicantPostOfficeId(Integer applicantPostOfficeId) {
		this.applicantPostOfficeId = applicantPostOfficeId;
	}

	public String getApplicantPostOfficeName() {
		return applicantPostOfficeName;
	}

	public void setApplicantPostOfficeName(String applicantPostOfficeName) {
		this.applicantPostOfficeName = applicantPostOfficeName;
	}

	public void setApplicantStateId(String applicantStateId) {
		this.applicantStateId = applicantStateId;
	}

	public String getApplicantStateName() {
		return applicantStateName;
	}

	public void setApplicantStateName(String applicantStateName) {
		this.applicantStateName = applicantStateName;
	}

	public Integer getApplicantCountryId() {
		return applicantCountryId;
	}

	public void setApplicantCountryId(Integer applicantCountryId) {
		this.applicantCountryId = applicantCountryId;
	}

	public String getApplicantCountryName() {
		return applicantCountryName;
	}

	public void setApplicantCountryName(String applicantCountryName) {
		this.applicantCountryName = applicantCountryName;
	}

	public String getApplicantOtherMandal() {
		return applicantOtherMandal;
	}

	public void setApplicantOtherMandal(String applicantOtherMandal) {
		this.applicantOtherMandal = applicantOtherMandal;
	}

	public String getApplicantOtherDistrict() {
		return applicantOtherDistrict;
	}

	public void setApplicantOtherDistrict(String applicantOtherDistrict) {
		this.applicantOtherDistrict = applicantOtherDistrict;
	}

	public String getApplicantOtherState() {
		return applicantOtherState;
	}

	public void setApplicantOtherState(String applicantOtherState) {
		this.applicantOtherState = applicantOtherState;
	}

	public String getApplicantOtherPinCode() {
		return applicantOtherPinCode;
	}

	public void setApplicantOtherPinCode(String applicantOtherPinCode) {
		this.applicantOtherPinCode = applicantOtherPinCode;
	}

	public String getApplicantOtherVillage() {
		return applicantOtherVillage;
	}

	public void setApplicantOtherVillage(String applicantOtherVillage) {
		this.applicantOtherVillage = applicantOtherVillage;
	}

	public String getApplicantOtherCountry() {
		return applicantOtherCountry;
	}

	public void setApplicantOtherCountry(String applicantOtherCountry) {
		this.applicantOtherCountry = applicantOtherCountry;
	}

	public Boolean getIsDeathMandal() {
		return isDeathMandal;
	}

	public void setIsDeathMandal(Boolean isDeathMandal) {
		this.isDeathMandal = isDeathMandal;
	}

	public AadhaarDetailsResponseDTO getApplicantAadharResponse() {
		return applicantAadharResponse;
	}

	public void setApplicantAadharResponse(AadhaarDetailsResponseDTO applicantAadharResponse) {
		this.applicantAadharResponse = applicantAadharResponse;
	}

	public Boolean getIsAadhaarValidated() {
		return isAadhaarValidated;
	}

	public void setIsAadhaarValidated(Boolean isAadhaarValidated) {
		this.isAadhaarValidated = isAadhaarValidated;
	}

	public String getApplicantCreatedBy() {
		return applicantCreatedBy;
	}

	public void setApplicantCreatedBy(String applicantCreatedBy) {
		this.applicantCreatedBy = applicantCreatedBy;
	}

	public String getApplicantModifiedBy() {
		return applicantModifiedBy;
	}

	public void setApplicantModifiedBy(String applicantModifiedBy) {
		this.applicantModifiedBy = applicantModifiedBy;
	}

	public String getApplicantUpdatedBy() {
		return applicantUpdatedBy;
	}

	public void setApplicantUpdatedBy(String applicantUpdatedBy) {
		this.applicantUpdatedBy = applicantUpdatedBy;
	}

	public LocalDateTime getApplicantCreatedDate() {
		return applicantCreatedDate;
	}

	public void setApplicantCreatedDate(LocalDateTime applicantCreatedDate) {
		this.applicantCreatedDate = applicantCreatedDate;
	}

	public LocalDateTime getApplicantModifiedDate() {
		return applicantModifiedDate;
	}

	public void setApplicantModifiedDate(LocalDateTime applicantModifiedDate) {
		this.applicantModifiedDate = applicantModifiedDate;
	}

	public LocalDateTime getApplicantLUpdate() {
		return applicantLUpdate;
	}

	public void setApplicantLUpdate(LocalDateTime applicantLUpdate) {
		this.applicantLUpdate = applicantLUpdate;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getMigrationSource() {
		return migrationSource;
	}

	public void setMigrationSource(String migrationSource) {
		this.migrationSource = migrationSource;
	}

	public boolean isMigrated() {
		return isMigrated;
	}

	public void setMigrated(boolean isMigrated) {
		this.isMigrated = isMigrated;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getApplicantcreatedDateStr() {
		return applicantcreatedDateStr;
	}

	public void setApplicantcreatedDateStr(String applicantcreatedDateStr) {
		this.applicantcreatedDateStr = applicantcreatedDateStr;
	}

	public String getApplicantmodifiedDateStr() {
		return applicantmodifiedDateStr;
	}

	public void setApplicantmodifiedDateStr(String applicantmodifiedDateStr) {
		this.applicantmodifiedDateStr = applicantmodifiedDateStr;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Boolean getIsMoved() {
		return isMoved;
	}

	public void setIsMoved(Boolean isMoved) {
		this.isMoved = isMoved;
	}

	public String getReqHeaderId() {
		return reqHeaderId;
	}

	public void setReqHeaderId(String reqHeaderId) {
		this.reqHeaderId = reqHeaderId;
	}

	public Integer getQulificationCode() {
		return qulificationCode;
	}

	public void setQulificationCode(Integer qulificationCode) {
		this.qulificationCode = qulificationCode;
	}

	public String getQulificationDescription() {
		return qulificationDescription;
	}

	public void setQulificationDescription(String qulificationDescription) {
		this.qulificationDescription = qulificationDescription;
	}

	public String getBloodSlNo() {
		return bloodSlNo;
	}

	public void setBloodSlNo(String bloodSlNo) {
		this.bloodSlNo = bloodSlNo;
	}

	public String getBloodGrpName() {
		return bloodGrpName;
	}

	public void setBloodGrpName(String bloodGrpName) {
		this.bloodGrpName = bloodGrpName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Boolean getSameAsAadhar() {
		return sameAsAadhar;
	}

	public void setSameAsAadhar(Boolean sameAsAadhar) {
		this.sameAsAadhar = sameAsAadhar;
	}

	public String getApplicantAadharNo() {
		return applicantAadharNo;
	}

	public void setApplicantAadharNo(String applicantAadharNo) {
		this.applicantAadharNo = applicantAadharNo;
	}

	public String getApplicantGender() {
		return applicantGender;
	}

	public void setApplicantGender(String applicantGender) {
		this.applicantGender = applicantGender;
	}

	public LocalDate getApplicantDateOfBirth() {
		return applicantDateOfBirth;
	}

	public void setApplicantDateOfBirth(LocalDate applicantDateOfBirth) {
		this.applicantDateOfBirth = applicantDateOfBirth;
	}

	public Boolean getIsAvailablePresentAddrsProoff() {
		return isAvailablePresentAddrsProoff;
	}

	public void setIsAvailablePresentAddrsProoff(Boolean isAvailablePresentAddrsProoff) {
		this.isAvailablePresentAddrsProoff = isAvailablePresentAddrsProoff;
	}

	public String getApplicantPresentAddrsProofBelongsTo() {
		return applicantPresentAddrsProofBelongsTo;
	}

	public void setApplicantPresentAddrsProofBelongsTo(String applicantPresentAddrsProofBelongsTo) {
		this.applicantPresentAddrsProofBelongsTo = applicantPresentAddrsProofBelongsTo;
	}

	public String getApplicantNameOfPresentAddrsProofBelongsTo() {
		return applicantNameOfPresentAddrsProofBelongsTo;
	}

	public void setApplicantNameOfPresentAddrsProofBelongsTo(String applicantNameOfPresentAddrsProofBelongsTo) {
		this.applicantNameOfPresentAddrsProofBelongsTo = applicantNameOfPresentAddrsProofBelongsTo;
	}

	public String getRepresentativeName() {
		return representativeName;
	}

	public void setRepresentativeName(String representativeName) {
		this.representativeName = representativeName;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public String getUidToken() {
		return uidToken;
	}

	public void setUidToken(String uidToken) {
		this.uidToken = uidToken;
	}

	public String getApplicantTypeaadhar() {
		return applicantTypeaadhar;
	}

	public void setApplicantTypeaadhar(String applicantTypeaadhar) {
		this.applicantTypeaadhar = applicantTypeaadhar;
	}

	public String getPresentAddressFrom() {
		return presentAddressFrom;
	}

	public void setPresentAddressFrom(String presentAddressFrom) {
		this.presentAddressFrom = presentAddressFrom;
	}

	public Boolean getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(Boolean insuranceType) {
		this.insuranceType = insuranceType;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public boolean isPanVerifiedInOnlne() {
		return isPanVerifiedInOnlne;
	}

	public void setPanVerifiedInOnlne(boolean isPanVerifiedInOnlne) {
		this.isPanVerifiedInOnlne = isPanVerifiedInOnlne;
	}

	public String getSecondVehicleComments() {
		return secondVehicleComments;
	}

	public void setSecondVehicleComments(String secondVehicleComments) {
		this.secondVehicleComments = secondVehicleComments;
	}

	public boolean isSecondVehicle() {
		return isSecondVehicle;
	}

	public void setSecondVehicle(boolean isSecondVehicle) {
		this.isSecondVehicle = isSecondVehicle;
	}

	public String getSecondVehicleNo() {
		return secondVehicleNo;
	}

	public void setSecondVehicleNo(String secondVehicleNo) {
		this.secondVehicleNo = secondVehicleNo;
	}

	public String getFinancierTokenNo() {
		return financierTokenNo;
	}

	public void setFinancierTokenNo(String financierTokenNo) {
		this.financierTokenNo = financierTokenNo;
	}

	public LocalDateTime getFinancierTokenGeneratedTime() {
		return financierTokenGeneratedTime;
	}

	public void setFinancierTokenGeneratedTime(LocalDateTime financierTokenGeneratedTime) {
		this.financierTokenGeneratedTime = financierTokenGeneratedTime;
	}

	public String getFinancerName() {
		return financerName;
	}

	public void setFinancerName(String financerName) {
		this.financerName = financerName;
	}

	public String getFinancierUserId() {
		return financierUserId;
	}

	public void setFinancierUserId(String financierUserId) {
		this.financierUserId = financierUserId;
	}

	public String getFinancieraddress() {
		return financieraddress;
	}

	public void setFinancieraddress(String financieraddress) {
		this.financieraddress = financieraddress;
	}

	public Double getFinanciersanctionedAmount() {
		return financiersanctionedAmount;
	}

	public void setFinanciersanctionedAmount(Double financiersanctionedAmount) {
		this.financiersanctionedAmount = financiersanctionedAmount;
	}

	public LocalDate getFinancierAgreementDate() {
		return financierAgreementDate;
	}

	public void setFinancierAgreementDate(LocalDate financierAgreementDate) {
		this.financierAgreementDate = financierAgreementDate;
	}

	public LocalDateTime getFinancierLastUpdated() {
		return financierLastUpdated;
	}

	public void setFinancierLastUpdated(LocalDateTime financierLastUpdated) {
		this.financierLastUpdated = financierLastUpdated;
	}

	public LocalDateTime getFinancierCreatedDate() {
		return financierCreatedDate;
	}

	public void setFinancierCreatedDate(LocalDateTime financierCreatedDate) {
		this.financierCreatedDate = financierCreatedDate;
	}

	public String getFinancierComments() {
		return financierComments;
	}

	public void setFinancierComments(String financierComments) {
		this.financierComments = financierComments;
	}

	public Integer getFinancierQuotationValue() {
		return financierQuotationValue;
	}

	public void setFinancierQuotationValue(Integer financierQuotationValue) {
		this.financierQuotationValue = financierQuotationValue;
	}

	public String getInsuranceCompany() {
		return insuranceCompany;
	}

	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}

	public String getInsurancePolicyType() {
		return insurancePolicyType;
	}

	public void setInsurancePolicyType(String insurancePolicyType) {
		this.insurancePolicyType = insurancePolicyType;
	}

	public String getInsurancePolicyNumber() {
		return insurancePolicyNumber;
	}

	public void setInsurancePolicyNumber(String insurancePolicyNumber) {
		this.insurancePolicyNumber = insurancePolicyNumber;
	}

	public Integer getInsuranceTenure() {
		return insuranceTenure;
	}

	public void setInsuranceTenure(Integer insuranceTenure) {
		this.insuranceTenure = insuranceTenure;
	}

	public LocalDate getInsuranceCancelledDate() {
		return insuranceCancelledDate;
	}

	public void setInsuranceCancelledDate(LocalDate insuranceCancelledDate) {
		this.insuranceCancelledDate = insuranceCancelledDate;
	}

	public String getInsuranceCancelledReason() {
		return insuranceCancelledReason;
	}

	public void setInsuranceCancelledReason(String insuranceCancelledReason) {
		this.insuranceCancelledReason = insuranceCancelledReason;
	}

	public LocalDate getInsuranceValidTill() {
		return insuranceValidTill;
	}

	public void setInsuranceValidTill(LocalDate insuranceValidTill) {
		this.insuranceValidTill = insuranceValidTill;
	}

	public LocalDate getInsuranceValidFrom() {
		return insuranceValidFrom;
	}

	public void setInsuranceValidFrom(LocalDate insuranceValidFrom) {
		this.insuranceValidFrom = insuranceValidFrom;
	}

	public LocalDate getInsuranceValidTillForOther() {
		return insuranceValidTillForOther;
	}

	public void setInsuranceValidTillForOther(LocalDate insuranceValidTillForOther) {
		this.insuranceValidTillForOther = insuranceValidTillForOther;
	}

	public LocalDate getInsuranceValidFromForOther() {
		return insuranceValidFromForOther;
	}

	public void setInsuranceValidFromForOther(LocalDate insuranceValidFromForOther) {
		this.insuranceValidFromForOther = insuranceValidFromForOther;
	}

	public boolean isAssigned() {
		return isAssigned;
	}

	public void setAssigned(boolean isAssigned) {
		this.isAssigned = isAssigned;
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

	public String getOldPrNo() {
		return oldPrNo;
	}

	public void setOldPrNo(String oldPrNo) {
		this.oldPrNo = oldPrNo;
	}

	public LocalDateTime getPrGeneratedDate() {
		return prGeneratedDate;
	}

	public void setPrGeneratedDate(LocalDateTime prGeneratedDate) {
		this.prGeneratedDate = prGeneratedDate;
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

	public boolean isIterationFlag() {
		return iterationFlag;
	}

	public void setIterationFlag(boolean iterationFlag) {
		this.iterationFlag = iterationFlag;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public OwnerTypeEnum getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(OwnerTypeEnum ownerType) {
		this.ownerType = ownerType;
	}

	public Boolean getIsTrailer() {
		return isTrailer;
	}

	public void setIsTrailer(Boolean isTrailer) {
		this.isTrailer = isTrailer;
	}

	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	public String getClassOfVehicleDesc() {
		return classOfVehicleDesc;
	}

	public void setClassOfVehicleDesc(String classOfVehicleDesc) {
		this.classOfVehicleDesc = classOfVehicleDesc;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public boolean isTrStatus() {
		return trStatus;
	}

	public void setTrStatus(boolean trStatus) {
		this.trStatus = trStatus;
	}

	public boolean isPrStatus() {
		return prStatus;
	}

	public void setPrStatus(boolean prStatus) {
		this.prStatus = prStatus;
	}

	public String getHrspOfficeCode() {
		return hrspOfficeCode;
	}

	public void setHrspOfficeCode(String hrspOfficeCode) {
		this.hrspOfficeCode = hrspOfficeCode;
	}

	public LocalDateTime getTrGeneratedDate() {
		return trGeneratedDate;
	}

	public void setTrGeneratedDate(LocalDateTime trGeneratedDate) {
		this.trGeneratedDate = trGeneratedDate;
	}

	public Long getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Long taxAmount) {
		this.taxAmount = taxAmount;
	}

	public Long getTaxArrears() {
		return taxArrears;
	}

	public void setTaxArrears(Long taxArrears) {
		this.taxArrears = taxArrears;
	}

	public LocalDate getTaxvalidity() {
		return taxvalidity;
	}

	public void setTaxvalidity(LocalDate taxvalidity) {
		this.taxvalidity = taxvalidity;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public Double getInvoiceValue() {
		return invoiceValue;
	}

	public void setInvoiceValue(Double invoiceValue) {
		this.invoiceValue = invoiceValue;
	}

	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public LocalDate getInvoiceDateForOther() {
		return invoiceDateForOther;
	}

	public void setInvoiceDateForOther(LocalDate invoiceDateForOther) {
		this.invoiceDateForOther = invoiceDateForOther;
	}

	public LocalDate getPurchaseDateForOther() {
		return purchaseDateForOther;
	}

	public void setPurchaseDateForOther(LocalDate purchaseDateForOther) {
		this.purchaseDateForOther = purchaseDateForOther;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getOfficeAddress1() {
		return officeAddress1;
	}

	public void setOfficeAddress1(String officeAddress1) {
		this.officeAddress1 = officeAddress1;
	}

	public String getOfficeAddress2() {
		return officeAddress2;
	}

	public void setOfficeAddress2(String officeAddress2) {
		this.officeAddress2 = officeAddress2;
	}

	public String getOfficeCity() {
		return officeCity;
	}

	public void setOfficeCity(String officeCity) {
		this.officeCity = officeCity;
	}

	public Integer getOfficeVillage() {
		return officeVillage;
	}

	public void setOfficeVillage(Integer officeVillage) {
		this.officeVillage = officeVillage;
	}

	public String getOfficeMandal() {
		return officeMandal;
	}

	public void setOfficeMandal(String officeMandal) {
		this.officeMandal = officeMandal;
	}

	public String getDealerId() {
		return dealerId;
	}

	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}

	public Boolean getIsFinancier() {
		return isFinancier;
	}

	public void setIsFinancier(Boolean isFinancier) {
		this.isFinancier = isFinancier;
	}

	public Long getCesFee() {
		return cesFee;
	}

	public void setCesFee(Long cesFee) {
		this.cesFee = cesFee;
	}

	public Double getHsrpfee() {
		return hsrpfee;
	}

	public void setHsrpfee(Double hsrpfee) {
		this.hsrpfee = hsrpfee;
	}

	public LocalDate getCesValidity() {
		return cesValidity;
	}

	public void setCesValidity(LocalDate cesValidity) {
		this.cesValidity = cesValidity;
	}

	public Boolean getSpecialNumberRequired() {
		return specialNumberRequired;
	}

	public void setSpecialNumberRequired(Boolean specialNumberRequired) {
		this.specialNumberRequired = specialNumberRequired;
	}

	public Boolean getIsAvailablePresentAddrsProof() {
		return isAvailablePresentAddrsProof;
	}

	public void setIsAvailablePresentAddrsProof(Boolean isAvailablePresentAddrsProof) {
		this.isAvailablePresentAddrsProof = isAvailablePresentAddrsProof;
	}

	public String getPresentAddrsProofBelongsTo() {
		return presentAddrsProofBelongsTo;
	}

	public void setPresentAddrsProofBelongsTo(String presentAddrsProofBelongsTo) {
		this.presentAddrsProofBelongsTo = presentAddrsProofBelongsTo;
	}

	public String getNameOfPresentAddrsProofBelongsTo() {
		return nameOfPresentAddrsProofBelongsTo;
	}

	public void setNameOfPresentAddrsProofBelongsTo(String nameOfPresentAddrsProofBelongsTo) {
		this.nameOfPresentAddrsProofBelongsTo = nameOfPresentAddrsProofBelongsTo;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public String getDisabledComment() {
		return disabledComment;
	}

	public void setDisabledComment(String disabledComment) {
		this.disabledComment = disabledComment;
	}

	public String getDisabilityCov() {
		return disabilityCov;
	}

	public void setDisabilityCov(String disabilityCov) {
		this.disabilityCov = disabilityCov;
	}

	public LocalDateTime getRegistrationValidityDTOTrValidity() {
		return registrationValidityDTOTrValidity;
	}

	public void setRegistrationValidityDTOTrValidity(LocalDateTime registrationValidityDTOTrValidity) {
		this.registrationValidityDTOTrValidity = registrationValidityDTOTrValidity;
	}

	public LocalDateTime getRegistrationValidityDTORegistrationValidity() {
		return registrationValidityDTORegistrationValidity;
	}

	public void setRegistrationValidityDTORegistrationValidity(
			LocalDateTime registrationValidityDTORegistrationValidity) {
		this.registrationValidityDTORegistrationValidity = registrationValidityDTORegistrationValidity;
	}

	public LocalDateTime getRegistrationValidityDTOQuarterlyTaxValidity() {
		return registrationValidityDTOQuarterlyTaxValidity;
	}

	public void setRegistrationValidityDTOQuarterlyTaxValidity(
			LocalDateTime registrationValidityDTOQuarterlyTaxValidity) {
		this.registrationValidityDTOQuarterlyTaxValidity = registrationValidityDTOQuarterlyTaxValidity;
	}

	public LocalDate getRegistrationValidityDTOTaxValidity() {
		return registrationValidityDTOTaxValidity;
	}

	public void setRegistrationValidityDTOTaxValidity(LocalDate registrationValidityDTOTaxValidity) {
		this.registrationValidityDTOTaxValidity = registrationValidityDTOTaxValidity;
	}

	public LocalDateTime getRegistrationValidityDTOGreenTaxValidity() {
		return registrationValidityDTOGreenTaxValidity;
	}

	public void setRegistrationValidityDTOGreenTaxValidity(LocalDateTime registrationValidityDTOGreenTaxValidity) {
		this.registrationValidityDTOGreenTaxValidity = registrationValidityDTOGreenTaxValidity;
	}

	public LocalDate getRegistrationValidityDTOCessValidity() {
		return registrationValidityDTOCessValidity;
	}

	public void setRegistrationValidityDTOCessValidity(LocalDate registrationValidityDTOCessValidity) {
		this.registrationValidityDTOCessValidity = registrationValidityDTOCessValidity;
	}

	public LocalDate getRegistrationValidityDTOFinanceAgreementDate() {
		return registrationValidityDTOFinanceAgreementDate;
	}

	public void setRegistrationValidityDTOFinanceAgreementDate(LocalDate registrationValidityDTOFinanceAgreementDate) {
		this.registrationValidityDTOFinanceAgreementDate = registrationValidityDTOFinanceAgreementDate;
	}

	public LocalDate getRegistrationValidityDTOPrGeneratedDate() {
		return registrationValidityDTOPrGeneratedDate;
	}

	public void setRegistrationValidityDTOPrGeneratedDate(LocalDate registrationValidityDTOPrGeneratedDate) {
		this.registrationValidityDTOPrGeneratedDate = registrationValidityDTOPrGeneratedDate;
	}

	public LocalDate getRegistrationValidityDTOTrGeneratedDate() {
		return registrationValidityDTOTrGeneratedDate;
	}

	public void setRegistrationValidityDTOTrGeneratedDate(LocalDate registrationValidityDTOTrGeneratedDate) {
		this.registrationValidityDTOTrGeneratedDate = registrationValidityDTOTrGeneratedDate;
	}

	public boolean isSecondVehicleTaxPaid() {
		return secondVehicleTaxPaid;
	}

	public void setSecondVehicleTaxPaid(boolean secondVehicleTaxPaid) {
		this.secondVehicleTaxPaid = secondVehicleTaxPaid;
	}

	public Boolean getIsSecondVehicleDisplayCheck() {
		return isSecondVehicleDisplayCheck;
	}

	public void setIsSecondVehicleDisplayCheck(Boolean isSecondVehicleDisplayCheck) {
		this.isSecondVehicleDisplayCheck = isSecondVehicleDisplayCheck;
	}

	public boolean isRejectedByEnclosure() {
		return isRejectedByEnclosure;
	}

	public void setRejectedByEnclosure(boolean isRejectedByEnclosure) {
		this.isRejectedByEnclosure = isRejectedByEnclosure;
	}

	public boolean isCfstSync() {
		return isCfstSync;
	}

	public void setCfstSync(boolean isCfstSync) {
		this.isCfstSync = isCfstSync;
	}

	public boolean isCardPrinted() {
		return isCardPrinted;
	}

	public void setCardPrinted(boolean isCardPrinted) {
		this.isCardPrinted = isCardPrinted;
	}

	public boolean isDuplicate() {
		return isDuplicate;
	}

	public void setDuplicate(boolean isDuplicate) {
		this.isDuplicate = isDuplicate;
	}

	public Boolean getIsCentralGovernamentOrDefenceEmployee() {
		return isCentralGovernamentOrDefenceEmployee;
	}

	public void setIsCentralGovernamentOrDefenceEmployee(Boolean isCentralGovernamentOrDefenceEmployee) {
		this.isCentralGovernamentOrDefenceEmployee = isCentralGovernamentOrDefenceEmployee;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getSlotDate() {
		return slotDate;
	}

	public void setSlotDate(LocalDate slotDate) {
		this.slotDate = slotDate;
	}

	public String getSlotTime() {
		return slotTime;
	}

	public void setSlotTime(String slotTime) {
		this.slotTime = slotTime;
	}

	public LocalDateTime getSlotCreatedDate() {
		return slotCreatedDate;
	}

	public void setSlotCreatedDate(LocalDateTime slotCreatedDate) {
		this.slotCreatedDate = slotCreatedDate;
	}

	public String getSlotStatus() {
		return SlotStatus;
	}

	public void setSlotStatus(String slotStatus) {
		SlotStatus = slotStatus;
	}

	public String getSlotStatusComment() {
		return SlotStatusComment;
	}

	public void setSlotStatusComment(String slotStatusComment) {
		SlotStatusComment = slotStatusComment;
	}

	public String getGatewayTypeEnum() {
		return gatewayTypeEnum;
	}

	public void setGatewayTypeEnum(String gatewayTypeEnum) {
		this.gatewayTypeEnum = gatewayTypeEnum;
	}

	public String getPrType() {
		return prType;
	}

	public void setPrType(String prType) {
		this.prType = prType;
	}

	public boolean isBodyBuilding() {
		return bodyBuilding;
	}

	public void setBodyBuilding(boolean bodyBuilding) {
		this.bodyBuilding = bodyBuilding;
	}

	public List<FeesDTO> getFeeDetails() {
		return feeDetails;
	}

	public void setFeeDetails(List<FeesDTO> feeDetails) {
		this.feeDetails = feeDetails;
	}

	public Double getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(Double totalFees) {
		this.totalFees = totalFees;
	}

	public PaymentGatewayTypeDTO getPaymentGatewayTypeDto() {
		return paymentGatewayTypeDto;
	}

	public void setPaymentGatewayTypeDto(PaymentGatewayTypeDTO paymentGatewayTypeDto) {
		this.paymentGatewayTypeDto = paymentGatewayTypeDto;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public double getRefundAmound() {
		return refundAmound;
	}

	public void setRefundAmound(double refundAmound) {
		this.refundAmound = refundAmound;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getApprovalStage() {
		return approvalStage;
	}

	public void setApprovalStage(String approvalStage) {
		this.approvalStage = approvalStage;
	}

	public Long getPenalty() {
		return penalty;
	}

	public void setPenalty(Long penalty) {
		this.penalty = penalty;
	}

	public Long getPenaltyArrears() {
		return penaltyArrears;
	}

	public void setPenaltyArrears(Long penaltyArrears) {
		this.penaltyArrears = penaltyArrears;
	}

	public boolean isDiffTaxPaid() {
		return diffTaxPaid;
	}

	public void setDiffTaxPaid(boolean diffTaxPaid) {
		this.diffTaxPaid = diffTaxPaid;
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

	public boolean isTaxPaidByVcr() {
		return isTaxPaidByVcr;
	}

	public void setTaxPaidByVcr(boolean isTaxPaidByVcr) {
		this.isTaxPaidByVcr = isTaxPaidByVcr;
	}

	public boolean isDataInsertedByDataEntry() {
		return isDataInsertedByDataEntry;
	}

	public void setDataInsertedByDataEntry(boolean isDataInsertedByDataEntry) {
		this.isDataInsertedByDataEntry = isDataInsertedByDataEntry;
	}

	public Boolean getIsTrExpired() {
		return isTrExpired;
	}

	public void setIsTrExpired(Boolean isTrExpired) {
		this.isTrExpired = isTrExpired;
	}

	public LocalDateTime getReassignmentDoneDate() {
		return reassignmentDoneDate;
	}

	public void setReassignmentDoneDate(LocalDateTime reassignmentDoneDate) {
		this.reassignmentDoneDate = reassignmentDoneDate;
	}

	public List<Integer> getServiceIds() {
		return serviceIds;
	}

	public void setServiceIds(List<Integer> serviceIds) {
		this.serviceIds = serviceIds;
	}

	public String getRegistrationValidityDTOPrGeneratedDateStr() {
		return registrationValidityDTOPrGeneratedDateStr;
	}

	public void setRegistrationValidityDTOPrGeneratedDateStr(String registrationValidityDTOPrGeneratedDateStr) {
		this.registrationValidityDTOPrGeneratedDateStr = registrationValidityDTOPrGeneratedDateStr;
	}

	public String getRegistrationValidityDTOTrGeneratedDateStr() {
		return registrationValidityDTOTrGeneratedDateStr;
	}

	public void setRegistrationValidityDTOTrGeneratedDateStr(String registrationValidityDTOTrGeneratedDateStr) {
		this.registrationValidityDTOTrGeneratedDateStr = registrationValidityDTOTrGeneratedDateStr;
	}

	public LocalDate getRegistrationValidityDTOFcValidity() {
		return registrationValidityDTOFcValidity;
	}

	public void setRegistrationValidityDTOFcValidity(LocalDate registrationValidityDTOFcValidity) {
		this.registrationValidityDTOFcValidity = registrationValidityDTOFcValidity;
	}

	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getNocState() {
		return nocState;
	}

	public void setNocState(String nocState) {
		this.nocState = nocState;
	}

	public String getNocDistrict() {
		return nocDistrict;
	}

	public void setNocDistrict(String nocDistrict) {
		this.nocDistrict = nocDistrict;
	}

	public String getNocRtaOffice() {
		return nocRtaOffice;
	}

	public void setNocRtaOffice(String nocRtaOffice) {
		this.nocRtaOffice = nocRtaOffice;
	}

	public String getNocPeriodOfStay() {
		return NocPeriodOfStay;
	}

	public void setNocPeriodOfStay(String nocPeriodOfStay) {
		NocPeriodOfStay = nocPeriodOfStay;
	}

	public PoliceClearanceCertificateDTO getPoliceClearanceDetails() {
		return policeClearanceDetails;
	}

	public void setPoliceClearanceDetails(PoliceClearanceCertificateDTO policeClearanceDetails) {
		this.policeClearanceDetails = policeClearanceDetails;
	}

	public IssuingAuthorityDetailsDTO getIssueAuthorityDetails() {
		return issueAuthorityDetails;
	}

	public void setIssueAuthorityDetails(IssuingAuthorityDetailsDTO issueAuthorityDetails) {
		this.issueAuthorityDetails = issueAuthorityDetails;
	}

	public String getnOCIssuedRtaOffice() {
		return nOCIssuedRtaOffice;
	}

	public void setnOCIssuedRtaOffice(String nOCIssuedRtaOffice) {
		this.nOCIssuedRtaOffice = nOCIssuedRtaOffice;
	}

	public LocalDate getNocIssueDate() {
		return nocIssueDate;
	}

	public void setNocIssueDate(LocalDate nocIssueDate) {
		this.nocIssueDate = nocIssueDate;
	}

	public LocalDate getNocDateOfEntry() {
		return nocDateOfEntry;
	}

	public void setNocDateOfEntry(LocalDate nocDateOfEntry) {
		this.nocDateOfEntry = nocDateOfEntry;
	}

	public boolean isNocIssued() {
		return isNocIssued;
	}

	public void setNocIssued(boolean isNocIssued) {
		this.isNocIssued = isNocIssued;
	}

	public String getNocCancellationReason() {
		return nocCancellationReason;
	}

	public void setNocCancellationReason(String nocCancellationReason) {
		this.nocCancellationReason = nocCancellationReason;
	}

	public List<PrBackUpDetailsDTO> getPrBackUpDetailsList() {
		return prBackUpDetailsList;
	}

	public void setPrBackUpDetailsList(List<PrBackUpDetailsDTO> prBackUpDetailsList) {
		this.prBackUpDetailsList = prBackUpDetailsList;
	}

	public boolean isAllowForOtherServiceByDataEntry() {
		return isAllowForOtherServiceByDataEntry;
	}

	public void setAllowForOtherServiceByDataEntry(boolean isAllowForOtherServiceByDataEntry) {
		this.isAllowForOtherServiceByDataEntry = isAllowForOtherServiceByDataEntry;
	}

	public boolean isAllowForReassignment() {
		return isAllowForReassignment;
	}

	public void setAllowForReassignment(boolean isAllowForReassignment) {
		this.isAllowForReassignment = isAllowForReassignment;
	}

	public String getPaymentTransactionNo() {
		return paymentTransactionNo;
	}

	public void setPaymentTransactionNo(String paymentTransactionNo) {
		this.paymentTransactionNo = paymentTransactionNo;
	}

	public boolean isRequiredToBlock() {
		return isRequiredToBlock;
	}

	public void setRequiredToBlock(boolean isRequiredToBlock) {
		this.isRequiredToBlock = isRequiredToBlock;
	}

	public String getActionStatus() {
		return actionStatus;
	}

	public void setActionStatus(String actionStatus) {
		this.actionStatus = actionStatus;
	}

	public StatusRegistration.TheftState getTheftState() {
		return theftState;
	}

	public void setTheftState(StatusRegistration.TheftState theftState) {
		this.theftState = theftState;
	}

	public TheftVehicleDetailsDTO getTheftDetails() {
		return theftDetails;
	}

	public void setTheftDetails(TheftVehicleDetailsDTO theftDetails) {
		this.theftDetails = theftDetails;
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

	public boolean isCfxIssued() {
		return isCfxIssued;
	}

	public void setCfxIssued(boolean isCfxIssued) {
		this.isCfxIssued = isCfxIssued;
	}

	public TaxTypeEnum.TaxPayType getPayTaxType() {
		return payTaxType;
	}

	public void setPayTaxType(TaxTypeEnum.TaxPayType payTaxType) {
		this.payTaxType = payTaxType;
	}

	public boolean isVehicleStoppaged() {
		return isVehicleStoppaged;
	}

	public void setVehicleStoppaged(boolean isVehicleStoppaged) {
		this.isVehicleStoppaged = isVehicleStoppaged;
	}

	public LocalDate getStoppageDate() {
		return stoppageDate;
	}

	public void setStoppageDate(LocalDate stoppageDate) {
		this.stoppageDate = stoppageDate;
	}

	public long getTaxExemMonths() {
		return taxExemMonths;
	}

	public void setTaxExemMonths(long taxExemMonths) {
		this.taxExemMonths = taxExemMonths;
	}

	public boolean isVehicleStoppageRevoked() {
		return isVehicleStoppageRevoked;
	}

	public void setVehicleStoppageRevoked(boolean isVehicleStoppageRevoked) {
		this.isVehicleStoppageRevoked = isVehicleStoppageRevoked;
	}

	public LocalDate getVehicleStoppageRevokedDate() {
		return vehicleStoppageRevokedDate;
	}

	public void setVehicleStoppageRevokedDate(LocalDate vehicleStoppageRevokedDate) {
		this.vehicleStoppageRevokedDate = vehicleStoppageRevokedDate;
	}

	public String getPermitActionStatus() {
		return permitActionStatus;
	}

	public void setPermitActionStatus(String permitActionStatus) {
		this.permitActionStatus = permitActionStatus;
	}

	public boolean isCardDispatched() {
		return isCardDispatched;
	}

	public void setCardDispatched(boolean isCardDispatched) {
		this.isCardDispatched = isCardDispatched;
	}

	public LocalDateTime getCardPrintedDate() {
		return cardPrintedDate;
	}

	public void setCardPrintedDate(LocalDateTime cardPrintedDate) {
		this.cardPrintedDate = cardPrintedDate;
	}

	public String getApplicantType() {
		return applicantType;
	}

	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
	}

	public DispatcherSubmissionDTO getDispatcherFormSubmissionDTO() {
		return dispatcherFormSubmissionDTO;
	}

	public void setDispatcherFormSubmissionDTO(DispatcherSubmissionDTO dispatcherFormSubmissionDTO) {
		this.dispatcherFormSubmissionDTO = dispatcherFormSubmissionDTO;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isMVIDoneForIvcn() {
		return isMVIDoneForIvcn;
	}

	public void setMVIDoneForIvcn(boolean isMVIDoneForIvcn) {
		this.isMVIDoneForIvcn = isMVIDoneForIvcn;
	}

	public boolean isFromReassigment() {
		return isFromReassigment;
	}

	public void setFromReassigment(boolean isFromReassigment) {
		this.isFromReassigment = isFromReassigment;
	}

	public boolean isNeedToUpdatePrNoInFc() {
		return isNeedToUpdatePrNoInFc;
	}

	public void setNeedToUpdatePrNoInFc(boolean isNeedToUpdatePrNoInFc) {
		this.isNeedToUpdatePrNoInFc = isNeedToUpdatePrNoInFc;
	}

	public String getMovedSource() {
		return movedSource;
	}

	public void setMovedSource(String movedSource) {
		this.movedSource = movedSource;
	}

	public List<String> getSchedulerIssues() {
		return schedulerIssues;
	}

	public void setSchedulerIssues(List<String> schedulerIssues) {
		this.schedulerIssues = schedulerIssues;
	}

	public boolean isWeightAltDone() {
		return isWeightAltDone;
	}

	public void setWeightAltDone(boolean isWeightAltDone) {
		this.isWeightAltDone = isWeightAltDone;
	}

	public Boolean getIsvahanSync() {
		return isvahanSync;
	}

	public void setIsvahanSync(Boolean isvahanSync) {
		this.isvahanSync = isvahanSync;
	}

	public List<ClassOfVehiclesLogDTO> getCovHistory() {
		return covHistory;
	}

	public void setCovHistory(List<ClassOfVehiclesLogDTO> covHistory) {
		this.covHistory = covHistory;
	}

	public Boolean getIsvahanSyncSkip() {
		return isvahanSyncSkip;
	}

	public void setIsvahanSyncSkip(Boolean isvahanSyncSkip) {
		this.isvahanSyncSkip = isvahanSyncSkip;
	}

	public boolean isApprovedByAutomation() {
		return isApprovedByAutomation;
	}

	public void setApprovedByAutomation(boolean isApprovedByAutomation) {
		this.isApprovedByAutomation = isApprovedByAutomation;
	}

	public boolean isBodyBuildingDone() {
		return bodyBuildingDone;
	}

	public void setBodyBuildingDone(boolean bodyBuildingDone) {
		this.bodyBuildingDone = bodyBuildingDone;
	}

	public List<String> getJsonPaths() {
		return jsonPaths;
	}

	public void setJsonPaths(List<String> jsonPaths) {
		this.jsonPaths = jsonPaths;
	}

	public boolean isRcCancelled() {
		return isRcCancelled;
	}

	public void setRcCancelled(boolean isRcCancelled) {
		this.isRcCancelled = isRcCancelled;
	}

	public Boolean getIsScNoGenerated() {
		return isScNoGenerated;
	}

	public void setIsScNoGenerated(Boolean isScNoGenerated) {
		this.isScNoGenerated = isScNoGenerated;
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

	public String getProcessActionStatus() {
		return processActionStatus;
	}

	public void setProcessActionStatus(String processActionStatus) {
		this.processActionStatus = processActionStatus;
	}

	public Boolean getIsduplicateRecord() {
		return isduplicateRecord;
	}

	public void setIsduplicateRecord(Boolean isduplicateRecord) {
		this.isduplicateRecord = isduplicateRecord;
	}

	public String getChassisNumber() {
		return chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public String getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufacturedMonthYear() {
		return manufacturedMonthYear;
	}

	public void setManufacturedMonthYear(String manufacturedMonthYear) {
		this.manufacturedMonthYear = manufacturedMonthYear;
	}

	public String getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	public String getMakersModel() {
		return makersModel;
	}

	public void setMakersModel(String makersModel) {
		this.makersModel = makersModel;
	}

	public String getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(String seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getOwnerSr() {
		return ownerSr;
	}

	public void setOwnerSr(String ownerSr) {
		this.ownerSr = ownerSr;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}

	public String getBodyTypeDesc() {
		return bodyTypeDesc;
	}

	public void setBodyTypeDesc(String bodyTypeDesc) {
		this.bodyTypeDesc = bodyTypeDesc;
	}

	public String getFitUpto() {
		return fitUpto;
	}

	public void setFitUpto(String fitUpto) {
		this.fitUpto = fitUpto;
	}

	public String getTaxUpto() {
		return taxUpto;
	}

	public void setTaxUpto(String taxUpto) {
		this.taxUpto = taxUpto;
	}

	public String getFinancer() {
		return financer;
	}

	public void setFinancer(String financer) {
		this.financer = financer;
	}

	public String getInsuranceUpto() {
		return insuranceUpto;
	}

	public void setInsuranceUpto(String insuranceUpto) {
		this.insuranceUpto = insuranceUpto;
	}

	public String getNoCyl() {
		return noCyl;
	}

	public void setNoCyl(String noCyl) {
		this.noCyl = noCyl;
	}

	public String getCubicCapacity() {
		return cubicCapacity;
	}

	public void setCubicCapacity(String cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}

	public String getSleeperCapacity() {
		return sleeperCapacity;
	}

	public void setSleeperCapacity(String sleeperCapacity) {
		this.sleeperCapacity = sleeperCapacity;
	}

	public String getStandCapacity() {
		return standCapacity;
	}

	public void setStandCapacity(String standCapacity) {
		this.standCapacity = standCapacity;
	}

	public String getRegisteredAt() {
		return registeredAt;
	}

	public void setRegisteredAt(String registeredAt) {
		this.registeredAt = registeredAt;
	}

	public String getStatusAsOn() {
		return statusAsOn;
	}

	public void setStatusAsOn(String statusAsOn) {
		this.statusAsOn = statusAsOn;
	}

	public Integer getExShowroomPrice() {
		return exShowroomPrice;
	}

	public void setExShowroomPrice(Integer exShowroomPrice) {
		this.exShowroomPrice = exShowroomPrice;
	}

	public boolean isUsed() {
		return isUsed;
	}

	public void setUsed(boolean isUsed) {
		this.isUsed = isUsed;
	}

	public Double getEnginePower() {
		return enginePower;
	}

	public void setEnginePower(Double enginePower) {
		this.enginePower = enginePower;
	}

	public String getFrontAxleDesc() {
		return frontAxleDesc;
	}

	public void setFrontAxleDesc(String frontAxleDesc) {
		this.frontAxleDesc = frontAxleDesc;
	}

	public Integer getFrontAxleWeight() {
		return frontAxleWeight;
	}

	public void setFrontAxleWeight(Integer frontAxleWeight) {
		this.frontAxleWeight = frontAxleWeight;
	}

	public String getFuelDesc() {
		return fuelDesc;
	}

	public void setFuelDesc(String fuelDesc) {
		this.fuelDesc = fuelDesc;
	}

	public Integer getGvw() {
		return gvw;
	}

	public void setGvw(Integer gvw) {
		this.gvw = gvw;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public String getMakersDesc() {
		return makersDesc;
	}

	public void setMakersDesc(String makersDesc) {
		this.makersDesc = makersDesc;
	}

	public String getPollutionNormsDesc() {
		return pollutionNormsDesc;
	}

	public void setPollutionNormsDesc(String pollutionNormsDesc) {
		this.pollutionNormsDesc = pollutionNormsDesc;
	}

	public String getO1AxleDesc() {
		return o1AxleDesc;
	}

	public void setO1AxleDesc(String o1AxleDesc) {
		this.o1AxleDesc = o1AxleDesc;
	}

	public Integer getO1AxleWeight() {
		return o1AxleWeight;
	}

	public void setO1AxleWeight(Integer o1AxleWeight) {
		this.o1AxleWeight = o1AxleWeight;
	}

	public String getO2AxleDesc() {
		return o2AxleDesc;
	}

	public void setO2AxleDesc(String o2AxleDesc) {
		this.o2AxleDesc = o2AxleDesc;
	}

	public Integer getO2AxleWeight() {
		return o2AxleWeight;
	}

	public void setO2AxleWeight(Integer o2AxleWeight) {
		this.o2AxleWeight = o2AxleWeight;
	}

	public String getO3AxleDesc() {
		return o3AxleDesc;
	}

	public void setO3AxleDesc(String o3AxleDesc) {
		this.o3AxleDesc = o3AxleDesc;
	}

	public Integer getO3AxleWeight() {
		return o3AxleWeight;
	}

	public void setO3AxleWeight(Integer o3AxleWeight) {
		this.o3AxleWeight = o3AxleWeight;
	}

	public String getO4AxleDesc() {
		return o4AxleDesc;
	}

	public void setO4AxleDesc(String o4AxleDesc) {
		this.o4AxleDesc = o4AxleDesc;
	}

	public Integer getO4AxleWeight() {
		return o4AxleWeight;
	}

	public void setO4AxleWeight(Integer o4AxleWeight) {
		this.o4AxleWeight = o4AxleWeight;
	}

	public String getO5AxleDesc() {
		return o5AxleDesc;
	}

	public void setO5AxleDesc(String o5AxleDesc) {
		this.o5AxleDesc = o5AxleDesc;
	}

	public Integer getO5AxleWeight() {
		return o5AxleWeight;
	}

	public void setO5AxleWeight(Integer o5AxleWeight) {
		this.o5AxleWeight = o5AxleWeight;
	}

	public String getRearAxleDesc() {
		return rearAxleDesc;
	}

	public void setRearAxleDesc(String rearAxleDesc) {
		this.rearAxleDesc = rearAxleDesc;
	}

	public Integer getRearAxleWeight() {
		return rearAxleWeight;
	}

	public void setRearAxleWeight(Integer rearAxleWeight) {
		this.rearAxleWeight = rearAxleWeight;
	}

	public Integer getUnladenWeight() {
		return unladenWeight;
	}

	public void setUnladenWeight(Integer unladenWeight) {
		this.unladenWeight = unladenWeight;
	}

	public Integer getWheelbase() {
		return wheelbase;
	}

	public void setWheelbase(Integer wheelbase) {
		this.wheelbase = wheelbase;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public String getTandemAxelDescp() {
		return tandemAxelDescp;
	}

	public void setTandemAxelDescp(String tandemAxelDescp) {
		this.tandemAxelDescp = tandemAxelDescp;
	}

	public Integer getTandemAxelWeight() {
		return tandemAxelWeight;
	}

	public void setTandemAxelWeight(Integer tandemAxelWeight) {
		this.tandemAxelWeight = tandemAxelWeight;
	}

	public String getMakersName() {
		return makersName;
	}

	public void setMakersName(String makersName) {
		this.makersName = makersName;
	}

	public String getDealerSelectedMakerName() {
		return dealerSelectedMakerName;
	}

	public void setDealerSelectedMakerName(String dealerSelectedMakerName) {
		this.dealerSelectedMakerName = dealerSelectedMakerName;
	}

	public String getDealerSelectedMakerClass() {
		return dealerSelectedMakerClass;
	}

	public void setDealerSelectedMakerClass(String dealerSelectedMakerClass) {
		this.dealerSelectedMakerClass = dealerSelectedMakerClass;
	}

	public String getDealerSelectedBodyType() {
		return dealerSelectedBodyType;
	}

	public void setDealerSelectedBodyType(String dealerSelectedBodyType) {
		this.dealerSelectedBodyType = dealerSelectedBodyType;
	}

	public List<String> getDealerCovType() {
		return dealerCovType;
	}

	public void setDealerCovType(List<String> dealerCovType) {
		this.dealerCovType = dealerCovType;
	}

	public String getAppNo() {
		return appNo;
	}

	public void setAppNo(String appNo) {
		this.appNo = appNo;
	}

	public String getAxleType() {
		return axleType;
	}

	public void setAxleType(String axleType) {
		this.axleType = axleType;
	}

	public Boolean getIsNonVahanData() {
		return isNonVahanData;
	}

	public void setIsNonVahanData(Boolean isNonVahanData) {
		this.isNonVahanData = isNonVahanData;
	}

	public String getHarvestersMakerName() {
		return harvestersMakerName;
	}

	public void setHarvestersMakerName(String harvestersMakerName) {
		this.harvestersMakerName = harvestersMakerName;
	}

	public String getHarvestersMakerClass() {
		return harvestersMakerClass;
	}

	public void setHarvestersMakerClass(String harvestersMakerClass) {
		this.harvestersMakerClass = harvestersMakerClass;
	}

	public String getHarvestersChassisNumber() {
		return harvestersChassisNumber;
	}

	public void setHarvestersChassisNumber(String harvestersChassisNumber) {
		this.harvestersChassisNumber = harvestersChassisNumber;
	}

	public Integer getHarvestersUlw() {
		return harvestersUlw;
	}

	public void setHarvestersUlw(Integer harvestersUlw) {
		this.harvestersUlw = harvestersUlw;
	}

	public Integer getHarvestersRlw() {
		return harvestersRlw;
	}

	public void setHarvestersRlw(Integer harvestersRlw) {
		this.harvestersRlw = harvestersRlw;
	}

	public Boolean getVahanstatus() {
		return vahanstatus;
	}

	public void setVahanstatus(Boolean vahanstatus) {
		this.vahanstatus = vahanstatus;
	}

	public LocalDateTime getVahanCreatedeDate() {
		return vahanCreatedeDate;
	}

	public void setVahanCreatedeDate(LocalDateTime vahanCreatedeDate) {
		this.vahanCreatedeDate = vahanCreatedeDate;
	}

	public Integer getOldGvw() {
		return oldGvw;
	}

	public void setOldGvw(Integer oldGvw) {
		this.oldGvw = oldGvw;
	}

	public Integer getTrailerGvw() {
		return trailerGvw;
	}

	public void setTrailerGvw(Integer trailerGvw) {
		this.trailerGvw = trailerGvw;
	}

	public Integer getGtw() {
		return gtw;
	}

	public void setGtw(Integer gtw) {
		this.gtw = gtw;
	}

	public String getTrailerChassisNo() {
		return trailerChassisNo;
	}

	public void setTrailerChassisNo(String trailerChassisNo) {
		this.trailerChassisNo = trailerChassisNo;
	}

	public Integer getTrailerUlw() {
		return trailerUlw;
	}

	public void setTrailerUlw(Integer trailerUlw) {
		this.trailerUlw = trailerUlw;
	}

	public String getTrailerMakerName() {
		return trailerMakerName;
	}

	public void setTrailerMakerName(String trailerMakerName) {
		this.trailerMakerName = trailerMakerName;
	}

	public String getTrailerColour() {
		return trailerColour;
	}

	public void setTrailerColour(String trailerColour) {
		this.trailerColour = trailerColour;
	}

	public String getApplicationStatus() {
		return ApplicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		ApplicationStatus = applicationStatus;
	}

	public Boolean getIsPanRequired() {
		return isPanRequired;
	}

	public void setIsPanRequired(Boolean isPanRequired) {
		this.isPanRequired = isPanRequired;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public LocalDateTime getlUpdate() {
		return lUpdate;
	}

	public void setlUpdate(LocalDateTime lUpdate) {
		this.lUpdate = lUpdate;
	}

	// vahandetals end

}
