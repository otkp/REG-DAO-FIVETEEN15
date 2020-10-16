package org.epragati.master.dto;

import org.springframework.data.annotation.Id;

public class OtherStateVehicleDetailsDTO {
	
	@Id
	private String id;
	
	private InsuranceDetailsDTO insuranceDetails;
	
	private FinanceDetailsDTO financierDetails;
	
	private OtherStateNOCDetailsDTO nocDetails;
	
	private OtherStatePUCDetailsDTO pucDetails;
	
	private OtherStateTaxDetailsDTO otherStateTaxDetails;
	
	private OtherStateGreenTaxDetailsDTO otherStateGreenTaxDetails;

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
	 * @return the otherStateInsuranceDetails
	 */
	public InsuranceDetailsDTO getInsuranceDetails() {
		return insuranceDetails;
	}

	/**
	 * @param otherStateInsuranceDetails the otherStateInsuranceDetails to set
	 */
	public void setInsuranceDetails(InsuranceDetailsDTO otherStateInsuranceDetails) {
		this.insuranceDetails = otherStateInsuranceDetails;
	}

	/**
	 * @return the financierDetails
	 */
	public FinanceDetailsDTO getFinancierDetails() {
		return financierDetails;
	}

	/**
	 * @param financierDetails the financierDetails to set
	 */
	public void setFinancierDetails(FinanceDetailsDTO financierDetails) {
		this.financierDetails = financierDetails;
	}

	/**
	 * @return the nocDetails
	 */
	public OtherStateNOCDetailsDTO getNocDetails() {
		return nocDetails;
	}

	/**
	 * @param nocDetails the nocDetails to set
	 */
	public void setNocDetails(OtherStateNOCDetailsDTO nocDetails) {
		this.nocDetails = nocDetails;
	}

	/**
	 * @return the pucDetails
	 */
	public OtherStatePUCDetailsDTO getPucDetails() {
		return pucDetails;
	}

	/**
	 * @param pucDetails the pucDetails to set
	 */
	public void setPucDetails(OtherStatePUCDetailsDTO pucDetails) {
		this.pucDetails = pucDetails;
	}

	/**
	 * @return the otherStateTaxDetails
	 */
	public OtherStateTaxDetailsDTO getOtherStateTaxDetails() {
		return otherStateTaxDetails;
	}

	/**
	 * @param otherStateTaxDetails the otherStateTaxDetails to set
	 */
	public void setOtherStateTaxDetails(OtherStateTaxDetailsDTO otherStateTaxDetails) {
		this.otherStateTaxDetails = otherStateTaxDetails;
	}

	/**
	 * @return the otherStateGreenTaxDetails
	 */
	public OtherStateGreenTaxDetailsDTO getOtherStateGreenTaxDetails() {
		return otherStateGreenTaxDetails;
	}

	/**
	 * @param otherStateGreenTaxDetails the otherStateGreenTaxDetails to set
	 */
	public void setOtherStateGreenTaxDetails(OtherStateGreenTaxDetailsDTO otherStateGreenTaxDetails) {
		this.otherStateGreenTaxDetails = otherStateGreenTaxDetails;
	}

		
}