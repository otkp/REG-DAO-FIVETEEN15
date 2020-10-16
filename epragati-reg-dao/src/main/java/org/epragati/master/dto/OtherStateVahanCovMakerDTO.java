package org.epragati.master.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author mukesh.kusuma
 *
 */
public class OtherStateVahanCovMakerDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4634349516605048773L;
	
	private List<MasterCovDTO> classOfVehicle;
	
	private MakersDTO operator;
	
	private MasterVariantDTO makerClass;

	private StateDTO nocState;
	
	private InsuranceTypeDTO policyType;
	
	private InsuranceCompanyDTO company;
	
	private OwnershipDTO ownerType;
	
	
	/**
	 * @return the ownerType
	 */
	public OwnershipDTO getOwnerType() {
		return ownerType;
	}

	/**
	 * @param ownerType the ownerType to set
	 */
	public void setOwnerType(OwnershipDTO ownerType) {
		this.ownerType = ownerType;
	}

	/**
	 * @return the company
	 */
	public InsuranceCompanyDTO getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(InsuranceCompanyDTO company) {
		this.company = company;
	}

	/**
	 * @return the policyType
	 */
	public InsuranceTypeDTO getPolicyType() {
		return policyType;
	}

	/**
	 * @param policyType the policyType to set
	 */
	public void setPolicyType(InsuranceTypeDTO policyType) {
		this.policyType = policyType;
	}

	/**
	 * @return the nocState
	 */
	public StateDTO getNocState() {
		return nocState;
	}

	/**
	 * @param nocState the nocState to set
	 */
	public void setNocState(StateDTO nocState) {
		this.nocState = nocState;
	}

	/**
	 * @return the classOfVehicle
	 */
	public List<MasterCovDTO> getClassOfVehicle() {
		return classOfVehicle;
	}

	/**
	 * @param classOfVehicle the classOfVehicle to set
	 */
	public void setClassOfVehicle(List<MasterCovDTO> classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	/**
	 * @return the operator
	 */
	public MakersDTO getOperator() {
		return operator;
	}

	/**
	 * @param operator the operator to set
	 */
	public void setOperator(MakersDTO operator) {
		this.operator = operator;
	}

	/**
	 * @return the makerClass
	 */
	public MasterVariantDTO getMakerClass() {
		return makerClass;
	}

	/**
	 * @param makerClass the makerClass to set
	 */
	public void setMakerClass(MasterVariantDTO makerClass) {
		this.makerClass = makerClass;
	}
	
	
	

}
