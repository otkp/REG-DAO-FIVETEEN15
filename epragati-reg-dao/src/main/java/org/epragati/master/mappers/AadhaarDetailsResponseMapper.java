package org.epragati.master.mappers;

import org.epragati.aadhaar.AadharDetailsResponseVO;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.AadhaarDetailsResponseDTO;
import org.springframework.stereotype.Component;

@Component
public class AadhaarDetailsResponseMapper extends BaseMapper<AadhaarDetailsResponseDTO, AadharDetailsResponseVO> {

	@Override
	public AadharDetailsResponseVO convertEntity(AadhaarDetailsResponseDTO dto) {
		// TODO Auto-generated method stub

		AadharDetailsResponseVO aadharDetailsResponseVO = new AadharDetailsResponseVO();

		funPoint(dto.getAge(), aadharDetailsResponseVO::setAge);
		funPoint(dto.getApplicationNumber(), aadharDetailsResponseVO::setApplicationNumber);
		funPoint(dto.getAuth_date(), aadharDetailsResponseVO::setAuth_date);
		funPoint(dto.getAuth_err_code(), aadharDetailsResponseVO::setAuth_err_code);
		funPoint(dto.getAuth_status(), aadharDetailsResponseVO::setAuth_status);
		funPoint(dto.getAuth_transaction_code(), aadharDetailsResponseVO::setAuth_transaction_code);
		funPoint(dto.getBase64file(), aadharDetailsResponseVO::setBase64file);
		funPoint(dto.getCo(), aadharDetailsResponseVO::setCo);
		funPoint(dto.getCountry(), aadharDetailsResponseVO::setCountry);
		funPoint(dto.getDistrict(), aadharDetailsResponseVO::setDistrict);
		funPoint(dto.getDistrict_name(), aadharDetailsResponseVO::setDistrict_name);
		funPoint(dto.getDistrictMatchedCode(), aadharDetailsResponseVO::setDistrictMatchedCode);
		funPoint(dto.getDob(), aadharDetailsResponseVO::setDob);
		funPoint(dto.getDoorNo(), aadharDetailsResponseVO::setDoorNo);
		funPoint(dto.getFirstName(), aadharDetailsResponseVO::setFirstName);
		funPoint(dto.getGender(), aadharDetailsResponseVO::setGender);
		funPoint(dto.getHouse(), aadharDetailsResponseVO::setHouse);
		funPoint(dto.getKSA_KUA_Txn(), aadharDetailsResponseVO::setKSA_KUA_Txn);
		funPoint(dto.getLastName(), aadharDetailsResponseVO::setLastName);
		funPoint(dto.getLc(), aadharDetailsResponseVO::setLc);
		funPoint(dto.getMandal(), aadharDetailsResponseVO::setMandal);
		funPoint(dto.getMandal_name(), aadharDetailsResponseVO::setMandal_name);
		funPoint(dto.getMandalMatchedCode(), aadharDetailsResponseVO::setMandalMatchedCode);
		funPoint(dto.getName(), aadharDetailsResponseVO::setName);
		funPoint(dto.getNationality(), aadharDetailsResponseVO::setNationality);
		funPoint(dto.getPhone(), aadharDetailsResponseVO::setPhone);
		funPoint(dto.getPincode(), aadharDetailsResponseVO::setPincode);
		funPoint(dto.getPo(), aadharDetailsResponseVO::setPo);
		funPoint(dto.getStatecode(), aadharDetailsResponseVO::setStatecode);
		funPoint(dto.getStateMatchedCode(), aadharDetailsResponseVO::setStateMatchedCode);
		funPoint(dto.getStreet(), aadharDetailsResponseVO::setStreet);
		funPoint(dto.getSubdist(), aadharDetailsResponseVO::setSubdist);
		funPoint(dto.getUid(), aadharDetailsResponseVO::setUid);
		funPoint(dto.getVillage(), aadharDetailsResponseVO::setVillage);
		funPoint(dto.getVillage_name(), aadharDetailsResponseVO::setVillage_name);
		funPoint(dto.getVtc(), aadharDetailsResponseVO::setVtc);
		funPoint(dto.getUuId(), aadharDetailsResponseVO::setUuId);
		if(dto.getUidToken()!=null){
			funPoint(dto.getUidToken(), aadharDetailsResponseVO::setUidToken);
		}
		return aadharDetailsResponseVO;
	}

