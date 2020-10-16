package org.epragati.vcrImage.dto;

public class OtherVoluntaryTax {
	private String  voluntaryId;
	private String chassisNo;
	private String  taxType;
	private String  taxvalidUpto;
	private String  tax;
	private String  ownerName;
	private String  state;
	private String  taxvalidFrom;
	public String getVoluntaryId() {
		return voluntaryId;
	}
	public void setVoluntaryId(String voluntaryId) {
		this.voluntaryId = voluntaryId;
	}

	public String getTaxType() {
		return taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}
	public String getTaxvalidUpto() {
		return taxvalidUpto;
	}
	public void setTaxvalidUpto(String taxvalidUpto) {
		this.taxvalidUpto = taxvalidUpto;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
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
	public String getTaxvalidFrom() {
		return taxvalidFrom;
	}
	public void setTaxvalidFrom(String taxvalidFrom) {
		this.taxvalidFrom = taxvalidFrom;
	}
	public String getChassisNo() {
		return chassisNo;
	}
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}
	@Override
	public String toString() {
		return "OtherVoluntaryTax [voluntaryId=" + voluntaryId + ", classOfVehicle=" + ", taxType="
				+ taxType + ", taxvalidUpto=" + taxvalidUpto + ", tax=" + tax + ", ownerName=" + ownerName + ", state="
				+ state + ", createdDate=" + taxvalidFrom + "]";
	}
}
