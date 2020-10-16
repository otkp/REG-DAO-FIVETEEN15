package org.epragati.sn.dto;

import java.io.Serializable;

import org.epragati.constants.CovCategory;
import org.epragati.master.dto.MasterCovDTO;
import org.epragati.master.dto.OfficeDTO;

public class VehicleDetails implements Serializable {

	private static final long serialVersionUID = -8809204370804361781L;

	private String applicationNumber;

	private String trNumber;

	private String prNumber;

	private MasterCovDTO classOfVehicle;

	private CovCategory vehicleType;

	private OfficeDTO rtaOffice;

	private Boolean isSpecialNumberOpted;
	
	private Boolean isFromReassigment;
	
	private Boolean isDoByOldPrNo;

	public String getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public String getTrNumber() {
		return trNumber;
	}

	public void setTrNumber(String trNumber) {
		this.trNumber = trNumber;
	}

	public String getPrNumber() {
		return prNumber;
	}

	public void setPrNumber(String prNumber) {
		this.prNumber = prNumber;
	}

	
	public MasterCovDTO getClassOfVehicle() {
		return classOfVehicle;
	}

	public void setClassOfVehicle(MasterCovDTO classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	public CovCategory getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(CovCategory vehicleType) {
		this.vehicleType = vehicleType;
	}

	public OfficeDTO getRtaOffice() {
		return rtaOffice;
	}

	public void setRtaOffice(OfficeDTO rtaOffice) {
		this.rtaOffice = rtaOffice;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Boolean getIsSpecialNumberOpted() {
		return isSpecialNumberOpted;
	}

	public void setIsSpecialNumberOpted(Boolean isSpecialNumberOpted) {
		this.isSpecialNumberOpted = isSpecialNumberOpted;
	}

	/**
	 * @return the isFromReassigment
	 */
	public Boolean getIsFromReassigment() {
		return isFromReassigment;
	}

	/**
	 * @param isFromReassigment the isFromReassigment to set
	 */
	public void setIsFromReassigment(Boolean isFromReassigment) {
		this.isFromReassigment = isFromReassigment;
	}

	/**
	 * @return the isDoByOldPrNo
	 */
	public Boolean getIsDoByOldPrNo() {
		return isDoByOldPrNo;
	}

	/**
	 * @param isDoByOldPrNo the isDoByOldPrNo to set
	 */
	public void setIsDoByOldPrNo(Boolean isDoByOldPrNo) {
		this.isDoByOldPrNo = isDoByOldPrNo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VehicleDetails [" + (applicationNumber != null ? "applicationNumber=" + applicationNumber + ", " : "")
				+ (trNumber != null ? "trNumber=" + trNumber + ", " : "")
				+ (prNumber != null ? "prNumber=" + prNumber + ", " : "")
				+ (classOfVehicle != null ? "classOfVehicle=" + classOfVehicle + ", " : "")
				+ (vehicleType != null ? "vehicleType=" + vehicleType + ", " : "")
				+ (rtaOffice != null ? "rtaOffice=" + rtaOffice + ", " : "")
				+ (isSpecialNumberOpted != null ? "isSpecialNumberOpted=" + isSpecialNumberOpted + ", " : "")
				+ (isFromReassigment != null ? "isFromReassigment=" + isFromReassigment + ", " : "")
				+ (isDoByOldPrNo != null ? "isDoByOldPrNo=" + isDoByOldPrNo : "") + "]";
	}
	
	

}
