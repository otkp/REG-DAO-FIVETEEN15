package org.epragati.dispatcher.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DispatcherSubMapperAndServiceUtil extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7272634763138992517L;
	private List<String> listOfApplicatioNumber;
	private List<String> emsDuplicate;
	private List<String> applicatioNumberUpdateSucc;


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void assignApplication(List<String> fields) {
		listOfApplicatioNumber = fields;

	}

	public  List<String> getAssignNullApplicationNo() {

		/*try {
			
			listOfApplicatioNumber.size();
				

		} catch (NullPointerException e) {
			// TODO: handle exception
			listOfApplicatioNumber.add("1");
		}*/

		return listOfApplicatioNumber;
	}

	public List<String> getEmsDuplicate() {

//		try {
//			
//			emsDuplicate.size();
//	
//
//		} catch (NullPointerException e) {
//			// TODO: handle exception
//			emsDuplicate.add("1");
//		
//			
//		}
		return emsDuplicate;
	}

	public void setEmsDuplicate(List<String> emsDuplicate) {
		this.emsDuplicate = emsDuplicate;
	}

	public List<String> getApplicatioNumberUpdateSucc() {

//		try {
//			
//				applicatioNumberUpdateSucc.size();
//
//		} catch (NullPointerException e) {
//			// TODO: handle exception
//			applicatioNumberUpdateSucc.add("1");
//		}
		return applicatioNumberUpdateSucc;
	}

	public void setApplicatioNumberUpdateSucc(List<String> applicatioNumberUpdateSucc) {
		this.applicatioNumberUpdateSucc = applicatioNumberUpdateSucc;
	}
}
