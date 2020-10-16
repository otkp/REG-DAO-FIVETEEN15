package org.epragati.common.dto;

import java.io.Serializable;
import java.util.HashMap;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author naga.pulaparthi
 *
 */
@Document(collection = "master_notification_template")
public class NotificationTemplateDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer templateId;
	private String name;
	private String template;
	private String desc;
	private Character status;
	private HashMap<String, HashMap<String, String>> configDetails;


	public Integer getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc
	 *            the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @return the status
	 */
	public Character getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Character status) {
		this.status = status;
	}

	/**
	 * @return the template
	 */
	public String getTemplate() {
		return template;
	}

	/**
	 * @param template the template to set
	 */
	public void setTemplate(String template) {
		this.template = template;
	}

	/**
	 * @return the configDetails
	 */
	public HashMap<String, HashMap<String, String>> getConfigDetails() {
		return configDetails;
	}

	/**
	 * @param configDetails the configDetails to set
	 */
	public void setConfigDetails(HashMap<String, HashMap<String, String>> configDetails) {
		this.configDetails = configDetails;
	}

}
