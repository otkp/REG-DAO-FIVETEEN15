package org.epragati.common.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dto.NotificationTemplateDTO;

/**
 * 
 * @author naga.pulaparthi
 *
 */
public interface NotificationTemplateDAO extends BaseRepository<NotificationTemplateDTO, Serializable>{
	Optional<NotificationTemplateDTO> findBytemplateId(Integer templateId);
}
