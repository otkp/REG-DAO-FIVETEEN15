package org.epragati.master.dto;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_vcroffences_illicits")
public class VcrOffencesIllicitsDTO {

	private Integer templateId;
	private String name;
	private String language;
	private String illicitType;
	private String description;
	
	
	public Integer getTemplateId() {
		return templateId;
	}


	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public String getIllicitType() {
		return illicitType;
	}


	public void setIllicitType(String illicitType) {
		this.illicitType = illicitType;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "VcrOffencesIllicitsDTO [templateId=" + templateId + ", name=" + name + ", language=" + language
				+ ", illicitType=" + illicitType + ", description=" + description + "]";
	}

	
	
}
