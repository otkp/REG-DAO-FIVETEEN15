package org.epragati.payment.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.ApplicantDetailsDTO;
import org.epragati.master.mappers.AadhaarDetailsResponseMapper;
import org.epragati.master.mappers.ApplicantAddressMapper;
import org.epragati.master.mappers.ApplicationTypeMapper;
import org.epragati.master.mappers.BloodGroupMapper;
import org.epragati.master.mappers.ContactMapper;
import org.epragati.master.mappers.QualificationMapper;
import org.epragati.master.vo.ApplicantDetailsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApplicantDeatilsMapper extends BaseMapper<ApplicantDetailsDTO, ApplicantDetailsVO> {

	@Autowired
	private QualificationMapper qualificationMapper;

	@Autowired
	private BloodGroupMapper bloodGroupMapper;

	@Autowired
	private ContactMapper contactMapper;

	@Autowired
	private ApplicantAddressMapper applicantAddressMapper;

	@Autowired
	private ApplicationTypeMapper applicationtypeMapper;

	@Autowired
	private AadhaarDetailsResponseMapper aadhaarDetailsResponseMapper;

	@Override
	public ApplicantDetailsVO convertEntity(ApplicantDetailsDTO entity) {

		ApplicantDetailsVO vo = new ApplicantDetailsVO();
		funPoint(entity.getApplicantNo(), vo::setApplicantNo);
		funPoint(entity.getDisplayName(), vo::setDisplayName);
		funPoint(entity.getFirstName(), vo::setFirstName);
		funPoint(entity.getLastName(), vo::setLastName);
		funPoint(entity.getMiddleName(), vo::setMiddleName);
		funPoint(entity.getFatherName(), vo::setFatherName);

		if (entity.getContact() != null) {

			vo.setContact(contactMapper.convertEntity(entity.getContact()));
		}

		if (entity.getQualification() != null) {

			vo.setQualification(qualificationMapper.convertEntity(entity.getQualification()));
		}

		funPoint(entity.getIsDifferentlyAbled(), vo::setIsDifferentlyAbled);

		if (entity.getPresentAddress() != null) {

			vo.setPresentAddress(applicantAddressMapper.convertEntity(entity.getPresentAddress()));
		}
		if (entity.getAadharResponse() != null) {

			vo.setAadharResponse(aadhaarDetailsResponseMapper.convertEntity(entity.getAadharResponse()));
		}

		funPoint(entity.getIsAadhaarValidated(), vo::setIsAadhaarValidated);

		if (entity.getApplicantionType() != null) {
			vo.setApplicantionType(applicationtypeMapper.convertEntity(entity.getApplicantionType()));
		}

		funPoint(entity.getStatus(), vo::setStatus);

		if (entity.getBloodGrp() != null) {
			vo.setBloodGrp(bloodGroupMapper.convertEntity(entity.getBloodGrp()));
		}
		funPoint(entity.getNationality(), vo::setNationality);
		funPoint(entity.getSameAsAadhar(), vo::setSameAsAadhar);
		funPoint(entity.getAadharNo(), vo::setAadharNo);
		funPoint(entity.getGender(), vo::setGender);
		funPoint(entity.getDateOfBirth(), vo::setDateOfBirth);
		// funPoint(entity.getDocumentId(), vo::setDocumentId);
		// funPoint(entity.getCreatedDate(), vo::setCreatedDate);
		funPoint(entity.getIsAvailablePresentAddrsProof(), vo::setIsAvailablePresentAddrsProof);
		funPoint(entity.getPresentAddrsProofBelongsTo(), vo::setPresentAddrsProofBelongsTo);
		funPoint(entity.getNameOfPresentAddrsProofBelongsTo(), vo::setNameOfPresentAddrsProofBelongsTo);

		funPoint(entity.getEntityName(), vo::setEntityName);
		funPoint(entity.getRepresentativeName(), vo::setRepresentativeName);
		
		if (entity.getOwnerContact() != null) {

			vo.setOwnerContact(contactMapper.convertEntity(entity.getOwnerContact()));
		}

		return vo;
	}

	public ApplicantDetailsVO dashBoardLimitedFields(ApplicantDetailsDTO entity) {
		ApplicantDetailsVO vo = new ApplicantDetailsVO();
		funPoint(entity.getApplicantNo(), vo::setApplicantNo);
		funPoint(entity.getDisplayName(), vo::setDisplayName);
		funPoint(entity.getFirstName(), vo::setFirstName);
		funPoint(entity.getFatherName(), vo::setFatherName);
		funPoint(entity.getDateOfBirth(), vo::setDateOfBirth);
		if (entity.getAadharResponse() != null) {
			vo.setAadharResponse(aadhaarDetailsResponseMapper.addhaarLimitedFields(entity.getAadharResponse()));
		}
		if (entity.getContact() != null) {
			vo.setContact(contactMapper.convertEntity(entity.getContact()));
		}

		if (entity.getPresentAddress() != null) {
			vo.setPresentAddress(applicantAddressMapper.applicantlimitedFields(entity.getPresentAddress()));
		}

		return vo;
	}

	@Override
	public ApplicantDetailsDTO convertVO(ApplicantDetailsVO vo) {

		ApplicantDetailsDTO applicantDetailsDTO = new ApplicantDetailsDTO();

		funPoint(vo.getApplicantNo(), applicantDetailsDTO::setApplicantNo);
		funPoint(vo.getDisplayName(), applicantDetailsDTO::setDisplayName);
		funPoint(vo.getFirstName(), applicantDetailsDTO::setFirstName);
		funPoint(vo.getLastName(), applicantDetailsDTO::setLastName);
		funPoint(vo.getMiddleName(), applicantDetailsDTO::setMiddleName);
		funPoint(vo.getFatherName(), applicantDetailsDTO::setFatherName);

		if (vo.getContact() != null) {

			applicantDetailsDTO.setContact(contactMapper.convertVO(vo.getContact()));
		}

		if (vo.getQualification() != null) {

			applicantDetailsDTO.setQualification(qualificationMapper.convertVO(vo.getQualification()));
		}

		funPoint(vo.getIsDifferentlyAbled(), vo::setIsDifferentlyAbled);

		if (vo.getPresentAddress() != null) {

			applicantDetailsDTO.setPresentAddress(applicantAddressMapper.convertVO(vo.getPresentAddress()));
		}

		if (vo.getPermanantAddress() != null) {

			applicantDetailsDTO.setOtherStateAddress(applicantAddressMapper.convertVOforOS(vo.getPermanantAddress()));
		}
      
		if (vo.getAadharResponse() != null) {

			applicantDetailsDTO.setAadharResponse(aadhaarDetailsResponseMapper.convertVO(vo.getAadharResponse()));
		}

		funPoint(vo.getIsAadhaarValidated(), applicantDetailsDTO::setIsAadhaarValidated);

		if (vo.getApplicantionType() != null) {
			applicantDetailsDTO.setApplicantionType(applicationtypeMapper.convertVO(vo.getApplicantionType()));
		}

		funPoint(vo.getStatus(), applicantDetailsDTO::setStatus);

		if (vo.getBloodGrp() != null) {
			applicantDetailsDTO.setBloodGrp(bloodGroupMapper.convertVO(vo.getBloodGrp()));
		}
		funPoint(vo.getNationality(), applicantDetailsDTO::setNationality);
		funPoint(vo.getSameAsAadhar(), applicantDetailsDTO::setSameAsAadhar);
		if(vo.getPresentAddressFrom()!=null){
			applicantDetailsDTO.setPresentAddressFrom(vo.getPresentAddressFrom());
		}
		funPoint(vo.getAadharNo(), applicantDetailsDTO::setAadharNo);
		funPoint(vo.getGender(), applicantDetailsDTO::setGender);
		funPoint(vo.getDateOfBirth(), applicantDetailsDTO::setDateOfBirth);
		// funPoint(vo.getDocumentId(), applicantDetailsDTO::setDocumentId);
		// funPoint(vo.getCreatedDate(), applicantDetailsDTO::setCreatedDate);
		funPoint(vo.getIsAvailablePresentAddrsProof(), applicantDetailsDTO::setIsAvailablePresentAddrsProof);
		funPoint(vo.getPresentAddrsProofBelongsTo(), applicantDetailsDTO::setPresentAddrsProofBelongsTo);
		funPoint(vo.getNameOfPresentAddrsProofBelongsTo(), applicantDetailsDTO::setNameOfPresentAddrsProofBelongsTo);
		funPoint(vo.getEntityName(), applicantDetailsDTO::setEntityName);
		funPoint(vo.getRepresentativeName(), applicantDetailsDTO::setRepresentativeName);
		
		if (vo.getOwnerContact() != null) {

			applicantDetailsDTO.setOwnerContact(contactMapper.convertVO(vo.getOwnerContact()));
		}

		return applicantDetailsDTO;
	}

	public ApplicantDetailsVO convertRequiredEntity(ApplicantDetailsDTO entity) {

		ApplicantDetailsVO vo = new ApplicantDetailsVO();
		funPoint(entity.getApplicantNo(), vo::setApplicantNo);
		funPoint(entity.getDisplayName(), vo::setDisplayName);
		funPoint(entity.getFirstName(), vo::setFirstName);
		funPoint(entity.getLastName(), vo::setLastName);
		funPoint(entity.getMiddleName(), vo::setMiddleName);
		funPoint(entity.getFatherName(), vo::setFatherName);

		if (entity.getContact() != null) {

			vo.setContact(contactMapper.convertEntity(entity.getContact()));
		}

		if (entity.getQualification() != null) {

			vo.setQualification(qualificationMapper.convertEntity(entity.getQualification()));
		}

		funPoint(entity.getIsDifferentlyAbled(), vo::setIsDifferentlyAbled);

		if (entity.getPresentAddress() != null) {

			vo.setPresentAddress(applicantAddressMapper.convertEntity(entity.getPresentAddress()));
		}
        
		funPoint(entity.getIsAadhaarValidated(), vo::setIsAadhaarValidated);

		if (entity.getApplicantionType() != null) {
			vo.setApplicantionType(applicationtypeMapper.convertEntity(entity.getApplicantionType()));
		}

		funPoint(entity.getStatus(), vo::setStatus);

		if (entity.getBloodGrp() != null) {
			vo.setBloodGrp(bloodGroupMapper.convertEntity(entity.getBloodGrp()));
		}
		funPoint(entity.getNationality(), vo::setNationality);
		funPoint(entity.getSameAsAadhar(), vo::setSameAsAadhar);
		funPoint(entity.getAadharNo(), vo::setAadharNo);
		funPoint(entity.getGender(), vo::setGender);
		funPoint(entity.getDateOfBirth(), vo::setDateOfBirth);

		return vo;
	}

	public ApplicantDetailsVO limitedApplicantDetailsdtoToVo(ApplicantDetailsDTO entity) {
		ApplicantDetailsVO vo = new ApplicantDetailsVO();
		funPoint(entity.getDisplayName(), vo::setDisplayName);
		funPoint(entity.getFatherName(), vo::setFatherName);
		funPoint(entity.getFirstName(), vo::setFirstName);
		funPoint(entity.getDateOfBirth(), vo::setDateOfBirth);
		funPoint(entity.getNationality(), vo::setNationality);
		if (entity.getAadharResponse() != null) {
			vo.setAadharResponse(aadhaarDetailsResponseMapper.convertEntity(entity.getAadharResponse()));
		}
		if(entity.getPresentAddress() !=null) {
			vo.setPresentAddress(applicantAddressMapper.convertEntity(entity.getPresentAddress()));
		}
		if (entity.getContact() != null) {
			vo.setContact(contactMapper.convertEntity(entity.getContact()));
		}
		return vo;
	}

	public ApplicantDetailsDTO convertRequiredVO(ApplicantDetailsVO entity) {

		ApplicantDetailsDTO vo = new ApplicantDetailsDTO();
		funPoint(entity.getApplicantNo(), vo::setApplicantNo);
		funPoint(entity.getDisplayName(), vo::setDisplayName);
		funPoint(entity.getFirstName(), vo::setFirstName);
		funPoint(entity.getLastName(), vo::setLastName);
		funPoint(entity.getMiddleName(), vo::setMiddleName);
		funPoint(entity.getFatherName(), vo::setFatherName);

		if (entity.getContact() != null) {

			vo.setContact(contactMapper.convertVO(entity.getContact()));
		}

		if (entity.getQualification() != null) {

			vo.setQualification(qualificationMapper.convertVO(entity.getQualification()));
		}

		funPoint(entity.getIsDifferentlyAbled(), vo::setIsDifferentlyAbled);

		if (entity.getPresentAddress() != null) {

			vo.setPresentAddress(applicantAddressMapper.convertVO(entity.getPresentAddress()));
		}

		funPoint(entity.getIsAadhaarValidated(), vo::setIsAadhaarValidated);

		if (entity.getApplicantionType() != null) {
			vo.setApplicantionType(applicationtypeMapper.convertVO(entity.getApplicantionType()));
		}

		funPoint(entity.getStatus(), vo::setStatus);

		if (entity.getBloodGrp() != null) {
			vo.setBloodGrp(bloodGroupMapper.convertVO(entity.getBloodGrp()));
		}
		funPoint(entity.getNationality(), vo::setNationality);
		funPoint(entity.getSameAsAadhar(), vo::setSameAsAadhar);
		
		if(entity.getPresentAddressFrom()!=null){
			vo.setPresentAddressFrom(entity.getPresentAddressFrom());
		}
		funPoint(entity.getAadharNo(), vo::setAadharNo);
		funPoint(entity.getGender(), vo::setGender);
		funPoint(entity.getDateOfBirth(), vo::setDateOfBirth);
		return vo;
	}
	
	public ApplicantDetailsVO limitedRepresentiveFields(ApplicantDetailsDTO entity) {
		ApplicantDetailsVO vo = new ApplicantDetailsVO();
				if (entity.getAadharResponse() != null) {
			vo.setAadharResponse(aadhaarDetailsResponseMapper.convertEntity(entity.getAadharResponse()));
		       }
		return vo;
	}
	public List<ApplicantDetailsVO> convertSpecificRepresentiveFields(List<ApplicantDetailsDTO> applicantDetailsDTO) {
		return applicantDetailsDTO.stream().map(e -> limitedRepresentiveFields(e)).collect(Collectors.toList());
		}
}