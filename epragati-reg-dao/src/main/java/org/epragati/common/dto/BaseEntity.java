package org.epragati.common.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author saroj.sahoo
 *
 */
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String createdBy;
	private String modifiedBy;
	private String updatedBy;
	@CreatedDate
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime createdDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime modifiedDate;
	@LastModifiedDate
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime lUpdate;
	private String ipAddress;
	private String migrationSource;
	private boolean isMigrated;
	private String remarks;
	private String createdDateStr;
	private String modifiedDateStr;
	private String source;
	private Boolean isMoved;
	private String reqHeaderId;

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getCreatedDateStr() {
		return createdDateStr;
	}

	public void setCreatedDateStr(String createdDateStr) {
		this.createdDateStr = createdDateStr;
	}

	public String getModifiedDateStr() {
		return modifiedDateStr;
	}

	public void setModifiedDateStr(String modifiedDateStr) {
		this.modifiedDateStr = modifiedDateStr;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the modifiedBy
	 */
	public String getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * @param modifiedBy
	 *            the modifiedBy to set
	 */
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy
	 *            the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @return the createdDate
	 */
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the modifiedDate
	 */
	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate
	 *            the modifiedDate to set
	 */
	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/**
	 * @return the lUpdate
	 */
	public LocalDateTime getlUpdate() {
		return lUpdate;
	}

	/**
	 * @param lUpdate
	 *            the lUpdate to set
	 */
	public void setlUpdate(LocalDateTime lUpdate) {
		this.lUpdate = lUpdate;
	}

	/**
	 * @return the ipAddress
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * @param ipAddress
	 *            the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * @return the migrationSource
	 */
	public String getMigrationSource() {
		return migrationSource;
	}

	/**
	 * @param migrationSource
	 *            the migrationSource to set
	 */
	public void setMigrationSource(String migrationSource) {
		this.migrationSource = migrationSource;
	}

	/**
	 * @return the isMigrated
	 */
	public boolean isMigrated() {
		return isMigrated;
	}

	/**
	 * @param isMigrated
	 *            the isMigrated to set
	 */
	public void setMigrated(boolean isMigrated) {
		this.isMigrated = isMigrated;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BaseEntity [createdBy=" + createdBy + ", modifiedBy=" + modifiedBy + ", updatedBy=" + updatedBy
				+ ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + ", lUpdate=" + lUpdate + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((createdDateStr == null) ? 0 : createdDateStr.hashCode());
		result = prime * result + ((ipAddress == null) ? 0 : ipAddress.hashCode());
		result = prime * result + (isMigrated ? 1231 : 1237);
		result = prime * result + ((lUpdate == null) ? 0 : lUpdate.hashCode());
		result = prime * result + ((migrationSource == null) ? 0 : migrationSource.hashCode());
		result = prime * result + ((modifiedBy == null) ? 0 : modifiedBy.hashCode());
		result = prime * result + ((modifiedDate == null) ? 0 : modifiedDate.hashCode());
		result = prime * result + ((modifiedDateStr == null) ? 0 : modifiedDateStr.hashCode());
		result = prime * result + ((remarks == null) ? 0 : remarks.hashCode());
		result = prime * result + ((updatedBy == null) ? 0 : updatedBy.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseEntity other = (BaseEntity) obj;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (createdDateStr == null) {
			if (other.createdDateStr != null)
				return false;
		} else if (!createdDateStr.equals(other.createdDateStr))
			return false;
		if (ipAddress == null) {
			if (other.ipAddress != null)
				return false;
		} else if (!ipAddress.equals(other.ipAddress))
			return false;
		if (isMigrated != other.isMigrated)
			return false;
		if (lUpdate == null) {
			if (other.lUpdate != null)
				return false;
		} else if (!lUpdate.equals(other.lUpdate))
			return false;
		if (migrationSource == null) {
			if (other.migrationSource != null)
				return false;
		} else if (!migrationSource.equals(other.migrationSource))
			return false;
		if (modifiedBy == null) {
			if (other.modifiedBy != null)
				return false;
		} else if (!modifiedBy.equals(other.modifiedBy))
			return false;
		if (modifiedDate == null) {
			if (other.modifiedDate != null)
				return false;
		} else if (!modifiedDate.equals(other.modifiedDate))
			return false;
		if (modifiedDateStr == null) {
			if (other.modifiedDateStr != null)
				return false;
		} else if (!modifiedDateStr.equals(other.modifiedDateStr))
			return false;
		if (remarks == null) {
			if (other.remarks != null)
				return false;
		} else if (!remarks.equals(other.remarks))
			return false;
		if (updatedBy == null) {
			if (other.updatedBy != null)
				return false;
		} else if (!updatedBy.equals(other.updatedBy))
			return false;
		return true;
	}

	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param source
	 *            the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * @return the isMoved
	 */
	public Boolean getIsMoved() {
		return isMoved;
	}

	/**
	 * @param isMoved
	 *            the isMoved to set
	 */
	public void setIsMoved(Boolean isMoved) {
		this.isMoved = isMoved;
	}

}
