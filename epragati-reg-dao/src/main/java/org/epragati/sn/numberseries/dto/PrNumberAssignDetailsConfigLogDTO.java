package org.epragati.sn.numberseries.dto;

import java.time.LocalDate;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "pr_number_config_log")

public class PrNumberAssignDetailsConfigLogDTO extends BaseEntity{

	private static final long serialVersionUID = 6285774505514476455L;

	@Id
	private String id;
	private Integer currentNumber;
	private String officeCode;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate currentDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getCurrentNumber() {
		return currentNumber;
	}
	public void setCurrentNumber(Integer currentNumber) {
		this.currentNumber = currentNumber;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public LocalDate getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}
}