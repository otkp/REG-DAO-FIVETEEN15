package org.epragati.uidailogin.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "uidai_login_status_type")
public class LoginStatusType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private Boolean udaiLoginStatus;
	private LocalDateTime lupdateTime;
	private String description;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Boolean isUdaiLoginStatus() {
		return udaiLoginStatus;
	}

	public void setUdaiLoginStatus(Boolean udaiLoginStatus) {
		this.udaiLoginStatus = udaiLoginStatus;
	}

	public LocalDateTime getLupdateTime() {
		return lupdateTime;
	}

	public void setLupdateTime(LocalDateTime lupdateTime) {
		this.lupdateTime = lupdateTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
