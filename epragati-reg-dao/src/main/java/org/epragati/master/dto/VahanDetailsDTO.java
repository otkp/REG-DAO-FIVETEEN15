package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vahan_details")
@CompoundIndexes({
		// @CompoundIndex(name = "cha_eng", def = "{'chassisNumber': 1, 'engineNumber'
		// :1}"),
		// @CompoundIndex(name = "engineNumber_or_chassisNumber", def =
		// "{'engineNumber': 1, 'chassisNumber' :1}")
})
public class VahanDetailsDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String registrationNumber;
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
	private String insuranceCompany;
	private String insurancePolicyNumber;
	private String insuranceUpto;
	private String noCyl;
	private String cubicCapacity;
	private String sleeperCapacity;
	private String standCapacity;
	private String registeredAt;
	private String statusAsOn;
	private Integer exShowroomPrice;
	private boolean isUsed;
	private boolean applicationNo;

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

	private HarvestersDetailsDTO harvestersDetails;

	private Boolean status = false;
	
	private LocalDateTime createdeDate;
	 
	private Integer oldGvw;

	/**
	 * @return the axleType
	 */
	public String getAxleType() {
		return axleType;
	}

	/**
	 * @param axleType
	 *            the axleType to set
	 */
	public void setAxleType(String axleType) {
		this.axleType = axleType;
	}

	public String getAppNo() {
		return appNo;
	}

	public void setAppNo(String appNo) {
		this.appNo = appNo;
	}

	/**
	 * @return the makersName
	 */
	public String getMakersName() {
		return makersName;
	}

	/**
	 * @param makersName
	 *            the makersName to set
	 */
	public void setMakersName(String makersName) {
		this.makersName = makersName;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the registrationNumber
	 */
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	/**
	 * @param registrationNumber
	 *            the registrationNumber to set
	 */
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	/**
	 * @return the chassisNumber
	 */
	public String getChassisNumber() {
		return chassisNumber;
	}

	/**
	 * @param chassisNumber
	 *            the chassisNumber to set
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
	 * @param engineNumber
	 *            the engineNumber to set
	 */
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}

	/**
	 * @param ownerName
	 *            the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model
	 *            the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the permanentAddress
	 */
	/*
	 * public String getPermanentAddress() { return permanentAddress; }
	 *//**
		 * @param permanentAddress
		 *            the permanentAddress to set
		 *//*
			 * public void setPermanentAddress(String permanentAddress) {
			 * this.permanentAddress = permanentAddress; }
			 */

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the manufacturedMonthYear
	 */
	public String getManufacturedMonthYear() {
		return manufacturedMonthYear;
	}

	/**
	 * @param manufacturedMonthYear
	 *            the manufacturedMonthYear to set
	 */
	public void setManufacturedMonthYear(String manufacturedMonthYear) {
		this.manufacturedMonthYear = manufacturedMonthYear;
	}

	/**
	 * @return the vehicleClass
	 */
	public String getVehicleClass() {
		return vehicleClass;
	}

	/**
	 * @param vehicleClass
	 *            the vehicleClass to set
	 */
	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	/**
	 * @return the makersModel
	 */
	public String getMakersModel() {
		return makersModel;
	}

	/**
	 * @param makersModel
	 *            the makersModel to set
	 */
	public void setMakersModel(String makersModel) {
		this.makersModel = makersModel;
	}

	/**
	 * @return the seatingCapacity
	 */
	public String getSeatingCapacity() {
		return seatingCapacity;
	}

	/**
	 * @param seatingCapacity
	 *            the seatingCapacity to set
	 */
	public void setSeatingCapacity(String seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	/**
	 * @return the statusMessage
	 */
	public String getStatusMessage() {
		return statusMessage;
	}

	/**
	 * @param statusMessage
	 *            the statusMessage to set
	 */
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	/**
	 * @return the registrationDate
	 */
	public String getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * @param registrationDate
	 *            the registrationDate to set
	 */
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	/**
	 * @return the ownerSr
	 */
	public String getOwnerSr() {
		return ownerSr;
	}

	/**
	 * @param ownerSr
	 *            the ownerSr to set
	 */
	public void setOwnerSr(String ownerSr) {
		this.ownerSr = ownerSr;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the presentAddress
	 */
	public String getPresentAddress() {
		return presentAddress;
	}

	/**
	 * @param presentAddress
	 *            the presentAddress to set
	 */
	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}

	/**
	 * @return the bodyTypeDesc
	 */
	public String getBodyTypeDesc() {
		return bodyTypeDesc;
	}

	/**
	 * @param bodyTypeDesc
	 *            the bodyTypeDesc to set
	 */
	public void setBodyTypeDesc(String bodyTypeDesc) {
		this.bodyTypeDesc = bodyTypeDesc;
	}

	/**
	 * @return the fitUpto
	 */
	public String getFitUpto() {
		return fitUpto;
	}

	/**
	 * @param fitUpto
	 *            the fitUpto to set
	 */
	public void setFitUpto(String fitUpto) {
		this.fitUpto = fitUpto;
	}

	/**
	 * @return the taxUpto
	 */
	public String getTaxUpto() {
		return taxUpto;
	}

	/**
	 * @param taxUpto
	 *            the taxUpto to set
	 */
	public void setTaxUpto(String taxUpto) {
		this.taxUpto = taxUpto;
	}

	/**
	 * @return the financer
	 */
	public String getFinancer() {
		return financer;
	}

	/**
	 * @param financer
	 *            the financer to set
	 */
	public void setFinancer(String financer) {
		this.financer = financer;
	}

	/**
	 * @return the insuranceCompany
	 */
	public String getInsuranceCompany() {
		return insuranceCompany;
	}

	/**
	 * @param insuranceCompany
	 *            the insuranceCompany to set
	 */
	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}

	/**
	 * @return the insurancePolicyNumber
	 */
	public String getInsurancePolicyNumber() {
		return insurancePolicyNumber;
	}

	/**
	 * @param insurancePolicyNumber
	 *            the insurancePolicyNumber to set
	 */
	public void setInsurancePolicyNumber(String insurancePolicyNumber) {
		this.insurancePolicyNumber = insurancePolicyNumber;
	}

	/**
	 * @return the insuranceUpto
	 */
	public String getInsuranceUpto() {
		return insuranceUpto;
	}

	/**
	 * @param insuranceUpto
	 *            the insuranceUpto to set
	 */
	public void setInsuranceUpto(String insuranceUpto) {
		this.insuranceUpto = insuranceUpto;
	}

	/**
	 * @return the noCyl
	 */
	public String getNoCyl() {
		return noCyl;
	}

	/**
	 * @param noCyl
	 *            the noCyl to set
	 */
	public void setNoCyl(String noCyl) {
		this.noCyl = noCyl;
	}

	/**
	 * @return the cubicCapacity
	 */
	public String getCubicCapacity() {
		return cubicCapacity;
	}

	/**
	 * @param cubicCapacity
	 *            the cubicCapacity to set
	 */
	public void setCubicCapacity(String cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}

	/**
	 * @return the sleeperCapacity
	 */
	public String getSleeperCapacity() {
		return sleeperCapacity;
	}

	/**
	 * @param sleeperCapacity
	 *            the sleeperCapacity to set
	 */
	public void setSleeperCapacity(String sleeperCapacity) {
		this.sleeperCapacity = sleeperCapacity;
	}

	/**
	 * @return the standCapacity
	 */
	public String getStandCapacity() {
		return standCapacity;
	}

	/**
	 * @param standCapacity
	 *            the standCapacity to set
	 */
	public void setStandCapacity(String standCapacity) {
		this.standCapacity = standCapacity;
	}

	/**
	 * @return the registeredAt
	 */
	public String getRegisteredAt() {
		return registeredAt;
	}

	/**
	 * @param registeredAt
	 *            the registeredAt to set
	 */
	public void setRegisteredAt(String registeredAt) {
		this.registeredAt = registeredAt;
	}

	/**
	 * @return the statusAsOn
	 */
	public String getStatusAsOn() {
		return statusAsOn;
	}

	/**
	 * @param statusAsOn
	 *            the statusAsOn to set
	 */
	public void setStatusAsOn(String statusAsOn) {
		this.statusAsOn = statusAsOn;
	}

	/**
	 * @return the exShowroomPrice
	 */
	public Integer getExShowroomPrice() {
		return exShowroomPrice;
	}

	/**
	 * @param exShowroomPrice
	 *            the exShowroomPrice to set
	 */
	public void setExShowroomPrice(Integer exShowroomPrice) {
		this.exShowroomPrice = exShowroomPrice;
	}

	/**
	 * @return the isUsed
	 */
	public boolean isUsed() {
		return isUsed;
	}

	/**
	 * @param isUsed
	 *            the isUsed to set
	 */
	public void setUsed(boolean isUsed) {
		this.isUsed = isUsed;
	}

	/**
	 * @return the applicationNo
	 */
	public boolean isApplicationNo() {
		return applicationNo;
	}

	/**
	 * @param applicationNo
	 *            the applicationNo to set
	 */
	public void setApplicationNo(boolean applicationNo) {
		this.applicationNo = applicationNo;
	}

	/**
	 * @return the enginePower
	 */
	public Double getEnginePower() {
		return enginePower;
	}

	/**
	 * @param enginePower
	 *            the enginePower to set
	 */
	public void setEnginePower(Double enginePower) {
		this.enginePower = enginePower;
	}

	/**
	 * @return the frontAxleDesc
	 */
	public String getFrontAxleDesc() {
		return frontAxleDesc;
	}

	/**
	 * @param frontAxleDesc
	 *            the frontAxleDesc to set
	 */
	public void setFrontAxleDesc(String frontAxleDesc) {
		this.frontAxleDesc = frontAxleDesc;
	}

	/**
	 * @return the frontAxleWeight
	 */
	public Integer getFrontAxleWeight() {
		return frontAxleWeight;
	}

	/**
	 * @param frontAxleWeight
	 *            the frontAxleWeight to set
	 */
	public void setFrontAxleWeight(Integer frontAxleWeight) {
		this.frontAxleWeight = frontAxleWeight;
	}

	/**
	 * @return the fuelDesc
	 */
	public String getFuelDesc() {
		return fuelDesc;
	}

	/**
	 * @param fuelDesc
	 *            the fuelDesc to set
	 */
	public void setFuelDesc(String fuelDesc) {
		this.fuelDesc = fuelDesc;
	}

	/**
	 * @return the gvw
	 */
	public Integer getGvw() {
		return gvw;
	}

	/**
	 * @param gvw
	 *            the gvw to set
	 */
	public void setGvw(Integer gvw) {
		this.gvw = gvw;
	}

	/**
	 * @return the height
	 */

	/**
	 * @return the makersDesc
	 */
	public String getMakersDesc() {
		return makersDesc;
	}

	/**
	 * @param makersDesc
	 *            the makersDesc to set
	 */
	public void setMakersDesc(String makersDesc) {
		this.makersDesc = makersDesc;
	}

	/**
	 * @return the pollutionNormsDesc
	 */
	public String getPollutionNormsDesc() {
		return pollutionNormsDesc;
	}

	/**
	 * @param pollutionNormsDesc
	 *            the pollutionNormsDesc to set
	 */
	public void setPollutionNormsDesc(String pollutionNormsDesc) {
		this.pollutionNormsDesc = pollutionNormsDesc;
	}

	/**
	 * @return the o1AxleDesc
	 */
	public String getO1AxleDesc() {
		return o1AxleDesc;
	}

	/**
	 * @param o1AxleDesc
	 *            the o1AxleDesc to set
	 */
	public void setO1AxleDesc(String o1AxleDesc) {
		this.o1AxleDesc = o1AxleDesc;
	}

	/**
	 * @return the o1AxleWeight
	 */
	public Integer getO1AxleWeight() {
		return o1AxleWeight;
	}

	/**
	 * @param o1AxleWeight
	 *            the o1AxleWeight to set
	 */
	public void setO1AxleWeight(Integer o1AxleWeight) {
		this.o1AxleWeight = o1AxleWeight;
	}

	/**
	 * @return the o2AxleDesc
	 */
	public String getO2AxleDesc() {
		return o2AxleDesc;
	}

	/**
	 * @param o2AxleDesc
	 *            the o2AxleDesc to set
	 */
	public void setO2AxleDesc(String o2AxleDesc) {
		this.o2AxleDesc = o2AxleDesc;
	}

	/**
	 * @return the o2AxleWeight
	 */
	public Integer getO2AxleWeight() {
		return o2AxleWeight;
	}

	/**
	 * @param o2AxleWeight
	 *            the o2AxleWeight to set
	 */
	public void setO2AxleWeight(Integer o2AxleWeight) {
		this.o2AxleWeight = o2AxleWeight;
	}

	/**
	 * @return the o3AxleDesc
	 */
	public String getO3AxleDesc() {
		return o3AxleDesc;
	}

	/**
	 * @param o3AxleDesc
	 *            the o3AxleDesc to set
	 */
	public void setO3AxleDesc(String o3AxleDesc) {
		this.o3AxleDesc = o3AxleDesc;
	}

	/**
	 * @return the o3AxleWeight
	 */
	public Integer getO3AxleWeight() {
		return o3AxleWeight;
	}

	/**
	 * @param o3AxleWeight
	 *            the o3AxleWeight to set
	 */
	public void setO3AxleWeight(Integer o3AxleWeight) {
		this.o3AxleWeight = o3AxleWeight;
	}

	/**
	 * @return the o4AxleDesc
	 */
	public String getO4AxleDesc() {
		return o4AxleDesc;
	}

	/**
	 * @param o4AxleDesc
	 *            the o4AxleDesc to set
	 */
	public void setO4AxleDesc(String o4AxleDesc) {
		this.o4AxleDesc = o4AxleDesc;
	}

	/**
	 * @return the o4AxleWeight
	 */
	public Integer getO4AxleWeight() {
		return o4AxleWeight;
	}

	/**
	 * @param o4AxleWeight
	 *            the o4AxleWeight to set
	 */
	public void setO4AxleWeight(Integer o4AxleWeight) {
		this.o4AxleWeight = o4AxleWeight;
	}

	/**
	 * @return the o5AxleDesc
	 */
	public String getO5AxleDesc() {
		return o5AxleDesc;
	}

	/**
	 * @param o5AxleDesc
	 *            the o5AxleDesc to set
	 */
	public void setO5AxleDesc(String o5AxleDesc) {
		this.o5AxleDesc = o5AxleDesc;
	}

	/**
	 * @return the o5AxleWeight
	 */
	public Integer getO5AxleWeight() {
		return o5AxleWeight;
	}

	/**
	 * @param o5AxleWeight
	 *            the o5AxleWeight to set
	 */
	public void setO5AxleWeight(Integer o5AxleWeight) {
		this.o5AxleWeight = o5AxleWeight;
	}

	/**
	 * @return the rearAxleDesc
	 */
	public String getRearAxleDesc() {
		return rearAxleDesc;
	}

	/**
	 * @param rearAxleDesc
	 *            the rearAxleDesc to set
	 */
	public void setRearAxleDesc(String rearAxleDesc) {
		this.rearAxleDesc = rearAxleDesc;
	}

	/**
	 * @return the rearAxleWeight
	 */
	public Integer getRearAxleWeight() {
		return rearAxleWeight;
	}

	/**
	 * @param rearAxleWeight
	 *            the rearAxleWeight to set
	 */
	public void setRearAxleWeight(Integer rearAxleWeight) {
		this.rearAxleWeight = rearAxleWeight;
	}

	/**
	 * @return the unladenWeight
	 */
	public Integer getUnladenWeight() {
		return unladenWeight;
	}

	/**
	 * @param unladenWeight
	 *            the unladenWeight to set
	 */
	public void setUnladenWeight(Integer unladenWeight) {
		this.unladenWeight = unladenWeight;
	}

	/**
	 * @return the wheelbase
	 */
	public Integer getWheelbase() {
		return wheelbase;
	}

	/**
	 * @param wheelbase
	 *            the wheelbase to set
	 */
	public void setWheelbase(Integer wheelbase) {
		this.wheelbase = wheelbase;
	}

	/**
	 * @return the width
	 */

	/**
	 * @return the tandemAxelDescp
	 */
	public String getTandemAxelDescp() {
		return tandemAxelDescp;
	}

	/**
	 * @param tandemAxelDescp
	 *            the tandemAxelDescp to set
	 */
	public void setTandemAxelDescp(String tandemAxelDescp) {
		this.tandemAxelDescp = tandemAxelDescp;
	}

	/**
	 * @return the tandemAxelWeight
	 */
	public Integer getTandemAxelWeight() {
		return tandemAxelWeight;
	}

	/**
	 * @param tandemAxelWeight
	 *            the tandemAxelWeight to set
	 */
	public void setTandemAxelWeight(Integer tandemAxelWeight) {
		this.tandemAxelWeight = tandemAxelWeight;
	}

	/**
	 * @return the dealerSelectedMakerName
	 */
	public String getDealerSelectedMakerName() {
		return dealerSelectedMakerName;
	}

	/**
	 * @param dealerSelectedMakerName
	 *            the dealerSelectedMakerName to set
	 */
	public void setDealerSelectedMakerName(String dealerSelectedMakerName) {
		this.dealerSelectedMakerName = dealerSelectedMakerName;
	}

	/**
	 * @return the dealerSelectedMakerClass
	 */
	public String getDealerSelectedMakerClass() {
		return dealerSelectedMakerClass;
	}

	/**
	 * @param dealerSelectedMakerClass
	 *            the dealerSelectedMakerClass to set
	 */
	public void setDealerSelectedMakerClass(String dealerSelectedMakerClass) {
		this.dealerSelectedMakerClass = dealerSelectedMakerClass;
	}

	/**
	 * @return the dealerSelectedBodyType
	 */
	public String getDealerSelectedBodyType() {
		return dealerSelectedBodyType;
	}

	/**
	 * @param dealerSelectedBodyType
	 *            the dealerSelectedBodyType to set
	 */
	public void setDealerSelectedBodyType(String dealerSelectedBodyType) {
		this.dealerSelectedBodyType = dealerSelectedBodyType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VahanDetailsDTO [id=" + id + ", registrationNumber=" + registrationNumber + ", chassisNumber="
				+ chassisNumber + ", engineNumber=" + engineNumber + ", ownerName=" + ownerName + ", name=" + name
				+ ", model=" + model /* + ", permanentAddress=" + permanentAddress */ + ", color=" + color
				+ ", manufacturedMonthYear=" + manufacturedMonthYear + ", vehicleClass=" + vehicleClass
				+ ", makersModel=" + makersModel + ", seatingCapacity=" + seatingCapacity + ", statusMessage="
				+ statusMessage + ", registrationDate=" + registrationDate + ", ownerSr=" + ownerSr + ", firstName="
				+ firstName + ", presentAddress=" + presentAddress + ", bodyTypeDesc=" + bodyTypeDesc + ", fitUpto="
				+ fitUpto + ", taxUpto=" + taxUpto + ", financer=" + financer + ", insuranceCompany=" + insuranceCompany
				+ ", insurancePolicyNumber=" + insurancePolicyNumber + ", insuranceUpto=" + insuranceUpto + ", noCyl="
				+ noCyl + ", cubicCapacity=" + cubicCapacity + ", sleeperCapacity=" + sleeperCapacity
				+ ", standCapacity=" + standCapacity + ", registeredAt=" + registeredAt + ", statusAsOn=" + statusAsOn
				+ ", exShowroomPrice=" + exShowroomPrice + ", isUsed=" + isUsed + ", applicationNo=" + applicationNo
				+ ", enginePower=" + enginePower + ", frontAxleDesc=" + frontAxleDesc + ", frontAxleWeight="
				+ frontAxleWeight + ", fuelDesc=" + fuelDesc + ", gvw=" + gvw + ", height=" + height + ", length="
				+ length + ", makersDesc=" + makersDesc + ", pollutionNormsDesc=" + pollutionNormsDesc + ", o1AxleDesc="
				+ o1AxleDesc + ", o1AxleWeight=" + o1AxleWeight + ", o2AxleDesc=" + o2AxleDesc + ", o2AxleWeight="
				+ o2AxleWeight + ", o3AxleDesc=" + o3AxleDesc + ", o3AxleWeight=" + o3AxleWeight + ", o4AxleDesc="
				+ o4AxleDesc + ", o4AxleWeight=" + o4AxleWeight + ", o5AxleDesc=" + o5AxleDesc + ", o5AxleWeight="
				+ o5AxleWeight + ", rearAxleDesc=" + rearAxleDesc + ", rearAxleWeight=" + rearAxleWeight
				+ ", unladenWeight=" + unladenWeight + ", wheelbase=" + wheelbase + ", width=" + width
				+ ", tandemAxelDescp=" + tandemAxelDescp + ", tandemAxelWeight=" + tandemAxelWeight + "]";
	}

	public List<String> getDealerCovType() {
		return dealerCovType;
	}

	public void setDealerCovType(List<String> dealerCovType) {
		this.dealerCovType = dealerCovType;
	}

	/**
	 * @return the isNonVahanData
	 */
	public Boolean getIsNonVahanData() {
		return isNonVahanData;
	}

	/**
	 * @param isNonVahanData
	 *            the isNonVahanData to set
	 */
	public void setIsNonVahanData(Boolean isNonVahanData) {
		this.isNonVahanData = isNonVahanData;
	}

	/**
	 * @return the height
	 */
	/**
	 * @return the height
	 */
	public Double getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(Double height) {
		this.height = height;
	}

	/**
	 * @return the length
	 */
	public Double getLength() {
		return length;
	}

	/**
	 * @param length
	 *            the length to set
	 */
	public void setLength(Double length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public Double getWidth() {
		return width;
	}

	/**
	 * @param width
	 *            the width to set
	 */
	public void setWidth(Double width) {
		this.width = width;
	}

	/**
	 * @return the harvestersDetails
	 */
	public HarvestersDetailsDTO getHarvestersDetails() {
		return harvestersDetails;
	}

	/**
	 * @param harvestersDetails
	 *            the harvestersDetails to set
	 */
	public void setHarvestersDetails(HarvestersDetailsDTO harvestersDetails) {
		this.harvestersDetails = harvestersDetails;
	}

	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * @return the createdeDate
	 */
	public LocalDateTime getCreatedeDate() {
		return createdeDate;
	}

	/**
	 * @param createdeDate the createdeDate to set
	 */
	public void setCreatedeDate(LocalDateTime createdeDate) {

		this.createdeDate = createdeDate;

	}
	
	public VahanDetailsDTO setCreatedeDateForObj() {
		if(null==this.getCreatedeDate()) {
			this.setCreatedeDate(LocalDateTime.of(1974,01,01,00,00));
		}
		return this;
		
	}

	public Integer getOldGvw() {
		return oldGvw;
	}

	public void setOldGvw(Integer oldGvw) {
		this.oldGvw = oldGvw;
	}

	private List<TrailerChassisDetailsDTO> trailerChassisDetailsDTO;

	/**
	 * @return the trailerChassisDetailsDTO
	 */
	public List<TrailerChassisDetailsDTO> getTrailerChassisDetailsDTO() {
		return trailerChassisDetailsDTO;
	}

	/**
	 * @param trailerChassisDetailsDTO the trailerChassisDetailsDTO to set
	 */
	public void setTrailerChassisDetailsDTO(List<TrailerChassisDetailsDTO> trailerChassisDetailsDTO) {
		this.trailerChassisDetailsDTO = trailerChassisDetailsDTO;
	}
	
	
}
