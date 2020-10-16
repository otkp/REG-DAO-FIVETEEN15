package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterVariantDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Repository
public interface MasterVariantDAO extends BaseRepository<MasterVariantDTO, Serializable> {

	
	/**
	 * 
	 * @param mid
	 * @param vehicleCovCode
	 * @return
	 */
	List<MasterVariantDTO> findByMidAndVehicleClassIDAndActiveTrueAndBsAllowedTrue(Integer mid, String vehicleCovCode);

	//List<MasterVariantDTO> findBymidInAndVehicleClassIDIn(List<Integer> mmIdList, List<String> covCode);

	List<MasterVariantDTO> findByMidInAndVehicleClassID(List<Integer> mmIdList, String cov);
	List<MasterVariantDTO> findByVehicleClassID(String cov);
	
    List<MasterVariantDTO> findBymid(Integer mId);
	
	Optional<MasterVariantDTO> findTop1ByOrderByVehicleMkSerialNODesc();
	

}
