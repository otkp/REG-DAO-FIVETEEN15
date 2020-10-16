package org.epragati.regservice.mapper;

import java.time.format.DateTimeFormatter;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.mappers.RoleActionMapper;
import org.epragati.regservice.dto.ActionDetails;
import org.epragati.regservice.vo.ActionDetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActionDetailMapper extends BaseMapper<ActionDetails,ActionDetailVO>{

	@Autowired
	private RoleActionMapper roleActionMapper;
	@Override
	public ActionDetailVO convertEntity(ActionDetails dto) {
		String approvedDate="";
		ActionDetailVO vo = new ActionDetailVO();
		if(dto.getlUpdate() !=null){
		 approvedDate=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(dto.getlUpdate());
		}
		funPoint(dto.getRole(), vo::setRole);
		funPoint(dto.getUserId(), vo::setUserId);
		funPoint(dto.getApplicationNo(), vo::setApplicationNo);
		funPoint(dto.getModule(), vo::setModule);
		funPoint(dto.getIndex(), vo::setIndex);
		funPoint(dto.getCurrentItegeration(), vo::setCurrentItegeration);
		funPoint(dto.getIsDoneProcess(), vo::setIsDoneProcess);
		funPoint(dto.getStatus(), vo::setStatus);
		vo.setApprovedDate(approvedDate);
		/*if(null != dto.getEnclosures()) {	
			vo.setCurrentDetails(dto.getEnclosures());
		}*/
		funPoint(dto.getAadharNo(), vo::setAadharNo);
		funPoint(dto.getFromMvi(), vo::setFromMvi);
		funPoint(dto.getToMvi(), vo::setToMvi);
		funPoint(dto.getFrom(), vo::setFrom);
		funPoint(dto.getTo(), vo::setTo);
		return vo;
	}
	
	@Override
	public ActionDetails convertVO(ActionDetailVO vo) {
		
		ActionDetails dto = new ActionDetails();
		funPoint(vo.getRole(), dto::setRole);
		funPoint(vo.getUserId(), dto::setUserId);
		funPoint(vo.getApplicationNo(), dto::setApplicationNo);
		funPoint(vo.getModule(), dto::setModule);
		funPoint(vo.getIndex(), dto::setIndex);
		funPoint(vo.getCurrentItegeration(), dto::setCurrentItegeration);
		funPoint(vo.getIsDoneProcess(), dto::setIsDoneProcess);
		funPoint(vo.getStatus(), dto::setStatus);
		/*if(null != vo.getEnclosures()) {
			dto.setCurrentDetails(vo.getEnclosures());
		}*/
		funPoint(vo.getAadharNo(), dto::setAadharNo);
		funPoint(vo.getFromMvi(), dto::setFromMvi);
		funPoint(vo.getToMvi(), dto::setToMvi);
		funPoint(vo.getFrom(), dto::setFrom);
		funPoint(vo.getTo(), dto::setTo);
		return dto;
	}

}
