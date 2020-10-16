package org.epragati.sn.numberseries.dto;

import org.epragati.common.dto.BaseEntity;
import org.epragati.util.RecordStatus;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pr_prime_numbers")
@CompoundIndexes({ 
	@CompoundIndex(name = "primeNumber_and_primeStatus", def = "{'primeNumber': 1, 'primeStatus': 1}")
})
public class PremiumNumbersDTO extends BaseEntity {

	private static final long serialVersionUID = 8904698960672060582L;

	@Id
	private String primeId;

	private Integer primeNumber;

	private Double cost;

	private RecordStatus primeStatus;

	public String getPrimeId() {
		return primeId;
	}

	public void setPrimeId(String primeId) {
		this.primeId = primeId;
	}

	public Integer getPrimeNumber() {
		return primeNumber;
	}

	public void setPrimeNumber(Integer primeNumber) {
		this.primeNumber = primeNumber;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public RecordStatus getPrimeStatus() {
		return primeStatus;
	}

	public void setPrimeStatus(RecordStatus primeStatus) {
		this.primeStatus = primeStatus;
	}

}
