package org.epragati.master.dto;

import org.epragati.permits.dto.PermitDetailsDTO;
import org.epragati.regservice.dto.RegServiceDTO;

public class CollectionDTO {
	private RegServiceDTO regService;
	private BaseRegistrationDetailsDTO regDetails;
	private TaxDetailsDTO taxDetails;
	private FcDetailsDTO fcDetails;
	private PermitDetailsDTO permitDetails;
	private Object sourceObject;
	private Object targetObject;

	/**
	 * @return the targetObject
	 */
	public Object getTargetObject() {
		return targetObject;
	}
	/**
	 * @param targetObject the targetObject to set
	 */
	public void setTargetObject(Object targetObject) {
		this.targetObject = targetObject;
	}
	/**
	 * @return the sourceObject
	 */
	public Object getSourceObject() {
		return sourceObject;
	}
	/**
	 * @param sourceObject the sourceObject to set
	 */
	public void setSourceObject(Object sourceObject) {
		this.sourceObject = sourceObject;
	}
	/**
	 * @return the regService
	 */
	public RegServiceDTO getRegService() {
		return regService;
	}
	/**
	 * @param regService the regService to set
	 */
	public void setRegService(RegServiceDTO regService) {
		this.regService = regService;
	}
	/**
	 * @return the regDetails
	 */
	public BaseRegistrationDetailsDTO getRegDetails() {
		return regDetails;
	}
	/**
	 * @param regDetails the regDetails to set
	 */
	public void setRegDetails(BaseRegistrationDetailsDTO regDetails) {
		this.regDetails = regDetails;
	}
	/**
	 * @return the taxDetails
	 */
	public TaxDetailsDTO getTaxDetails() {
		return taxDetails;
	}
	/**
	 * @param taxDetails the taxDetails to set
	 */
	public void setTaxDetails(TaxDetailsDTO taxDetails) {
		this.taxDetails = taxDetails;
	}
	/**
	 * @return the fcDetails
	 */
	public FcDetailsDTO getFcDetails() {
		return fcDetails;
	}
	/**
	 * @param fcDetails the fcDetails to set
	 */
	public void setFcDetails(FcDetailsDTO fcDetails) {
		this.fcDetails = fcDetails;
	}
	/**
	 * @return the permitDetails
	 */
	public PermitDetailsDTO getPermitDetails() {
		return permitDetails;
	}
	/**
	 * @param permitDetails the permitDetails to set
	 */
	public void setPermitDetails(PermitDetailsDTO permitDetails) {
		this.permitDetails = permitDetails;
	}
}
