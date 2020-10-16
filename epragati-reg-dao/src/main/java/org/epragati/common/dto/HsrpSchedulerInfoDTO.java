package org.epragati.common.dto;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="hsrp_scheduler_info")
public class HsrpSchedulerInfoDTO {

		
		private Integer trSucessCount;
		
		private Integer prSucessCount;
		
		private List<String> trSucessList;
		
		private List<String> prSucessList;
		
		private LocalDateTime createdDate;
		
		private Integer trErrorCount;
		
		private Integer prErrorCount;
		
		private List<String> trErrorList;
		
		private List<String> prErrorList;
		
		private Integer totalCount;
		
		private List<String> openStatusList;
		
		public Integer getTrSucessCount() {
			return trSucessCount;
		}

		public void setTrSucessCount(Integer trSucessCount) {
			this.trSucessCount = trSucessCount;
		}

		public Integer getPrSucessCount() {
			return prSucessCount;
		}

		public void setPrSucessCount(Integer prSucessCount) {
			this.prSucessCount = prSucessCount;
		}

		public List<String> getTrSucessList() {
			return trSucessList;
		}

		public void setTrSucessList(List<String> trSucessList) {
			this.trSucessList = trSucessList;
		}

		public List<String> getPrSucessList() {
			return prSucessList;
		}

		public void setPrSucessList(List<String> prSucessList) {
			this.prSucessList = prSucessList;
		}

	
		public LocalDateTime getCreatedDate() {
			return createdDate;
		}

		public void setCreatedDate(LocalDateTime createdDate) {
			this.createdDate = createdDate;
		}

		public Integer getTrErrorCount() {
			return trErrorCount;
		}

		public void setTrErrorCount(Integer trErrorCount) {
			this.trErrorCount = trErrorCount;
		}

		public Integer getPrErrorCount() {
			return prErrorCount;
		}

		public void setPrErrorCount(Integer prErrorCount) {
			this.prErrorCount = prErrorCount;
		}

		public List<String> getTrErrorList() {
			return trErrorList;
		}

		public void setTrErrorList(List<String> trErrorList) {
			this.trErrorList = trErrorList;
		}

		public List<String> getPrErrorList() {
			return prErrorList;
		}

		public void setPrErrorList(List<String> prErrorList) {
			this.prErrorList = prErrorList;
		}

		public Integer getTotalCount() {
			return totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<String> getOpenStatusList() {
			return openStatusList;
		}

		public void setOpenStatusList(List<String> openStatusList) {
			this.openStatusList = openStatusList;
		}
		
		
		
	}



