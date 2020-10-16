package org.epragati.sn.numberseries.mapper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.sn.numberseries.dto.PRPoolDTO;
import org.epragati.sn.vo.NumberSeries;
import org.epragati.util.NumberPoolStatus;
import org.springframework.stereotype.Component;



@Component
public class BidNumbersDetailsMapper extends BaseMapper<PRPoolDTO, NumberSeries> {

	@Override
	public NumberSeries convertEntity(PRPoolDTO dto) {

		NumberSeries ns = new NumberSeries();
		ns.setBidNumberDtlsId(dto.getNumberPoolId());
		ns.setAmount(dto.getAmount());
		ns.setParticipantsCount(dto.getBidParticipants() == null ? 0 : dto.getBidParticipants().size());
		ns.setNumberType(dto.getNumberType());
		ns.setNumber(dto.getPrNumber());
		ns.setNumberSum(dto.getNumberSum());
		ns.setPrNo(dto.getPrNo());

		return ns;
	}
	
	public List<NumberSeries> convertbitDetails(List<PRPoolDTO> pool) {
		List<NumberSeries> list = new ArrayList<>();
		pool.stream().forEach(p->{
			NumberSeries ns = this.convertEntity(p);
			ns.setStatus(p.getPoolStatus());
			if(isReservedBeforeToday(p)) {
				ns.setStatus(NumberPoolStatus.ASSIGNED);
			}
			list.add(ns);
		});
		return list;
	}

	public boolean isReservedBeforeToday(PRPoolDTO prPoolDTO) {
		
		return (prPoolDTO.getReservedDate()!=null && LocalDate.now().isAfter(prPoolDTO.getReservedDate()));
	}
}
