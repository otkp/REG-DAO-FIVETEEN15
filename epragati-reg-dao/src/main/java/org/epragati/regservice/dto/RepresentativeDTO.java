package org.epragati.regservice.dto;

import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.util.RoleEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author krishnarjun.pampana
 *
 */

@Document(collection = "citizen_users")
public class RepresentativeDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String uidToken;

	private RoleEnum userType;

	private String applicantId;

	private String parentId;

	private String parentApplicantId;

	private List<String> childuidTokens;

	private List<String> applicationIds;
	
	private String childToken;
	
 	public String getChildToken() {
		return childToken;
	}

	public void setChildToken(String childToken) {
		this.childToken = childToken;
	}

	public String getUidToken() {
		return uidToken;
	}

	public void setUidToken(String uidToken) {
		this.uidToken = uidToken;
	}

	public RoleEnum getUserType() {
		return userType;
	}

	public void setUserType(RoleEnum userType) {
		this.userType = userType;
	}

	public String getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(String applicantId) {
		this.applicantId = applicantId;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getParentApplicantId() {
		return parentApplicantId;
	}

	public void setParentApplicantId(String parentApplicantId) {
		this.parentApplicantId = parentApplicantId;
	}

	public List<String> getChilduidTokens() {
		return childuidTokens;
	}

	public void setChilduidTokens(List<String> childuidTokens) {
		this.childuidTokens = childuidTokens;
	}

	public List<String> getApplicationIds() {
		return applicationIds;
	}

	public void setApplicationIds(List<String> applicationIds) {
		this.applicationIds = applicationIds;
	}

	@Override
	public String toString() {
		return "RepresentativeDTO [uidToken=" + uidToken + ", userType=" + userType + ", applicantId=" + applicantId
				+ ", parentId=" + parentId + ", parentApplicantId=" + parentApplicantId + ", childuidTokens="
				+ childuidTokens + ", applicationIds=" + applicationIds + "]";
	}

}
