package org.epragati.dealer.tradecert;

import java.io.Serializable;
import java.time.LocalDate;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * this DTO class is used for creating new Trade Certificate
 * 
 * @author Jyoti Bhushan
 *
 */

@Document(collection = "trade_certificate_dealer")
public class TradeCertificateDealerDto extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String tradeCertificateID;
	private String dealerName;
	private Integer numberOfTradeCertificate;
	private String cov;
	private String covCode;
	private String ammount;
	private String status;
	private String paymentStatus;
	private LocalDate validFrom;
	private LocalDate validTo;
	private Long totalDaysRemains;
	private String tradeValidityStatus;
	private String commonNumber;
	private String paymentTransactionNo;
	private String userId;
	private String gatewayType;
	private boolean downloadStatus;
	private String applicationPaymentType;
	/**
	 * @return the gatewayType
	 */
	public String getGatewayType() {
		return gatewayType;
	}

	/**
	 * @param gatewayType the gatewayType to set
	 */
	public void setGatewayType(String gatewayType) {
		this.gatewayType = gatewayType;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getTotalDaysRemains() {
		return totalDaysRemains;
	}

	public void setTotalDaysRemains(Long totalDaysRemains) {
		this.totalDaysRemains = totalDaysRemains;
	}

	public String getTradeValidityStatus() {
		return tradeValidityStatus;
	}

	public void setTradeValidityStatus(String tradeValidityStatus) {
		this.tradeValidityStatus = tradeValidityStatus;
	}

	public String getPaymentTransactionNo() {
		return paymentTransactionNo;
	}

	public void setPaymentTransactionNo(String paymentTransactionNo) {
		this.paymentTransactionNo = paymentTransactionNo;
	}

	public String getCommonNumber() {
		return commonNumber;
	}

	public Long getTotalDaysRemins() {
		return totalDaysRemains;
	}

	public void setTotalDaysRemins(Long totalDaysRemins) {
		this.totalDaysRemains = totalDaysRemins;
	}

	public void setCommonNumber(String commonNumber) {
		this.commonNumber = commonNumber;
	}

	/**
	 * @return the paymentStatus
	 */
	public String getPaymentStatus() {
		return paymentStatus;
	}

	/**
	 * @param paymentStatus the paymentStatus to set
	 */
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public LocalDate getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}

	public LocalDate getValidTo() {
		return validTo;
	}

	public void setValidTo(LocalDate validTo) {
		this.validTo = validTo;
	}

	public String getTradeCertificateID() {
		return tradeCertificateID;
	}

	public void setTradeCertificateID(String tradeCertificateID) {
		this.tradeCertificateID = tradeCertificateID;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public Integer getNumberOfTradeCertificate() {
		return numberOfTradeCertificate;
	}

	public void setNumberOfTradeCertificate(Integer numberOfTradeCertificate) {
		this.numberOfTradeCertificate = numberOfTradeCertificate;
	}

	public String getCov() {
		return cov;
	}

	public void setCov(String cov) {
		this.cov = cov;
	}

	public String getAmmount() {
		return ammount;
	}

	public void setAmmount(String ammount) {
		this.ammount = ammount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCovCode() {
		return covCode;
	}

	public void setCovCode(String covCode) {
		this.covCode = covCode;
	}

	public boolean isDownloadStatus() {
		return downloadStatus;
	}

	public void setDownloadStatus(boolean downloadStatus) {
		this.downloadStatus = downloadStatus;
	}

	public String getApplicationPaymentType() {
		return applicationPaymentType;
	}

	public void setApplicationPaymentType(String applicationPaymentType) {
		this.applicationPaymentType = applicationPaymentType;
	}

}
