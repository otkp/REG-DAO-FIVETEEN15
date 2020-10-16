package org.epragati.dto.enclosure;

import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.util.document.KeyValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "financier_enclosures")
public class FinancierEnclosuresDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String applicationNo;
	private String prNo;
	private String aadharNo;
	private List<Integer> serviceIds;
	private Integer iterator;
	private List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures;
	private String applicantNo;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public String getPrNo() {
		return prNo;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public List<Integer> getServiceIds() {
		return serviceIds;
	}
	public void setServiceIds(List<Integer> serviceIds) {
		this.serviceIds = serviceIds;
	}
	public Integer getIterator() {
		return iterator;
	}
	public void setIterator(Integer iterator) {
		this.iterator = iterator;
	}
	public List<KeyValue<String, List<ImageEnclosureDTO>>> getEnclosures() {
		return enclosures;
	}
	public void setEnclosures(List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures) {
		this.enclosures = enclosures;
	}
	public String getApplicantNo() {
		return applicantNo;
	}
	public void setApplicantNo(String applicantNo) {
		this.applicantNo = applicantNo;
	}
}