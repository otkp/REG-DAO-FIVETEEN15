package org.epragati.master.dto;

import java.util.List;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author sairam.cheruku
 *
 */
@Document(collection = "master_trseries")
public class TrSeriesDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private Integer trDistrictId;
	
	private Integer startFrom;

	private Integer endTo;

	private Boolean status;

	private List<String> finishedSeries;

	private List<String> pendingSeries;
	
	private String series;
	
	private Integer currentNo;

	public Integer getCurrentNo() {
		return currentNo;
	}

	public void setCurrentNo(Integer currentNo) {
		this.currentNo = currentNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	

	public Integer getStartFrom() {
		return startFrom;
	}

	public void setStartFrom(Integer startFrom) {
		this.startFrom = startFrom;
	}

	public Integer getEndTo() {
		return endTo;
	}

	public void setEndTo(Integer endTo) {
		this.endTo = endTo;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public List<String> getFinishedSeries() {
		return finishedSeries;
	}

	public void setFinishedSeries(List<String> finishedSeries) {
		this.finishedSeries = finishedSeries;
	}

	public List<String> getPendingSeries() {
		return pendingSeries;
	}

	public void setPendingSeries(List<String> pendingSeries) {
		this.pendingSeries = pendingSeries;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public Integer getTrDistrictId() {
		return trDistrictId;
	}

	public void setTrDistrictId(Integer trDistrictId) {
		this.trDistrictId = trDistrictId;
	}

	
	
}
