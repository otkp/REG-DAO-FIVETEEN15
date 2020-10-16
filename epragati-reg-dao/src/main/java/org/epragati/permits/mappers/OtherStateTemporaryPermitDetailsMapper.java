package org.epragati.permits.mappers;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.tomcat.util.codec.binary.Base64;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dao.MasterCovDAO;
import org.epragati.master.dto.MasterCovDTO;
import org.epragati.master.dto.TaxDetailsDTO;
import org.epragati.master.mappers.FcDetailsMapper;
import org.epragati.master.mappers.InsuranceDetailsMapper;
import org.epragati.master.mappers.MasterCovMapper;
import org.epragati.master.mappers.PermitDetailsMapper;
import org.epragati.master.mappers.RegVehicleDetailsMapper;
import org.epragati.master.vo.ApplicantAddressVO;
import org.epragati.master.vo.ApplicantDetailsVO;
import org.epragati.master.vo.InsuranceDetailsVO;
import org.epragati.master.vo.VahanVehicleDetailsVO;
import org.epragati.master.vo.VehicleDetailsVO;
import org.epragati.payment.mapper.ApplicantDeatilsMapper;
import org.epragati.permits.dto.OtherStateTemporaryPermitDetailsDTO;
import org.epragati.permits.vo.OtherStateTemporaryPermitDetailsVO;
import org.epragati.regservice.mapper.PUCDetailsMapper;
import org.epragati.regservice.vo.CfstTaxDetailsVO;
import org.epragati.util.DateConverters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OtherStateTemporaryPermitDetailsMapper
		extends BaseMapper<OtherStateTemporaryPermitDetailsDTO, OtherStateTemporaryPermitDetailsVO> {

	@Autowired
	private ApplicantDeatilsMapper applicantDeatilsMapper;

	@Autowired
	private FcDetailsMapper fcDetailsMapper;

	@Autowired
	private PermitDetailsMapper permitDeatilsMapper;

	@Autowired
	private InsuranceDetailsMapper insuranceDeatilsMapper;

	@Autowired
	private PUCDetailsMapper pucDetailsMapper;

	@Autowired
	private RegVehicleDetailsMapper vehicleDetailsMapper;

	@Autowired
	private MasterCovMapper masterCovMapper;

	@Autowired
	private MasterCovDAO masterCovDAO;

	@Override
	public OtherStateTemporaryPermitDetailsVO convertEntity(OtherStateTemporaryPermitDetailsDTO dto) {
		OtherStateTemporaryPermitDetailsVO vo = new OtherStateTemporaryPermitDetailsVO();
		if (dto.getApplicantDetails() != null) {
			vo.setApplicantDetails(applicantDeatilsMapper.convertEntity(dto.getApplicantDetails()));
			if (vo.getApplicantDetails().getPermanantAddress() == null
					&& vo.getApplicantDetails().getPresentAddress() != null) {
				vo.getApplicantDetails().setPermanantAddress(vo.getApplicantDetails().getPresentAddress());
			}
		}
		if (dto.getFcDetails() != null) {
			vo.setFcDetails(fcDetailsMapper.convertEntity(dto.getFcDetails()));
		}
		if (dto.getInsuranceDetails() != null) {
			vo.setInsuranceDetails(insuranceDeatilsMapper.convertEntity(dto.getInsuranceDetails()));
		}
		if (dto.getPucDetails() != null) {
			vo.setPucDetails(pucDetailsMapper.convertEntity(dto.getPucDetails()));
		}
		if (dto.getPrimaryPermitDetails() != null) {
			vo.setPrimaryPermitDetails(permitDeatilsMapper.convertEntity(dto.getPrimaryPermitDetails()));
		}
		if (dto.getTemporaryPermitDetails() != null) {
			vo.setTemporaryPermitDetails(permitDeatilsMapper.convertEntity(dto.getTemporaryPermitDetails()));
		}
		if (dto.getVehicleDetails() != null) {
			vo.setVehicleDetails(vehicleDetailsMapper.modifiedVehicleData(dto.getVehicleDetails()));
		}

		if (dto.getTaxDetails() != null) {
			CfstTaxDetailsVO taxVO = new CfstTaxDetailsVO();
			taxVO.setTaxValTo(dto.getTaxDetails().getTaxPeriodEnd());
			taxVO.setOtherStateTaxValUpto(dto.getTaxDetails().getTaxPeriodEnd());
			vo.setTaxDetails(taxVO);
		}

		funPoint(dto.getPrNo(), vo::setPrNo);
		funPoint(dto.getVehicleType(), vo::setVehicleType);
		funPoint(dto.getClassOfVehicle(), vo::setClassOfVehicle);
		return vo;
	}

	@Override
	public OtherStateTemporaryPermitDetailsDTO convertVO(OtherStateTemporaryPermitDetailsVO vo) {
		OtherStateTemporaryPermitDetailsDTO dto = new OtherStateTemporaryPermitDetailsDTO();
		if (vo.getApplicantDetails() != null) {
			dto.setApplicantDetails(applicantDeatilsMapper.convertVO(vo.getApplicantDetails()));
		}
		if (vo.getFcDetails() != null) {
			dto.setFcDetails(fcDetailsMapper.convertVO(vo.getFcDetails()));
		}
		if (vo.getInsuranceDetails() != null) {
			dto.setInsuranceDetails(insuranceDeatilsMapper.convertVO(vo.getInsuranceDetails()));
		}
		if (vo.getPucDetails() != null) {
			dto.setPucDetails(pucDetailsMapper.convertVO(vo.getPucDetails()));
		}
		if (vo.getPrimaryPermitDetails() != null) {
			dto.setPrimaryPermitDetails(permitDeatilsMapper.convertVO(vo.getPrimaryPermitDetails()));
		}
		if (vo.getTemporaryPermitDetails() != null) {
			dto.setTemporaryPermitDetails(permitDeatilsMapper.convertVO(vo.getTemporaryPermitDetails()));
		}
		if (vo.getVehicleDetails() != null) {
			dto.setVehicleDetails(vehicleDetailsMapper.decodingVehicleData(vo.getVehicleDetails()));
		}
		if (vo.getTaxDetails() != null) {
			TaxDetailsDTO taxDTO = new TaxDetailsDTO();
			taxDTO.setTaxPeriodEnd(vo.getTaxDetails().getTaxValTo());
			if (vo.getTaxDetails().getOtherStateTaxValUpto() != null) {
				taxDTO.setTaxPeriodEnd(vo.getTaxDetails().getOtherStateTaxValUpto());
			}
			dto.setTaxDetails(taxDTO);
		}
		funPoint(vo.getPrNo(), dto::setPrNo);
		funPoint(vo.getVehicleType(), dto::setVehicleType);
		funPoint(vo.getClassOfVehicle(), dto::setClassOfVehicle);
		return dto;
	}

	/**
	 * Converting Vahan data into our required object
	 * 
	 * @param vahanVehicleDetailsVO
	 * @return
	 */
	public OtherStateTemporaryPermitDetailsVO convertVahanDataToOtherStateTP(
			VahanVehicleDetailsVO vahanVehicleDetailsVO, String prNo) {
		OtherStateTemporaryPermitDetailsVO vo = new OtherStateTemporaryPermitDetailsVO();
		VehicleDetailsVO vehicleDetailsVO = new VehicleDetailsVO();
		ApplicantDetailsVO applicantDetailsVO = new ApplicantDetailsVO();

		// Tax Details
		if (StringUtils.isNotBlank(vahanVehicleDetailsVO.getTaxPaidUpto())) {
			CfstTaxDetailsVO taxVO = new CfstTaxDetailsVO();
			taxVO.setOtherStateTaxValUpto(DateConverters.convertStirngTODate(vahanVehicleDetailsVO.getTaxPaidUpto()));
//			taxVO.setTaxValTo(DateConverters.convertStringTOlocalDate(vahanVehicleDetailsVO.getTaxPaidUpto()));
			vo.setTaxDetails(taxVO);
		}

		// Insurence Details
		if (StringUtils.isNotBlank(vahanVehicleDetailsVO.getPolicyNo())
				&& StringUtils.isNotBlank(vahanVehicleDetailsVO.getValidityOfInsurance())) {
			InsuranceDetailsVO insurenceDetailsVO = new InsuranceDetailsVO();
			insurenceDetailsVO
					.setValidTill(DateConverters.convertStirngTODate(vahanVehicleDetailsVO.getValidityOfInsurance()));
			insurenceDetailsVO.setPolicyNumber(vahanVehicleDetailsVO.getPolicyNo());
			vo.setInsuranceDetails(insurenceDetailsVO);
		}

		// VahanDetails
		String encodeChassisNumber=Base64.encodeBase64String(vahanVehicleDetailsVO.getChasisNo().getBytes());
		String encodeEngineNumber=Base64.encodeBase64String(vahanVehicleDetailsVO.getEngineNo().getBytes());
		funPoint(vahanVehicleDetailsVO.getBodyType(), vehicleDetailsVO::setBodyTypeDesc);
		funPoint(encodeChassisNumber, vehicleDetailsVO::setChassisNumber);
		funPoint(encodeEngineNumber, vehicleDetailsVO::setEngineNumber);

		if (StringUtils.isNotBlank(vahanVehicleDetailsVO.getGvw())
				&& !vahanVehicleDetailsVO.getGvw().equalsIgnoreCase("NA")) {
			vehicleDetailsVO.setRlw(Integer.parseInt(vahanVehicleDetailsVO.getGvw()));

		}
		funPoint(vahanVehicleDetailsVO.getUlw(), vehicleDetailsVO::setUlw);
		if (vahanVehicleDetailsVO.getNoOfSeat() != null) {
			funPoint(vahanVehicleDetailsVO.getNoOfSeat().toString(), vehicleDetailsVO::setSeatingCapacity);
		}
		String chassisNumber = vahanVehicleDetailsVO.getChasisNo();
		String engineNumber = vahanVehicleDetailsVO.getEngineNo();
		vehicleDetailsVO.setModfiedChassisNumber(chassisNumber != null
				? chassisNumber.length() >= 5 ? chassisNumber.substring(0, chassisNumber.length() - 5) + "*****"
						: chassisNumber.replaceAll(chassisNumber, "****")
				: null);
		vehicleDetailsVO.setModfiedEngineNumber(engineNumber != null
				? engineNumber.length() >= 5 ? engineNumber.substring(0, engineNumber.length() - 5) + "*****"
						: engineNumber.replaceAll(engineNumber, "****")
				: null);
		vo.setVehicleDetails(vehicleDetailsVO);

		// Applicant Details
		funPoint(vahanVehicleDetailsVO.getVehicleOwnerName(), applicantDetailsVO::setFirstName);
		ApplicantAddressVO addressVo = new ApplicantAddressVO();
		if (StringUtils.isNoneBlank(vahanVehicleDetailsVO.getVehicleOwnerAddress())) {
			addressVo.setDoorNo(vahanVehicleDetailsVO.getVehicleOwnerAddress());
		}
		applicantDetailsVO.setPresentAddress(addressVo);
		applicantDetailsVO.setPermanantAddress(addressVo);
		vo.setApplicantDetails(applicantDetailsVO);

		funPoint(prNo, vo::setPrNo);
		if (StringUtils.isNoneBlank(vahanVehicleDetailsVO.getVehicleClass())) {
			setCovs(vahanVehicleDetailsVO.getVehicleClass(), vo);
		}
		return vo;
	}

	private void setCovs(String covCode, OtherStateTemporaryPermitDetailsVO otherStateTemporaryPermitDetailsVO) {
		List<MasterCovDTO> covList = masterCovDAO.findByNicCovCode(convertStringToInteger(covCode));
		if (!covList.isEmpty()) {
			otherStateTemporaryPermitDetailsVO.setClassOfVehicle(covList.stream().findFirst().get().getCovcode());
			otherStateTemporaryPermitDetailsVO.setClassOfVehicleVO(masterCovMapper.convertDTOs(covList));
		}

	}

	private Integer convertStringToInteger(String value) {
		if (null != value && !value.equals("NA")) {
			return Integer.parseInt(value);
		}
		return 0;
	}

}
