package org.epragati.master.dto;

import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.regservice.dto.ActionDetails;
import org.epragati.util.document.KeyValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="auction_details")
public class AuctionDetailsDTO extends BaseEntity{

	@Id
	private String id;
	private String nameOfRequester;
	private String department;
	private String mviName;
	private String mviUserId;
	private String mviOfficeCode;
	private Integer noOfVehicles;
	private String dtcName;
	private String dtcUserId;
	private String dtcOfficeCode;
	private boolean auctionClosed;
	private List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures;
	private List<AuctionVehicleDetailsDTO> vehicleDetails;
	private boolean dtcCompleted;
	private List<ActionDetails> actions;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNameOfRequester() {
		return nameOfRequester;
	}
	public void setNameOfRequester(String nameOfRequester) {
		this.nameOfRequester = nameOfRequester;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getMviName() {
		return mviName;
	}
	public void setMviName(String mviName) {
		this.mviName = mviName;
	}
	public String getMviUserId() {
		return mviUserId;
	}
	public void setMviUserId(String mviUserId) {
		this.mviUserId = mviUserId;
	}
	public String getMviOfficeCode() {
		return mviOfficeCode;
	}
	public void setMviOfficeCode(String mviOfficeCode) {
		this.mviOfficeCode = mviOfficeCode;
	}
	public Integer getNoOfVehicles() {
		return noOfVehicles;
	}
	public void setNoOfVehicles(Integer noOfVehicles) {
		this.noOfVehicles = noOfVehicles;
	}
	public String getDtcName() {
		return dtcName;
	}
	public void setDtcName(String dtcName) {
		this.dtcName = dtcName;
	}
	public String getDtcUserId() {
		return dtcUserId;
	}
	public void setDtcUserId(String dtcUserId) {
		this.dtcUserId = dtcUserId;
	}
	public String getDtcOfficeCode() {
		return dtcOfficeCode;
	}
	public void setDtcOfficeCode(String dtcOfficeCode) {
		this.dtcOfficeCode = dtcOfficeCode;
	}
	public boolean isAuctionClosed() {
		return auctionClosed;
	}
	public void setAuctionClosed(boolean auctionClosed) {
		this.auctionClosed = auctionClosed;
	}
	public List<KeyValue<String, List<ImageEnclosureDTO>>> getEnclosures() {
		return enclosures;
	}
	public void setEnclosures(List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures) {
		this.enclosures = enclosures;
	}
	public List<AuctionVehicleDetailsDTO> getVehicleDetails() {
		return vehicleDetails;
	}
	public void setVehicleDetails(List<AuctionVehicleDetailsDTO> vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}
	public boolean isDtcCompleted() {
		return dtcCompleted;
	}
	public void setDtcCompleted(boolean dtcCompleted) {
		this.dtcCompleted = dtcCompleted;
	}
	public List<ActionDetails> getActions() {
		return actions;
	}
	public void setActions(List<ActionDetails> actions) {
		this.actions = actions;
	}
	
	
}
