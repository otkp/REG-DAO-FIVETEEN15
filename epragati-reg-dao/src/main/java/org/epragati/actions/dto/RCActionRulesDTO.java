package org.epragati.actions.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="master_sus_sections")
public class RCActionRulesDTO extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	
	private String section;
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	
	

}
