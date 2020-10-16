package org.epragati.mobile.auth.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.mobile.auth.dto.CitizenAppAuthenticationDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface CitizenAppAuthenticationDAO extends BaseRepository<CitizenAppAuthenticationDTO, Serializable> {

	Optional<CitizenAppAuthenticationDTO> findByDeviceNoAndStatus(String deviceNo,String description);
	
	Optional<CitizenAppAuthenticationDTO>findByMobileNoAndStatus(String mobileNo,String description);

	Optional<CitizenAppAuthenticationDTO> findByMobileNoAndDeviceNoAndAadharNoAndStatus(String mobileNo,
			String deviceNo, String aadharNo, String description);

	Optional<CitizenAppAuthenticationDTO> findByAadharNoAndDeviceNoAndStatus(String aadharNo, String deviceNo,
			String description);

	Optional<CitizenAppAuthenticationDTO> findByMobileNoAndDeviceNoAndStatus(String mobileNo, String deviceNo,
			String description);
	
	Optional<CitizenAppAuthenticationDTO>findByAadharNoAndStatus(String aadharNo,String description);
}
