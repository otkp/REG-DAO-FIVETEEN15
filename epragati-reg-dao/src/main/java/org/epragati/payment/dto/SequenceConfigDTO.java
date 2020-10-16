package org.epragati.payment.dto;

import java.io.Serializable;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sequence_config")
public class SequenceConfigDTO extends BaseEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private String name;
	private Long startNumber;
	private String numberLength;
	
	/**
	 * Acceptable Values F, C
	 * F : Financial 
	 * C : Calendar 
	 */
	private String resetMode;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getStartNumber() {
		return startNumber;
	}
	public void setStartNumber(Long startNumber) {
		this.startNumber = startNumber;
	}
	public String getNumberLength() {
		return numberLength;
	}
	public void setNumberLength(String numberLength) {
		this.numberLength = numberLength;
	}
	public String getResetMode() {
		return resetMode;
	}
	public void setResetMode(String resetMode) {
		this.resetMode = resetMode;
	}
}
