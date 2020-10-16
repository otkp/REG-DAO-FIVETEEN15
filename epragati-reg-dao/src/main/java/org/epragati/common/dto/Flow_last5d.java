package org.epragati.common.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.persistence.Id;

import org.epragati.master.dto.RoleActionDTO;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SAS_flow_details_log")
public class Flow_last5d extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String flowId;

	private boolean status;
	private String applicationNo;
	private String module;

	private Map<Integer, List<RoleActionDTO>> flowDetails;

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
	 * @return the flowId
	 */
	public String getFlowId() {
		return flowId;
	}

	/**
	 * @param flowId the flowId to set
	 */
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @return the flowDetails
	 */
	public Map<Integer, List<RoleActionDTO>> getFlowDetails() {
		if(flowDetails == null) {
			flowDetails = new TreeMap<Integer, List<RoleActionDTO>>(); 
		}
		return flowDetails;
	}

	/**
	 * @param flowDetails the flowDetails to set
	 */
	public void setFlowDetails(Map<Integer, List<RoleActionDTO>> flowDetails) {
		this.flowDetails = flowDetails;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FlowDTO [flowId=" + flowId + ", status=" + status + ", flowDetails=" + flowDetails + "]";
	}

	/**
	 * @return the flowDetails
	 */
	

}