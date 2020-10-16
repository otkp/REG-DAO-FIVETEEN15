package org.epragati.payment.dto;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.util.document.KeyValue;

public class SBIDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String gateWayKey;

	private String creditAccount;

	private String paymentURL;

	private List<KeyValue<String, GateWaySBIServiceConfigDTO>> service;

	/**
	 * @return the gateWayKey
	 */
	public String getGateWayKey() {
		return gateWayKey;
	}

	/**
	 * @param gateWayKey
	 *            the gateWayKey to set
	 */
	public void setGateWayKey(String gateWayKey) {
		this.gateWayKey = gateWayKey;
	}

	/**
	 * @return the creditAccount
	 */
	public String getCreditAccount() {
		return creditAccount;
	}

	/**
	 * @param creditAccount
	 *            the creditAccount to set
	 */
	public void setCreditAccount(String creditAccount) {
		this.creditAccount = creditAccount;
	}

	/**
	 * @return the paymentURL
	 */
	public String getPaymentURL() {
		return paymentURL;
	}

	/**
	 * @param paymentURL
	 *            the paymentURL to set
	 */
	public void setPaymentURL(String paymentURL) {
		this.paymentURL = paymentURL;
	}

	/**
	 * @return the service
	 */
	public List<KeyValue<String, GateWaySBIServiceConfigDTO>> getService() {
		return service;
	}

	/**
	 * @param service
	 *            the service to set
	 */
	public void setService(List<KeyValue<String, GateWaySBIServiceConfigDTO>> service) {
		this.service = service;
	}
	

}
