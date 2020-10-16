package org.epragati.common.dto;

import java.time.LocalDateTime;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "last_five_days_data")
public class LastFiveDaysCollectionsDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5278648767586118989L;

	@Id
	private String id;
	private LocalDateTime Date;
	private String collectionName;
	private Object collectionData;

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
	 * @return the collectionName
	 */
	public String getCollectionName() {
		return collectionName;
	}

	/**
	 * @param collectionName the collectionName to set
	 */
	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}

	/**
	 * @return the date
	 */
	public LocalDateTime getDate() {
		return Date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDateTime date) {
		Date = date;
	}

	/**
	 * @return the collectionData
	 */
	public Object getCollectionData() {
		return collectionData;
	}

	/**
	 * @param collectionData the collectionData to set
	 */
	public void setCollectionData(Object collectionData) {
		this.collectionData = collectionData;
	}

}
