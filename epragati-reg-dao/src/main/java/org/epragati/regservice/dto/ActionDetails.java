package org.epragati.regservice.dto;

import org.epragati.master.dto.ActionDetailsLogDTO;

public class ActionDetails extends ActionDetailsLogDTO{
	
	public ActionDetails(String role, String module, Integer currentItegeration, Boolean isDoneProcess,Integer nextIndex,
			Integer index) {
		super(role,module,currentItegeration,isDoneProcess,nextIndex,index);
	}

	public ActionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
