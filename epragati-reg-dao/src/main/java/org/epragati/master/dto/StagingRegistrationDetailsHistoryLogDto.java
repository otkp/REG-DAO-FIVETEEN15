package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "staging_registration_details_log")
public class StagingRegistrationDetailsHistoryLogDto implements Serializable , Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private StagingRegistrationDetailsDTO stagingDetails;
	private ActionDetailsDTO actionDetailsDTO;
	private LocalDateTime modifiedDate;
	public StagingRegistrationDetailsDTO getStagingDetails() {
		return stagingDetails;
	}
	public void setStagingDetails(StagingRegistrationDetailsDTO stagingDetails) {
		this.stagingDetails = stagingDetails;
	}
	public ActionDetailsDTO getActionDetailsDTO() {
		return actionDetailsDTO;
	}
	public void setActionDetailsDTO(ActionDetailsDTO actionDetailsDTO) {
		this.actionDetailsDTO = actionDetailsDTO;
	}
	/**
	 * @return the modifiedDate
	 */
	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}
	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	

}
