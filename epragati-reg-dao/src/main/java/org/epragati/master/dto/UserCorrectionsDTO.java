package org.epragati.master.dto;

import java.util.List;

import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.util.document.KeyValue;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_users_correction_log")
public class UserCorrectionsDTO extends UserDTO {
	private static final long serialVersionUID = 1L;
	
	private List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures;
	
	/**
	 * @return the enclosures
	 */
	public List<KeyValue<String, List<ImageEnclosureDTO>>> getEnclosures() {
		return enclosures;
	}

	/**
	 * @param enclosures the enclosures to set
	 */
	public void setEnclosures(List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures) {
		this.enclosures = enclosures;
	}	

}
