package org.epragati.payment.dto;

import java.io.Serializable;

import org.epragati.util.payment.GatewayTypeEnum;

public class PaymentGatewayTypeDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private GatewayTypeEnum gatewayTypeEnum;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public GatewayTypeEnum getGatewayTypeEnum() {
		return gatewayTypeEnum;
	}
	public void setGatewayTypeEnum(GatewayTypeEnum gatewayTypeEnum) {
		this.gatewayTypeEnum = gatewayTypeEnum;
	}
	
	

}
