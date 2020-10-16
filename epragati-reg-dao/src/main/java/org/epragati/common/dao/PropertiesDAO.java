package org.epragati.common.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dto.PropertiesDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertiesDAO extends BaseRepository<PropertiesDTO, Serializable> {

	Optional<PropertiesDTO> findByStatusTrue();

	Optional<PropertiesDTO> findByModule(String module);

	Optional<PropertiesDTO> findByCovsInAndPermitCodeTrue(String cov);

	Optional<PropertiesDTO> findByTaxExceptionPermitCodeIn(String cov);

	Optional<PropertiesDTO> findByModuleAndTaxAmountToGreaterThanEqualAndTaxAmountFromLessThanEqual(String module,
			Long taxAmountFrom, Long taxAmountTo);

	Optional<PropertiesDTO> findByDlUrlsStatusTrue();

	Optional<PropertiesDTO> findByWeightAltTrue();

	Optional<PropertiesDTO> findByCovsInAndObtTaxTrue(String cov);

	Optional<PropertiesDTO> findByFuelTypeStatusTrue();

	Optional<PropertiesDTO> findByBiLateralTaxCovsTrue();

	Optional<PropertiesDTO> findByPermitCodeTrue();

	Optional<PropertiesDTO> findByNocAutoApprovalStatusTrue();

	Optional<PropertiesDTO> findByTaxFromDroolsTrue();

	Optional<PropertiesDTO> findByAllowQuaterTaxTrue();

	Optional<PropertiesDTO> findByIsEmailMissingTrue();

	Optional<PropertiesDTO> findByDevopsTestTokenAndAuthorizationAllowedTrue(String authToken);

	Optional<PropertiesDTO> findByIsQueryExecutorEnabledTrue();

	Optional<PropertiesDTO> findByEnableTowConditionsTrue();

	Optional<PropertiesDTO> findBySkipAadharForTaxTrue();

	Optional<PropertiesDTO> findByCovAndPlayedAsCovAndSeattoGreaterThanEqualAndSeatfromLessThanEqualAndVcrTaxTrue(
			String cov, String playedAsCov, Integer seatto, Integer Seatfrom);

	Optional<PropertiesDTO> findByRoleType(String roleType);

	Optional<PropertiesDTO> findByPayperiodAndVoluntaryPayPeriodTrue(String payperiod);

	Optional<PropertiesDTO> findByVoluntaryPayPeriodTrue();

	Optional<PropertiesDTO> findByRoleTypeAndCorrectionStatusTrueAndCorrectionModule(String roleType, String module);

	PropertiesDTO findByCardReturnReasonsExistsTrue();

	Optional<PropertiesDTO> findByOtherStateQutTaxCovsInAndOtherStateQutTaxCovsflagTrue(String otherStateQutTaxCovs);

	Optional<PropertiesDTO> findByOtherStateAitpTaxTrue();

	Optional<PropertiesDTO> findByStoppageDaysStatusTrue();

	Optional<PropertiesDTO> findByIsCollectionCorrectionTrue();

	Optional<PropertiesDTO> findByDepartmentRolesRolesStatusRoleNameAndDepartmentRolesRolesStatusStatusTrue(
			String roleName);

	// @Query(value = "{'eodReportsStatus': True, 'roleType' : ?0
	// ,'servicesDropDown.status': True })", fields =
	// "{'servicesDropDown.serviceType':1}")
	Optional<PropertiesDTO> findByEodReportsStatusTrueAndRoleTypeAndServicesDropDownStatusTrue(String roleType);

	// @Query(value = "{'eodReportsStatus': True, 'roleType' : ?0
	// ,'citizenServices.status': True})", fields =
	// "{'citizenServices.serviceType':1}")
	Optional<PropertiesDTO> findByEodReportsStatusTrueAndRoleTypeAndCitizenServicesStatusTrue(String roleType);

	Optional<PropertiesDTO> findByEodReportsRolesStatusTrueAndRolesStatusTrue();
	
    Optional<PropertiesDTO> findByEodReportsStatusTrueAndRoleTypeAndModuleCodeStatusTrue(String roleType);
	
	
	Optional<PropertiesDTO> findByEodReportsStatusTrueAndRoleTypeAndDlCitizenServicesStatusTrue(String roleType);

	Optional<PropertiesDTO> findByReportType(String string);

	Optional<PropertiesDTO> findByDeemandApprovalForNewRegTrue();
	
	
	Optional<PropertiesDTO> findByDeemandApprovalForRegServiceTrue();
	
	Optional<PropertiesDTO> findByArvtWeightFlagTrue();
	
	Optional<PropertiesDTO> findByRoleTypeAndVehicleTypesStatusTrue(String roleType);
	
	Optional<PropertiesDTO> findByServiceName(String name);
	
	Optional<PropertiesDTO> findByAllowNextQuarterTaxCovsInAndAllowNextQuarterTaxTrue(String cov);
	
	Optional<PropertiesDTO> findByReportName(String name);
	
	Optional<PropertiesDTO> findByAllowFcImagesTrue();
	
	Optional<PropertiesDTO> findByImageType(String name);
	
	Optional<PropertiesDTO> findByisFcLockDownTrue();

	Optional<PropertiesDTO> findByIsWithoutAadharTrue();

}
