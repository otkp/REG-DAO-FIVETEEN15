package org.epragati.master.dto;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saikiran.kola
 *
 */
@Document(collection = "master_dealer_maker")
@CompoundIndexes({ 
	@CompoundIndex(name = "mmId", def = "{'mmId': 1}"),
	@CompoundIndex(name = "rId_and_status", def = "{'rId': 1, 'status': 1}")
})
public class DealerMakerDTO extends BaseEntity{

	@Id
	private String id;

	private Integer dmId;

	private Integer rId;

	private Integer mmId;

	private Boolean status;

	private String applicationNo;

	public Integer getDmId() {
		return dmId;
	}

	public void setDmId(Integer dmId) {
		this.dmId = dmId;
	}

	public Integer getrId() {
		return rId;
	}

	public void setrId(Integer rId) {
		this.rId = rId;
	}

	public Integer getMmId() {
		return mmId;
	}

	public void setMmId(Integer mmId) {
		this.mmId = mmId;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
