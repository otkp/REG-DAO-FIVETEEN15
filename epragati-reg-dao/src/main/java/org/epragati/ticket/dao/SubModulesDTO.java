package org.epragati.ticket.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="sub_modules")
public class SubModulesDTO {
    @Id
	private String ticketModule;
	private String[] subServices;
	private  Boolean isEnable=Boolean.FALSE;
	public String getTicketModule() {
		return ticketModule;
	}
	public void setTicketModule(String ticketModule) {
		this.ticketModule = ticketModule;
	}
	public String[] getSubServices() {
		return subServices;
	}
	public void setSubServices(String[] subServices) {
		this.subServices = subServices;
	}
	public Boolean getIsEnable() {
		return isEnable;
	}
	public void setIsEnable(Boolean isEnable) {
		this.isEnable = isEnable;
	}
	
}
