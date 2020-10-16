package org.epragati.payment.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author Sai Kiran Kola
 *
 */
@Document(collection = "master_revenue_target")

public class RevenueTargetDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer districtId;

	private Integer year;

	private Integer month;

	private double lifeTax;

	private double quarterlyTax;

	private double fee;

	private double serviceCharge;

	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	private double detection;

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public double getLifeTax() {
		return lifeTax;
	}

	public void setLifeTax(double lifeTax) {
		this.lifeTax = lifeTax;
	}

	public double getQuarterlyTax() {
		return quarterlyTax;
	}

	public void setQuarterlyTax(double quarterlyTax) {
		this.quarterlyTax = quarterlyTax;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public double getDetection() {
		return detection;
	}

	public void setDetection(double detection) {
		this.detection = detection;
	}

}
