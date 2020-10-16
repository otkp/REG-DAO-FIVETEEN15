package org.epragati.master.dto;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "staging_registration_unremoved_docs")
public class StagingUnremovedApplicationsDTO extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String stagingApplicationNo;

	/**
	 * @return the stagingApplicationNo
	 */
	public String getStagingApplicationNo() {
		return stagingApplicationNo;
	}

	/**
	 * @param stagingApplicationNo the stagingApplicationNo to set
	 */
	public void setStagingApplicationNo(String stagingApplicationNo) {
		this.stagingApplicationNo = stagingApplicationNo;
	}


	
}
