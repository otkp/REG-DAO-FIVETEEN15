package org.epragati.regservice.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import org.epragati.master.dto.LockedDetailsDTO;
import org.epragati.master.dto.OfficeDTO;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
@Document(collection = "freshrc_reassign_mvi_log")
public class FreshRCReassignMviLogDTO implements Serializable {
	/**
	 * yugandhar peddi
	 */
	private static final long serialVersionUID = 1L;
	private String applicationNo;
	private String prNo;
	private String oldMVIname;
	private List<LockedDetailsDTO> oldlockedDetails;
	private OfficeDTO oldOfficeDetails;
	private OfficeDTO reassignedOfficeDetails;
	private String actionDoneUserId;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate actionDoneDate;
	private String remarks;
	
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
	public String getOldMVIname() {
		return oldMVIname;
	}
	public void setOldMVIname(String oldMVIname) {
		this.oldMVIname = oldMVIname;
	}
	public List<LockedDetailsDTO> getOldlockedDetails() {
		return oldlockedDetails;
	}
	public void setOldlockedDetails(List<LockedDetailsDTO> oldlockedDetails) {
		this.oldlockedDetails = oldlockedDetails;
	}
	public OfficeDTO getOldOfficeDetails() {
		return oldOfficeDetails;
	}
	public void setOldOfficeDetails(OfficeDTO oldOfficeDetails) {
		this.oldOfficeDetails = oldOfficeDetails;
	}
	public OfficeDTO getReassignedOfficeDetails() {
		return reassignedOfficeDetails;
	}
	public void setReassignedOfficeDetails(OfficeDTO reassignedOfficeDetails) {
		this.reassignedOfficeDetails = reassignedOfficeDetails;
	}
	public String getActionDoneUserId() {
		return actionDoneUserId;
	}
	public void setActionDoneUserId(String actionDoneUserId) {
		this.actionDoneUserId = actionDoneUserId;
	}
	public LocalDate getActionDoneDate() {
		return actionDoneDate;
	}
	public void setActionDoneDate(LocalDate actionDoneDate) {
		this.actionDoneDate = actionDoneDate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	
	

}
