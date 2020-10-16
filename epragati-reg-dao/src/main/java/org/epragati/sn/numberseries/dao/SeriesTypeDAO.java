package org.epragati.sn.numberseries.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.sn.dto.SeriesTypeDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesTypeDAO extends BaseRepository<SeriesTypeDTO, Serializable> {

	List<SeriesTypeDTO>findBySeriesStatus(String seriesTypeStatus);
}
