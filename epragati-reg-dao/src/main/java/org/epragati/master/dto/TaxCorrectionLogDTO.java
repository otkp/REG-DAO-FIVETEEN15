package org.epragati.master.dto;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author krishnarjun.pampana
 *
 */

@Document(collection = "tax_correction_log")
public class TaxCorrectionLogDTO extends CollectionCorrectionServiceLogsDTO {

}
