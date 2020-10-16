package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterTaxBased;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterTaxBasedDAO extends BaseRepository<MasterTaxBased, Serializable> {

	Optional<MasterTaxBased>findByCovcode(String covcode);
}
