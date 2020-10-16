package org.epragati.ticket.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;

public interface IssueSequenceDAO extends BaseRepository<IssueSequenceDTO, Serializable>{
	
	IssueSequenceDTO findById(String id);
}
