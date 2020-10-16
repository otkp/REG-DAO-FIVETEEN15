package org.epragati.ticket.dao;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Ticket_sequence")
public class TicketSequnceDTO {

	@Id
	private String id;
	private Long startingNumber;
	private Long presentNumber;
	private Integer monthOfTheYear;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getStartingNumber() {
		return startingNumber;
	}
	public void setStartingNumber(Long startingNumber) {
		this.startingNumber = startingNumber;
	}
	public Long getPresentNumber() {
		return presentNumber;
	}
	public void setPresentNumber(Long presentNumber) {
		this.presentNumber = presentNumber;
	}
	public Integer getMonthOfTheYear() {
		return monthOfTheYear;
	}
	public void setMonthOfTheYear(Integer monthOfTheYear) {
		this.monthOfTheYear = monthOfTheYear;
	}
	
}
