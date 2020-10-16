package org.epragati.vahan.sync.dto;

import java.io.Serializable;
import java.time.LocalDate;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "vahanSync")
public class RegVahanPortDTO extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7958763418384730263L;
	
	@Id
	private String id;
	
	private String stateId;
	
	private Integer officeCode;
	
	private String prNo;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate prGeneratedDate;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate trGeneratedDate;
	
	private Integer towCount;
	
	private String nameOfOwner;
	
	private String fatherName;
	
	private String presentAddress1;
	
	private String presentAddress2;
	
	private String presentAddress3;
	
	private String presentDistricName;
	
	private Integer presentDistricCode;
	
	private Integer presentPostOfficeCode;
	
	private String presentstateId;

	private String permanentAddress1;
	
	private String permanentAddress2;
	
	private String permanentAddress3;

	private String permanentDistricName;
	
	private Integer permanentPostOfficeCode;
	
	private String permanentstateId; 

	private Integer ownerType;
	
	private Character typeOfRegistration;
	
	private Integer classOfVehicle;
	
	private String chassisNumber;
	
	private String engineNumber;
	
	private String makersDesc;
	
	private String makersModel;
	
	private String bodyTypeDesc;
	
	private Integer noOfCyl;
	
	private Integer seatingCapacity;
	
	private Integer ulw;
	
	private Integer ladenWeight;

	private Integer fuelType;
	
	private String color;
	
	private Integer manufacturedMonth;
	
	private Integer manufacturedYear;
	
	private String pollutionNormsDesc;
	
	private Character acFitted;
	
	private Character audioFitted;
	
	private Character videoFitted;
	
	private Integer gvw;

	private String dealerId;
	
	private Double invoiceValue;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate registrationValidity;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate fcValidity;
	
	private Character importantVehicle;
	
	private Character NocIssuedOrNot;
	
	private LocalDate operationDate;
	
	private String modeOfPayment;
	
	private Long totalFeePay;
	
	private String applicationFormRefNum;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate paymentResponseTime;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate taxFromDate;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate taxValidUpto;
	
	private Integer purposeCodeOfTax;
	
	private String  paymentCollectedMode;
	
	private String applicationNo;
	
	private String nocState;
	
	private String nocRtaOfficeCode;

	private String nocRtaOfficeName;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate nocRtaIssueDate;

	private String frontAxleDesc;
	
	private String rearAxleDesc;
	
	private String o1AxleDesc;
	
	private String tandemAxelDescp;
	
	private Integer frontAxleWeight;
	
	private Integer rearAxleWeight;
	
	private Integer o1AxleWeight;
	
	private Integer tandemAxelWeight;
	
	private Integer insuranceCompanyName;
	
	private Integer insurancePolicyType;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate insurancevalidTO;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate insurancevalidFrom;
	
	private String insurancePolicyNo;
	
	private Integer financeSerialNo;
	
	private String financeType;
	
	private String financeName;
	
	private String financeAddress1;
	
	private String financeAddress2;
	
	private String financeAddress3;
	
	private Integer financeDistricCode;
	
	private String financestateId;
	
	private LocalDate financeAgreementDate;
	
	private String firNo; 

	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate firDate;
	
	private LocalDate fitnessinspectedDate;
	
	private Character fitnessResult;
	
	private LocalDate fitnessValidUpto;
	
	private String normsOfVehicle;
	
	private Boolean isFinancier=Boolean.FALSE;
	
	private Integer financePinCode;
	
	private Boolean isNocIssued=Boolean.FALSE;

	private Integer taxFineAmount;
	
	private LocalDate taxPaidDate;
	
	private Long totalFee;
	
	private String taxMode;
	
	private Boolean isTheft=Boolean.FALSE;
	
	private Boolean isFitness=Boolean.FALSE;
	
	private String nocApplicatioNo;
	
	private String complain;
	
	private String complainEnteredBy;

	private String VehicleCategory;
	
	private Boolean isvahanSync = Boolean.FALSE;
	
	private Integer PurposeCode;
	
	private Boolean isErroFound = Boolean.FALSE;
	private Boolean isPartially = Boolean.FALSE;
		
	
	/**
	 * @return the purposeCode
	 */
	public Integer getPurposeCode() {
		return PurposeCode;
	}

	/**
	 * @param purposeCode the purposeCode to set
	 */
	public void setPurposeCode(Integer purposeCode) {
		PurposeCode = purposeCode;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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

	/**
	 * @return the vehicleCategory
	 */
	public String getVehicleCategory() {
		return VehicleCategory;
	}

	/**
	 * @param vehicleCategory the vehicleCategory to set
	 */
	public void setVehicleCategory(String vehicleCategory) {
		VehicleCategory = vehicleCategory;
	}

	/**
	 * @return the stateId
	 */
	public String getStateId() {
		return stateId;
	}

	/**
	 * @param stateId the stateId to set
	 */
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	/**
	 * @return the officeCode
	 */
	public Integer getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(Integer officeCode) {
		this.officeCode = officeCode;
	}

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	/**
	 * @return the prGeneratedDate
	 */
	public LocalDate getPrGeneratedDate() {
		return prGeneratedDate;
	}

	/**
	 * @param prGeneratedDate the prGeneratedDate to set
	 */
	public void setPrGeneratedDate(LocalDate prGeneratedDate) {
		this.prGeneratedDate = prGeneratedDate;
	}

	/**
	 * @return the trGeneratedDate
	 */
	public LocalDate getTrGeneratedDate() {
		return trGeneratedDate;
	}

	/**
	 * @param trGeneratedDate the trGeneratedDate to set
	 */
	public void setTrGeneratedDate(LocalDate trGeneratedDate) {
		this.trGeneratedDate = trGeneratedDate;
	}

	/**
	 * @return the towCount
	 */
	public Integer getTowCount() {
		return towCount;
	}

	/**
	 * @param towCount the towCount to set
	 */
	public void setTowCount(Integer towCount) {
		this.towCount = towCount;
	}

	/**
	 * @return the nameOfOwner
	 */
	public String getNameOfOwner() {
		return nameOfOwner;
	}

	/**
	 * @param nameOfOwner the nameOfOwner to set
	 */
	public void setNameOfOwner(String nameOfOwner) {
		this.nameOfOwner = nameOfOwner;
	}

	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return fatherName;
	}

	/**
	 * @param fatherName the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	/**
	 * @return the presentAddress1
	 */
	public String getPresentAddress1() {
		return presentAddress1;
	}

	/**
	 * @param presentAddress1 the presentAddress1 to set
	 */
	public void setPresentAddress1(String presentAddress1) {
		this.presentAddress1 = presentAddress1;
	}

	/**
	 * @return the presentAddress2
	 */
	public String getPresentAddress2() {
		return presentAddress2;
	}

	/**
	 * @param presentAddress2 the presentAddress2 to set
	 */
	public void setPresentAddress2(String presentAddress2) {
		this.presentAddress2 = presentAddress2;
	}

	/**
	 * @return the presentAddress3
	 */
	public String getPresentAddress3() {
		return presentAddress3;
	}

	/**
	 * @param presentAddress3 the presentAddress3 to set
	 */
	public void setPresentAddress3(String presentAddress3) {
		this.presentAddress3 = presentAddress3;
	}

	/**
	 * @return the presentDistricName
	 */
	public String getPresentDistricName() {
		return presentDistricName;
	}

	/**
	 * @param presentDistricName the presentDistricName to set
	 */
	public void setPresentDistricName(String presentDistricName) {
		this.presentDistricName = presentDistricName;
	}

	/**
	 * @return the presentDistricCode
	 */
	public Integer getPresentDistricCode() {
		return presentDistricCode;
	}

	/**
	 * @param presentDistricCode the presentDistricCode to set
	 */
	public void setPresentDistricCode(Integer presentDistricCode) {
		this.presentDistricCode = presentDistricCode;
	}

	/**
	 * @return the presentPostOfficeCode
	 */
	public Integer getPresentPostOfficeCode() {
		return presentPostOfficeCode;
	}

	/**
	 * @param presentPostOfficeCode the presentPostOfficeCode to set
	 */
	public void setPresentPostOfficeCode(Integer presentPostOfficeCode) {
		this.presentPostOfficeCode = presentPostOfficeCode;
	}

	/**
	 * @return the presentstateId
	 */
	public String getPresentstateId() {
		return presentstateId;
	}

	/**
	 * @param presentstateId the presentstateId to set
	 */
	public void setPresentstateId(String presentstateId) {
		this.presentstateId = presentstateId;
	}

	/**
	 * @return the permanentAddress1
	 */
	public String getPermanentAddress1() {
		return permanentAddress1;
	}

	/**
	 * @param permanentAddress1 the permanentAddress1 to set
	 */
	public void setPermanentAddress1(String permanentAddress1) {
		this.permanentAddress1 = permanentAddress1;
	}

	/**
	 * @return the permanentAddress2
	 */
	public String getPermanentAddress2() {
		return permanentAddress2;
	}

	/**
	 * @param permanentAddress2 the permanentAddress2 to set
	 */
	public void setPermanentAddress2(String permanentAddress2) {
		this.permanentAddress2 = permanentAddress2;
	}

	/**
	 * @return the permanentAddress3
	 */
	public String getPermanentAddress3() {
		return permanentAddress3;
	}

	/**
	 * @param permanentAddress3 the permanentAddress3 to set
	 */
	public void setPermanentAddress3(String permanentAddress3) {
		this.permanentAddress3 = permanentAddress3;
	}

	/**
	 * @return the permanentDistricName
	 */
	public String getPermanentDistricName() {
		return permanentDistricName;
	}

	/**
	 * @param permanentDistricName the permanentDistricName to set
	 */
	public void setPermanentDistricName(String permanentDistricName) {
		this.permanentDistricName = permanentDistricName;
	}

	/**
	 * @return the permanentPostOfficeCode
	 */
	public Integer getPermanentPostOfficeCode() {
		return permanentPostOfficeCode;
	}

	/**
	 * @param permanentPostOfficeCode the permanentPostOfficeCode to set
	 */
	public void setPermanentPostOfficeCode(Integer permanentPostOfficeCode) {
		this.permanentPostOfficeCode = permanentPostOfficeCode;
	}

	/**
	 * @return the permanentstateId
	 */
	public String getPermanentstateId() {
		return permanentstateId;
	}

	/**
	 * @param permanentstateId the permanentstateId to set
	 */
	public void setPermanentstateId(String permanentstateId) {
		this.permanentstateId = permanentstateId;
	}

	/**
	 * @return the ownerType
	 */
	public Integer getOwnerType() {
		return ownerType;
	}

	/**
	 * @param ownerType the ownerType to set
	 */
	public void setOwnerType(Integer ownerType) {
		this.ownerType = ownerType;
	}

	/**
	 * @return the typeOfRegistration
	 */
	public Character getTypeOfRegistration() {
		return typeOfRegistration;
	}

	/**
	 * @param typeOfRegistration the typeOfRegistration to set
	 */
	public void setTypeOfRegistration(Character typeOfRegistration) {
		this.typeOfRegistration = typeOfRegistration;
	}

	/**
	 * @return the classOfVehicle
	 */
	public Integer getClassOfVehicle() {
		return classOfVehicle;
	}

	/**
	 * @param classOfVehicle the classOfVehicle to set
	 */
	public void setClassOfVehicle(Integer classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	/**
	 * @return the chassisNumber
	 */
	public String getChassisNumber() {
		return chassisNumber;
	}

	/**
	 * @param chassisNumber the chassisNumber to set
	 */
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	/**
	 * @return the engineNumber
	 */
	public String getEngineNumber() {
		return engineNumber;
	}

	/**
	 * @param engineNumber the engineNumber to set
	 */
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	/**
	 * @return the makersDesc
	 */
	public String getMakersDesc() {
		return makersDesc;
	}

	/**
	 * @param makersDesc the makersDesc to set
	 */
	public void setMakersDesc(String makersDesc) {
		this.makersDesc = makersDesc;
	}

	/**
	 * @return the makersModel
	 */
	public String getMakersModel() {
		return makersModel;
	}

	/**
	 * @param makersModel the makersModel to set
	 */
	public void setMakersModel(String makersModel) {
		this.makersModel = makersModel;
	}

	/**
	 * @return the bodyTypeDesc
	 */
	public String getBodyTypeDesc() {
		return bodyTypeDesc;
	}

	/**
	 * @param bodyTypeDesc the bodyTypeDesc to set
	 */
	public void setBodyTypeDesc(String bodyTypeDesc) {
		this.bodyTypeDesc = bodyTypeDesc;
	}

	/**
	 * @return the noOfCyl
	 */
	public Integer getNoOfCyl() {
		return noOfCyl;
	}

	/**
	 * @param noOfCyl the noOfCyl to set
	 */
	public void setNoOfCyl(Integer noOfCyl) {
		this.noOfCyl = noOfCyl;
	}

	/**
	 * @return the seatingCapacity
	 */
	public Integer getSeatingCapacity() {
		return seatingCapacity;
	}

	/**
	 * @param seatingCapacity the seatingCapacity to set
	 */
	public void setSeatingCapacity(Integer seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	/**
	 * @return the ulw
	 */
	public Integer getUlw() {
		return ulw;
	}

	/**
	 * @param ulw the ulw to set
	 */
	public void setUlw(Integer ulw) {
		this.ulw = ulw;
	}

	/**
	 * @return the ladenWeight
	 */
	public Integer getLadenWeight() {
		return ladenWeight;
	}

	/**
	 * @param ladenWeight the ladenWeight to set
	 */
	public void setLadenWeight(Integer ladenWeight) {
		this.ladenWeight = ladenWeight;
	}

	/**
	 * @return the fuelType
	 */
	public Integer getFuelType() {
		return fuelType;
	}

	/**
	 * @param fuelType the fuelType to set
	 */
	public void setFuelType(Integer fuelType) {
		this.fuelType = fuelType;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the manufacturedMonth
	 */
	public Integer getManufacturedMonth() {
		return manufacturedMonth;
	}

	/**
	 * @param manufacturedMonth the manufacturedMonth to set
	 */
	public void setManufacturedMonth(Integer manufacturedMonth) {
		this.manufacturedMonth = manufacturedMonth;
	}

	/**
	 * @return the manufacturedYear
	 */
	public Integer getManufacturedYear() {
		return manufacturedYear;
	}

	/**
	 * @param manufacturedYear the manufacturedYear to set
	 */
	public void setManufacturedYear(Integer manufacturedYear) {
		this.manufacturedYear = manufacturedYear;
	}

	/**
	 * @return the pollutionNormsDesc
	 */
	public String getPollutionNormsDesc() {
		return pollutionNormsDesc;
	}

	/**
	 * @param pollutionNormsDesc the pollutionNormsDesc to set
	 */
	public void setPollutionNormsDesc(String pollutionNormsDesc) {
		this.pollutionNormsDesc = pollutionNormsDesc;
	}

	/**
	 * @return the acFitted
	 */
	public Character getAcFitted() {
		return acFitted;
	}

	/**
	 * @param acFitted the acFitted to set
	 */
	public void setAcFitted(Character acFitted) {
		this.acFitted = acFitted;
	}

	/**
	 * @return the audioFitted
	 */
	public Character getAudioFitted() {
		return audioFitted;
	}

	/**
	 * @param audioFitted the audioFitted to set
	 */
	public void setAudioFitted(Character audioFitted) {
		this.audioFitted = audioFitted;
	}

	/**
	 * @return the videoFitted
	 */
	public Character getVideoFitted() {
		return videoFitted;
	}

	/**
	 * @param videoFitted the videoFitted to set
	 */
	public void setVideoFitted(Character videoFitted) {
		this.videoFitted = videoFitted;
	}

	/**
	 * @return the gvw
	 */
	public Integer getGvw() {
		return gvw;
	}

	/**
	 * @param gvw the gvw to set
	 */
	public void setGvw(Integer gvw) {
		this.gvw = gvw;
	}

	/**
	 * @return the dealerId
	 */
	public String getDealerId() {
		return dealerId;
	}

	/**
	 * @param dealerId the dealerId to set
	 */
	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}

	/**
	 * @return the invoiceValue
	 */
	public Double getInvoiceValue() {
		return invoiceValue;
	}

	/**
	 * @param invoiceValue the invoiceValue to set
	 */
	public void setInvoiceValue(Double invoiceValue) {
		this.invoiceValue = invoiceValue;
	}

	/**
	 * @return the registrationValidity
	 */
	public LocalDate getRegistrationValidity() {
		return registrationValidity;
	}

	/**
	 * @param registrationValidity the registrationValidity to set
	 */
	public void setRegistrationValidity(LocalDate registrationValidity) {
		this.registrationValidity = registrationValidity;
	}

	/**
	 * @return the fcValidity
	 */
	public LocalDate getFcValidity() {
		return fcValidity;
	}

	/**
	 * @param fcValidity the fcValidity to set
	 */
	public void setFcValidity(LocalDate fcValidity) {
		this.fcValidity = fcValidity;
	}

	/**
	 * @return the importantVehicle
	 */
	public Character getImportantVehicle() {
		return importantVehicle;
	}

	/**
	 * @param importantVehicle the importantVehicle to set
	 */
	public void setImportantVehicle(Character importantVehicle) {
		this.importantVehicle = importantVehicle;
	}

	/**
	 * @return the nocIssuedOrNot
	 */
	public Character getNocIssuedOrNot() {
		return NocIssuedOrNot;
	}

	/**
	 * @param nocIssuedOrNot the nocIssuedOrNot to set
	 */
	public void setNocIssuedOrNot(Character nocIssuedOrNot) {
		NocIssuedOrNot = nocIssuedOrNot;
	}

	/**
	 * @return the operationDate
	 */
	public LocalDate getOperationDate() {
		return operationDate;
	}

	/**
	 * @param operationDate the operationDate to set
	 */
	public void setOperationDate(LocalDate operationDate) {
		this.operationDate = operationDate;
	}

	/**
	 * @return the modeOfPayment
	 */
	public String getModeOfPayment() {
		return modeOfPayment;
	}

	/**
	 * @param modeOfPayment the modeOfPayment to set
	 */
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	/**
	 * @return the totalFeePay
	 */
	public Long getTotalFeePay() {
		return totalFeePay;
	}

	/**
	 * @param totalFeePay the totalFeePay to set
	 */
	public void setTotalFeePay(Long totalFeePay) {
		this.totalFeePay = totalFeePay;
	}

	/**
	 * @return the applicationFormRefNum
	 */
	public String getApplicationFormRefNum() {
		return applicationFormRefNum;
	}

	/**
	 * @param applicationFormRefNum the applicationFormRefNum to set
	 */
	public void setApplicationFormRefNum(String applicationFormRefNum) {
		this.applicationFormRefNum = applicationFormRefNum;
	}

	/**
	 * @return the paymentResponseTime
	 */
	public LocalDate getPaymentResponseTime() {
		return paymentResponseTime;
	}

	/**
	 * @param paymentResponseTime the paymentResponseTime to set
	 */
	public void setPaymentResponseTime(LocalDate paymentResponseTime) {
		this.paymentResponseTime = paymentResponseTime;
	}

	/**
	 * @return the taxFromDate
	 */
	public LocalDate getTaxFromDate() {
		return taxFromDate;
	}

	/**
	 * @param taxFromDate the taxFromDate to set
	 */
	public void setTaxFromDate(LocalDate taxFromDate) {
		this.taxFromDate = taxFromDate;
	}

	/**
	 * @return the taxValidUpto
	 */
	public LocalDate getTaxValidUpto() {
		return taxValidUpto;
	}

	/**
	 * @param taxValidUpto the taxValidUpto to set
	 */
	public void setTaxValidUpto(LocalDate taxValidUpto) {
		this.taxValidUpto = taxValidUpto;
	}

	/**
	 * @return the purposeCodeOfTax
	 */
	public Integer getPurposeCodeOfTax() {
		return purposeCodeOfTax;
	}

	/**
	 * @param purposeCodeOfTax the purposeCodeOfTax to set
	 */
	public void setPurposeCodeOfTax(Integer purposeCodeOfTax) {
		this.purposeCodeOfTax = purposeCodeOfTax;
	}

	/**
	 * @return the paymentCollectedMode
	 */
	public String getPaymentCollectedMode() {
		return paymentCollectedMode;
	}

	/**
	 * @param paymentCollectedMode the paymentCollectedMode to set
	 */
	public void setPaymentCollectedMode(String paymentCollectedMode) {
		this.paymentCollectedMode = paymentCollectedMode;
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
	 * @return the nocState
	 */
	public String getNocState() {
		return nocState;
	}

	/**
	 * @param nocState the nocState to set
	 */
	public void setNocState(String nocState) {
		this.nocState = nocState;
	}

	/**
	 * @return the nocRtaOfficeCode
	 */
	public String getNocRtaOfficeCode() {
		return nocRtaOfficeCode;
	}

	/**
	 * @param nocRtaOfficeCode the nocRtaOfficeCode to set
	 */
	public void setNocRtaOfficeCode(String nocRtaOfficeCode) {
		this.nocRtaOfficeCode = nocRtaOfficeCode;
	}

	/**
	 * @return the nocRtaOfficeName
	 */
	public String getNocRtaOfficeName() {
		return nocRtaOfficeName;
	}

	/**
	 * @param nocRtaOfficeName the nocRtaOfficeName to set
	 */
	public void setNocRtaOfficeName(String nocRtaOfficeName) {
		this.nocRtaOfficeName = nocRtaOfficeName;
	}

	/**
	 * @return the nocRtaIssueDate
	 */
	public LocalDate getNocRtaIssueDate() {
		return nocRtaIssueDate;
	}

	/**
	 * @param nocRtaIssueDate the nocRtaIssueDate to set
	 */
	public void setNocRtaIssueDate(LocalDate nocRtaIssueDate) {
		this.nocRtaIssueDate = nocRtaIssueDate;
	}

	/**
	 * @return the frontAxleDesc
	 */
	public String getFrontAxleDesc() {
		return frontAxleDesc;
	}

	/**
	 * @param frontAxleDesc the frontAxleDesc to set
	 */
	public void setFrontAxleDesc(String frontAxleDesc) {
		this.frontAxleDesc = frontAxleDesc;
	}

	/**
	 * @return the rearAxleDesc
	 */
	public String getRearAxleDesc() {
		return rearAxleDesc;
	}

	/**
	 * @param rearAxleDesc the rearAxleDesc to set
	 */
	public void setRearAxleDesc(String rearAxleDesc) {
		this.rearAxleDesc = rearAxleDesc;
	}

	/**
	 * @return the o1AxleDesc
	 */
	public String getO1AxleDesc() {
		return o1AxleDesc;
	}

	/**
	 * @param o1AxleDesc the o1AxleDesc to set
	 */
	public void setO1AxleDesc(String o1AxleDesc) {
		this.o1AxleDesc = o1AxleDesc;
	}

	/**
	 * @return the tandemAxelDescp
	 */
	public String getTandemAxelDescp() {
		return tandemAxelDescp;
	}

	/**
	 * @param tandemAxelDescp the tandemAxelDescp to set
	 */
	public void setTandemAxelDescp(String tandemAxelDescp) {
		this.tandemAxelDescp = tandemAxelDescp;
	}

	/**
	 * @return the frontAxleWeight
	 */
	public Integer getFrontAxleWeight() {
		return frontAxleWeight;
	}

	/**
	 * @param frontAxleWeight the frontAxleWeight to set
	 */
	public void setFrontAxleWeight(Integer frontAxleWeight) {
		this.frontAxleWeight = frontAxleWeight;
	}

	/**
	 * @return the rearAxleWeight
	 */
	public Integer getRearAxleWeight() {
		return rearAxleWeight;
	}

	/**
	 * @param rearAxleWeight the rearAxleWeight to set
	 */
	public void setRearAxleWeight(Integer rearAxleWeight) {
		this.rearAxleWeight = rearAxleWeight;
	}

	/**
	 * @return the o1AxleWeight
	 */
	public Integer getO1AxleWeight() {
		return o1AxleWeight;
	}

	/**
	 * @param o1AxleWeight the o1AxleWeight to set
	 */
	public void setO1AxleWeight(Integer o1AxleWeight) {
		this.o1AxleWeight = o1AxleWeight;
	}

	/**
	 * @return the tandemAxelWeight
	 */
	public Integer getTandemAxelWeight() {
		return tandemAxelWeight;
	}

	/**
	 * @param tandemAxelWeight the tandemAxelWeight to set
	 */
	public void setTandemAxelWeight(Integer tandemAxelWeight) {
		this.tandemAxelWeight = tandemAxelWeight;
	}

	/**
	 * @return the insuranceCompanyName
	 */
	public Integer getInsuranceCompanyName() {
		return insuranceCompanyName;
	}

	/**
	 * @param insuranceCompanyName the insuranceCompanyName to set
	 */
	public void setInsuranceCompanyName(Integer insuranceCompanyName) {
		this.insuranceCompanyName = insuranceCompanyName;
	}

	/**
	 * @return the insurancePolicyType
	 */
	public Integer getInsurancePolicyType() {
		return insurancePolicyType;
	}

	/**
	 * @param insurancePolicyType the insurancePolicyType to set
	 */
	public void setInsurancePolicyType(Integer insurancePolicyType) {
		this.insurancePolicyType = insurancePolicyType;
	}

	/**
	 * @return the insurancevalidTO
	 */
	public LocalDate getInsurancevalidTO() {
		return insurancevalidTO;
	}

	/**
	 * @param insurancevalidTO the insurancevalidTO to set
	 */
	public void setInsurancevalidTO(LocalDate insurancevalidTO) {
		this.insurancevalidTO = insurancevalidTO;
	}

	/**
	 * @return the insurancevalidFrom
	 */
	public LocalDate getInsurancevalidFrom() {
		return insurancevalidFrom;
	}

	/**
	 * @param insurancevalidFrom the insurancevalidFrom to set
	 */
	public void setInsurancevalidFrom(LocalDate insurancevalidFrom) {
		this.insurancevalidFrom = insurancevalidFrom;
	}

	/**
	 * @return the insurancePolicyNo
	 */
	public String getInsurancePolicyNo() {
		return insurancePolicyNo;
	}

	/**
	 * @param insurancePolicyNo the insurancePolicyNo to set
	 */
	public void setInsurancePolicyNo(String insurancePolicyNo) {
		this.insurancePolicyNo = insurancePolicyNo;
	}

	/**
	 * @return the financeSerialNo
	 */
	public Integer getFinanceSerialNo() {
		return financeSerialNo;
	}

	/**
	 * @param financeSerialNo the financeSerialNo to set
	 */
	public void setFinanceSerialNo(Integer financeSerialNo) {
		this.financeSerialNo = financeSerialNo;
	}

	/**
	 * @return the financeType
	 */
	public String getFinanceType() {
		return financeType;
	}

	/**
	 * @param financeType the financeType to set
	 */
	public void setFinanceType(String financeType) {
		this.financeType = financeType;
	}

	/**
	 * @return the financeName
	 */
	public String getFinanceName() {
		return financeName;
	}

	/**
	 * @param financeName the financeName to set
	 */
	public void setFinanceName(String financeName) {
		this.financeName = financeName;
	}

	/**
	 * @return the financeAddress1
	 */
	public String getFinanceAddress1() {
		return financeAddress1;
	}

	/**
	 * @param financeAddress1 the financeAddress1 to set
	 */
	public void setFinanceAddress1(String financeAddress1) {
		this.financeAddress1 = financeAddress1;
	}

	/**
	 * @return the financeAddress2
	 */
	public String getFinanceAddress2() {
		return financeAddress2;
	}

	/**
	 * @param financeAddress2 the financeAddress2 to set
	 */
	public void setFinanceAddress2(String financeAddress2) {
		this.financeAddress2 = financeAddress2;
	}

	/**
	 * @return the financeAddress3
	 */
	public String getFinanceAddress3() {
		return financeAddress3;
	}

	/**
	 * @param financeAddress3 the financeAddress3 to set
	 */
	public void setFinanceAddress3(String financeAddress3) {
		this.financeAddress3 = financeAddress3;
	}


	
	
	/**
	 * @return the financeDistricCode
	 */
	public Integer getFinanceDistricCode() {
		return financeDistricCode;
	}

	/**
	 * @param financeDistricCode the financeDistricCode to set
	 */
	public void setFinanceDistricCode(Integer financeDistricCode) {
		this.financeDistricCode = financeDistricCode;
	}

	/**
	 * @return the financestateId
	 */
	public String getFinancestateId() {
		return financestateId;
	}

	/**
	 * @param financestateId the financestateId to set
	 */
	public void setFinancestateId(String financestateId) {
		this.financestateId = financestateId;
	}

	/**
	 * @return the financeAgreementDate
	 */
	public LocalDate getFinanceAgreementDate() {
		return financeAgreementDate;
	}

	/**
	 * @param financeAgreementDate the financeAgreementDate to set
	 */
	public void setFinanceAgreementDate(LocalDate financeAgreementDate) {
		this.financeAgreementDate = financeAgreementDate;
	}

	/**
	 * @return the firNo
	 */
	public String getFirNo() {
		return firNo;
	}

	/**
	 * @param firNo the firNo to set
	 */
	public void setFirNo(String firNo) {
		this.firNo = firNo;
	}

	/**
	 * @return the firDate
	 */
	public LocalDate getFirDate() {
		return firDate;
	}

	/**
	 * @param firDate the firDate to set
	 */
	public void setFirDate(LocalDate firDate) {
		this.firDate = firDate;
	}

	/**
	 * @return the fitnessinspectedDate
	 */
	public LocalDate getFitnessinspectedDate() {
		return fitnessinspectedDate;
	}

	/**
	 * @param fitnessinspectedDate the fitnessinspectedDate to set
	 */
	public void setFitnessinspectedDate(LocalDate fitnessinspectedDate) {
		this.fitnessinspectedDate = fitnessinspectedDate;
	}

	/**
	 * @return the fitnessResult
	 */
	public Character getFitnessResult() {
		return fitnessResult;
	}

	/**
	 * @param fitnessResult the fitnessResult to set
	 */
	public void setFitnessResult(Character fitnessResult) {
		this.fitnessResult = fitnessResult;
	}

	/**
	 * @return the fitnessValidUpto
	 */
	public LocalDate getFitnessValidUpto() {
		return fitnessValidUpto;
	}

	/**
	 * @param fitnessValidUpto the fitnessValidUpto to set
	 */
	public void setFitnessValidUpto(LocalDate fitnessValidUpto) {
		this.fitnessValidUpto = fitnessValidUpto;
	}

	/**
	 * @return the normsOfVehicle
	 */
	public String getNormsOfVehicle() {
		return normsOfVehicle;
	}

	/**
	 * @param normsOfVehicle the normsOfVehicle to set
	 */
	public void setNormsOfVehicle(String normsOfVehicle) {
		this.normsOfVehicle = normsOfVehicle;
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
	 * @return the financePinCode
	 */
	public Integer getFinancePinCode() {
		return financePinCode;
	}

	/**
	 * @param financePinCode the financePinCode to set
	 */
	public void setFinancePinCode(Integer financePinCode) {
		this.financePinCode = financePinCode;
	}

	/**
	 * @return the isNocIssued
	 */
	public Boolean getIsNocIssued() {
		return isNocIssued;
	}

	/**
	 * @param isNocIssued the isNocIssued to set
	 */
	public void setIsNocIssued(Boolean isNocIssued) {
		this.isNocIssued = isNocIssued;
	}

	/**
	 * @return the taxFineAmount
	 */
	public Integer getTaxFineAmount() {
		return taxFineAmount;
	}

	/**
	 * @param taxFineAmount the taxFineAmount to set
	 */
	public void setTaxFineAmount(Integer taxFineAmount) {
		this.taxFineAmount = taxFineAmount;
	}

	/**
	 * @return the taxPaidDate
	 */
	public LocalDate getTaxPaidDate() {
		return taxPaidDate;
	}

	/**
	 * @param taxPaidDate the taxPaidDate to set
	 */
	public void setTaxPaidDate(LocalDate taxPaidDate) {
		this.taxPaidDate = taxPaidDate;
	}

	/**
	 * @return the totalFee
	 */
	public Long getTotalFee() {
		return totalFee;
	}

	/**
	 * @param totalFee the totalFee to set
	 */
	public void setTotalFee(Long totalFee) {
		this.totalFee = totalFee;
	}

	/**
	 * @return the taxMode
	 */
	public String getTaxMode() {
		return taxMode;
	}

	/**
	 * @param taxMode the taxMode to set
	 */
	public void setTaxMode(String taxMode) {
		this.taxMode = taxMode;
	}

	/**
	 * @return the isTheft
	 */
	public Boolean getIsTheft() {
		return isTheft;
	}

	/**
	 * @param isTheft the isTheft to set
	 */
	public void setIsTheft(Boolean isTheft) {
		this.isTheft = isTheft;
	}

	/**
	 * @return the isFitness
	 */
	public Boolean getIsFitness() {
		return isFitness;
	}

	/**
	 * @param isFitness the isFitness to set
	 */
	public void setIsFitness(Boolean isFitness) {
		this.isFitness = isFitness;
	}

	/**
	 * @return the nocApplicatioNo
	 */
	public String getNocApplicatioNo() {
		return nocApplicatioNo;
	}

	/**
	 * @param nocApplicatioNo the nocApplicatioNo to set
	 */
	public void setNocApplicatioNo(String nocApplicatioNo) {
		this.nocApplicatioNo = nocApplicatioNo;
	}

	/**
	 * @return the complain
	 */
	public String getComplain() {
		return complain;
	}

	/**
	 * @param complain the complain to set
	 */
	public void setComplain(String complain) {
		this.complain = complain;
	}

	/**
	 * @return the complainEnteredBy
	 */
	public String getComplainEnteredBy() {
		return complainEnteredBy;
	}

	/**
	 * @param complainEnteredBy the complainEnteredBy to set
	 */
	public void setComplainEnteredBy(String complainEnteredBy) {
		this.complainEnteredBy = complainEnteredBy;
	}

	public Boolean getIsErroFound() {
		return isErroFound;
	}

	public void setIsErroFound(Boolean isErroFound) {
		this.isErroFound = isErroFound;
	}

	public Boolean getIsPartially() {
		return isPartially;
	}

	public void setIsPartially(Boolean isPartially) {
		this.isPartially = isPartially;
	}
	
	
}
