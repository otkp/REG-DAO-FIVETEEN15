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
@Document(collection="aadhaar_logs")
public class AadhaarLogsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	private Integer alId;
	private String reqAgencyCode;
	private String reqAgencyName;
	private String reqAttemptType;
	private String reqAuthType;
	private String reqClientDateTime;
	private String reqConsent;
	private String reqConsentMe;
	private String reqDeviceCode;
	private String reqDeviceName;
	private String reqFdc;
	private String reqProvider;
	private String reqServerDateTime;
	private String reqService;
	private String reqTid;
	private String reqTime;
	private String reqUid;
	private String respAuthDate;
	private String respAuthErrorCode;
	private String respAuthStatus;
	private String respAuthTransactionCode;
	private String respKsaKuaTxn;
	private String respMandal;
	private String respName;
	private String respStateCode;
	private String respTime;
	private String reqEndPointUrl;
	private String reqRdsVer;
	private String reqRdsId;
	private String reqDpId;
	private String reqDc;
	private String reqmi;
	private String reqMc;
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
	 * @return the alId
	 */
	public Integer getAlId() {
		return alId;
	}
	/**
	 * @param alId the alId to set
	 */
	public void setAlId(Integer alId) {
		this.alId = alId;
	}
	/**
	 * @return the reqAgencyCode
	 */
	public String getReqAgencyCode() {
		return reqAgencyCode;
	}
	/**
	 * @param reqAgencyCode the reqAgencyCode to set
	 */
	public void setReqAgencyCode(String reqAgencyCode) {
		this.reqAgencyCode = reqAgencyCode;
	}
	/**
	 * @return the reqAgencyName
	 */
	public String getReqAgencyName() {
		return reqAgencyName;
	}
	/**
	 * @param reqAgencyName the reqAgencyName to set
	 */
	public void setReqAgencyName(String reqAgencyName) {
		this.reqAgencyName = reqAgencyName;
	}
	/**
	 * @return the reqAttemptType
	 */
	public String getReqAttemptType() {
		return reqAttemptType;
	}
	/**
	 * @param reqAttemptType the reqAttemptType to set
	 */
	public void setReqAttemptType(String reqAttemptType) {
		this.reqAttemptType = reqAttemptType;
	}
	/**
	 * @return the reqAuthType
	 */
	public String getReqAuthType() {
		return reqAuthType;
	}
	/**
	 * @param reqAuthType the reqAuthType to set
	 */
	public void setReqAuthType(String reqAuthType) {
		this.reqAuthType = reqAuthType;
	}
	/**
	 * @return the reqClientDateTime
	 */
	public String getReqClientDateTime() {
		return reqClientDateTime;
	}
	/**
	 * @param reqClientDateTime the reqClientDateTime to set
	 */
	public void setReqClientDateTime(String reqClientDateTime) {
		this.reqClientDateTime = reqClientDateTime;
	}
	/**
	 * @return the reqConsent
	 */
	public String getReqConsent() {
		return reqConsent;
	}
	/**
	 * @param reqConsent the reqConsent to set
	 */
	public void setReqConsent(String reqConsent) {
		this.reqConsent = reqConsent;
	}
	/**
	 * @return the reqConsentMe
	 */
	public String getReqConsentMe() {
		return reqConsentMe;
	}
	/**
	 * @param reqConsentMe the reqConsentMe to set
	 */
	public void setReqConsentMe(String reqConsentMe) {
		this.reqConsentMe = reqConsentMe;
	}
	/**
	 * @return the reqDeviceCode
	 */
	public String getReqDeviceCode() {
		return reqDeviceCode;
	}
	/**
	 * @param reqDeviceCode the reqDeviceCode to set
	 */
	public void setReqDeviceCode(String reqDeviceCode) {
		this.reqDeviceCode = reqDeviceCode;
	}
	/**
	 * @return the reqDeviceName
	 */
	public String getReqDeviceName() {
		return reqDeviceName;
	}
	/**
	 * @param reqDeviceName the reqDeviceName to set
	 */
	public void setReqDeviceName(String reqDeviceName) {
		this.reqDeviceName = reqDeviceName;
	}
	/**
	 * @return the reqFdc
	 */
	public String getReqFdc() {
		return reqFdc;
	}
	/**
	 * @param reqFdc the reqFdc to set
	 */
	public void setReqFdc(String reqFdc) {
		this.reqFdc = reqFdc;
	}
	/**
	 * @return the reqProvider
	 */
	public String getReqProvider() {
		return reqProvider;
	}
	/**
	 * @param reqProvider the reqProvider to set
	 */
	public void setReqProvider(String reqProvider) {
		this.reqProvider = reqProvider;
	}
	/**
	 * @return the reqServerDateTime
	 */
	public String getReqServerDateTime() {
		return reqServerDateTime;
	}
	/**
	 * @param reqServerDateTime the reqServerDateTime to set
	 */
	public void setReqServerDateTime(String reqServerDateTime) {
		this.reqServerDateTime = reqServerDateTime;
	}
	/**
	 * @return the reqService
	 */
	public String getReqService() {
		return reqService;
	}
	/**
	 * @param reqService the reqService to set
	 */
	public void setReqService(String reqService) {
		this.reqService = reqService;
	}
	/**
	 * @return the reqTid
	 */
	public String getReqTid() {
		return reqTid;
	}
	/**
	 * @param reqTid the reqTid to set
	 */
	public void setReqTid(String reqTid) {
		this.reqTid = reqTid;
	}
	/**
	 * @return the reqTime
	 */
	public String getReqTime() {
		return reqTime;
	}
	/**
	 * @param reqTime the reqTime to set
	 */
	public void setReqTime(String reqTime) {
		this.reqTime = reqTime;
	}
	/**
	 * @return the reqUid
	 */
	public String getReqUid() {
		return reqUid;
	}
	/**
	 * @param reqUid the reqUid to set
	 */
	public void setReqUid(String reqUid) {
		this.reqUid = reqUid;
	}
	/**
	 * @return the respAuthDate
	 */
	public String getRespAuthDate() {
		return respAuthDate;
	}
	/**
	 * @param respAuthDate the respAuthDate to set
	 */
	public void setRespAuthDate(String respAuthDate) {
		this.respAuthDate = respAuthDate;
	}
	/**
	 * @return the respAuthErrorCode
	 */
	public String getRespAuthErrorCode() {
		return respAuthErrorCode;
	}
	/**
	 * @param respAuthErrorCode the respAuthErrorCode to set
	 */
	public void setRespAuthErrorCode(String respAuthErrorCode) {
		this.respAuthErrorCode = respAuthErrorCode;
	}
	/**
	 * @return the respAuthStatus
	 */
	public String getRespAuthStatus() {
		return respAuthStatus;
	}
	/**
	 * @param respAuthStatus the respAuthStatus to set
	 */
	public void setRespAuthStatus(String respAuthStatus) {
		this.respAuthStatus = respAuthStatus;
	}
	/**
	 * @return the respAuthTransactionCode
	 */
	public String getRespAuthTransactionCode() {
		return respAuthTransactionCode;
	}
	/**
	 * @param respAuthTransactionCode the respAuthTransactionCode to set
	 */
	public void setRespAuthTransactionCode(String respAuthTransactionCode) {
		this.respAuthTransactionCode = respAuthTransactionCode;
	}
	/**
	 * @return the respKsaKuaTxn
	 */
	public String getRespKsaKuaTxn() {
		return respKsaKuaTxn;
	}
	/**
	 * @param respKsaKuaTxn the respKsaKuaTxn to set
	 */
	public void setRespKsaKuaTxn(String respKsaKuaTxn) {
		this.respKsaKuaTxn = respKsaKuaTxn;
	}
	/**
	 * @return the respMandal
	 */
	public String getRespMandal() {
		return respMandal;
	}
	/**
	 * @param respMandal the respMandal to set
	 */
	public void setRespMandal(String respMandal) {
		this.respMandal = respMandal;
	}
	/**
	 * @return the respName
	 */
	public String getRespName() {
		return respName;
	}
	/**
	 * @param respName the respName to set
	 */
	public void setRespName(String respName) {
		this.respName = respName;
	}
	/**
	 * @return the respStateCode
	 */
	public String getRespStateCode() {
		return respStateCode;
	}
	/**
	 * @param respStateCode the respStateCode to set
	 */
	public void setRespStateCode(String respStateCode) {
		this.respStateCode = respStateCode;
	}
	/**
	 * @return the respTime
	 */
	public String getRespTime() {
		return respTime;
	}
	/**
	 * @param respTime the respTime to set
	 */
	public void setRespTime(String respTime) {
		this.respTime = respTime;
	}
	/**
	 * @return the reqEndPointUrl
	 */
	public String getReqEndPointUrl() {
		return reqEndPointUrl;
	}
	/**
	 * @param reqEndPointUrl the reqEndPointUrl to set
	 */
	public void setReqEndPointUrl(String reqEndPointUrl) {
		this.reqEndPointUrl = reqEndPointUrl;
	}
	/**
	 * @return the reqRdsVer
	 */
	public String getReqRdsVer() {
		return reqRdsVer;
	}
	/**
	 * @param reqRdsVer the reqRdsVer to set
	 */
	public void setReqRdsVer(String reqRdsVer) {
		this.reqRdsVer = reqRdsVer;
	}
	/**
	 * @return the reqRdsId
	 */
	public String getReqRdsId() {
		return reqRdsId;
	}
	/**
	 * @param reqRdsId the reqRdsId to set
	 */
	public void setReqRdsId(String reqRdsId) {
		this.reqRdsId = reqRdsId;
	}
	/**
	 * @return the reqDpId
	 */
	public String getReqDpId() {
		return reqDpId;
	}
	/**
	 * @param reqDpId the reqDpId to set
	 */
	public void setReqDpId(String reqDpId) {
		this.reqDpId = reqDpId;
	}
	/**
	 * @return the reqDc
	 */
	public String getReqDc() {
		return reqDc;
	}
	/**
	 * @param reqDc the reqDc to set
	 */
	public void setReqDc(String reqDc) {
		this.reqDc = reqDc;
	}
	/**
	 * @return the reqmi
	 */
	public String getReqmi() {
		return reqmi;
	}
	/**
	 * @param reqmi the reqmi to set
	 */
	public void setReqmi(String reqmi) {
		this.reqmi = reqmi;
	}
	/**
	 * @return the reqMc
	 */
	public String getReqMc() {
		return reqMc;
	}
	/**
	 * @param reqMc the reqMc to set
	 */
	public void setReqMc(String reqMc) {
		this.reqMc = reqMc;
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
		return "AadhaarLogsDTO [id=" + id + ", alId=" + alId + ", reqAgencyCode=" + reqAgencyCode + ", reqAgencyName="
				+ reqAgencyName + ", reqAttemptType=" + reqAttemptType + ", reqAuthType=" + reqAuthType
				+ ", reqClientDateTime=" + reqClientDateTime + ", reqConsent=" + reqConsent + ", reqConsentMe="
				+ reqConsentMe + ", reqDeviceCode=" + reqDeviceCode + ", reqDeviceName=" + reqDeviceName + ", reqFdc="
				+ reqFdc + ", reqProvider=" + reqProvider + ", reqServerDateTime=" + reqServerDateTime + ", reqService="
				+ reqService + ", reqTid=" + reqTid + ", reqTime=" + reqTime + ", reqUid=" + reqUid + ", respAuthDate="
				+ respAuthDate + ", respAuthErrorCode=" + respAuthErrorCode + ", respAuthStatus=" + respAuthStatus
				+ ", respAuthTransactionCode=" + respAuthTransactionCode + ", respKsaKuaTxn=" + respKsaKuaTxn
				+ ", respMandal=" + respMandal + ", respName=" + respName + ", respStateCode=" + respStateCode
				+ ", respTime=" + respTime + ", reqEndPointUrl=" + reqEndPointUrl + ", reqRdsVer=" + reqRdsVer
				+ ", reqRdsId=" + reqRdsId + ", reqDpId=" + reqDpId + ", reqDc=" + reqDc + ", reqmi=" + reqmi
				+ ", reqMc=" + reqMc + ", createdDate=" + createdDate + ", lUpdate=" + lUpdate + "]";
	}

}
