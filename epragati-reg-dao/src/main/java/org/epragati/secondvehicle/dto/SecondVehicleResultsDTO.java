package org.epragati.secondvehicle.dto;

import java.util.List;

import org.epragati.common.dto.BaseEntity;

public class SecondVehicleResultsDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ActionBy;
	private String role;
	private boolean found;
	private List<SecondVehicleDataDTO> secondVehicleData;

	/**
	 * @return the actionBy
	 */
	public String getActionBy() {
		return ActionBy;
	}

	/**
	 * @param actionBy
	 *            the actionBy to set
	 */
	public void setActionBy(String actionBy) {
		ActionBy = actionBy;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role
	 *            the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the secondVehicleData
	 */
	public List<SecondVehicleDataDTO> getSecondVehicleData() {
		return secondVehicleData;
	}

	/**
	 * @param secondVehicleData
	 *            the secondVehicleData to set
	 */
	public void setSecondVehicleData(List<SecondVehicleDataDTO> secondVehicleData) {
		this.secondVehicleData = secondVehicleData;
	}

	/**
	 * @return the found
	 */
	public boolean isFound() {
		return found;
	}

	/**
	 * @param found
	 *            the found to set
	 */
	public void setFound(boolean found) {
		this.found = found;
	}

}
