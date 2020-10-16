package org.epragati.sn.numberseries.dto;

import java.time.LocalDateTime;
import java.util.List;

public class BidParticipantsLogDTO {
	
	List<BidParticipantsDto> bidParticipants;
	private LocalDateTime bidCancledDate;
	
	/**
	 * @return the bidParticipants
	 */
	public List<BidParticipantsDto> getBidParticipants() {
		return bidParticipants;
	}
	/**
	 * @param bidParticipants the bidParticipants to set
	 */
	public void setBidParticipants(List<BidParticipantsDto> bidParticipants) {
		this.bidParticipants = bidParticipants;
	}
	/**
	 * @return the bidCancledDate
	 */
	public LocalDateTime getBidCancledDate() {
		return bidCancledDate;
	}
	/**
	 * @param bidCancledDate the bidCancledDate to set
	 */
	public void setBidCancledDate(LocalDateTime bidCancledDate) {
		this.bidCancledDate = bidCancledDate;
	}
	
	
	
}
