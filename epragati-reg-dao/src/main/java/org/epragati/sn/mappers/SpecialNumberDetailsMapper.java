package org.epragati.sn.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.rta.vo.ReportResponseVO;
import org.epragati.sn.dto.BidVehicleDetails;
import org.epragati.sn.dto.CustomerDetails;
import org.epragati.sn.dto.SpecialNumberDetailsDTO;
import org.epragati.sn.dto.VehicleDetails;
import org.epragati.sn.numberseries.dto.BidParticipantsDto;
import org.epragati.sn.vo.NumberSeries;
import org.epragati.sn.vo.SpecialNumberDetailsVo;
import org.epragati.util.BidStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpecialNumberDetailsMapper extends BaseMapper<SpecialNumberDetailsDTO, SpecialNumberDetailsVo> {

	@Autowired
	private SNActionsDetailsMapper actionsDetailsMapper;

	@Autowired
	private CustomerDetailsMapper customerDetailsMapper;

	@Autowired
	private VehicleDetailsMapper vehicleDetailsMapper;

	@Autowired
	private BidVehicleDetailsMapper bidVehicleDetailsMapper;

	@Autowired
	private BidHistoryMapper bidHistoryMapper;

	@Autowired
	private BidFinalDetailsMapper bidFinalDetailsMapper;

	@Autowired
	private SpecialNumberFeeDetailsMapper specialNumberFeeDetailsMapper;

	@Override
	public SpecialNumberDetailsVo convertEntity(SpecialNumberDetailsDTO dto) {

		SpecialNumberDetailsVo specialNumberDetailsVo = new SpecialNumberDetailsVo();

		funPoint(dto.getBidConfigMasterId(), specialNumberDetailsVo::setBidConfigMasterId);
		funPoint(dto.getBidStatus(), specialNumberDetailsVo::setBidStatus);
		funPoint(dto.getBidIteration(), specialNumberDetailsVo::setBidIteration);
		funPoint(dto.getSpecialNumberAppId(), specialNumberDetailsVo::setSpecialNumberAppId);
		funPoint(dto.getSelectedPrSeries(), specialNumberDetailsVo::setSelectedPrSeries);

		if (dto.getActionsDetailsLog() != null) {
			specialNumberDetailsVo.setActionsDetailsLog(actionsDetailsMapper.convertEntity(dto.getActionsDetailsLog()));
		}

		if (dto.getCustomerDetails() != null) {
			specialNumberDetailsVo.setCustomerDetails(customerDetailsMapper.convertEntity(dto.getCustomerDetails()));
		}

		if (dto.getVehicleDetails() != null) {
			specialNumberDetailsVo.setVehicleDetails(vehicleDetailsMapper.convertEntity(dto.getVehicleDetails()));
		}

		if (dto.getBidVehicleDetails() != null) {
			specialNumberDetailsVo
					.setBidVehicleDetails(bidVehicleDetailsMapper.convertEntity(dto.getBidVehicleDetails()));
		}

		if (dto.getBidVehicleDetails() != null) {
			specialNumberDetailsVo
					.setBidVehicleDetails(bidVehicleDetailsMapper.convertEntity(dto.getBidVehicleDetails()));
		}

		if (dto.getBidHistory() != null) {
			specialNumberDetailsVo.setBidHistory(bidHistoryMapper.convertEntity(dto.getBidHistory()));
		}

		if (dto.getBidFinalDetails() != null) {
			specialNumberDetailsVo.setBidFinalDetails(bidFinalDetailsMapper.convertEntity(dto.getBidFinalDetails()));
		}

		if (dto.getSpecialNumberFeeDetails() != null) {
			specialNumberDetailsVo.setSpecialNumberFeeDetails(
					specialNumberFeeDetailsMapper.convertEntity(dto.getSpecialNumberFeeDetails()));
		}

		return specialNumberDetailsVo;
	}

	public SpecialNumberDetailsDTO convertEntity(VehicleDetails vehicleDetails, CustomerDetails customerDetails,
			NumberSeries numberSeries) {

		SpecialNumberDetailsDTO entity = new SpecialNumberDetailsDTO();

		entity.setVehicleDetails(vehicleDetails);
		entity.setCustomerDetails(customerDetails);

		BidVehicleDetails bidVehicleDetails = new BidVehicleDetails();
		bidVehicleDetails.setBidNumberDtlsId(numberSeries.getBidNumberDtlsId());
		bidVehicleDetails.setBiddingVehicleNumber(numberSeries.getNumber());
		bidVehicleDetails.setAllocatedBidNumberType(numberSeries.getNumberType());

		entity.setBidVehicleDetails(bidVehicleDetails);
		return entity;

	}

	public BidParticipantsDto convertBidParticipants(SpecialNumberDetailsDTO entity) {

		BidParticipantsDto bidParticipantDetails = new BidParticipantsDto();
		bidParticipantDetails.setSpecialNumberAppId(entity.getSpecialNumberAppId());
		bidParticipantDetails.setTrNumber(entity.getVehicleDetails().getTrNumber());
		bidParticipantDetails.setRegApplicationNo(entity.getVehicleDetails().getApplicationNumber());
		
		return bidParticipantDetails;
	}

	public ReportResponseVO converLimitedFieldsDTOtoVO(SpecialNumberDetailsDTO specialNumberDetailsDTO) {
		ReportResponseVO reportVo = new ReportResponseVO();
		funPoint(specialNumberDetailsDTO.getBidVehicleDetails().getAllocatedBidNumberType().getDescription(), reportVo::setNumberType);
		funPoint(specialNumberDetailsDTO.getVehicleDetails().getTrNumber(), reportVo::setTrNo);
		funPoint(specialNumberDetailsDTO.getSelectedPrSeries(), reportVo::setSelectedPRSeries);
		if(BidStatus.BIDWIN.equals(specialNumberDetailsDTO.getBidStatus())){
			funPoint(specialNumberDetailsDTO.getSelectedPrSeries(), reportVo::setPrNo);
		}
		funPoint(specialNumberDetailsDTO.getCreatedDate().toLocalDate(), reportVo::setDate);
		funPoint(specialNumberDetailsDTO.getBidStatus().getDescription(), reportVo::setFinalStatus);
		funPoint(specialNumberDetailsDTO.getSpecialNumberFeeDetails().getTotalAmount(), reportVo::setAmount);
		funPoint(specialNumberDetailsDTO.getSpecialNumberFeeDetails().getTransactionNo(), reportVo::setPaymentId);
		return reportVo;
	}

}
