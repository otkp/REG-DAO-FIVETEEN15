package org.epragati.master.dto;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "query_exceutiontime_details")
public class QueryExecutionDetailsDTO {
	
	
	private Long totalJVMMemory;
	
	private Long freeJVMMemory;
	
	private LocalDateTime executionStartedTime;
	
	private LocalDateTime executionEndTime;
	
	private Long executedTime;
	
	private String queryExecuted;

	public Long getTotalJVMMemory() {
		return totalJVMMemory;
	}

	public void setTotalJVMMemory(Long totalJVMMemory) {
		this.totalJVMMemory = totalJVMMemory;
	}

	public Long getFreeJVMMemory() {
		return freeJVMMemory;
	}

	public void setFreeJVMMemory(Long freeJVMMemory) {
		this.freeJVMMemory = freeJVMMemory;
	}

	public LocalDateTime getExecutionStartedTime() {
		return executionStartedTime;
	}

	public void setExecutionStartedTime(LocalDateTime executionStartedTime) {
		this.executionStartedTime = executionStartedTime;
	}

	public LocalDateTime getExecutionEndTime() {
		return executionEndTime;
	}

	public void setExecutionEndTime(LocalDateTime executionEndTime) {
		this.executionEndTime = executionEndTime;
	}

	public Long getExecutedTime() {
		return executedTime;
	}

	public void setExecutedTime(Long executedTime) {
		this.executedTime = executedTime;
	}

	public String getQueryExecuted() {
		return queryExecuted;
	}

	public void setQueryExecuted(String queryExecuted) {
		this.queryExecuted = queryExecuted;
	}
	

}
