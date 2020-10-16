package org.epragati.master.dto;

import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.regservice.dto.ActionDetails;

public class DealerActionDetailsLog extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<ActionDetails> actionDetails;

	private Integer iterationCount;

	/**
	 * @return the actionDetails
	 */
	public List<ActionDetails> getActionDetails() {
		return actionDetails;
	}

	/**
	 * @param actionDetails the actionDetails to set
	 */
	public void setActionDetails(List<ActionDetails> actionDetails) {
		this.actionDetails = actionDetails;
	}

	/**
	 * @return the iterationCount
	 */
	public Integer getIterationCount() {
		return iterationCount;
	}

	/**
	 * @param iterationCount the iterationCount to set
	 */
	public void setIterationCount(Integer iterationCount) {
		this.iterationCount = iterationCount;
	}

}
