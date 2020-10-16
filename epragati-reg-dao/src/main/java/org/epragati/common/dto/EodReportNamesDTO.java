package org.epragati.common.dto;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
public class EodReportNamesDTO {

	private String serviceType;
	
	private String serviceName;
	
	private Boolean status;

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
}
