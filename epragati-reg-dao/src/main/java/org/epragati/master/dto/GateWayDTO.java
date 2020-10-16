package org.epragati.master.dto;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.epragati.util.payment.GatewayTypeEnum;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * 
 * @author pbattula
 *
 */

@Document(collection = "master_paymentgateway_details")
public class GateWayDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	
	private GatewayTypeEnum gateWayType;
	
	private Map<String,String> gatewayDetails;
	
	private Boolean status;

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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
	 * @return the gatewayDetails
	 */
	public Map<String, String> getGatewayDetails() {
		return gatewayDetails;
	}

	/**
	 * @param gatewayDetails the gatewayDetails to set
	 */
	public void setGatewayDetails(Map<String, String> gatewayDetails) {
		this.gatewayDetails = gatewayDetails;
	}

	}
