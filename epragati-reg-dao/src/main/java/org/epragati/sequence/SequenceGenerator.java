package org.epragati.sequence;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.epragati.payment.dto.SequenceConfigDTO;
import org.epragati.payments.dao.AutoIncrementDAO;
import org.epragati.payments.dao.SequenceConfigDAO;
import org.epragati.util.document.Sequence;
import org.epragati.util.exception.SequenceGenerateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SequenceGenerator {

	@Autowired
	private AutoIncrementDAO autoIncrementDAO;

	@Autowired
	private SequenceConfigDAO sequenceConfigDAO;

	private static final Logger logger = LoggerFactory.getLogger(SequenceGenerator.class);

	private SequenceGenerator() {

	}

	public static SequenceGenerator getSequenceGenerator() {
		return new SequenceGenerator();
	}

	public String getSequence(String serviceId, Map<String, String> detailsMap) throws SequenceGenerateException {

		synchronized (serviceId.intern()) {
			String format = StringUtils.EMPTY;
			String serviceCode = StringUtils.EMPTY;
			Calendar cal = Calendar.getInstance();
			Long nextNumber = 0L;

			Optional<SequenceConfigDTO> sequenceConfigDTO = sequenceConfigDAO.findById(Long.parseLong(serviceId));

			if (sequenceConfigDTO.isPresent()) {

				serviceCode = sequenceConfigDTO.get().getName();
				Integer year = getYear(sequenceConfigDTO.get().getResetMode());
				if (serviceCode.equals(Sequence.REGISTRATIONAPPNO.getSequenceName())) {
					format = getDlNextNumberInFormat(detailsMap, serviceCode, sequenceConfigDTO, year);
				}
				// For Parent Financier Creation
				// serviceId=12,serviceName/serviceCode=FinancierAppNo;
				else if (serviceCode.equals(Sequence.FINANCIERAPPNO.getSequenceName())) {
					format = getFinNextNumberInFormat(detailsMap, serviceCode, /** serviceCode=FinancierAppNo */
							sequenceConfigDTO, year);

				} else if (serviceCode.equals(Sequence.DEALERID.getSequenceName())) {
					format = getFinNextNumberInFormat(detailsMap, serviceCode, /** serviceCode=FinancierAppNo */
							sequenceConfigDTO, year);

				} else if (serviceCode.equals(Sequence.DEALERRID.getSequenceName())) {
					nextNumber = autoIncrementDAO.getNextNumber(serviceCode, sequenceConfigDTO.get().getStartNumber(),
							year);
					format = appendZero(nextNumber, 7);

				}
				// DealerAppNo
				else if (serviceCode.equals(Sequence.DEALERAPPNO.getSequenceName())) {
					format = this.getNextNumber(detailsMap, serviceCode, sequenceConfigDTO, year);
					format = "DEALER/" + format + "/" + cal.get(Calendar.YEAR) + "/" + detailsMap.get("officeCode");
				}
				// for motor driving school application no
				else if (serviceCode.equals(Sequence.MDSAPPNO.getSequenceName())) {
					format = getMDSNextNumberInFormat(detailsMap, serviceCode, /** serviceCode=FinancierAppNo */
							sequenceConfigDTO, year);

				} else if (serviceCode.equals(Sequence.CHALLAN.getSequenceName())) {
					Long incrementNumber = Long.valueOf(detailsMap.get("INCR"));
					nextNumber = autoIncrementDAO.getNextNumber(serviceCode, sequenceConfigDTO.get().getStartNumber(),
							year, incrementNumber);
					format = String.valueOf(nextNumber);
				} else if (serviceCode.equals(Sequence.FC.getSequenceName())) {
					format = this.getNextNumber(detailsMap, serviceCode, sequenceConfigDTO, year);
					format = "FC/" + format + "/" + cal.get(Calendar.YEAR) + "/" + detailsMap.get("officeCode");
				} else if (serviceCode.equals(Sequence.DEALERCHASISNO.getSequenceName())) {
					format = this.getNextNumber(detailsMap, serviceCode, sequenceConfigDTO,
							Integer.parseInt(detailsMap.get("year").toString()));
				} else if (serviceCode.equals(Sequence.APPLICANT.getSequenceName())) {
					nextNumber = autoIncrementDAO.getNextNumber(serviceCode, sequenceConfigDTO.get().getStartNumber(),
							year);
					format = year + appendZero(nextNumber, 7);
				} else if (serviceCode.equals(Sequence.ALTRATION.getSequenceName())) {
					nextNumber = autoIncrementDAO.getNextNumber(serviceCode, sequenceConfigDTO.get().getStartNumber(),
							year);
					format = "ALT" + year + appendZero(nextNumber, 7);
				} else if (serviceCode.equals(Sequence.PERMITNUMBER.getSequenceName())) {
					format = this.getNextNumber(detailsMap, serviceCode, sequenceConfigDTO, year);
					format = detailsMap.get("officeCode") + "/" + format + "/" + detailsMap.get("numberCode") + "/"
							+ cal.get(Calendar.YEAR);
				} else if (serviceCode.equals(Sequence.USERID.getSequenceName())) {
					format = this.getNextNumber(detailsMap, serviceCode, sequenceConfigDTO, year);
				} else if (serviceCode.equals(Sequence.BILATERALTAX.getSequenceName())) {
					format = this.getNextNumber(detailsMap, serviceCode, sequenceConfigDTO, year);
					format = detailsMap.get("stateCode") + "/" + detailsMap.get("permitCode") + "/"
							+ detailsMap.get("covCode") + "/" + detailsMap.get("officeCode") + "/" + format + "/"
							+ year;
				}

				else if (serviceCode.equals(Sequence.PAYMENTRECIEPT.getSequenceName())) {
					format = this.getNextNumber(detailsMap, serviceCode, sequenceConfigDTO, year);
					LocalDate date = LocalDate.now();
					format = String.valueOf(date.getYear()) + date.getMonthValue() + "_" + format;

				} else if (serviceCode.equals(Sequence.SHOWCAUSENO.getSequenceName())) {
					format = this.getNextNumber(detailsMap, serviceCode, sequenceConfigDTO, year);
					Integer formatNo = Integer.parseInt(format);
					format = detailsMap.get("officeCode") + "/" + formatNo + "/" + year + "/" + "SC";
				} else if (serviceCode.equals(Sequence.DEALERTC.getSequenceName())) {
					nextNumber = autoIncrementDAO.getNextNumber(serviceCode, sequenceConfigDTO.get().getStartNumber(),
							year);
					format = appendZero(nextNumber, 3);
				}else if (serviceCode.equals(Sequence.DEALERTCCOMMAN.getSequenceName())) {
					nextNumber = autoIncrementDAO.getNextNumber(serviceCode, sequenceConfigDTO.get().getStartNumber(),
							year);
					format = nextNumber.toString();
				} else if (serviceCode.equals(Sequence.VCR.getSequenceName())) {
					Format formatter = new SimpleDateFormat("MMM");
					System.out.println(LocalDate.now().getMonthValue());
					String month = formatter.format(new Date());
					nextNumber = autoIncrementDAO.getNextNumber(serviceCode, sequenceConfigDTO.get().getStartNumber(), year,LocalDate.now().getMonthValue());
					format = appendZero(nextNumber, Integer.parseInt(sequenceConfigDTO.get().getNumberLength()));
					format = detailsMap.get("officeCode")+"/" + month + year + "/"  + format;
				}else if (serviceCode.equals(Sequence.SHOWCAUSENOFORVCR.getSequenceName())) {
					format = this.getNextNumber(detailsMap, serviceCode, sequenceConfigDTO, year);
					Integer formatNo = Integer.parseInt(format);
					format = detailsMap.get("officeCode") + "/" + formatNo + "/" + year + "/" + "SCVCR";
				}else if(serviceCode.equals(Sequence.FINANCIALASSISTANCE.getSequenceName())) {
					format=findNextNumberForFA(detailsMap,serviceCode,sequenceConfigDTO,year).concat("FA");
					 
				}

				else {
					logger.info("No matching sequencen found for service Code : [{}] ", serviceCode);
					throw new SequenceGenerateException("No matching sequencen found for service Code");
				}

				logger.info("Service Name/id  [{}]/[{}] with Sequence Format Number [{}] ", serviceCode, serviceId,
						format);

			} else
				throw new SequenceGenerateException("Service Configuration Not Found");

			return format;
		}

	}

	private String getNextNumber(Map<String, String> detailsMap, String serviceCode,
			Optional<SequenceConfigDTO> sequenceConfigDTO, Integer year) {

		String officeCode = getOfficeCode(detailsMap, serviceCode);

		Long nextNumber = autoIncrementDAO.getNextNumber(serviceCode, sequenceConfigDTO.get().getStartNumber(),
				officeCode, year);
		return appendZero(nextNumber, Integer.parseInt(sequenceConfigDTO.get().getNumberLength()));
	}

	private String getDlNextNumberInFormat(Map<String, String> detailsMap, String serviceCode,
			Optional<SequenceConfigDTO> sequenceConfigDTO, Integer year) {

		String officeCode = getOfficeCode(detailsMap, serviceCode);

		Long nextNumber = autoIncrementDAO.getNextNumber(serviceCode, sequenceConfigDTO.get().getStartNumber(),
				officeCode, year);
		return detailsMap.get("officeCode")
				+ appendZero(nextNumber, Integer.parseInt(sequenceConfigDTO.get().getNumberLength())) + year;
	}

	// For Parent Financier Creation
	private String getFinNextNumberInFormat(Map<String, String> detailsMap, String serviceCode,
			Optional<SequenceConfigDTO> sequenceConfigDTO, Integer year) {

		String officeCode = getOfficeCode(detailsMap, serviceCode);

		Long nextNumber = autoIncrementDAO.getNextNumber(serviceCode, sequenceConfigDTO.get().getStartNumber(),
				officeCode, year);
		return detailsMap.get("officeCode")
				+ appendZero(nextNumber, Integer.parseInt(sequenceConfigDTO.get().getNumberLength())) + year;
	}

	private String getOfficeCode(Map<String, String> detailsMap, String serviceCode) {
		String officeCode = detailsMap.get("officeCode");

		if (StringUtils.isBlank(serviceCode)) {
			logger.error("No Service Code Defined for ServiceId [] ", serviceCode);
			throw new SequenceGenerateException("Invalid Service Code ( Empty ) ");
		}

		if (StringUtils.isBlank(officeCode)) {
			logger.error("No Office Code Found", officeCode);
			throw new SequenceGenerateException("No Office Code Found");
		}
		return officeCode;
	}

	private String getMDSNextNumberInFormat(Map<String, String> detailsMap, String serviceCode,
			Optional<SequenceConfigDTO> sequenceConfigDTO, Integer year) {

		String officeCode = getOfficeCode(detailsMap, serviceCode);

		Long nextNumber = autoIncrementDAO.getNextNumber(serviceCode, sequenceConfigDTO.get().getStartNumber(),
				officeCode, year);
		return detailsMap.get("officeCode")
				+ appendZero(nextNumber, Integer.parseInt(sequenceConfigDTO.get().getNumberLength())) + year;
	}
	
	private String findNextNumberForFA(Map<String, String> detailsMap, String serviceCode,
			Optional<SequenceConfigDTO> sequenceConfigDTO, Integer year) {
		
		String officeCode = getOfficeCode(detailsMap, serviceCode);	
		
		Long nextNumber = autoIncrementDAO.getNextNumber(serviceCode, sequenceConfigDTO.get().getStartNumber(),
				officeCode, year);
		
		return detailsMap.get("officeCode")
				+ appendZero(nextNumber, Integer.parseInt(sequenceConfigDTO.get().getNumberLength())) + year ;
	}
	private String appendZero(Long number, int length) {
		return String.format("%0" + (length) + "d", number);
	}

	private Integer getYear(String yearType) {

		LocalDate localDate = LocalDate.now();
		Integer year = localDate.getYear();

		if (StringUtils.isBlank(yearType)) {
			return year;
		}
		// C : Calendar
		if (yearType.equals("C")) {
			return year;
		}

		return (localDate.getMonthValue() <= 3 ? year - 1 : year);
	}

}
