package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterTax;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterTaxDAO extends BaseRepository<MasterTax, Serializable> {

	

	

	

	/**
	 * 
	 * @param covcode
	 * @param ownershiptype
	 * @param statecode
	 * @param status
	 * @param fromage
	 * @return
	 */
	Optional<MasterTax> findByCovcodeAndOwnershiptypeIgnoreCaseAndStatecodeAndStatusAndFromage(String covcode,
			String ownershiptype, String statecode, String status, float fromage);

	/**
	 * 
	 * @param covcode
	 * @param fromulw
	 * @param toulw
	 * @param statecode
	 * @param permitcode
	 * @return
	 */
	Optional<MasterTax> findByCovcodeAndToulwGreaterThanEqualAndFromulwLessThanEqualAndStatecodeAndPermitcodeAndStatus(
			String covcode, Integer fromulw, Integer toulw, String statecode, String permitcode,String status);

	/**
	 * 
	 * @param covcode
	 * @param fromrlw
	 * @param torlw
	 * @param statecode
	 * @param permitcode
	 * @return
	 */
	Optional<MasterTax> findByCovcodeAndTorlwGreaterThanEqualAndFromrlwLessThanEqualAndStatecodeAndPermitcodeAndStatus(
			String covcode, Integer fromrlw, Integer torlw, String statecode, String permitcode,String status);

	/**
	 * 
	 * @param covcode
	 * @param seatfrom
	 * @param seatto
	 * @param statecode
	 * @param permitcode
	 * @return
	 */
	Optional<MasterTax> findByCovcodeAndSeattoGreaterThanEqualAndSeatfromLessThanEqualAndStatecodeAndPermitcodeAndStatus(
			String covcode, Integer seatfrom, Integer seatto, String statecode, String permitcode,String status);

	/**
	 * 
	 * @param covcode
	 * @param ownershiptype
	 * @param statecode
	 * @param status
	 * @param toage
	 * @param fromage
	 * @return
	 */
	Optional<MasterTax> findByCovcodeAndOwnershiptypeIgnoreCaseAndStatecodeAndStatusAndToageGreaterThanEqualAndFromageLessThanEqual(
			String covcode, String ownershiptype, String statecode, String status, double toage, double fromage);

	Optional<MasterTax> findByCovcodeAndOwnershiptypeIgnoreCaseAndStatecodeAndStatusAndToageGreaterThanEqualAndFromageLessThanEqualAndTocostGreaterThanEqualAndFromcostLessThanEqual(
			String covcode, String ownershiptype, String statecode, String status, double toage, double fromage,
			Double tocost, Double fromcost);

	Optional<MasterTax> findByCovcodeAndSeattoGreaterThanEqualAndSeatfromLessThanEqualAndStatecodeAndPermitcodeAndServTypeAndStatus(
			String covcode, Integer seatfrom, Integer seatto, String statecode, String permitcode, String servType,String status);

	Optional<MasterTax> findByCovcodeAndOwnershiptypeIgnoreCaseAndStatecodeAndFromageAndStatus(String covcode,
			String ownershiptype, String statecode, float fromage,String status);
}
