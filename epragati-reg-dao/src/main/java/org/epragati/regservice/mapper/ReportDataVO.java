package org.epragati.regservice.mapper;

import org.epragati.aadhaarseeding.vo.AadhaarSeedVO;
import org.epragati.master.vo.RegistrationDetailsVO;

public class ReportDataVO {

	private RegistrationDetailsVO registrationDetails;

	private TaxDetailsMasterVO taxDetailsDTO;
	
	private AadhaarSeedVO aadhaarSeedVO;

	/**
	 * @return the aadhaarSeedVO
	 */
	public AadhaarSeedVO getAadhaarSeedVO() {
		return aadhaarSeedVO;
	}

	/**
	 * @param aadhaarSeedVO the aadhaarSeedVO to set
	 */
	public void setAadhaarSeedVO(AadhaarSeedVO aadhaarSeedVO) {
		this.aadhaarSeedVO = aadhaarSeedVO;
	}

	/**
	 * @return the registrationDetails
	 */
	public RegistrationDetailsVO getRegistrationDetails() {
		return registrationDetails;
	}

	/**
	 * @param registrationDetails the registrationDetails to set
	 */
	public void setRegistrationDetails(RegistrationDetailsVO registrationDetails) {
		this.registrationDetails = registrationDetails;
	}

	/**
	 * @return the taxDetailsDTO
	 */
	public TaxDetailsMasterVO getTaxDetailsDTO() {
		return taxDetailsDTO;
	}

	/**
	 * @param taxDetailsDTO the taxDetailsDTO to set
	 */
	public void setTaxDetailsDTO(TaxDetailsMasterVO taxDetailsDTO) {
		this.taxDetailsDTO = taxDetailsDTO;
	}

}
