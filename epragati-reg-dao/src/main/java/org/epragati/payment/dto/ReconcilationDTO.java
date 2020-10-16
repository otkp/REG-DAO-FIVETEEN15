package org.epragati.payment.dto;

import java.time.LocalDate;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.vcrImage.dto.ConsolidateChallanDTO;
import org.epragati.vcrImage.dto.VcrFinalServiceDTO;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reconcilation_details")
public class ReconcilationDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<ChalanaDetailsDTO> challanDetails;

	private String mviName;

	private LocalDate vcrBookedDate;

	private List<VcrFinalServiceDTO> vcrDetails;

	private String transactionNo;

	private List<ConsolidateChallanDTO> consolidateDetails;

	public List<ConsolidateChallanDTO> getConsolidateDetails() {
		return consolidateDetails;
	}

	public void setConsolidateDetails(List<ConsolidateChallanDTO> consolidateDetails) {
		this.consolidateDetails = consolidateDetails;
	}

	public String getTransactionNo() {
		return transactionNo;
	}

	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}

	public List<ChalanaDetailsDTO> getChallanDetails() {
		return challanDetails;
	}

	public void setChallanDetails(List<ChalanaDetailsDTO> challanDetails) {
		this.challanDetails = challanDetails;
	}

	public String getMviName() {
		return mviName;
	}

	public void setMviName(String mviName) {
		this.mviName = mviName;
	}

	public LocalDate getVcrBookedDate() {
		return vcrBookedDate;
	}

	public void setVcrBookedDate(LocalDate vcrBookedDate) {
		this.vcrBookedDate = vcrBookedDate;
	}

	public List<VcrFinalServiceDTO> getVcrDetails() {
		return vcrDetails;
	}

	public void setVcrDetails(List<VcrFinalServiceDTO> vcrDetails) {
		this.vcrDetails = vcrDetails;
	}

}
