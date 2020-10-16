package org.epragati.common.dto;

import java.util.List;

public class CollectionCorrectionModule {
	private String moduleName;
	private Boolean moduleStatus;
	private List<String> roles;

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public Boolean getModuleStatus() {
		return moduleStatus;
	}

	public void setModuleStatus(Boolean moduleStatus) {
		this.moduleStatus = moduleStatus;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
}
