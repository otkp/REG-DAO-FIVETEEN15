package org.epragati.master.dto;

import java.time.LocalDateTime;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 *
 * @author saikiran.kola
 *
 */
@Document(collection = "master_dealer_cov")
@CompoundIndexes({ 
	@CompoundIndex(name = "covId", def = "{'covId': 1}"),
	@CompoundIndex(name = "dcId_and_rId", def = "{'dcId': 1, 'rId': 1}"),
	@CompoundIndex(name = "rId_and_status", def = "{'rId': 1, 'status': 1}"),
	@CompoundIndex(name = "rId", def = "{'rId': 1}")
})
public class DealerCovDTO {
	@Id
	private String id;

	private Integer dcId;

	private Integer rId;

	private String covId;

	private Boolean status;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.mmm")
	private LocalDateTime createdDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.mmm")
	private LocalDateTime lUpdate;

	private String refNo;

	public String getCovId() {
		return covId;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public Integer getDcId() {
		return dcId;
	}

	public String getId() {
		return id;
	}

	public LocalDateTime getlUpdate() {
		return lUpdate;
	}

	public String getRefNo() {
		return refNo;
	}

	public Integer getrId() {
		return rId;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setCovId(String covId) {
		this.covId = covId;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public void setDcId(Integer dcId) {
		this.dcId = dcId;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setlUpdate(LocalDateTime lUpdate) {
		this.lUpdate = lUpdate;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public void setrId(Integer rId) {
		this.rId = rId;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
