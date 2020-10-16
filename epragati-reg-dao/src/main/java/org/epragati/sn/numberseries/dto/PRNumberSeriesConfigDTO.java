package org.epragati.sn.numberseries.dto;

import java.time.LocalDate;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.constants.CovCategory;
import org.epragati.sn.dto.ActionsDetails;
import org.epragati.util.RecordStatus;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pr_number_series")
@CompoundIndexes({
	@CompoundIndex(name = "officeCode_and_regType_and_seriesStatus", def = "{'officeCode': 1, 'regType': 1, 'seriesStatus': 1}"),
	@CompoundIndex(name = "prSeriesId", def = "{'prSeriesId': 1}"),
	@CompoundIndex(name = "officeCode_and_regType_and_prSeries", def = "{'officeCode': 1, 'regType': 1, 'prSeries': 1}")
})
public class PRNumberSeriesConfigDTO extends BaseEntity{

	private static final long serialVersionUID = 6285774505514476455L;

	@Id
	private String prSeriesId;

	private String officeCode;
		
	private String officeNumberSeries;
	
	private String prSeries;

	private CovCategory regType;

	private Integer startNumber;

	private Integer endNumber;

	private Integer currentNumber;
	
	// Pool End Number
	private Integer lastGeneratedPoolNumber;
	
	private Integer toDayStartNo;
	
	private Integer toDayEndNo;
	
	private LocalDate currentDate;

	private RecordStatus seriesStatus;
	
	//It'll used check missing numbers ware checked or not with in the PR series
	private Boolean isDoneMissingPrNoCheck;

	private List<ActionsDetails> actionDetailsLog;
	
    private Boolean isRandomGenerated;
	
	
	public Boolean getIsRandomGenerated() {
		return isRandomGenerated;
	}

	public void setIsRandomGenerated(Boolean isRandomGenerated) {
		this.isRandomGenerated = isRandomGenerated;
	}

	public String getPrSeriesId() {
		return prSeriesId;
	}

	public void setPrSeriesId(String prSeriesId) {
		this.prSeriesId = prSeriesId;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getPrSeries() {
		return prSeries;
	}

	public void setPrSeries(String prSeries) {
		this.prSeries = prSeries;
	}

	public CovCategory getRegType() {
		return regType;
	}

	public void setRegType(CovCategory regType) {
		this.regType = regType;
	}

	public Integer getStartNumber() {
		return startNumber;
	}

	public void setStartNumber(Integer startNumber) {
		this.startNumber = startNumber;
	}

	public Integer getEndNumber() {
		return endNumber;
	}

	public void setEndNumber(Integer endNumber) {
		this.endNumber = endNumber;
	}

	public Integer getCurrentNumber() {
		return currentNumber;
	}

	public void setCurrentNumber(Integer currentNumber) {
		this.currentNumber = currentNumber;
	}

	public RecordStatus getSeriesStatus() {
		return seriesStatus;
	}

	public void setSeriesStatus(RecordStatus seriesStatus) {
		this.seriesStatus = seriesStatus;
	}

	public List<ActionsDetails> getActionDetailsLog() {
		return actionDetailsLog;
	}

	public void setActionDetailsLog(List<ActionsDetails> actionDetailsLog) {
		this.actionDetailsLog = actionDetailsLog;
	}

	

	/**
	 * @return the districtCode
	 */
	public String getOfficeNumberSeries() {
		return officeNumberSeries;
	}

	/**
	 * @param districtCode the districtCode to set
	 */
	public void setOfficeNumberSeries(String officeNumberSeries) {
		this.officeNumberSeries = officeNumberSeries;
	}

	/**
	 * @return the lastGeneratedPoolNumber
	 */
	public Integer getLastGeneratedPoolNumber() {
		return lastGeneratedPoolNumber;
	}

	/**
	 * @param lastGeneratedPoolNumber the lastGeneratedPoolNumber to set
	 */
	public void setLastGeneratedPoolNumber(Integer lastGeneratedPoolNumber) {
		this.lastGeneratedPoolNumber = lastGeneratedPoolNumber;
	}

	/**
	 * @return the toDayStartNo
	 */
	public Integer getToDayStartNo() {
		return toDayStartNo;
	}

	/**
	 * @param toDayStartNo the toDayStartNo to set
	 */
	public void setToDayStartNo(Integer toDayStartNo) {
		this.toDayStartNo = toDayStartNo;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the currentDate
	 */
	public LocalDate getCurrentDate() {
		return currentDate;
	}

	/**
	 * @param currentDate the currentDate to set
	 */
	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}

	/**
	 * @return the isDoneMissingPrNoCheck
	 */
	public Boolean getIsDoneMissingPrNoCheck() {
		return isDoneMissingPrNoCheck;
	}

	/**
	 * @param isDoneMissingPrNoCheck the isDoneMissingPrNoCheck to set
	 */
	public void setIsDoneMissingPrNoCheck(Boolean isDoneMissingPrNoCheck) {
		this.isDoneMissingPrNoCheck = isDoneMissingPrNoCheck;
	}

	/**
	 * @return the toDayEndNo
	 */
	public Integer getToDayEndNo() {
		return toDayEndNo;
	}

	/**
	 * @param toDayEndNo the toDayEndNo to set
	 */
	public void setToDayEndNo(Integer toDayEndNo) {
		this.toDayEndNo = toDayEndNo;
	}
	
}
