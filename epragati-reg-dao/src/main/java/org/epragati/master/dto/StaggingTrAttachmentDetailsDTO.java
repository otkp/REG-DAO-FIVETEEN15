package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection="stagging_tr_attachment_details")
public class StaggingTrAttachmentDetailsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	private Integer tadid;
	private Integer tdid;
	private Integer tadEnclid;
	private String tadPath;
	private Integer tadStats;
	private LocalDateTime createdDate;
	private LocalDateTime lUpdate;
	
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
	 * @return the tadid
	 */
	public Integer getTadid() {
		return tadid;
	}
	/**
	 * @param tadid the tadid to set
	 */
	public void setTadid(Integer tadid) {
		this.tadid = tadid;
	}
	/**
	 * @return the tdid
	 */
	public Integer getTdid() {
		return tdid;
	}
	/**
	 * @param tdid the tdid to set
	 */
	public void setTdid(Integer tdid) {
		this.tdid = tdid;
	}
	/**
	 * @return the tadEnclid
	 */
	public Integer getTadEnclid() {
		return tadEnclid;
	}
	/**
	 * @param tadEnclid the tadEnclid to set
	 */
	public void setTadEnclid(Integer tadEnclid) {
		this.tadEnclid = tadEnclid;
	}
	/**
	 * @return the tadPath
	 */
	public String getTadPath() {
		return tadPath;
	}
	/**
	 * @param tadPath the tadPath to set
	 */
	public void setTadPath(String tadPath) {
		this.tadPath = tadPath;
	}
	/**
	 * @return the tadStats
	 */
	public Integer getTadStats() {
		return tadStats;
	}
	/**
	 * @param tadStats the tadStats to set
	 */
	public void setTadStats(Integer tadStats) {
		this.tadStats = tadStats;
	}
	/**
	 * @return the createdDate
	 */
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the lUpdate
	 */
	public LocalDateTime getlUpdate() {
		return lUpdate;
	}
	/**
	 * @param lUpdate the lUpdate to set
	 */
	public void setlUpdate(LocalDateTime lUpdate) {
		this.lUpdate = lUpdate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StaggingTrAttachmentDetailsDTO [id=" + id + ", tadid=" + tadid + ", tdid=" + tdid + ", tadEnclid="
				+ tadEnclid + ", tadPath=" + tadPath + ", tadStats=" + tadStats + ", createdDate=" + createdDate
				+ ", lUpdate=" + lUpdate + "]";
	}
}
