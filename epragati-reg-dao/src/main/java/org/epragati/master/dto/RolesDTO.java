package org.epragati.master.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author saroj.sahoo
 *
 */
@Document(collection = "master_roles")
public class RolesDTO extends BaseEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String name;
	
	private Integer userNo;
	
	private String description;
	
	private Integer status;
	
	private Integer roleId;
	
	private List<String> menuCodes;

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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the roleId
	 */
	public Integer getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the menuCodes
	 */
	public List<String> getMenuCodes() {
		return menuCodes;
	}

	/**
	 * @param menuCodes the menuCodes to set
	 */
	public void setMenuCodes(List<String> menuCodes) {
		this.menuCodes = menuCodes;
	}

	
	
	public Integer getUserNo() {
		return userNo;
	}

	public void setUserNo(Integer userNo) {
		this.userNo = userNo;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
		*/
	@Override
	public String toString() {
		return "RolesDTO [id=" + id + ", name=" + name + ", userNo=" + userNo + ", description=" + description
				+ ", status=" + status + ", roleId=" + roleId + ", menuCodes=" + menuCodes + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == this) {
			return true;
		}
		
		if (obj instanceof RolesDTO) {
			RolesDTO role = (RolesDTO) obj;
			return role.getName().equals(this.name);
		}
		return false;
	}

		
}