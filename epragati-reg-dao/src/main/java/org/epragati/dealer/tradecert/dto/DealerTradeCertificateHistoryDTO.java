package org.epragati.dealer.tradecert.dto;

import java.io.Serializable;

import org.epragati.common.dto.BaseEntity;
import org.epragati.dealer.tradecert.TradeCertificateDealerDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "trade_certificate_dealer_history")
public class DealerTradeCertificateHistoryDTO extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9101092068551277892L;

	@Id
	private String id;
	
	private TradeCertificateDealerDto tradeCertificateDealer;

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
	 * @return the tradeCertificateDealer
	 */
	public TradeCertificateDealerDto getTradeCertificateDealer() {
		return tradeCertificateDealer;
	}

	/**
	 * @param tradeCertificateDealer the tradeCertificateDealer to set
	 */
	public void setTradeCertificateDealer(TradeCertificateDealerDto tradeCertificateDealer) {
		this.tradeCertificateDealer = tradeCertificateDealer;
	}
	
	
	
}
