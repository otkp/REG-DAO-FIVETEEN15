package org.epragati.master.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="master_quater_months")

public class MasterQuaterPeriodDTO extends BaseEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	private Integer quaterNo;
	
	private List<Integer> quaterMonths;
	
	private String quaterLastMonthDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getQuaterNo() {
		return quaterNo;
	}

	public void setQuaterNo(Integer quaterNo) {
		this.quaterNo = quaterNo;
	}

	public List<Integer> getQuaterMonths() {
		return quaterMonths;
	}

	public void setQuaterMonths(List<Integer> quaterMonths) {
		this.quaterMonths = quaterMonths;
	}

	public String getQuaterLastMonthDate() {
		return quaterLastMonthDate;
	}

	public void setQuaterLastMonthDate(String quaterLastMonthDate) {
		this.quaterLastMonthDate = quaterLastMonthDate;
	}

	
}
