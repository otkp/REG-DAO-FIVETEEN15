package org.epragati.master.dto;

import java.io.Serializable;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "show_cause_sections")
public class ShowCauseSectionDTO extends BaseEntity  implements Serializable {
	
	private String sectionCode;
	
	private String status;
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSectionCode() {
		return sectionCode;
	}

	public void setSectionCode(String sectionCode) {
		this.sectionCode = sectionCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
