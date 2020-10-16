package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.constants.OwnerTypeEnum;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection="registration_details")
public class RegistrationCardDetailsDTO extends BaseEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//RC
	private boolean isDuplicate;
	
	private String vehRegNo;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate regDate;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime regValidity;
	
	private OfficeDTO officeDetails;
	
	//Vehicle
	private String vehCategory;
	
	private OwnerTypeEnum ownerType;
	
	private String firstName;
	
	private VahanDetailsDTO vahanDetails;
	
	private String classOfVehicleDesc;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate taxPaidUpto;
	
	private String signOfAuth;
	
	//Owner
	private String signOfOwner;
	
	private String name;
	
	private String parentsName;
	
	private ApplicantAddressDTO presentAddress;
	
	//Tax
	private Long amount;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate taxValidUpto;
	
	private boolean backendUpdateFlag;  //(nothing but isCardPrinted)
	
	private FinanceDetailsDTO financeDetails;
	
	private InsuranceDetailsDTO insuranceDetails;
	
	private List<Integer> serviceIds;

	/**
	 * @return the isDuplicate
	 */
	public boolean isDuplicate() {
		return isDuplicate;
	}

	/**
	 * @param isDuplicate the isDuplicate to set
	 */
	public void setDuplicate(boolean isDuplicate) {
		this.isDuplicate = isDuplicate;
	}

	/**
	 * @return the vehRegNo
	 */
	public String getVehRegNo() {
		return vehRegNo;
	}

	/**
	 * @param vehRegNo the vehRegNo to set
	 */
	public void setVehRegNo(String vehRegNo) {
		this.vehRegNo = vehRegNo;
	}

	/**
	 * @return the regDate
	 */
	public LocalDate getRegDate() {
		return regDate;
	}

	/**
	 * @param regDate the regDate to set
	 */
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	/**
	 * @return the regValidity
	 */
	public LocalDateTime getRegValidity() {
		return regValidity;
	}

	/**
	 * @param regValidity the regValidity to set
	 */
	public void setRegValidity(LocalDateTime regValidity) {
		this.regValidity = regValidity;
	}

	/**
	 * @return the officeDetails
	 */
	public OfficeDTO getOfficeDetails() {
		return officeDetails;
	}

	/**
	 * @param officeDetails the officeDetails to set
	 */
	public void setOfficeDetails(OfficeDTO officeDetails) {
		this.officeDetails = officeDetails;
	}

	/**
	 * @return the vehCategory
	 */
	public String getVehCategory() {
		return vehCategory;
	}

	/**
	 * @param vehCategory the vehCategory to set
	 */
	public void setVehCategory(String vehCategory) {
		this.vehCategory = vehCategory;
	}

	/**
	 * @return the vahanDetails
	 */
	public VahanDetailsDTO getVahanDetails() {
		return vahanDetails;
	}

	/**
	 * @param vahanDetails the vahanDetails to set
	 */
	public void setVahanDetails(VahanDetailsDTO vahanDetails) {
		this.vahanDetails = vahanDetails;
	}

	/**
	 * @return the classOfVehicleDesc
	 */
	public String getClassOfVehicleDesc() {
		return classOfVehicleDesc;
	}

	/**
	 * @param classOfVehicleDesc the classOfVehicleDesc to set
	 */
	public void setClassOfVehicleDesc(String classOfVehicleDesc) {
		this.classOfVehicleDesc = classOfVehicleDesc;
	}

	/**
	 * @return the taxPaidUpto
	 */
	public LocalDate getTaxPaidUpto() {
		return taxPaidUpto;
	}

	/**
	 * @param taxPaidUpto the taxPaidUpto to set
	 */
	public void setTaxPaidUpto(LocalDate taxPaidUpto) {
		this.taxPaidUpto = taxPaidUpto;
	}

	/**
	 * @return the signOfAuth
	 */
	public String getSignOfAuth() {
		return signOfAuth;
	}

	/**
	 * @param signOfAuth the signOfAuth to set
	 */
	public void setSignOfAuth(String signOfAuth) {
		this.signOfAuth = signOfAuth;
	}

	/**
	 * @return the signOfOwner
	 */
	public String getSignOfOwner() {
		return signOfOwner;
	}

	/**
	 * @param signOfOwner the signOfOwner to set
	 */
	public void setSignOfOwner(String signOfOwner) {
		this.signOfOwner = signOfOwner;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the parentsName
	 */
	public String getParentsName() {
		return parentsName;
	}

	/**
	 * @param parentsName the parentsName to set
	 */
	public void setParentsName(String parentsName) {
		this.parentsName = parentsName;
	}

	/**
	 * @return the presentAddress
	 */
	public ApplicantAddressDTO getPresentAddress() {
		return presentAddress;
	}

	/**
	 * @param presentAddress the presentAddress to set
	 */
	public void setPresentAddress(ApplicantAddressDTO presentAddress) {
		this.presentAddress = presentAddress;
	}

	/**
	 * @return the amount
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	/**
	 * @return the taxValidUpto
	 */
	public LocalDate getTaxValidUpto() {
		return taxValidUpto;
	}

	/**
	 * @param taxValidUpto the taxValidUpto to set
	 */
	public void setTaxValidUpto(LocalDate taxValidUpto) {
		this.taxValidUpto = taxValidUpto;
	}

	/**
	 * @return the backendUpdateFlag
	 */
	public boolean isBackendUpdateFlag() {
		return backendUpdateFlag;
	}

	/**
	 * @param backendUpdateFlag the backendUpdateFlag to set
	 */
	public void setBackendUpdateFlag(boolean backendUpdateFlag) {
		this.backendUpdateFlag = backendUpdateFlag;
	}

	/**
	 * @return the financeDetails
	 */
	public FinanceDetailsDTO getFinanceDetails() {
		return financeDetails;
	}

	/**
	 * @param financeDetails the financeDetails to set
	 */
	public void setFinanceDetails(FinanceDetailsDTO financeDetails) {
		this.financeDetails = financeDetails;
	}

	/**
	 * @return the insuranceDetails
	 */
	public InsuranceDetailsDTO getInsuranceDetails() {
		return insuranceDetails;
	}

	/**
	 * @param insuranceDetails the insuranceDetails to set
	 */
	public void setInsuranceDetails(InsuranceDetailsDTO insuranceDetails) {
		this.insuranceDetails = insuranceDetails;
	}

	/**
	 * @return the ownerType
	 */
	public OwnerTypeEnum getOwnerType() {
		return ownerType;
	}

	/**
	 * @param ownerType the ownerType to set
	 */
	public void setOwnerType(OwnerTypeEnum ownerType) {
		this.ownerType = ownerType;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
}
