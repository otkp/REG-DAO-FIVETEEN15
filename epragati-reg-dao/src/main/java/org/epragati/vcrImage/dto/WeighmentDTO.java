package org.epragati.vcrImage.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class WeighmentDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer ULW;
	private Integer GVW;
	private String weighmentSlipNo;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate weighmentDate;
	private String weighBridgeName;
	private Integer weighOnWeighmentSlip;
	private Integer excessLoad;
	private String goodsDescription;
	private String otherGoods;
	
	public Integer getULW() {
		return ULW;
	}
	public void setULW(Integer uLW) {
		ULW = uLW;
	}
	public Integer getGVW() {
		return GVW;
	}
	public void setGVW(Integer gVW) {
		GVW = gVW;
	}
	public String getWeighmentSlipNo() {
		return weighmentSlipNo;
	}
	public void setWeighmentSlipNo(String weighmentSlipNo) {
		this.weighmentSlipNo = weighmentSlipNo;
	}
	public LocalDate getWeighmentDate() {
		return weighmentDate;
	}
	public void setWeighmentDate(LocalDate weighmentDate) {
		this.weighmentDate = weighmentDate;
	}
	public String getWeighBridgeName() {
		return weighBridgeName;
	}
	public void setWeighBridgeName(String weighBridgeName) {
		this.weighBridgeName = weighBridgeName;
	}
	public Integer getWeighOnWeighmentSlip() {
		return weighOnWeighmentSlip;
	}
	public void setWeighOnWeighmentSlip(Integer weighOnWeighmentSlip) {
		this.weighOnWeighmentSlip = weighOnWeighmentSlip;
	}
	public Integer getExcessLoad() {
		return excessLoad;
	}
	public void setExcessLoad(Integer excessLoad) {
		this.excessLoad = excessLoad;
	}
	
	
	public String getGoodsDescription() {
		return goodsDescription;
	}
	public void setGoodsDescription(String goodsDescription) {
		this.goodsDescription = goodsDescription;
	}
	public String getOtherGoods() {
		return otherGoods;
	}
	public void setOtherGoods(String otherGoods) {
		this.otherGoods = otherGoods;
	}
	@Override
	public String toString() {
		return "WeighmentVO [ULW=" + ULW + ", GVW=" + GVW + ", weighmentSlipNo=" + weighmentSlipNo + ", weighmentDate="
				+ weighmentDate + ", weighBridgeName=" + weighBridgeName + ", weighOnWeighmentSlip="
				+ weighOnWeighmentSlip + ", excessLoad=" + excessLoad + "]";
	}
	
	
	

}
