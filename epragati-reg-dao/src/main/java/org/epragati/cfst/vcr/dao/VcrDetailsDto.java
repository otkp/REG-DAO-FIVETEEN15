package org.epragati.cfst.vcr.dao;

import java.util.ArrayList;
import java.util.List;

import org.epragati.cfstVcr.vo.VcrOffenseDetails;
import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vcr_details")
public class VcrDetailsDto extends BaseEntity {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String vcrNum;

    private String regNo;

    private String dlNumber;

    private String bookedByMvi;

    private String bookedDate;
    
    private String bookedTime;

    private String placeBooked;

    private String vcrStatus;

    private String idType;
    
    private String vehsezdFlag;
    
    private String vcrQuaterTaxValidUpto;

    private VcrTaxDetailsDTO vcrTaxDetails;
    
    public VcrTaxDetailsDTO getVcrTaxDetails() {
		return vcrTaxDetails;
	}

	public void setVcrTaxDetails(VcrTaxDetailsDTO vcrTaxDetails) {
		this.vcrTaxDetails = vcrTaxDetails;
	}

	/**
	 * @return the vehsezdFlag
	 */
	public String getVehsezdFlag() {
		return vehsezdFlag;
	}

	/**
	 * @param vehsezdFlag the vehsezdFlag to set
	 */
	public void setVehsezdFlag(String vehsezdFlag) {
		this.vehsezdFlag = vehsezdFlag;
	}

	private List<VcrOffenseDetails> offenseDetails = new ArrayList<>();
    
    public String getVcrNum() {
        return vcrNum;
    }

    public void setVcrNum(String vcrNum) {
        this.vcrNum = vcrNum;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getDlNumber() {
        return dlNumber;
    }

    public void setDlNumber(String dlNumber) {
        this.dlNumber = dlNumber;
    }

    public String getBookedByMvi() {
        return bookedByMvi;
    }

    public void setBookedByMvi(String bookedByMvi) {
        this.bookedByMvi = bookedByMvi;
    }

    public String getBookedDate() {
        return bookedDate;
    }

    public void setBookedDate(String bookedDate) {
        this.bookedDate = bookedDate;
    }

    public String getBookedTime() {
        return bookedTime;
    }

    public void setBookedTime(String bookedTime) {
        this.bookedTime = bookedTime;
    }

    public String getPlaceBooked() {
        return placeBooked;
    }

    public void setPlaceBooked(String placeBooked) {
        this.placeBooked = placeBooked;
    }

    public String getVcrStatus() {
        return vcrStatus;
    }

    public void setVcrStatus(String vcrStatus) {
        this.vcrStatus = vcrStatus;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }
    
    public List<VcrOffenseDetails> getOffenseDetails() {
        return offenseDetails;
    }

    public void setOffenseDetails(List<VcrOffenseDetails> offenseDetails) {
        this.offenseDetails = offenseDetails;
    }

	public String getVcrQuaterTaxValidUpto() {
		return vcrQuaterTaxValidUpto;
	}

	public void setVcrQuaterTaxValidUpto(String vcrQuaterTaxValidUpto) {
		this.vcrQuaterTaxValidUpto = vcrQuaterTaxValidUpto;
	}
    
}
