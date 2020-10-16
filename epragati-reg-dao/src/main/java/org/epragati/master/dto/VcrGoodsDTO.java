package org.epragati.master.dto;

import java.io.Serializable;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_vcr_goods")
public class VcrGoodsDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3530447516555121406L;
	@Id
	private int id;
	private String goodsDesc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGoodsDesc() {
		return goodsDesc;
	}

	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

}
