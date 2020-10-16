package org.epragati.sn.numberseries.dto;

import java.time.LocalDate;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.constants.CovCategory;
import org.epragati.sn.dto.ActionsDetails;
import org.epragati.util.BidNumberType;
import org.epragati.util.NumberPoolStatus;
import org.epragati.util.UserType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pr_pool")
@CompoundIndexes({ 
	@CompoundIndex(name = "numberPoolId", def = "{'numberPoolId': 1}"),
	@CompoundIndex(name = "officeCode_and_regType_and_poolStatus", def = "{'officeCode': 1, 'regType': 1, 'poolStatus': 1}"),
	@CompoundIndex(name = "officeCode_and_regType_and_poolStatus_and_prNumber", def = "{'officeCode': 1, 'regType': 1, 'poolStatus': 1, 'prNumber': 1}"),
	@CompoundIndex(name = "officeCode_and_regType_and_prNumber_and_prSeries", def = "{'officeCode': 1, 'regType': 1, 'prNumber': 1, 'prSeries': 1}"),
	@CompoundIndex(name = "officeCode_and_regType_and_poolStatus_and_prNumber_and_prSeries", def = "{'officeCode': 1, 'regType': 1, 'poolStatus': 1, 'prNumber': 1, 'prSeries': 1}"),
	@CompoundIndex(name = "prNumber", def = "{'prNumber': 1}"),
	@CompoundIndex(name = "officeCode_and_regType_and_poolStatus_and_numberType", def = "{'officeCode': 1, 'regType': 1, 'poolStatus': 1, 'numberType': 1}"),
	@CompoundIndex(name = "officeCode_and_regType_and_poolStatus_and_numberType_and_prNumber", def = "{'officeCode': 1, 'regType': 1, 'poolStatus': 1, 'numberType': 1, 'prNumber': 1}"),
	@CompoundIndex(name = "officeCode_and_regType_and_poolStatus_and_numberType_and_prSeriesId", def = "{'officeCode': 1, 'regType': 1, 'poolStatus': 1, 'numberType': 1, 'prSeriesId': 1}"),
	@CompoundIndex(name = "bidProcessStatus_participa_ind", def = "{'bidProcessStatus':1,'bidParticipants':1}"),
	@CompoundIndex(name = "bidProcessStatus_ind", def = "{'bidProcessStatus':1}"),
	@CompoundIndex(name = "prNo_ind", def = "{'prNo':1}"),
	@CompoundIndex(name = "distCod_series_prNumber_Inx", def = "{'officeNumberSeries':1,numberSeries:1,prNumber:1}"),
	@CompoundIndex(name = "officeCode_and_regType_and_poolStatus_and_prSeriesId_and_numberType", def = "{'officeCode': 1, 'regType': 1, 'poolStatus': 1, 'prSeriesId': 1, 'numberType': 1}"),
	@CompoundIndex(name = "officeCode_and_regType_and_poolStatus_and_prSeries_and_numberType_prNumber", def = "{'officeCode': 1, 'regType': 1, 'poolStatus': 1, 'prSeries': 1, 'numberType': 1,'prNumber':1}"),
	@CompoundIndex(name = "officeCode_and_regType_and_prSeries_and__poolStatus_and_numberType", def = "{'officeCode': 1, 'regType': 1,  'prSeries': 1, 'poolStatus': 1, 'numberType': 1}"),
	@CompoundIndex(name = "officeCode_and_regType_and_prSeriesId_and__poolStatus", def = "{'officeCode': 1, 'regType': 1, 'prSeriesId': 1, 'poolStatus': 1}"),
	@CompoundIndex(name = "officeCode_and_regType_and_poolStatus_and_prSeries", def = "{'officeCode': 1, 'regType': 1, 'poolStatus': 1, 'prSeries': 1}"),
	@CompoundIndex(name = "officeCode_and_prSeriesId_and_numberType_and_poolStatus", def = "{'officeCode': 1, 'prSeriesId': 1, 'numberType': 1, 'poolStatus': 1}"),
	@CompoundIndex(name = "officeCode_and_regType_and_prSeriesId_and_prNumber_and_poolStatus", def = "{'officeCode': 1, 'regType': 1, 'prSeriesId': 1, 'prNumber': 1, 'poolStatus': 1}"),
})
public class PRPoolDTO extends BaseEntity {

	private static final long serialVersionUID = 1240090760430769925L;

	@Id
	private String numberPoolId;

	private Integer prNumber;

	private BidNumberType numberType;

	private NumberPoolStatus poolStatus;

	private UserType usedBy;
	
	private String officeCode;
		
	private String officeNumberSeries;
	
	private String prSeries;

	private CovCategory regType;
	
	private String prSeriesId;

	private List<ActionsDetails> actionDetailsLog;
	
	private Boolean isDuplicate;
	
	private String prNo;
	
	private LocalDate reservedDate;
	
