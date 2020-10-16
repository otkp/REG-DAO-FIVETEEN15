package org.epragati.master.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author sairam.cheruku
 *
 */
@Document(collection = "master_ownership")
/*@CompoundIndexes({
	@CompoundIndex(name ="description",def ="{'description':1}")
})*/
public class OwnershipDTO  {

	@Id
	private String id;

	private Integer oId;

	private String code;

	private String description;

	private LocalDateTime createdDate;

	private LocalDateTime lUpdate;
	
	private Boolean status;

	private Integer nicOwnerCode;
	
	private List<String> nicCodes;
	
	
	
	/**
	 * @return the nicCodes
	 */
	public List<String> getNicCodes() {
		return nicCodes;
	}

	/**
	 * @param nicCodes the nicCodes to set
	 */
	public void setNicCodes(List<String> nicCodes) {
		this.nicCodes = nicCodes;
	}

	/**
	 * @return the nicOwnerCode
	 */
	public Integer getNicOwnerCode() {
		return nicOwnerCode;
	}

	/**
	 * @param nicOwnerCode the nicOwnerCode to set
	 */
	public void setNicOwnerCode(Integer nicOwnerCode) {
		this.nicOwnerCode = nicOwnerCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getoId() {
		return oId;
	}

	public void setoId(Integer oId) {
		this.oId = oId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getlUpdate() {
		return lUpdate;
	}

	public void setlUpdate(LocalDateTime lUpdate) {
		this.lUpdate = lUpdate;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
