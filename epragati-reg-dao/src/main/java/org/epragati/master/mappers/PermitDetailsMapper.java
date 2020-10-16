package org.epragati.master.mappers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.permits.dto.PermitDetailsDTO;
import org.epragati.permits.mappers.PermitValidityDetailsMapper;
import org.epragati.permits.mappers.RouteDetailsMapper;
import org.epragati.permits.vo.PermitDetailsVO;
import org.epragati.permits.vo.PermitRouteDetailsVO;
import org.epragati.permits.vo.PermitTypeVO;
import org.epragati.permits.vo.PermitValidityDetailsVO;
import org.epragati.permits.vo.RouteDetailsVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PermitDetailsMapper extends BaseMapper<PermitDetailsDTO, PermitDetailsVO> {

	@Autowired
	private PermitClassMapper permitClassMapper;

	@Autowired
	private PermitTypeMapper permitTypeMapper;

	@Autowired
	private PermitGoodsDetailsMapper permitGoodsDetailsMapper;

	@Autowired
	private PermitValidityDetailsMapper permitValidityDetailsMapper;

	@Autowired
	private RouteDetailsMapper routeDetailsMapper;

	@Autowired
	private STCTvehcleDetailsMapper sTCTvehcleDetailsMapper;

	@Override
	public PermitDetailsVO convertEntity(PermitDetailsDTO dto) {
		PermitDetailsVO vo = new PermitDetailsVO();
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getPrNo(), vo::setPrNo);
		funPoint(dto.getPermitNo(), vo::setPermitNo);
		if (dto.getPermitClass() != null) {
			vo.setPermitClass(permitClassMapper.convertEntity(dto.getPermitClass()));
		}
		if (dto.getPermitType() != null) {
			vo.setPermitType(permitTypeMapper.convertEntity(dto.getPermitType()));
		}
		if (dto.getGoodsDetails() != null) {
			vo.setGoodDetails(permitGoodsDetailsMapper.convertEntity(dto.getGoodsDetails()));
		}
		if (dto.getPermitValidityDetails() != null) {
			vo.setPermitValidityDetailsVO(permitValidityDetailsMapper.convertEntity(dto.getPermitValidityDetails()));
		}
		if (dto.getRouteDetails() != null) {
			vo.setRouteDetailsVO(routeDetailsMapper.convertEntity(dto.getRouteDetails()));
		}
		/*
		 * if (dto.getRegistrationDetails() != null) {
		 * vo.setRegistrationDetailsVO(registrationDetailsMapper.convertEntity(
		 * dto.getRegistrationDetails())); }
		 */
		funPoint(dto.getPermitStatus(), vo::setPermitStatus);
		funPoint(dto.getPermitAuthorizationNo(), vo::setPermitAuthorizationNo);
		funPoint(dto.getPermitSurrenderDate(), vo::setPermitSurrenderDate);
		if (dto.getsTCTvehcleDetailsDTO() != null) {
			vo.setsTCTvehcleDetailsVO(sTCTvehcleDetailsMapper.convertEntity(dto.getsTCTvehcleDetailsDTO()));
		}

		funPoint(dto.getServiceIds(), vo::setServiceIds);
		funPoint(dto.getServiceType(), vo::setServiceType);
		funPoint(dto.getNonPermitPrNo(), vo::setNonPermitPrNo);
		funPoint(dto.getIsPermitDataEntry(), vo::setIsPermitDataEntry);
		funPoint(dto.getIsRelacementOfVehicle(), vo::setIsRelacementOfVehicle);
		funPoint(dto.getRelacementDate(), vo::setRelacementDate);
		funPoint(dto.getIsPaymentDone(), vo::setIsPaymentDone);
		funPoint(dto.getStageCarriageType(), vo::setStageCarriageType);
		funPoint(dto.getStageCarriageServiceType(), vo::setStageCarriageServiceType);
		funPoint(dto.getRepresentedBy(), vo::setRepresentedBy);
		funPoint(dto.getRepresentAddress(), vo::setRepresentAddress);
		return vo;
	}

	@Override
	public PermitDetailsDTO convertVO(PermitDetailsVO vo) {
		PermitDetailsDTO dto = new PermitDetailsDTO();
		funPoint(vo.getId(), dto::setId);
		funPoint(vo.getPrNo(), dto::setPrNo);
		funPoint(vo.getPermitNo(), dto::setPermitNo);
		if (vo.getPermitClass() != null) {
			dto.setPermitClass(permitClassMapper.convertVO(vo.getPermitClass()));
		}
		if (vo.getPermitType() != null) {
			dto.setPermitType(permitTypeMapper.convertVO(vo.getPermitType()));
		}
		if (vo.getGoodDetails() != null) {
			dto.setGoodsDetails(permitGoodsDetailsMapper.convertVO(vo.getGoodDetails()));
		}
		if (vo.getPermitValidityDetailsVO() != null) {
			dto.setPermitValidityDetails(permitValidityDetailsMapper.convertVO(vo.getPermitValidityDetailsVO()));
		}
		if (vo.getRouteDetailsVO() != null) {
			dto.setRouteDetails(routeDetailsMapper.convertVO(vo.getRouteDetailsVO()));
		}
		/*
		 * if (vo.getRegistrationDetailsVO() != null) {
		 * dto.setRegistrationDetails(registrationDetailsMapper.convertVO(vo.
		 * getRegistrationDetailsVO())); }
		 */
		funPoint(vo.getPermitStatus(), dto::setPermitStatus);
		funPoint(vo.getPermitAuthorizationNo(), dto::setPermitAuthorizationNo);
		funPoint(vo.getPermitSurrenderDate(), vo::setPermitSurrenderDate);
		if (vo.getsTCTvehcleDetailsVO() != null) {
			dto.setsTCTvehcleDetailsDTO(sTCTvehcleDetailsMapper.convertVO(vo.getsTCTvehcleDetailsVO()));
		}
		funPoint(vo.getServiceIds(), dto::setServiceIds);
		funPoint(vo.getServiceType(), dto::setServiceType);
		funPoint(vo.getNonPermitPrNo(), dto::setNonPermitPrNo);
		funPoint(vo.getIsPermitDataEntry(), dto::setIsPermitDataEntry);
		funPoint(vo.getIsRelacementOfVehicle(), dto::setIsRelacementOfVehicle);
		funPoint(vo.getRelacementDate(), dto::setRelacementDate);
		funPoint(vo.getIsPaymentDone(), dto::setIsPaymentDone);
		funPoint(vo.getStageCarriageType(), dto::setStageCarriageType);
		funPoint(vo.getStageCarriageServiceType(), dto::setStageCarriageServiceType);
		funPoint(vo.getRepresentedBy(), dto::setRepresentedBy);
		funPoint(vo.getRepresentAddress(), dto::setRepresentAddress);
		return dto;
	}

	public List<PermitDetailsVO> convertListEntity(List<PermitDetailsDTO> dto) {
		return dto.stream().map(v -> convertEntity(v)).collect(Collectors.toList());
	}

	public Optional<PermitDetailsVO> convertEntityDtoToVO(Optional<PermitDetailsDTO> permitDetails) {
		// Optional<PermitDetailsVO> permitOptionalVo = null;
		PermitDetailsVO vo = new PermitDetailsVO();
		PermitTypeVO permitTypeVO = new PermitTypeVO();
		PermitValidityDetailsVO permitValidityDetailsVO = new PermitValidityDetailsVO();
		RouteDetailsVO routeDetailsVO = new RouteDetailsVO();
		PermitRouteDetailsVO permitRouteDetailsVO = new PermitRouteDetailsVO();
		if (permitDetails.isPresent()) {
			vo.setPermitNo(permitDetails.get().getPermitNo());
			vo.setPermitType(permitTypeVO);
			vo.getPermitType().setDescription(permitDetails.get().getPermitType().getDescription());
			vo.setPermitValidityDetailsVO(permitValidityDetailsVO);
			vo.getPermitValidityDetailsVO()
					.setPermitValidFrom(permitDetails.get().getPermitValidityDetails().getPermitValidFrom());
			vo.getPermitValidityDetailsVO()
					.setPermitValidTo(permitDetails.get().getPermitValidityDetails().getPermitValidTo());
			routeDetailsVO.setPermitRouteDetails(permitRouteDetailsVO);
			vo.setRouteDetailsVO(routeDetailsVO);
			if(permitDetails.get().getRouteDetails() != null && permitDetails.get().getRouteDetails().getPermitRouteDetails()!= null && 
					permitDetails.get().getRouteDetails().getPermitRouteDetails().getDescription() != null ){
				vo.getRouteDetailsVO().getPermitRouteDetails().setDescription(permitDetails.get().getRouteDetails().getPermitRouteDetails().getDescription());
			}
		
		}
		return Optional.of(vo);
	}
}
