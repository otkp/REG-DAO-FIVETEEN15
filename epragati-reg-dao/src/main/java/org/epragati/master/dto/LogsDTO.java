package org.epragati.master.dto;

import java.time.LocalDateTime;
import java.util.List;

import org.epragati.common.dto.FlowDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "flow_action_logs")
public class LogsDTO {

	@Id
	private String applicationNo;

	private FlowDTO flowDetails;

	private List<FlowDTO> flowDetailsLog;

	private RejectionHistoryDTO rejectionHistory;

	private LocalDateTime createdDate = LocalDateTime.now();

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
	 * @return the flowDetails
	 */
	public FlowDTO getFlowDetails() {
		return flowDetails;
	}

	/**
	 * @param flowDetails
	 *            the flowDetails to set
	 */
	public void setFlowDetails(FlowDTO flowDetails) {
		this.flowDetails = flowDetails;
	}

	/**
	 * @return the flowDetailsLog
	 */
	public List<FlowDTO> getFlowDetailsLog() {
		return flowDetailsLog;
	}

	/**
	 * @param flowDetailsLog
	 *            the flowDetailsLog to set
	 */
	public void setFlowDetailsLog(List<FlowDTO> flowDetailsLog) {
		this.flowDetailsLog = flowDetailsLog;
	}

	/**
	 * @return the rejectionHistory
	 */
	public RejectionHistoryDTO getRejectionHistory() {
		return rejectionHistory;
	}

	/**
	 * @param rejectionHistory
	 *            the rejectionHistory to set
	 */
	public void setRejectionHistory(RejectionHistoryDTO rejectionHistory) {
		this.rejectionHistory = rejectionHistory;
	}

	/**
	 * @return the createdDate
	 */
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the id
	 */

}
