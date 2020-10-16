package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.SequenceDTO;

public interface SequenceDAO extends BaseRepository<SequenceDTO, Serializable> {

	public SequenceDTO findBySeqNameAndOfficeCode(String SeqName,String OfficeCode);

}
