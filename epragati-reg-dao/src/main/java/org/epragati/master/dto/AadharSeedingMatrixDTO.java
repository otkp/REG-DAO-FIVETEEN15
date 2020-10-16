package org.epragati.master.dto;

import java.io.Serializable;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author venkateswarlu.udiga
 *
 */

@Document(collection = "reg_aadhaar_seeding_matrix")
public class AadharSeedingMatrixDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String code;
	private String approvalStatus;
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
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the approvalStatus
	 */
	public String getApprovalStatus() {
		return approvalStatus;
	}
	/**
	 * @param approvalStatus the approvalStatus to set
	 */
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

}
