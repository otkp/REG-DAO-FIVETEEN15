package org.epragati.vcrImage.dto;

import java.io.Serializable;
import java.util.List;

public class InvoiceDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer ULW;
	private Integer GVW;
	private Integer excessLoad;
	private List<InvoiceArrayDTO> invoiceArray;
	private Integer totalInvoiceWeight;
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
	public Integer getExcessLoad() {
		return excessLoad;
	}
	public void setExcessLoad(Integer excessLoad) {
		this.excessLoad = excessLoad;
	}
	public List<InvoiceArrayDTO> getInvoiceArray() {
		return invoiceArray;
	}
	public void setInvoiceArray(List<InvoiceArrayDTO> invoiceArray) {
		this.invoiceArray = invoiceArray;
	}
	public Integer getTotalInvoiceWeight() {
		return totalInvoiceWeight;
	}
	public void setTotalInvoiceWeight(Integer totalInvoiceWeight) {
		this.totalInvoiceWeight = totalInvoiceWeight;
	}
	@Override
	public String toString() {
		return "InvoiceVO [ULW=" + ULW + ", GVW=" + GVW + ", excessLoad=" + excessLoad + ", invoiceArray="
				+ invoiceArray + ", totalInvoiceWeight=" + totalInvoiceWeight + "]";
	}
	
	

}
