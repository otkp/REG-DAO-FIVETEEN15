package org.epragati.master.dto;

import java.io.Serializable;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author saroj.sahoo
 *
 */
@Document(collection = "dealer_details")
public class DealerDetailsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String dealerId;

	private String dealerName;

	private String registeredWith;

	private String representedBy;

	private ContactDTO contact;

	private ApplicantAddressDTO address;

	private DealerVehicalDetailsDTO vehicalDetails;

	private BankDetailsDTO bankDetails;

	private String makersName;

	private String makerClass;

	private String dealerSelectedMakerName;

	private String dealerSelectedMakerClass;

	private String dealerMail;

	private String premisesDetail;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the dealerId
	 */
	public String getDealerId() {
		return dealerId;
	}

	/**
	 * @param dealerId
	 *            the dealerId to set
	 */
	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}

	/**
	 * @return the dealerName
	 */
	public String getDealerName() {
		return dealerName;
	}

	/**
	 * @param dealerName
	 *            the dealerName to set
	 */
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	/**
	 * @return the makersName
	 */
	public String getMakersName() {
		return makersName;
	}

	/**
	 * @param makersName
	 *            the makersName to set
	 */
	public void setMakersName(String makersName) {
		this.makersName = makersName;
	}

	/**
	 * @return the makerClass
	 */
	public String getMakerClass() {
		return makerClass;
	}

	/**
	 * @param makerClass
	 *            the makerClass to set
	 */
	public void setMakerClass(String makerClass) {
		this.makerClass = makerClass;
	}

	/**
	 * @return the dealerSelectedMakerName
	 */
	public String getDealerSelectedMakerName() {
		return dealerSelectedMakerName;
	}

	/**
	 * @param dealerSelectedMakerName
	 *            the dealerSelectedMakerName to set
	 */
	public void setDealerSelectedMakerName(String dealerSelectedMakerName) {
		this.dealerSelectedMakerName = dealerSelectedMakerName;
	}

	/**
	 * @return the dealerSelectedMakerClass
	 */
	public String getDealerSelectedMakerClass() {
		return dealerSelectedMakerClass;
	}

	/**
	 * @param dealerSelectedMakerClass
	 *            the dealerSelectedMakerClass to set
	 */
	public void setDealerSelectedMakerClass(String dealerSelectedMakerClass) {
		this.dealerSelectedMakerClass = dealerSelectedMakerClass;
	}

	/**
	 * @return the dealerMail
	 */
	public String getDealerMail() {
		return dealerMail;
	}

	/**
	 * @param dealerMail
	 *            the dealerMail to set
	 */
	public void setDealerMail(String dealerMail) {
		this.dealerMail = dealerMail;
	}

	/**
	 * 
	 * @return
	 */
	public String getRegisteredWith() {
		return registeredWith;
	}

	/**
	 * 
	 * @param registeredWith
	 */
	public void setRegisteredWith(String registeredWith) {
		this.registeredWith = registeredWith;
	}

	/**
	 * 
	 * @return
	 */
	public String getRepresentedBy() {
		return representedBy;
	}

	/**
	 * 
	 * @param representedBy
	 */
	public void setRepresentedBy(String representedBy) {
		this.representedBy = representedBy;
	}

	/**
	 * 
	 * @return
	 */
	public DealerVehicalDetailsDTO getVehicalDetails() {
		return vehicalDetails;
	}

	/**
	 * 
	 * @param vehicalDetails
	 */
	public void setVehicalDetails(DealerVehicalDetailsDTO vehicalDetails) {
		this.vehicalDetails = vehicalDetails;
	}

	/**
	 * 
	 * @return
	 */
	public ContactDTO getContact() {
		return contact;
	}

	/**
	 * 
	 * @param contact
	 */
	public void setContact(ContactDTO contact) {
		this.contact = contact;
	}

	/**
	 * 
	 * @return
	 */
	public ApplicantAddressDTO getAddress() {
		return address;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(ApplicantAddressDTO address) {
		this.address = address;
	}

	/**
	 * 
	 * @return
	 */
	public BankDetailsDTO getBankDetails() {
		return bankDetails;
	}

	/**
	 * 
	 * @param bankDetails
	 */
	public void setBankDetails(BankDetailsDTO bankDetails) {
		this.bankDetails = bankDetails;
	}

	/**
	 * 
	 * @return
	 */
	public String getPremisesDetail() {
		return premisesDetail;
	}

	/**
	 * 
	 * @param premisesDetail
	 */
	public void setPremisesDetail(String premisesDetail) {
		this.premisesDetail = premisesDetail;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DealerDetailsDTO [id=" + id + ", dealerId=" + dealerId + ", dealerName=" + dealerName
				+ ", registeredWith=" + registeredWith + ", representedBy=" + representedBy + ", contact=" + contact
				+ ", address=" + address + ", vehicalDetails=" + vehicalDetails + ", bankDetails=" + bankDetails
				+ ", makersName=" + makersName + ", makerClass=" + makerClass + ", dealerSelectedMakerName="
				+ dealerSelectedMakerName + ", dealerSelectedMakerClass=" + dealerSelectedMakerClass + ", dealerMail="
				+ dealerMail + ", premisesDetail=" + premisesDetail + "]";
	}

}
