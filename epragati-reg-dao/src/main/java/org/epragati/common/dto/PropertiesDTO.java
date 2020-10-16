package org.epragati.common.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.epragati.util.payment.ServiceEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "properties_details")
public class PropertiesDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private Map<String, String> propertyDetails;
	private Map<String, Integer> seatCapacityValidateCOV;

	private Boolean status;
	private boolean isCollectionCorrection;
	private List<CollectionCorrectionModule> ccModules;
	private Map<String, String> monthCode;
	private String covModule;

	private Boolean isVahanValidationInStagingForOtherSate;
	private Boolean isVahanValidationInRegDetailsForOtherSate;
	private Boolean isPrValidatonInRegDetailsForDataEntry;
	private Boolean istrValidationInStagingForDataEntry;
	private Boolean isInsuranceValidationInStagingForOtherState;
	private Boolean isInsuranceValidationInRegForOtherState;

	private Map<String, Integer> permitsValidity;

	private List<String> applicationStatus;
	private String module;
	private String stateName;
	private String regDate;
	private Boolean isVahanValidationInRegServicesForOtherSate;
	private List<String> listOfficesForGati;
	private Map<String, Integer> hoaServiceValue;
	private List<String> covs;
	private boolean permitCode;
	private Long taxAmountFrom;
	private Long taxAmountTo;
	private double amount;
	private Boolean isDL;
	private Integer otpLimitationPerDay;
	private Integer otpExpiredTime;

	private boolean enableDLRevenue;

	private String reportType;
	
	private Integer arvtWeight;
	private boolean arvtWeightFlag;
	
	private List<String> caste;
	
	private String serviceName;
	
