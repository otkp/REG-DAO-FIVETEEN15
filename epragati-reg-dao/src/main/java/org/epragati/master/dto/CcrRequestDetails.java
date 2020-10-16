package org.epragati.master.dto;

import java.util.List;

import org.epragati.common.vo.CorrectionVO;

public class CcrRequestDetails {
private	ClientMetaData clientMetaData;
private CollectionDTO collection;
private List<CorrectionVO> requsetedFields;

/**
 * @return the requsetedFields
 */
public List<CorrectionVO> getRequsetedFields() {
	return requsetedFields;
}
/**
 * @param requsetedFields the requsetedFields to set
 */
public void setRequsetedFields(List<CorrectionVO> requsetedFields) {
	this.requsetedFields = requsetedFields;
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
