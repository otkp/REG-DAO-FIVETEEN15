package org.epragati.master.dto;

import java.util.List;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection="master_insurancetype")
public class InsuranceTypeDTO extends BaseEntity{
	
	@Id
	private String id;
	
	private  String insId;
	
	private  String insDescription;
	
	private  String status;
	
	private List<Integer> tenure;
	
	private Integer nicCode;
	
	
	

	/**
	 * @return the nicCode
	 */
	public Integer getNicCode() {
		return nicCode;
	}

	/**
	 * @param nicCode the nicCode to set
	 */
	public void setNicCode(Integer nicCode) {
		this.nicCode = nicCode;
	}

	/**
	 * @return the tenure
	 */
	public List<Integer> getTenure() {
		return tenure;
	}

	/**
	 * @param tenure the tenure to set
	 */
	public void setTenure(List<Integer> tenure) {
		this.tenure = tenure;
	}

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
	 * @return the insId
	 */
	public String getInsId() {
		return insId;
	}

	/**
	 * @param insId the insId to set
	 */
	public void setInsId(String insId) {
		this.insId = insId;
	}

	/**
	 * @return the insDescription
	 */
	public String getInsDescription() {
		return insDescription;
	}

	/**
	 * @param insDescription the insDescription to set
	 */
	public void setInsDescription(String insDescription) {
		this.insDescription = insDescription;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InsuranceTypeDTO [id=" + id + ", insId=" + insId + ", insDescription=" + insDescription + ", status="
				+ status + "]";
	}

}
