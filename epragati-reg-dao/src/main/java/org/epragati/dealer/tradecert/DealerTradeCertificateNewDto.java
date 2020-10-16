package org.epragati.dealer.tradecert;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dto.BaseEntity;

/**
 * this DTO class is used for creating new Trade Certificate
 * 
 * @author Jyoti Bhushan
 *
 */
//@Document(collection = "trade_certificate_dealer")
public class DealerTradeCertificateNewDto extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//@Id
	private String userId;
	private String dealerName;
	private String addrss;
	private String uidaiNo;
	private List<TradeCertificateDealerDto> tradeCertificate;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getAddrss() {
		return addrss;
	}

	public void setAddrss(String addrss) {
		this.addrss = addrss;
	}

	public String getUidaiNo() {
		return uidaiNo;
	}

	public void setUidaiNo(String uidaiNo) {
		this.uidaiNo = uidaiNo;
	}

	public List<TradeCertificateDealerDto> getTradeCertificate() {
		return tradeCertificate;
	}

	public void setTradeCertificate(List<TradeCertificateDealerDto> tradeCertificate) {
		this.tradeCertificate = tradeCertificate;
	}

}
