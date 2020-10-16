package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.MakersDTO;
import org.epragati.master.vo.MakersVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saikiran.kola
 *
 */
@Component
public class MakersMapper extends BaseMapper<MakersDTO, MakersVO> {

	/**
	 * dto to vo conversion
	 */

	@Override
	public MakersVO convertEntity(MakersDTO dto) {
		MakersVO makersVO = new MakersVO();
		
		funPoint(dto.getMakername(), makersVO::setMakername);
		funPoint(dto.getMid(), makersVO::setMmId);
		
		return makersVO;
	}

	/**
	 * dto list to vo list conversion
	 */

	@Override
	public List<MakersVO> convertEntity(List<MakersDTO> dtos) {
		return dtos.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}

	/**
	 * vo to dto conversion
	 */
	@Override
	public MakersDTO convertVO(MakersVO vo) {
		MakersDTO makersDTO = new MakersDTO();
	
		funPoint(vo.getMakername(), makersDTO::setMakername);
		funPoint(vo.getMmId(), makersDTO::setMid);
		return makersDTO;

	}

	/**
	 * vo list to dto list conversion
	 * 
	 */

	@Override
	public List<MakersDTO> convertVO(List<MakersVO> vos) {
		return vos.stream().map(v -> convertVO(v)).collect(Collectors.toList());
	}
	

	public MakersVO convertRequired(MakersDTO dto) {
		MakersVO makersVO = new MakersVO();
		funPoint(dto.getMakername(), makersVO::setMakername);
		makersVO.setMmId(Integer.valueOf(dto.getMid()));
		return makersVO;
	}

	/**
	 * dto list to vo list conversion
	 */


	public List<MakersVO> convertDTOs(List<MakersDTO> dtos) {
		return dtos.stream().map(e -> convertRequired(e)).collect(Collectors.toList());
	}

	public MakersVO convertRequiredDTOtoVO(MakersDTO dto) {
		MakersVO vo=new MakersVO();
		vo.setMakername(dto.getMakername());
		return vo;
	}
	
	
	public MakersDTO convertVoVahanOS(MakersVO vo) {
		MakersDTO makersDTO = new MakersDTO();
		funPoint(vo.getMmId(), makersDTO::setMid);
		funPoint(vo.getMakername(), makersDTO::setMakername);
		return makersDTO;
	}
}