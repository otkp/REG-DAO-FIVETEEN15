package org.epragati.master.dto;

import java.time.LocalDate;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_new_go_tax_details")
public class MasterNewGoTaxDetails {

	@Id
	private String id;
	
	private LocalDate taxEffectFrom;
	
	private LocalDate oldTaxEffectUpTo;

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
	 * @return the taxEffectFrom
	 */
	public LocalDate getTaxEffectFrom() {
		return taxEffectFrom;
	}

	/**
	 * @param taxEffectFrom the taxEffectFrom to set
	 */
	public void setTaxEffectFrom(LocalDate taxEffectFrom) {
		this.taxEffectFrom = taxEffectFrom;
	}

	/**
	 * @return the oldTaxEffectUpTo
	 */
	public LocalDate getOldTaxEffectUpTo() {
		return oldTaxEffectUpTo;
	}

	/**
	 * @param oldTaxEffectUpTo the oldTaxEffectUpTo to set
	 */
	public void setOldTaxEffectUpTo(LocalDate oldTaxEffectUpTo) {
		this.oldTaxEffectUpTo = oldTaxEffectUpTo;
	}
	
	
}
