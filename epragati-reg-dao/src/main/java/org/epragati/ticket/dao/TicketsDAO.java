package org.epragati.ticket.dao;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.group;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.match;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.project;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.unwind;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketsDAO extends BaseRepository<TicketDTO, Serializable> {
	TicketDTO findByTicketNo(String ticketNo);

	List<TicketDTO> findByOfficeCodeAndCurrentRole(String officeCode, String currentRole);

	TicketDTO findFirstByOfficeCodeAndCurrentRoleOrderByCreatedDateAsc(String officeCode, String currentRole);

	Integer countByOfficeCodeAndCurrentIndexIn(String officeCode, List<Integer> index);

	TicketDTO findFirstByOfficeCodeAndCurrentIndexInOrderByCreatedDateAsc(String officeCode, List<Integer> index);
	
	

	default Aggregation adminLevelRaisedTicketCount(String officeCode) {
		Aggregation agg = newAggregation(match(Criteria.where("officeCode").is(officeCode)),
				group("firstCreatedRole").count().as("count"),
				project("count").and("firstCreatedRole").previousOperation());
		return agg;
	}

	default Aggregation pendingTicketsAdminLevel(String officeCode) {
		Aggregation agg = newAggregation(match(Criteria.where("officeCode").is(officeCode)),
				group("currentIndex").count().as("count"), project("count").and("currentIndex").previousOperation());
		return agg;
	}
	
	default Aggregation closedTicketSupportUser(String user,String status) {
		Aggregation agg = newAggregation(match(Criteria.where("closedBy").is(user).and("status").is(status)),
				group("module").count().as("count"), project("count").and("module").previousOperation());
		return agg;
	}
	
	default Aggregation adminLevelApprovedTicketCount(String officeCode, List<String> actionEnums) {
		Aggregation agg = newAggregation(unwind("updateActionRoles"),
				match(Criteria.where("officeCode").is(officeCode).and("updateActionRoles.actionStatus")
						.in(actionEnums)),
				group("updateActionRoles.actionStatus").count().as("count"),
				project("count").and("approvedLevels").previousOperation());
		return agg;
	}
	
	Long countByOfficeCodeAndStatus(String officeCode,String status);
	//districtLevlReports
	Long countByCurrentIndexAndDistrictId(Integer index, Integer disId);
	
	Long countByCurrentIndexAndDistrictIdAndModule(int index,int districtId,String module);
	
	
    //dealerorFinancierLevelReports
	Long countByOfficeCodeAndFirstCreatedRoleAndFirstCreatedUser(String officeCode, String role, String user);

	Long countByOfficeCodeAndFirstCreatedRoleAndFirstCreatedUserAndCurrentIndexIn(String officeCode, String role,
			String user, List<Integer> indexvalues);

	Long countByOfficeCodeAndFirstCreatedRoleAndFirstCreatedUserAndCurrentIndex(String officeCode, String role,
			String user, int indexvalues);
	

	List<TicketDTO> findByOfficeCodeAndFirstCreatedUserAndStatus(String officeCode, String userId,String status);
	
	List<TicketDTO> findByOfficeCodeAndStatus(String officeCode,String status);
	
	Long countByOfficeCodeAndStatusAndClosedBy(String officeCode, String status, String user);
	
	Long countByOfficeCodeAndStatusAndClosedByAndModule(String officeCode, String status, String user,String module);
	
	Optional<TicketDTO> findByCurrentIndexAndModuleInAndDistrictIdInOrderByCreatedDateAsc(int index,List<String> modules,List<Integer> districtIds);
	
	Long  countByCurrentIndexAndModuleInAndDistrictIdIn(int index,List<String> modules,List<Integer> districtIds);

	Optional<TicketDTO> findByCurrentIndexAndModuleInAndDistrictIdInAndLockedDetailsUserOrderByCreatedDateAsc(int index,List<String> modules,List<Integer> districtIds,String user);
	
	Optional<TicketDTO> findByCurrentIndexAndModuleInAndDistrictIdInAndIsTicketLockedOrderByCreatedDateAsc(int index,List<String> modules,List<Integer> districtIds,Boolean status);
	
	List<TicketDTO> findByDistrictIdAndIsTicketLocked(int districtId,Boolean status);
	
	Long countByDistrictIdAndIsTicketLocked(int districtId,Boolean status);
	
	@Query(value = "{'ticketAssignedDTO.assignedTo':?0}")
	List<TicketDTO> findByTicketAssignedDTOAssignedTo(String user);
	
	@Query(value = "{'ticketAssignedDTO.assignedTo':?0}")
	TicketDTO findByTicketAssignedDTOAssignedToOrderByCreatedDateAsc(String user);
	
	TicketDTO findByTicketNoAndFirstCreatedRole(String ticketNo,String role);

	Optional<TicketDTO> findByCurrentIndexInAndModuleAndDistrictIdInOrderByCreatedDateAsc(List<Integer>index, String module,
			List<Integer> districtIds);
	
	Long countByCurrentIndexInAndModuleAndDistrictIdIn(List<Integer> index, String module, List<Integer> districtIds);
	
}