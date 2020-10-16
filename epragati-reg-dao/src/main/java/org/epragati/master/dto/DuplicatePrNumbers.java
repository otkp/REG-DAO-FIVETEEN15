package org.epragati.master.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Duplicate_Pr_Numbers")
public class DuplicatePrNumbers extends BaseEntity {

	private String pr;
	private Integer prCount;
	
	
	/**
	 * @return the pr
	 */
	public String getPr() {
		return pr;
	}
	/**
	 * @param pr the pr to set
	 */
	public void setPr(String pr) {
		this.pr = pr;
	}
	/**
	 * @return the prCount
	 */
	public Integer getPrCount() {
		return prCount;
	}
	/**
	 * @param prCount the prCount to set
	 */
	public void setPrCount(Integer prCount) {
		this.prCount = prCount;
	}
	
	
}
