package org.epragati.gstn.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;


/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection="gstn_details")
public class GSTNDataDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String stjCode;
	
	private String stj;
	
	private String entityName;
	
	private String dty;
	
	private List<GSTNEntityAddressDTO> adadr;
	
	private String cxdt;
	
	private String gstinNo;
	
	private List<String> nba;
	
	private String gstnlUpdateDate;
	
	private String gstnRegDate;
	
	private String ctb;
	
	private GSTNEntityAddressDTO primaryAddress;
	
	private String status;
	
	private String tradeName;
	
	private String ctjCd;
	
	private String ctj;
	
	private LocalDate createdDate;
	
	private LocalDate lastUpdatedDate;

	public String getStjCode() {
		return stjCode;
	}

	public void setStjCode(String stjCode) {
		this.stjCode = stjCode;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getStj() {
		return stj;
	}

	public void setStj(String stj) {
		this.stj = stj;
	}

	public String getDty() {
		return dty;
	}

	public void setDty(String dty) {
		this.dty = dty;
	}

	public List<GSTNEntityAddressDTO> getAdadr() {
		return adadr;
	}

	public void setAdadr(List<GSTNEntityAddressDTO> adadr) {
		this.adadr = adadr;
	}

	public String getCxdt() {
		return cxdt;
	}

	public void setCxdt(String cxdt) {
		this.cxdt = cxdt;
	}

	public String getGstinNo() {
		return gstinNo;
	}

	public void setGstinNo(String gstinNo) {
		this.gstinNo = gstinNo;
	}

	public List<String> getNba() {
		return nba;
	}

	public void setNba(List<String> nba) {
		this.nba = nba;
	}

	public String getGstnlUpdateDate() {
		return gstnlUpdateDate;
	}

	public void setGstnlUpdateDate(String gstnlUpdateDate) {
		this.gstnlUpdateDate = gstnlUpdateDate;
	}

	public String getGstnRegDate() {
		return gstnRegDate;
	}

	public void setGstnRegDate(String gstnRegDate) {
		this.gstnRegDate = gstnRegDate;
	}

	public String getCtb() {
		return ctb;
	}

	public void setCtb(String ctb) {
		this.ctb = ctb;
	}

	public GSTNEntityAddressDTO getPrimaryAddress() {
		return primaryAddress;
	}

	public void setPrimaryAddress(GSTNEntityAddressDTO primaryAddress) {
		this.primaryAddress = primaryAddress;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getCtjCd() {
		return ctjCd;
	}

	public void setCtjCd(String ctjCd) {
		this.ctjCd = ctjCd;
	}

	public String getCtj() {
		return ctj;
	}

	public void setCtj(String ctj) {
		this.ctj = ctj;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(LocalDate lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

}
