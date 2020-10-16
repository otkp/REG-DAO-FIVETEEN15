package org.epragati.vcrImage.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author Krishnarjun Pampana
 *
 */
@Document(collection = "speedgun_vcr_data")
public class SpeedGunDTO {

	
	private String location;
	private String officer;
	
	private String officerId;
	private String imageId;
	private LocalDate gunDate;
	private String gunTime;
	private String speedZone;
	private String speed;
	private String distance; 
	private String registrationNo;
	private String dlNo;
	private String driverName;
	private String lattitude;
	private String longitude;
	private String laserSlno; 
	private String vehicleImage; 
	private String otherOffense;
	private String flag;
	private LocalDateTime crtdDt;
	private String vcrNo;
	private LocalDateTime vcrGenDt; 
	private String mobileNo;
	private String smsFlag;
	private LocalDateTime smsSendDt; 
	private String vcrgenSmsDt;
	private String vcrgenSmsFlag;
	private String overspeedOffences ;
	private String printFlag;
	private String remarks;

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the officer
	 */
	public String getOfficer() {
		return officer;
	}
	/**
	 * @param officer the officer to set
	 */
	public void setOfficer(String officer) {
		this.officer = officer;
	}
	/**
	 * @return the officerId
	 */
	public String getOfficerId() {
		return officerId;
	}
	/**
	 * @param officerId the officerId to set
	 */
	public void setOfficerId(String officerId) {
		this.officerId = officerId;
	}
	/**
	 * @return the imageId
	 */
	public String getImageId() {
		return imageId;
	}
	/**
	 * @param imageId the imageId to set
	 */
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	/**
	 * @return the gunDate
	 */
	public LocalDate getGunDate() {
		return gunDate;
	}
	/**
	 * @param gunDate the gunDate to set
	 */
	public void setGunDate(LocalDate gunDate) {
		this.gunDate = gunDate;
	}
	/**
	 * @return the gunTime
	 */
	public String getGunTime() {
		return gunTime;
	}
	/**
	 * @param gunTime the gunTime to set
	 */
	public void setGunTime(String gunTime) {
		this.gunTime = gunTime;
	}
	/**
	 * @return the speedZone
	 */
	public String getSpeedZone() {
		return speedZone;
	}
	/**
	 * @param speedZone the speedZone to set
	 */
	public void setSpeedZone(String speedZone) {
		this.speedZone = speedZone;
	}
	/**
	 * @return the speed
	 */
	public String getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	/**
	 * @return the distance
	 */
	public String getDistance() {
		return distance;
	}
	/**
	 * @param distance the distance to set
	 */
	public void setDistance(String distance) {
		this.distance = distance;
	}
	/**
	 * @return the registrationNo
	 */
	public String getRegistrationNo() {
		return registrationNo;
	}
	/**
	 * @param registrationNo the registrationNo to set
	 */
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	/**
	 * @return the dlNo
	 */
	public String getDlNo() {
		return dlNo;
	}
	/**
	 * @param dlNo the dlNo to set
	 */
	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}
	/**
	 * @return the driverName
	 */
	public String getDriverName() {
		return driverName;
	}
	/**
	 * @param driverName the driverName to set
	 */
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	/**
	 * @return the lattitude
	 */
	public String getLattitude() {
		return lattitude;
	}
	/**
	 * @param lattitude the lattitude to set
	 */
	public void setLattitude(String lattitude) {
		this.lattitude = lattitude;
	}
	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	/**
	 * @return the laserSlno
	 */
	public String getLaserSlno() {
		return laserSlno;
	}
	/**
	 * @param laserSlno the laserSlno to set
	 */
	public void setLaserSlno(String laserSlno) {
		this.laserSlno = laserSlno;
	}
	/**
	 * @return the vehicleImage
	 */
	public String getVehicleImage() {
		return vehicleImage;
	}
	/**
	 * @param vehicleImage the vehicleImage to set
	 */
	public void setVehicleImage(String vehicleImage) {
		this.vehicleImage = vehicleImage;
	}
	/**
	 * @return the otherOffense
	 */
	public String getOtherOffense() {
		return otherOffense;
	}
	/**
	 * @param otherOffense the otherOffense to set
	 */
	public void setOtherOffense(String otherOffense) {
		this.otherOffense = otherOffense;
	}
	/**
	 * @return the flag
	 */
	public String getFlag() {
		return flag;
	}
	/**
	 * @param flag the flag to set
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}
	/**
	 * @return the crtdDt
	 */
	public LocalDateTime getCrtdDt() {
		return crtdDt;
	}
	/**
	 * @param crtdDt the crtdDt to set
	 */
	public void setCrtdDt(LocalDateTime crtdDt) {
		this.crtdDt = crtdDt;
	}
	/**
	 * @return the vcrNo
	 */
	public String getVcrNo() {
		return vcrNo;
	}
	/**
	 * @param vcrNo the vcrNo to set
	 */
	public void setVcrNo(String vcrNo) {
		this.vcrNo = vcrNo;
	}
	/**
	 * @return the vcrGenDt
	 */
	public LocalDateTime getVcrGenDt() {
		return vcrGenDt;
	}
	/**
	 * @param vcrGenDt the vcrGenDt to set
	 */
	public void setVcrGenDt(LocalDateTime vcrGenDt) {
		this.vcrGenDt = vcrGenDt;
	}
	/**
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}
	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	/**
	 * @return the smsFlag
	 */
	public String getSmsFlag() {
		return smsFlag;
	}
	/**
	 * @param smsFlag the smsFlag to set
	 */
	public void setSmsFlag(String smsFlag) {
		this.smsFlag = smsFlag;
	}
	/**
	 * @return the smsSendDt
	 */
	public LocalDateTime getSmsSendDt() {
		return smsSendDt;
	}
	/**
	 * @param smsSendDt the smsSendDt to set
	 */
	public void setSmsSendDt(LocalDateTime smsSendDt) {
		this.smsSendDt = smsSendDt;
	}
	/**
	 * @return the vcrgenSmsDt
	 */
	public String getVcrgenSmsDt() {
		return vcrgenSmsDt;
	}
	/**
	 * @param vcrgenSmsDt the vcrgenSmsDt to set
	 */
	public void setVcrgenSmsDt(String vcrgenSmsDt) {
		this.vcrgenSmsDt = vcrgenSmsDt;
	}
	/**
	 * @return the vcrgenSmsFlag
	 */
	public String getVcrgenSmsFlag() {
		return vcrgenSmsFlag;
	}
	/**
	 * @param vcrgenSmsFlag the vcrgenSmsFlag to set
	 */
	public void setVcrgenSmsFlag(String vcrgenSmsFlag) {
		this.vcrgenSmsFlag = vcrgenSmsFlag;
	}
	/**
	 * @return the overspeedOffences
	 */
	public String getOverspeedOffences() {
		return overspeedOffences;
	}
	/**
	 * @param overspeedOffences the overspeedOffences to set
	 */
	public void setOverspeedOffences(String overspeedOffences) {
		this.overspeedOffences = overspeedOffences;
	}
	/**
	 * @return the printFlag
	 */
	public String getPrintFlag() {
		return printFlag;
	}
	/**
	 * @param printFlag the printFlag to set
	 */
	public void setPrintFlag(String printFlag) {
		this.printFlag = printFlag;
	}
	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
