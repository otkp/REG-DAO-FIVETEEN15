package org.epragati.master.dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.RegistrationDetailsDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Repository
public interface RegistrationCardPrintDAO extends BaseRepository<RegistrationDetailsDTO, Serializable> {

	/**
	 * 
	 * @param prNo
	 * @param officeCode
	 * @param string
	 * @return
	 */
	List<RegistrationDetailsDTO> findFirst10ByPrNoAndOfficeDetailsOfficeCodeAndVehicleType(String prNo,
			String officeCode, String vehicleType);

	/**
	 * 
	 * @param officeCode
	 * @param fromTime
	 * @param toTime
	 * @param vehicleType
	 * @return
	 */
	List<RegistrationDetailsDTO> findByOfficeDetailsOfficeCodeAndLUpdateBetweenAndVehicleTypeAndIsCardPrintedFalse(
			String officeCode, LocalDateTime fromTime, LocalDateTime toTime, String vehicleType);
	
	/**
	 * 
	 * @param officeCode
	 * @param fromTime
	 * @param toTime
	 * @param vehicleType
	 * @return
	 */
	
	List<RegistrationDetailsDTO> findByOfficeDetailsOfficeCodeAndLUpdateBetweenAndVehicleTypeAndIsCardPrintedTrue(
			String officeCode, LocalDateTime fromTime, LocalDateTime toTime, String vehicleType);

}
