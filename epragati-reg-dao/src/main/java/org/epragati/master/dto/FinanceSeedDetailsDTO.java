package org.epragati.master.dto;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "finance_vehicle_seed_details")
public class FinanceSeedDetailsDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
@Id
private String id;

private String userName;

private String fatherName;

private String classOfVehicle;

private String classOfVehicleDesc;

private String vehicleType;

private String makersModel;

private ApplicantAddressDTO presentAddress;

private String prNo;

private String chassisNo;

private String status;

private FinanceDetailsDTO offlineFinanceDetails;

private String officeCode;

private List<ActionDetailsDTO> actionDetails;

private UserDTO onlineFinanceDetails;

private String comments;

private String userId;


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
 * @return the fatherName
 */
public String getFatherName() {
	return fatherName;
}

/**
 * @param fatherName the fatherName to set
 */
public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
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
 * @return the classOfVehicleDesc
 */
public String getClassOfVehicleDesc() {
	return classOfVehicleDesc;
}

/**
 * @param classOfVehicleDesc the classOfVehicleDesc to set
 */
public void setClassOfVehicleDesc(String classOfVehicleDesc) {
	this.classOfVehicleDesc = classOfVehicleDesc;
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
 * @return the makersModel
 */
public String getMakersModel() {
	return makersModel;
}

/**
 * @param makersModel the makersModel to set
 */
public void setMakersModel(String makersModel) {
	this.makersModel = makersModel;
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
 * @return the chassisNo
 */
public String getChassisNo() {
	return chassisNo;
}

/**
 * @param chassisNo the chassisNo to set
 */
public void setChassisNo(String chassisNo) {
	this.chassisNo = chassisNo;
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
 * @return the userName
 */
public String getUserName() {
	return userName;
}

/**
 * @param userName the userName to set
 */
public void setUserName(String userName) {
	this.userName = userName;
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
 * @return the actionDetails
 */
public List<ActionDetailsDTO> getActionDetails() {
	return actionDetails;
}

/**
 * @param actionDetails the actionDetails to set
 */
public void setActionDetails(List<ActionDetailsDTO> actionDetails) {
	this.actionDetails = actionDetails;
}

/**
 * @return the offlineFinanceDetails
 */
public FinanceDetailsDTO getOfflineFinanceDetails() {
	return offlineFinanceDetails;
}

/**
 * @param offlineFinanceDetails the offlineFinanceDetails to set
 */
public void setOfflineFinanceDetails(FinanceDetailsDTO offlineFinanceDetails) {
	this.offlineFinanceDetails = offlineFinanceDetails;
}

/**
 * @return the onlineFinanceDetails
 */
public UserDTO getOnlineFinanceDetails() {
	return onlineFinanceDetails;
}

/**
 * @param onlineFinanceDetails the onlineFinanceDetails to set
 */
public void setOnlineFinanceDetails(UserDTO onlineFinanceDetails) {
	this.onlineFinanceDetails = onlineFinanceDetails;
}

/**
 * @return the presentAddress
 */
public ApplicantAddressDTO getPresentAddress() {
	return presentAddress;
}

/**
 * @param presentAddress the presentAddress to set
 */
public void setPresentAddress(ApplicantAddressDTO presentAddress) {
	this.presentAddress = presentAddress;
}

/**
 * @return the comments
 */
public String getComments() {
	return comments;
}

/**
 * @param comments the comments to set
 */
public void setComments(String comments) {
	this.comments = comments;
}

/**
 * @return the userId
 */
public String getUserId() {
	return userId;
}

/**
 * @param userId the userId to set
 */
public void setUserId(String userId) {
	this.userId = userId;
}






}
