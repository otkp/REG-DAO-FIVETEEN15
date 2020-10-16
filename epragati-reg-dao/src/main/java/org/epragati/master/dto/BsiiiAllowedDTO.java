package org.epragati.master.dto;

import java.io.Serializable;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection = "master_bsiii_allowed")
public class BsiiiAllowedDTO extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2192009343566694785L;
	
	private String chassisNo;
	private String engineNo;
	private boolean status;
	/**
	 * @return the chassisNo
	 */
	public String getChassisNo() {
		return chassisNo;
	}
	/**
	 * @param chassisNo the chassisNo to set
	 */
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}
	/**
	 * @return the engineNo
	 */
	public String getEngineNo() {
		return engineNo;
	}
	/**
	 * @param engineNo the engineNo to set
	 */
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BsiiiAllowedDTO [chassisNo=" + chassisNo + ", engineNo=" + engineNo + ", status=" + status + "]";
	}
}
