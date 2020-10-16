package org.epragati.master.dto;

import java.util.List;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
public class RTADashBoardLinksDTO {

	private String moduleImage;
	
	private String moduleTitle;
	
	private List<RTADashBoardServiceNames> serviceNames;

	public String getModuleImage() {
		return moduleImage;
	}

	public void setModuleImage(String moduleImage) {
		this.moduleImage = moduleImage;
	}

	public String getModuleTitle() {
		return moduleTitle;
	}

	public void setModuleTitle(String moduleTitle) {
		this.moduleTitle = moduleTitle;
	}

	public List<RTADashBoardServiceNames> getServiceNames() {
		return serviceNames;
	}

	public void setServiceNames(List<RTADashBoardServiceNames> serviceNames) {
		this.serviceNames = serviceNames;
	}
	
	
}
