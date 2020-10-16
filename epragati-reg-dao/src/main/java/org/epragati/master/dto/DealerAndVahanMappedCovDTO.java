package org.epragati.master.dto;

import java.io.Serializable;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection="master_vahan_mapping")
@CompoundIndexes({ 
	@CompoundIndex(name = "dealerCovType", def = "{'dealerCovType': 1}")
})
public class DealerAndVahanMappedCovDTO extends BaseEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String vahanCovType;
	private String dealerCovType;
	private boolean status;
	private String category;
	/**
	 * @return the vahanCovType
	 */
	public String getVahanCovType() {
		return vahanCovType;
	}
	/**
	 * @param vahanCovType the vahanCovType to set
	 */
	public void setVahanCovType(String vahanCovType) {
		this.vahanCovType = vahanCovType;
	}
	/**
	 * @return the dealerCovType
	 */
	public String getDealerCovType() {
		return dealerCovType;
	}
	/**
	 * @param dealerCovType the dealerCovType to set
	 */
	public void setDealerCovType(String dealerCovType) {
		this.dealerCovType = dealerCovType;
	}
	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DealerAndVahanMappedCovDTO [vahanCovType=" + vahanCovType + ", dealerCovType=" + dealerCovType
				+ ", status=" + status + ", category=" + category + "]";
	}

}
