package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.gstn.mapper.GSTNDataMapper;
import org.epragati.master.dto.DealerRegDTO;
import org.epragati.master.vo.DealerRegVO;
import org.epragati.payment.mapper.ApplicantDeatilsMapper;
import org.epragati.payment.mapper.ClassOfVehiclesMapper;
import org.epragati.regservice.mapper.LockedDetailsMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DealerRegMapper extends BaseMapper<DealerRegDTO, DealerRegVO> {

	private static final Logger logger = LoggerFactory.getLogger(DealerRegMapper.class);

	@Autowired
	private ApplicantDeatilsMapper applicantDetailsMapper;

	@Autowired
	private ClassOfVehiclesMapper classOfVehiclesMapper;

	@Autowired
	private OfficeMapper officeMapper;

	@Autowired
	private LockedDetailsMapper lockedDetailsMapper;

	@Autowired
	private GSTNDataMapper gSTNDataMapper;

	@Autowired
	private PanDetailsMapper panDetailsMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private MakersMapper makersMapper;
	
	@Autowired
	private ApplicantAddressMapper applicantAddressMapper;

	@Override
	public DealerRegVO convertEntity(DealerRegDTO dto) {
		DealerRegVO vo = new DealerRegVO();
		if (dto.getApplicantDetails() != null) {
			vo.setApplicantDetails(applicantDetailsMapper.convertEntity(dto.getApplicantDetails()));
		}
		funPoint(dto.getApplicationNo(), vo::setApplicationNo);
		funPoint(dto.getApplicationStatus(), vo::setApplicationStatus);
		funPoint(dto.getCategory(), vo::setCategory);
		funPoint(dto.getOfficeCode(), vo::setOfficeCode);
		funPoint(dto.getServiceIds(), vo::setServiceIds);
		funPoint(dto.getServiceType(), vo::setServiceType);
		funPoint(dto.getGateWayType(), vo::setGateWayType);
		if (dto.getClassOfVehicles() != null) {
			vo.setCovs(classOfVehiclesMapper.convertEntity(dto.getClassOfVehicles()));
		}
		if (dto.getOfficeDetails() != null) {
			vo.setOfficeDetails(officeMapper.convertEntity(dto.getOfficeDetails()));
		}

		if (dto.getMviOfficeDetails() != null) {
			vo.setMviOfficeDetails(officeMapper.convertEntity(dto.getMviOfficeDetails()));
		}
		funPoint(dto.getIsMVIassigned(), vo::setIsMVIassigned);

		funPoint(dto.getAssignedMvi(), vo::setAssignedMvi);

		if (dto.getLockedDetails() != null) {
			vo.setLockedDetails(lockedDetailsMapper.convertEntity(dto.getLockedDetails()));
		}

		if (dto.getGstnData() != null) {
			vo.setGstnData(gSTNDataMapper.convertEntity(dto.getGstnData()));
		}
		funPoint(dto.getPaymentTransactionNo(), vo::setPaymentTransactionNo);
		if (dto.getPanDetails() != null) {
			vo.setPanDetails(panDetailsMapper.convertEntity(dto.getPanDetails()));
		}
		if (dto.getExistingUserDetails() != null) {
			vo.setExistingUserDeatils(userMapper.convertEntity(dto.getExistingUserDetails()));
		}
		funPoint(dto.getDealerUserId(), vo::setDealerUserId);
		funPoint(dto.getCancellationComments(), vo::setCancellationComments);
		funPoint(dto.getIsMVIDone(), vo::setIsMVIDone);
		funPoint(dto.getIsChild(), vo::setIsChild);
		funPoint(dto.getParentUserId(), vo::setParentUserId);
		if (dto.getMakers() != null) {
			vo.setMakers(makersMapper.convertEntity(dto.getMakers()));
		}
		if (dto.getApplicantDetails() != null && dto.getApplicantDetails().getPresentAddress() != null) {
			vo.setDealerAddress(applicantAddressMapper.convertEntity(dto.getApplicantDetails().getPresentAddress()));
		}
		if (dto.getDealerAddress() != null) {
			vo.setDealerAddress(applicantAddressMapper.convertEntity(dto.getDealerAddress()));
		}
		return vo;
	}

	@Override
	public DealerRegDTO convertVO(DealerRegVO vo) {
		DealerRegDTO entity = new DealerRegDTO();
		if (vo.getApplicantDetails() != null) {
			entity.setApplicantDetails(applicantDetailsMapper.convertVO(vo.getApplicantDetails()));
		}
		funPoint(vo.getApplicationNo(), entity::setApplicationNo);
		funPoint(vo.getApplicationStatus(), entity::setApplicationStatus);
		funPoint(vo.getCategory(), entity::setCategory);
		funPoint(vo.getOfficeCode(), entity::setOfficeCode);
		funPoint(vo.getServiceIds(), entity::setServiceIds);
		funPoint(vo.getServiceType(), entity::setServiceType);
		funPoint(vo.getGateWayType(), entity::setGateWayType);
		if (vo.getCovs() != null) {
			entity.setClassOfVehicles(classOfVehiclesMapper.convertVO(vo.getCovs()));
		}
		if (vo.getOfficeDetails() != null) {
			entity.setOfficeDetails(officeMapper.convertVO(vo.getOfficeDetails()));
		}

		if (vo.getMviOfficeDetails() != null) {
			entity.setMviOfficeDetails(officeMapper.convertVO(vo.getMviOfficeDetails()));
		}
		funPoint(vo.getIsMVIassigned(), entity::setIsMVIassigned);

		funPoint(vo.getAssignedMvi(), entity::setAssignedMvi);

		if (vo.getLockedDetails() != null) {
			entity.setLockedDetails(lockedDetailsMapper.convertVO(vo.getLockedDetails()));
		}
		funPoint(vo.getPaymentTransactionNo(), entity::setPaymentTransactionNo);

		if (vo.getGstnData() != null) {
			entity.setGstnData(gSTNDataMapper.convertVO(vo.getGstnData()));
		}
		if (vo.getPanDetails() != null) {
			entity.setPanDetails(panDetailsMapper.convertVO(vo.getPanDetails()));
		}
		if (vo.getExistingUserDeatils() != null) {
			entity.setExistingUserDetails(userMapper.convertVO(vo.getExistingUserDeatils()));
		}
		funPoint(vo.getDealerUserId(), entity::setDealerUserId);
		funPoint(vo.getCancellationComments(), entity::setCancellationComments);
		funPoint(vo.getIsMVIDone(), entity::setIsMVIDone);
		if (vo.getIsChild() != null) {
			funPoint(vo.getIsChild(), entity::setIsChild);
		}
		funPoint(vo.getParentUserId(), entity::setParentUserId);
		if (vo.getMakers() != null) {
			entity.setMakers(makersMapper.convertVO(vo.getMakers()));
		}
		if (vo.getDealerAddress() != null) {
			entity.setDealerAddress(applicantAddressMapper.convertVO(vo.getDealerAddress()));
		}
		return entity;
	}

}
