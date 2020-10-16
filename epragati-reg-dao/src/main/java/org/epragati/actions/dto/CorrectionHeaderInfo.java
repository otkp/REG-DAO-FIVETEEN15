package org.epragati.actions.dto;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Document(collection="corrections_headers_info")
public class CorrectionHeaderInfo {

	
	private String headerName;
	
	private List<String> jsonPath;
	
	private Integer serialNo;
	
	private String module;

	/**
	 * @return the module
	 */
	public String getModule() {
		return module;
	}

	/**
	 * @param module the module to set
	 */
	public void setModule(String module) {
		this.module = module;
	}

	public String getHeaderName() {
		return headerName;
	}

	public void setHeaderName(String headerName) {
		this.headerName = headerName;
	}

	public List<String> getJsonPath() {
		return jsonPath;
	}

	public void setJsonPath(List<String> jsonPath) {
		this.jsonPath = jsonPath;
	}

	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}
}
