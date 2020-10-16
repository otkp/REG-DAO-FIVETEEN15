package org.epragati.master.dto;

import java.io.Serializable;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection = "master_bharathStage")
public class BharathStageDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3144585469943994391L;
	
	private String bharathStage;
	private boolean bsAllowed;
	/**
	 * @return the bharathStage
	 */
	public String getBharathStage() {
		return bharathStage;
	}
	/**
	 * @param bharathStage the bharathStage to set
	 */
	public void setBharathStage(String bharathStage) {
		this.bharathStage = bharathStage;
	}
	/**
	 * @return the bsAllowed
	 */
	public boolean isBsAllowed() {
		return bsAllowed;
	}
	/**
	 * @param bsAllowed the bsAllowed to set
	 */
	public void setBsAllowed(boolean bsAllowed) {
		this.bsAllowed = bsAllowed;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BharathStageDTO [bharathStage=" + bharathStage + ", bsAllowed=" + bsAllowed + "]";
	}

}
