package org.epragati.regservice.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "registration_services_unlock_details")
public class RegServiceUnlockDTO  extends BaseEntity {
	
	@Id
	private String id;
	
	private String unlockedBy;
	private String ip;
	private RegServiceDTO regServe;
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
	 * @return the unlockedBy
	 */
	public String getUnlockedBy() {
		return unlockedBy;
	}
	/**
	 * @param unlockedBy the unlockedBy to set
	 */
	public void setUnlockedBy(String unlockedBy) {
		this.unlockedBy = unlockedBy;
	}
	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	/**
	 * @return the regServe
	 */
	public RegServiceDTO getRegServe() {
		return regServe;
	}
	/**
	 * @param regServe the regServe to set
	 */
	public void setRegServe(RegServiceDTO regServe) {
		this.regServe = regServe;
	}

	

}
