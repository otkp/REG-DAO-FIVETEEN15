package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.PostOfficeDTO;
import org.epragati.master.vo.PostOfficeVO;
import org.springframework.stereotype.Component;


/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class PostOfficeMapper extends BaseMapper<PostOfficeDTO, PostOfficeVO> {

	@Override
	public PostOfficeVO convertEntity(PostOfficeDTO entry) {
		PostOfficeVO vo = new PostOfficeVO();
		funPoint(entry.getDistrict(), vo::setDistrict);
		funPoint(entry.getPostOfficeId(), vo::setPostOfficeId);
		funPoint(entry.getPostOfficeName(),vo::setPostOfficeName);
		funPoint(entry.getStatus(), vo::setStatus);
		funPoint(entry.getPostOfficeCode(),vo::setPostOfficeCode);
		funPoint(entry.getCreatedBy(), vo::setCreatedBy);
		funPoint(entry.getCreatedDate(), vo::setCreatedDate);
		funPoint(entry.getModifiedBy(), vo::setModifiedBy);
		funPoint(entry.getModifiedDate(), vo::setModifiedDate);
		return vo;
	}
	
	
	public PostOfficeVO postOfficeLimitedFields(PostOfficeDTO entry) {
		PostOfficeVO vo = new PostOfficeVO();
		funPoint(entry.getPostOfficeName(),vo::setPostOfficeName);
		funPoint(entry.getPostOfficeCode(),vo::setPostOfficeCode);
		return vo;
	}
	@Override
	public PostOfficeDTO convertVO(PostOfficeVO vo)
	{
		PostOfficeDTO postOfficeDTO=new PostOfficeDTO();
		funPoint(vo.getDistrict(), postOfficeDTO::setDistrict);
		funPoint(vo.getPostOfficeId(), postOfficeDTO::setPostOfficeId);
		funPoint(vo.getPostOfficeName(),postOfficeDTO::setPostOfficeName);
		funPoint(vo.getStatus(), postOfficeDTO::setStatus);
		funPoint(vo.getPostOfficeCode(),postOfficeDTO::setPostOfficeCode);
		funPoint(vo.getCreatedBy(), postOfficeDTO::setCreatedBy);
		funPoint(vo.getCreatedDate(), postOfficeDTO::setCreatedDate);
		funPoint(vo.getModifiedBy(), postOfficeDTO::setModifiedBy);
		funPoint(vo.getModifiedDate(), postOfficeDTO::setModifiedDate);
		return postOfficeDTO;
		
	}
}