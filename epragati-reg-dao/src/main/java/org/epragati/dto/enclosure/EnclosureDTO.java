/**
 * 
 */
package org.epragati.dto.enclosure;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author naga.pulaparthi
 *
 */
@Document(collection ="enclosures")
public class EnclosureDTO extends BaseEntity{
	
	@Id
	private String imageId;
	
	private byte[] imageContent;
	
	private String status;

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public byte[] getImageContent() {
		return imageContent;
	}

	public void setImageContent(byte[] imageContent) {
		this.imageContent = imageContent;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
