package org.epragati.reports.excel;

import java.io.Serializable;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reports_name_and_field_order")
public class ReportNameAndFieldOrderDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
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
