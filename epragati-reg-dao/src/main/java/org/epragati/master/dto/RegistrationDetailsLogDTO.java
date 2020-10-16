package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "registration_details_log")
@CompoundIndexes({
	
	// @CompoundIndex(name = "regiDetails.application_number", def = "{'applicationNo': 1}"),
	 @CompoundIndex(name = "regiDetails.application_number_logCreatedDateTime", def = "{'applicationNo': 1,logCreatedDateTime:1}")
})
public class RegistrationDetailsLogDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2049605922960067126L;

	@Id
	private String id;

	private RegistrationDetailsDTO regiDetails;

	private String logCreatedDateStr;

	private LocalDateTime logCreatedDateTime;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the regiDetails
	 */
	public RegistrationDetailsDTO getRegiDetails() {
		return regiDetails;
	}

	/**
	 * @param regiDetails
	 *            the regiDetails to set
	 */
	public void setRegiDetails(RegistrationDetailsDTO regiDetails) {
		this.regiDetails = regiDetails;
	}

	/**
	 * @return the logCreatedDateStr
	 */
	public String getLogCreatedDateStr() {
		return logCreatedDateStr;
	}

	/**
	 * @param logCreatedDateStr
	 *            the logCreatedDateStr to set
	 */
	public void setLogCreatedDateStr(String logCreatedDateStr) {
		this.logCreatedDateStr = logCreatedDateStr;
	}

	/**
	 * @return the logCreatedDateTime
	 */
	public LocalDateTime getLogCreatedDateTime() {
		return logCreatedDateTime;
	}

	/**
	 * @param logCreatedDateTime
	 *            the logCreatedDateTime to set
	 */
	public void setLogCreatedDateTime(LocalDateTime logCreatedDateTime) {
		this.logCreatedDateTime = logCreatedDateTime;
	}

}