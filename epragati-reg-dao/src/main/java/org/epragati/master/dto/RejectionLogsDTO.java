package org.epragati.master.dto;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.common.dto.FlowDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="rejection_logs")
public class RejectionLogsDTO  extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String applicationNo;

	private FlowDTO flowDetails;
	
	private List<FlowDTO> flowLogs;

	/**
	 * @return the flowDetails
	 */
	public FlowDTO getFlowDetails() {
		return flowDetails;
	}

	/**
	 * @param flowDetails the flowDetails to set
	 */
	public void setFlowDetails(FlowDTO flowDetails) {
		this.flowDetails = flowDetails;
	}

	/**
	 * @return the flowLogs
	 */
	public List<FlowDTO> getFlowLogs() {
		return flowLogs;
	}

	/**
	 * @param flowLogs the flowLogs to set
	 */
	public void setFlowLogs(List<FlowDTO> flowLogs) {
		this.flowLogs = flowLogs;
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
	
	
	
	
	
	
	
}
