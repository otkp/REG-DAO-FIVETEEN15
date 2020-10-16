package org.epragati.common.dto.aadhaar.seed;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Id;

import org.epragati.aadhaar.AadharDetailsResponseVO;
import org.epragati.aadhaarseeding.vo.AahaarSeedMatchVO;
import org.epragati.constants.OwnerTypeEnum;
import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.master.dto.ActionDetailsDTO;
import org.epragati.master.dto.ApplicantAddressDTO;
import org.epragati.util.Status;
import org.epragati.util.document.KeyValue;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author pbattula
 *
 */

@Document(collection = "reg_aadhaar_seeding")
@CompoundIndexes({
		@CompoundIndex(name = "primary_reg_aadhaar_seed_idx", def = "{'prNo': 1, 'issuedOfficeCode': 1, 'dob':1}") })
public class AadhaarSeedDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String issuedOfficeCode;
	private Status.AadhaarSeedStatus status;
	private String prNo;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	private String mobileNo;
	private String email;
	private String aadharNo;
	private AadharDetailsResponseVO aadharResponse;
	private List<ActionDetailsDTO> actionDetails;
	private ActionDetailsDTO lockedDetails;
	private List<ActionDetailsDTO> lockedDetailsLog;

	private List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures;
	private String matchCode;
	private String approvalStage;

	private LocalDateTime createdDate;
	
	
	private Boolean lock;
	private String userId;
	
	private ApplicantAddressDTO applicantAddressDTO;
	
	private String vehicleType;
	
	private String classOfVehicle;
	
	private OwnerTypeEnum ownerShipType;
	
	
	private Integer currentIndex;
	
	
	private Integer iterationCount;
	
	private String aadharNoRTO;
	private AadharDetailsResponseVO aadharResponseRTO;
	private String aadharNoAO;
	private AadharDetailsResponseVO aadharResponseAO;
	
	private List<AahaarSeedMatchVO> matchedDetails;

	public List<AahaarSeedMatchVO> getMatchedDetails() {
		return matchedDetails;
	}

	public void setMatchedDetails(List<AahaarSeedMatchVO> matchedDetails) {
		this.matchedDetails = matchedDetails;
	}

	public Boolean getLock() {
		return lock;
	}

	public void setLock(Boolean lock) {
		this.lock = lock;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}


	public Integer getIterationCount() {
		return iterationCount;
	}

	public void setIterationCount(Integer iterationCount) {
		this.iterationCount = iterationCount;
	}

	public Integer getCurrentIndex() {
		return currentIndex;
	}

	public void setCurrentIndex(Integer currentIndex) {
		this.currentIndex = currentIndex;
	}

	/**
	 * @return the classOfVehicle
	 */
	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	/**
	 * @param classOfVehicle the classOfVehicle to set
	 */
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	/**
	 * @return the vehicleType
	 */
	public String getVehicleType() {
		return vehicleType;
	}

	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
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
	 * @return the issuedOfficeCode
	 */
	public String getIssuedOfficeCode() {
		return issuedOfficeCode;
	}

	/**
	 * @param issuedOfficeCode
	 *            the issuedOfficeCode to set
	 */
	public void setIssuedOfficeCode(String issuedOfficeCode) {
		this.issuedOfficeCode = issuedOfficeCode;
	}

	/**
	 * @return the status
	 */
	public Status.AadhaarSeedStatus getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Status.AadhaarSeedStatus status) {
		this.status = status;
	}

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	/**
	 * @return the dob
	 */
	public LocalDate getDob() {
		return dob;
	}

	/**
	 * @param dob
	 *            the dob to set
	 */
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	/**
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}

	/**
	 * @param mobileNo
	 *            the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the aadharNo
	 */
	public String getAadharNo() {
		return aadharNo;
	}

	/**
	 * @return the aadharNoRTO
	 */
	public String getAadharNoRTO() {
		return aadharNoRTO;
	}

	/**
	 * @param aadharNoRTO the aadharNoRTO to set
	 */
	public void setAadharNoRTO(String aadharNoRTO) {
		this.aadharNoRTO = aadharNoRTO;
	}

	/**
	 * @return the aadharResponseRTO
	 */
	public AadharDetailsResponseVO getAadharResponseRTO() {
		return aadharResponseRTO;
	}

	/**
	 * @param aadharResponseRTO the aadharResponseRTO to set
	 */
	public void setAadharResponseRTO(AadharDetailsResponseVO aadharResponseRTO) {
		this.aadharResponseRTO = aadharResponseRTO;
	}

	/**
	 * @param aadharNo
	 *            the aadharNo to set
	 */
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}


	/**
	 * @return the aadharResponse
	 */
	public AadharDetailsResponseVO getAadharResponse() {
		return aadharResponse;
	}

	/**
	 * @param aadharResponse the aadharResponse to set
	 */
	public void setAadharResponse(AadharDetailsResponseVO aadharResponse) {
		this.aadharResponse = aadharResponse;
	}

	/**
	 * @return the actionDetails
	 */
	public List<ActionDetailsDTO> getActionDetails() {
		return actionDetails;
	}

	/**
	 * @param actionDetails
	 *            the actionDetails to set
	 */
	public void setActionDetails(List<ActionDetailsDTO> actionDetails) {
		this.actionDetails = actionDetails;
	}

	/**
	 * @return the lockedDetails
	 */
	public ActionDetailsDTO getLockedDetails() {
		return lockedDetails;
	}

	/**
	 * @param lockedDetails
	 *            the lockedDetails to set
	 */
	public void setLockedDetails(ActionDetailsDTO lockedDetails) {
		this.lockedDetails = lockedDetails;
	}

	/**
	 * @return the lockedDetailsLog
	 */
	public List<ActionDetailsDTO> getLockedDetailsLog() {
		return lockedDetailsLog;
	}

	/**
	 * @param lockedDetailsLog
	 *            the lockedDetailsLog to set
	 */
	public void setLockedDetailsLog(List<ActionDetailsDTO> lockedDetailsLog) {
		this.lockedDetailsLog = lockedDetailsLog;
	}

	/**
	 * @return the enclosures
	 */
	public List<KeyValue<String, List<ImageEnclosureDTO>>> getEnclosures() {
		return enclosures;
	}

	/**
	 * @param enclosures
	 *            the enclosures to set
	 */
	public void setEnclosures(List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures) {
		this.enclosures = enclosures;
	}

	/**
	 * @return the matchCode
	 */
	public String getMatchCode() {
		return matchCode;
	}

	/**
	 * @param matchCode
	 *            the matchCode to set
	 */
	public void setMatchCode(String matchCode) {
		this.matchCode = matchCode;
	}

	/**
	 * @return the approvalStage
	 */
	public String getApprovalStage() {
		return approvalStage;
	}

	/**
	 * @param approvalStage
	 *            the approvalStage to set
	 */
	public void setApprovalStage(String approvalStage) {
		this.approvalStage = approvalStage;
	}

	/**
	 * @return the createdDate
	 */
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	
	

	/**
	 * @return the applicantAddressDTO
	 */
	public ApplicantAddressDTO getApplicantAddressDTO() {
		return applicantAddressDTO;
	}

	/**
	 * @param applicantAddressDTO the applicantAddressDTO to set
	 */
	public void setApplicantAddressDTO(ApplicantAddressDTO applicantAddressDTO) {
		this.applicantAddressDTO = applicantAddressDTO;
	}

	/**
	 * @return the ownerShipType
	 */
	public OwnerTypeEnum getOwnerShipType() {
		return ownerShipType;
	}

	/**
	 * @param ownerShipType the ownerShipType to set
	 */
	public void setOwnerShipType(OwnerTypeEnum ownerShipType) {
		this.ownerShipType = ownerShipType;
	}

	/**
	 * @return the aadharNoAO
	 */
	public String getAadharNoAO() {
		return aadharNoAO;
	}

	/**
	 * @param aadharNoAO the aadharNoAO to set
	 */
	public void setAadharNoAO(String aadharNoAO) {
		this.aadharNoAO = aadharNoAO;
	}

	/**
	 * @return the aadharResponseAO
	 */
	public AadharDetailsResponseVO getAadharResponseAO() {
		return aadharResponseAO;
	}

	/**
	 * @param aadharResponseAO the aadharResponseAO to set
	 */
	public void setAadharResponseAO(AadharDetailsResponseVO aadharResponseAO) {
		this.aadharResponseAO = aadharResponseAO;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AadhaarSeedDTO [id=" + id + ", issuedOfficeCode=" + issuedOfficeCode + ", status=" + status + ", prNo="
				+ prNo + ", dob=" + dob + ", mobileNo=" + mobileNo + ", email=" + email + ", aadharNo=" + aadharNo
				+ ", aadharResponse=" + aadharResponse + ", actionDetails=" + actionDetails + ", lockedDetails="
				+ lockedDetails + ", lockedDetailsLog=" + lockedDetailsLog + ", enclosures=" + enclosures
				+ ", matchCode=" + matchCode + ", approvalStage=" + approvalStage + ", createdDate=" + createdDate
				+ ",  applicantAddressDTO=" + applicantAddressDTO
				+ ", vehicleType=" + vehicleType + ", classOfVehicle=" + classOfVehicle + ", ownerShipType="
				+ ownerShipType + ",]";
	}


}
