package org.epragati.vcrImage.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import org.epragati.constants.OwnerTypeEnum;
import org.epragati.master.dto.MasterCovDTO;
import org.epragati.master.dto.StateDTO;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "vcr_registration")
public class RegistrationVcr implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean unregisteredVehicle;
	private boolean otherState;
	private boolean engineNoAndChessisNoNotAvailable;
	private boolean isTransport;
	@JsonFormat(pattern = "yyyy-MM-dd ")
	private LocalDate trValidity;
	private Integer invoiceAmmount;
	@NotNull(message = "tempRegNo/ChessisNo are required.")
	private String regNo;
	@NotNull(message = "state are required.")
	private StateDTO state;
	@NotNull(message = "classsOfVehicle are required.")
	private MasterCovDTO classsOfVehicle;
	private String incomingOrOutgoing;
	private String chassisNumber;
	private String engineNumber;
	private Integer seatingCapacity;
	private Integer gvwc;
	private Integer ulw;
	private String trNo;
	private String regApplicationNo;
	private boolean otherStateRegister;
	private boolean otherStateUnregister;
	private String fuelDesc;
	private OwnerTypeEnum ownerType;
	private LocalDate taxCalculationDateForLifeTax;
	private LocalDate prGeneratedDate;
	private LocalDate trGeneratedDate;
	private String makersModel;
	private Boolean firstVehicle;
	private String bodyTypeDesc;
	private Boolean nocIssued;
	private LocalDate taxCalculationDateForQuarterlyTax;
	private LocalDate dateOfCompletion;
	

	public String getMakersModel() {
		return makersModel;
	}

	public void setMakersModel(String makersModel) {
		this.makersModel = makersModel;
	}

	public boolean isUnregisteredVehicle() {
		return unregisteredVehicle;
	}

	public void setUnregisteredVehicle(boolean unregisteredVehicle) {
		this.unregisteredVehicle = unregisteredVehicle;
	}

	public boolean isOtherState() {
		return otherState;
	}

	public void setOtherState(boolean otherState) {
		this.otherState = otherState;
	}

	public boolean isEngineNoAndChessisNoNotAvailable() {
		return engineNoAndChessisNoNotAvailable;
	}

	public void setEngineNoAndChessisNoNotAvailable(boolean engineNoAndChessisNoNotAvailable) {
		this.engineNoAndChessisNoNotAvailable = engineNoAndChessisNoNotAvailable;
	}

	public boolean isTransport() {
		return isTransport;
	}

	public void setTransport(boolean isTransport) {
		this.isTransport = isTransport;
	}

	public LocalDate getTrValidity() {
		return trValidity;
	}

	public void setTrValidity(LocalDate trValidity) {
		this.trValidity = trValidity;
	}

	public Integer getInvoiceAmmount() {
		return invoiceAmmount;
	}

	public void setInvoiceAmmount(Integer invoiceAmmount) {
		this.invoiceAmmount = invoiceAmmount;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public StateDTO getState() {
		return state;
	}

	public void setState(StateDTO state) {
		this.state = state;
	}

	public MasterCovDTO getClasssOfVehicle() {
		return classsOfVehicle;
	}

	public void setClasssOfVehicle(MasterCovDTO classsOfVehicle) {
		this.classsOfVehicle = classsOfVehicle;
	}

	public String getIncomingOrOutgoing() {
		return incomingOrOutgoing;
	}

	public void setIncomingOrOutgoing(String incomingOrOutgoing) {
		this.incomingOrOutgoing = incomingOrOutgoing;
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

	public Integer getGvwc() {
		return gvwc;
	}

	public void setGvwc(Integer gvwc) {
		this.gvwc = gvwc;
	}

	public Integer getUlw() {
		return ulw;
	}

	public void setUlw(Integer ulw) {
		this.ulw = ulw;
	}

	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	public String getRegApplicationNo() {
		return regApplicationNo;
	}

	public void setRegApplicationNo(String regApplicationNo) {
		this.regApplicationNo = regApplicationNo;
	}

	public boolean isOtherStateRegister() {
		return otherStateRegister;
	}

	public void setOtherStateRegister(boolean otherStateRegister) {
		this.otherStateRegister = otherStateRegister;
	}

	public boolean isOtherStateUnregister() {
		return otherStateUnregister;
	}

	public void setOtherStateUnregister(boolean otherStateUnregister) {
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

	public LocalDate getTrGeneratedDate() {
		return trGeneratedDate;
	}

	public void setTrGeneratedDate(LocalDate trGeneratedDate) {
		this.trGeneratedDate = trGeneratedDate;
	}

	public Boolean getFirstVehicle() {
		return firstVehicle;
	}

	public void setFirstVehicle(Boolean firstVehicle) {
		this.firstVehicle = firstVehicle;
	}

	public String getBodyTypeDesc() {
		return bodyTypeDesc;
	}

	public void setBodyTypeDesc(String bodyTypeDesc) {
		this.bodyTypeDesc = bodyTypeDesc;
	}

	

	public Boolean getNocIssued() {
		return nocIssued;
	}

	public void setNocIssued(Boolean nocIssued) {
		this.nocIssued = nocIssued;
	}

	public LocalDate getTaxCalculationDateForQuarterlyTax() {
		return taxCalculationDateForQuarterlyTax;
	}

	public void setTaxCalculationDateForQuarterlyTax(LocalDate taxCalculationDateForQuarterlyTax) {
		this.taxCalculationDateForQuarterlyTax = taxCalculationDateForQuarterlyTax;
	}

	public LocalDate getDateOfCompletion() {
		return dateOfCompletion;
	}

	public void setDateOfCompletion(LocalDate dateOfCompletion) {
		this.dateOfCompletion = dateOfCompletion;
	}



	
}
