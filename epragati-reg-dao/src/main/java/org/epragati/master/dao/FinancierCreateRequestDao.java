package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.FinancierCreateRequestDTO;

public interface FinancierCreateRequestDao extends BaseRepository<FinancierCreateRequestDTO, Serializable> {

	Optional<FinancierCreateRequestDTO> findByUserName(String username);

	Optional<FinancierCreateRequestDTO> findByUserId(String userId);

	Optional<FinancierCreateRequestDTO> findByUserIdAndUserRelation(String userId, String relation);

	Optional<FinancierCreateRequestDTO> findByUserIdAndStatus(Long userId, Boolean status);

	Optional<FinancierCreateRequestDTO> findByAadharNo(String aadharNo);

	/**
	 * find By Office OfficeCode And Application Status
	 * 
	 * @param officeOfficeCode
	 * @param applicationStatus
	 * @return
	 */
	List<FinancierCreateRequestDTO> findByOfficeOfficeCodeAndApplicationStatus(String officeCode,
			String applicationStatus);

	/**
	 * find By OfficeOffice Code And FinAppNo
	 * 
	 * @param officeCode
	 * @param financierApplicationNo
	 * @return
	 */
	Optional<FinancierCreateRequestDTO> findByOfficeOfficeCodeAndFinAppNo(String officeCode,
			String financierApplicationNo);

	/**
	 * find By financierApplicationNo
	 * 
	 * @param financierApplicationNo
	 * @return
	 */
	Optional<FinancierCreateRequestDTO> findByFinAppNo(String financierApplicationNo);
	Optional<FinancierCreateRequestDTO> findByFinancierPanNo(String panNo);


}