package org.epragati.regservice.dto;

import java.util.List;

import org.epragati.master.dto.MasterFeedBackQuestionsDTO;
import org.epragati.util.payment.ServiceEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "reg_services_feedback")
public class RegServicesFeedBack {

	@Id
	private String id;
	private String applicationNo;
	private List<ServiceEnum> services;
	private List<MasterFeedBackQuestionsDTO> questions;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public List<MasterFeedBackQuestionsDTO> getQuestions() {
		return questions;
	}
	public void setQuestions(List<MasterFeedBackQuestionsDTO> questions) {
		this.questions = questions;
	}
	public List<ServiceEnum> getServices() {
		return services;
	}
	public void setServices(List<ServiceEnum> services) {
		this.services = services;
	}
	
	
	
}
