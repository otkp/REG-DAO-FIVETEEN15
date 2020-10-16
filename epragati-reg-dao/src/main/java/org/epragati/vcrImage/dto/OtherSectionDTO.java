package org.epragati.vcrImage.dto;

import java.io.Serializable;
import java.util.List;

import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.util.document.KeyValue;


public class OtherSectionDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String mviRemark;	
	private List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures;	
	
	public String getMviRemark() {
		return mviRemark;
	}
	public void setMviRemark(String mviRemark) {
		this.mviRemark = mviRemark;
	}
	public List<KeyValue<String, List<ImageEnclosureDTO>>> getEnclosures() {
		return enclosures;
	}
	public void setEnclosures(List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures) {
		this.enclosures = enclosures;
	}
	
	

}
