package org.epragati.master.dto;

import java.io.Serializable;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author sairam.cheruku
 *
 */
@Document(collection = "master_finance_type")
public class MasterFinanceTypeDTO extends BaseEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	private Integer finId;
	
	private String financeType;
	
	private Boolean status;

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
	 * @return the finId
	 */
	public Integer getFinId() {
		return finId;
	}

	/**
	 * @param finId the finId to set
	 */
	public void setFinId(Integer finId) {
		this.finId = finId;
	}

	/**
	 * @return the financeType
	 */
	public String getFinanceType() {
		return financeType;
	}

	/**
	 * @param financeType the financeType to set
	 */
	public void setFinanceType(String financeType) {
		this.financeType = financeType;
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
	
	
	

}
