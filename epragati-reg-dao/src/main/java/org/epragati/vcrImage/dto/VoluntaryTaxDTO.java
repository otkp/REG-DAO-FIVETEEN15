package org.epragati.vcrImage.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.constants.OwnerTypeEnum;
import org.epragati.payment.dto.ChalanaDetailsDTO;
import org.epragati.regservice.dto.ActionDetails;
import org.epragati.util.payment.GatewayTypeEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "voluntary_tax_details")
public class VoluntaryTaxDTO extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Id
	private String applicationNo;
	private String regNo;
	private String trNo;
	private String chassisNo;
	private String classOfVehicle;
	private String classOfVehicleDesc;
	private String seatingCapacity;
	private Integer gvw;
	private Integer ulw;
	private String ownerName;
	private String state;
	private String address;
	private String permitNo;
	private LocalDate permitValidUpTo;
	// private String remarks;
	private String goodsDescription;
	private String noofPassengers;
	private Boolean homeStateUnregister;
	private Boolean otherStateRegister;
	private Boolean otherStateUnregister;
	private String vehicleType;

	private String fuelDesc;
	private OwnerTypeEnum ownerType;
	private LocalDate taxCalculationDateForLifeTax;
	private LocalDate prGeneratedDate;

	private List<ActionDetails> actions;

	private LocalDateTime paidDate;
	private String taxType;
	private LocalDate taxvalidUpto;
	private Double tax;
	private Long penalty;
	private Double taxArrears;
	private Long penaltyArrears;
	private Long totalAmount;
	private Long serviceFee;
	private GatewayTypeEnum gatewayType;
	private String makersModel;
	private Double invoiceValue;
	private LocalDate dateOfCompletion;
	private boolean nocIssued;
	private boolean withTP;
	private String permitCode;
	private LocalDate nocDate;
	private Boolean firstVehicle;
	private LocalDate fcValidity;
	private String officeCode;
	private String userId;
	private boolean vehicleHaveAitp;
	private boolean consolidateUpdated;
	private LocalDateTime consolidateUpdatedTime;
	private List<ChalanaDetailsDTO> challanDetails;

	private String recieptNo;
	
	private LocalDate homeTaxvalidUpto;
	private Boolean allowNextQuarterTax;
	private LocalDate taxvalidFrom;

	public String getRecieptNo() {
		return recieptNo;
	}

	public void setRecieptNo(String recieptNo) {
		this.recieptNo = recieptNo;
	}

	public List<ChalanaDetailsDTO> getChallanDetails() {
		return challanDetails;
	}

	public void setChallanDetails(List<ChalanaDetailsDTO> challanDetails) {
		this.challanDetails = challanDetails;
	}

	public LocalDateTime getConsolidateUpdatedTime() {
		return consolidateUpdatedTime;
	}

	public void setConsolidateUpdatedTime(LocalDateTime consolidateUpdatedTime) {
		this.consolidateUpdatedTime = consolidateUpdatedTime;
	}

	public boolean isConsolidateUpdated() {
		return consolidateUpdated;
	}

	public void setConsolidateUpdated(boolean consolidateUpdated) {
		this.consolidateUpdated = consolidateUpdated;
	}

	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
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

	public String getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(String seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
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

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public LocalDate getTaxvalidUpto() {
		return taxvalidUpto;
	}

	public void setTaxvalidUpto(LocalDate taxvalidUpto) {
		this.taxvalidUpto = taxvalidUpto;
	}

	public String getPermitNo() {
		return permitNo;
	}

	public void setPermitNo(String permitNo) {
		this.permitNo = permitNo;
	}

	public LocalDate getPermitValidUpTo() {
		return permitValidUpTo;
	}

	public void setPermitValidUpTo(LocalDate permitValidUpTo) {
		this.permitValidUpTo = permitValidUpTo;
	}

	public String getGoodsDescription() {
		return goodsDescription;
	}

	public void setGoodsDescription(String goodsDescription) {
		this.goodsDescription = goodsDescription;
	}

	public String getNoofPassengers() {
		return noofPassengers;
	}

	public void setNoofPassengers(String noofPassengers) {
		this.noofPassengers = noofPassengers;
	}

	public Boolean getHomeStateUnregister() {
		return homeStateUnregister;
	}

	public void setHomeStateUnregister(Boolean homeStateUnregister) {
		this.homeStateUnregister = homeStateUnregister;
	}

	public Boolean getOtherStateRegister() {
		return otherStateRegister;
	}

	public void setOtherStateRegister(Boolean otherStateRegister) {
		this.otherStateRegister = otherStateRegister;
	}

	public Boolean getOtherStateUnregister() {
		return otherStateUnregister;
	}

	public void setOtherStateUnregister(Boolean otherStateUnregister) {
		this.otherStateUnregister = otherStateUnregister;
	}

	public String getFuelDesc() {
		return fuelDesc;
	}

	public void setFuelDesc(String fuelDesc) {
		this.fuelDesc = fuelDesc;
	}

	public OwnerTypeEnum getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(OwnerTypeEnum ownerType) {
		this.ownerType = ownerType;
	}

	public LocalDate getTaxCalculationDateForLifeTax() {
		return taxCalculationDateForLifeTax;
	}

	public void setTaxCalculationDateForLifeTax(LocalDate taxCalculationDateForLifeTax) {
		this.taxCalculationDateForLifeTax = taxCalculationDateForLifeTax;
	}

	public LocalDate getPrGeneratedDate() {
		return prGeneratedDate;
	}

	public void setPrGeneratedDate(LocalDate prGeneratedDate) {
		this.prGeneratedDate = prGeneratedDate;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public List<ActionDetails> getActions() {
		return actions;
	}

	public void setActions(List<ActionDetails> actions) {
		this.actions = actions;
	}

	public LocalDateTime getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(LocalDateTime paidDate) {
		this.paidDate = paidDate;
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

	public Long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(Long serviceFee) {
		this.serviceFee = serviceFee;
	}

	public GatewayTypeEnum getGatewayType() {
		return gatewayType;
	}

	public void setGatewayType(GatewayTypeEnum gatewayType) {
		this.gatewayType = gatewayType;
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

	public String getPermitCode() {
		return permitCode;
	}

	public void setPermitCode(String permitCode) {
		this.permitCode = permitCode;
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

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public boolean isVehicleHaveAitp() {
		return vehicleHaveAitp;
	}

	public void setVehicleHaveAitp(boolean vehicleHaveAitp) {
		this.vehicleHaveAitp = vehicleHaveAitp;
	}

	public LocalDate getHomeTaxvalidUpto() {
		return homeTaxvalidUpto;
	}

	public void setHomeTaxvalidUpto(LocalDate homeTaxvalidUpto) {
		this.homeTaxvalidUpto = homeTaxvalidUpto;
	}

	public Boolean getAllowNextQuarterTax() {
		return allowNextQuarterTax;
	}

	public void setAllowNextQuarterTax(Boolean allowNextQuarterTax) {
		this.allowNextQuarterTax = allowNextQuarterTax;
	}

	public LocalDate getTaxvalidFrom() {
		return taxvalidFrom;
	}

	public void setTaxvalidFrom(LocalDate taxvalidFrom) {
		this.taxvalidFrom = taxvalidFrom;
	}

	
	
}
