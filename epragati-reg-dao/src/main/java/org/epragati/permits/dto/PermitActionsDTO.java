package org.epragati.permits.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.epragati.common.dto.BaseEntity;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PermitActionsDTO extends BaseEntity implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 604195699487380765L;
	
	private String action;
	private String officeMemoNumber;
	private LocalDate memoDate;
	private LocalDate fromDate;
	private LocalDate toDate;
	private String referenceNumber;
	private LocalDate referenceDate;
	private String sectionOrRule;
	private boolean punishment;
	private String punishmentComments;
	private boolean showCauseIssued;
	private String showCauseIssuedComments;
	private String orderNumber;
	private LocalDate orderDate;
	private String mviName;
	private String remark;
	private LocalDate revocationDate;
	private String Reason;
	private String actionBy;
	//new fields
	private String mviInspection;
	private String mviInspectioncomments;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDateTime actionDate;
	private String referenceBy;
	private String finalStatus;
	private String reasonForAo;
	private String actionByCco;
	private String actionByAo;
	private String actionByRto;
	
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getOfficeMemoNumber() {
		return officeMemoNumber;
	}
	public void setOfficeMemoNumber(String officeMemoNumber) {
		this.officeMemoNumber = officeMemoNumber;
	}
	public LocalDate getMemoDate() {
		return memoDate;
	}
	public void setMemoDate(LocalDate memoDate) {
		this.memoDate = memoDate;
	}
	public LocalDate getFromDate() {
		return fromDate;
	}
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}
	public LocalDate getToDate() {
		return toDate;
	}
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}
	public String getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	public LocalDate getReferenceDate() {
		return referenceDate;
	}
	public void setReferenceDate(LocalDate referenceDate) {
		this.referenceDate = referenceDate;
	}
	public String getSectionOrRule() {
		return sectionOrRule;
	}
	public void setSectionOrRule(String sectionOrRule) {
		this.sectionOrRule = sectionOrRule;
	}
	public boolean isPunishment() {
		return punishment;
	}
	public void setPunishment(boolean punishment) {
		this.punishment = punishment;
	}
	public String getPunishmentComments() {
		return punishmentComments;
	}
	public void setPunishmentComments(String punishmentComments) {
		this.punishmentComments = punishmentComments;
	}
	public boolean isShowCauseIssued() {
		return showCauseIssued;
	}
	public void setShowCauseIssued(boolean showCauseIssued) {
		this.showCauseIssued = showCauseIssued;
	}
	public String getShowCauseIssuedComments() {
		return showCauseIssuedComments;
	}
	public void setShowCauseIssuedComments(String showCauseIssuedComments) {
		this.showCauseIssuedComments = showCauseIssuedComments;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public String getMviName() {
		return mviName;
	}
	public void setMviName(String mviName) {
		this.mviName = mviName;
	}
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public LocalDate getRevocationDate() {
		return revocationDate;
	}
	public void setRevocationDate(LocalDate revocationDate) {
		this.revocationDate = revocationDate;
	}
	public String getReason() {
		return Reason;
	}
	public void setReason(String reason) {
		Reason = reason;
	}
	public String getActionBy() {
		return actionBy;
	}
	public void setActionBy(String actionBy) {
		this.actionBy = actionBy;
	}
	public String getMviInspection() {
		return mviInspection;
	}
	public void setMviInspection(String mviInspection) {
		this.mviInspection = mviInspection;
	}
	public String getMviInspectioncomments() {
		return mviInspectioncomments;
	}
	public void setMviInspectioncomments(String mviInspectioncomments) {
		this.mviInspectioncomments = mviInspectioncomments;
	}
	public LocalDateTime getActionDate() {
		return actionDate;
	}
	public void setActionDate(LocalDateTime actionDate) {
		this.actionDate = actionDate;
	}
	public String getReferenceBy() {
		return referenceBy;
	}
	public void setReferenceBy(String referenceBy) {
		this.referenceBy = referenceBy;
	}
	public String getFinalStatus() {
		return finalStatus;
	}
	public void setFinalStatus(String finalStatus) {
		this.finalStatus = finalStatus;
	}
	public String getReasonForAo() {
		return reasonForAo;
	}
	public void setReasonForAo(String reasonForAo) {
		this.reasonForAo = reasonForAo;
	}
	public String getActionByCco() {
		return actionByCco;
	}
	public void setActionByCco(String actionByCco) {
		this.actionByCco = actionByCco;
	}
	public String getActionByAo() {
		return actionByAo;
	}
	public void setActionByAo(String actionByAo) {
		this.actionByAo = actionByAo;
	}
	public String getActionByRto() {
		return actionByRto;
	}
	public void setActionByRto(String actionByRto) {
		this.actionByRto = actionByRto;
	}
	
}
