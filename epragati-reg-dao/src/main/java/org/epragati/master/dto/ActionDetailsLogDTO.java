package org.epragati.master.dto;

import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.util.document.KeyValue;
import org.epragati.vcrImage.dto.VcrCorrectionLogDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "action_details_log")
public class ActionDetailsLogDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String applicationNo;
	private String role;
	private String userId;
	private String module;
	private Integer index;
	private Integer currentItegeration;
	private Boolean isDoneProcess;
	private Boolean isDoneOnlyPartially;
	private String status;
	private Integer nextIndex;
	private List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures;
	private String aadharNo;
	private String fromMvi;
	private String toMvi;
	private String from;
	private String to;
	private List<VcrCorrectionLogDTO> coorectionLog;

	public ActionDetailsLogDTO(String role, String module, Integer currentItegeration, Boolean isDoneProcess,
			Integer nextIndex, Integer index) {
		super();
		this.role = role;
		this.module = module;
		this.currentItegeration = currentItegeration;
		this.isDoneProcess = isDoneProcess;
		this.index = index;
		this.nextIndex = nextIndex;
	}

	public ActionDetailsLogDTO() {
		super();
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the applicationNo
	 */
	public String getApplicationNo() {
		return applicationNo;
	}

	/**
	 * @param applicationNo the applicationNo to set
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	/**
	 * @return the module
	 */
	public String getModule() {
		return module;
	}

	/**
	 * @param module the module to set
	 */
	public void setModule(String module) {
		this.module = module;
	}

	/**
	 * @return the index
	 */
	public Integer getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(Integer index) {
		this.index = index;
	}

	/**
	 * @return the currentItegeration
	 */
	public Integer getCurrentItegeration() {
		return currentItegeration;
	}

	/**
	 * @param currentItegeration the currentItegeration to set
	 */
	public void setCurrentItegeration(Integer currentItegeration) {
		this.currentItegeration = currentItegeration;
	}

	/**
	 * @return the isDoneProcess
	 */
	public Boolean getIsDoneProcess() {
		return isDoneProcess;
	}

	/**
	 * @param isDoneProcess the isDoneProcess to set
	 */
	public void setIsDoneProcess(Boolean isDoneProcess) {
		this.isDoneProcess = isDoneProcess;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the enclosures
	 */
	public List<KeyValue<String, List<ImageEnclosureDTO>>> getEnclosures() {
		return enclosures;
	}

	/**
	 * @param enclosures the enclosures to set
	 */
	public void setEnclosures(List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures) {
		this.enclosures = enclosures;
	}

	/**
	 * @return the isDoneOnlyPartially
	 */
	public Boolean getIsDoneOnlyPartially() {
		return isDoneOnlyPartially;
	}

	/**
	 * @param isDoneOnlyPartially the isDoneOnlyPartially to set
	 */
	public void setIsDoneOnlyPartially(Boolean isDoneOnlyPartially) {
		this.isDoneOnlyPartially = isDoneOnlyPartially;
	}

	/**
	 * @return the nextIndex
	 */
	public Integer getNextIndex() {
		return nextIndex;
	}

	/**
	 * @param nextIndex the nextIndex to set
	 */
	public void setNextIndex(Integer nextIndex) {
		this.nextIndex = nextIndex;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getFromMvi() {
		return fromMvi;
	}

	public void setFromMvi(String fromMvi) {
		this.fromMvi = fromMvi;
	}

	public String getToMvi() {
		return toMvi;
	}

	public void setToMvi(String toMvi) {
		this.toMvi = toMvi;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	/**
	 * @return the coorectionLog
	 */
	public List<VcrCorrectionLogDTO> getCoorectionLog() {
		return coorectionLog;
	}

	/**
	 * @param coorectionLog the coorectionLog to set
	 */
	public void setCoorectionLog(List<VcrCorrectionLogDTO> coorectionLog) {
		this.coorectionLog = coorectionLog;
	}

}
