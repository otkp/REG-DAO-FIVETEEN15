package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.ApplicantAddressDTO;
import org.epragati.master.vo.ApplicantAddressVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApplicantAddressMapper extends BaseMapper<ApplicantAddressDTO, ApplicantAddressVO> {

	@Autowired
	private CountryMapper countryMapper;

	@Autowired
	private MandalMapper mandalMapper;

	@Autowired
	private DistrictMapper districtMapper;

	@Autowired
	private PostOfficeMapper postOfficeMapper;

	@Autowired
	private StateMapper stateMapper;

	@Autowired
	private VillageMapper villageMapper;

	@Override
	public ApplicantAddressVO convertEntity(ApplicantAddressDTO dto) {
		ApplicantAddressVO vo = new ApplicantAddressVO();
		vo.setDoorNo(dto.getDoorNo());
		vo.setStreetName(dto.getStreetName());
		vo.setTownOrCity(dto.getTownOrCity());
		vo.setOtherCountry(dto.getOtherCountry());
		vo.setOtherState(dto.getOtherState());
		vo.setOtherDistrict(dto.getOtherDistrict());
		vo.setOtherMandal(dto.getOtherMandal());
		vo.setOtherVillage(dto.getOtherVillage());
		vo.setOtherPinCode(dto.getOtherPinCode());

		if (dto.getMandal() != null) {
			vo.setMandal(mandalMapper.convertEntity(dto.getMandal()));
		}
		if (dto.getDistrict() != null) {
			vo.setDistrict(districtMapper.convertEntity(dto.getDistrict()));
		}
		if (dto.getPostOffice() != null) {
			vo.setPostOffice(postOfficeMapper.convertEntity(dto.getPostOffice()));
		}
		if (dto.getState() != null) {
			vo.setState(stateMapper.convertEntity(dto.getState()));
		}
		if (dto.getVillage() != null) {
			vo.setVillage(villageMapper.convertEntity(dto.getVillage()));
		}

		if (dto.getCountry() != null) {
			vo.setCountry(countryMapper.convertEntity(dto.getCountry()));
		}
		return vo;

	}

	@Override

	public ApplicantAddressDTO convertVO(ApplicantAddressVO vo) {
		ApplicantAddressDTO applicantAddressDTO = new ApplicantAddressDTO();
		applicantAddressDTO.setDoorNo(vo.getDoorNo());
		applicantAddressDTO.setStreetName(vo.getStreetName());
		applicantAddressDTO.setTownOrCity(vo.getTownOrCity());
		applicantAddressDTO.setOtherCountry(vo.getOtherCountry());
		applicantAddressDTO.setOtherState(vo.getOtherState());
		applicantAddressDTO.setOtherDistrict(vo.getOtherDistrict());
		applicantAddressDTO.setOtherMandal(vo.getOtherMandal());
		applicantAddressDTO.setOtherVillage(vo.getOtherVillage());
		applicantAddressDTO.setOtherPinCode(vo.getOtherPinCode());
		
		if (vo.getMandal() != null) {
			applicantAddressDTO.setMandal(mandalMapper.convertVO(vo.getMandal()));
		}
		if (vo.getDistrict() != null) {
			applicantAddressDTO.setDistrict(districtMapper.convertVO(vo.getDistrict()));
		}
		if (vo.getPostOffice() != null) {
			applicantAddressDTO.setPostOffice(postOfficeMapper.convertVO(vo.getPostOffice()));
		}
		if (vo.getState() != null) {
			applicantAddressDTO.setState(stateMapper.convertVO(vo.getState()));
		}
		if (vo.getVillage() != null) {
			applicantAddressDTO.setVillage(villageMapper.convertVO(vo.getVillage()));
		}

		if (vo.getCountry() != null) {
			applicantAddressDTO.setCountry(countryMapper.convertVO(vo.getCountry()));
		}
		

		return applicantAddressDTO;

	}

	public ApplicantAddressVO applicantlimitedFields(ApplicantAddressDTO dto) {
		ApplicantAddressVO vo = new ApplicantAddressVO();
		vo.setDoorNo(dto.getDoorNo());
		vo.setStreetName(dto.getStreetName());
		vo.setTownOrCity(dto.getTownOrCity());
		if (dto.getMandal() != null) {
			vo.setMandal(mandalMapper.mandalLimitedFields(dto.getMandal()));
		}
		if (dto.getDistrict() != null) {
			vo.setDistrict(districtMapper.districtLimitedFields(dto.getDistrict()));
		}
		if (dto.getPostOffice() != null) {
			vo.setPostOffice(postOfficeMapper.postOfficeLimitedFields(dto.getPostOffice()));
		}
		if (dto.getState() != null) {
			vo.setState(stateMapper.stateLimitedFields(dto.getState()));
		}
		if (dto.getCountry() != null) {
			vo.setCountry(countryMapper.convertRequired(dto.getCountry()));
		}
		return vo;

	}
	
	public ApplicantAddressDTO convertVOforOS(ApplicantAddressVO vo) {
		ApplicantAddressDTO applicantAddressDTO = new ApplicantAddressDTO();
		applicantAddressDTO.setDoorNo(vo.getDoorNo());
		applicantAddressDTO.setStreetName(vo.getStreetName());
		applicantAddressDTO.setTownOrCity(vo.getTownOrCity());
		applicantAddressDTO.setOtherCountry(vo.getOtherCountry());
		applicantAddressDTO.setOtherState(vo.getOtherState());
		applicantAddressDTO.setOtherDistrict(vo.getOtherDistrict());
		applicantAddressDTO.setOtherMandal(vo.getOtherMandal());
		applicantAddressDTO.setOtherVillage(vo.getOtherVillage());
		applicantAddressDTO.setOtherPinCode(vo.getOtherPinCode());
		if (vo.getState() != null) {
			applicantAddressDTO.setState(stateMapper.convertVO(vo.getState()));
		}
		if (vo.getVillage() != null) {
			applicantAddressDTO.setVillage(villageMapper.convertVO(vo.getVillage()));
		}

		if (vo.getCountry() != null) {
			applicantAddressDTO.setCountry(countryMapper.convertVO(vo.getCountry()));
		}

		return applicantAddressDTO;

	}
}
