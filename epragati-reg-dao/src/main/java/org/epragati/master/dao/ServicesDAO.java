package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.ServicesDTO;

public interface ServicesDAO extends BaseRepository<ServicesDTO, Serializable>{
	List<ServicesDTO> findByStatusIsTrueAndAadharOtpStatusIsTrue();

	}
