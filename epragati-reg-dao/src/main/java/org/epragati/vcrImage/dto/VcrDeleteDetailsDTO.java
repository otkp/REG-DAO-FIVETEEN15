package org.epragati.vcrImage.dto;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="table_vcr_delete_details")
public class VcrDeleteDetailsDTO extends VcrFinalServiceDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6276831218646786937L;

	private boolean deleteVcrConfirmation;

	public boolean isDeleteVcrConfirmation() {
		return deleteVcrConfirmation;
	}

	public void setDeleteVcrConfirmation(boolean deleteVcrConfirmation) {
		this.deleteVcrConfirmation = deleteVcrConfirmation;
	}
	
	
	
	
}
