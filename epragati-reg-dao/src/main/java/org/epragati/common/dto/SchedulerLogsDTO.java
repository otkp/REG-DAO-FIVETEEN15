package org.epragati.common.dto;

import java.time.LocalDateTime;
import java.util.List;

import org.epragati.constants.Schedulers;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "scheduler_log")
public class SchedulerLogsDTO extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	private Schedulers name;
	
	private LocalDateTime startTime;
	
	private LocalDateTime endTime;
	
	private Boolean isExecuteSucess;
	
	private String errorMessage;
	
	private List<String> internalErrors;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Schedulers getName() {
		return name;
	}

	public void setName(Schedulers name) {
		this.name = name;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public Boolean getIsExecuteSucess() {
		return isExecuteSucess;
	}

	public void setIsExecuteSucess(Boolean isExecuteSucess) {
		this.isExecuteSucess = isExecuteSucess;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<String> getInternalErrors() {
		return internalErrors;
	}

	public void setInternalErrors(List<String> internalErrors) {
		this.internalErrors = internalErrors;
	}

}
