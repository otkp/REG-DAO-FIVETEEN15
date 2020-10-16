package org.epragati.actions.dto;

/**
 * 
 * @author krishnarjun.pampana
 *
 */

public class ReflectionCollectionDTO {

	private String collectionName;
	
	private String jsonPath;
	
	private String dataType;

	/**
	 * @return the collectionName
	 */
	public String getCollectionName() {
		return collectionName;
	}

	/**
	 * @param collectionName the collectionName to set
	 */
	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}

	/**
	 * @return the jsonPath
	 */
	public String getJsonPath() {
		return jsonPath;
	}

	/**
	 * @param jsonPath the jsonPath to set
	 */
	public void setJsonPath(String jsonPath) {
		this.jsonPath = jsonPath;
	}

	/**
	 * @return the dataType
	 */
	public String getDataType() {
		return dataType;
	}

	/**
	 * @param dataType the dataType to set
	 */
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ReflectionCollection [collectionName=" + collectionName + ", jsonPath=" + jsonPath + ", dataType="
				+ dataType + "]";
	}
	
}
