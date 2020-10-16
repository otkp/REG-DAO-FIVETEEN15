package org.epragati.vcrImage.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.vcrImage.dto.MasterPenalSectionsDTO;

public interface MasterPenalSectionsDAO extends BaseRepository<MasterPenalSectionsDTO, Serializable>{

	List<MasterPenalSectionsDTO> findByStatusTrue();
}
