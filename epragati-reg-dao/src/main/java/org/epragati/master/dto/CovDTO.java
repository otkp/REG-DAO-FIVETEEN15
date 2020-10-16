package org.epragati.master.dto;

import java.time.LocalDateTime;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_class_of_vehicles")
@CompoundIndexes({ 
	@CompoundIndex(name = "covCode", def = "{'covCode': 1}")
})
public class CovDTO {

	@Id
	private String _id;
	private String covCategory;
	private String covCode;
	private String covDescription;
	private Integer covId;
	private String covIdp;
	private Integer covNicCode;
	private String covOnline;
	private String covStatus;
	private LocalDateTime createDate;
	private String createdBy;
	private Boolean isPH;
	private Integer minAge;
	private String modifiedBy;
	private LocalDateTime modifiedDate;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getCovCategory() {
		return covCategory;
	}

	public void setCovCategory(String covCategory) {
		this.covCategory = covCategory;
	}

	public String getCovCode() {
		return covCode;
	}

	public void setCovCode(String covCode) {
		this.covCode = covCode;
	}

	public String getCovDescription() {
		return covDescription;
	}

	public void setCovDescription(String covDescription) {
		this.covDescription = covDescription;
	}

	public Integer getCovId() {
		return covId;
	}

	public void setCovId(Integer covId) {
		this.covId = covId;
	}

	public String getCovIdp() {
		return covIdp;
	}

	public void setCovIdp(String covIdp) {
		this.covIdp = covIdp;
	}

	public Integer getCovNicCode() {
		return covNicCode;
	}

	public void setCovNicCode(Integer covNicCode) {
		this.covNicCode = covNicCode;
	}

	public String getCovOnline() {
		return covOnline;
	}

	public void setCovOnline(String covOnline) {
		this.covOnline = covOnline;
	}

	public String getCovStatus() {
		return covStatus;
	}

	public void setCovStatus(String covStatus) {
		this.covStatus = covStatus;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Boolean getIsPH() {
		return isPH;
	}

	public void setIsPH(Boolean isPH) {
		this.isPH = isPH;
	}

	public Integer getMinAge() {
		return minAge;
	}

	public void setMinAge(Integer minAge) {
		this.minAge = minAge;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}