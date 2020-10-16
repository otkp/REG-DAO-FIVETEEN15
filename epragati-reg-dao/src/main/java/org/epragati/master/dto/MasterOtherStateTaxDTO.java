package org.epragati.master.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="master_otherstate_tax")
public class MasterOtherStateTaxDTO extends BaseEntity implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private List<String> covcode;
	private Integer ulwfrom;
	private Long ulwto;
	private Float amount;
	private List<Integer> months;
	private String Amountin;
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
	 * @return the covcode
	 */
	public List<String> getCovcode() {
		return covcode;
	}
	/**
	 * @param covcode the covcode to set
	 */
	public void setCovcode(List<String> covcode) {
		this.covcode = covcode;
	}
	/**
	 * @return the ulwfrom
	 */
	public Integer getUlwfrom() {
		return ulwfrom;
	}
	/**
	 * @param ulwfrom the ulwfrom to set
	 */
	public void setUlwfrom(Integer ulwfrom) {
		this.ulwfrom = ulwfrom;
	}
	/**
	 * @return the ulwto
	 */
	public Long getUlwto() {
		return ulwto;
	}
	/**
	 * @param ulwto the ulwto to set
	 */
	public void setUlwto(Long ulwto) {
		this.ulwto = ulwto;
	}
	/**
	 * @return the amount
	 */
	public Float getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	/**
	 * @return the months
	 */
	public List<Integer> getMonths() {
		return months;
	}
	/**
	 * @param months the months to set
	 */
	public void setMonths(List<Integer> months) {
		this.months = months;
	}
	/**
	 * @return the amountin
	 */
	public String getAmountin() {
		return Amountin;
	}
	/**
	 * @param amountin the amountin to set
	 */
	public void setAmountin(String amountin) {
		Amountin = amountin;
	}
	
	
}
