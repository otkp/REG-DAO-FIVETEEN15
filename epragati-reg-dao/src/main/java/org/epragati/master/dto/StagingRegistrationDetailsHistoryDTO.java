package org.epragati.master.dto;

import java.io.Serializable;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "staging_registration_details_hist")
public class StagingRegistrationDetailsHistoryDTO extends BaseEntity implements Serializable , Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private StagingRegistrationDetailsDTO stagingDetails;
	private ActionDetailsDTO actionDetailsDTO;
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
	
	
}