	private Short numberSum;
	
	private Double amount;
	
	private String feeRefId;
	
	private List<BidParticipantsDto> bidParticipants;
	
	private List<BidParticipantsLogDTO> bidParticipantsLogs;
	
	private BidParticipantsDto assignedBidder;
	
	private NumberPoolStatus.BidProcessStatus bidProcessStatus;
	
	public String getNumberPoolId() {
		return numberPoolId;
	}

	public void setNumberPoolId(String numberPoolId) {
		this.numberPoolId = numberPoolId;
	}

	public Integer getPrNumber() {
		return prNumber;
	}

	public void setPrNumber(Integer prNumber) {
		this.prNumber = prNumber;
	}

	public BidNumberType getNumberType() {
		return numberType;
	}

	public void setNumberType(BidNumberType numberType) {
		this.numberType = numberType;
	}

	public NumberPoolStatus getPoolStatus() {
		return poolStatus;
	}

	public void setPoolStatus(NumberPoolStatus poolStatus) {
		this.poolStatus = poolStatus;
	}

	public List<ActionsDetails> getActionDetailsLog() {
		return actionDetailsLog;
	}

	public void setActionDetailsLog(List<ActionsDetails> actionDetailsLog) {
		this.actionDetailsLog = actionDetailsLog;
	}

	public UserType getUsedBy() {
		return usedBy;
	}

	public void setUsedBy(UserType usedBy) {
		this.usedBy = usedBy;
	}

	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	/**
	 * @return the officeNumberSeries
	 */
	public String getOfficeNumberSeries() {
		return officeNumberSeries;
	}

	/**
	 * @param officeNumberSeries the officeNumberSeries to set
	 */
	public void setOfficeNumberSeries(String officeNumberSeries) {
		this.officeNumberSeries = officeNumberSeries;
	}

	/**
	 * @return the prSeries
	 */
	public String getPrSeries() {
		return prSeries;
	}

	/**
	 * @param prSeries the prSeries to set
	 */
	public void setPrSeries(String prSeries) {
		this.prSeries = prSeries;
	}

	/**
	 * @return the regType
	 */
	public CovCategory getRegType() {
		return regType;
	}

	/**
	 * @param regType the regType to set
	 */
	public void setRegType(CovCategory regType) {
		this.regType = regType;
	}

	/**
	 * @return the prSeriesId
	 */
	public String getPrSeriesId() {
		return prSeriesId;
	}

	/**
	 * @param prSeriesId the prSeriesId to set
	 */
	public void setPrSeriesId(String prSeriesId) {
		this.prSeriesId = prSeriesId;
	}

	public Boolean getIsDuplicate() {
		return isDuplicate;
	}

	public void setIsDuplicate(Boolean isDuplicate) {
		this.isDuplicate = isDuplicate;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	/**
	 * @return the reservedDate
	 */
	public LocalDate getReservedDate() {
		return reservedDate;
	}

	/**
	 * @param reservedDate the reservedDate to set
	 */
	public void setReservedDate(LocalDate reservedDate) {
		this.reservedDate = reservedDate;
	}

	/**
	 * @return the numberSum
	 */
	public Short getNumberSum() {
		return numberSum;
	}

	/**
	 * @param numberSum the numberSum to set
	 */
	public void setNumberSum(Short numberSum) {
		this.numberSum = numberSum;
	}

	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * @return the feeRefId
	 */
	public String getFeeRefId() {
		return feeRefId;
	}

	/**
	 * @param feeRefId the feeRefId to set
	 */
	public void setFeeRefId(String feeRefId) {
		this.feeRefId = feeRefId;
	}

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
	 * @return the assignedBidder
	 */
	public BidParticipantsDto getAssignedBidder() {
		return assignedBidder;
	}

	/**
	 * @param assignedBidder the assignedBidder to set
	 */
	public void setAssignedBidder(BidParticipantsDto assignedBidder) {
		this.assignedBidder = assignedBidder;
	}

	/**
	 * @return the bidProcessStatus
	 */
	public NumberPoolStatus.BidProcessStatus getBidProcessStatus() {
		return bidProcessStatus;
	}

	/**
	 * @param bidProcessStatus the bidProcessStatus to set
	 */
	public void setBidProcessStatus(NumberPoolStatus.BidProcessStatus bidProcessStatus) {
		this.bidProcessStatus = bidProcessStatus;
	}

	/**
	 * @return the bidParticipantsLogs
	 */
	public List<BidParticipantsLogDTO> getBidParticipantsLogs() {
		return bidParticipantsLogs;
	}

	/**
	 * @param bidParticipantsLogs the bidParticipantsLogs to set
	 */
	public void setBidParticipantsLogs(List<BidParticipantsLogDTO> bidParticipantsLogs) {
		this.bidParticipantsLogs = bidParticipantsLogs;
	}
	
	
}
