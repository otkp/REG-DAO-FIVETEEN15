package org.epragati.common.dto;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Document(collection = "hsrp_detail")
@JsonIgnoreProperties(ignoreUnknown = true)
public class HsrpDetailDTO extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3841161635393522889L;

	private String rtoCode;
	private String rtoName;
	private String affixationCenterCode;
	private String transactionNo;
	private String transactionDate;
	@Id
	private String authorizationRefNo;
	private String authorizationDate;
	private String engineNo;
	private String chassisNo;
	private String prNumber;
	private String ownerName;
	private String ownerAddress;
	private String ownerEmailId;
	private String ownerPinCode;
	private String mobileNo;
	private String vehicleType;
	private String transType;
	private String vehicleClassType;
	private String mfrsName;
	private String modelName;
	private String hsrpFee;
	private String oldNewFlag;
	private String govtVehicleTag;
	private String timeStamp;
	private String trNumber;
	private String dealerName;
	private String dealerMail;
	private String dealerRtoCode;
	private String paymentsId;
	private String regDate;
	private String message;
	/// above data object
	private String creditAccount;
	private Integer hsrpStatus;
	private Integer rtaStatus;
	private Integer iteration;
	private boolean errorFound =Boolean.FALSE;
	// updation objects
	private HsrpPayConfirmationDTO hsrpPayConfirmation;
	private EmbossDTO emboss;
	private AffixationDTO affixation;
	private NotifyAffixationDTO notifyAffixation;
	private List<ActionsDetailsDTO> actionsDetails;

	public String getRtoCode() {
		return rtoCode;
	}

	public void setRtoCode(String rtoCode) {
		this.rtoCode = rtoCode;
	}

	public String getRtoName() {
		return rtoName;
	}

	public void setRtoName(String rtoName) {
		this.rtoName = rtoName;
	}

	public String getAffixationCenterCode() {
		return affixationCenterCode;
	}

	public void setAffixationCenterCode(String affixationCenterCode) {
		this.affixationCenterCode = affixationCenterCode;
	}

	public String getTransactionNo() {
		return transactionNo;
	}

	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getAuthorizationRefNo() {
		return authorizationRefNo;
	}

	public void setAuthorizationRefNo(String authorizationRefNo) {
		this.authorizationRefNo = authorizationRefNo;
	}

	public String getAuthorizationDate() {
		return authorizationDate;
	}

	public void setAuthorizationDate(String authorizationDate) {
		this.authorizationDate = authorizationDate;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public String getPrNumber() {
		return prNumber;
	}

	public void setPrNumber(String prNumber) {
		this.prNumber = prNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	public String getOwnerEmailId() {
		return ownerEmailId;
	}

	public void setOwnerEmailId(String ownerEmailId) {
		this.ownerEmailId = ownerEmailId;
	}

	public String getOwnerPinCode() {
		return ownerPinCode;
	}

	public void setOwnerPinCode(String ownerPinCode) {
		this.ownerPinCode = ownerPinCode;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getVehicleClassType() {
		return vehicleClassType;
	}

	public void setVehicleClassType(String vehicleClassType) {
		this.vehicleClassType = vehicleClassType;
	}

	public String getMfrsName() {
		return mfrsName;
	}

	public void setMfrsName(String mfrsName) {
		this.mfrsName = mfrsName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getHsrpFee() {
		return hsrpFee;
	}

	public void setHsrpFee(String hsrpFee) {
		this.hsrpFee = hsrpFee;
	}

	public String getOldNewFlag() {
		return oldNewFlag;
	}

	public void setOldNewFlag(String oldNewFlag) {
		this.oldNewFlag = oldNewFlag;
	}

	public String getGovtVehicleTag() {
		return govtVehicleTag;
	}

	public void setGovtVehicleTag(String govtVehicleTag) {
		this.govtVehicleTag = govtVehicleTag;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getTrNumber() {
		return trNumber;
	}

	public void setTrNumber(String trNumber) {
		this.trNumber = trNumber;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getDealerMail() {
		return dealerMail;
	}

	public void setDealerMail(String dealerMail) {
		this.dealerMail = dealerMail;
	}

	public String getDealerRtoCode() {
		return dealerRtoCode;
	}

	public void setDealerRtoCode(String dealerRtoCode) {
		this.dealerRtoCode = dealerRtoCode;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCreditAccount() {
		return creditAccount;
	}

	public void setCreditAccount(String creditAccount) {
		this.creditAccount = creditAccount;
	}

	public Integer getHsrpStatus() {
		return hsrpStatus;
	}

	public void setHsrpStatus(Integer hsrpStatus) {
		this.hsrpStatus = hsrpStatus;
	}

	public Integer getRtaStatus() {
		return rtaStatus;
	}

	public void setRtaStatus(Integer rtaStatus) {
		this.rtaStatus = rtaStatus;
	}

	public Integer getIteration() {
		return iteration;
	}

	public void setIteration(Integer iteration) {
		this.iteration = iteration;
	}

	public HsrpPayConfirmationDTO getHsrpPayConfirmation() {
		return hsrpPayConfirmation;
	}

	public void setHsrpPayConfirmation(HsrpPayConfirmationDTO hsrpPayConfirmation) {
		this.hsrpPayConfirmation = hsrpPayConfirmation;
	}

	public EmbossDTO getEmboss() {
		return emboss;
	}

	public void setEmboss(EmbossDTO emboss) {
		this.emboss = emboss;
	}

	public AffixationDTO getAffixation() {
		return affixation;
	}

	public void setAffixation(AffixationDTO affixation) {
		this.affixation = affixation;
	}

	public NotifyAffixationDTO getNotifyAffixationDTO() {
		return notifyAffixation;
	}

	public void setNotifyAffixationDTO(NotifyAffixationDTO notifyAffixationDTO) {
		this.notifyAffixation = notifyAffixationDTO;
	}

	public List<ActionsDetailsDTO> getActionsDetails() {
		return actionsDetails;
	}

	public void setActionsDetails(List<ActionsDetailsDTO> actionsDetails) {
		this.actionsDetails = actionsDetails;
	}
	public String getPaymentsId() {
		return paymentsId;
	}

	public void setPaymentsId(String paymentsId) {
		this.paymentsId = paymentsId;
	}
	
	public boolean isErrorFound() {
		return errorFound;
	}

	public void setErrorFound(boolean errorFound) {
		this.errorFound = errorFound;
	}

	@Override
	public String toString() {
		return "HsrpDetailDTO [rtoCode=" + rtoCode + ", rtoName=" + rtoName + ", affixationCenterCode="
				+ affixationCenterCode + ", transactionNo=" + transactionNo + ", transactionDate=" + transactionDate
				+ ", authorizationRefNo=" + authorizationRefNo + ", authorizationDate=" + authorizationDate
				+ ", engineNo=" + engineNo + ", chassisNo=" + chassisNo + ", prNumber=" + prNumber + ", ownerName="
				+ ownerName + ", ownerAddress=" + ownerAddress + ", ownerEmailId=" + ownerEmailId + ", ownerPinCode="
				+ ownerPinCode + ", mobileNo=" + mobileNo + ", vehicleType=" + vehicleType + ", transType=" + transType
				+ ", vehicleClassType=" + vehicleClassType + ", mfrsName=" + mfrsName + ", modelName=" + modelName
				+ ", hsrpFee=" + hsrpFee + ", oldNewFlag=" + oldNewFlag + ", govtVehicleTag=" + govtVehicleTag
				+ ", timeStamp=" + timeStamp + ", trNumber=" + trNumber + ", dealerName=" + dealerName + ", dealerMail="
				+ dealerMail + ", dealerRtoCode=" + dealerRtoCode + ", paymentsId=" + paymentsId + ", regDate="
				+ regDate + ", message=" + message + ", creditAccount=" + creditAccount + ", hsrpStatus=" + hsrpStatus
				+ ", rtaStatus=" + rtaStatus + ", iteration=" + iteration + ", errorFound=" + errorFound
				+ ", hsrpPayConfirmation=" + hsrpPayConfirmation + ", emboss=" + emboss + ", affixation=" + affixation
				+ ", notifyAffixation=" + notifyAffixation + ", actionsDetails=" + actionsDetails + "]";
	}

	
	

}