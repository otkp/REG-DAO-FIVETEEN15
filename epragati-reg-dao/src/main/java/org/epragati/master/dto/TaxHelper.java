package org.epragati.master.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.epragati.tax.vo.TaxTypeEnum;

public class TaxHelper {

	private String taxName;
	private Double tax;
	private Double taxArrears;
	private Double quaterAmount;
	private Long penalty;
	private Long penaltyArrears;
	private LocalDate validityTo;
	private LocalDateTime taxPaidDate;
	private boolean isAnypendingQuaters;
	private Long taxAmountForPayments;
	private Long taxArrearsRound;
	private boolean isVcr = Boolean.FALSE;
	private boolean isVehicleSized = Boolean.FALSE;
	private LocalDate sizedDate;
	private TaxTypeEnum.TaxPayType taxPayType;
	private String permitType;
	private Long quaterTaxForNewGo;
	private LocalDate latestVcrDate;
	private Double vcrTax;
	private LocalDate playedAsQuarterEnd;
	private Boolean taxPaidThroughVcr = Boolean.FALSE;
	private boolean oldCovLife = Boolean.FALSE;
	private LocalDate lastTaxPaidUpTo;
	

	/**
	 * @return the penalty
	 */
	public Long getPenalty() {
		return penalty;
	}
	/**
	 * @param penalty the penalty to set
	 */
	public void setPenalty(Long penalty) {
		this.penalty = penalty;
	}
	/**
	 * @return the taxAmountForPayments
	 */
	public Long getTaxAmountForPayments() {
		return taxAmountForPayments;
	}
	/**
	 * @param taxAmountForPayments the taxAmountForPayments to set
	 */
	public void setTaxAmountForPayments(Long taxAmountForPayments) {
		this.taxAmountForPayments = taxAmountForPayments;
	}
	/**
	 * @return the taxPaidDate
	 */
	public LocalDateTime getTaxPaidDate() {
		return taxPaidDate;
	}
	/**
	 * @param taxPaidDate the taxPaidDate to set
	 */
	public void setTaxPaidDate(LocalDateTime taxPaidDate) {
		this.taxPaidDate = taxPaidDate;
	}
	/**
	 * @return the isAnypendingQuaters
	 */
	public boolean isAnypendingQuaters() {
		return isAnypendingQuaters;
	}
	/**
	 * @param isAnypendingQuaters the isAnypendingQuaters to set
	 */
	public void setAnypendingQuaters(boolean isAnypendingQuaters) {
		this.isAnypendingQuaters = isAnypendingQuaters;
	}
	/**
	 * @return the taxName
	 */
	public String getTaxName() {
		return taxName;
	}
	/**
	 * @param taxName the taxName to set
	 */
	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}

	/**
	 * @return the quaterAmount
	 */
	public Double getQuaterAmount() {
		return quaterAmount;
	}
	/**
	 * @param quaterAmount the quaterAmount to set
	 */
	public void setQuaterAmount(Double quaterAmount) {
		this.quaterAmount = quaterAmount;
	}
	
	/**
	 * @return the validityTo
	 */
	public LocalDate getValidityTo() {
		return validityTo;
	}
	/**
	 * @param validityTo the validityTo to set
	 */
	public void setValidityTo(LocalDate validityTo) {
		this.validityTo = validityTo;
	}
	/**
	 * @return the tax
	 */
	public Double getTax() {
		return tax;
	}
	/**
	 * @param tax the tax to set
	 */
	public void setTax(Double tax) {
		this.tax = tax;
	}
	/**
	 * @return the taxArrears
	 */
	public Double getTaxArrears() {
		return taxArrears;
	}
	/**
	 * @param taxArrears the taxArrears to set
	 */
	public void setTaxArrears(Double taxArrears) {
		this.taxArrears = taxArrears;
	}
	/**
	 * @return the penaltyArrears
	 */
	public Long getPenaltyArrears() {
		return penaltyArrears;
	}
	/**
	 * @param penaltyArrears the penaltyArrears to set
	 */
	public void setPenaltyArrears(Long penaltyArrears) {
		this.penaltyArrears = penaltyArrears;
	}
	/**
	 * @return the taxArrearsRound
	 */
	public Long getTaxArrearsRound() {
		return taxArrearsRound;
	}
	/**
	 * @param taxArrearsRound the taxArrearsRound to set
	 */
	public void setTaxArrearsRound(Long taxArrearsRound) {
		this.taxArrearsRound = taxArrearsRound;
	}
	/**
	 * @return the isVcr
	 */
	public boolean isVcr() {
		return isVcr;
	}
	/**
	 * @param isVcr the isVcr to set
	 */
	public void setVcr(boolean isVcr) {
		this.isVcr = isVcr;
	}
	/**
	 * @return the isVehicleSized
	 */
	public boolean isVehicleSized() {
		return isVehicleSized;
	}
	/**
	 * @param isVehicleSized the isVehicleSized to set
	 */
	public void setVehicleSized(boolean isVehicleSized) {
		this.isVehicleSized = isVehicleSized;
	}
	/**
	 * @return the sizedDate
	 */
	public LocalDate getSizedDate() {
		return sizedDate;
	}
	/**
	 * @param sizedDate the sizedDate to set
	 */
	public void setSizedDate(LocalDate sizedDate) {
		this.sizedDate = sizedDate;
	}
	/**
	 * @return the taxPayType
	 */
	public TaxTypeEnum.TaxPayType getTaxPayType() {
		return taxPayType;
	}
	/**
	 * @param taxPayType the taxPayType to set
	 */
	public void setTaxPayType(TaxTypeEnum.TaxPayType taxPayType) {
		this.taxPayType = taxPayType;
	}
	/**
	 * @return the permitType
	 */
	public String getPermitType() {
		return permitType;
	}
	/**
	 * @param permitType the permitType to set
	 */
	public void setPermitType(String permitType) {
		this.permitType = permitType;
	}
	/**
	 * @return the quaterTaxForNewGo
	 */
	public Long getQuaterTaxForNewGo() {
		return quaterTaxForNewGo;
	}
	/**
	 * @param quaterTaxForNewGo the quaterTaxForNewGo to set
	 */
	public void setQuaterTaxForNewGo(Long quaterTaxForNewGo) {
		this.quaterTaxForNewGo = quaterTaxForNewGo;
	}
	public LocalDate getLatestVcrDate() {
		return latestVcrDate;
	}
	public void setLatestVcrDate(LocalDate latestVcrDate) {
		this.latestVcrDate = latestVcrDate;
	}
	public Double getVcrTax() {
		return vcrTax;
	}
	public void setVcrTax(Double vcrTax) {
		this.vcrTax = vcrTax;
	}
	public LocalDate getPlayedAsQuarterEnd() {
		return playedAsQuarterEnd;
	}
	public void setPlayedAsQuarterEnd(LocalDate playedAsQuarterEnd) {
		this.playedAsQuarterEnd = playedAsQuarterEnd;
	}
	public Boolean getTaxPaidThroughVcr() {
		return taxPaidThroughVcr;
	}
	public void setTaxPaidThroughVcr(Boolean taxPaidThroughVcr) {
		this.taxPaidThroughVcr = taxPaidThroughVcr;
	}
	public boolean isOldCovLife() {
		return oldCovLife;
	}
	public void setOldCovLife(boolean oldCovLife) {
		this.oldCovLife = oldCovLife;
	}
	public LocalDate getLastTaxPaidUpTo() {
		return lastTaxPaidUpTo;
	}
	public void setLastTaxPaidUpTo(LocalDate lastTaxPaidUpTo) {
		this.lastTaxPaidUpTo = lastTaxPaidUpTo;
	}

	
	
}
