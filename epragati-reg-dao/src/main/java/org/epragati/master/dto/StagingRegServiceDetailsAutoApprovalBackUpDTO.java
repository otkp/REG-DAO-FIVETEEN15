package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import org.epragati.common.dto.BaseEntity;
import org.epragati.regservice.dto.RegServiceDTO;
import org.epragati.util.payment.ServiceEnum;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "staging_reg_services_auto_approval_backup_logs")
public class StagingRegServiceDetailsAutoApprovalBackUpDTO extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8034422586131066464L;

	private StagingRegistrationDetailsDTO stagingReg;
	
	private DistrictDTO district;
	
	private String officeCode;
	
	private String trNo;
	
	private Integer districtId;
	
	private String districtName;
	
	private Set<String> roleType;
	
	private LocalDate autoApprovalsDate;
	
	private String applicationNo;
	
	private RegServiceDTO regService;
	
	private String prNo;
	
	private List<ServiceEnum> serviceName;
	
	private LocalDate autoApprovalInitiatedDate;
	
	
	public LocalDate getAutoApprovalInitiatedDate() {
		return autoApprovalInitiatedDate;
	}

	public void setAutoApprovalInitiatedDate(LocalDate autoApprovalInitiatedDate) {
		this.autoApprovalInitiatedDate = autoApprovalInitiatedDate;
	}

	public List<ServiceEnum> getServiceName() {
		return serviceName;
	}

	public void setServiceName(List<ServiceEnum> serviceName) {
		this.serviceName = serviceName;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public RegServiceDTO getRegService() {
		return regService;
	}

	public void setRegService(RegServiceDTO regService) {
		this.regService = regService;
	}

	public StagingRegistrationDetailsDTO getStagingReg() {
		return stagingReg;
	}

	public void setStagingReg(StagingRegistrationDetailsDTO stagingReg) {
		this.stagingReg = stagingReg;
	}

	public DistrictDTO getDistrict() {
		return district;
	}

	public void setDistrict(DistrictDTO district) {
		this.district = district;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}


	public Set<String> getRoleType() {
		return roleType;
	}

	public void setRoleType(Set<String> roleType) {
		this.roleType = roleType;
	}

	public LocalDate getAutoApprovalsDate() {
		return autoApprovalsDate;
	}

	public void setAutoApprovalsDate(LocalDate autoApprovalsDate) {
		this.autoApprovalsDate = autoApprovalsDate;
	}

	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	
	
}
