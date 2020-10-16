package org.epragati.cfst.vcr.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.VcrOffencesIllicitsDTO;

public interface VcrOffencesAndIllicitsDAO  extends BaseRepository<VcrOffencesIllicitsDTO, Serializable>{

	Optional<VcrOffencesIllicitsDTO> findByTemplateId(Integer templateId);
	
	List<VcrOffencesIllicitsDTO> findAll();
} 
