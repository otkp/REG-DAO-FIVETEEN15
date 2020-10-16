package org.epragati.master.dto;

import java.time.LocalDate;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_bileteral_state_config")
public class MasterBileteralTaxStatesConfig {

	@Id
	private String id;
	private String stateName;
	private Integer totalCount;
	private Integer availableCount;
	private Integer usedCount;
	private String cutOffDateAndMonth;
	private boolean status;
	private LocalDate yearEndDate;
	private Map<String,Integer> log;
	
	
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getAvailableCount() {
		return availableCount;
	}
	public void setAvailableCount(Integer availableCount) {
		this.availableCount = availableCount;
	}
	public Integer getUsedCount() {
		return usedCount;
	}
	public void setUsedCount(Integer usedCount) {
		this.usedCount = usedCount;
	}
	
	public Map<String, Integer> getLog() {
		return log;
	}
	public void setLog(Map<String, Integer> log) {
		this.log = log;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCutOffDateAndMonth() {
		return cutOffDateAndMonth;
	}
	public void setCutOffDateAndMonth(String cutOffDateAndMonth) {
		this.cutOffDateAndMonth = cutOffDateAndMonth;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public LocalDate getYearEndDate() {
		return yearEndDate;
	}
	public void setYearEndDate(LocalDate yearEndDate) {
		this.yearEndDate = yearEndDate;
	}
	
	
}
