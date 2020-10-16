package org.epragati.master.dto;

import java.util.List;

import org.epragati.rta.vo.CollectionCorrectonSaveVO;

public class CcrResponseDetails {
	private	ClientMetaData clientMetaData;
	private CollectionDTO collection;
	private List<CollectionCorrectonSaveVO> modifiedFields;
	
	/**
	 * @return the modifiedFields
	 */
	public List<CollectionCorrectonSaveVO> getModifiedFields() {
		return modifiedFields;
	}
	/**
	 * @param modifiedFields the modifiedFields to set
	 */
	public void setModifiedFields(List<CollectionCorrectonSaveVO> modifiedFields) {
		this.modifiedFields = modifiedFields;
	}
	/**
	 * @return the clientMetaData
	 */
	public ClientMetaData getClientMetaData() {
		return clientMetaData;
	}
	/**
	 * @param clientMetaData the clientMetaData to set
	 */
	public void setClientMetaData(ClientMetaData clientMetaData) {
		this.clientMetaData = clientMetaData;
	}
	/**
	 * @return the collection
	 */
	public CollectionDTO getCollection() {
		return collection;
	}
	/**
	 * @param collection the collection to set
	 */
	public void setCollection(CollectionDTO collection) {
		this.collection = collection;
	}
}
