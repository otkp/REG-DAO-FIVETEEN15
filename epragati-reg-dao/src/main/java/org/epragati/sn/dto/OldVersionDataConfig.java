package org.epragati.sn.dto;

public class OldVersionDataConfig {
	
	private String migrationSource;
	private Long bidMaxAllowDays;
	/**
	 * @return the migrationSource
	 */
	public String getMigrationSource() {
		return migrationSource;
	}
	/**
	 * @param migrationSource the migrationSource to set
	 */
	public void setMigrationSource(String migrationSource) {
		this.migrationSource = migrationSource;
	}
	/**
	 * @return the bidMaxAllowDays
	 */
	public Long getBidMaxAllowDays() {
		return bidMaxAllowDays;
	}
	/**
	 * @param bidMaxAllowDays the bidMaxAllowDays to set
	 */
	public void setBidMaxAllowDays(Long bidMaxAllowDays) {
		this.bidMaxAllowDays = bidMaxAllowDays;
	}
	

}
