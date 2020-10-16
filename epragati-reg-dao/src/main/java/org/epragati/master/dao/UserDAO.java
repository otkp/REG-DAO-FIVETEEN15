package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.common.vo.UserStatusEnum;
import org.epragati.master.dto.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;

public interface UserDAO extends BaseRepository<UserDTO, Serializable> {


	Optional<UserDTO> findByUserId(String userId);

	UserDTO findByAadharNo(String aadharNo);

	List<UserDTO> findByParentId(String id);
	
	Optional<UserDTO> findByUserIdAndParentId(String userId,String parentuserId);

	/**
	 * 
	 * @param dealerUserId
	 * @return
	 */
	UserDTO findByUserIdAndStatusTrue(String dealerUserId);

	Optional<UserDTO> findByUserIdAndOfficeOfficeCode(String userId, String officeCode);

	Optional<UserDTO> findByMobile(String mobile);
	Optional<UserDTO> findByMobileAndParentId(String mobile,String parentuserId);
 
	/**
	 * 
	 * @param uidToken
	 * @return
	 */
	Optional<UserDTO> findByUidToken(String uidToken);

	/**
	 * findUser using UidToken and primaryRole
	 * 
	 * @param uidToken
	 * @param primaryRole
	 * @return
	 */
	Optional<UserDTO> findByUidTokenAndPrimaryRoleName(String uidToken, String primaryRole);

	/**
	 * 
	 * @param parentId
	 * @return
	 */
	List<UserDTO> findAllByParentId(String parentId);

	/**
	 * find All By ParentId And Primary Role
	 * 
	 * @param loggedInUser
	 * @param primaryRole
	 * @param previousOrFirst
	 * @return
	 */
	Page<UserDTO> findByParentIdAndPrimaryRoleNameOrderByCreatedDateDesc(String loggedInUser, String primaryRole,
			Pageable previousOrFirst);

	Optional<UserDTO> findByUserIdAndIsAccountNonLockedTrue(String userId);

	Optional<UserDTO> findByUserIdAndIsAccountNonLockedFalse(String userId);

	Optional<UserDTO> findByUserNameAndMobile(String username, String mobile);

	List<UserDTO> findByOfficeOfficeCodeAndPrimaryRoleName(String officeCode, String role);

	Optional<UserDTO> findByUserIdAndPrimaryRoleName(String userId, String primaryRole);

	@Query(value = "{'$or':[ {'additionalRoles.name':?0}, {'primaryRole.name':?1} ] ,'office.officeCode':?2}", fields = "{'userId':1,'firstName':1,'middleName':1,'lastName':1}")
	List<UserDTO> findByPrimaryRoleNameOrAdditionalRolesNameAndOfficeOfficeCodeNative(String additionalRole,
			String primaryRole, String officeCodes);

	@Query(value = "{'userId':{ $in: ?0 }}", fields = "{'firstname':1,'userId':1,'lastName':1,'firstName':1}")
	List<UserDTO> nativefindUsers(List<String> userIds);

	Optional<UserDTO> findAllByAadharNo(String aadharNo);

	Optional<UserDTO> findAllByAadharNoAndUserId(String aadharNo, String userId);

	boolean existsByAadharNo(String aadharNo);
	
	Optional<UserDTO> findByUserIdAndUserStatus(String userId,UserStatusEnum name);

	List<UserDTO> findByOfficeOfficeCode(String officeCode);

	Optional<UserDTO> findByFirstNameIgnoreCase(String dealerName);

	List<UserDTO> findByOfficeOfficeCodeInAndPrimaryRoleName(List<String> officeCodesList, String name);

	Optional<UserDTO> findByFirstnameIgnoreCase(String dealerName);

	List<UserDTO> findByOfficeOfficeCodeInAndPrimaryRoleNameAndUserStatus(List<String> officeCodesList, String name,
			UserStatusEnum active);

	List<UserDTO> findByPrimaryRoleNameAndUserStatus(String name, UserStatusEnum active);

	Optional<UserDTO> findByUserIdAndUserStatusAndStatusTrue(String username, UserStatusEnum active);

	//Optional<UserDTO> findByUserIdAndOfficeOfficeCodeAndIsCardDispatchUserTrue(String userId, String officeCode);
	@Query(value = "{'$or':[ {'additionalRoles.name':?0}, {'primaryRole.name':?1} ] ,'office.officeCode':{ $in: ?2 }}", fields = "{'userId':1,'firstName':1,'middleName':1,'lastName':1}")
	List<UserDTO> findByPrimaryRoleNameOrAdditionalRolesNameAndOfficeOfficeCodeIn(String additionalRole,
			String primaryRole, List<String> officeCodes);
	
	
	@Query(value = "{'$or':[ {'additionalRoles.name':{ $in: ?0 }}, {'primaryRole.name':{ $in: ?1 }} ] ,'office.officeCode':?2}", fields = "{'userId':1,'firstName':1,'middleName':1,'lastName':1}")
	List<UserDTO> findByPrimaryRoleNameInOrAdditionalRolesNameInAndOfficeOfficeCodeNative(List<String> additionalRole,
			List<String> primaryRole, String officeCodes);
	
	@Query(value = "{'userId':{ $nin: ?0 },'office.officeCode':?1}", fields = "{'firstname':1,'userId':1,'lastName':1,'firstName':1}")
	List<UserDTO> findByUserIdAndOfficeCode(List<String> userIds,String officeCode);

	Page<UserDTO> findByOfficeOfficeCodeAndPrimaryRoleName(String officeCode, String primaryRoleName, Pageable page);

	List<UserDTO> findByOfficeOfficeCodeIn(String name, String name2, List<String> listOfOfficeCodes);

	List<UserDTO> findByOfficeOfficeCodeIn(List<String> listOfOfficeCodes);

	
	List<UserDTO> findByOfficeOfficeCodeInAndPrimaryRoleNameOrAdditionalRolesName(List<String> listOfOfficeCodes,
			String name, String name2);

	
	
	
	
	//Optional<UserDTO> findByOfficeOfficeCodeAndPrimaryRoleNameAndUserId(String officeCode,String role,String user);
}
