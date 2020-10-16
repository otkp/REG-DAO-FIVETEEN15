package org.epragati.master.dto;

import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_tax_excemptions")
public class MasterTaxExcemptionsDTO extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String owertype;
	private String keyvalue;
	private Float taxvalue;
	private String valuetype;
	private String covcode;
	private Integer seatfrom;
	private Integer seatto;
	private List<String> chassisNos;
	private Float allIndiataxvalue;

	
	/**
	 * @return the seatfrom
	 */
	public Integer getSeatfrom() {
		return seatfrom;
	}

	/**
	 * @param seatfrom the seatfrom to set
	 */
	public void setSeatfrom(Integer seatfrom) {
		this.seatfrom = seatfrom;
	}

	/**
	 * @return the seatto
	 */
	public Integer getSeatto() {
		return seatto;
	}

	/**
	 * @param seatto the seatto to set
	 */
	public void setSeatto(Integer seatto) {
		this.seatto = seatto;
	}

	/**
	 * @return the covcode
	 */
	public String getCovcode() {
		return covcode;
	}

	/**
	 * @param covcode
	 *            the covcode to set
	 */
	public void setCovcode(String covcode) {
		this.covcode = covcode;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the owertype
	 */
	public String getOwertype() {
		return owertype;
	}

	/**
	 * @param owertype
	 *            the owertype to set
	 */
	public void setOwertype(String owertype) {
		this.owertype = owertype;
	}

	/**
	 * @return the keyvalue
	 */
	public String getKeyvalue() {
		return keyvalue;
	}

	/**
	 * @param keyvalue
	 *            the keyvalue to set
	 */
	public void setKeyvalue(String keyvalue) {
		this.keyvalue = keyvalue;
	}

	/**
	 * @return the taxvalue
	 */
	public Float getTaxvalue() {
		return taxvalue;
	}

	/**
	 * @param taxvalue
	 *            the taxvalue to set
	 */
	public void setTaxvalue(Float taxvalue) {
		this.taxvalue = taxvalue;
	}

	/**
	 * @return the valuetype
	 */
	public String getValuetype() {
		return valuetype;
	}

	/**
	 * @param valuetype
	 *            the valuetype to set
	 */
	public void setValuetype(String valuetype) {
		this.valuetype = valuetype;
	}

	/**
	 * @return the chassisNos
	 */
	public List<String> getChassisNos() {
		return chassisNos;
	}

	/**
	 * @param chassisNos the chassisNos to set
	 */
	public void setChassisNos(List<String> chassisNos) {
		this.chassisNos = chassisNos;
	}

	public Float getAllIndiataxvalue() {
		return allIndiataxvalue;
	}

	public void setAllIndiataxvalue(Float allIndiataxvalue) {
		this.allIndiataxvalue = allIndiataxvalue;
	}

	
}
