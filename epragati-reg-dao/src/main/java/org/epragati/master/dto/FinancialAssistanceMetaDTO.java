package org.epragati.master.dto;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_fa_checklist")
public class FinancialAssistanceMetaDTO {
	
	@Id
	private Integer id;
	private List<String> checkListDesc;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<String> getCheckListDesc() {
		return checkListDesc;
	}
	public void setCheckListDesc(List<String> checkListDesc) {
		this.checkListDesc = checkListDesc;
	}

	
}
