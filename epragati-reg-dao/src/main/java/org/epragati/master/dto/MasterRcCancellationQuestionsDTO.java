package org.epragati.master.dto;

import java.io.Serializable;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_rc_cancellation_questions")
public class MasterRcCancellationQuestionsDTO extends BaseEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String question;
	private String serialNo;
	private boolean selectedOption = Boolean.FALSE;
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public boolean isSelectedOption() {
		return selectedOption;
	}
	public void setSelectedOption(boolean selectedOption) {
		this.selectedOption = selectedOption;
	}
	
	
	

}
