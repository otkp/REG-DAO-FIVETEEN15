package org.epragati.sn.dto;

import java.util.List;
import java.util.Map;

import org.epragati.common.dto.BaseEntity;
import org.epragati.constants.CovCategory;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pr_distict_config")
@CompoundIndexes({ 
	@CompoundIndex(name = "officeNumberSeries_and_officeNumberSeries", def = "{'officeNumberSeries': 1, 'vehicleType': 1}"),
	@CompoundIndex(name = "generationType_vech_Idx", def = "{'generationType': 1, 'vehicleType': 1}")
	
})
public class PRDistrictConfigDTO extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	private String officeNumberSeries;
	
	private CovCategory vehicleType;
	
	private List<String> pendingSeries;
	
	private Map<String, String> runningSeries;
	
	private List<String> finishedSeries;
	
	private Integer startNumber;

	private Integer endNumber;

	private Integer currentNumber;
	
	private String startSeries;
	
	private String currentSeries;
	
	private String endSeries;
	
	private String generationType;
	
	private List<Character> startCharNotIn;
	
	private List<Character> seriesCharNotIn;
	
	private Integer maxSeriesLength;
	
	private String endSeriesOfStartIndex;

	
	
	/**
	 * @return the startNumber
	 */
	public Integer getStartNumber() {
		return startNumber;
	}

	/**
	 * @param startNumber the startNumber to set
	 */
	public void setStartNumber(Integer startNumber) {
		this.startNumber = startNumber;
	}

	/**
	 * @return the endNumber
	 */
	public Integer getEndNumber() {
		return endNumber;
	}

	/**
	 * @param endNumber the endNumber to set
	 */
	public void setEndNumber(Integer endNumber) {
		this.endNumber = endNumber;
	}

	/**
	 * @return the currentNumber
	 */
	public Integer getCurrentNumber() {
		return currentNumber;
	}

	/**
	 * @param currentNumber the currentNumber to set
	 */
	public void setCurrentNumber(Integer currentNumber) {
		this.currentNumber = currentNumber;
	}

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
	 * @return the pendingSeries
	 */
	public List<String> getPendingSeries() {
		return pendingSeries;
	}

	/**
	 * @param pendingSeries the pendingSeries to set
	 */
	public void setPendingSeries(List<String> pendingSeries) {
		this.pendingSeries = pendingSeries;
	}

	/**
	 * @return the runningSeries
	 */
	public Map<String, String> getRunningSeries() {
		return runningSeries;
	}

	/**
	 * @param runningSeries the runningSeries to set
	 */
	public void setRunningSeries(Map<String, String> runningSeries) {
		this.runningSeries = runningSeries;
	}

	/**
	 * @return the vehicleType
	 */
	public CovCategory getVehicleType() {
		return vehicleType;
	}

	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(CovCategory vehicleType) {
		this.vehicleType = vehicleType;
	}

	/**
	 * @return the startSeries
	 */
	public String getStartSeries() {
		return startSeries;
	}

	/**
	 * @param startSeries the startSeries to set
	 */
	public void setStartSeries(String startSeries) {
		this.startSeries = startSeries;
	}

	/**
	 * @return the endSeries
	 */
	public String getEndSeries() {
		return endSeries;
	}

	/**
	 * @param endSeries the endSeries to set
	 */
	public void setEndSeries(String endSeries) {
		this.endSeries = endSeries;
	}

	/**
	 * @return the currentSeries
	 */
	public String getCurrentSeries() {
		return currentSeries;
	}

	/**
	 * @param currentSeries the currentSeries to set
	 */
	public void setCurrentSeries(String currentSeries) {
		this.currentSeries = currentSeries;
	}

	/**
	 * @return the finishedSeries
	 */
	public List<String> getFinishedSeries() {
		return finishedSeries;
	}

	/**
	 * @param finishedSeries the finishedSeries to set
	 */
	public void setFinishedSeries(List<String> finishedSeries) {
		this.finishedSeries = finishedSeries;
	}

	/**
	 * @return the generationType
	 */
	public String getGenerationType() {
		return generationType;
	}

	/**
	 * @param generationType the generationType to set
	 */
	public void setGenerationType(String generationType) {
		this.generationType = generationType;
	}

	public List<Character> getStartCharNotIn() {
		return startCharNotIn;
	}

	public void setStartCharNotIn(List<Character> startCharNotIn) {
		this.startCharNotIn = startCharNotIn;
	}

	public List<Character> getSeriesCharNotIn() {
		return seriesCharNotIn;
	}

	public void setSeriesCharNotIn(List<Character> seriesCharNotIn) {
		this.seriesCharNotIn = seriesCharNotIn;
	}

	public Integer getMaxSeriesLength() {
		return maxSeriesLength;
	}

	public void setMaxSeriesLength(Integer maxSeriesLength) {
		this.maxSeriesLength = maxSeriesLength;
	}

	/**
	 * @return the endSeriesOfStartIndex
	 */
	public String getEndSeriesOfStartIndex() {
		return endSeriesOfStartIndex;
	}

	/**
	 * @param endSeriesOfStartIndex the endSeriesOfStartIndex to set
	 */
	public void setEndSeriesOfStartIndex(String endSeriesOfStartIndex) {
		this.endSeriesOfStartIndex = endSeriesOfStartIndex;
	}
	
	
	
}
