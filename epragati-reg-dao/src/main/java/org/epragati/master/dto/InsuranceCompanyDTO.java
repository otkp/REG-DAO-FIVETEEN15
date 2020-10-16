package org.epragati.master.dto;

import java.io.Serializable;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection="master_insurancecompany")
/*@CompoundIndexes({
	@CompoundIndex(name ="insCompidDescription",def ="{'insCompidDescription':1}")
})*/
public class InsuranceCompanyDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	private String insCompId;
	
	private String insCompidDescription;
	
	private Boolean status;

	private Integer nicInsuranceCode;
	
	
	
	

	/**
	 * @return the nicInsuranceCode
	 */
	public Integer getNicInsuranceCode() {
		return nicInsuranceCode;
	}



	/**
	 * @param nicInsuranceCode the nicInsuranceCode to set
	 */
	public void setNicInsuranceCode(Integer nicInsuranceCode) {
		this.nicInsuranceCode = nicInsuranceCode;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getInsCompId() {
		return insCompId;
	}



	public void setInsCompId(String insCompId) {
		this.insCompId = insCompId;
	}



	public String getInsCompidDescription() {
		return insCompidDescription;
	}



	public void setInsCompidDescription(String insCompidDescription) {
		this.insCompidDescription = insCompidDescription;
	}



	public Boolean getStatus() {
		return status;
	}



	public void setStatus(Boolean status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "InsuranceCompanyDTO [id=" + id + ", insCompId=" + insCompId + ", insCompidDescription="
				+ insCompidDescription + ", status=" + status + "]";
	}



}
