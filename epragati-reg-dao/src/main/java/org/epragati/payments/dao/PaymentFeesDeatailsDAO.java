package org.epragati.payments.dao;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.epragati.common.dao.BaseRepository;
import org.epragati.payment.dto.FeesDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentFeesDeatailsDAO extends BaseRepository<FeesDTO, String> {

	List<FeesDTO> findByServiceId(Integer serviceId);

	List<FeesDTO> findByServiceIdIn(Set<Integer> serviceIds);

	List<FeesDTO> findByServiceIdInAndCovcodeIn(Set<Integer> serviceIds, Set<String> codeSet);

	List<FeesDTO> findByServiceIdInAndCovcodeInAndWeighttype(Integer aNumber, Set<String> codeSet, String weightType);

	Optional<FeesDTO> findByServiceIdInAndCovcodeInAndFeesType(Integer serviceIds, Set<String> codeSet,
			String serviceFee);

	// List<FeesDTO> findByServiceIdInAndFeeStatus(Set<Integer> serviceIds,
	// String feeStatus);

	List<FeesDTO> findByServiceIdInAndModuleCode(Set<Integer> serviceIds, String moduleCode);

	List<FeesDTO> findByServiceIdInAndCovcodeInAndWeighttypeAndPermitCode(Integer id, Set<String> codeSet,
			String weightType, String permitType);

	List<FeesDTO> findByServiceIdInAndCovcodeInAndWeighttypeAndPermitCodeAndSeatToGreaterThanEqualAndSeatFromLessThanEqual(
			Integer id, Set<String> codeSet, String weightType, String permitTypeCode, int parseInt, int parseInt2);

	List<FeesDTO> findByServiceIdInAndCovcodeInAndWeighttypeAndPermitCodeAndSeatToGreaterThanEqualAndSeatFromLessThanEqualAndFeesTypeIgnoreCase(
			Integer id, Set<String> codeSet, String weightType, String permitTypeCode, int parseInt, int parseInt2,
			String code);

	List<FeesDTO> findByServiceIdInAndCovcodeInAndWeighttypeAndPermitCodeAndFeesTypeIgnoreCase(Integer id,
			Set<String> codeSet, String weightType, String permitTypeCode, String code);

}
