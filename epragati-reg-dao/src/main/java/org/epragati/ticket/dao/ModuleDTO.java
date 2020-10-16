package org.epragati.ticket.dao;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="modules")
public class ModuleDTO {
	
	private String module;
	private List<ModuleTypes>types;
	private Boolean isEnable=Boolean.FALSE;
	public String getModule() {
		return module;
	}
	
	public List<ModuleTypes> getTypes() {
		return types;
	}

	public void setTypes(List<ModuleTypes> types) {
		this.types = types;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public Boolean getIsEnable() {
		return isEnable;
	}
	public void setIsEnable(Boolean isEnable) {
		this.isEnable = isEnable;
	}
	

}
