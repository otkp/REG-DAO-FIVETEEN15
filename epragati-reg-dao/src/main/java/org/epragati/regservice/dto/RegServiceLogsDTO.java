package org.epragati.regservice.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author naga.pulaparthi
 *
 */
@Document(collection = "registration_services_logs")
public class RegServiceLogsDTO extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6314961924179443842L;
	@Id
	private String id;
	private RegServiceDTO rgServDetails;
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
	 * @return the rgServDetails
	 */
	public RegServiceDTO getRgServDetails() {
		return rgServDetails;
	}
	/**
	 * @param rgServDetails the rgServDetails to set
	 */
	public void setRgServDetails(RegServiceDTO rgServDetails) {
		this.rgServDetails = rgServDetails;
	}

	



}
