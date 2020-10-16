package org.epragati.regservice.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.epragati.constants.OwnerTypeEnum;
import org.epragati.master.dto.RegistrationDetailsDTO;
import org.epragati.master.dto.StagingRegistrationDetailsDTO;
import org.epragati.payments.vo.ClassOfVehiclesVO;
import org.epragati.util.custom.validation.Conditional;
import org.epragati.util.custom.validation.ValidatorConstants;
import org.epragati.util.payment.ServiceEnum;
import org.epragati.vcr.vo.RegistrationVcrVo;
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CitizenFeeDetailsInput {
	
	@NotEmpty(message = "Service Ids are required")
	private List<Integer> serviceIds;
	
	//@Size(max=ValidatorConstants.PR_NO_SIZE,message=ValidatorConstants.INVALID_PRNO)
	//@Conditional(selected = "prNo",message=ValidatorConstants.INVALID_PRNO,values = {})
	private String prNo;
	
	//@Size(max=ValidatorConstants.PR_NO_SIZE,message=ValidatorConstants.IVALID_AADHAAR_NO)
	private String aadharNo;
	
	private String newCov;
	
	private String newVehicleType;
	
	private String oldVehicleType;
	
	private String taxType;
	
	private Boolean isChassesVehicle;
	
	//@Size(max=ValidatorConstants.PR_NO_SIZE,message=ValidatorConstants.INVALID_TRNO)
	//@Conditional(selected = "trNo",message=ValidatorConstants.INVALID_TRNO,values = {})
	private String trNo;
	
	private Boolean isApplicationFromMvi;
	private Boolean isOtherState=Boolean.FALSE;;
	
	private String applicationNo;
	
	private String purpose;
	private List<String> listOfVcrs;
	
	private String permitType;
	
	private Boolean isOtherStationFc = Boolean.FALSE;
	
	//@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	@Conditional(selected = "date",message=ValidatorConstants.INVALID_DATE_FORMAT,values = {})
	private String slotDate;
	
	private String routeCode;

	private Boolean aadhaarvalidationRequired = Boolean.TRUE;
	
	private Boolean isweightAlt =   Boolean.FALSE;
	
	private boolean isTaxPending =   Boolean.FALSE;
	private boolean isUnRegestered =   Boolean.FALSE;
	private boolean isRegestered =   Boolean.FALSE;
	private boolean noApplication =   Boolean.FALSE;
	private boolean considerStaging =   Boolean.FALSE;
	private RegistrationDetailsDTO regDetails;
	private RegServiceDTO regServiceDetails;
	private StagingRegistrationDetailsDTO stagingRegistrationDetails;
	private boolean isVehicleSized = Boolean.FALSE;
	private LocalDate vehicleSizedDate;
	private LocalDate latestVcrDate;
	private LocalDate trGeneratedDate;
	private Double vcrTax;
	private LocalDate playedAsQuarterEnd;
	private boolean oldCovLife = Boolean.FALSE;
	private boolean otherStateVehicle =   Boolean.FALSE;
	private boolean intrastate;
	private LocalDateTime intrastateVcrDate;
	
	//Voluntary Tax
	private Integer gvw;
	private Integer ulw;
	private String seats;
	private String makersModel;
	private Double invoiceValue;
	private String fuelDesc;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate prGenarationDate;
	private boolean otherStateUnregister;
	private boolean otherStateRegister;
	private boolean unregisteredVehicle ;
	private OwnerTypeEnum ownerType;
	private boolean isFirstVehicle ;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfCompletion;
	private boolean nocIssued;
	private boolean withTP;
	private LocalDate nocDate;
	private Boolean firstVehicle;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate fcValidity;
	private boolean vehicleHaveAitp;
	private boolean calCulateQutTax;
	
	
	private List<ClassOfVehiclesVO> covDetails;
	private List<ServiceEnum> serviceEnums;
	private String weightDetails;
	private boolean requestForPay; 
	private boolean isCalculateFc;
	private String officeCode;
	private String regApplicationNo;
	private String seatingCapacity;
	private RegistrationVcrVo voluntyInputs;
	private LocalDate slotDateForPayments;
	private String permitVehiclePrNo;
	
	private boolean skipTaxForTPSP;
	
	private boolean vcrChassisTax;
	private AlterationDTO alterDetails ;
	
	private Boolean specificVcrPayment=Boolean.FALSE;

	/**
	 * @return the skipTaxForTPSP
	 */
	public boolean isSkipTaxForTPSP() {
		return skipTaxForTPSP;
	}
	/**
	 * @param skipTaxForTPSP the skipTaxForTPSP to set
	 */
	public void setSkipTaxForTPSP(boolean skipTaxForTPSP) {
		this.skipTaxForTPSP = skipTaxForTPSP;
	}
	
	/**
	 * @return the aadhaarvalidationRequired
	 */
	public Boolean getAadhaarvalidationRequired() {
		return aadhaarvalidationRequired;
	}
	/**
	 * @param aadhaarvalidationRequired the aadhaarvalidationRequired to set
	 */
	public void setAadhaarvalidationRequired(Boolean aadhaarvalidationRequired) {
		this.aadhaarvalidationRequired = aadhaarvalidationRequired;
	}
	public String getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	
	
	/**
	 * @return the isOtherState
	 */
	public Boolean getIsOtherState() {
		return isOtherState;
	}
	/**
	 * @param isOtherState the isOtherState to set
	 */
	public void setIsOtherState(Boolean isOtherState) {
		this.isOtherState = isOtherState;
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
	 * @return the isChassesVehicle
	 */
	public Boolean getIsChassesVehicle() {
		return isChassesVehicle;
	}
	/**
	 * @param isChassesVehicle the isChassesVehicle to set
	 */
	public void setIsChassesVehicle(Boolean isChassesVehicle) {
		this.isChassesVehicle = isChassesVehicle;
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
	 * @return the newCov
	 */
	public String getNewCov() {
		return newCov;
	}
	/**
	 * @param newCov the newCov to set
	 */
	public void setNewCov(String newCov) {
		this.newCov = newCov;
	}
	/**
	 * @return the newVehicleType
	 */
	public String getNewVehicleType() {
		return newVehicleType;
	}
	/**
	 * @param newVehicleType the newVehicleType to set
	 */
	public void setNewVehicleType(String newVehicleType) {
		this.newVehicleType = newVehicleType;
	}
	/**
	 * @return the serviceIds
	 */
	public List<Integer> getServiceIds() {
		return serviceIds;
	}
	/**
	 * @param serviceIds the serviceIds to set
	 */
	public void setServiceIds(List<Integer> serviceIds) {
		this.serviceIds = serviceIds;
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
	 * @return the aadharNo
	 */
	public String getAadharNo() {
		return aadharNo;
	}
	/**
	 * @param aadharNo the aadharNo to set
	 */
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	/**
	 * @return the isApplicationFromMvi
	 */
	public Boolean getIsApplicationFromMvi() {
		return isApplicationFromMvi;
	}
	/**
	 * @param isApplicationFromMvi the isApplicationFromMvi to set
	 */
	public void setIsApplicationFromMvi(Boolean isApplicationFromMvi) {
		this.isApplicationFromMvi = isApplicationFromMvi;
	}
	/**
	 * @return the oldVehicleType
	 */
	public String getOldVehicleType() {
		return oldVehicleType;
	}
	/**
	 * @param oldVehicleType the oldVehicleType to set
	 */
	public void setOldVehicleType(String oldVehicleType) {
		this.oldVehicleType = oldVehicleType;
	}
	/**
	 * @return the permitType
	 */
	public String getPermitType() {
		return permitType;
	}
	/**
	 * @param permitType the permitType to set
	 */
	public void setPermitType(String permitType) {
		this.permitType = permitType;
	}
	/**
	 * @return the slotDate
	 */
	public String getSlotDate() {
		return slotDate;
	}
	/**
	 * @param slotDate the slotDate to set
	 */
	public void setSlotDate(String slotDate) {
		this.slotDate = slotDate;
	}
	/**
	 * @return the isOtherStationFc
	 */
	public Boolean getIsOtherStationFc() {
		return isOtherStationFc;
	}
	/**
	 * @param isOtherStationFc the isOtherStationFc to set
	 */
	public void setIsOtherStationFc(Boolean isOtherStationFc) {
		this.isOtherStationFc = isOtherStationFc;
	}
	/**
	 * @return the routeCode
	 */
	public String getRouteCode() {
		return routeCode;
	}
	/**
	 * @param routeCode the routeCode to set
	 */
	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}
	public Boolean getIsweightAlt() {
		return isweightAlt;
	}
	public void setIsweightAlt(Boolean isweightAlt) {
		this.isweightAlt = isweightAlt;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public List<String> getListOfVcrs() {
		return listOfVcrs;
	}
	public void setListOfVcrs(List<String> listOfVcrs) {
		this.listOfVcrs = listOfVcrs;
	}
	public boolean isTaxPending() {
		return isTaxPending;
	}
	public void setTaxPending(boolean isTaxPending) {
		this.isTaxPending = isTaxPending;
	}
	public boolean isUnRegestered() {
		return isUnRegestered;
	}
	public void setUnRegestered(boolean isUnRegestered) {
		this.isUnRegestered = isUnRegestered;
	}
	public boolean isNoApplication() {
		return noApplication;
	}
	public void setNoApplication(boolean noApplication) {
		this.noApplication = noApplication;
	}
	public boolean isConsiderStaging() {
		return considerStaging;
	}
	public void setConsiderStaging(boolean considerStaging) {
		this.considerStaging = considerStaging;
	}
	public RegistrationDetailsDTO getRegDetails() {
		return regDetails;
	}
	public void setRegDetails(RegistrationDetailsDTO regDetails) {
		this.regDetails = regDetails;
	}
	public RegServiceDTO getRegServiceDetails() {
		return regServiceDetails;
	}
	public void setRegServiceDetails(RegServiceDTO regServiceDetails) {
		this.regServiceDetails = regServiceDetails;
	}
	public StagingRegistrationDetailsDTO getStagingRegistrationDetails() {
		return stagingRegistrationDetails;
	}
	public void setStagingRegistrationDetails(StagingRegistrationDetailsDTO stagingRegistrationDetails) {
		this.stagingRegistrationDetails = stagingRegistrationDetails;
	}
	public boolean isRegestered() {
		return isRegestered;
	}
	public void setRegestered(boolean isRegestered) {
		this.isRegestered = isRegestered;
	}
	public boolean isVehicleSized() {
		return isVehicleSized;
	}
	public void setVehicleSized(boolean isVehicleSized) {
		this.isVehicleSized = isVehicleSized;
	}
	public LocalDate getVehicleSizedDate() {
		return vehicleSizedDate;
	}
	public void setVehicleSizedDate(LocalDate vehicleSizedDate) {
		this.vehicleSizedDate = vehicleSizedDate;
	}
	public LocalDate getTrGeneratedDate() {
		return trGeneratedDate;
	}
	public void setTrGeneratedDate(LocalDate trGeneratedDate) {
		this.trGeneratedDate = trGeneratedDate;
	}
	public Double getVcrTax() {
		return vcrTax;
	}
	public void setVcrTax(Double vcrTax) {
		this.vcrTax = vcrTax;
	}
	public LocalDate getLatestVcrDate() {
		return latestVcrDate;
	}
	public void setLatestVcrDate(LocalDate latestVcrDate) {
		this.latestVcrDate = latestVcrDate;
	}
	public LocalDate getPlayedAsQuarterEnd() {
		return playedAsQuarterEnd;
	}
	public void setPlayedAsQuarterEnd(LocalDate playedAsQuarterEnd) {
		this.playedAsQuarterEnd = playedAsQuarterEnd;
	}
	public boolean isOldCovLife() {
		return oldCovLife;
	}
	public void setOldCovLife(boolean oldCovLife) {
		this.oldCovLife = oldCovLife;
	}
	public boolean isOtherStateVehicle() {
		return otherStateVehicle;
	}
	public void setOtherStateVehicle(boolean otherStateVehicle) {
		this.otherStateVehicle = otherStateVehicle;
	}
	public Integer getGvw() {
		return gvw;
	}
	public void setGvw(Integer gvw) {
		this.gvw = gvw;
	}
	public Integer getUlw() {
		return ulw;
	}
	public void setUlw(Integer ulw) {
		this.ulw = ulw;
	}
	public String getSeats() {
		return seats;
	}
	public void setSeats(String seats) {
		this.seats = seats;
	}
	public String getMakersModel() {
		return makersModel;
	}
	public void setMakersModel(String makersModel) {
		this.makersModel = makersModel;
	}
	public Double getInvoiceValue() {
		return invoiceValue;
	}
	public void setInvoiceValue(Double invoiceValue) {
		this.invoiceValue = invoiceValue;
	}
	public String getFuelDesc() {
		return fuelDesc;
	}
	public void setFuelDesc(String fuelDesc) {
		this.fuelDesc = fuelDesc;
	}
	public LocalDate getPrGenarationDate() {
		return prGenarationDate;
	}
	public void setPrGenarationDate(LocalDate prGenarationDate) {
		this.prGenarationDate = prGenarationDate;
	}
	public boolean isOtherStateUnregister() {
		return otherStateUnregister;
	}
	public void setOtherStateUnregister(boolean otherStateUnregister) {
		this.otherStateUnregister = otherStateUnregister;
	}
	public boolean isOtherStateRegister() {
		return otherStateRegister;
	}
	public void setOtherStateRegister(boolean otherStateRegister) {
		this.otherStateRegister = otherStateRegister;
	}
	public boolean isUnregisteredVehicle() {
		return unregisteredVehicle;
	}
	public void setUnregisteredVehicle(boolean unregisteredVehicle) {
		this.unregisteredVehicle = unregisteredVehicle;
	}
	public OwnerTypeEnum getOwnerType() {
		return ownerType;
	}
	public void setOwnerType(OwnerTypeEnum ownerType) {
		this.ownerType = ownerType;
	}
	public boolean isFirstVehicle() {
		return isFirstVehicle;
	}
	public void setFirstVehicle(boolean isFirstVehicle) {
		this.isFirstVehicle = isFirstVehicle;
	}
	public LocalDate getDateOfCompletion() {
		return dateOfCompletion;
	}
	public void setDateOfCompletion(LocalDate dateOfCompletion) {
		this.dateOfCompletion = dateOfCompletion;
	}
	public boolean isNocIssued() {
		return nocIssued;
	}
	public void setNocIssued(boolean nocIssued) {
		this.nocIssued = nocIssued;
	}
	public boolean isWithTP() {
		return withTP;
	}
	public void setWithTP(boolean withTP) {
		this.withTP = withTP;
	}
	public LocalDate getNocDate() {
		return nocDate;
	}
	public void setNocDate(LocalDate nocDate) {
		this.nocDate = nocDate;
	}
	public Boolean getFirstVehicle() {
		return firstVehicle;
	}
	public void setFirstVehicle(Boolean firstVehicle) {
		this.firstVehicle = firstVehicle;
	}
	public LocalDate getFcValidity() {
		return fcValidity;
	}
	public void setFcValidity(LocalDate fcValidity) {
		this.fcValidity = fcValidity;
	}
	public boolean isVehicleHaveAitp() {
		return vehicleHaveAitp;
	}
	public void setVehicleHaveAitp(boolean vehicleHaveAitp) {
		this.vehicleHaveAitp = vehicleHaveAitp;
	}
	public boolean isCalCulateQutTax() {
		return calCulateQutTax;
	}
	public void setCalCulateQutTax(boolean calCulateQutTax) {
		this.calCulateQutTax = calCulateQutTax;
	}
	public List<ClassOfVehiclesVO> getCovDetails() {
		return covDetails;
	}
	public void setCovDetails(List<ClassOfVehiclesVO> covDetails) {
		this.covDetails = covDetails;
	}
	public List<ServiceEnum> getServiceEnums() {
		return serviceEnums;
	}
	public void setServiceEnums(List<ServiceEnum> serviceEnums) {
		this.serviceEnums = serviceEnums;
	}
	public String getWeightDetails() {
		return weightDetails;
	}
	public void setWeightDetails(String weightDetails) {
		this.weightDetails = weightDetails;
	}
	public boolean isRequestForPay() {
		return requestForPay;
	}
	public void setRequestForPay(boolean requestForPay) {
		this.requestForPay = requestForPay;
	}
	public boolean isCalculateFc() {
		return isCalculateFc;
	}
	public void setCalculateFc(boolean isCalculateFc) {
		this.isCalculateFc = isCalculateFc;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public String getRegApplicationNo() {
		return regApplicationNo;
	}
	public void setRegApplicationNo(String regApplicationNo) {
		this.regApplicationNo = regApplicationNo;
	}
	public String getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(String seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	public RegistrationVcrVo getVoluntyInputs() {
		return voluntyInputs;
	}
	public void setVoluntyInputs(RegistrationVcrVo voluntyInputs) {
		this.voluntyInputs = voluntyInputs;
	}
	public LocalDate getSlotDateForPayments() {
		return slotDateForPayments;
	}
	public void setSlotDateForPayments(LocalDate slotDateForPayments) {
		this.slotDateForPayments = slotDateForPayments;
	}
	public String getPermitVehiclePrNo() {
		return permitVehiclePrNo;
	}
	public void setPermitVehiclePrNo(String permitVehiclePrNo) {
		this.permitVehiclePrNo = permitVehiclePrNo;
	}
	public boolean isIntrastate() {
		return intrastate;
	}
	public void setIntrastate(boolean intrastate) {
		this.intrastate = intrastate;
	}
	public boolean isVcrChassisTax() {
		return vcrChassisTax;
	}
	public void setVcrChassisTax(boolean vcrChassisTax) {
		this.vcrChassisTax = vcrChassisTax;
	}
	public AlterationDTO getAlterDetails() {
		return alterDetails;
	}
	public void setAlterDetails(AlterationDTO alterDetails) {
		this.alterDetails = alterDetails;
	}
	public LocalDateTime getIntrastateVcrDate() {
		return intrastateVcrDate;
	}
	public void setIntrastateVcrDate(LocalDateTime intrastateVcrDate) {
		this.intrastateVcrDate = intrastateVcrDate;
	}
	public Boolean getSpecificVcrPayment() {
		return specificVcrPayment;
	}
	public void setSpecificVcrPayment(Boolean specificVcrPayment) {
		this.specificVcrPayment = specificVcrPayment;
	}

	
}
