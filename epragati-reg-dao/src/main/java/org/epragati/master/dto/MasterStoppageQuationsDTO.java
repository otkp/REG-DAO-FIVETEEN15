package org.epragati.master.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_stoppage_questions")
public class MasterStoppageQuationsDTO extends BaseEntity implements Serializable{

	private static final long serialVersionUID = -5813880471210186933L;
	@Id
	private String id;
	
	private boolean isRadioButton;
	private String firstRadioButton;
	private boolean isEnableTextFieldForFirstButton;
	private String secondRadioButton;
	private boolean isEnableTextFieldForSecondButton;
	private boolean isTextField;
	private String comments;
	private boolean status;
	
	
	private String slNo;
	private String question;
private List<StoppageQuationsSubOptions> options;



	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
	/**
	 * @return the isRadioButton
	 */
	public boolean isRadioButton() {
		return isRadioButton;
	}
	/**
	 * @param isRadioButton the isRadioButton to set
	 */
	public void setRadioButton(boolean isRadioButton) {
		this.isRadioButton = isRadioButton;
	}
	/**
	 * @return the firstRadioButton
	 */
	public String getFirstRadioButton() {
		return firstRadioButton;
	}
	/**
	 * @param firstRadioButton the firstRadioButton to set
	 */
	public void setFirstRadioButton(String firstRadioButton) {
		this.firstRadioButton = firstRadioButton;
	}
	/**
	 * @return the secondRadioButton
	 */
	public String getSecondRadioButton() {
		return secondRadioButton;
	}
	/**
	 * @param secondRadioButton the secondRadioButton to set
	 */
	public void setSecondRadioButton(String secondRadioButton) {
		this.secondRadioButton = secondRadioButton;
	}
	/**
	 * @return the isTextField
	 */
	public boolean isTextField() {
		return isTextField;
	}
	/**
	 * @param isTextField the isTextField to set
	 */
	public void setTextField(boolean isTextField) {
		this.isTextField = isTextField;
	}
	/**
	 * @return the isEnableTextFieldForFirstButton
	 */
	public boolean isEnableTextFieldForFirstButton() {
		return isEnableTextFieldForFirstButton;
	}
	/**
	 * @param isEnableTextFieldForFirstButton the isEnableTextFieldForFirstButton to set
	 */
	public void setEnableTextFieldForFirstButton(boolean isEnableTextFieldForFirstButton) {
		this.isEnableTextFieldForFirstButton = isEnableTextFieldForFirstButton;
	}
	/**
	 * @return the isEnableTextFieldForSecondButton
	 */
	public boolean isEnableTextFieldForSecondButton() {
		return isEnableTextFieldForSecondButton;
	}
	/**
	 * @param isEnableTextFieldForSecondButton the isEnableTextFieldForSecondButton to set
	 */
	public void setEnableTextFieldForSecondButton(boolean isEnableTextFieldForSecondButton) {
		this.isEnableTextFieldForSecondButton = isEnableTextFieldForSecondButton;
	}
	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
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
	 * @return the slNo
	 */
	public String getSlNo() {
		return slNo;
	}
	/**
	 * @param slNo the slNo to set
	 */
	public void setSlNo(String slNo) {
		this.slNo = slNo;
	}
	/**
	 * @return the options
	 */
	public List<StoppageQuationsSubOptions> getOptions() {
		return options;
	}
	/**
	 * @param options the options to set
	 */
	public void setOptions(List<StoppageQuationsSubOptions> options) {
		this.options = options;
	}
	
	
	
	
}
