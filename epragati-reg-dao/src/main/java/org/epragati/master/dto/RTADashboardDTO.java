package org.epragati.master.dto;

import java.util.List;

import org.epragati.util.RoleEnum;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Document(collection = "roles_by_dashboard")
@JsonInclude(Include.NON_NULL)
public class RTADashboardDTO {
	
    private RoleEnum role;
    
	private String dashBoardTitle;
	
	private List<RTADashBoardLinksDTO> registartionServices;
	private List<RTADashBoardLinksDTO> dlServices;
	private String otherServicesTitle;
	
	private List<RTAOtherServicesTitles> otherServicesList;
	
	public RoleEnum getRole() {
		return role;
	}

	public void setRole(RoleEnum role) {
		this.role = role;
	}

	public String getDashBoardTitle() {
		return dashBoardTitle;
	}

	public void setDashBoardTitle(String dashBoardTitle) {
		this.dashBoardTitle = dashBoardTitle;
	}

	public List<RTADashBoardLinksDTO> getRegistartionServices() {
		return registartionServices;
	}

	public void setRegistartionServices(List<RTADashBoardLinksDTO> registartionServices) {
		this.registartionServices = registartionServices;
	}

	public String getOtherServicesTitle() {
		return otherServicesTitle;
	}

	public void setOtherServicesTitle(String otherServicesTitle) {
		this.otherServicesTitle = otherServicesTitle;
	}

	public List<RTAOtherServicesTitles> getOtherServicesList() {
		return otherServicesList;
	}

	public void setOtherServicesList(List<RTAOtherServicesTitles> otherServicesList) {
		this.otherServicesList = otherServicesList;
	}

	public List<RTADashBoardLinksDTO> getDlServices() {
		return dlServices;
	}

	public void setDlServices(List<RTADashBoardLinksDTO> dlServices) {
		this.dlServices = dlServices;
	}
	
	
	
}
