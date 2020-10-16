package org.epragati.dto.enclosure;

import org.epragati.util.payment.ServiceEnum;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="temporary_enclosures")
public class TemporaryEnclosuresDTO extends CitizenEnclosuresLogsDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8193366696888955129L;
	
	private Boolean status;
	private Boolean uploaded;
	private ServiceEnum serviceType;
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public ServiceEnum getServiceType() {
		return serviceType;
	}
	public void setServiceType(ServiceEnum serviceType) {
		this.serviceType = serviceType;
	}
	public Boolean getUploaded() {
		return uploaded;
	}
	public void setUploaded(Boolean uploaded) {
		this.uploaded = uploaded;
	}
	
	
	
	

	
}
