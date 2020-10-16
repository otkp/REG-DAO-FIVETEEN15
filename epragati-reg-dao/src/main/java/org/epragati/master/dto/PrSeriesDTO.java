package org.epragati.master.dto;

import java.util.List;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author sairam.cheruku
 *
 */
@Document(collection = "master_prseries")
public class PrSeriesDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String series;
	private String officeCode;
	private Integer prDistrictId;
	private Boolean status;
	private Integer prcId;
	private Integer startFrom;
	private Integer endTo;
	private List<String> pendingSeries;
	private List<String> finishedSeries;
	private Integer currentNumber;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public Integer getPrDistrictId() {
		return prDistrictId;
	}
	public void setPrDistrictId(Integer prDistrictId) {
		this.prDistrictId = prDistrictId;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Integer getPrcId() {
		return prcId;
	}
	public void setPrcId(Integer prcId) {
		this.prcId = prcId;
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
	public List<String> getPendingSeries() {
		return pendingSeries;
	}
	public void setPendingSeries(List<String> pendingSeries) {
		this.pendingSeries = pendingSeries;
	}
	public List<String> getFinishedSeries() {
		return finishedSeries;
	}
	public void setFinishedSeries(List<String> finishedSeries) {
		this.finishedSeries = finishedSeries;
	}
	public Integer getCurrentNumber() {
		return currentNumber;
	}
	public void setCurrentNumber(Integer currentNumber) {
		this.currentNumber = currentNumber;
	}
	
	

}