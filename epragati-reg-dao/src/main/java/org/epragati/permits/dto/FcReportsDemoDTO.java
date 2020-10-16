package org.epragati.permits.dto;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "fc_details")
public class FcReportsDemoDTO implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	String _id;
	
	String fcNumber;
	String officeCode;
	String vehicleNumber;
	LocalDate fcIssuedDate;
	LocalDate  fcValidUpto;
	LocalDate inspectedDate;
	String classOfVehicle;
	String prNo;
	String userId;
	String inspectedMviName;
	String OfficeName;
	String fctype;
	String chassisNo;
	String engineNo;
	
	
	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getFcNumber() {
		return fcNumber;
	}

	public void setFcNumber(String fcNumber) {
		this.fcNumber = fcNumber;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public LocalDate getFcIssuedDate() {
		return fcIssuedDate;
	}

	public void setFcIssuedDate(LocalDate fcIssuedDate) {
		this.fcIssuedDate = fcIssuedDate;
	}

	public LocalDate getFcValidUpto() {
		return fcValidUpto;
	}

	public void setFcValidUpto(LocalDate fcValidUpto) {
		this.fcValidUpto = fcValidUpto;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getInspectedMviName() {
		return inspectedMviName;
	}

	public void setInspectedMviName(String inspectedMviName) {
		this.inspectedMviName = inspectedMviName;
	}

	public String getOfficeName() {
		return OfficeName;
	}

	public void setOfficeName(String officeName) {
		OfficeName = officeName;
	}

	public String getFctype() {
		return fctype;
	}

	public void setFctype(String fctype) {
		this.fctype = fctype;
	}

	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	public LocalDate getInspectedDate() {
		return inspectedDate;
	}

	public void setInspectedDate(LocalDate inspectedDate) {
		this.inspectedDate = inspectedDate;
	}

	
	
}
