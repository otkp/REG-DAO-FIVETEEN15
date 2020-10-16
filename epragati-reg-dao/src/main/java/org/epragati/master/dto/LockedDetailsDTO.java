package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="locked_details")
public class LockedDetailsDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer iterationNo;
	private String applicatioNo;
	private String module;
	private String lockedBy;
	private String lockedByRole;
	private LocalDateTime lockedDate;
	private LocalDateTime releaseDate;

	/**
	 * @return the releaseDate
	 */
	public LocalDateTime getReleaseDate() {
		return releaseDate;
	}

	/**
	 * @param releaseDate the releaseDate to set
	 */
	public void setReleaseDate(LocalDateTime releaseDate) {
		this.releaseDate = releaseDate;
	}

	/**
	 * @return the lockedBy
	 */
	public String getLockedBy() {
		return lockedBy;
	}

	/**
	 * @param lockedBy
	 *            the lockedBy to set
	 */
	public void setLockedBy(String lockedBy) {
		this.lockedBy = lockedBy;
	}

	/**
	 * @return the lockedByRole
	 */
	public String getLockedByRole() {
		return lockedByRole;
	}

	/**
	 * @param lockedByRole
	 *            the lockedByRole to set
	 */
	public void setLockedByRole(String lockedByRole) {
		this.lockedByRole = lockedByRole;
	}

	/**
	 * @return the lockedDate
	 */
	public LocalDateTime getLockedDate() {
		return lockedDate;
	}

	/**
	 * @param lockedDate
	 *            the lockedDate to set
	 */
	public void setLockedDate(LocalDateTime lockedDate) {
		this.lockedDate = lockedDate;
	}

	/**
	 * @return the applicatioNo
	 */
	public String getApplicatioNo() {
		return applicatioNo;
	}

	/**
	 * @param applicatioNo
	 *            the applicatioNo to set
	 */
	public void setApplicatioNo(String applicatioNo) {
		this.applicatioNo = applicatioNo;
	}

	/**
	 * @return the module
	 */
	public String getModule() {
		return module;
	}

	/**
	 * @param module
	 *            the module to set
	 */
	public void setModule(String module) {
		this.module = module;
	}
	/**
	 * @return the iterationNo
	 */
	public Integer getIterationNo() {
		return iterationNo;
	}

	/**
	 * @param iterationNo the iterationNo to set
	 */
	public void setIterationNo(Integer iterationNo) {
		this.iterationNo = iterationNo;
	}

}
