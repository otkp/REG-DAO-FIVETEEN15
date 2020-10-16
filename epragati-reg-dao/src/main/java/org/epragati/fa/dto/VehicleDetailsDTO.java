package org.epragati.fa.dto;

import java.time.LocalDate;

import org.epragati.master.dto.InsuranceDetailsDTO;

public class VehicleDetailsDTO {
	private String vehicleNo;

	private String classOfVehicle;

	private LocalDate TaxValidityEnd;

	private LocalDate fcValidityEnd;
	
	private InsuranceDetailsDTO insuranceDetails;
	
	private LocalDate pollutionValidityEnd;
	
	private String officeCode;
	
	private LocalDate permitValidityEnd;

	public LocalDate getPermitValidityEnd() {
		return permitValidityEnd;
	}

	public void setPermitValidityEnd(LocalDate permitValidityEnd) {
		this.permitValidityEnd = permitValidityEnd;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	public LocalDate getTaxValidityEnd() {
		return TaxValidityEnd;
	}

	public void setTaxValidityEnd(LocalDate taxValidityEnd) {
		TaxValidityEnd = taxValidityEnd;
	}

	public LocalDate getFcValidityEnd() {
		return fcValidityEnd;
	}

	public void setFcValidityEnd(LocalDate fcValidityEnd) {
		this.fcValidityEnd = fcValidityEnd;
	}

	public InsuranceDetailsDTO getInsuranceDetails() {
		return insuranceDetails;
	}

	public void setInsuranceDetails(InsuranceDetailsDTO insuranceDetails) {
		this.insuranceDetails = insuranceDetails;
	}

	public LocalDate getPollutionValidityEnd() {
		return pollutionValidityEnd;
	}

	public void setPollutionValidityEnd(LocalDate pollutionValidityEnd) {
		this.pollutionValidityEnd = pollutionValidityEnd;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	
}
