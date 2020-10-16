package org.epragati.common.dto;

import org.epragati.util.payment.ServiceEnum;

public class AutoActionDTO {

	private Integer days;
	
	private ServiceEnum serviceName;
	
	private Integer serviceId;
	
	private Boolean status;

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public ServiceEnum getServiceName() {
		return serviceName;
	}

	public void setServiceName(ServiceEnum serviceName) {
		this.serviceName = serviceName;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	
}
