package org.epragati.master.dto;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_bodytype")
@CompoundIndexes({ 
	@CompoundIndex(name = "status", def = "{'status': 1}"),
	@CompoundIndex(name = "bodyTypeId_and_status", def = "{'bodyTypeId': 1}, 'status': 1}")
})
public class BodyTypeDTO extends BaseEntity{
	@Id
	private String id;

	private Integer bodyTypeId;

	private String bodyType;

	private Boolean status;

	

	public Integer getBodyTypeId() {
		return bodyTypeId;
	}

	public void setBodyTypeId(Integer bodyTypeId) {
		this.bodyTypeId = bodyTypeId;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
