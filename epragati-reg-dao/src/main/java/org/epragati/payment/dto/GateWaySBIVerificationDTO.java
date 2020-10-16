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
public class GateWaySBIVerificationDTO extends BaseEntity  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String verificationRedirectURL;
	
	private String verificationURL;

	public String getVerificationRedirectURL() {
		return verificationRedirectURL;
	}

	public void setVerificationRedirectURL(String verificationRedirectURL) {
		this.verificationRedirectURL = verificationRedirectURL;
	}

	public String getVerificationURL() {
		return verificationURL;
	}

	public void setVerificationURL(String verificationURL) {
		this.verificationURL = verificationURL;
	}

	@Override
	public String toString() {
		return "GateWayVerificationDTO [verificationRedirectURL=" + verificationRedirectURL + ", verificationURL="
				+ verificationURL + "]";
	}
}
