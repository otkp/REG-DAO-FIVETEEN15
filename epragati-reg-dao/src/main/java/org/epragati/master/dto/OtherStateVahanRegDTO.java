package org.epragati.master.dto;

import java.io.Serializable;

import org.epragati.regservice.dto.NOCDetailsDTO;
import org.epragati.regservice.dto.PUCDetailsDTO;

public class OtherStateVahanRegDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3716614944319957667L;

	private String prNo;
	
	private RegistrationDetailsDTO registrationDetails;
	
	private NOCDetailsDTO nOCDetails;

	private PUCDetailsDTO pucDetails;
	
	private FinanceDetailsDTO financeDetails;

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	/**
	 * @return the registrationDetails
	 */
	public RegistrationDetailsDTO getRegistrationDetails() {
		return registrationDetails;
	}

	/**
	 * @param registrationDetails the registrationDetails to set
	 */
	public void setRegistrationDetails(RegistrationDetailsDTO registrationDetails) {
		this.registrationDetails = registrationDetails;
	}

	/**
	 * @return the nOCDetails
	 */
	public NOCDetailsDTO getnOCDetails() {
		return nOCDetails;
	}

	/**
	 * @param nOCDetails the nOCDetails to set
	 */
	public void setnOCDetails(NOCDetailsDTO nOCDetails) {
		this.nOCDetails = nOCDetails;
	}

	/**
	 * @return the pucDetails
	 */
	public PUCDetailsDTO getPucDetails() {
		return pucDetails;
	}

	/**
	 * @param pucDetails the pucDetails to set
	 */
	public void setPucDetails(PUCDetailsDTO pucDetails) {
		this.pucDetails = pucDetails;
	}

	/**
	 * @return the financeDetails
	 */
	public FinanceDetailsDTO getFinanceDetails() {
		return financeDetails;
	}

	/**
	 * @param financeDetails the financeDetails to set
	 */
	public void setFinanceDetails(FinanceDetailsDTO financeDetails) {
		this.financeDetails = financeDetails;
	}
	
	
}
