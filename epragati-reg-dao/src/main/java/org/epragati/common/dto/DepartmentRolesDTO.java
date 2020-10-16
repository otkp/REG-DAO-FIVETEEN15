package org.epragati.common.dto;

import java.util.List;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
public class DepartmentRolesDTO {
	
	private List<DepartmentRolesStatus> rolesStatus;

	public List<DepartmentRolesStatus> getRolesStatus() {
		return rolesStatus;
	}

	public void setRolesStatus(List<DepartmentRolesStatus> rolesStatus) {
		this.rolesStatus = rolesStatus;
	}
}
