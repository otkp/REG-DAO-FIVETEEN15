package org.epragati.master.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Document(collection = "master_variant")
public class MasterVariantDTO extends BaseEntity{
	@Id
	private String id;
	
	private Boolean active;
	
	private Integer mid;
	
	private String modelDesc;
	
	private Integer bodyTypeID;
	
	private Double cc;
	
	private Integer cylinder;
	
	private String fuel;
	
	private Double hp;
	
	private Integer seatCapacity;
	
	private Double unladenWt;
	
	private String wheelBase;
	
	private String faWt;
	
	private String oaWt;
	
	private String taWt;
	
	private Double gvmc;
	
	private Double gvmr;
	
	private Integer hang;
	
	private Double height;
	
	private Double length;
	
	private String tyreFA;
	
	private String tyreOA;
	
	private String tyreRA;
	
	private String tyreTA;
	
	private Double width;
	
	private Boolean bsAllowed=true;
	
	private String ulw;
    
	private String rlw;
	
    private String createdOfficeCode;
    
    private String gcwc;

	public String getGcwc() {
		return gcwc;
	}

	public void setGcwc(String gcwc) {
		this.gcwc = gcwc;
	}
    
	public String getCreatedOfficeCode() {
		return createdOfficeCode;
	}

	public void setCreatedOfficeCode(String createdOfficeCode) {
		this.createdOfficeCode = createdOfficeCode;
	}

	
	/**
	 * @return the active
	 */
	public Boolean getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	//private LocalDate apprDt;
	private String apprDt;
	
	/**
	 * @return the apprDt
	 */
	public String getApprDt() {
		return apprDt;
	}

	/**
	 * @param apprDt the apprDt to set
	 */
	public void setApprDt(String apprDt) {
		this.apprDt = apprDt;
	}

	/**
	 * @return the crtdDt
	 */
	public String getCrtdDt() {
		return crtdDt;
	}

	/**
	 * @param crtdDt the crtdDt to set
	 */
	public void setCrtdDt(String crtdDt) {
		this.crtdDt = crtdDt;
	}

	private String staApprNo;
	
	private String crtdUsr;
	
	//private LocalDate crtdDt;
	private String crtdDt;
	
	private String axle;
	
	private String frame;
	
	private String tyre;
	
	private String fuelType;
	
	private Double raWt;
	
	private String gcw;
	
	private String isBaseModel;
	
	private String baseModel;
	
	private String noMonthYearCode;
	
	private String bharatStage;
	
	//private String remarks;
	
	private String multiAxle;
	
	private Integer statusId;
	
	private String araiNumber;
	
	private String testagencyName;
	
	private String variantNumber;
	
	private Integer kw;
	
	private Integer chassisExempID;
	
	private String rsectionNO;
	
	private String originalModelDesc;
	
	private String exemptedRemarks;
	
	private String approvedBy;
	
	private String approvalDate;
	
	private String araiDate;
	
	private String reverificationFlag;
	
	private Integer vehicleMkSerialNO;
	
	private String vehicleClassID;

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
	 * @return the mid
	 */
	public Integer getMid() {
		return mid;
	}

	/**
	 * @param mid the mid to set
	 */
	public void setMid(Integer mid) {
		this.mid = mid;
	}

	/**
	 * @return the modelDesc
	 */
	public String getModelDesc() {
		return modelDesc;
	}

	/**
	 * @param modelDesc the modelDesc to set
	 */
	public void setModelDesc(String modelDesc) {
		this.modelDesc = modelDesc;
	}

	/**
	 * @return the bodyTypeID
	 */
	public Integer getBodyTypeID() {
		return bodyTypeID;
	}

	/**
	 * @param bodyTypeID the bodyTypeID to set
	 */
	public void setBodyTypeID(Integer bodyTypeID) {
		this.bodyTypeID = bodyTypeID;
	}

	/**
	 * @return the cc
	 */
	public Double getCc() {
		return cc;
	}

	/**
	 * @param cc the cc to set
	 */
	public void setCc(Double cc) {
		this.cc = cc;
	}

	/**
	 * @return the cylinder
	 */
	public Integer getCylinder() {
		return cylinder;
	}

