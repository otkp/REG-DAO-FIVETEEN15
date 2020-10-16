package org.epragati.master.dto;


import java.io.Serializable;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection="master_mandal")
public class MandalDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer mandalCode;
	
	private String mandalName;
	
	private Integer districtId;
	
	private String mandalId;
	
	private String officeCode;
	
	private String nonTransportOffice;
	
	private String transportOfice;
	
	private String hsrpoffice;
	
	private String status;
	private String police;
	private String stu;
	
	private String mviAddressOfficeCode;
	
	
	public String getStu() {
		return stu;
	}

	public void setStu(String stu) {
		this.stu = stu;
	}

	/**
	 * @return the mandalCode
	 */
	public Integer getMandalCode() {
		return mandalCode;
	}

	/**
	 * @param mandalCode the mandalCode to set
	 */
	public void setMandalCode(Integer mandalCode) {
		this.mandalCode = mandalCode;
	}

	/**
	 * @return the mandalName
	 */
	public String getMandalName() {
		return mandalName;
	}

	/**
	 * @param mandalName the mandalName to set
	 */
	public void setMandalName(String mandalName) {
		this.mandalName = mandalName;
	}

	/**
	 * @return the districtId
	 */
	public Integer getDistrictId() {
		return districtId;
	}

	/**
	 * @param districtId the districtId to set
	 */
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	/**
	 * @return the mandalId
	 */
	public String getMandalId() {
		return mandalId;
	}

	/**
	 * @param mandalId the mandalId to set
	 */
	public void setMandalId(String mandalId) {
		this.mandalId = mandalId;
	}
	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	/**
	 * @return the nonTransportOffice
	 */
	public String getNonTransportOffice() {
		return nonTransportOffice;
	}

	/**
	 * @param nonTransportOffice the nonTransportOffice to set
	 */
	public void setNonTransportOffice(String nonTransportOffice) {
		this.nonTransportOffice = nonTransportOffice;
	}

	/**
	 * @return the transportOfice
	 */
	public String getTransportOfice() {
		return transportOfice;
	}

	/**
	 * @param transportOfice the transportOfice to set
	 */
	public void setTransportOfice(String transportOfice) {
		this.transportOfice = transportOfice;
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


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/**
	 * @return the police
	 */
	public String getPolice() {
		return police;
	}

	/**
	 * @param police the police to set
	 */
	public void setPolice(String police) {
		this.police = police;
	}


	
	/**
	 * @return the hsrpoffice
	 */
	public String getHsrpoffice() {
		return hsrpoffice;
	}

	/**
	 * @param hsrpoffice the hsrpoffice to set
	 */
	public void setHsrpoffice(String hsrpoffice) {
		this.hsrpoffice = hsrpoffice;
	}
	

	/**
	 * @return the mviAddressOfficeCode
	 */
	public String getMviAddressOfficeCode() {
		return mviAddressOfficeCode;
	}

	/**
	 * @param mviAddressOfficeCode the mviAddressOfficeCode to set
	 */
	public void setMviAddressOfficeCode(String mviAddressOfficeCode) {
		this.mviAddressOfficeCode = mviAddressOfficeCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MandalDTO [mandalCode=" + mandalCode + ", mandalName=" + mandalName + ", districtId=" + districtId
				+ ", mandalId=" + mandalId + ", officeCode=" + officeCode + ", nonTransportOffice=" + nonTransportOffice
				+ ", transportOfice=" + transportOfice + ", hsrpoffice=" + hsrpoffice + ", status=" + status
				+ ", police=" + police + "]";
	}

	


}
