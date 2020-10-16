package org.epragati.sn.dto;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.util.BidStatus;
import org.epragati.util.payment.ModuleEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Document(collection = "sn_special_number_details")
@CompoundIndexes({
	@CompoundIndex(name = "vehicleDetails_applicationNumber", def = "{'vehicleDetails.applicationNumber': 1}"),
	@CompoundIndex(name = "specialNumberAppId", def = "{'specialNumberAppId': 1}"),
	@CompoundIndex(name = "bidStatus", def = "{'bidStatus': 1}"),
	@CompoundIndex(name = "vehicleDetails_trNumber_and_customerDetails_mobileNo_and_passcode", def = "{'vehicleDetails.trNumber': 1, 'customerDetails.mobileNo': 1, 'passcode': 1}"),
	@CompoundIndex(name = "vehicleDetails_rtaOffice_officeCode_and_actionsDetailsLog_action_and_createdDate", def = "{'vehicleDetails.rtaOffice.officeCode': 1, 'actionsDetailsLog.action': 1, 'createdDate': 1}"),
	@CompoundIndex(name = "actionsDetailsLog_action_and_createdDate", def = "{'actionsDetailsLog.action': 1, 'createdDate': 1}"),
	@CompoundIndex(name = "vehicleDetails_trNumber", def = "{'vehicleDetails.trNumber': 1}"),
	@CompoundIndex(name = "specialNumberAppId_and_vehicleDetails_trNumber", def = "{'specialNumberAppId': 1, 'vehicleDetails.trNumber': 1}"),
	@CompoundIndex(name = "specialNumberFeeDetails_transactionNo", def = "{'specialNumberFeeDetails.transactionNo': 1}"),
	@CompoundIndex(name = "bidStatus_createdDate_idx", def = "{bidStatus': 1,'createdDate': 1}"),
	@CompoundIndex(name = "bidStatus_isrefund_idx", def = "{bidStatus:1,specialNumberFeeDetails.isRefundDone:1,createdDate:1}"),
	@CompoundIndex(name = "bidStatus_Finalpay_isrefund_idx", def = "{bidStatus:1,finalDetails.isRefundDone:1,createdDate:1}"),
	@CompoundIndex(name = "vehicleDetails_trNo_and_bidStatus", def = "{'vehicleDetails.trNumber': 1,bidStatus:1}"),
	@CompoundIndex(name = "vecl_trNo_bidStatus_creDate_idx", def = "{'vehicleDetails.trNumber': 1,bidStatus:1,createdDate:1}"),
	@CompoundIndex(name = "createdDate_action_idx", def = "{createdDate:1, 'actionsDetailsLog.action':1}"),
	@CompoundIndex(name = "createdDate_action_covcode_idx", def = "{'vehicleDetails.classOfVehicle.covcode':1,'actionsDetailsLog.action':1,createdDate:1}"),
	@CompoundIndex(name = "createdDate_covcode_idx", def = "{'vehicleDetails.classOfVehicle.covcode':1,createdDate:1}"),
	@CompoundIndex(name = "createdDate_idx", def = "{createdDate:1}"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class SpecialNumberDetailsDTO extends BaseEntity {

	private static final long serialVersionUID = -3689145782882640416L;

	@Id
	private String specialNumberAppId;

	private VehicleDetails vehicleDetails;

	private CustomerDetails customerDetails;

	private Integer bidIteration;
	
	private Integer selectedNo;

	private Integer bidConfigMasterId;

	private BidVehicleDetails bidVehicleDetails;

	private BidStatus bidStatus;

	private String passcode;

	private String selectedPrSeries;

	private List<ActionsDetails> actionsDetailsLog;

	private List<BidHistory> bidHistory;

	private BidFinalDetails bidFinalDetails;
	
	private SpecialNumberFeeDetails specialNumberFeeDetails;
	
	private ModuleEnum module;
	
	private Integer passCodeResentCound;
	
	private LocalDateTime lastPasscodeSentDateTime; 
	
	
	
	/**
	 * @return the module
	 */
	public ModuleEnum getModule() {
		return module;
	}

	/**
	 * @param module the module to set
	 */
	public void setModule(ModuleEnum module) {
		this.module = module;
	}

	/**
	 * @return the selectedNo
	 */
	public Integer getSelectedNo() {
		return selectedNo;
	}

	/**
	 * @param selectedNo the selectedNo to set
	 */
	public void setSelectedNo(Integer selectedNo) {
		this.selectedNo = selectedNo;
	}



	public String getSpecialNumberAppId() {
		return specialNumberAppId;
	}

	public void setSpecialNumberAppId(String specialNumberAppId) {
		this.specialNumberAppId = specialNumberAppId;
	}

	public VehicleDetails getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(VehicleDetails vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	public Integer getBidIteration() {
		return bidIteration;
	}

	public void setBidIteration(Integer bidIteration) {
		this.bidIteration = bidIteration;
	}

	public Integer getBidConfigMasterId() {
		return bidConfigMasterId;
	}

	public void setBidConfigMasterId(Integer bidConfigMasterId) {
		this.bidConfigMasterId = bidConfigMasterId;
	}

	public BidVehicleDetails getBidVehicleDetails() {
		return bidVehicleDetails;
	}

	public void setBidVehicleDetails(BidVehicleDetails bidVehicleDetails) {
		this.bidVehicleDetails = bidVehicleDetails;
	}

	public BidStatus getBidStatus() {
		return bidStatus;
	}

	public void setBidStatus(BidStatus bidStatus) {
		this.bidStatus = bidStatus;
	}

	public String getPasscode() {
		return passcode;
	}

	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}

	public List<ActionsDetails> getActionsDetailsLog() {
		return actionsDetailsLog;
	}

	public void setActionsDetailsLog(List<ActionsDetails> actionsDetailsLog) {
		this.actionsDetailsLog = actionsDetailsLog;
	}

	public List<BidHistory> getBidHistory() {
		return bidHistory;
	}

	public void setBidHistory(List<BidHistory> bidHistory) {
		this.bidHistory = bidHistory;
	}

	public BidFinalDetails getBidFinalDetails() {
		return bidFinalDetails;
	}

	public void setBidFinalDetails(BidFinalDetails bidFinalDetails) {
		this.bidFinalDetails = bidFinalDetails;
	}

	public SpecialNumberFeeDetails getSpecialNumberFeeDetails() {
		return specialNumberFeeDetails;
	}

	public void setSpecialNumberFeeDetails(SpecialNumberFeeDetails specialNumberFeeDetails) {
		this.specialNumberFeeDetails = specialNumberFeeDetails;
	}

	public String getSelectedPrSeries() {
		return selectedPrSeries;
	}

	public void setSelectedPrSeries(String selectedPrSeries) {
		this.selectedPrSeries = selectedPrSeries;
	}
	
	
	public Integer getPassCodeResentCound() {
		return passCodeResentCound;
	}

	public void setPassCodeResentCound(Integer passCodeResentCound) {
		this.passCodeResentCound = passCodeResentCound;
	}

	public LocalDateTime getLastPasscodeSentDateTime() {
		return lastPasscodeSentDateTime;
	}

	public void setLastPasscodeSentDateTime(LocalDateTime lastPasscodeSentDateTime) {
		this.lastPasscodeSentDateTime = lastPasscodeSentDateTime;
	}

	public Double getMaxBidAmount() {
		if(this.getBidStatus().equals(BidStatus.FINALPAYMENTDONE) && this.getBidFinalDetails()!=null
				&& this.getBidFinalDetails().getTotalAmount()!=null) {
			return this.getBidFinalDetails().getTotalAmount();
		}
		return 0d;
	}
	
	public Double getMaxSPNumberAmount() {
		if(Arrays.asList(BidStatus.SPPAYMENTDONE,BidStatus.FINALPAYMENTFAILURE,BidStatus.FINALPAYMENTPENDING).contains(this.getBidStatus()) 
				&& this.getSpecialNumberFeeDetails()!=null
				&& this.getSpecialNumberFeeDetails().getApplicationAmount()!=null) {
			return this.getSpecialNumberFeeDetails().getApplicationAmount();
		}
		return 0d;	
	}
	
	
}
