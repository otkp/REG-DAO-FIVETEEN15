package org.epragati.master.dto;


import java.io.Serializable;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection="master_designation")
public class DesignationDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	private String deptId;
	
	private String desigId;
	
	private String desigName;
	
	private String desigStatus;

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
	 * @return the deptId
	 */
	public String getDeptId() {
		return deptId;
	}

	/**
	 * @param deptId the deptId to set
	 */
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	/**
	 * @return the desigId
	 */
	public String getDesigId() {
		return desigId;
	}

	/**
	 * @param desigId the desigId to set
	 */
	public void setDesigId(String desigId) {
		this.desigId = desigId;
	}

	/**
	 * @return the desigName
	 */
	public String getDesigName() {
		return desigName;
	}

	/**
	 * @param desigName the desigName to set
	 */
	public void setDesigName(String desigName) {
		this.desigName = desigName;
	}

	/**
	 * @return the desigStatus
	 */
	public String getDesigStatus() {
		return desigStatus;
	}

	/**
	 * @param desigStatus the desigStatus to set
	 */
	public void setDesigStatus(String desigStatus) {
		this.desigStatus = desigStatus;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DesignationDTO [id=" + id + ", deptId=" + deptId + ", desigId=" + desigId + ", desigName=" + desigName
				+ ", desigStatus=" + desigStatus + "]";
	}
	
}
