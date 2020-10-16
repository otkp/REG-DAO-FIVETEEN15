package org.epragati.master.dto;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author krishnarjun.pampana
 *
 */

@Document(collection = "fc_correction_log")
public class FcCorrectionLogDTO extends CollectionCorrectionServiceLogsDTO {

}
