package org.epragati.master.dto;

import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "RejectionHistoryLogs")
public class RejectionHistoryLogsDTO extends BaseEntity{
	
	private String applicationNo;
	private String trNo;
	private String prNo;
	private List<RejectionHistoryDTO> RejectionHistoryDTO;

	/**
	 * @return the rejectionHistoryDTO
	 */
	public List<RejectionHistoryDTO> getRejectionHistoryDTO() {
		return RejectionHistoryDTO;
	}

	/**
	 * @param rejectionHistoryDTO
	 *            the rejectionHistoryDTO to set
	 */
	public void setRejectionHistoryDTO(List<RejectionHistoryDTO> rejectionHistoryDTO) {
		RejectionHistoryDTO = rejectionHistoryDTO;
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
	 * @return the trNo
	 */
	public String getTrNo() {
		return trNo;
	}

	/**
	 * @param trNo the trNo to set
	 */
	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	
	
}
