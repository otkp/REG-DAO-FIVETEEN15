package org.epragati.master.dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.regservice.dto.RegServiceReportDTO;
import org.epragati.util.payment.ServiceEnum;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface RegServiceReportDAO extends BaseRepository<RegServiceReportDTO, Serializable> {

	Integer countByActionRoleNameAndActionUserNameAndActionStatusInAndOfficeCodeAndActionTimeBetween(String role,
			String userName, List<String> status, String officeCode, LocalDateTime fromDate, LocalDateTime toDate);

	List<RegServiceReportDTO> findByActionRoleNameAndActionUserNameAndActionStatusInAndOfficeCodeAndActionTimeBetween(
			String role, String userName, List<String> status, String officeCode, LocalDateTime fromDate,
			LocalDateTime toDate, Pageable page);

	List<RegServiceReportDTO> findByActionRoleNameAndActionUserNameAndOfficeCodeAndActionStatusInAndCitizenServicesNamesAndActionTimeBetween(
			String role, String userName, String officeCode, List<String> status, String serviceName,
			LocalDateTime fromDate, LocalDateTime toDate, Pageable page);

	Integer countByActionRoleNameAndActionUserNameAndOfficeCodeAndActionStatusInAndCitizenServicesNamesAndActionTimeBetween(
			String role, String userName, String officeCode, List<String> status, String serviceName,
			LocalDateTime fromDate, LocalDateTime toDate);

	List<RegServiceReportDTO> findByActionUserNameAndActionStatusInAndCitizenServicesNamesInAndActionTimeBetween(
			String actionUserName, List<String> asList, List<ServiceEnum> services, LocalDateTime fromDate,
			LocalDateTime toDate);

	List<RegServiceReportDTO> findByActionRoleNameAndActionUserNameAndActionStatusInAndOfficeCodeAndActionTimeBetween(
			String role, String userName, List<String> statusList, String officeCode, LocalDate fromDate,
			LocalDate toDate);

	List<RegServiceReportDTO> findByActionRoleNameAndActionUserNameAndOfficeCodeAndActionStatusInAndCitizenServicesNamesAndActionTimeBetween(
			String selectedRole, String userName, String officeCode, List<String> statusList, String serviceName,
			LocalDate fromDate, LocalDate toDate);

}
