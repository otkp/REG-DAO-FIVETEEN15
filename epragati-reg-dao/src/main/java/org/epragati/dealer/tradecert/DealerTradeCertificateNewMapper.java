package org.epragati.dealer.tradecert;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.jwt.JwtUser;
import org.epragati.master.dto.UserDTO;
import org.epragati.sequence.SequenceGenerator;
import org.epragati.util.StatusRegistration;
import org.epragati.util.document.Sequence;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class DealerTradeCertificateNewMapper
		extends BaseMapper<DealerTradeCertificateNewDto, DealerTradeCertificateNewVO> {
	@Autowired
	private SequenceGenerator sequencenGenerator;
	private static int i = 0;

	public static final String FRESH = "FRESH";
	public static final String RENEWAL = "RENEWAL";
	public static final String DUPLICATE = "DUPLICATE";
	public static final String APP_PAYMENT_TYPE_FRESH = "FRESH_APPLIED";
	public static final String APP_PAYMENT_TYPE_RENEW = "RENEW_APPLIED";
	public static final String APP_PAYMENT_TYPE_DUPLICATE = "DUPLICATE_APPLIED";

	@Override
	public DealerTradeCertificateNewVO convertEntity(DealerTradeCertificateNewDto dto) {
		DealerTradeCertificateNewVO vo = new DealerTradeCertificateNewVO();
		BeanUtils.copyProperties(dto, vo);
		vo.setTradeCertificate(convertListDtoToVo(dto.getTradeCertificate()));
		return vo;
	}

	public TradeCertificateDealerVO convertDtoToVo(TradeCertificateDealerDto dto) {
		TradeCertificateDealerVO vo = new TradeCertificateDealerVO();
		BeanUtils.copyProperties(dto, vo);
		return vo;
	}

	public List<TradeCertificateDealerVO> convertListDtoToVo(List<TradeCertificateDealerDto> tradeCertificate) {
		return tradeCertificate.stream().map(e -> convertDtoToVo(e)).collect(Collectors.toList());

	}

	public List<TradeCertificateDealerDto> convertVO(DealerTradeCertificateNewVO vo, JwtUser user,
			Optional<UserDTO> userDtoOpt) {
		i = 0;
		List<TradeCertificateDealerDto> dtolist = new ArrayList<>();

		// BeanUtils.copyProperties(vo, dto);
		// dto.setUserId(user.getUsername());
		if (vo.getTradeCertificate() != null && !CollectionUtils.isEmpty(vo.getTradeCertificate())) {

			vo.getTradeCertificate().forEach(f -> {
				int count = 1;
				while (count <= f.getNumberOfTradeCertificate()) {
					dtolist.add(convertTradeCertificateDealerDto(f, user, userDtoOpt));
					++count;
				}
			});

		}
		// dto.setTradeCertificate(convertListTradeCertificateDealerDto(vo.getTradeCertificate(),
		// user));
		updateCommonNumber(dtolist);
		return dtolist;
	}

	public void updateCommonNumber(List<TradeCertificateDealerDto> dto) {
		if (dto.size() > 1) {
			dto.forEach(f -> {
				f.setCommonNumber(dto.stream().findFirst().get().getCommonNumber());
				f.setPaymentTransactionNo(dto.stream().findFirst().get().getPaymentTransactionNo());
			});
		}
	}

	public List<TradeCertificateDealerDto> convertListTradeCertificateDealerDto(List<TradeCertificateDealerVO> vo,
			JwtUser user) {
		return vo.stream().map(e -> convertTradeCertificateDealerDto(e, user, null)).collect(Collectors.toList());
	}

	public TradeCertificateDealerDto convertTradeCertificateDealerDto(TradeCertificateDealerVO vo, JwtUser user,
			Optional<UserDTO> userDtoOpt) {
		TradeCertificateDealerDto dto = new TradeCertificateDealerDto();
		BeanUtils.copyProperties(vo, dto);
		dto.setNumberOfTradeCertificate(1);
		String ctId = getTradeCtNumber(user);
		dto.setTradeCertificateID(ctId);
		dto.setUserId(user.getUsername());
		dto.setStatus(FRESH);
		dto.setPaymentStatus(StatusRegistration.PAYMENTPENDING.getDescription());
		dto.setCreatedDate(LocalDateTime.now());
		dto.setlUpdate(LocalDateTime.now());
		dto.setCreatedBy(user.getUsername());
		dto.setApplicationPaymentType(APP_PAYMENT_TYPE_FRESH);
		// dto.setDealerName(user.getFirstname() + " " + user.getLastname());
		if (userDtoOpt.isPresent()) {
			StringBuilder sb = new StringBuilder();
			if (StringUtils.isNotBlank(userDtoOpt.get().getFirstName())) {
				sb.append(userDtoOpt.get().getFirstName()).append(StringUtils.SPACE);
			} else if (StringUtils.isNotBlank(userDtoOpt.get().getFirstname())) {
				sb.append(userDtoOpt.get().getFirstname()).append(StringUtils.SPACE);
			}
			if (StringUtils.isNotBlank(userDtoOpt.get().getMiddleName())) {
				sb.append(userDtoOpt.get().getMiddleName()).append(StringUtils.SPACE);
			}
			if (StringUtils.isNotBlank(userDtoOpt.get().getLastName())) {
				sb.append(userDtoOpt.get().getLastName());
			}
			dto.setDealerName(sb.toString());
		}
		if (i == 0) {
			dto.setPaymentTransactionNo(UUID.randomUUID().toString());
			// dto.setCommonNumber(ctId + "/COMMON");
			dto.setCommonNumber(ctId + "/" + getTradeCtNumberComman());
			i = i + 1;
		}

		return dto;

	}

	/**
	 * generating Trade certificate number.
	 * 
	 * @param user
	 * @return
	 */
	public String getTradeCtNumber(JwtUser user) {
		/**
		 * AP/AP016/TC/204
		 */
		// Map<String, String> hMap = new HashMap<>();
		String number = sequencenGenerator.getSequence(Sequence.DEALERTC.getSequenceId().toString(), null);
		return user.getOfficeCode() + "/TC/" + number;
	}

	public void convertTradeDtoToDto(Optional<TradeCertificateDealerDto> dto, DealerTradeCertificateNewVO vo,
			JwtUser user) {
		if (dto.isPresent()) {
			// dto.get().getTradeCertificate().forEach(d -> {
			String commonNumber = dto.get().getTradeCertificateID() + "/" + getTradeCtNumberComman();

			dto.get().setStatus(RENEWAL);
			dto.get().setlUpdate(LocalDateTime.now());
			dto.get().setCommonNumber(commonNumber);
			dto.get().setApplicationPaymentType(APP_PAYMENT_TYPE_RENEW);
			vo.setTcGenId(commonNumber);
			vo.setPaymentTxId(UUID.randomUUID().toString());
			vo.setNumberOfTradeCertificate(dto.get().getNumberOfTradeCertificate());

		}
	}

	private String getTradeCtNumberComman() {
		/**
		 * AP/AP016/TC/204/1
		 */
		// Map<String, String> hMap = new HashMap<>();
		return sequencenGenerator.getSequence(Sequence.DEALERTCCOMMAN.getSequenceId().toString(), null);
	}

	public TradeCertificateDealerVO convertDtoToVoLimit(TradeCertificateDealerDto dto) {
		TradeCertificateDealerVO vo = new TradeCertificateDealerVO();
		vo.setCov(dto.getCov());
		vo.setAmmount(dto.getAmmount());
		vo.setCreatedBy(dto.getCreatedBy());
		vo.setValidFrom(dto.getValidFrom());
		vo.setValidTo(dto.getValidTo());
		vo.setNumberOfTradeCertificate(dto.getNumberOfTradeCertificate());
		vo.setStatus(dto.getStatus());
		vo.setTradeCertificateID(dto.getTradeCertificateID());
		vo.setTotalDaysRemains(dto.getTotalDaysRemains());
		vo.setTradeValidityStatus(dto.getTradeValidityStatus());
		vo.setCreatedDate(dto.getCreatedDate());

		return vo;
	}

	public List<TradeCertificateDealerVO> getListOfTradeCertificateDealerDto(List<TradeCertificateDealerDto> dto) {

		List<TradeCertificateDealerVO> list = new ArrayList<>();
		dto.forEach(r -> {
			TradeCertificateDealerVO vo = new TradeCertificateDealerVO();
			BeanUtils.copyProperties(r, vo);
			vo.setNumberOfTradeCertificate(r.getNumberOfTradeCertificate());
			list.add(vo);
		});
		return list;

	}

	public void convertTradeDtoToDtoDuplicate(Optional<TradeCertificateDealerDto> dto, DealerTradeCertificateNewVO vo,
			JwtUser user) {
		if (dto.isPresent()) {
			// dto.get().getTradeCertificate().forEach(d -> {
			String commonNumber = dto.get().getTradeCertificateID() + "/" + getTradeCtNumberComman();
			dto.get().setStatus(DUPLICATE);
			dto.get().setlUpdate(LocalDateTime.now());
			dto.get().setCommonNumber(commonNumber);
			dto.get().setApplicationPaymentType(APP_PAYMENT_TYPE_DUPLICATE);
			vo.setTcGenId(commonNumber);
			vo.setPaymentTxId(UUID.randomUUID().toString());
			vo.setNumberOfTradeCertificate(dto.get().getNumberOfTradeCertificate());

			// });
		}
	}
}
