package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.epragati.constants.FcValidityTypesEnum;
import org.epragati.regservice.dto.SlotDetailsDTO;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Document(collection = "fc_details")
public class FcDetailsDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String applicationNo;
	private String fcNumber;
	private LocalDateTime fcIssuedDate;
	private String officeCode;
	private String vehicleNumber;
	private String trNo;
	private String prNo;
	private LocalDate fcValidUpto;	
	private String userId; 
	private String inspectedMviName;
	private LocalDateTime inspectedDate;

	private String OfficeName;

	private String chassisNo;

	private String engineNo;

	private String classOfVehicle;

	private String mfgDate;
	private boolean status = Boolean.TRUE;
	private VahanDetailsDTO vahandetails;
	private boolean isghatroad;
	private ActionDetailsDTO reExam;
	private List<ActionDetailsDTO> reExamLog;
	private SlotDetailsDTO slotdetails;
	private List<SlotDetailsDTO> slotdetailslog;
	private boolean Isotherstation;
	private String otherstationofficecode;
	private String otherstationrtocode;
	private LocalDate paymentdate;
	private LocalDate paymenttransactionno;
	//private paymentdetails;
	//private String remarks;
	private int noofdaysafterexpiry;
	
	private LocalDate fcvalidfrom;
	private String fctype;
	//private LocalDateTime createdDate;

	private String dlNumber;
	private String vcrNumber;
	private String placeOfChecking;
	private String destination;
	private String maxSpeed;
	private String driverName;
	private FcValidityTypesEnum.CfxType cfxType;
	private String defectComment;
	private String inspectedMviOfficeName;
	private String cfxIssuedMviName;
	private String cfxIssuedOfficeName;
	
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public VahanDetailsDTO getVahandetails() {
		return vahandetails;
	}

	public void setVahandetails(VahanDetailsDTO vahandetails) {
		this.vahandetails = vahandetails;
	}

	public boolean isIsghatroad() {
		return isghatroad;
	}

	public void setIsghatroad(boolean isghatroad) {
		this.isghatroad = isghatroad;
	}

	public ActionDetailsDTO getReExam() {
		return reExam;
	}

	public void setReExam(ActionDetailsDTO reExam) {
		this.reExam = reExam;
	}

	public List<ActionDetailsDTO> getReExamLog() {
		return reExamLog;
	}

	public void setReExamLog(List<ActionDetailsDTO> reExamLog) {
		this.reExamLog = reExamLog;
	}

	public SlotDetailsDTO getSlotdetails() {
		return slotdetails;
	}

	public void setSlotdetails(SlotDetailsDTO slotdetails) {
		this.slotdetails = slotdetails;
	}

	public List<SlotDetailsDTO> getSlotdetailslog() {
		return slotdetailslog;
	}

	public void setSlotdetailslog(List<SlotDetailsDTO> slotdetailslog) {
		this.slotdetailslog = slotdetailslog;
	}

	public boolean isIsotherstation() {
		return Isotherstation;
	}

	public void setIsotherstation(boolean isotherstation) {
		Isotherstation = isotherstation;
	}

	public String getOtherstationofficecode() {
		return otherstationofficecode;
	}

	public void setOtherstationofficecode(String otherstationofficecode) {
		this.otherstationofficecode = otherstationofficecode;
	}

	public String getOtherstationrtocode() {
		return otherstationrtocode;
	}

	public void setOtherstationrtocode(String otherstationrtocode) {
		this.otherstationrtocode = otherstationrtocode;
	}

	public LocalDate getPaymentdate() {
		return paymentdate;
	}

	public void setPaymentdate(LocalDate paymentdate) {
		this.paymentdate = paymentdate;
	}

	public LocalDate getPaymenttransactionno() {
		return paymenttransactionno;
	}

	public void setPaymenttransactionno(LocalDate paymenttransactionno) {
		this.paymenttransactionno = paymenttransactionno;
	}

	/*public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}*/

	public int getNoofdaysafterexpiry() {
		return noofdaysafterexpiry;
	}

	public void setNoofdaysafterexpiry(int noofdaysafterexpiry) {
		this.noofdaysafterexpiry = noofdaysafterexpiry;
	}

	public LocalDate getFcvalidfrom() {
		return fcvalidfrom;
	}

	public void setFcvalidfrom(LocalDate fcvalidfrom) {
		this.fcvalidfrom = fcvalidfrom;
	}

	public String getFctype() {
		return fctype;
	}

	public void setFctype(String fctype) {
		this.fctype = fctype;
	}

	/**
	 * @return the fcNumber
	 */
	public String getFcNumber() {
		return fcNumber;
	}

	/**
	 * @param fcNumber
	 *            the fcNumber to set
	 */
	public void setFcNumber(String fcNumber) {
		this.fcNumber = fcNumber;
	}

	/**
	 * @return the fcIssuedDate
	 */
	public LocalDateTime getFcIssuedDate() {
		return fcIssuedDate;
	}

	/**
	 * @param fcIssuedDate
	 *            the fcIssuedDate to set
	 */
	public void setFcIssuedDate(LocalDateTime fcIssuedDate) {
		this.fcIssuedDate = fcIssuedDate;
	}

	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode
	 *            the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	/**
	 * @return the vehicleNumber
	 */
	public String getVehicleNumber() {
		return vehicleNumber;
	}

	/**
	 * @param vehicleNumber
	 *            the vehicleNumber to set
	 */
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	/**
	 * @return the fcValidUpto
	 */
	public LocalDate getFcValidUpto() {
		return fcValidUpto;
	}

	/**
	 * @param fcValidUpto
	 *            the fcValidUpto to set
	 */
	public void setFcValidUpto(LocalDate fcValidUpto) {
		this.fcValidUpto = fcValidUpto;
	}

	/**
	 * @return the inspectedMviName
	 */
	public String getInspectedMviName() {
		return inspectedMviName;
	}

	/**
	 * @param inspectedMviName
	 *            the inspectedMviName to set
	 */
	public void setInspectedMviName(String inspectedMviName) {
		this.inspectedMviName = inspectedMviName;
	}

	/**
	 * @return the officeName
	 */
	public String getOfficeName() {
		return OfficeName;
	}

	/**
	 * @param officeName
	 *            the officeName to set
	 */
	public void setOfficeName(String officeName) {
		OfficeName = officeName;
	}

	/**
	 * @return the chassisNo
	 */
	public String getChassisNo() {
		return chassisNo;
	}

	/**
	 * @param chassisNo
	 *            the chassisNo to set
	 */
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	/**
	 * @return the engineNo
	 */
	public String getEngineNo() {
		return engineNo;
	}

	/**
	 * @param engineNo
	 *            the engineNo to set
	 */
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	/**
	 * @return the classOfVehicle
	 */
	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	/**
	 * @param classOfVehicle
	 *            the classOfVehicle to set
	 */
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the applicationNo
	 */
	public String getApplicationNo() {
		return applicationNo;
	}

	/**
	 * @param applicationNo
	 *            the applicationNo to set
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	/**
	 * @return the trNo
	 */
	public String getTrNo() {
		return trNo;
	}

	/**
	 * @param trNo
	 *            the trNo to set
	 */
	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo
	 *            the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/*public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}*/

	public LocalDateTime getInspectedDate() {
		return inspectedDate;
	}

	public void setInspectedDate(LocalDateTime inspectedDate) {
		this.inspectedDate = inspectedDate;
	}

	
	/**
	 * @return the dlNumber
	 */
	public String getDlNumber() {
		return dlNumber;
	}

	/**
	 * @param dlNumber the dlNumber to set
	 */
	public void setDlNumber(String dlNumber) {
		this.dlNumber = dlNumber;
	}

	/**
	 * @return the vcrNumber
	 */
	public String getVcrNumber() {
		return vcrNumber;
	}

	/**
	 * @param vcrNumber the vcrNumber to set
	 */
	public void setVcrNumber(String vcrNumber) {
		this.vcrNumber = vcrNumber;
	}

	/**
	 * @return the placeOfChecking
	 */
	public String getPlaceOfChecking() {
		return placeOfChecking;
	}

	/**
	 * @param placeOfChecking the placeOfChecking to set
	 */
	public void setPlaceOfChecking(String placeOfChecking) {
		this.placeOfChecking = placeOfChecking;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the maxSpeed
	 */
	public String getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * @return the driverName
	 */
	public String getDriverName() {
		return driverName;
	}

	/**
	 * @param driverName the driverName to set
	 */
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}





	/**
	 * @return the cfxType
	 */
	public FcValidityTypesEnum.CfxType getCfxType() {
		return cfxType;
	}

	/**
	 * @param cfxType the cfxType to set
	 */
	public void setCfxType(FcValidityTypesEnum.CfxType cfxType) {
		this.cfxType = cfxType;
	}

	/**
	 * @return the defectComment
	 */
	public String getDefectComment() {
		return defectComment;
	}

	/**
	 * @param defectComment the defectComment to set
	 */
	public void setDefectComment(String defectComment) {
		this.defectComment = defectComment;
	}

	
	/**
	 * @return the inspectedMviOfficeName
	 */
	public String getInspectedMviOfficeName() {
		return inspectedMviOfficeName;
	}

	/**
	 * @param inspectedMviOfficeName the inspectedMviOfficeName to set
	 */
	public void setInspectedMviOfficeName(String inspectedMviOfficeName) {
		this.inspectedMviOfficeName = inspectedMviOfficeName;
	}

	/**
	 * @return the cfxIssuedMviName
	 */
	public String getCfxIssuedMviName() {
		return cfxIssuedMviName;
	}

	/**
	 * @param cfxIssuedMviName the cfxIssuedMviName to set
	 */
	public void setCfxIssuedMviName(String cfxIssuedMviName) {
		this.cfxIssuedMviName = cfxIssuedMviName;
	}

	/**
	 * @return the cfxIssuedOfficeName
	 */
	public String getCfxIssuedOfficeName() {
		return cfxIssuedOfficeName;
	}

	/**
	 * @param cfxIssuedOfficeName the cfxIssuedOfficeName to set
	 */
	public void setCfxIssuedOfficeName(String cfxIssuedOfficeName) {
		this.cfxIssuedOfficeName = cfxIssuedOfficeName;
	}

	@Override
	public String toString() {
		return "FcDetailsDTO [id=" + id + ", applicationNo=" + applicationNo + ", fcNumber=" + fcNumber
				+ ", fcIssuedDate=" + fcIssuedDate + ", officeCode=" + officeCode + ", vehicleNumber=" + vehicleNumber
				+ ", trNo=" + trNo + ", prNo=" + prNo + ", fcValidUpto=" + fcValidUpto + ", userId=" + userId
				+ ", inspectedMviName=" + inspectedMviName + ", inspectedDate=" + inspectedDate + ", OfficeName="
				+ OfficeName + ", chassisNo=" + chassisNo + ", engineNo=" + engineNo + ", classOfVehicle="
				+ classOfVehicle + ", mfgDate=" + mfgDate + "]";
	}

}
