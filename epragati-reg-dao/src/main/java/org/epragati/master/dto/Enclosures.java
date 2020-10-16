package org.epragati.master.dto;

import java.io.Serializable;
import java.util.List;

import org.epragati.master.vo.DealerRegVO;
import org.epragati.regservice.vo.RegServiceVO;
import org.epragati.service.enclosure.vo.DisplayEnclosures;

public class Enclosures implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<DisplayEnclosures> displayEnclosures;
	private RegServiceVO regServiceVO;
	/**
	 * @return the displayEnclosures
	 */
	public List<DisplayEnclosures> getDisplayEnclosures() {
		return displayEnclosures;
	}
	/**
	 * @param displayEnclosures the displayEnclosures to set
	 */
	public void setDisplayEnclosures(List<DisplayEnclosures> displayEnclosures) {
		this.displayEnclosures = displayEnclosures;
	}
	/**
	 * @return the regServiceVO
	 */
	public RegServiceVO getRegServiceVO() {
		return regServiceVO;
	}
	/**
	 * @param regServiceVO the regServiceVO to set
	 */
	public void setRegServiceVO(RegServiceVO regServiceVO) {
		this.regServiceVO = regServiceVO;
	}
	
	private DealerRegVO dealerRegVO;

	/**
	 * @return the dealerRegVO
	 */
	public DealerRegVO getDealerRegVO() {
		return dealerRegVO;
	}

	/**
	 * @param dealerRegVO the dealerRegVO to set
	 */
	public void setDealerRegVO(DealerRegVO dealerRegVO) {
		this.dealerRegVO = dealerRegVO;
	}

	
}
