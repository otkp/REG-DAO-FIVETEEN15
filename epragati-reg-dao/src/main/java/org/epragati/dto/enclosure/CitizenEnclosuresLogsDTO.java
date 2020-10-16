package org.epragati.dto.enclosure;

import java.util.List;
import java.util.Set;

import org.epragati.common.dto.BaseEntity;
import org.epragati.util.document.KeyValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "citizen_enclosures_logs")
@CompoundIndexes({
    @CompoundIndex(name = "applicationNo", def = "{'applicationNo': 1}")
})
public class CitizenEnclosuresLogsDTO extends BaseEntity {

	/**
	 */
	private static final long serialVersionUID = -6777291775388410145L;
	@Id
	private String id;
	private String applicationNo;
	private String prNo;
	private String aadharNo;
	private Set<Integer> serviceIds;	
	private Integer iterator;
	private List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures;
	private String applicantNo;

	/**
	 * @return the applicationNo
	 */
	public String getApplicationNo() {
		return applicationNo;
	}

	/**
	 * @param applicationNo
	 *            the applicationNo to set
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo
	 *            the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	/**
	 * @return the aadharNo
	 */
	public String getAadharNo() {
		return aadharNo;
	}

	/**
	 * @param aadharNo
	 *            the aadharNo to set
	 */
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	/**
	 * @return the enclosures
	 */
	public List<KeyValue<String, List<ImageEnclosureDTO>>> getEnclosures() {
		return enclosures;
	}

	/**
	 * @param enclosures
	 *            the enclosures to set
	 */
	public void setEnclosures(List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures) {
		this.enclosures = enclosures;
	}

	/**
	 * @return the serviceIds
	 */
	public Set<Integer> getServiceIds() {
		return serviceIds;
	}

	/**
	 * @param serviceIds
	 *            the serviceIds to set
	 */
	public void setServiceIds(Set<Integer> serviceIds) {
		this.serviceIds = serviceIds;
	}

	/**
	 * @return the iterator
	 */
	public Integer getIterator() {
		return iterator;
	}

	/**
	 * @param iterator
	 *            the iterator to set
	 */
	public void setIterator(Integer iterator) {
		this.iterator = iterator;
	}

	/**
	 * @return the applicantNo
	 */
	public String getApplicantNo() {
		return applicantNo;
	}

	/**
	 * @param applicantNo
	 *            the applicantNo to set
	 */
	public void setApplicantNo(String applicantNo) {
		this.applicantNo = applicantNo;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

}
