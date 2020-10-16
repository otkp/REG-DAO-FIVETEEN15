package org.epragati.vcrImage.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="master_vcr_offending_sections")
public class MasterOffendingSectionsDTO extends BaseEntity {

	@Id
	private String id;
	private String offendingSection;
	private boolean status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOffendingSection() {
		return offendingSection;
	}
	public void setOffendingSection(String offendingSection) {
		this.offendingSection = offendingSection;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}
