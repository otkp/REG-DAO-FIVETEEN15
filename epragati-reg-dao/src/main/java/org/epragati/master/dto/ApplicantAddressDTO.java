package org.epragati.master.dto;

public class ApplicantAddressDTO {

	private String type;

	private String doorNo;

	private String streetName;

	private String townOrCity;

	private MandalDTO mandal;

	private DistrictDTO district;

	private StateDTO state;

	private PostOfficeDTO postOffice;

	private VillageDTO village;

	private CountryDTO country;

	private Boolean isMigrated;

	 private String otherMandal;

	 private String otherDistrict;

	 private String otherState;
	 

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private String otherPinCode;

	private String otherVillage;

	private String otherCountry;
	
	private Boolean isDeathMandal;

	public Boolean getIsDeathMandal() {
		return isDeathMandal;
	}

	public void setIsDeathMandal(Boolean isDeathMandal) {
		this.isDeathMandal = isDeathMandal;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getTownOrCity() {
		return townOrCity;
	}

	public void setTownOrCity(String townOrCity) {
		this.townOrCity = townOrCity;
	}

	public MandalDTO getMandal() {
		return mandal;
	}

	public void setMandal(MandalDTO mandal) {
		this.mandal = mandal;
	}

	public DistrictDTO getDistrict() {
		return district;
	}

	public void setDistrict(DistrictDTO district) {
		this.district = district;
	}

	public StateDTO getState() {
		return state;
	}

	public void setState(StateDTO state) {
		this.state = state;
	}

	public PostOfficeDTO getPostOffice() {
		return postOffice;
	}

	public void setPostOffice(PostOfficeDTO postOffice) {
		this.postOffice = postOffice;
	}

	public VillageDTO getVillage() {
		return village;
	}

	public void setVillage(VillageDTO village) {
		this.village = village;
	}

	public CountryDTO getCountry() {
		return country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}

	public Boolean getIsMigrated() {
		return isMigrated;
	}

	public void setIsMigrated(Boolean isMigrated) {
		this.isMigrated = isMigrated;
	}

	public String getOtherPinCode() {
		return otherPinCode;
	}

	public void setOtherPinCode(String otherPinCode) {
		this.otherPinCode = otherPinCode;
	}

	public String getOtherVillage() {
		return otherVillage;
	}

	public void setOtherVillage(String otherVillage) {
		this.otherVillage = otherVillage;
	}

	public String getOtherCountry() {
		return otherCountry;
	}

	public void setOtherCountry(String otherCountry) {
		this.otherCountry = otherCountry;
	}

	public String getOtherMandal() {
		return otherMandal;
	}

	public void setOtherMandal(String otherMandal) {
		this.otherMandal = otherMandal;
	}

	public String getOtherDistrict() {
		return otherDistrict;
	}

	public void setOtherDistrict(String otherDistrict) {
		this.otherDistrict = otherDistrict;
	}

	public String getOtherState() {
		return otherState;
	}

	public void setOtherState(String otherState) {
		this.otherState = otherState;
	}
	
}