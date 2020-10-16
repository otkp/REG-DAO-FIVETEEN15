package org.epragati.master.dto;

import java.time.LocalDateTime;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author saikiran.kola
 *
 */
@Document(collection = "master_status")
public class StatusDTO {

	@Id
	private String id;

	private Integer sId;

	private String description;

	private Integer status;

	private LocalDateTime createdDate;

	private LocalDateTime lUpdate;

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public String getDescription() {
		return description;
	}

	public String getId() {
		return id;
	}

	public LocalDateTime getlUpdate() {
		return lUpdate;
	}

	public Integer getsId() {
		return sId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setlUpdate(LocalDateTime lUpdate) {
		this.lUpdate = lUpdate;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
