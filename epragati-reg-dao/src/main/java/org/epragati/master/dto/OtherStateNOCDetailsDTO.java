package org.epragati.master.dto;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

public class OtherStateNOCDetailsDTO {
	
	@Id
	private String id;
	
	private StateDTO state;
	
	private String authority;
	
	private LocalDate IssueDate;
	
	private Integer periodOfStayMonths;
	
	private Integer periodOfStayYears;
	
	private LocalDate dateOfEnterIntoState;
	
	private String nocIssuedTo;

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
	 * @return the state
	 */
	public StateDTO getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(StateDTO state) {
		this.state = state;
	}

	/**
	 * @return the authority
	 */
	public String getAuthority() {
		return authority;
	}

	/**
	 * @param authority the authority to set
	 */
	public void setAuthority(String authority) {
		this.authority = authority;
	}

	/**
	 * @return the issueDate
	 */
	public LocalDate getIssueDate() {
		return IssueDate;
	}

	/**
	 * @param issueDate the issueDate to set
	 */
	public void setIssueDate(LocalDate issueDate) {
		IssueDate = issueDate;
	}

	/**
	 * @return the periodOfStayMonths
	 */
	public Integer getPeriodOfStayMonths() {
		return periodOfStayMonths;
	}

	/**
	 * @param periodOfStayMonths the periodOfStayMonths to set
	 */
	public void setPeriodOfStayMonths(Integer periodOfStayMonths) {
		this.periodOfStayMonths = periodOfStayMonths;
	}

	/**
	 * @return the periodOfStayYears
	 */
	public Integer getPeriodOfStayYears() {
		return periodOfStayYears;
	}

	/**
	 * @param periodOfStayYears the periodOfStayYears to set
	 */
	public void setPeriodOfStayYears(Integer periodOfStayYears) {
		this.periodOfStayYears = periodOfStayYears;
	}

	/**
	 * @return the dateOfEnterIntoState
	 */
	public LocalDate getDateOfEnterIntoState() {
		return dateOfEnterIntoState;
	}

	/**
	 * @param dateOfEnterIntoState the dateOfEnterIntoState to set
	 */
	public void setDateOfEnterIntoState(LocalDate dateOfEnterIntoState) {
		this.dateOfEnterIntoState = dateOfEnterIntoState;
	}

	/**
	 * @return the nocIssuedTo
	 */
	public String getNocIssuedTo() {
		return nocIssuedTo;
	}

	/**
	 * @param nocIssuedTo the nocIssuedTo to set
	 */
	public void setNocIssuedTo(String nocIssuedTo) {
		this.nocIssuedTo = nocIssuedTo;
	}
	

}
