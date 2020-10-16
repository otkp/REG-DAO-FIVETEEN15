package org.epragati.vcrImage.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.epragati.master.dto.MasterCovDTO;
import org.epragati.master.dto.VcrGoodsDTO;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DriverDetailsVcrDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String otherState;
	private String driverAbsConding;
	private String driverLicense;
	private String officeCode;
	private String firstIssuedOfficeCode;
	@JsonFormat(pattern = "yyyy-MM-dd ")
	private LocalDate dateOfBirth;
	//@NotNull(message = "classsOfVehicle are required.")
	private List<MasterCovDTO> classsOfVehicle;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate issuedBy;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate nonTransportValidUpto;
	@JsonFormat(pattern = "yyyy-MM-dd ")
	private LocalDate transportValidUpTo;
	@JsonFormat(pattern = "yyyy-MM-dd ")
	private LocalDate hazardousValidUpTo;
	private String badgeNumber;
	private String fullName;
	private String address;
	private boolean passanger;
	private boolean goods;
	private int numberOfPassanger;
	private int numberOfSeats;
	private VcrGoodsDTO goodsDescription;
	private boolean withInState;

	public String getOtherState() {
		return otherState;
	}

	public void setOtherState(String otherState) {
		this.otherState = otherState;
	}

	public String getDriverAbsConding() {
		return driverAbsConding;
	}

	public void setDriverAbsConding(String driverAbsConding) {
		this.driverAbsConding = driverAbsConding;
	}

	public String getDriverLicense() {
		return driverLicense;
	}

	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<MasterCovDTO> getClasssOfVehicle() {
		return classsOfVehicle;
	}

	public void setClasssOfVehicle(List<MasterCovDTO> classsOfVehicle) {
		this.classsOfVehicle = classsOfVehicle;
	}

	public LocalDate getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(LocalDate issuedBy) {
		this.issuedBy = issuedBy;
	}

	public LocalDate getNonTransportValidUpto() {
		return nonTransportValidUpto;
	}

	public void setNonTransportValidUpto(LocalDate nonTransportValidUpto) {
		this.nonTransportValidUpto = nonTransportValidUpto;
	}

	public LocalDate getTransportValidUpTo() {
		return transportValidUpTo;
	}

	public void setTransportValidUpTo(LocalDate transportValidUpTo) {
		this.transportValidUpTo = transportValidUpTo;
	}

	public LocalDate getHazardousValidUpTo() {
		return hazardousValidUpTo;
	}

	public void setHazardousValidUpTo(LocalDate hazardousValidUpTo) {
		this.hazardousValidUpTo = hazardousValidUpTo;
	}

	public String getBadgeNumber() {
		return badgeNumber;
	}

	public void setBadgeNumber(String badgeNumber) {
		this.badgeNumber = badgeNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isPassanger() {
		return passanger;
	}

	public void setPassanger(boolean passanger) {
		this.passanger = passanger;
	}

	public boolean isGoods() {
		return goods;
	}

	public void setGoods(boolean goods) {
		this.goods = goods;
	}

	public int getNumberOfPassanger() {
		return numberOfPassanger;
	}

	public void setNumberOfPassanger(int numberOfPassanger) {
		this.numberOfPassanger = numberOfPassanger;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public VcrGoodsDTO getGoodsDescription() {
		return goodsDescription;
	}

	public void setGoodsDescription(VcrGoodsDTO goodsDescription) {
		this.goodsDescription = goodsDescription;
	}
	
	public String getFirstIssuedOfficeCode() {
		return firstIssuedOfficeCode;
	}

	public void setFirstIssuedOfficeCode(String firstIssuedOfficeCode) {
		this.firstIssuedOfficeCode = firstIssuedOfficeCode;
	}

	public boolean isWithInState() {
		return withInState;
	}

	public void setWithInState(boolean withInState) {
		this.withInState = withInState;
	}

}
