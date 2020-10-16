package org.epragati.vcrImage.dto;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "vehicles_freeze_details")
public class FreezeVehiclsDTO extends BaseEntity implements Serializable {

	@Id
	private String userId;
	private List<String> prNo;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<String> getPrNo() {
		return prNo;
	}
	public void setPrNo(List<String> prNo) {
		this.prNo = prNo;
	}
	
	
	
	
}
