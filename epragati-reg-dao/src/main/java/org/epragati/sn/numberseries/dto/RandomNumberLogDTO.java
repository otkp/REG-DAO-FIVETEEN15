package org.epragati.sn.numberseries.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Document(collection = "random_number_log")
public class RandomNumberLogDTO extends BaseEntity {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PRNumberSeriesConfigDTO previousSeries;
	
	public PRNumberSeriesConfigDTO getPreviousSeries() {
		return previousSeries;
	}
	public void setPreviousSeries(PRNumberSeriesConfigDTO previousSeries) {
		this.previousSeries = previousSeries;
	}
	
	
	
}
