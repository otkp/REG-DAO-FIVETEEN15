package org.epragati.master.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="master_amount_secound_covs")
public class MasterAmountSecoundCovsDTO extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private List<String> amountcovcode;
	private List<String> secondcovcode;
	private List<String> secondvehicleignorecovcode;
	private Float taxpercentinvoice;
	private Float secondvehiclepercent;
	
	

	/**
	 * @return the taxpercentinvoice
	 */
	public Float getTaxpercentinvoice() {
		return taxpercentinvoice;
	}
	/**
	 * @param taxpercentinvoice the taxpercentinvoice to set
	 */
	public void setTaxpercentinvoice(Float taxpercentinvoice) {
		this.taxpercentinvoice = taxpercentinvoice;
	}
	
	/**
	 * @return the secondvehiclepercent
	 */
	public Float getSecondvehiclepercent() {
		return secondvehiclepercent;
	}
	/**
	 * @param secondvehiclepercent the secondvehiclepercent to set
	 */
	public void setSecondvehiclepercent(Float secondvehiclepercent) {
		this.secondvehiclepercent = secondvehiclepercent;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the amountcovcode
	 */
	public List<String> getAmountcovcode() {
		return amountcovcode;
	}
	/**
	 * @param amountcovcode the amountcovcode to set
	 */
	public void setAmountcovcode(List<String> amountcovcode) {
		this.amountcovcode = amountcovcode;
	}
	/**
	 * @return the secondcovcode
	 */
	public List<String> getSecondcovcode() {
		return secondcovcode;
	}
	/**
	 * @param secondcovcode the secondcovcode to set
	 */
	public void setSecondcovcode(List<String> secondcovcode) {
		this.secondcovcode = secondcovcode;
	}
	/**
	 * @return the secondvehicleignorecovcode
	 */
	public List<String> getSecondvehicleignorecovcode() {
		return secondvehicleignorecovcode;
	}
	/**
	 * @param secondvehicleignorecovcode the secondvehicleignorecovcode to set
	 */
	public void setSecondvehicleignorecovcode(List<String> secondvehicleignorecovcode) {
		this.secondvehicleignorecovcode = secondvehicleignorecovcode;
	}
	
	
}
