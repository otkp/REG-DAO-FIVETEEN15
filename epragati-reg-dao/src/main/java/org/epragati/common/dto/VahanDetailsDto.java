package org.epragati.common.dto;

public class VahanDetailsDto {
	private String chassisNumber;
	private String engineNumber;
	private String vehicleClass;
	public String getChassisNumber() {
		return chassisNumber;
	}
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
	public String getVehicleClass() {
		return vehicleClass;
	}
	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}
	@Override
	public String toString() {
		return "VahanDetailsDto [chassisNumber=" + chassisNumber + ", engineNumber=" + engineNumber + ", vehicleClass="
				+ vehicleClass + "]";
	}

}
