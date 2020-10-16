package org.epragati.regservice.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import org.epragati.master.dto.ApplicantAddressDTO;
import org.epragati.master.dto.ContactDTO;
import org.epragati.master.dto.MasterFreshRcMviQuestions;
import org.epragati.master.dto.UserDTO;

public class FreshRcDTO implements Serializable {

	private static final long serialVersionUID = -6783079696635797185L;

	private Integer noOfEMIs;
	private Double pendingAmount;
	private LocalDate pendingFrom;
	private LocalDate pendingTo;
	private ContactDTO financerContactDetails;
	private String financerUserId;
	private String yardName;
	private String yardLocation;
	private ApplicantAddressDTO yardAddress;
	private String financerComments;
	private String mviUserId;
	private String mviName;
	private boolean isAoApproved;
	private UserDTO financerDetails;
	private boolean isAOReject;
	private boolean isAOAssignedToMVI;
	private List<Comments> frcComments;
	private List<MasterFreshRcMviQuestions> frcQuestions;

	public List<MasterFreshRcMviQuestions> getFrcQuestions() {
		return frcQuestions;
	}

	public void setFrcQuestions(List<MasterFreshRcMviQuestions> frcQuestions) {
		this.frcQuestions = frcQuestions;
	}

	public ContactDTO getFinancerContactDetails() {
		return financerContactDetails;
	}

	public void setFinancerContactDetails(ContactDTO financerContactDetails) {
		this.financerContactDetails = financerContactDetails;
	}

	public String getFinancerUserId() {
		return financerUserId;
	}

	public void setFinancerUserId(String financerUserId) {
		this.financerUserId = financerUserId;
	}

	public String getYardName() {
		return yardName;
	}

	public void setYardName(String yardName) {
		this.yardName = yardName;
	}

	public String getYardLocation() {
		return yardLocation;
	}

	public void setYardLocation(String yardLocation) {
		this.yardLocation = yardLocation;
	}

	public String getFinancerComments() {
		return financerComments;
	}

	public void setFinancerComments(String financerComments) {
		this.financerComments = financerComments;
	}

	public Integer getNoOfEMIs() {
		return noOfEMIs;
	}

	public void setNoOfEMIs(Integer noOfEMIs) {
		this.noOfEMIs = noOfEMIs;
	}

	public Double getPendingAmount() {
		return pendingAmount;
	}

	public void setPendingAmount(Double pendingAmount) {
		this.pendingAmount = pendingAmount;
	}

	public LocalDate getPendingFrom() {
		return pendingFrom;
	}

	public void setPendingFrom(LocalDate pendingFrom) {
		this.pendingFrom = pendingFrom;
	}

	public LocalDate getPendingTo() {
		return pendingTo;
	}

	public void setPendingTo(LocalDate pendingTo) {
		this.pendingTo = pendingTo;
	}

	public ApplicantAddressDTO getYardAddress() {
		return yardAddress;
	}

	public void setYardAddress(ApplicantAddressDTO yardAddress) {
		this.yardAddress = yardAddress;
	}

	public String getMviUserId() {
		return mviUserId;
	}

	public void setMviUserId(String mviUserId) {
		this.mviUserId = mviUserId;
	}

	public UserDTO getFinancerDetails() {
		return financerDetails;
	}

	public void setFinancerDetails(UserDTO financerDetails) {
		this.financerDetails = financerDetails;
	}

	/**
	 * @return the mviName
	 */
	public String getMviName() {
		return mviName;
	}

	/**
	 * @param mviName the mviName to set
	 */
	public void setMviName(String mviName) {
		this.mviName = mviName;
	}

	public boolean isAOReject() {
		return isAOReject;
	}

	public void setAOReject(boolean isAOReject) {
		this.isAOReject = isAOReject;
	}

	public boolean isAoApproved() {
		return isAoApproved;
	}

	public void setAoApproved(boolean isAoApproved) {
		this.isAoApproved = isAoApproved;
	}

	public List<Comments> getFrcComments() {
		return frcComments;
	}

	public void setFrcComments(List<Comments> frcComments) {
		this.frcComments = frcComments;
	}

	public boolean isAOAssignedToMVI() {
		return isAOAssignedToMVI;
	}

	public void setAOAssignedToMVI(boolean isAOAssignedToMVI) {
		this.isAOAssignedToMVI = isAOAssignedToMVI;
	}

}
