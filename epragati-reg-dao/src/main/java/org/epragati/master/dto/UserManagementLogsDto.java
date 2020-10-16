package org.epragati.master.dto;

import org.epragati.common.dto.BaseEntity;
import org.epragati.usermanagement.UserManagementActions;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user_management_logs")
public class UserManagementLogsDto extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UserDTO oldUserDto;

	private UserDTO updatedUserDto;

	private UserManagementActions actionType;

	private String modifiedOnUserId;
	
	private String createdByAadhar;

	public String getCreatedByAadhar() {
		return createdByAadhar;
	}

	public void setCreatedByAadhar(String createdByAadhar) {
		this.createdByAadhar = createdByAadhar;
	}

	public UserManagementActions getActionType() {
		return actionType;
	}

	public void setActionType(UserManagementActions newuserregistration) {
		this.actionType = newuserregistration;
	}

	public UserDTO getOldUserDto() {
		return oldUserDto;
	}

	public UserDTO getUpdatedUserDto() {
		return updatedUserDto;
	}

	public void setUpdatedUserDto(UserDTO updatedUserDto) {
		this.updatedUserDto = updatedUserDto;
	}

	public String getModifiedOnUserId() {
		return modifiedOnUserId;
	}

	public void setModifiedOnUserId(String modifiedOnUserId) {
		this.modifiedOnUserId = modifiedOnUserId;
	}

	public void setOldUserDto(UserDTO oldUserDto) {
		this.oldUserDto = oldUserDto;
	}

}
