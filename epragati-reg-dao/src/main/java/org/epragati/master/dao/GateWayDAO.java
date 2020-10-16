package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.GateWayDTO;
import org.epragati.util.payment.GatewayTypeEnum;

/**
 * 
 * @author pbattula
 *
 */

public interface GateWayDAO extends BaseRepository<GateWayDTO, Serializable> {

	GateWayDTO findByGateWayType(GatewayTypeEnum gatewayTypeEnum);

	/**
	 * 
	 * @return
	 */
	List<GateWayDTO> findByStatusTrue();

	Optional<GateWayDTO> findByGateWayTypeAndStatusTrue(GatewayTypeEnum payGatewayTypeEnum);

	// GateWayDTO findByGateWayTypeAndId(GatewayTypeEnum gatewayTypeEnum,Integer
	// id);

}
