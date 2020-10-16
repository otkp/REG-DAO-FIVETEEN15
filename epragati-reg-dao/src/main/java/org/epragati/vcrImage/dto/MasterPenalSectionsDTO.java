package org.epragati.vcrImage.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="master_vcr_penal_sections")
public class MasterPenalSectionsDTO extends BaseEntity{

	@Id
	private String id;
	private String penalSections;
	private boolean status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPenalSections() {
		return penalSections;
	}
	public void setPenalSections(String penalSections) {
		this.penalSections = penalSections;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
