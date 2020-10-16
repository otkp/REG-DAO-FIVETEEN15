package org.epragati.master.dto;

import java.io.Serializable;
import java.util.UUID;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "aadhaar_details")
/*
 * @CompoundIndexes({
 * 
 * @CompoundIndex(name = "uuId", def = "{'uuId': 1}") })
 */
public class AadhaarDetailsResponseDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	@JsonProperty("KSA_KUA_Txn")
	private String KSA_KUA_Txn;
	private String auth_err_code;
	private String auth_date;
	private String auth_status;
	private String auth_transaction_code;
	private String base64file;
	private String co;
	private String district;
	private String district_name;
	private String dob;
	private String gender;
	private String house;
	private String lc;
	private String mandal;
	private String mandal_name;
	private String name;
	private String pincode;
	private String po;
	private String statecode;
	private String street;
	private String subdist;
	// @Indexed(name = "uid")
	private Long uid;
	private String village;
	private String village_name;
	private String vtc;
	private boolean isInsideAP;
	private boolean isStateMatched;
	private boolean isDistrictMatched;
	private boolean isMandalMatched;
	private String stateMatchedCode;
	private String districtMatchedCode;
	private String mandalMatchedCode;
	private Integer age;
	private String applicationNumber;
	private String firstName;
	private String lastName;
	private String nationality;
	private String doorNo;
	private String country;
	private String phone;
	private String deviceNumber;

	private String uidToken;
	
	private String auth_reason;
	private String rrn;
	private String phoneNumber;
	private String srdhwstxn;
	private String landmark;
//	private String ksa_KUA_Txn;
	private String buildingName;
	private String uidaieKYCTxn;
	private String eid;
	private String careof;
	
	private String email;
	private String auth_Status;
	private String orgnlAuth_ErrorCode;
	private String orgnlAuth_Status;

	/**
	 * @return the deviceNumber
	 */
	public String getDeviceNumber() {
		return deviceNumber;
	}

	/**
	 * @param deviceNumber the deviceNumber to set
	 */
	public void setDeviceNumber(String deviceNumber) {
		this.deviceNumber = deviceNumber;
	}

	// @Indexed(name = "uuId")
	private UUID uuId;

	public String getKSA_KUA_Txn() {
		return KSA_KUA_Txn;
	}

	public void setKSA_KUA_Txn(String kSA_KUA_Txn) {
		KSA_KUA_Txn = kSA_KUA_Txn;
	}

	public String getAuth_err_code() {
		return auth_err_code;
	}

	public void setAuth_err_code(String auth_err_code) {
		this.auth_err_code = auth_err_code;
	}

	public String getAuth_date() {
		return auth_date;
	}

	public void setAuth_date(String auth_date) {
		this.auth_date = auth_date;
	}

	public String getAuth_status() {
		return auth_status;
	}

	public void setAuth_status(String auth_status) {
		this.auth_status = auth_status;
	}

	public String getAuth_transaction_code() {
		return auth_transaction_code;
	}

	public void setAuth_transaction_code(String auth_transaction_code) {
		this.auth_transaction_code = auth_transaction_code;
	}

	public String getBase64file() {
		return base64file;
	}

	public void setBase64file(String base64file) {
		this.base64file = base64file;
	}

	public String getCo() {
		return co;
	}

	public void setCo(String co) {
		this.co = co;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDistrict_name() {
		return district_name;
	}

	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getLc() {
		return lc;
	}

	public void setLc(String lc) {
		this.lc = lc;
	}

	public String getMandal() {
		return mandal;
	}

	public void setMandal(String mandal) {
		this.mandal = mandal;
	}

	public String getMandal_name() {
		return mandal_name;
	}

	public void setMandal_name(String mandal_name) {
		this.mandal_name = mandal_name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPo() {
		return po;
	}

	public void setPo(String po) {
		this.po = po;
	}

	public String getStatecode() {
		return statecode;
	}

	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getSubdist() {
		return subdist;
	}

	public void setSubdist(String subdist) {
		this.subdist = subdist;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getVillage_name() {
		return village_name;
	}

	public void setVillage_name(String village_name) {
		this.village_name = village_name;
	}

	public String getVtc() {
		return vtc;
	}

	public void setVtc(String vtc) {
		this.vtc = vtc;
	}

	public boolean isInsideAP() {
		return isInsideAP;
	}

	public void setInsideAP(boolean isInsideAP) {
		this.isInsideAP = isInsideAP;
	}

	public boolean isStateMatched() {
		return isStateMatched;
	}

	public void setStateMatched(boolean isStateMatched) {
		this.isStateMatched = isStateMatched;
	}

	public boolean isDistrictMatched() {
		return isDistrictMatched;
	}

	public void setDistrictMatched(boolean isDistrictMatched) {
		this.isDistrictMatched = isDistrictMatched;
	}

	public boolean isMandalMatched() {
		return isMandalMatched;
	}

	public void setMandalMatched(boolean isMandalMatched) {
		this.isMandalMatched = isMandalMatched;
	}

	public String getStateMatchedCode() {
		return stateMatchedCode;
	}

	public void setStateMatchedCode(String stateMatchedCode) {
		this.stateMatchedCode = stateMatchedCode;
	}

	public String getDistrictMatchedCode() {
		return districtMatchedCode;
	}

	public void setDistrictMatchedCode(String districtMatchedCode) {
		this.districtMatchedCode = districtMatchedCode;
	}

	public String getMandalMatchedCode() {
		return mandalMatchedCode;
	}

	public void setMandalMatchedCode(String mandalMatchedCode) {
		this.mandalMatchedCode = mandalMatchedCode;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the uuId
	 */
	public UUID getUuId() {
		return uuId;
	}

	/**
	 * @param uuId the uuId to set
	 */
	public void setUuId(UUID uuId) {
		this.uuId = uuId;
	}

	public String getUidToken() {
		return uidToken;
	}

	public void setUidToken(String uidToken) {
		this.uidToken = uidToken;
	}

	public String getAuth_reason() {
		return auth_reason;
	}

	public void setAuth_reason(String auth_reason) {
		this.auth_reason = auth_reason;
	}

	public String getRrn() {
		return rrn;
	}

	public void setRrn(String rrn) {
		this.rrn = rrn;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSrdhwstxn() {
		return srdhwstxn;
	}

	public void setSrdhwstxn(String srdhwstxn) {
		this.srdhwstxn = srdhwstxn;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getUidaieKYCTxn() {
		return uidaieKYCTxn;
	}

	public void setUidaieKYCTxn(String uidaieKYCTxn) {
		this.uidaieKYCTxn = uidaieKYCTxn;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getCareof() {
		return careof;
	}

	public void setCareof(String careof) {
		this.careof = careof;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAuth_Status() {
		return auth_Status;
	}

	public void setAuth_Status(String auth_Status) {
		this.auth_Status = auth_Status;
	}

	public String getOrgnlAuth_ErrorCode() {
		return orgnlAuth_ErrorCode;
	}

	public void setOrgnlAuth_ErrorCode(String orgnlAuth_ErrorCode) {
		this.orgnlAuth_ErrorCode = orgnlAuth_ErrorCode;
	}

	public String getOrgnlAuth_Status() {
		return orgnlAuth_Status;
	}

	public void setOrgnlAuth_Status(String orgnlAuth_Status) {
		this.orgnlAuth_Status = orgnlAuth_Status;
	}
	
	

}
