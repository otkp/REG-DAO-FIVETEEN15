package org.epragati.master.dto;

import java.util.List;

public class AutomationCovsDTO {

	private List<String> autoBasedOnConditionCovs;
	
	private List<String> automationNotRequiredCovs;

	public List<String> getAutoBasedOnConditionCovs() {
		return autoBasedOnConditionCovs;
	}

	public void setAutoBasedOnConditionCovs(List<String> autoBasedOnConditionCovs) {
		this.autoBasedOnConditionCovs = autoBasedOnConditionCovs;
	}

	public List<String> getAutomationNotRequiredCovs() {
		return automationNotRequiredCovs;
	}

	public void setAutomationNotRequiredCovs(List<String> automationNotRequiredCovs) {
		this.automationNotRequiredCovs = automationNotRequiredCovs;
	}
}
