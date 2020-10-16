package org.epragati.master.dto;

import java.util.List;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
public class CorrectionPathsDTO {
	
	private List<String> jsonPaths;
	
	private Object obj;

	public List<String> getJsonPaths() {
		return jsonPaths;
	}

	public void setJsonPaths(List<String> jsonPaths) {
		this.jsonPaths = jsonPaths;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	

}
