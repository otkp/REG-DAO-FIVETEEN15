package org.epragati.regservice.dto;

import java.io.Serializable;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "services_invalid_details")
public class ServicesInvalidDetailsDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9051052681241123885L;

	@Id
	private String id;

	private String invalidJson;

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
	 * @return the invalidJson
	 */
	public String getInvalidJson() {
		return invalidJson;
	}

	/**
	 * @param invalidJson the invalidJson to set
	 */
	public void setInvalidJson(String invalidJson) {
		this.invalidJson = invalidJson;
	}

}
