package org.epragati.payment.dto;

import java.io.Serializable;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author pbattula
 *
 */

@Document
public class GateWaySBIServiceConfigDTO extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String serviceId;

	private GateWaySBIPaymentDTO payment;
  	
	private GateWaySBIVerificationDTO verification;
	
	public GateWaySBIPaymentDTO getPayment() {
		return payment;
	}

	public void setPayment(GateWaySBIPaymentDTO payment) {
		this.payment = payment;
	}

	public GateWaySBIVerificationDTO getVerification() {
		return verification;
	}

	public void setVerification(GateWaySBIVerificationDTO verification) {
		this.verification = verification;
	}

	/**
	 * @return the serviceId
	 */
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GateWaySBIServiceConfigDTO [serviceId=" + serviceId + ", payment=" + payment + ", verification="
				+ verification + "]";
	}


}
