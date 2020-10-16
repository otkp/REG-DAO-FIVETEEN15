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
@Document(collection = "stagging_tr_details")
public class StaggingTrDetailsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	private Integer tdid;
	private Integer rid;
	private String chassisNo;
	private String engineNo;
	private String code;
	private Integer vmid;
	private Integer mmid;
	private Integer vahanId;
	private String aadharNo;
	private String applicantFname;
	private String applicantLastName;
	private String applicantFhName;
	private boolean sameAsAddar;
	private String tempDoorNo;
	private String tempStreet;
	private Integer tempManalId;
	private Integer tempDistId;
	private Integer tempVillageId;
	private String tempCity;
	private String tempPin;
	private String tempState;
	private String tempCountry;
	private String perDoorNo;
	private String perStreet; 
	private Integer perManalId;
	private Integer perDistId;
	private String perCity;
	private String perCountry;
	private String perPin;
	private String insurnaceName;
	private String insuranceType;
	private LocalDateTime insuranceValidFrom;
	private LocalDateTime insureanceValidTo;
	private boolean isDisabled;
	private String gender;
	private String mobile;
	private String altMobile;
	private String emailId;
	private String alteMailId;
	private String finId;
	private Integer processId;
	private Integer procesStatus;
	private LocalDateTime createdDate;
	private LocalDateTime lUpdate;
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
	 * @return the tdid
	 */
	public Integer getTdid() {
		return tdid;
	}
	/**
	 * @param tdid the tdid to set
	 */
	public void setTdid(Integer tdid) {
		this.tdid = tdid;
	}
	/**
	 * @return the rid
	 */
	public Integer getRid() {
		return rid;
	}
	/**
	 * @param rid the rid to set
	 */
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	/**
	 * @return the chassisNo
	 */
	public String getChassisNo() {
		return chassisNo;
	}
	/**
	 * @param chassisNo the chassisNo to set
	 */
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}
	/**
	 * @return the engineNo
	 */
	public String getEngineNo() {
		return engineNo;
	}
	/**
	 * @param engineNo the engineNo to set
	 */
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the vmid
	 */
	public Integer getVmid() {
		return vmid;
	}
	/**
	 * @param vmid the vmid to set
	 */
	public void setVmid(Integer vmid) {
		this.vmid = vmid;
	}
	/**
	 * @return the mmid
	 */
	public Integer getMmid() {
		return mmid;
	}
	/**
	 * @param mmid the mmid to set
	 */
	public void setMmid(Integer mmid) {
		this.mmid = mmid;
	}
	/**
	 * @return the vahanId
	 */
	public Integer getVahanId() {
		return vahanId;
	}
	/**
	 * @param vahanId the vahanId to set
	 */
	public void setVahanId(Integer vahanId) {
		this.vahanId = vahanId;
	}
	/**
	 * @return the aadharNo
	 */
	public String getAadharNo() {
		return aadharNo;
	}
	/**
	 * @param aadharNo the aadharNo to set
	 */
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	/**
	 * @return the applicantFname
	 */
	public String getApplicantFname() {
		return applicantFname;
	}
	/**
	 * @param applicantFname the applicantFname to set
	 */
	public void setApplicantFname(String applicantFname) {
		this.applicantFname = applicantFname;
	}
	/**
	 * @return the applicantLastName
	 */
	public String getApplicantLastName() {
		return applicantLastName;
	}
	/**
	 * @param applicantLastName the applicantLastName to set
	 */
	public void setApplicantLastName(String applicantLastName) {
		this.applicantLastName = applicantLastName;
	}
	/**
	 * @return the applicantFhName
	 */
	public String getApplicantFhName() {
		return applicantFhName;
	}
	/**
	 * @param applicantFhName the applicantFhName to set
	 */
	public void setApplicantFhName(String applicantFhName) {
		this.applicantFhName = applicantFhName;
	}
	/**
	 * @return the sameAsAddar
	 */
	public boolean isSameAsAddar() {
		return sameAsAddar;
	}
	/**
	 * @param sameAsAddar the sameAsAddar to set
	 */
	public void setSameAsAddar(boolean sameAsAddar) {
		this.sameAsAddar = sameAsAddar;
	}
	/**
	 * @return the tempDoorNo
	 */
	public String getTempDoorNo() {
		return tempDoorNo;
	}
	/**
	 * @param tempDoorNo the tempDoorNo to set
	 */
	public void setTempDoorNo(String tempDoorNo) {
		this.tempDoorNo = tempDoorNo;
	}
	/**
	 * @return the tempStreet
	 */
	public String getTempStreet() {
		return tempStreet;
	}
	/**
	 * @param tempStreet the tempStreet to set
	 */
	public void setTempStreet(String tempStreet) {
		this.tempStreet = tempStreet;
	}
	/**
	 * @return the tempManalId
	 */
	public Integer getTempManalId() {
		return tempManalId;
	}
	/**
	 * @param tempManalId the tempManalId to set
	 */
	public void setTempManalId(Integer tempManalId) {
		this.tempManalId = tempManalId;
	}
	/**
	 * @return the tempDistId
	 */
	public Integer getTempDistId() {
		return tempDistId;
	}
	/**
	 * @param tempDistId the tempDistId to set
	 */
	public void setTempDistId(Integer tempDistId) {
		this.tempDistId = tempDistId;
	}
	/**
	 * @return the tempVillageId
	 */
	public Integer getTempVillageId() {
		return tempVillageId;
	}
	/**
	 * @param tempVillageId the tempVillageId to set
	 */
	public void setTempVillageId(Integer tempVillageId) {
		this.tempVillageId = tempVillageId;
	}
	/**
	 * @return the tempCity
	 */
	public String getTempCity() {
		return tempCity;
	}
	/**
	 * @param tempCity the tempCity to set
	 */
	public void setTempCity(String tempCity) {
		this.tempCity = tempCity;
	}
	/**
	 * @return the tempPin
	 */
	public String getTempPin() {
		return tempPin;
	}
	/**
	 * @param tempPin the tempPin to set
	 */
	public void setTempPin(String tempPin) {
		this.tempPin = tempPin;
	}
	/**
	 * @return the tempState
	 */
	public String getTempState() {
		return tempState;
	}
	/**
	 * @param tempState the tempState to set
	 */
	public void setTempState(String tempState) {
		this.tempState = tempState;
	}
	/**
	 * @return the tempCountry
	 */
	public String getTempCountry() {
		return tempCountry;
	}
	/**
	 * @param tempCountry the tempCountry to set
	 */
	public void setTempCountry(String tempCountry) {
		this.tempCountry = tempCountry;
	}
	/**
	 * @return the perDoorNo
	 */
	public String getPerDoorNo() {
		return perDoorNo;
	}
	/**
	 * @param perDoorNo the perDoorNo to set
	 */
	public void setPerDoorNo(String perDoorNo) {
		this.perDoorNo = perDoorNo;
	}
	/**
	 * @return the perStreet
	 */
	public String getPerStreet() {
		return perStreet;
	}
	/**
	 * @param perStreet the perStreet to set
	 */
	public void setPerStreet(String perStreet) {
		this.perStreet = perStreet;
	}
	/**
	 * @return the perManalId
	 */
	public Integer getPerManalId() {
		return perManalId;
	}
	/**
	 * @param perManalId the perManalId to set
	 */
	public void setPerManalId(Integer perManalId) {
		this.perManalId = perManalId;
	}
	/**
	 * @return the perDistId
	 */
	public Integer getPerDistId() {
		return perDistId;
	}
	/**
	 * @param perDistId the perDistId to set
	 */
	public void setPerDistId(Integer perDistId) {
		this.perDistId = perDistId;
	}
	/**
	 * @return the perCity
	 */
	public String getPerCity() {
		return perCity;
	}
	/**
	 * @param perCity the perCity to set
	 */
	public void setPerCity(String perCity) {
		this.perCity = perCity;
	}
	/**
	 * @return the perCountry
	 */
	public String getPerCountry() {
		return perCountry;
	}
	/**
	 * @param perCountry the perCountry to set
	 */
	public void setPerCountry(String perCountry) {
		this.perCountry = perCountry;
	}
	/**
	 * @return the perPin
	 */
	public String getPerPin() {
		return perPin;
	}
	/**
	 * @param perPin the perPin to set
	 */
	public void setPerPin(String perPin) {
		this.perPin = perPin;
	}
	/**
	 * @return the insurnaceName
	 */
	public String getInsurnaceName() {
		return insurnaceName;
	}
	/**
	 * @param insurnaceName the insurnaceName to set
	 */
	public void setInsurnaceName(String insurnaceName) {
		this.insurnaceName = insurnaceName;
	}
	/**
	 * @return the insuranceType
	 */
	public String getInsuranceType() {
		return insuranceType;
	}
	/**
	 * @param insuranceType the insuranceType to set
	 */
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	/**
	 * @return the insuranceValidFrom
	 */
	public LocalDateTime getInsuranceValidFrom() {
		return insuranceValidFrom;
	}
	/**
	 * @param insuranceValidFrom the insuranceValidFrom to set
	 */
	public void setInsuranceValidFrom(LocalDateTime insuranceValidFrom) {
		this.insuranceValidFrom = insuranceValidFrom;
	}
	/**
	 * @return the insureanceValidTo
	 */
	public LocalDateTime getInsureanceValidTo() {
		return insureanceValidTo;
	}
	/**
	 * @param insureanceValidTo the insureanceValidTo to set
	 */
	public void setInsureanceValidTo(LocalDateTime insureanceValidTo) {
		this.insureanceValidTo = insureanceValidTo;
	}
	/**
	 * @return the isDisabled
	 */
	public boolean isDisabled() {
		return isDisabled;
	}
	/**
	 * @param isDisabled the isDisabled to set
	 */
	public void setDisabled(boolean isDisabled) {
		this.isDisabled = isDisabled;
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
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the altMobile
	 */
	public String getAltMobile() {
		return altMobile;
	}
	/**
	 * @param altMobile the altMobile to set
	 */
	public void setAltMobile(String altMobile) {
		this.altMobile = altMobile;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the alteMailId
	 */
	public String getAlteMailId() {
		return alteMailId;
	}
	/**
	 * @param alteMailId the alteMailId to set
	 */
	public void setAlteMailId(String alteMailId) {
		this.alteMailId = alteMailId;
	}
	/**
	 * @return the finId
	 */
	public String getFinId() {
		return finId;
	}
	/**
	 * @param finId the finId to set
	 */
	public void setFinId(String finId) {
		this.finId = finId;
	}
	/**
	 * @return the processId
	 */
	public Integer getProcessId() {
		return processId;
	}
	/**
	 * @param processId the processId to set
	 */
	public void setProcessId(Integer processId) {
		this.processId = processId;
	}
	/**
	 * @return the procesStatus
	 */
	public Integer getProcesStatus() {
		return procesStatus;
	}
	/**
	 * @param procesStatus the procesStatus to set
	 */
	public void setProcesStatus(Integer procesStatus) {
		this.procesStatus = procesStatus;
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
	 * @return the lUpdate
	 */
	public LocalDateTime getlUpdate() {
		return lUpdate;
	}
	/**
	 * @param lUpdate the lUpdate to set
	 */
	public void setlUpdate(LocalDateTime lUpdate) {
		this.lUpdate = lUpdate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StaggingTrDetailsDTO [id=" + id + ", tdid=" + tdid + ", rid=" + rid + ", chassisNo=" + chassisNo
				+ ", engineNo=" + engineNo + ", code=" + code + ", vmid=" + vmid + ", mmid=" + mmid + ", vahanId="
				+ vahanId + ", aadharNo=" + aadharNo + ", applicantFname=" + applicantFname + ", applicantLastName="
				+ applicantLastName + ", applicantFhName=" + applicantFhName + ", sameAsAddar=" + sameAsAddar
				+ ", tempDoorNo=" + tempDoorNo + ", tempStreet=" + tempStreet + ", tempManalId=" + tempManalId
				+ ", tempDistId=" + tempDistId + ", tempVillageId=" + tempVillageId + ", tempCity=" + tempCity
				+ ", tempPin=" + tempPin + ", tempState=" + tempState + ", tempCountry=" + tempCountry + ", perDoorNo="
				+ perDoorNo + ", perStreet=" + perStreet + ", perManalId=" + perManalId + ", perDistId=" + perDistId
				+ ", perCity=" + perCity + ", perCountry=" + perCountry + ", perPin=" + perPin + ", insurnaceName="
				+ insurnaceName + ", insuranceType=" + insuranceType + ", insuranceValidFrom=" + insuranceValidFrom
				+ ", insureanceValidTo=" + insureanceValidTo + ", isDisabled=" + isDisabled + ", gender=" + gender
				+ ", mobile=" + mobile + ", altMobile=" + altMobile + ", emailId=" + emailId + ", alteMailId="
				+ alteMailId + ", finId=" + finId + ", processId=" + processId + ", procesStatus=" + procesStatus
				+ ", createdDate=" + createdDate + ", lUpdate=" + lUpdate + "]";
	}

}
