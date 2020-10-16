package org.epragati.master.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.epragati.tax.vo.TaxTypeEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_final_tax_helper")
public class FinalTaxHelper {

	@Id
	private String id;
	private List<String> officeCode;
	private List<Integer> districCode;
	private List<String> prNo;
	private List<String> cov;
	private String permitCode;
	private String routeCode;
	private TaxTypeEnum taxType;
	private TaxTypeEnum.ExcemptionsType excemptionsType;
	private Map<TaxTypeEnum.TaxModule, Double> taxModeDetails;
	private LocalDate effectFrom;
	private LocalDate effectTo;
	private Boolean status;
	private String trNo;
	private Boolean weightAlt;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the officeCode
	 */
	public List<String> getOfficeCode() {
		return officeCode;
	}
	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(List<String> officeCode) {
		this.officeCode = officeCode;
	}
	/**
	 * @return the districCode
	 */
	public List<Integer> getDistricCode() {
		return districCode;
	}
	/**
	 * @param districCode the districCode to set
	 */
	public void setDistricCode(List<Integer> districCode) {
		this.districCode = districCode;
	}
	/**
	 * @return the cov
	 */
	public List<String> getCov() {
		return cov;
	}
	/**
	 * @param cov the cov to set
	 */
	public void setCov(List<String> cov) {
		this.cov = cov;
	}
	/**
	 * @return the effectTo
	 */
	public LocalDate getEffectTo() {
		return effectTo;
	}
	/**
	 * @param effectTo the effectTo to set
	 */
	public void setEffectTo(LocalDate effectTo) {
		this.effectTo = effectTo;
	}
	/**
	 * @return the prNo
	 */
	public List<String> getPrNo() {
		return prNo;
	}
	/**
	 * @param prNo the prNo to set
	 */
	public void setPrNo(List<String> prNo) {
		this.prNo = prNo;
	}
	
	/**
	 * @return the permitCode
	 */
	public String getPermitCode() {
		return permitCode;
	}
	/**
	 * @param permitCode the permitCode to set
	 */
	public void setPermitCode(String permitCode) {
		this.permitCode = permitCode;
	}
	/**
	 * @return the taxType
	 */
	public TaxTypeEnum getTaxType() {
		return taxType;
	}
	/**
	 * @param taxType the taxType to set
	 */
	public void setTaxType(TaxTypeEnum taxType) {
		this.taxType = taxType;
	}
	/**
	 * @return the excemptionsType
	 */
	public TaxTypeEnum.ExcemptionsType getExcemptionsType() {
		return excemptionsType;
	}
	/**
	 * @param excemptionsType the excemptionsType to set
	 */
	public void setExcemptionsType(TaxTypeEnum.ExcemptionsType excemptionsType) {
		this.excemptionsType = excemptionsType;
	}
	/**
	 * @return the taxModeDetails
	 */
	public Map<TaxTypeEnum.TaxModule, Double> getTaxModeDetails() {
		return taxModeDetails;
	}
	/**
	 * @param taxModeDetails the taxModeDetails to set
	 */
	public void setTaxModeDetails(Map<TaxTypeEnum.TaxModule, Double> taxModeDetails) {
		this.taxModeDetails = taxModeDetails;
	}
	/**
	 * @return the effectFrom
	 */
	public LocalDate getEffectFrom() {
		return effectFrom;
	}
	/**
	 * @param effectFrom the effectFrom to set
	 */
	public void setEffectFrom(LocalDate effectFrom) {
		this.effectFrom = effectFrom;
	}

	
	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}
	/**
	 * @return the routeCode
	 */
	public String getRouteCode() {
		return routeCode;
	}
	/**
	 * @param routeCode the routeCode to set
	 */
	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}
	public String getTrNo() {
		return trNo;
	}
	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}
	public Boolean getWeightAlt() {
		return weightAlt;
	}
	public void setWeightAlt(Boolean weightAlt) {
		this.weightAlt = weightAlt;
	}
	
	
}
