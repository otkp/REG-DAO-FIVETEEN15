package org.epragati.sn.numberseries.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pr_number_config")

public class PrNumberAssignDetailsConfigDTO extends BaseEntity{

	private static final long serialVersionUID = 6285774505514476455L;

	@Id
	private String id;
	private Integer maxLimit;
	private String officeCode;
	private boolean status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getMaxLimit() {
		return maxLimit;
	}
	public void setMaxLimit(Integer maxLimit) {
		this.maxLimit = maxLimit;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}