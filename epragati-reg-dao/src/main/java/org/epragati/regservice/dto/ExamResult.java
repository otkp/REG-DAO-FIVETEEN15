package org.epragati.regservice.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ExamResult {
	
	//private String language;
	private String result;
	private Integer marks;
	private Integer numTestAttempts;
	//private String systemIP;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime examStartTime;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime examEndTime;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate testDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate lastTestDate;

}