	/**
	 * @param cylinder the cylinder to set
	 */
	public void setCylinder(Integer cylinder) {
		this.cylinder = cylinder;
	}

	/**
	 * @return the fuel
	 */
	public String getFuel() {
		return fuel;
	}

	/**
	 * @param fuel the fuel to set
	 */
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	/**
	 * @return the hp
	 */
	public Double getHp() {
		return hp;
	}

	/**
	 * @param hp the hp to set
	 */
	public void setHp(Double hp) {
		this.hp = hp;
	}

	/**
	 * @return the seatCapacity
	 */
	public Integer getSeatCapacity() {
		return seatCapacity;
	}

	/**
	 * @param seatCapacity the seatCapacity to set
	 */
	public void setSeatCapacity(Integer seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	/**
	 * @return the unladenWt
	 */
	public Double getUnladenWt() {
		return unladenWt;
	}

	/**
	 * @param unladenWt the unladenWt to set
	 */
	public void setUnladenWt(Double unladenWt) {
		this.unladenWt = unladenWt;
	}

	/**
	 * @return the wheelBase
	 */
	public String getWheelBase() {
		return wheelBase;
	}

	/**
	 * @param wheelBase the wheelBase to set
	 */
	public void setWheelBase(String wheelBase) {
		this.wheelBase = wheelBase;
	}

	/**
	 * @return the faWt
	 */
	public String getFaWt() {
		return faWt;
	}

	/**
	 * @param faWt the faWt to set
	 */
	public void setFaWt(String faWt) {
		this.faWt = faWt;
	}

	/**
	 * @return the oaWt
	 */
	public String getOaWt() {
		return oaWt;
	}

	/**
	 * @param oaWt the oaWt to set
	 */
	public void setOaWt(String oaWt) {
		this.oaWt = oaWt;
	}

	/**
	 * @return the taWt
	 */
	public String getTaWt() {
		return taWt;
	}

	/**
	 * @param taWt the taWt to set
	 */
	public void setTaWt(String taWt) {
		this.taWt = taWt;
	}

	/**
	 * @return the gvmc
	 */
	public Double getGvmc() {
		return gvmc;
	}

	/**
	 * @param gvmc the gvmc to set
	 */
	public void setGvmc(Double gvmc) {
		this.gvmc = gvmc;
	}

	/**
	 * @return the gvmr
	 */
	public Double getGvmr() {
		return gvmr;
	}

	/**
	 * @param gvmr the gvmr to set
	 */
	public void setGvmr(Double gvmr) {
		this.gvmr = gvmr;
	}

	/**
	 * @return the hang
	 */
	public Integer getHang() {
		return hang;
	}

	/**
	 * @param hang the hang to set
	 */
	public void setHang(Integer hang) {
		this.hang = hang;
	}

	/**
	 * @return the height
	 */
	public Double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(Double height) {
		this.height = height;
	}

	/**
	 * @return the length
	 */
	public Double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(Double length) {
		this.length = length;
	}

	/**
	 * @return the tyreFA
	 */
	public String getTyreFA() {
		return tyreFA;
	}

	/**
	 * @param tyreFA the tyreFA to set
	 */
	public void setTyreFA(String tyreFA) {
		this.tyreFA = tyreFA;
	}

	/**
	 * @return the tyreOA
	 */
	public String getTyreOA() {
		return tyreOA;
	}

	/**
	 * @param tyreOA the tyreOA to set
	 */
	public void setTyreOA(String tyreOA) {
		this.tyreOA = tyreOA;
	}

	/**
	 * @return the tyreRA
	 */
	public String getTyreRA() {
		return tyreRA;
	}

	/**
	 * @param tyreRA the tyreRA to set
	 */
	public void setTyreRA(String tyreRA) {
		this.tyreRA = tyreRA;
	}

	/**
	 * @return the tyreTA
	 */
	public String getTyreTA() {
		return tyreTA;
	}

	/**
	 * @param tyreTA the tyreTA to set
	 */
	public void setTyreTA(String tyreTA) {
		this.tyreTA = tyreTA;
	}

	/**
	 * @return the width
	 */
	public Double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(Double width) {
		this.width = width;
	}

	
	/**
	 * @return the staApprNo
	 */
	public String getStaApprNo() {
		return staApprNo;
	}

	/**
	 * @param staApprNo the staApprNo to set
	 */
	public void setStaApprNo(String staApprNo) {
		this.staApprNo = staApprNo;
	}

	/**
	 * @return the crtdUsr
	 */
	public String getCrtdUsr() {
		return crtdUsr;
	}

	/**
	 * @param crtdUsr the crtdUsr to set
	 */
	public void setCrtdUsr(String crtdUsr) {
		this.crtdUsr = crtdUsr;
	}

	

	/**
	 * @return the axle
	 */
	public String getAxle() {
		return axle;
	}

	/**
	 * @param axle the axle to set
	 */
	public void setAxle(String axle) {
		this.axle = axle;
	}

	/**
	 * @return the frame
	 */
	public String getFrame() {
		return frame;
	}

	/**
	 * @param frame the frame to set
	 */
	public void setFrame(String frame) {
		this.frame = frame;
	}

	/**
	 * @return the tyre
	 */
	public String getTyre() {
		return tyre;
	}

	/**
	 * @param tyre the tyre to set
	 */
	public void setTyre(String tyre) {
		this.tyre = tyre;
	}

	/**
	 * @return the fuelType
	 */
	public String getFuelType() {
		return fuelType;
	}

	/**
	 * @param fuelType the fuelType to set
	 */
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	/**
	 * @return the raWt
	 */
	public Double getRaWt() {
		return raWt;
	}

	/**
	 * @param raWt the raWt to set
	 */
	public void setRaWt(Double raWt) {
		this.raWt = raWt;
	}

	/**
	 * @return the gcw
	 */
	public String getGcw() {
		return gcw;
	}

	/**
	 * @param gcw the gcw to set
	 */
	public void setGcw(String gcw) {
		this.gcw = gcw;
	}

	/**
	 * @return the isBaseModel
	 */
	public String getIsBaseModel() {
		return isBaseModel;
	}

	/**
	 * @param isBaseModel the isBaseModel to set
	 */
	public void setIsBaseModel(String isBaseModel) {
		this.isBaseModel = isBaseModel;
	}

	/**
	 * @return the baseModel
	 */
	public String getBaseModel() {
		return baseModel;
	}

	/**
	 * @param baseModel the baseModel to set
	 */
	public void setBaseModel(String baseModel) {
		this.baseModel = baseModel;
	}

	/**
	 * @return the noMonthYearCode
	 */
	public String getNoMonthYearCode() {
		return noMonthYearCode;
	}

	/**
	 * @param noMonthYearCode the noMonthYearCode to set
	 */
	public void setNoMonthYearCode(String noMonthYearCode) {
		this.noMonthYearCode = noMonthYearCode;
	}

	/**
	 * @return the bharatStage
	 */
	public String getBharatStage() {
		return bharatStage;
	}

	/**
	 * @param bharatStage the bharatStage to set
	 */
	public void setBharatStage(String bharatStage) {
		this.bharatStage = bharatStage;
	}

	/**
	 * @return the remarks
	 */
	/*public String getRemarks() {
		return remarks;
	}*/

	/**
	 * @param remarks the remarks to set
	 */
	/*public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
*/
	/**
	 * @return the multiAxle
	 */
	public String getMultiAxle() {
		return multiAxle;
	}

	/**
	 * @param multiAxle the multiAxle to set
	 */
	public void setMultiAxle(String multiAxle) {
		this.multiAxle = multiAxle;
	}

	/**
	 * @return the statusId
	 */
	public Integer getStatusId() {
		return statusId;
	}

	/**
	 * @param statusId the statusId to set
	 */
	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	/**
	 * @return the araiNumber
	 */
	public String getAraiNumber() {
		return araiNumber;
	}

	/**
	 * @param araiNumber the araiNumber to set
	 */
	public void setAraiNumber(String araiNumber) {
		this.araiNumber = araiNumber;
	}

	/**
	 * @return the testagencyName
	 */
	public String getTestagencyName() {
		return testagencyName;
	}

	/**
	 * @param testagencyName the testagencyName to set
	 */
	public void setTestagencyName(String testagencyName) {
		this.testagencyName = testagencyName;
	}

	/**
	 * @return the variantNumber
	 */
	public String getVariantNumber() {
		return variantNumber;
	}

	/**
	 * @param variantNumber the variantNumber to set
	 */
	public void setVariantNumber(String variantNumber) {
		this.variantNumber = variantNumber;
	}

	/**
	 * @return the kw
	 */
	public Integer getKw() {
		return kw;
	}

	/**
	 * @param kw the kw to set
	 */
	public void setKw(Integer kw) {
		this.kw = kw;
	}

	/**
	 * @return the chassisExempID
	 */
	public Integer getChassisExempID() {
		return chassisExempID;
	}

	/**
	 * @param chassisExempID the chassisExempID to set
	 */
	public void setChassisExempID(Integer chassisExempID) {
		this.chassisExempID = chassisExempID;
	}

	/**
	 * @return the rsectionNO
	 */
	public String getRsectionNO() {
		return rsectionNO;
	}

	/**
	 * @param rsectionNO the rsectionNO to set
	 */
	public void setRsectionNO(String rsectionNO) {
		this.rsectionNO = rsectionNO;
	}

	/**
	 * @return the originalModelDesc
	 */
	public String getOriginalModelDesc() {
		return originalModelDesc;
	}

	/**
	 * @param originalModelDesc the originalModelDesc to set
	 */
	public void setOriginalModelDesc(String originalModelDesc) {
		this.originalModelDesc = originalModelDesc;
	}

	/**
	 * @return the exemptedRemarks
	 */
	public String getExemptedRemarks() {
		return exemptedRemarks;
	}

	/**
	 * @param exemptedRemarks the exemptedRemarks to set
	 */
	public void setExemptedRemarks(String exemptedRemarks) {
		this.exemptedRemarks = exemptedRemarks;
	}

	/**
	 * @return the approvedBy
	 */
	public String getApprovedBy() {
		return approvedBy;
	}

	/**
	 * @param approvedBy the approvedBy to set
	 */
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	/**
	 * @return the approvalDate
	 */
	public String getApprovalDate() {
		return approvalDate;
	}

	/**
	 * @param approvalDate the approvalDate to set
	 */
	public void setApprovalDate(String approvalDate) {
		this.approvalDate = approvalDate;
	}

	/**
	 * @return the araiDate
	 */
	public String getAraiDate() {
		return araiDate;
	}

	/**
	 * @param araiDate the araiDate to set
	 */
	public void setAraiDate(String araiDate) {
		this.araiDate = araiDate;
	}

	/**
	 * @return the reverificationFlag
	 */
	public String getReverificationFlag() {
		return reverificationFlag;
	}

	/**
	 * @param reverificationFlag the reverificationFlag to set
	 */
	public void setReverificationFlag(String reverificationFlag) {
		this.reverificationFlag = reverificationFlag;
	}

	/**
	 * @return the vehicleMkSerialNO
	 */
	public Integer getVehicleMkSerialNO() {
		return vehicleMkSerialNO;
	}

	/**
	 * @param vehicleMkSerialNO the vehicleMkSerialNO to set
	 */
	public void setVehicleMkSerialNO(Integer vehicleMkSerialNO) {
		this.vehicleMkSerialNO = vehicleMkSerialNO;
	}

	/**
	 * @return the vehicleClassID
	 */
	public String getVehicleClassID() {
		return vehicleClassID;
	}

	/**
	 * @param vehicleClassID the vehicleClassID to set
	 */
	public void setVehicleClassID(String vehicleClassID) {
		this.vehicleClassID = vehicleClassID;
	}

	public Boolean getBsAllowed() {
		return bsAllowed;
	}

	public void setBsAllowed(Boolean bsAllowed) {
		this.bsAllowed = bsAllowed;
	}

	/**
	 * @return the ulw
	 */
	public String getUlw() {
		return ulw;
	}

	/**
	 * @param ulw the ulw to set
	 */
	public void setUlw(String ulw) {
		this.ulw = ulw;
	}

	/**
	 * @return the rlw
	 */
	public String getRlw() {
		return rlw;
	}

	/**
	 * @param rlw the rlw to set
	 */
	public void setRlw(String rlw) {
		this.rlw = rlw;
	}

	
}
