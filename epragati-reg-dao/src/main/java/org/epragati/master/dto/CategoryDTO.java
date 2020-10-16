package org.epragati.master.dto;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author sairam.cheruku
 *
 */
@Document(collection = "master_category")
@CompoundIndexes({ 
	@CompoundIndex(name = "status", def = "{'status': 1}")
})
public class CategoryDTO extends BaseEntity {

	@Id
	private String _id;

	private Integer cotegoryid;

	private String categorycode;

	private String categorydescription;

	private Boolean status;

	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}

	/**
	 * @param _id
	 *            the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
	}

	/**
	 * @return the cotegoryid
	 */
	public Integer getCotegoryid() {
		return cotegoryid;
	}

	/**
	 * @param cotegoryid
	 *            the cotegoryid to set
	 */
	public void setCotegoryid(Integer cotegoryid) {
		this.cotegoryid = cotegoryid;
	}

	/**
	 * @return the categorycode
	 */
	public String getCategorycode() {
		return categorycode;
	}

	/**
	 * @param categorycode
	 *            the categorycode to set
	 */
	public void setCategorycode(String categorycode) {
		this.categorycode = categorycode;
	}

	/**
	 * @return the categorydescription
	 */
	public String getCategorydescription() {
		return categorydescription;
	}

	/**
	 * @param categorydescription
	 *            the categorydescription to set
	 */
	public void setCategorydescription(String categorydescription) {
		this.categorydescription = categorydescription;
	}

	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

}
