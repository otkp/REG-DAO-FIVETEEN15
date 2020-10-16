package org.epragati.actions.dto;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Document(collection="collections_corrections")
public class CorrectionDTO {

	private String jsonPath;

	private String feildLabel;

	private String fieldValue;

	private String regExpression;

	private String dataType;

	private String fieldType;

	private String api;

	private List<CorrectionRoles> roles;

	private String applicationType;

	private Integer  serialNumber;

	private String mode;

	private Boolean status;

	private List<ReflectionCollectionDTO> reflectionCollection;
	
	private Boolean notify;
	
	//private String apiParam;
	
	private String onChange;
	
	private String valuePath;
	
	private String namePath;
	
	private List<CorrectionParamsDTO> apiParam;
	

	public Boolean getNotify() {
		return notify;
	}

	public void setNotify(Boolean notify) {
		this.notify = notify;
	}

	public String getOnChange() {
		return onChange;
	}

	public void setOnChange(String onChange) {
		this.onChange = onChange;
	}

	public String getValuePath() {
		return valuePath;
	}

	public void setValuePath(String valuePath) {
		this.valuePath = valuePath;
	}

	public String getNamePath() {
		return namePath;
	}

	public void setNamePath(String namePath) {
		this.namePath = namePath;
	}

	public List<CorrectionParamsDTO> getApiParam() {
		return apiParam;
	}

	public void setApiParam(List<CorrectionParamsDTO> apiParam) {
		this.apiParam = apiParam;
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
	 * @return the feildLabel
	 */
	public String getFeildLabel() {
		return feildLabel;
	}

	/**
	 * @param feildLabel the feildLabel to set
	 */
	public void setFeildLabel(String feildLabel) {
		this.feildLabel = feildLabel;
	}

	/**
	 * @return the fieldValue
	 */
	public String getFieldValue() {
		return fieldValue;
	}

	/**
	 * @param fieldValue the fieldValue to set
	 */
	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	/**
	 * @return the regExpression
	 */
	public String getRegExpression() {
		return regExpression;
	}

	/**
	 * @param regExpression the regExpression to set
	 */
	public void setRegExpression(String regExpression) {
		this.regExpression = regExpression;
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

	/**
	 * @return the fieldType
	 */
	public String getFieldType() {
		return fieldType;
	}

	/**
	 * @param fieldType the fieldType to set
	 */
	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	/**
	 * @return the api
	 */
	public String getApi() {
		return api;
	}

	/**
	 * @param api the api to set
	 */
	public void setApi(String api) {
		this.api = api;
	}

	/**
	 * @return the roles
	 */
	public List<CorrectionRoles> getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(List<CorrectionRoles> roles) {
		this.roles = roles;
	}

	/**
	 * @return the applicationType
	 */
	public String getApplicationType() {
		return applicationType;
	}

	/**
	 * @param applicationType the applicationType to set
	 */
	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	/**
	 * @return the serialNumber
	 */
	public Integer getSerialNumber() {
		return serialNumber;
	}

	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	
	/**
	 * @return the reflectionCollection
	 */
	public List<ReflectionCollectionDTO> getReflectionCollection() {
		return reflectionCollection;
	}

	/**
	 * @param reflectionCollection the reflectionCollection to set
	 */
	public void setReflectionCollection(List<ReflectionCollectionDTO> reflectionCollection) {
		this.reflectionCollection = reflectionCollection;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CorrectionDTO [jsonPath=" + jsonPath + ", feildLabel=" + feildLabel + ", fieldValue=" + fieldValue
				+ ", regExpression=" + regExpression + ", dataType=" + dataType + ", fieldType=" + fieldType + ", api="
				+ api + ", roles=" + roles + ", applicationType=" + applicationType + ", serialNumber=" + serialNumber
				+ ", mode=" + mode + ", status=" + status + ", reflectionCollection=" + reflectionCollection + "]";
	}

}
