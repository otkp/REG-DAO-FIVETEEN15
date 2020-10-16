package org.epragati.ticket.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;

public interface TicketSequnceDAO extends BaseRepository<TicketSequnceDTO, Serializable>{

	TicketSequnceDTO findByid(String id);
}
