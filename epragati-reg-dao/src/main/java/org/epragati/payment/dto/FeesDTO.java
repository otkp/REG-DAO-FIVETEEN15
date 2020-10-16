package org.epragati.payment.dto;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.epragati.util.payment.ServiceEnum;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * 
 * @author naga.pulaparthi
 *
 */
@CrossOrigin
@Document(collection = "master_fees")
public class FeesDTO extends BaseEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String _id;
	private Integer serviceId;
	private String covcode;
	private String moduleCode;
	private String servicedescription;
	private String feesType;
	private String weighttype;
	private Double amount;
	private String HOA;
	private String HOADESCRIPTION;
	private String serviceCode;
	private Map<ServiceEnum,Double> serviceWise;
	
	private String permitCode;
	
	private Integer seatFrom;
	
	private Integer seatTo;

	/**
	 * @return the id
	 */
	public String getId() {
		return _id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this._id = id;
	}

	/**
	 * @return the serviceId
	 */
	public Integer getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId
	 *            the serviceId to set
	 */
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * @return the covCode
	 */
	public String getCovCode() {
		return covcode;
	}

	/**
	 * @param covCode
	 *            the covCode to set
	 */
	public void setCovCode(String covCode) {
		this.covcode = covCode;
	}

	/**
	 * @return the moduleCode
	 */
	public String getModuleCode() {
		return moduleCode;
	}

	/**
	 * @param moduleCode
	 *            the moduleCode to set
	 */
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	/**
	 * @return the servicedescription
	 */
	public String getServicedescription() {
		return servicedescription;
	}

	/**
	 * @param servicedescription
	 *            the servicedescription to set
	 */
	public void setServicedescription(String servicedescription) {
		this.servicedescription = servicedescription;
	}

	/**
	 * @return the feeType
	 */
	public String getFeesType() {
		return feesType;
	}

	/**
	 * @param feeType
	 *            the feeType to set
	 */
	public void setFeesType(String feesType) {
		this.feesType = feesType;
	}

	/**
	 * @return the weighttype
	 */
	public String getWeighttype() {
		return weighttype;
	}

	/**
	 * @param weighttype
	 *            the weighttype to set
	 */
	public void setWeighttype(String weighttype) {
		this.weighttype = weighttype;
	}

	
	
	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}

	/**
	 * @param _id the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
	}

	/**
	 * @return the covcode
	 */
	public String getCovcode() {
		return covcode;
	}

	/**
	 * @param covcode the covcode to set
	 */
	public void setCovcode(String covcode) {
		this.covcode = covcode;
	}

	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * @return the hOA
	 */
	public String getHOA() {
		return HOA;
	}

	/**
	 * @param hOA
	 *            the hOA to set
	 */
	public void setHOA(String hOA) {
		HOA = hOA;
	}

	/**
	 * @return the hOADESCRIPTION
	 */
	public String getHOADESCRIPTION() {
		return HOADESCRIPTION;
	}

	/**
	 * @param hOADESCRIPTION
	 *            the hOADESCRIPTION to set
	 */
	public void setHOADESCRIPTION(String hOADESCRIPTION) {
		HOADESCRIPTION = hOADESCRIPTION;
	}

	/**
	 * @return the serviceCode
	 */
	public String getServiceCode() {
		return serviceCode;
	}

	/**
	 * @param serviceCode the serviceCode to set
	 */
	public void setServiceCode(String subHeadCode) {
		this.serviceCode = subHeadCode;
	}

	/**
	 * @return the permitCode
	 */
	public String getPermitCode() {
		return permitCode;
	}

	/**
	 * @param permitCode the permitCode to set
	 */
	public void setPermitCode(String permitCode) {
		this.permitCode = permitCode;
	}

	/**
	 * @return the seatFrom
	 */
	public Integer getSeatFrom() {
		return seatFrom;
	}

	/**
	 * @param seatFrom the seatFrom to set
	 */
	public void setSeatFrom(Integer seatFrom) {
		this.seatFrom = seatFrom;
	}

	/**
	 * @return the seatTo
	 */
	public Integer getSeatTo() {
		return seatTo;
	}

	/**
	 * @param seatTo the seatTo to set
	 */
	public void setSeatTo(Integer seatTo) {
		this.seatTo = seatTo;
	}

	public Map<ServiceEnum, Double> getServiceWise() {
		return serviceWise;
	}

	public void setServiceWise(Map<ServiceEnum, Double> serviceWise) {
		this.serviceWise = serviceWise;
	}


	
	
}