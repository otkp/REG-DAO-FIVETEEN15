package org.epragati.sn.dto;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.util.BidStatus;
import org.epragati.util.NumberPoolStatus.NumberAssignType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * 
 * 
 *         This table is used to configure bid to be conducted details so based
 *         on this table data bidder can see bid screen
 *
 */
/**
 * @author naga.pulaparthi
 *
 */
@Document(collection = "sn_bid_config_mst")
@CompoundIndexes({
	@CompoundIndex(name = "configStatus", def = "{'configStatus': 1}")
})
public class BidConfigMaster extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3778193881008670992L;


	@Id
	private String bidConfigId;

	private LocalTime bidStartTime;

	private LocalTime bidEndTime;

	private LocalTime specialNumberRegStartTime;

	private LocalTime specialNumberRegEndTime;

	private String configStatus;

	private LocalTime bidCloseNotifyTime;

	//private String remarks;

	private Long bidMaxIteration;
	
	private Long bidMaxAllowDays;
	
	private Long passCodeResentMinTimeInterVal;
	
	private Integer passCodeResentMaxCount;
	
	private List<OldVersionDataConfig> oldVersionDataConfigDetails;
	
	private int dateValueToHoliday;
	
	private String schedulerAuthToken;
	
	private boolean isRunningBidClosingProcess;
	
	private List<String> ipNoToAccesSchedulers;
	
	private String numberGenerationType;
	
	private int maxNumbersForDay;
	
	private int totalNumberForWindow;
	
	private List<BidStatus> refundStatuses;
	
	private LocalDateTime refundForAbsentStartFrom; 
	
	private  NumberAssignType numberAssignType;
	
	public String getBidConfigId() {
		return bidConfigId;
	}

	public void setBidConfigId(String bidConfigId) {
		this.bidConfigId = bidConfigId;
	}

	public LocalTime getBidStartTime() {
		return bidStartTime;
	}

	public void setBidStartTime(LocalTime bidStartTime) {
		this.bidStartTime = bidStartTime;
	}

	public LocalTime getBidEndTime() {
		return bidEndTime;
	}

	public void setBidEndTime(LocalTime bidEndTime) {
		this.bidEndTime = bidEndTime;
	}

	public LocalTime getSpecialNumberRegStartTime() {
		return specialNumberRegStartTime;
	}

	public void setSpecialNumberRegStartTime(LocalTime specialNumberRegStartTime) {
		this.specialNumberRegStartTime = specialNumberRegStartTime;
	}

	public LocalTime getSpecialNumberRegEndTime() {
		return specialNumberRegEndTime;
	}

	public void setSpecialNumberRegEndTime(LocalTime specialNumberRegEndTime) {
		this.specialNumberRegEndTime = specialNumberRegEndTime;
	}

	public String getConfigStatus() {
		return configStatus;
	}

	public void setConfigStatus(String configStatus) {
		this.configStatus = configStatus;
	}

	public LocalTime getBidCloseNotifyTime() {
		return bidCloseNotifyTime;
	}

	public void setBidCloseNotifyTime(LocalTime bidCloseNotifyTime) {
		this.bidCloseNotifyTime = bidCloseNotifyTime;
	}

	/*public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}*/

	public Long getBidMaxIteration() {
		return bidMaxIteration;
	}

	public void setBidMaxIteration(Long bidMaxIteration) {
		this.bidMaxIteration = bidMaxIteration;
	}

	public Long getBidMaxAllowDays() {
		return bidMaxAllowDays;
	}

	public void setBidMaxAllowDays(Long bidMaxAllowDays) {
		this.bidMaxAllowDays = bidMaxAllowDays;
	}

	public Long getPassCodeResentMinTimeInterVal() {
		return passCodeResentMinTimeInterVal;
	}

	public void setPassCodeResentMinTimeInterVal(Long passCodeResentMinTimeInterVal) {
		this.passCodeResentMinTimeInterVal = passCodeResentMinTimeInterVal;
	}

	public Integer getPassCodeResentMaxCount() {
		return passCodeResentMaxCount;
	}

	public void setPassCodeResentMaxCount(Integer passCodeResentMaxCount) {
		this.passCodeResentMaxCount = passCodeResentMaxCount;
	}

	/**
	 * @return the oldVersionDataConfigDetails
	 */
	public List<OldVersionDataConfig> getOldVersionDataConfigDetails() {
		return oldVersionDataConfigDetails;
	}

	/**
	 * @param oldVersionDataConfigDetails the oldVersionDataConfigDetails to set
	 */
	public void setOldVersionDataConfigDetails(List<OldVersionDataConfig> oldVersionDataConfigDetails) {
		this.oldVersionDataConfigDetails = oldVersionDataConfigDetails;
	}

	/**
	 * @return the dateValueToHoliday
	 */
	public int getDateValueToHoliday() {
		return dateValueToHoliday;
	}

	/**
	 * @param dateValueToHoliday the dateValueToHoliday to set
	 */
	public void setDateValueToHoliday(int dateValueToHoliday) {
		this.dateValueToHoliday = dateValueToHoliday;
	}

	/**
	 * @return the schedulerAuthToken
	 */
	public String getSchedulerAuthToken() {
		return schedulerAuthToken;
	}

	/**
	 * @param schedulerAuthToken the schedulerAuthToken to set
	 */
	public void setSchedulerAuthToken(String schedulerAuthToken) {
		this.schedulerAuthToken = schedulerAuthToken;
	}

	/**
	 * @return the isRunningBidClosingProcess
	 */
	public boolean isRunningBidClosingProcess() {
		return isRunningBidClosingProcess;
	}

	/**
	 * @param isRunningBidClosingProcess the isRunningBidClosingProcess to set
	 */
	public void setRunningBidClosingProcess(boolean isRunningBidClosingProcess) {
		this.isRunningBidClosingProcess = isRunningBidClosingProcess;
	}

	/**
	 * @return the ipNoToAccesSchedulers
	 */
	public List<String> getIpNoToAccesSchedulers() {
		return ipNoToAccesSchedulers;
	}

	/**
	 * @param ipNoToAccesSchedulers the ipNoToAccesSchedulers to set
	 */
	public void setIpNoToAccesSchedulers(List<String> ipNoToAccesSchedulers) {
		this.ipNoToAccesSchedulers = ipNoToAccesSchedulers;
	}

	/**
	 * @return the numberGenerationType
	 */
	public String getNumberGenerationType() {
		return numberGenerationType;
	}

	/**
	 * @param numberGenerationType the numberGenerationType to set
	 */
	public void setNumberGenerationType(String numberGenerationType) {
		this.numberGenerationType = numberGenerationType;
	}

	/**
	 * @return the maxNumbersForDay
	 */
	public Integer getMaxNumbersForDay() {
		return maxNumbersForDay;
	}

	/**
	 * @param maxNumbersForDay the maxNumbersForDay to set
	 */
	public void setMaxNumbersForDay(Integer maxNumbersForDay) {
		this.maxNumbersForDay = maxNumbersForDay;
	}

	public int getTotalNumberForWindow() {
		return totalNumberForWindow;
	}

	public void setTotalNumberForWindow(int totalNumberForWindow) {
		this.totalNumberForWindow = totalNumberForWindow;
	}

	public void setMaxNumbersForDay(int maxNumbersForDay) {
		this.maxNumbersForDay = maxNumbersForDay;
	}

	public List<BidStatus> getRefundStatuses() {
		return refundStatuses;
	}

	public void setRefundStatuses(List<BidStatus> refundStatuses) {
		this.refundStatuses = refundStatuses;
	}

	/**
	 * @return the refundForAbsentStartFrom
	 */
	public LocalDateTime getRefundForAbsentStartFrom() {
		return refundForAbsentStartFrom;
	}

	/**
	 * @param refundForAbsentStartFrom the refundForAbsentStartFrom to set
	 */
	public void setRefundForAbsentStartFrom(LocalDateTime refundForAbsentStartFrom) {
		this.refundForAbsentStartFrom = refundForAbsentStartFrom;
	}

	public NumberAssignType getNumberAssignType() {
		return numberAssignType;
	}

	public void setNumberAssignType(NumberAssignType numberAssignType) {
		this.numberAssignType = numberAssignType;
	}
	
	
}
