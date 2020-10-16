package org.epragati.master.dto;

import java.io.Serializable;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author saroj.sahoo
 *
 */
@Document(collection = "master_country")
@CompoundIndexes({ 
	/*@CompoundIndex(name = "countryStatus", def = "{'countryStatus': 1}")*/
})
public class CountryDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	private String countryCode;

	private Integer countryId;

	private String countryName;

	private Boolean countryStatus;

	public Boolean getCountryStatus() {
		return countryStatus;
	}

	public void setCountryStatus(Boolean countryStatus) {
		this.countryStatus = countryStatus;
	}

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
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * @return the countryId
	 */
	public Integer getCountryId() {
		return countryId;
	}

	/**
	 * @param countryId the countryId to set
	 */
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "CountryDTO [id=" + id + ", countryCode=" + countryCode + ", countryId=" + countryId + ", countryName="
				+ countryName + ", countryStatus=" + countryStatus + "]";
	}

}
