package org.epragati.reports.dto;

import java.util.List;
import java.util.Map;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reports_role_config")
public class ReportsRoleConfigDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String type;

	private Map<String, List<String>> reportAccessBy;

	/**
	 * @return the reportAccessBy
	 */
	public Map<String, List<String>> getReportAccessBy() {
		return reportAccessBy;
	}

	/**
	 * @param reportAccessBy
	 *            the reportAccessBy to set
	 */
	public void setReportAccessBy(Map<String, List<String>> reportAccessBy) {
		this.reportAccessBy = reportAccessBy;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}
