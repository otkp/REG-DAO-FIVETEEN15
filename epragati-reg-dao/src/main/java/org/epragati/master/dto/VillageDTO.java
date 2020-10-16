package org.epragati.master.dto;

import java.io.Serializable;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author saroj.sahoo
 *
 */
@Document(collection = "master_village")
public class VillageDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	//private Integer vid;

	//private String mid;

	//private String vname;
	
	private Integer mandalId;
	
	private String status;
	
	private Integer villageCode;
	
	private Integer villageId;
	
	private String villageName;

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
	 * @return the mandalId
	 */
	public Integer getMandalId() {
		return mandalId;
	}

	/**
	 * @param mandalId the mandalId to set
	 */
	public void setMandalId(Integer mandalId) {
		this.mandalId = mandalId;
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

	/**
	 * @return the villageCode
	 */
	public Integer getVillageCode() {
		return villageCode;
	}

	/**
	 * @param villageCode the villageCode to set
	 */
	public void setVillageCode(Integer villageCode) {
		this.villageCode = villageCode;
	}

	/**
	 * @return the villageId
	 */
	public Integer getVillageId() {
		return villageId;
	}

	/**
	 * @param villageId the villageId to set
	 */
	public void setVillageId(Integer villageId) {
		this.villageId = villageId;
	}

	/**
	 * @return the villageName
	 */
	public String getVillageName() {
		return villageName;
	}

	/**
	 * @param villageName the villageName to set
	 */
	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VillageDTO [id=" + id + ", mandalId=" + mandalId + ", status=" + status + ", villageCode=" + villageCode
				+ ", villageId=" + villageId + ", villageName=" + villageName + "]";
	}
}
