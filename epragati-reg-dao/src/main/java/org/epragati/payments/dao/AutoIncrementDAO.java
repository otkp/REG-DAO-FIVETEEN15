package org.epragati.payments.dao;

public interface AutoIncrementDAO {

	/**
	 * To Get Office Code base Auto Increment Number
	 * 
	 * @param sequenceName
	 * @param from
	 * @param officeCode
	 * @param year
	 * @return
	 */
	public Long getNextNumber(String sequenceName, Long from, String officeCode, Integer year);
	
	/**
	 * To Get Office Code base Auto Increment Number
	 * 
	 * @param sequenceName
	 * @param from
	 * @param year
	 * @return
	 */
	public Long getNextNumber(String sequenceName, Long from, Integer year);


	/**
	 * To Get Office Code base Auto Increment Number
	 * 
	 * @param sequenceName
	 * @param from
	 * @param year
	 * @param incrementValue
	 * @return
	 */
	public Long getNextNumber(String sequenceName, Long from, Integer year, Long incrementValue);

	
	/**
	 * To Move Back to History
	 * 
	 * @param sequenceName
	 * 
	 */
	public void moveToHistory(String sequenceName);

	Long getNextNumber(String sequenceName, Long startNumber, Integer year, Integer month);
}
