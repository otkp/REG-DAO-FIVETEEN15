/**
 *
 * @author krishnarjun.pampana
 *
 */
package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterUsersDTO;
import org.epragati.util.RoleEnum;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterUsersDAO extends BaseRepository<MasterUsersDTO, Serializable> {
	/**
	 * 
	 * @param userId
	 * @return
	 */
	MasterUsersDTO findByUserIdAndStatusTrue(String userId);

	MasterUsersDTO findByUserId(String userId);

	
	List<MasterUsersDTO> findByOfficeOfficeCodeAndPrimaryRoleNameOrOfficeOfficeCodeAndAdditionalRoles(String officeCode,
			String role, String officeCode2, String role2);

	List<MasterUsersDTO> findByUserIdIn(List<String> setOfDealer);

	//List<MasterUsersDTO> findByPrimaryRoleNameOrAdditionalRoles(String selectedRole);
	
	@Query(value = "{'office.officeCode':{$in:?0} ,'primaryRole.name':?1})", fields = "{'userId':1}")
	List<MasterUsersDTO> findByOfficeOfficeCodeInAndPrimaryRoleName(List<String> officeCode,
			String role);

	List<MasterUsersDTO> findByOfficeOfficeCodeInAndPrimaryRoleNameOrOfficeOfficeCodeInAndAdditionalRoles(
			List<String> listofAllOfficesinDist, RoleEnum mvi, List<String> listofAllOfficesinDist2, RoleEnum mvi2);

	
}
