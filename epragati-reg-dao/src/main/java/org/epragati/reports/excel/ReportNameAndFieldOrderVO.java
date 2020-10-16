package org.epragati.reports.excel;

import java.io.Serializable;
import java.util.Map;

public class ReportNameAndFieldOrderVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String reportName;
	private Map<String, String> columnOrderAndName;

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public Map<String, String> getColumnOrderAndName() {
		return columnOrderAndName;
	}

	public void setColumnOrderAndName(Map<String, String> columnOrderAndName) {
		this.columnOrderAndName = columnOrderAndName;
	}

}
