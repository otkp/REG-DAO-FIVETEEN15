package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.regservice.dto.ActionDetails;
import org.epragati.vcrImage.dto.OverLoadDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_vcr_offences")
@CompoundIndexes({ 
	@CompoundIndex(name = "classOfVehicles_and_category", def = "{'classOfVehicles': 1, 'category': 1}"),
	@CompoundIndex(name = "offenceDescription_and_status", def = "{'offenceDescription': 1, 'status': 1}")
})
public class OffenceDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	/**
	 * added letter
	 * 
	 * @return
	 */

	/*private String offenseCode;
	private String offenseDesc;
	private String classOfVehicle;*/
	//@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime effectiveDate;
	/*private String minAmt;
	private String maxAmt;*/
	private String crtdUsr;
	//@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime crtdDt;
	private String lstUpdUsr;
	//@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime lstUpdDt;
	private boolean active;
	private boolean updateFlag;

	private String roadSafetyRelated;
	private OverLoadDTO overLoadDesc;
	//@JsonFormat(shape = Shape.STRING)
	private Integer noOfPersons;
	private Boolean offencePaid;
	
	private String slno;
	private String offendingSection;
	private String penalSections;
	private String section;
	private String classOfVehicles;
	private String covDescription;
	private String category;
	
	private String offenceDescription;
	private Integer amount1;
	private Integer amount2;
	private Integer fixedAmount;
	private boolean allowCorrection;
	private String mappedOffence;
	private boolean basedOnPersons;
	private boolean basedOnHrs;
	private Integer noOfHrs;
	private boolean basedOnWeight;
	private String weight;
	private Integer mviEnteredweight;
	private boolean shouldNotClose;
	private String companyName;
	private LocalDate validFrom;
	private LocalDate validTo;
	private String fcNumber;
	private boolean status;
	private Double taxAmount;
	private String permitNumber;
	private String dlNumber;
	private String perkg;
	private String offenceCategory;
	private String analyserName;
	private String serialNumber;
	private String testReportNo;
	private LocalDateTime drunkDaeCheck;
	private String doctorReportNo;
	private Integer bac;
	private Integer priority;
	private Integer perPerson;
	private boolean basedOnCFX;
	private boolean basedOnAnimals;
	private Integer noOfAnimals;
	private String remarks;
	private String permitType;
	
	private Boolean isOffenceClosed = Boolean.FALSE;
	private LocalDateTime offenceClosedDate;
	private List<ActionDetails> actions;
	private Boolean intrastate;
	private Boolean otherOffence;
	private String otherOffenceName;
	private Boolean isRoadSafety= Boolean.FALSE;
	
	public Integer getNoOfPersons() {
		return noOfPersons;
	}
	public void setNoOfPersons(Integer noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	/*public String getOffenseDesc() {
		return offenseDesc;
	}
	public void setOffenseDesc(String offenseDesc) {
		this.offenseDesc = offenseDesc;
	}
	public String getClassOfVehicle() {
		return classOfVehicle;
	}
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}*/
	public LocalDateTime getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(LocalDateTime effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	/*public String getMinAmt() {
		return minAmt;
	}
	public void setMinAmt(String minAmt) {
		this.minAmt = minAmt;
	}
	public String getMaxAmt() {
		return maxAmt;
	}
	public void setMaxAmt(String maxAmt) {
		this.maxAmt = maxAmt;
	}*/
	public String getCrtdUsr() {
		return crtdUsr;
	}
	public void setCrtdUsr(String crtdUsr) {
		this.crtdUsr = crtdUsr;
	}
	public LocalDateTime getCrtdDt() {
		return crtdDt;
	}
	public void setCrtdDt(LocalDateTime crtdDt) {
		this.crtdDt = crtdDt;
	}
	public String getLstUpdUsr() {
		return lstUpdUsr;
	}
	public void setLstUpdUsr(String lstUpdUsr) {
		this.lstUpdUsr = lstUpdUsr;
	}
	public LocalDateTime getLstUpdDt() {
		return lstUpdDt;
	}
	public void setLstUpdDt(LocalDateTime lstUpdDt) {
		this.lstUpdDt = lstUpdDt;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isUpdateFlag() {
		return updateFlag;
	}
	public void setUpdateFlag(boolean updateFlag) {
		this.updateFlag = updateFlag;
	}
	public Integer getFixedAmount() {
		return fixedAmount;
	}
	public void setFixedAmount(Integer fixedAmount) {
		this.fixedAmount = fixedAmount;
	}
	public String getRoadSafetyRelated() {
		return roadSafetyRelated;
	}
	public void setRoadSafetyRelated(String roadSafetyRelated) {
		this.roadSafetyRelated = roadSafetyRelated;
	}
	public OverLoadDTO getOverLoadDesc() {
		return overLoadDesc;
	}
	public void setOverLoadDesc(OverLoadDTO overLoadDesc) {
		this.overLoadDesc = overLoadDesc;
	}
	public Boolean getOffencePaid() {
		return offencePaid;
	}
	public void setOffencePaid(Boolean offencePaid) {
		this.offencePaid = offencePaid;
	}
	public String getOffenceDescription() {
		return offenceDescription;
	}
	public void setOffenceDescription(String offenceDescription) {
		this.offenceDescription = offenceDescription;
	}
	public Integer getAmount1() {
		return amount1;
	}
	public void setAmount1(Integer amount1) {
		this.amount1 = amount1;
	}
	public Integer getAmount2() {
		return amount2;
	}
	public void setAmount2(Integer amount2) {
		this.amount2 = amount2;
	}
	/*public String getOffenseCode() {
		return offenseCode;
	}
	public void setOffenseCode(String offenseCode) {
		this.offenseCode = offenseCode;
	}
*/
	public String getSlno() {
		return slno;
	}
	public void setSlno(String slno) {
		this.slno = slno;
	}
	public String getOffendingSection() {
		return offendingSection;
	}
	public void setOffendingSection(String offendingSection) {
		this.offendingSection = offendingSection;
	}
	public String getPenalSections() {
		return penalSections;
	}
	public void setPenalSections(String penalSections) {
		this.penalSections = penalSections;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getClassOfVehicles() {
		return classOfVehicles;
	}
	public void setClassOfVehicles(String classOfVehicles) {
		this.classOfVehicles = classOfVehicles;
	}
	public String getCovDescription() {
		return covDescription;
	}
	public void setCovDescription(String covDescription) {
		this.covDescription = covDescription;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isAllowCorrection() {
		return allowCorrection;
	}
	public void setAllowCorrection(boolean allowCorrection) {
		this.allowCorrection = allowCorrection;
	}
	public String getMappedOffence() {
		return mappedOffence;
	}
	public void setMappedOffence(String mappedOffence) {
		this.mappedOffence = mappedOffence;
	}
	public boolean isBasedOnPersons() {
		return basedOnPersons;
	}
	public void setBasedOnPersons(boolean basedOnPersons) {
		this.basedOnPersons = basedOnPersons;
	}
	public boolean isBasedOnHrs() {
		return basedOnHrs;
	}
	public void setBasedOnHrs(boolean basedOnHrs) {
		this.basedOnHrs = basedOnHrs;
	}
	public Integer getNoOfHrs() {
		return noOfHrs;
	}
	public void setNoOfHrs(Integer noOfHrs) {
		this.noOfHrs = noOfHrs;
	}
	public boolean isBasedOnWeight() {
		return basedOnWeight;
	}
	public void setBasedOnWeight(boolean basedOnWeight) {
		this.basedOnWeight = basedOnWeight;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public boolean isShouldNotClose() {
		return shouldNotClose;
	}
	public void setShouldNotClose(boolean shouldNotClose) {
		this.shouldNotClose = shouldNotClose;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public LocalDate getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}
	public LocalDate getValidTo() {
		return validTo;
	}
	public void setValidTo(LocalDate validTo) {
		this.validTo = validTo;
	}
	public String getFcNumber() {
		return fcNumber;
	}
	public void setFcNumber(String fcNumber) {
		this.fcNumber = fcNumber;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}
	public String getPermitNumber() {
		return permitNumber;
	}
	public void setPermitNumber(String permitNumber) {
		this.permitNumber = permitNumber;
	}
	public String getDlNumber() {
		return dlNumber;
	}
	public void setDlNumber(String dlNumber) {
		this.dlNumber = dlNumber;
	}
	public String getPerkg() {
		return perkg;
	}
	public void setPerkg(String perkg) {
		this.perkg = perkg;
	}
	public Integer getMviEnteredweight() {
		return mviEnteredweight;
	}
	public void setMviEnteredweight(Integer mviEnteredweight) {
		this.mviEnteredweight = mviEnteredweight;
	}
	public String getOffenceCategory() {
		return offenceCategory;
	}
	public void setOffenceCategory(String offenceCategory) {
		this.offenceCategory = offenceCategory;
	}
	public String getAnalyserName() {
		return analyserName;
	}
	public void setAnalyserName(String analyserName) {
		this.analyserName = analyserName;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getTestReportNo() {
		return testReportNo;
	}
	public void setTestReportNo(String testReportNo) {
		this.testReportNo = testReportNo;
	}
	public LocalDateTime getDrunkDaeCheck() {
		return drunkDaeCheck;
	}
	public void setDrunkDaeCheck(LocalDateTime drunkDaeCheck) {
		this.drunkDaeCheck = drunkDaeCheck;
	}
	public String getDoctorReportNo() {
		return doctorReportNo;
	}
	public void setDoctorReportNo(String doctorReportNo) {
		this.doctorReportNo = doctorReportNo;
	}
	
	public Integer getBac() {
		return bac;
	}
	public void setBac(Integer bac) {
		this.bac = bac;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Integer getPerPerson() {
		return perPerson;
	}
	public void setPerPerson(Integer perPerson) {
		this.perPerson = perPerson;
	}
	public boolean isBasedOnCFX() {
		return basedOnCFX;
	}
	public void setBasedOnCFX(boolean basedOnCFX) {
		this.basedOnCFX = basedOnCFX;
	}
	public boolean isBasedOnAnimals() {
		return basedOnAnimals;
	}
	public void setBasedOnAnimals(boolean basedOnAnimals) {
		this.basedOnAnimals = basedOnAnimals;
	}
	public Integer getNoOfAnimals() {
		return noOfAnimals;
	}
	public void setNoOfAnimals(Integer noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * @return the isOffenceClosed
	 */
	public Boolean getIsOffenceClosed() {
		return isOffenceClosed;
	}
	/**
	 * @param isOffenceClosed the isOffenceClosed to set
	 */
	public void setIsOffenceClosed(Boolean isOffenceClosed) {
		this.isOffenceClosed = isOffenceClosed;
	}
	/**
	 * @return the offenceClosedDate
	 */
	public LocalDateTime getOffenceClosedDate() {
		return offenceClosedDate;
	}
	/**
	 * @param offenceClosedDate the offenceClosedDate to set
	 */
	public void setOffenceClosedDate(LocalDateTime offenceClosedDate) {
		this.offenceClosedDate = offenceClosedDate;
	}
	/**
	 * @return the actions
	 */
	public List<ActionDetails> getActions() {
		return actions;
	}
	/**
	 * @param actions the actions to set
	 */
	public void setActions(List<ActionDetails> actions) {
		this.actions = actions;
	}
	public String getPermitType() {
		return permitType;
	}
	public void setPermitType(String permitType) {
		this.permitType = permitType;
	}
	public Boolean getIntrastate() {
		return intrastate;
	}
	public void setIntrastate(Boolean intrastate) {
		this.intrastate = intrastate;
	}
	public Boolean getOtherOffence() {
		return otherOffence;
	}
	public void setOtherOffence(Boolean otherOffence) {
		this.otherOffence = otherOffence;
	}
	public String getOtherOffenceName() {
		return otherOffenceName;
	}
	public void setOtherOffenceName(String otherOffenceName) {
		this.otherOffenceName = otherOffenceName;
	}
	public Boolean getIsRoadSafety() {
		return isRoadSafety;
	}
	public void setIsRoadSafety(Boolean isRoadSafety) {
		this.isRoadSafety = isRoadSafety;
	}
	
	
	 
}
