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
@Document(collection = "stagging_tr_fee_details")
public class StaggingTrFeeDetailsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	private Integer tfdId;
	private Integer tfdTdId;
	private Double tfdTaxAmount;
	private Double tfdAppFee;
	private Double tfdHpaFee;
	private Double tfdServiceFee;
	private Double tfdPenality;
	private Double tfdRegAppFee;
	private Double tfdRegServiceFee;
	private Double tfdRegCardFee;
	private Double tfdRegPostalFee;
	private Double tfdFcAppFee;
	private Double tfdFcServiceFee;
	private Double tfdPermitAppFee;
	private Double tfdPermitSerFee;
	private Double tfdHsrpFee;
	private Double tfdCessFee;
	private Double tfdTotal;
	private LocalDateTime createdDate;
	private LocalDateTime lUpdate;
	private Integer tfdStatus;
	private String tfdApplicationNo;
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
	 * @return the tfdId
	 */
	public Integer getTfdId() {
		return tfdId;
	}
	/**
	 * @param tfdId the tfdId to set
	 */
	public void setTfdId(Integer tfdId) {
		this.tfdId = tfdId;
	}
	/**
	 * @return the tfdTdId
	 */
	public Integer getTfdTdId() {
		return tfdTdId;
	}
	/**
	 * @param tfdTdId the tfdTdId to set
	 */
	public void setTfdTdId(Integer tfdTdId) {
		this.tfdTdId = tfdTdId;
	}
	/**
	 * @return the tfdTaxAmount
	 */
	public Double getTfdTaxAmount() {
		return tfdTaxAmount;
	}
	/**
	 * @param tfdTaxAmount the tfdTaxAmount to set
	 */
	public void setTfdTaxAmount(Double tfdTaxAmount) {
		this.tfdTaxAmount = tfdTaxAmount;
	}
	/**
	 * @return the tfdAppFee
	 */
	public Double getTfdAppFee() {
		return tfdAppFee;
	}
	/**
	 * @param tfdAppFee the tfdAppFee to set
	 */
	public void setTfdAppFee(Double tfdAppFee) {
		this.tfdAppFee = tfdAppFee;
	}
	/**
	 * @return the tfdHpaFee
	 */
	public Double getTfdHpaFee() {
		return tfdHpaFee;
	}
	/**
	 * @param tfdHpaFee the tfdHpaFee to set
	 */
	public void setTfdHpaFee(Double tfdHpaFee) {
		this.tfdHpaFee = tfdHpaFee;
	}
	/**
	 * @return the tfdServiceFee
	 */
	public Double getTfdServiceFee() {
		return tfdServiceFee;
	}
	/**
	 * @param tfdServiceFee the tfdServiceFee to set
	 */
	public void setTfdServiceFee(Double tfdServiceFee) {
		this.tfdServiceFee = tfdServiceFee;
	}
	/**
	 * @return the tfdPenality
	 */
	public Double getTfdPenality() {
		return tfdPenality;
	}
	/**
	 * @param tfdPenality the tfdPenality to set
	 */
	public void setTfdPenality(Double tfdPenality) {
		this.tfdPenality = tfdPenality;
	}
	/**
	 * @return the tfdRegAppFee
	 */
	public Double getTfdRegAppFee() {
		return tfdRegAppFee;
	}
	/**
	 * @param tfdRegAppFee the tfdRegAppFee to set
	 */
	public void setTfdRegAppFee(Double tfdRegAppFee) {
		this.tfdRegAppFee = tfdRegAppFee;
	}
	/**
	 * @return the tfdRegServiceFee
	 */
	public Double getTfdRegServiceFee() {
		return tfdRegServiceFee;
	}
	/**
	 * @param tfdRegServiceFee the tfdRegServiceFee to set
	 */
	public void setTfdRegServiceFee(Double tfdRegServiceFee) {
		this.tfdRegServiceFee = tfdRegServiceFee;
	}
	/**
	 * @return the tfdRegCardFee
	 */
	public Double getTfdRegCardFee() {
		return tfdRegCardFee;
	}
	/**
	 * @param tfdRegCardFee the tfdRegCardFee to set
	 */
	public void setTfdRegCardFee(Double tfdRegCardFee) {
		this.tfdRegCardFee = tfdRegCardFee;
	}
	/**
	 * @return the tfdRegPostalFee
	 */
	public Double getTfdRegPostalFee() {
		return tfdRegPostalFee;
	}
	/**
	 * @param tfdRegPostalFee the tfdRegPostalFee to set
	 */
	public void setTfdRegPostalFee(Double tfdRegPostalFee) {
		this.tfdRegPostalFee = tfdRegPostalFee;
	}
	/**
	 * @return the tfdFcAppFee
	 */
	public Double getTfdFcAppFee() {
		return tfdFcAppFee;
	}
	/**
	 * @param tfdFcAppFee the tfdFcAppFee to set
	 */
	public void setTfdFcAppFee(Double tfdFcAppFee) {
		this.tfdFcAppFee = tfdFcAppFee;
	}
	/**
	 * @return the tfdFcServiceFee
	 */
	public Double getTfdFcServiceFee() {
		return tfdFcServiceFee;
	}
	/**
	 * @param tfdFcServiceFee the tfdFcServiceFee to set
	 */
	public void setTfdFcServiceFee(Double tfdFcServiceFee) {
		this.tfdFcServiceFee = tfdFcServiceFee;
	}
	/**
	 * @return the tfdPermitAppFee
	 */
	public Double getTfdPermitAppFee() {
		return tfdPermitAppFee;
	}
	/**
	 * @param tfdPermitAppFee the tfdPermitAppFee to set
	 */
	public void setTfdPermitAppFee(Double tfdPermitAppFee) {
		this.tfdPermitAppFee = tfdPermitAppFee;
	}
	/**
	 * @return the tfdPermitSerFee
	 */
	public Double getTfdPermitSerFee() {
		return tfdPermitSerFee;
	}
	/**
	 * @param tfdPermitSerFee the tfdPermitSerFee to set
	 */
	public void setTfdPermitSerFee(Double tfdPermitSerFee) {
		this.tfdPermitSerFee = tfdPermitSerFee;
	}
	/**
	 * @return the tfdHsrpFee
	 */
	public Double getTfdHsrpFee() {
		return tfdHsrpFee;
	}
	/**
	 * @param tfdHsrpFee the tfdHsrpFee to set
	 */
	public void setTfdHsrpFee(Double tfdHsrpFee) {
		this.tfdHsrpFee = tfdHsrpFee;
	}
	/**
	 * @return the tfdCessFee
	 */
	public Double getTfdCessFee() {
		return tfdCessFee;
	}
	/**
	 * @param tfdCessFee the tfdCessFee to set
	 */
	public void setTfdCessFee(Double tfdCessFee) {
		this.tfdCessFee = tfdCessFee;
	}
	/**
	 * @return the tfdTotal
	 */
	public Double getTfdTotal() {
		return tfdTotal;
	}
	/**
	 * @param tfdTotal the tfdTotal to set
	 */
	public void setTfdTotal(Double tfdTotal) {
		this.tfdTotal = tfdTotal;
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
	/**
	 * @return the tfdStatus
	 */
	public Integer getTfdStatus() {
		return tfdStatus;
	}
	/**
	 * @param tfdStatus the tfdStatus to set
	 */
	public void setTfdStatus(Integer tfdStatus) {
		this.tfdStatus = tfdStatus;
	}
	/**
	 * @return the tfdApplicationNo
	 */
	public String getTfdApplicationNo() {
		return tfdApplicationNo;
	}
	/**
	 * @param tfdApplicationNo the tfdApplicationNo to set
	 */
	public void setTfdApplicationNo(String tfdApplicationNo) {
		this.tfdApplicationNo = tfdApplicationNo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StaggingTrFeeDetailsDTO [id=" + id + ", tfdId=" + tfdId + ", tfdTdId=" + tfdTdId + ", tfdTaxAmount="
				+ tfdTaxAmount + ", tfdAppFee=" + tfdAppFee + ", tfdHpaFee=" + tfdHpaFee + ", tfdServiceFee="
				+ tfdServiceFee + ", tfdPenality=" + tfdPenality + ", tfdRegAppFee=" + tfdRegAppFee
				+ ", tfdRegServiceFee=" + tfdRegServiceFee + ", tfdRegCardFee=" + tfdRegCardFee + ", tfdRegPostalFee="
				+ tfdRegPostalFee + ", tfdFcAppFee=" + tfdFcAppFee + ", tfdFcServiceFee=" + tfdFcServiceFee
				+ ", tfdPermitAppFee=" + tfdPermitAppFee + ", tfdPermitSerFee=" + tfdPermitSerFee + ", tfdHsrpFee="
				+ tfdHsrpFee + ", tfdCessFee=" + tfdCessFee + ", tfdTotal=" + tfdTotal + ", createdDate=" + createdDate
				+ ", lUpdate=" + lUpdate + ", tfdStatus=" + tfdStatus + ", tfdApplicationNo=" + tfdApplicationNo + "]";
	}

}
