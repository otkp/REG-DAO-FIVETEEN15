package org.epragati.payment.dto;

import org.epragati.common.dto.BaseEntity;
import org.epragati.util.payment.GatewayTypeEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "payment_gateway_response_details")
public class PaymentGateWayResponceDetailsDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String applicationNumber;

	private String transactionNumber;

	private String responseDetails;

	private GatewayTypeEnum gateWayType;

	private Boolean isCancelledTransaction = false;

	private Boolean isDoubleVerified = false;

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
	 * @return the applicationNumber
	 */
	public String getApplicationNumber() {
		return applicationNumber;
	}

	/**
	 * @param applicationNumber
	 *            the applicationNumber to set
	 */
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	/**
	 * @return the responseDetails
	 */
	public String getResponseDetails() {
		return responseDetails;
	}

	/**
	 * @param responseDetails
	 *            the responseDetails to set
	 */
	public void setResponseDetails(String responseDetails) {
		this.responseDetails = responseDetails;
	}

	/**
	 * @return the gateWayType
	 */
	public GatewayTypeEnum getGateWayType() {
		return gateWayType;
	}

	/**
	 * @param gateWayType
	 *            the gateWayType to set
	 */
	public void setGateWayType(GatewayTypeEnum gateWayType) {
		this.gateWayType = gateWayType;
	}

	/**
	 * @return the transactionNumber
	 */
	public String getTransactionNumber() {
		return transactionNumber;
	}

	/**
	 * @param transactionNumber
	 *            the transactionNumber to set
	 */
	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	/**
	 * @return the isCancelledTransaction
	 */
	public Boolean getIsCancelledTransaction() {
		return isCancelledTransaction;
	}

	/**
	 * @param isCancelledTransaction
	 *            the isCancelledTransaction to set
	 */
	public void setIsCancelledTransaction(Boolean isCancelledTransaction) {
		this.isCancelledTransaction = isCancelledTransaction;
	}

	/**
	 * @return the isDoubleVerified
	 */
	public Boolean getIsDoubleVerified() {
		return isDoubleVerified;
	}

	/**
	 * @param isDoubleVerified
	 *            the isDoubleVerified to set
	 */
	public void setIsDoubleVerified(Boolean isDoubleVerified) {
		this.isDoubleVerified = isDoubleVerified;
	}

}
