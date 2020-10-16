package org.epragati.availabilitycofig.dto;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author naga.pulaparthi
 * ServiceAvailabilityConfigDTO only for temporarily.  
 *Need to remove below method After Application Stable.
 */
@Document(collection="registration_service_availability_config")
public class ServiceAvailabilityConfigDTO {
	
	@Id
	private String id;
	
	List<String> officeCodes;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the officeCodes
	 */
	public List<String> getOfficeCodes() {
		return officeCodes;
	}

	/**
	 * @param officeCodes the officeCodes to set
	 */
	public void setOfficeCodes(List<String> officeCodes) {
		this.officeCodes = officeCodes;
	}
	
	
}
