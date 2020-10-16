package org.epragati.stagecarriages.dto;

import java.util.List;

import org.epragati.regservice.dto.ActionDetails;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_stage_carriage_tax")
public class MasterStageCarriageTaxDTO {

	@Id
	private String id;
	private String prNo;
	private Double tax;
	private List<ActionDetails> actions;
	private boolean status;

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<ActionDetails> getActions() {
		return actions;
	}
	public void setActions(List<ActionDetails> actions) {
		this.actions = actions;
	}
	
	
}
