package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.EnclosuresDTO;
import org.epragati.util.ApplicantTypeEnum;
import org.springframework.stereotype.Repository;

/**
 *
 * @author saroj.sahoo
 *
 */
@Repository
public interface EnclosuresDAO extends BaseRepository<EnclosuresDTO, Serializable> {

	/**
	 * Find all UserEnclosure
	 * 
	 * @return
	 */
	@Override
	public List<EnclosuresDTO> findAll();

	/**
	 * Find UserEnclosure Based On enid
	 * 
	 * @param enid
	 * @return
	 */
	public Optional<EnclosuresDTO> findByenclosureId(Integer enclosureId);

	List<EnclosuresDTO> findByServiceID(Integer serviceID);

	List<EnclosuresDTO> findByServiceIDIn(Set<Integer> serviceID);

	List<EnclosuresDTO> findByServiceIDAndSlNoIn(Integer serviceId, List<Integer> slNos);

	List<EnclosuresDTO> findByclassOfVehicleAndEnclosureIdIn(String cov, List<Integer> slNos);
	
	List<EnclosuresDTO> findByServiceIDAndApplicantType(Integer serviceID,ApplicantTypeEnum applicantType);
	
	List<EnclosuresDTO> findByServiceIDInAndApplicantType(Set<Integer> serviceID,ApplicantTypeEnum applicantType);
	
	List<EnclosuresDTO> findByclassOfVehicle(String cov);

	public List<EnclosuresDTO> findByServiceIDInAndApplicantTypeIn(Set<Integer> serviceIds,
			List<ApplicantTypeEnum> listOfApplicantTypes);
	
	List<EnclosuresDTO>  findByServiceIDInAndIsRequiredTrue(Set<Integer> serviceID);
}
