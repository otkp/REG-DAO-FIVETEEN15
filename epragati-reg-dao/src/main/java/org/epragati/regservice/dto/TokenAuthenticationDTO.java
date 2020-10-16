package org.epragati.regservice.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "token_authentication_requests")
public class TokenAuthenticationDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String token;

	private String hash;

	/*@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime createdDate;
*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime expirationDate;
	
	private LocalDateTime logOutTime;

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
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the hash
	 */
	public String getHash() {
		return hash;
	}

	/**
	 * @param hash the hash to set
	 */
	public void setHash(String hash) {
		this.hash = hash;
	}
/*
	*//**
	 * @return the createdDate
	 *//*
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	*//**
	 * @param createdDate the createdDate to set
	 *//*
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
*/
	/**
	 * @return the expirationDate
	 */
	public LocalDateTime getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(LocalDateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	public LocalDateTime getLogOutTime() {
		return logOutTime;
	}

	public void setLogOutTime(LocalDateTime logOutTime) {
		this.logOutTime = logOutTime;
	}
	
	

}
