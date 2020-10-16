package org.epragati.master.dto;

import java.io.Serializable;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "master_fc_questions")
public class MasterFCQuestionsDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String question;
	private String serialNo;
	private boolean iscfrr;
	private boolean selectedOption=Boolean.FALSE;
	
	public boolean isSelectedOption() {
		return selectedOption;
	}
	public void setSelectedOption(boolean selectedOption) {
		this.selectedOption = selectedOption;
	}
	public boolean isIscfrr() {
		return iscfrr;
	}
	public void setIscfrr(boolean iscfrr) {
		this.iscfrr = iscfrr;
	}
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
	
}
