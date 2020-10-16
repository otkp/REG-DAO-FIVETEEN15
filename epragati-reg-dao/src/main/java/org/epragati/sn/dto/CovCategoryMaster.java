package org.epragati.sn.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author praveen.kuppannagari
 *
 *         Each Class of vehicle has bid fee details
 */

@Document(collection = "sn_cov_category_mst")
@CompoundIndexes({
	@CompoundIndex(name = "covCode", def = "{'covCode': 1}")
})
public class CovCategoryMaster extends BaseEntity {

	private static final long serialVersionUID = 1555152942774514424L;

	@Id
	private String covCategoryId;

	private Long covCategoryGroupId;

	private String covCode;

	private Boolean covCatStatus;

	public String getCovCategoryId() {
		return covCategoryId;
	}

	public void setCovCategoryId(String covCategoryId) {
		this.covCategoryId = covCategoryId;
	}

	public Long getCovCategoryGroupId() {
		return covCategoryGroupId;
	}

	public void setCovCategoryGroupId(Long covCategoryGroupId) {
		this.covCategoryGroupId = covCategoryGroupId;
	}

	public String getCovCode() {
		return covCode;
	}

	public void setCovCode(String covCode) {
		this.covCode = covCode;
	}

	public Boolean getCovCatStatus() {
		return covCatStatus;
	}

	public void setCovCatStatus(Boolean covCatStatus) {
		this.covCatStatus = covCatStatus;
	}

}
