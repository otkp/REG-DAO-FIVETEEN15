package org.epragati.regservice.dto;

import java.time.LocalDate;

import org.epragati.aadhaar.AadharDetailsResponseVO;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "FitnessApprovedlogs")
public class FitnessApprovedlogs {
	private String prNo;
	private String userName;
	private String roleType;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate ApprovedDate;
	private AadharDetailsResponseVO aadharResponseMVI;
	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}
	/**
	 * @param prNo the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the roleType
	 */
	public String getRoleType() {
		return roleType;
	}
	/**
	 * @param roleType the roleType to set
	 */
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	/**
	 * @return the approvedDate
	 */
	public LocalDate getApprovedDate() {
		return ApprovedDate;
	}
	/**
	 * @param approvedDate the approvedDate to set
	 */
	public void setApprovedDate(LocalDate approvedDate) {
		ApprovedDate = approvedDate;
	}
	/**
	 * @return the aadharResponseMVI
	 */
	public AadharDetailsResponseVO getAadharResponseMVI() {
		return aadharResponseMVI;
	}
	/**
	 * @param aadharResponseMVI the aadharResponseMVI to set
	 */
	public void setAadharResponseMVI(AadharDetailsResponseVO aadharResponseMVI) {
		this.aadharResponseMVI = aadharResponseMVI;
		
	}
	
}