	@Override
	public AadhaarDetailsResponseDTO convertVO(AadharDetailsResponseVO vo) {

		AadhaarDetailsResponseDTO AaadharDetailsResponseDTO = new AadhaarDetailsResponseDTO();
		funPoint(vo.getAge(), AaadharDetailsResponseDTO::setAge);
		funPoint(vo.getApplicationNumber(), AaadharDetailsResponseDTO::setApplicationNumber);
		funPoint(vo.getAuth_date(), AaadharDetailsResponseDTO::setAuth_date);
		funPoint(vo.getAuth_err_code(), AaadharDetailsResponseDTO::setAuth_err_code);
		funPoint(vo.getAuth_status(), AaadharDetailsResponseDTO::setAuth_status);
		funPoint(vo.getAuth_transaction_code(), AaadharDetailsResponseDTO::setAuth_transaction_code);
		funPoint(vo.getBase64file(), AaadharDetailsResponseDTO::setBase64file);
		funPoint(vo.getCo(), AaadharDetailsResponseDTO::setCo);
		funPoint(vo.getCountry(), AaadharDetailsResponseDTO::setCountry);
		funPoint(vo.getDistrict(), AaadharDetailsResponseDTO::setDistrict);
		funPoint(vo.getDistrict_name(), AaadharDetailsResponseDTO::setDistrict_name);
		funPoint(vo.getDistrictMatchedCode(), AaadharDetailsResponseDTO::setDistrictMatchedCode);
		funPoint(vo.getDob(), AaadharDetailsResponseDTO::setDob);
		funPoint(vo.getDoorNo(), AaadharDetailsResponseDTO::setDoorNo);
		funPoint(vo.getFirstName(), AaadharDetailsResponseDTO::setFirstName);
		funPoint(vo.getGender(), AaadharDetailsResponseDTO::setGender);
		funPoint(vo.getHouse(), AaadharDetailsResponseDTO::setHouse);
		funPoint(vo.getKSA_KUA_Txn(), AaadharDetailsResponseDTO::setKSA_KUA_Txn);
		funPoint(vo.getLastName(), AaadharDetailsResponseDTO::setLastName);
		funPoint(vo.getLc(), AaadharDetailsResponseDTO::setLc);
		funPoint(vo.getMandal(), AaadharDetailsResponseDTO::setMandal);
		funPoint(vo.getMandal_name(), AaadharDetailsResponseDTO::setMandal_name);
		funPoint(vo.getMandalMatchedCode(), AaadharDetailsResponseDTO::setMandalMatchedCode);
		funPoint(vo.getName(), AaadharDetailsResponseDTO::setName);
		funPoint(vo.getNationality(), AaadharDetailsResponseDTO::setNationality);
		funPoint(vo.getPhone(), AaadharDetailsResponseDTO::setPhone);
		funPoint(vo.getPincode(), AaadharDetailsResponseDTO::setPincode);
		funPoint(vo.getPo(), AaadharDetailsResponseDTO::setPo);
		funPoint(vo.getStatecode(), AaadharDetailsResponseDTO::setStatecode);
		funPoint(vo.getStateMatchedCode(), AaadharDetailsResponseDTO::setStateMatchedCode);
		funPoint(vo.getStreet(), AaadharDetailsResponseDTO::setStreet);
		funPoint(vo.getSubdist(), AaadharDetailsResponseDTO::setSubdist);
		funPoint(vo.getUid(), AaadharDetailsResponseDTO::setUid);
		funPoint(vo.getVillage(), AaadharDetailsResponseDTO::setVillage);
		funPoint(vo.getVillage_name(), AaadharDetailsResponseDTO::setVillage_name);
		funPoint(vo.getVtc(), AaadharDetailsResponseDTO::setVtc);
		funPoint(vo.getUuId(), AaadharDetailsResponseDTO::setUuId);
		return AaadharDetailsResponseDTO;
	}

	public AadharDetailsResponseVO addhaarLimitedFields(AadhaarDetailsResponseDTO dto) {
		AadharDetailsResponseVO vo = new AadharDetailsResponseVO();
		funPoint(dto.getName(), vo::setName);
		funPoint(dto.getDob(), vo::setDob);
		funPoint(dto.getCo(), vo::setCo);
		return vo;

	}
}
