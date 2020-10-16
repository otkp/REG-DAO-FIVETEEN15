package org.epragati.payment.dto;

import java.time.LocalDate;

import org.epragati.common.dto.BaseEntity;
import org.epragati.util.payment.GatewayTypeEnum;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "chalana_details")

/*
 * @CompoundIndexes(
 * 
 * @CompoundIndex(name="chalanaNo" , def = "{'chalanaNo':1}", unique = true) )
 */
public class ChalanaDetailsDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long chalanaNo;

	private String applicationNo;

	private GatewayTypeEnum gateWayType;

	private String module;

	private String amount;

	private LocalDate challanDate;

	private String challanNo;

	private String tresuryName;

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTresuryName() {
		return tresuryName;
	}

	public void setTresuryName(String tresuryName) {
		this.tresuryName = tresuryName;
	}

	public String getChallanNo() {
		return challanNo;
	}

	public void setChallanNo(String challanNo) {
		this.challanNo = challanNo;
	}

	public LocalDate getChallanDate() {
		return challanDate;
	}

	public void setChallanDate(LocalDate challanDate) {
		this.challanDate = challanDate;
	}

	/**
	 * @return the chalanaNo
	 */
	public Long getChalanaNo() {
		return chalanaNo;
	}

	/**
	 * @param chalanaNo the chalanaNo to set
	 */
	public void setChalanaNo(Long chalanaNo) {
		this.chalanaNo = chalanaNo;
	}

	/**
	 * @return the applicationNo
	 */
	public String getApplicationNo() {
		return applicationNo;
	}

	/**
	 * @param applicationNo the applicationNo to set
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	/**
	 * @return the gateWayType
	 */
	public GatewayTypeEnum getGateWayType() {
		return gateWayType;
	}

	/**
	 * @param gateWayType the gateWayType to set
	 */
	public void setGateWayType(GatewayTypeEnum gateWayType) {
		this.gateWayType = gateWayType;
	}

	/**
	 * @return the module
	 */
	public String getModule() {
		return module;
	}

	/**
	 * @param module the module to set
	 */
	public void setModule(String module) {
		this.module = module;
	}

	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

}
