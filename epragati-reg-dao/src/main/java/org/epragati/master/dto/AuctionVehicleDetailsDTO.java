package org.epragati.master.dto;

import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.constants.TransferType;
import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.util.document.KeyValue;

public class AuctionVehicleDetailsDTO extends BaseEntity {

	private String prNo;
	private String trNo;
	private String officeCode;
	private String officeName;
	private String vehicleType;
	private String classOfVehicle;
	private String classOfVehicleDesc;
	private String chassisNumber;
	private String engineNumber;
	private TransferType.vehicleCondition vehicleCondition;
	private TransferType.genuiness genuiness;
	private Double upSetPrice;
	private String token;
	private Boolean otherState;
	private Boolean towDone;
	private Boolean rcCanceled;
	private List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures;
	
	
	public String getPrNo() {
		return prNo;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	public String getTrNo() {
		return trNo;
	}
	public void setTrNo(String trNo) {
		this.trNo = trNo;
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
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
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
	public TransferType.vehicleCondition getVehicleCondition() {
		return vehicleCondition;
	}
	public void setVehicleCondition(TransferType.vehicleCondition vehicleCondition) {
		this.vehicleCondition = vehicleCondition;
	}
	public TransferType.genuiness getGenuiness() {
		return genuiness;
	}
	public void setGenuiness(TransferType.genuiness genuiness) {
		this.genuiness = genuiness;
	}
	public Double getUpSetPrice() {
		return upSetPrice;
	}
	public void setUpSetPrice(Double upSetPrice) {
		this.upSetPrice = upSetPrice;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Boolean getOtherState() {
		return otherState;
	}
	public void setOtherState(Boolean otherState) {
		this.otherState = otherState;
	}
	public Boolean getTowDone() {
		return towDone;
	}
	public void setTowDone(Boolean towDone) {
		this.towDone = towDone;
	}
	public Boolean getRcCanceled() {
		return rcCanceled;
	}
	public void setRcCanceled(Boolean rcCanceled) {
		this.rcCanceled = rcCanceled;
	}
	public List<KeyValue<String, List<ImageEnclosureDTO>>> getEnclosures() {
		return enclosures;
	}
	public void setEnclosures(List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures) {
		this.enclosures = enclosures;
	}
	
	
	
	
}
