package org.epragati.civilsupplies.dto;

import java.util.List;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
public class RationCardMemDetailsDTO {
	
    private CardDetailsDTO carddetails;
    
	private List<CardMemberDetails> memberdetails;

	public CardDetailsDTO getCarddetails() {
		return carddetails;
	}

	public void setCarddetails(CardDetailsDTO carddetails) {
		this.carddetails = carddetails;
	}

	public List<CardMemberDetails> getMemberdetails() {
		return memberdetails;
	}

	public void setMemberdetails(List<CardMemberDetails> memberdetails) {
		this.memberdetails = memberdetails;
	}
}
