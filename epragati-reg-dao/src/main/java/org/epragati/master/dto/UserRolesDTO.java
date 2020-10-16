package org.epragati.master.dto;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author saikiran.kola
 *
 */
@Document(collection="master_user_roles")
public class UserRolesDTO extends BaseEntity{

	@Id
	private String id;

	private Integer urId;

	private Long ulId;

	private Long roleId;

	private Integer status;

	private Boolean isPrimary;

	public String getId() {
		return id;
	}

	public Boolean getIsPrimary() {
		return isPrimary;
	}

	public Long getRoleId() {
		return roleId;
	}

	public Integer getStatus() {
		return status;
	}

	public Long getUlId() {
		return ulId;
	}

	public Integer getUrId() {
		return urId;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIsPrimary(Boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setUlId(Long ulId) {
		this.ulId = ulId;
	}

	public void setUrId(Integer urId) {
		this.urId = urId;
	}

}
