package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;


/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection="aadhaar_master")
public class AadhaarMasterDTO implements Serializable {

	
	
	@Id
	private String id;
	
	private Integer amId;
	private Integer amAlId;
	private String ksaKuaTxn;
	private String authDate;
	private String authStatus;
	private String authtransactionCode;
	private String base64File;
	private String fatherName;
	private String district;
	private String districtName;
	private String dateOfBirth;
	private String gender;
	private String house;
	private String lc;
	private String mandal;
	private String mandalName;
	private String name;
	private String pinCode;
	private String po;
	private String stateCode;
	private String street;
	private String subDist;
	private Long uId;
	private String village;
	private String villageName;
	private String vtc;
	private LocalDateTime createdDate;
	private LocalDateTime lupdate;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the amId
	 */
	public Integer getAmId() {
		return amId;
	}
	/**
	 * @param amId the amId to set
	 */
	public void setAmId(Integer amId) {
		this.amId = amId;
	}
	/**
	 * @return the amAlId
	 */
	public Integer getAmAlId() {
		return amAlId;
	}
	/**
	 * @param amAlId the amAlId to set
	 */
	public void setAmAlId(Integer amAlId) {
		this.amAlId = amAlId;
	}
	/**
	 * @return the ksaKuaTxn
	 */
	public String getKsaKuaTxn() {
		return ksaKuaTxn;
	}
	/**
	 * @param ksaKuaTxn the ksaKuaTxn to set
	 */
	public void setKsaKuaTxn(String ksaKuaTxn) {
		this.ksaKuaTxn = ksaKuaTxn;
	}
	/**
	 * @return the authDate
	 */
	public String getAuthDate() {
		return authDate;
	}
	/**
	 * @param authDate the authDate to set
	 */
	public void setAuthDate(String authDate) {
		this.authDate = authDate;
	}
	/**
	 * @return the authStatus
	 */
	public String getAuthStatus() {
		return authStatus;
	}
	/**
	 * @param authStatus the authStatus to set
	 */
	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}
	/**
	 * @return the authtransactionCode
	 */
	public String getAuthtransactionCode() {
		return authtransactionCode;
	}
	/**
	 * @param authtransactionCode the authtransactionCode to set
	 */
	public void setAuthtransactionCode(String authtransactionCode) {
		this.authtransactionCode = authtransactionCode;
	}
	/**
	 * @return the base64File
	 */
	public String getBase64File() {
		return base64File;
	}
	/**
	 * @param base64File the base64File to set
	 */
	public void setBase64File(String base64File) {
		this.base64File = base64File;
	}
	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return fatherName;
	}
	/**
	 * @param fatherName the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}
	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}
	/**
	 * @return the districtName
	 */
	public String getDistrictName() {
		return districtName;
	}
	/**
	 * @param districtName the districtName to set
	 */
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the house
	 */
	public String getHouse() {
		return house;
	}
	/**
	 * @param house the house to set
	 */
	public void setHouse(String house) {
		this.house = house;
	}
	/**
	 * @return the lc
	 */
	public String getLc() {
		return lc;
	}
	/**
	 * @param lc the lc to set
	 */
	public void setLc(String lc) {
		this.lc = lc;
	}
	/**
	 * @return the mandal
	 */
	public String getMandal() {
		return mandal;
	}
	/**
	 * @param mandal the mandal to set
	 */
	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	/**
	 * @return the mandalName
	 */
	public String getMandalName() {
		return mandalName;
	}
	/**
	 * @param mandalName the mandalName to set
	 */
	public void setMandalName(String mandalName) {
		this.mandalName = mandalName;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the pinCode
	 */
	public String getPinCode() {
		return pinCode;
	}
	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	/**
	 * @return the po
	 */
	public String getPo() {
		return po;
	}
	/**
	 * @param po the po to set
	 */
	public void setPo(String po) {
		this.po = po;
	}
	/**
	 * @return the stateCode
	 */
	public String getStateCode() {
		return stateCode;
	}
	/**
	 * @param stateCode the stateCode to set
	 */
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the subDist
	 */
	public String getSubDist() {
		return subDist;
	}
	/**
	 * @param subDist the subDist to set
	 */
	public void setSubDist(String subDist) {
		this.subDist = subDist;
	}
	/**
	 * @return the uId
	 */
	public Long getuId() {
		return uId;
	}
	/**
	 * @param uId the uId to set
	 */
	public void setuId(Long uId) {
		this.uId = uId;
	}
	/**
	 * @return the village
	 */
	public String getVillage() {
		return village;
	}
	/**
	 * @param village the village to set
	 */
	public void setVillage(String village) {
		this.village = village;
	}
	/**
	 * @return the villageName
	 */
	public String getVillageName() {
		return villageName;
	}
	/**
	 * @param villageName the villageName to set
	 */
	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}
	/**
	 * @return the vtc
	 */
	public String getVtc() {
		return vtc;
	}
	/**
	 * @param vtc the vtc to set
	 */
	public void setVtc(String vtc) {
		this.vtc = vtc;
	}
	/**
	 * @return the createdDate
	 */
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the lupdate
	 */
	public LocalDateTime getLupdate() {
		return lupdate;
	}
	/**
	 * @param lupdate the lupdate to set
	 */
	public void setLupdate(LocalDateTime lupdate) {
		this.lupdate = lupdate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AadhaarMasterDTO [id=" + id + ", amId=" + amId + ", amAlId=" + amAlId + ", ksaKuaTxn=" + ksaKuaTxn
				+ ", authDate=" + authDate + ", authStatus=" + authStatus + ", authtransactionCode="
				+ authtransactionCode + ", base64File=" + base64File + ", fatherName=" + fatherName + ", district="
				+ district + ", districtName=" + districtName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender
				+ ", house=" + house + ", lc=" + lc + ", mandal=" + mandal + ", mandalName=" + mandalName + ", name="
				+ name + ", pinCode=" + pinCode + ", po=" + po + ", stateCode=" + stateCode + ", street=" + street
				+ ", subDist=" + subDist + ", uId=" + uId + ", village=" + village + ", villageName=" + villageName
				+ ", vtc=" + vtc + ", createdDate=" + createdDate + ", lupdate=" + lupdate + "]";
	}
}
