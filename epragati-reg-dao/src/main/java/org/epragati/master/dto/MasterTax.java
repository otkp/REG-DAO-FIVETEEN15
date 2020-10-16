package org.epragati.master.dto;


import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection="master_tax")
public class MasterTax extends BaseEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	private String covcode;
	private String Paymentperiod;
	private Float taxamount;
	
	private Integer seatfrom;
	
	private Integer seatto;

	private Integer fromrlw;
	private Integer torlw;
	private Integer fromulw;
	private Integer toulw;
	private Integer incrementalweight;
	private Float incrementalamount;
	private String statecode;
	private Double fromcost;
	private Double tocost;
	private float fromage;
	private float toage;
	private String ownershiptype;
	private String status;
	private String todate;
	private Float Percent;
	private LocalDate createdate;
	private LocalDate lupdate;
	private String permitcode;
	private String servType;

	
	
	
	
	/**
	 * @return the permitcode
	 */
	public String getPermitcode() {
		return permitcode;
	}
	/**
	 * @param permitcode the permitcode to set
	 */
	public void setPermitcode(String permitcode) {
		this.permitcode = permitcode;
	}
	
	/**
	 * @return the percent
	 */
	public Float getPercent() {
		return Percent;
	}
	/**
	 * @param percent the percent to set
	 */
	public void setPercent(Float percent) {
		Percent = percent;
	}
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
	 * @return the paymentperiod
	 */
	public String getPaymentperiod() {
		return Paymentperiod;
	}
	/**
	 * @param paymentperiod the paymentperiod to set
	 */
	public void setPaymentperiod(String paymentperiod) {
		Paymentperiod = paymentperiod;
	}
	/**
	 * @return the taxamount
	 */
	public Float getTaxamount() {
		return taxamount;
	}
	/**
	 * @param taxamount the taxamount to set
	 */
	public void setTaxamount(Float taxamount) {
		this.taxamount = taxamount;
	}
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
	 * @return the fromrlw
	 */
	public Integer getFromrlw() {
		return fromrlw;
	}
	/**
	 * @param fromrlw the fromrlw to set
	 */
	public void setFromrlw(Integer fromrlw) {
		this.fromrlw = fromrlw;
	}
	/**
	 * @return the torlw
	 */
	public Integer getTorlw() {
		return torlw;
	}
	/**
	 * @param torlw the torlw to set
	 */
	public void setTorlw(Integer torlw) {
		this.torlw = torlw;
	}
	/**
	 * @return the fromulw
	 */
	public Integer getFromulw() {
		return fromulw;
	}
	/**
	 * @param fromulw the fromulw to set
	 */
	public void setFromulw(Integer fromulw) {
		this.fromulw = fromulw;
	}
	/**
	 * @return the toulw
	 */
	public Integer getToulw() {
		return toulw;
	}
	/**
	 * @param toulw the toulw to set
	 */
	public void setToulw(Integer toulw) {
		this.toulw = toulw;
	}
	
	/**
	 * @return the incrementalweight
	 */
	public Integer getIncrementalweight() {
		return incrementalweight;
	}
	/**
	 * @param incrementalweight the incrementalweight to set
	 */
	public void setIncrementalweight(Integer incrementalweight) {
		this.incrementalweight = incrementalweight;
	}
	/**
	 * @return the incrementalamount
	 */
	public Float getIncrementalamount() {
		return incrementalamount;
	}
	/**
	 * @param incrementalamount the incrementalamount to set
	 */
	public void setIncrementalamount(Float incrementalamount) {
		this.incrementalamount = incrementalamount;
	}
	/**
	 * @return the statecode
	 */
	public String getStatecode() {
		return statecode;
	}
	/**
	 * @param statecode the statecode to set
	 */
	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}
	/**
	 * @return the fromcost
	 */
	public Double getFromcost() {
		return fromcost;
	}
	/**
	 * @param fromcost the fromcost to set
	 */
	public void setFromcost(Double fromcost) {
		this.fromcost = fromcost;
	}
	/**
	 * @return the tocost
	 */
	public Double getTocost() {
		return tocost;
	}
	/**
	 * @param tocost the tocost to set
	 */
	public void setTocost(Double tocost) {
		this.tocost = tocost;
	}
	
	/**
	 * @return the fromage
	 */
	public float getFromage() {
		return fromage;
	}
	/**
	 * @param fromage the fromage to set
	 */
	public void setFromage(float fromage) {
		this.fromage = fromage;
	}
	/**
	 * @return the toage
	 */
	public float getToage() {
		return toage;
	}
	/**
	 * @param toage the toage to set
	 */
	public void setToage(float toage) {
		this.toage = toage;
	}
	/**
	 * @return the ownershiptype
	 */
	public String getOwnershiptype() {
		return ownershiptype;
	}
	/**
	 * @param ownershiptype the ownershiptype to set
	 */
	public void setOwnershiptype(String ownershiptype) {
		this.ownershiptype = ownershiptype;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the todate
	 */
	public String getTodate() {
		return todate;
	}
	/**
	 * @param todate the todate to set
	 */
	public void setTodate(String todate) {
		this.todate = todate;
	}
	/**
	 * @return the createdate
	 */
	public LocalDate getCreatedate() {
		return createdate;
	}
	/**
	 * @param createdate the createdate to set
	 */
	public void setCreatedate(LocalDate createdate) {
		this.createdate = createdate;
	}
	/**
	 * @return the lupdate
	 */
	public LocalDate getLupdate() {
		return lupdate;
	}
	/**
	 * @param lupdate the lupdate to set
	 */
	public void setLupdate(LocalDate lupdate) {
		this.lupdate = lupdate;
	}
	/**
	 * @return the servType
	 */
	public String getServType() {
		return servType;
	}
	/**
	 * @param servType the servType to set
	 */
	public void setServType(String servType) {
		this.servType = servType;
	}
	
	
	

}