private List<String> regCovs;
	
	private List<String> dlCovs;
	
	private List<String> allowNextQuarterTaxCovs;
	private List<Integer> allowingNextQuarterTaxInTheMonths;
	private Integer allowingNextQuarterTaxBeforeDays;
	private boolean allowNextQuarterTax;
	private String imageType;
	private String cmImage;
	private String minImage;
	private LocalDate noPenalty;
	
	private boolean isWithoutAadhar;
	private String transactionType;
	
	
	
	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	private String base64Image;
	
	public LocalDate getNoPenalty() {
		return noPenalty;
	}

	public void setNoPenalty(LocalDate noPenalty) {
		this.noPenalty = noPenalty;
	}

	private boolean allowFcImages;
	private List<String> officeCodes;
	
	
	
	public List<String> getRegCovs() {
		return regCovs;
	}

	public void setRegCovs(List<String> regCovs) {
		this.regCovs = regCovs;
	}

	public List<String> getDlCovs() {
		return dlCovs;
	}

	public void setDlCovs(List<String> dlCovs) {
		this.dlCovs = dlCovs;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public List<String> getCaste() {
		return caste;
	}

	public void setCaste(List<String> caste) {
		this.caste = caste;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public boolean isEnableDLRevenue() {
		return enableDLRevenue;
	}

	public void setEnableDLRevenue(boolean enableDLRevenue) {
		this.enableDLRevenue = enableDLRevenue;
	}

	private List<String> aadhaarBasedCov;

	private List<String> seatingBasedCovList;

	private List<String> taxExceptionPermitCode;

	private Map<String, String> dlUrls;
	private boolean dlUrlsStatus;

	private Map<String, String> covsWheeelsCount;

	private boolean weightAlt;

	private boolean obtTax;
	private boolean biLateralTaxCovs;

	private List<String> fuelType;

	private boolean fuelTypeStatus;

	private boolean nocAutoApprovalStatus;

	private Integer nocAutoApprovalDays;

	private boolean taxFromDrools;

	private boolean allowQuaterTax;
	private LocalDate prGeneratedDate;
	private int fcValidity;

	private String email;

	private boolean isEmailMissing;

	private Boolean authorizationAllowed;

	private String devopsTestToken;

	private boolean isQueryExecutorEnabled;

	private Integer tokenExpireDays;

	private Boolean isTowTokenExpireEnabled;

	private boolean skipAadharForTax;

	private String cov;
	private String playedAsCov;
	private Integer seatfrom;
	private Integer seatto;
	private Double tax;
	private boolean vcrTax;
	private List<CorrectionDropDownDTO> collectionType;
	private String roleType;

	private Map<String, Integer> taxType;
	private String payperiod;
	private boolean voluntaryPayPeriod;
	private Map<String, Integer> covAndVoluntaryTax;
	private double aitpTax;
	private Map<String, Integer> covAndAitpTax;
	private Boolean correctionStatus;

	private List<String> cardReturnReasons;

	private Boolean cardReturnReasonsExists;

	private List<String> otherStateQutTaxCovs;
	private boolean otherStateQutTaxCovsflag;
	private boolean otherStateAitpTax;

	private boolean enableTowConditions;

	private List<String> covToBlock;

	private boolean covCodeStatus;

	private int stoppageMvidays;
	private int stoppageDtcdays;
	private boolean stoppageDaysStatus;

	private String correctionModule;

	private List<Integer> monthsForStoppage;

	private DepartmentRolesDTO departmentRoles;

	private Boolean eodReportsStatus;

	private List<EodReportNamesDTO> servicesDropDown;

	private List<EodReportNamesDTO> citizenServices;

	private boolean eodReportsRolesStatus;

	private List<EodReportsRolesStatusdto> roles;

	private Integer minGvwLimit;

	private List<EodReportNamesDTO> moduleCode;

	private List<EodReportNamesDTO> dlCitizenServices;
	
	private Boolean deemandApprovalForNewReg;
	
	private Boolean deemandApprovalForRegService;
	
	private Integer deemandNewRegDays;
	
	private List<AutoActionDTO> deemandAutoAction;
	
	private Integer days;
	
    private List<VehicleTypeDTO> vehicleTypes;
    
    private String reportName;
	private String title;
	private List<ExcelHeaders> headers;
	
	private LocalDate fcLockDownPeriodFrom;
	private LocalDate fcLockDownPeriodTo;
	private boolean isFcLockDown;
	
	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<ExcelHeaders> getHeaders() {
		return headers;
	}

	public void setHeaders(List<ExcelHeaders> headers) {
		this.headers = headers;
	}

	public List<VehicleTypeDTO> getVehicleTypes() {
		return vehicleTypes;
	}

	public void setVehicleTypes(List<VehicleTypeDTO> vehicleTypes) {
		this.vehicleTypes = vehicleTypes;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public List<AutoActionDTO> getDeemandAutoAction() {
		return deemandAutoAction;
	}

	public void setDeemandAutoAction(List<AutoActionDTO> deemandAutoAction) {
		this.deemandAutoAction = deemandAutoAction;
	}

	public List<EodReportNamesDTO> getModuleCode() {
		return moduleCode;
	}

	public void setModuleCode(List<EodReportNamesDTO> moduleCode) {
		this.moduleCode = moduleCode;
	}

	public List<EodReportNamesDTO> getDlCitizenServices() {
		return dlCitizenServices;
	}

	public void setDlCitizenServices(List<EodReportNamesDTO> dlCitizenServices) {
		this.dlCitizenServices = dlCitizenServices;
	}

	public Integer getMinGvwLimit() {
		return minGvwLimit;
	}

	public void setMinGvwLimit(Integer minGvwLimit) {
		this.minGvwLimit = minGvwLimit;
	}

	public DepartmentRolesDTO getDepartmentRoles() {
		return departmentRoles;
	}

	public void setDepartmentRoles(DepartmentRolesDTO departmentRoles) {
		this.departmentRoles = departmentRoles;
	}

	public String getCorrectionModule() {
		return correctionModule;
	}

	public void setCorrectionModule(String correctionModule) {
		this.correctionModule = correctionModule;
	}

	public boolean isEnableTowConditions() {
		return enableTowConditions;
	}

	public void setEnableTowConditions(boolean enableTowConditions) {
		this.enableTowConditions = enableTowConditions;
	}

	public List<String> getCovToBlock() {
		return covToBlock;
	}

	public void setCovToBlock(List<String> covToBlock) {
		this.covToBlock = covToBlock;
	}

	public boolean isCovCodeStatus() {
		return covCodeStatus;
	}

	public void setCovCodeStatus(boolean covCodeStatus) {
		this.covCodeStatus = covCodeStatus;
	}

	public Boolean getCorrectionStatus() {
		return correctionStatus;
	}

	public void setCorrectionStatus(Boolean correctionStatus) {
		this.correctionStatus = correctionStatus;
	}

	public List<CorrectionDropDownDTO> getCollectionType() {
		return collectionType;
	}

	public void setCollectionType(List<CorrectionDropDownDTO> collectionType) {
		this.collectionType = collectionType;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public Integer getTokenExpireDays() {
		return tokenExpireDays;
	}

	public void setTokenExpireDays(Integer tokenExpireDays) {
		this.tokenExpireDays = tokenExpireDays;
	}

	public Boolean getIsTowTokenExpireEnabled() {
		return isTowTokenExpireEnabled;
	}

	public void setIsTowTokenExpireEnabled(Boolean isTowTokenExpireEnabled) {
		this.isTowTokenExpireEnabled = isTowTokenExpireEnabled;
	}

	public boolean isQueryExecutorEnabled() {
		return isQueryExecutorEnabled;
	}

	public void setQueryExecutorEnabled(boolean isQueryExecutorEnabled) {
		this.isQueryExecutorEnabled = isQueryExecutorEnabled;
	}

	public Boolean getAuthorizationAllowed() {
		return authorizationAllowed;
	}

	public void setAuthorizationAllowed(Boolean authorizationAllowed) {
		this.authorizationAllowed = authorizationAllowed;
	}

	public String getDevopsTestToken() {
		return devopsTestToken;
	}

	public void setDevopsTestToken(String devopsTestToken) {
		this.devopsTestToken = devopsTestToken;
	}

	public boolean isNocAutoApprovalStatus() {
		return nocAutoApprovalStatus;
	}

	public void setNocAutoApprovalStatus(boolean nocAutoApprovalStatus) {
		this.nocAutoApprovalStatus = nocAutoApprovalStatus;
	}

	public Integer getNocAutoApprovalDays() {
		return nocAutoApprovalDays;
	}

	public void setNocAutoApprovalDays(Integer nocAutoApprovalDays) {
		this.nocAutoApprovalDays = nocAutoApprovalDays;
	}

	private List<Integer> noOfMonthsForAllIndiaPermit;

	public boolean isFuelTypeStatus() {
		return fuelTypeStatus;
	}

	public void setFuelTypeStatus(boolean fuelTypeStatus) {
		this.fuelTypeStatus = fuelTypeStatus;
	}

	public List<String> getFuelType() {
		return fuelType;
	}

	public void setFuelType(List<String> fuelType) {
		this.fuelType = fuelType;
	}

	public Boolean getIsVahanValidationInStagingForOtherSate() {
		return isVahanValidationInStagingForOtherSate;
	}

	public void setIsVahanValidationInStagingForOtherSate(Boolean isVahanValidationInStagingForOtherSate) {
		this.isVahanValidationInStagingForOtherSate = isVahanValidationInStagingForOtherSate;
	}

	public Boolean getIsVahanValidationInRegDetailsForOtherSate() {
		return isVahanValidationInRegDetailsForOtherSate;
	}

	public void setIsVahanValidationInRegDetailsForOtherSate(Boolean isVahanValidationInRegDetailsForOtherSate) {
		this.isVahanValidationInRegDetailsForOtherSate = isVahanValidationInRegDetailsForOtherSate;
	}

	public Boolean getIsPrValidatonInRegDetailsForDataEntry() {
		return isPrValidatonInRegDetailsForDataEntry;
	}

	public void setIsPrValidatonInRegDetailsForDataEntry(Boolean isPrValidatonInRegDetailsForDataEntry) {
		this.isPrValidatonInRegDetailsForDataEntry = isPrValidatonInRegDetailsForDataEntry;
	}

	public Boolean getIstrValidationInStagingForDataEntry() {
		return istrValidationInStagingForDataEntry;
	}

	public void setIstrValidationInStagingForDataEntry(Boolean istrValidationInStagingForDataEntry) {
		this.istrValidationInStagingForDataEntry = istrValidationInStagingForDataEntry;
	}

	public Boolean getIsInsuranceValidationInStagingForOtherState() {
		return isInsuranceValidationInStagingForOtherState;
	}

	public void setIsInsuranceValidationInStagingForOtherState(Boolean isInsuranceValidationInStagingForOtherState) {
		this.isInsuranceValidationInStagingForOtherState = isInsuranceValidationInStagingForOtherState;
	}

	public Boolean getIsInsuranceValidationInRegForOtherState() {
		return isInsuranceValidationInRegForOtherState;
	}

	public void setIsInsuranceValidationInRegForOtherState(Boolean isInsuranceValidationInRegForOtherState) {
		this.isInsuranceValidationInRegForOtherState = isInsuranceValidationInRegForOtherState;
	}

	public Map<String, Integer> getSeatCapacityValidateCOV() {
		return seatCapacityValidateCOV;
	}

	public void setSeatCapacityValidateCOV(Map<String, Integer> seatCapacityValidateCOV) {
		this.seatCapacityValidateCOV = seatCapacityValidateCOV;
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
	 * @return the propertyDetails
	 */
	public Map<String, String> getPropertyDetails() {
		return propertyDetails;
	}

	/**
	 * @param propertyDetails the propertyDetails to set
	 */
	public void setPropertyDetails(Map<String, String> propertyDetails) {
		this.propertyDetails = propertyDetails;
	}

	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * @return the monthCode
	 */
	public Map<String, String> getMonthCode() {
		return monthCode;
	}

	/**
	 * @param monthCode the monthCode to set
	 */
	public void setMonthCode(Map<String, String> monthCode) {
		this.monthCode = monthCode;
	}

	/**
	 * @return the permitsValidity
	 */
	public Map<String, Integer> getPermitsValidity() {
		return permitsValidity;
	}

	/**
	 * @param permitsValidity the permitsValidity to set
	 */
	public void setPermitsValidity(Map<String, Integer> permitsValidity) {
		this.permitsValidity = permitsValidity;
	}

	/**
	 * @return the applicationStatus
	 */
	public List<String> getApplicationStatus() {
		return applicationStatus;
	}

	/**
	 * @param applicationStatus the applicationStatus to set
	 */
	public void setApplicationStatus(List<String> applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	/**
	 * @return the module
	 */
	public String getModule() {
		return module;
	}

	/**
	 * @param module the module to set
	 */
	public void setModule(String module) {
		this.module = module;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public Boolean getIsVahanValidationInRegServicesForOtherSate() {
		return isVahanValidationInRegServicesForOtherSate;
	}

	public void setIsVahanValidationInRegServicesForOtherSate(Boolean isVahanValidationInRegServicesForOtherSate) {
		this.isVahanValidationInRegServicesForOtherSate = isVahanValidationInRegServicesForOtherSate;
	}

	/**
	 * @return the listOfficesForGati
	 */
	public List<String> getListOfficesForGati() {
		return listOfficesForGati;
	}

	/**
	 * @param listOfficesForGati the listOfficesForGati to set
	 */
	public void setListOfficesForGati(List<String> listOfficesForGati) {
		this.listOfficesForGati = listOfficesForGati;
	}

	/**
	 * @return the hoaServiceValue
	 */
	public Map<String, Integer> getHoaServiceValue() {
		return hoaServiceValue;
	}

	/**
	 * @param hoaServiceValue the hoaServiceValue to set
	 */
	public void setHoaServiceValue(Map<String, Integer> hoaServiceValue) {
		this.hoaServiceValue = hoaServiceValue;
	}

	/**
	 * @return the covs
	 */
	public List<String> getCovs() {
		return covs;
	}

	/**
	 * @param covs the covs to set
	 */
	public void setCovs(List<String> covs) {
		this.covs = covs;
	}

	/**
	 * @return the permitCode
	 */
	public boolean isPermitCode() {
		return permitCode;
	}

	/**
	 * @param permitCode the permitCode to set
	 */
	public void setPermitCode(boolean permitCode) {
		this.permitCode = permitCode;
	}

	/**
	 * @return the seatingBasedCovList
	 */
	public List<String> getSeatingBasedCovList() {
		return seatingBasedCovList;
	}

	/**
	 * @param seatingBasedCovList the seatingBasedCovList to set
	 */
	public void setSeatingBasedCovList(List<String> seatingBasedCovList) {
		this.seatingBasedCovList = seatingBasedCovList;
	}

	/**
	 * @return the taxExceptionPermitCode
	 */
	public List<String> getTaxExceptionPermitCode() {
		return taxExceptionPermitCode;
	}

	/**
	 * @param taxExceptionPermitCode the taxExceptionPermitCode to set
	 */
	public void setTaxExceptionPermitCode(List<String> taxExceptionPermitCode) {
		this.taxExceptionPermitCode = taxExceptionPermitCode;
	}

	/**
	 * @return the taxAmountFrom
	 */
	public Long getTaxAmountFrom() {
		return taxAmountFrom;
	}

	/**
	 * @param taxAmountFrom the taxAmountFrom to set
	 */
	public void setTaxAmountFrom(Long taxAmountFrom) {
		this.taxAmountFrom = taxAmountFrom;
	}

	/**
	 * @return the taxAmountTo
	 */
	public Long getTaxAmountTo() {
		return taxAmountTo;
	}

	/**
	 * @param taxAmountTo the taxAmountTo to set
	 */
	public void setTaxAmountTo(Long taxAmountTo) {
		this.taxAmountTo = taxAmountTo;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the isDL
	 */
	public Boolean getIsDL() {
		return isDL;
	}

	/**
	 * @param isDL the isDL to set
	 */
	public void setIsDL(Boolean isDL) {
		this.isDL = isDL;
	}

	/**
	 * @return the dlUrls
	 */
	public Map<String, String> getDlUrls() {
		return dlUrls;
	}

	/**
	 * @param dlUrls the dlUrls to set
	 */
	public void setDlUrls(Map<String, String> dlUrls) {
		this.dlUrls = dlUrls;
	}

	/**
	 * @return the dlUrlsStatus
	 */
	public boolean isDlUrlsStatus() {
		return dlUrlsStatus;
	}

	/**
	 * @param dlUrlsStatus the dlUrlsStatus to set
	 */
	public void setDlUrlsStatus(boolean dlUrlsStatus) {
		this.dlUrlsStatus = dlUrlsStatus;
	}

	/**
	 * @return the otpLimitationPerDay
	 */
	public Integer getOtpLimitationPerDay() {
		return otpLimitationPerDay;
	}

	/**
	 * @param otpLimitationPerDay the otpLimitationPerDay to set
	 */
	public void setOtpLimitationPerDay(Integer otpLimitationPerDay) {
		this.otpLimitationPerDay = otpLimitationPerDay;
	}

	/**
	 * @return the otpExpiredTime
	 */
	public Integer getOtpExpiredTime() {
		return otpExpiredTime;
	}

	/**
	 * @param otpExpiredTime the otpExpiredTime to set
	 */
	public void setOtpExpiredTime(Integer otpExpiredTime) {
		this.otpExpiredTime = otpExpiredTime;
	}

	/**
	 * @return the aadhaarBasedCov
	 */
	public List<String> getAadhaarBasedCov() {
		return aadhaarBasedCov;
	}

	/**
	 * @param aadhaarBasedCov the aadhaarBasedCov to set
	 */
	public void setAadhaarBasedCov(List<String> aadhaarBasedCov) {
		this.aadhaarBasedCov = aadhaarBasedCov;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public boolean isWeightAlt() {
		return weightAlt;
	}

	public void setWeightAlt(boolean weightAlt) {
		this.weightAlt = weightAlt;
	}

	public boolean isObtTax() {
		return obtTax;
	}

	public void setObtTax(boolean obtTax) {
		this.obtTax = obtTax;
	}

	public boolean isBiLateralTaxCovs() {
		return biLateralTaxCovs;
	}

	public void setBiLateralTaxCovs(boolean biLateralTaxCovs) {
		this.biLateralTaxCovs = biLateralTaxCovs;
	}

	/**
	 * @return the covModule
	 */
	public String getCovModule() {
		return covModule;
	}

	/**
	 * @param covModule the covModule to set
	 */
	public void setCovModule(String covModule) {
		this.covModule = covModule;
	}

	/**
	 * @return the covsWheeelsCount
	 */
	public Map<String, String> getCovsWheeelsCount() {
		return covsWheeelsCount;
	}

	/**
	 * @param covsWheeelsCount the covsWheeelsCount to set
	 */
	public void setCovsWheeelsCount(Map<String, String> covsWheeelsCount) {
		this.covsWheeelsCount = covsWheeelsCount;
	}

	/**
	 * @return the noOfMonthsForAllIndiaPermit
	 */
	public List<Integer> getNoOfMonthsForAllIndiaPermit() {
		return noOfMonthsForAllIndiaPermit;
	}

	/**
	 * @param noOfMonthsForAllIndiaPermit the noOfMonthsForAllIndiaPermit to set
	 */
	public void setNoOfMonthsForAllIndiaPermit(List<Integer> noOfMonthsForAllIndiaPermit) {
		this.noOfMonthsForAllIndiaPermit = noOfMonthsForAllIndiaPermit;
	}

	public boolean isTaxFromDrools() {
		return taxFromDrools;
	}

	public void setTaxFromDrools(boolean taxFromDrools) {
		this.taxFromDrools = taxFromDrools;
	}

	public boolean isAllowQuaterTax() {
		return allowQuaterTax;
	}

	public void setAllowQuaterTax(boolean allowQuaterTax) {
		this.allowQuaterTax = allowQuaterTax;
	}

	public LocalDate getPrGeneratedDate() {
		return prGeneratedDate;
	}

	public void setPrGeneratedDate(LocalDate prGeneratedDate) {
		this.prGeneratedDate = prGeneratedDate;
	}

	public int getFcValidity() {
		return fcValidity;
	}

	public void setFcValidity(int fcValidity) {
		this.fcValidity = fcValidity;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEmailMissing() {
		return isEmailMissing;
	}

	public void setEmailMissing(boolean isEmailMissing) {
		this.isEmailMissing = isEmailMissing;
	}

	public boolean isSkipAadharForTax() {
		return skipAadharForTax;
	}

	public void setSkipAadharForTax(boolean skipAadharForTax) {
		this.skipAadharForTax = skipAadharForTax;
	}

	public String getCov() {
		return cov;
	}

	public void setCov(String cov) {
		this.cov = cov;
	}

	public String getPlayedAsCov() {
		return playedAsCov;
	}

	public void setPlayedAsCov(String playedAsCov) {
		this.playedAsCov = playedAsCov;
	}

	public Integer getSeatfrom() {
		return seatfrom;
	}

	public void setSeatfrom(Integer seatfrom) {
		this.seatfrom = seatfrom;
	}

	public Integer getSeatto() {
		return seatto;
	}

	public void setSeatto(Integer seatto) {
		this.seatto = seatto;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public boolean isVcrTax() {
		return vcrTax;
	}

	public void setVcrTax(boolean vcrTax) {
		this.vcrTax = vcrTax;
	}

	public Map<String, Integer> getTaxType() {
		return taxType;
	}

	public void setTaxType(Map<String, Integer> taxType) {
		this.taxType = taxType;
	}

	public String getPayperiod() {
		return payperiod;
	}

	public void setPayperiod(String payperiod) {
		this.payperiod = payperiod;
	}

	public boolean isVoluntaryPayPeriod() {
		return voluntaryPayPeriod;
	}

	public void setVoluntaryPayPeriod(boolean voluntaryPayPeriod) {
		this.voluntaryPayPeriod = voluntaryPayPeriod;
	}

	public Map<String, Integer> getCovAndVoluntaryTax() {
		return covAndVoluntaryTax;
	}

	public void setCovAndVoluntaryTax(Map<String, Integer> covAndVoluntaryTax) {
		this.covAndVoluntaryTax = covAndVoluntaryTax;
	}

	public double getAitpTax() {
		return aitpTax;
	}

	public void setAitpTax(double aitpTax) {
		this.aitpTax = aitpTax;
	}

	public Map<String, Integer> getCovAndAitpTax() {
		return covAndAitpTax;
	}

	public void setCovAndAitpTax(Map<String, Integer> covAndAitpTax) {
		this.covAndAitpTax = covAndAitpTax;
	}

	public List<String> getCardReturnReasons() {
		return cardReturnReasons;
	}

	public void setCardReturnReasons(List<String> cardReturnReasons) {
		this.cardReturnReasons = cardReturnReasons;
	}

	public Boolean getCardReturnReasonsExists() {
		return cardReturnReasonsExists;
	}

	public void setCardReturnReasonsExists(Boolean cardReturnReasonsExists) {
		this.cardReturnReasonsExists = cardReturnReasonsExists;
	}

	public List<String> getOtherStateQutTaxCovs() {
		return otherStateQutTaxCovs;
	}

	public void setOtherStateQutTaxCovs(List<String> otherStateQutTaxCovs) {
		this.otherStateQutTaxCovs = otherStateQutTaxCovs;
	}

	public boolean isOtherStateQutTaxCovsflag() {
		return otherStateQutTaxCovsflag;
	}

	public void setOtherStateQutTaxCovsflag(boolean otherStateQutTaxCovsflag) {
		this.otherStateQutTaxCovsflag = otherStateQutTaxCovsflag;
	}

	public boolean isOtherStateAitpTax() {
		return otherStateAitpTax;
	}

	public void setOtherStateAitpTax(boolean otherStateAitpTax) {
		this.otherStateAitpTax = otherStateAitpTax;
	}

	public int getStoppageMvidays() {
		return stoppageMvidays;
	}

	public void setStoppageMvidays(int stoppageMvidays) {
		this.stoppageMvidays = stoppageMvidays;
	}

	public int getStoppageDtcdays() {
		return stoppageDtcdays;
	}

	public void setStoppageDtcdays(int stoppageDtcdays) {
		this.stoppageDtcdays = stoppageDtcdays;
	}

	public boolean isStoppageDaysStatus() {
		return stoppageDaysStatus;
	}

	public void setStoppageDaysStatus(boolean stoppageDaysStatus) {
		this.stoppageDaysStatus = stoppageDaysStatus;
	}

	public boolean isCollectionCorrection() {
		return isCollectionCorrection;
	}

	public void setCollectionCorrection(boolean isCollectionCorrection) {
		this.isCollectionCorrection = isCollectionCorrection;
	}

	public List<CollectionCorrectionModule> getCcModules() {
		return ccModules;
	}

	public void setCcModules(List<CollectionCorrectionModule> ccModules) {
		this.ccModules = ccModules;
	}

	public List<Integer> getMonthsForStoppage() {
		return monthsForStoppage;
	}

	public void setMonthsForStoppage(List<Integer> monthsForStoppage) {
		this.monthsForStoppage = monthsForStoppage;
	}

	/**
	 * @return the eodReportsStatus
	 */
	public Boolean getEodReportsStatus() {
		return eodReportsStatus;
	}

	/**
	 * @param eodReportsStatus the eodReportsStatus to set
	 */
	public void setEodReportsStatus(Boolean eodReportsStatus) {
		this.eodReportsStatus = eodReportsStatus;
	}

	/**
	 * @return the servicesDropDown
	 */
	public List<EodReportNamesDTO> getServicesDropDown() {
		return servicesDropDown;
	}

	/**
	 * @param servicesDropDown the servicesDropDown to set
	 */
	public void setServicesDropDown(List<EodReportNamesDTO> servicesDropDown) {
		this.servicesDropDown = servicesDropDown;
	}

	/**
	 * @return the citizenServices
	 */
	public List<EodReportNamesDTO> getCitizenServices() {
		return citizenServices;
	}

	/**
	 * @param citizenServices the citizenServices to set
	 */
	public void setCitizenServices(List<EodReportNamesDTO> citizenServices) {
		this.citizenServices = citizenServices;
	}

	public boolean isEodReportsRolesStatus() {
		return eodReportsRolesStatus;
	}

	public void setEodReportsRolesStatus(boolean eodReportsRolesStatus) {
		this.eodReportsRolesStatus = eodReportsRolesStatus;
	}

	public List<EodReportsRolesStatusdto> getRoles() {
		return roles;
	}

	public void setRoles(List<EodReportsRolesStatusdto> roles) {
		this.roles = roles;
	}

	public Boolean getDeemandApprovalForNewReg() {
		return deemandApprovalForNewReg;
	}

	public void setDeemandApprovalForNewReg(Boolean deemandApprovalForNewReg) {
		this.deemandApprovalForNewReg = deemandApprovalForNewReg;
	}

	public Boolean getDeemandApprovalForRegService() {
		return deemandApprovalForRegService;
	}

	public void setDeemandApprovalForRegService(Boolean deemandApprovalForRegService) {
		this.deemandApprovalForRegService = deemandApprovalForRegService;
	}

	public Integer getDeemandNewRegDays() {
		return deemandNewRegDays;
	}

	public void setDeemandNewRegDays(Integer deemandNewRegDays) {
		this.deemandNewRegDays = deemandNewRegDays;
	}

	public Integer getArvtWeight() {
		return arvtWeight;
	}

	public void setArvtWeight(Integer arvtWeight) {
		this.arvtWeight = arvtWeight;
	}

	public boolean isArvtWeightFlag() {
		return arvtWeightFlag;
	}

	public void setArvtWeightFlag(boolean arvtWeightFlag) {
		this.arvtWeightFlag = arvtWeightFlag;
	}

	public List<String> getAllowNextQuarterTaxCovs() {
		return allowNextQuarterTaxCovs;
	}

	public void setAllowNextQuarterTaxCovs(List<String> allowNextQuarterTaxCovs) {
		this.allowNextQuarterTaxCovs = allowNextQuarterTaxCovs;
	}

	public List<Integer> getAllowingNextQuarterTaxInTheMonths() {
		return allowingNextQuarterTaxInTheMonths;
	}

	public void setAllowingNextQuarterTaxInTheMonths(List<Integer> allowingNextQuarterTaxInTheMonths) {
		this.allowingNextQuarterTaxInTheMonths = allowingNextQuarterTaxInTheMonths;
	}

	public Integer getAllowingNextQuarterTaxBeforeDays() {
		return allowingNextQuarterTaxBeforeDays;
	}

	public void setAllowingNextQuarterTaxBeforeDays(Integer allowingNextQuarterTaxBeforeDays) {
		this.allowingNextQuarterTaxBeforeDays = allowingNextQuarterTaxBeforeDays;
	}

	public boolean isAllowNextQuarterTax() {
		return allowNextQuarterTax;
	}

	public void setAllowNextQuarterTax(boolean allowNextQuarterTax) {
		this.allowNextQuarterTax = allowNextQuarterTax;
	}

	public boolean isAllowFcImages() {
		return allowFcImages;
	}

	public void setAllowFcImages(boolean allowFcImages) {
		this.allowFcImages = allowFcImages;
	}

	public List<String> getOfficeCodes() {
		return officeCodes;
	}

	public void setOfficeCodes(List<String> officeCodes) {
		this.officeCodes = officeCodes;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public String getCmImage() {
		return cmImage;
	}

	public void setCmImage(String cmImage) {
		this.cmImage = cmImage;
	}

	public String getMinImage() {
		return minImage;
	}

	public void setMinImage(String minImage) {
		this.minImage = minImage;
	}

	public LocalDate getFcLockDownPeriodFrom() {
		return fcLockDownPeriodFrom;
	}

	public void setFcLockDownPeriodFrom(LocalDate fcLockDownPeriodFrom) {
		this.fcLockDownPeriodFrom = fcLockDownPeriodFrom;
	}

	public LocalDate getFcLockDownPeriodTo() {
		return fcLockDownPeriodTo;
	}

	public void setFcLockDownPeriodTo(LocalDate fcLockDownPeriodTo) {
		this.fcLockDownPeriodTo = fcLockDownPeriodTo;
	}

	public boolean isFcLockDown() {
		return isFcLockDown;
	}

	public void setFcLockDown(boolean isFcLockDown) {
		this.isFcLockDown = isFcLockDown;
	}

	

	public boolean isWithoutAadhar() {
		return isWithoutAadhar;
	}

	public void setWithoutAadhar(boolean isWithoutAadhar) {
		this.isWithoutAadhar = isWithoutAadhar;
	}

	public String getBase64Image() {
		return base64Image;
	}

	public void setBase64Image(String base64Image) {
		this.base64Image = base64Image;
	}

	
	
}