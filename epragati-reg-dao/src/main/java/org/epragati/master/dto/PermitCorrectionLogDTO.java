package org.epragati.master.dto;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author krishnarjun.pampana
 *
 */

@Document(collection = "permit_correction_log")
public class PermitCorrectionLogDTO extends CollectionCorrectionServiceLogsDTO{

}
