package org.epragati.permits.dto;

import java.io.Serializable;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.epragati.master.dto.ApplicantDetailsDTO;
import org.epragati.master.dto.FcDetailsDTO;
import org.epragati.master.dto.InsuranceDetailsDTO;
import org.epragati.master.dto.TaxDetailsDTO;
import org.epragati.master.dto.VehicleDetailsDTO;
import org.epragati.payment.dto.FeeDetailsDTO;
import org.epragati.regservice.dto.PUCDetailsDTO;
import org.epragati.util.StatusRegistration;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author sairam.cheruku
 *
 */

@Document(collection = "other_state_temporary_permit_details")
public class OtherStateTemporaryPermitDetailsDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3988313366762522550L;

	@Id
	private String id;

	private ApplicantDetailsDTO applicantDetails;

	private VehicleDetailsDTO vehicleDetails;

	private InsuranceDetailsDTO insuranceDetails;

	private PUCDetailsDTO pucDetails;

	private String prNo;

	private String classOfVehicle;

	private String vehicleType;

	private PermitDetailsDTO primaryPermitDetails;

	private PermitDetailsDTO temporaryPermitDetails;

	private StatusRegistration applicationStatus;

	private FcDetailsDTO fcDetails;

	private TaxDetailsDTO taxDetails;

	private StatusRegistration status;

	private FeeDetailsDTO feeDetails;

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
	 * @return the applicantDetails
	 */
	public ApplicantDetailsDTO getApplicantDetails() {
		return applicantDetails;
	}

	/**
	 * @param applicantDetails the applicantDetails to set
	 */
	public void setApplicantDetails(ApplicantDetailsDTO applicantDetails) {
		this.applicantDetails = applicantDetails;
	}

	/**
	 * @return the vehicleDetails
	 */
	public VehicleDetailsDTO getVehicleDetails() {
		return vehicleDetails;
	}

	/**
	 * @param vehicleDetails the vehicleDetails to set
	 */
	public void setVehicleDetails(VehicleDetailsDTO vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	/**
	 * @return the insuranceDetails
	 */
	public InsuranceDetailsDTO getInsuranceDetails() {
		return insuranceDetails;
	}

	/**
	 * @param insuranceDetails the insuranceDetails to set
	 */
	public void setInsuranceDetails(InsuranceDetailsDTO insuranceDetails) {
		this.insuranceDetails = insuranceDetails;
	}

	/**
	 * @return the pucDetails
	 */
	public PUCDetailsDTO getPucDetails() {
		return pucDetails;
	}

	/**
	 * @param pucDetails the pucDetails to set
	 */
	public void setPucDetails(PUCDetailsDTO pucDetails) {
		this.pucDetails = pucDetails;
	}

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	/**
	 * @return the classOfVehicle
	 */
	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	/**
	 * @param classOfVehicle the classOfVehicle to set
	 */
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	/**
	 * @return the vehicleType
	 */
	public String getVehicleType() {
		return vehicleType;
	}

	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	/**
	 * @return the primaryPermitDetails
	 */
	public PermitDetailsDTO getPrimaryPermitDetails() {
		return primaryPermitDetails;
	}

	/**
	 * @param primaryPermitDetails the primaryPermitDetails to set
	 */
	public void setPrimaryPermitDetails(PermitDetailsDTO primaryPermitDetails) {
		this.primaryPermitDetails = primaryPermitDetails;
	}

	/**
	 * @return the temporaryPermitDetails
	 */
	public PermitDetailsDTO getTemporaryPermitDetails() {
		return temporaryPermitDetails;
	}

	/**
	 * @param temporaryPermitDetails the temporaryPermitDetails to set
	 */
	public void setTemporaryPermitDetails(PermitDetailsDTO temporaryPermitDetails) {
		this.temporaryPermitDetails = temporaryPermitDetails;
	}

	/**
	 * @return the applicationStatus
	 */
	public StatusRegistration getApplicationStatus() {
		return applicationStatus;
	}

	/**
	 * @param applicationStatus the applicationStatus to set
	 */
	public void setApplicationStatus(StatusRegistration applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	/**
	 * @return the fcDetails
	 */
	public FcDetailsDTO getFcDetails() {
		return fcDetails;
	}

	/**
	 * @param fcDetails the fcDetails to set
	 */
	public void setFcDetails(FcDetailsDTO fcDetails) {
		this.fcDetails = fcDetails;
	}

	/**
	 * @return the taxDetails
	 */
	public TaxDetailsDTO getTaxDetails() {
		return taxDetails;
	}

	/**
	 * @param taxDetails the taxDetails to set
	 */
	public void setTaxDetails(TaxDetailsDTO taxDetails) {
		this.taxDetails = taxDetails;
	}

	/**
	 * @return the status
	 */
	public StatusRegistration getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(StatusRegistration status) {
		this.status = status;
	}

	/**
	 * @return the feeDetails
	 */
	public FeeDetailsDTO getFeeDetails() {
		return feeDetails;
	}

	/**
	 * @param feeDetails the feeDetails to set
	 */
	public void setFeeDetails(FeeDetailsDTO feeDetails) {
		this.feeDetails = feeDetails;
	}

}
