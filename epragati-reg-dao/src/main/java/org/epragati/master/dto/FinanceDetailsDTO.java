package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author sprusty
 *
 */
@Document(collection = "registration_finance_details")
public class FinanceDetailsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String prNo;

	private Set<Integer> serviceIds;

	private MasterFinanceTypeDTO financeType;

	private String applicationNo;

	private String token;

	private LocalDateTime tokenGeneratedTime;

	private AadhaarDetailsResponseDTO aadharResponse;

	private String financerName;

	private Double sanctionedAmount;

	private Integer intrest;

	private String status;

	private String userId;

	private String address;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate agreementDate;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime lastUpdated;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime createdDate;

	private Integer quotationValue;

	private ActionDetailsDTO actionDetailsDTO;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate agreementDateForOther;

	private DistrictDTO district;

	private StateDTO state;

	private MandalDTO mandal;

	private PostOfficeDTO pincode;

	private String streetName;

	private String city;

	private LocalDateTime terminateDate;

	private String comments;
	
	private String actionType;
	
	private String doorNumber;
	
	private String reqAuthType;

	public LocalDateTime getTerminateDate() {
		return terminateDate;
	}

	public void setTerminateDate(LocalDateTime terminateDate) {
		this.terminateDate = terminateDate;
	}

	public LocalDate getAgreementDateForOther() {
		return agreementDateForOther;
	}

	public void setAgreementDateForOther(LocalDate agreementDateForOther) {
		this.agreementDateForOther = agreementDateForOther;
	}

	public ActionDetailsDTO getActionDetailsDTO() {
		return actionDetailsDTO;
	}

	public void setActionDetailsDTO(ActionDetailsDTO actionDetailsDTO) {
		this.actionDetailsDTO = actionDetailsDTO;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getFinancerName() {
		return financerName;
	}

	public void setFinancerName(String financerName) {
		this.financerName = financerName;
	}

	public Double getSanctionedAmount() {
		return sanctionedAmount;
	}

	public void setSanctionedAmount(Double sanctionedAmount) {
		this.sanctionedAmount = sanctionedAmount;
	}

	public Integer getIntrest() {
		return intrest;
	}

	public void setIntrest(Integer intrest) {
		this.intrest = intrest;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AadhaarDetailsResponseDTO getAadharResponse() {
		return aadharResponse;
	}

	public void setAadharResponse(AadhaarDetailsResponseDTO aadharResponse) {
		this.aadharResponse = aadharResponse;
	}

	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public LocalDateTime getTokenGeneratedTime() {
		return tokenGeneratedTime;
	}

	public void setTokenGeneratedTime(LocalDateTime tokenGeneratedTime) {
		this.tokenGeneratedTime = tokenGeneratedTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the quotationValue
	 */
	public Integer getQuotationValue() {
		return quotationValue;
	}

	/**
	 * @param quotationValue
	 *            the quotationValue to set
	 */
	public void setQuotationValue(Integer quotationValue) {
		this.quotationValue = quotationValue;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the financeType
	 */
	public MasterFinanceTypeDTO getFinanceType() {
		return financeType;
	}

	/**
	 * @param financeType
	 *            the financeType to set
	 */
	public void setFinanceType(MasterFinanceTypeDTO financeType) {
		this.financeType = financeType;
	}

	/**
	 * @return the district
	 */
	public DistrictDTO getDistrict() {
		return district;
	}

	/**
	 * @param district
	 *            the district to set
	 */
	public void setDistrict(DistrictDTO district) {
		this.district = district;
	}

	/**
	 * @return the state
	 */
	public StateDTO getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(StateDTO state) {
		this.state = state;
	}

	/**
	 * @return the mandal
	 */
	public MandalDTO getMandal() {
		return mandal;
	}

	/**
	 * @param mandal
	 *            the mandal to set
	 */
	public void setMandal(MandalDTO mandal) {
		this.mandal = mandal;
	}

	/**
	 * @return the pincode
	 */
	public PostOfficeDTO getPincode() {
		return pincode;
	}

	/**
	 * @param pincode
	 *            the pincode to set
	 */
	public void setPincode(PostOfficeDTO pincode) {
		this.pincode = pincode;
	}

	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * @param streetName
	 *            the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the agreementDate
	 */
	public LocalDate getAgreementDate() {
		return agreementDate;
	}

	/**
	 * @param agreementDate
	 *            the agreementDate to set
	 */
	public void setAgreementDate(LocalDate agreementDate) {
		this.agreementDate = agreementDate;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments
	 *            the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo
	 *            the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	/**
	 * @return the serviceIds
	 */
	public Set<Integer> getServiceIds() {
		return serviceIds;
	}

	/**
	 * @param serviceIds the serviceIds to set
	 */
	public void setServiceIds(Set<Integer> serviceIds) {
		this.serviceIds = serviceIds;
	}

	/**
	 * @return the actionType
	 */
	public String getActionType() {
		return actionType;
	}

	/**
	 * @param actionType the actionType to set
	 */
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	/**
	 * @return the doorNumber
	 */
	public String getDoorNumber() {
		return doorNumber;
	}

	/**
	 * @param doorNumber the doorNumber to set
	 */
	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getReqAuthType() {
		return reqAuthType;
	}

	public void setReqAuthType(String reqAuthType) {
		this.reqAuthType = reqAuthType;
	}

	/**
	 * @return the serviceIds
	 */

}
