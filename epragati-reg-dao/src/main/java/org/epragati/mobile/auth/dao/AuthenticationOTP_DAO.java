package org.epragati.mobile.auth.dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.mobile.auth.dto.AuthenticationOTP_DTO;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationOTP_DAO extends BaseRepository<AuthenticationOTP_DTO, Serializable> {

	Optional<AuthenticationOTP_DTO> findTopByAadharNoAndDeviceNoAndOtpTypeOrderByOtpGeneratedTimeDesc(String aadharNo,
			String deviceNo, String otptype);

	Optional<AuthenticationOTP_DTO> findTopByMobileNoAndDeviceNoAndOtpTypeOrderByOtpGeneratedTimeDesc(String mobileNo,
			String deviceNo, String name);
	
	List<AuthenticationOTP_DTO> findFirst11ByAadharNoAndDeviceNoAndOtpTypeAndOtpGeneratedTimeBetween(String aadharNo,
			String deviceNo, String name,LocalDateTime ldt,LocalDateTime ldt1);

}
