package org.epragati.master.dto;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author sairam.cheruku
 *
 */
@Document(collection = "master_blood_group")
@CompoundIndexes({ 
	/*@CompoundIndex(name = "active", def = "{'active': 1}")*/
})
public class BloodGroupDTO  extends BaseEntity{

	@Id
	private String id;

	private String slNo;

	private String bloodGrpName;

	private Boolean active;

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	/*@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.mmm")
	private LocalDateTime createdOn;*/

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSlNo() {
		return slNo;
	}

	public void setSlNo(String slNo) {
		this.slNo = slNo;
	}

	public String getBloodGrpName() {
		return bloodGrpName;
	}

	public void setBloodGrpName(String bloodGrpName) {
		this.bloodGrpName = bloodGrpName;
	}

	

	
}