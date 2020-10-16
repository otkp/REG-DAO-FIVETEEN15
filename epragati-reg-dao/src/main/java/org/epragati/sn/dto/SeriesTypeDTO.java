package org.epragati.sn.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_type_series")
@CompoundIndexes({
	@CompoundIndex(name = "seriesStatus", def = "{'seriesStatus': 1}")
})
public class SeriesTypeDTO extends BaseEntity{

	@Id
	private String id;
	private String seriesTypeId;
	private String seriesDescription;
	private String seriesStatus;
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
	 * @return the seriesTypeId
	 */
	public String getSeriesTypeId() {
		return seriesTypeId;
	}
	/**
	 * @param seriesTypeId the seriesTypeId to set
	 */
	public void setSeriesTypeId(String seriesTypeId) {
		this.seriesTypeId = seriesTypeId;
	}
	/**
	 * @return the seriesDescription
	 */
	public String getSeriesDescription() {
		return seriesDescription;
	}
	/**
	 * @param seriesDescription the seriesDescription to set
	 */
	public void setSeriesDescription(String seriesDescription) {
		this.seriesDescription = seriesDescription;
	}
	/**
	 * @return the seriesTypeStatus
	 */
	public String getseriesStatus() {
		return seriesStatus;
	}
	/**
	 * @param seriesStatus the seriesTypeStatus to set
	 */
	public void setSeriesStatus(String seriesStatus) {
		this.seriesStatus = seriesStatus;
	}
	
	
	
}
