package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.AuctionDetailsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface AuctionDetailsDAO extends BaseRepository<AuctionDetailsDTO, Serializable>{
	
	List<AuctionDetailsDTO> findByMviOfficeCodeAndMviUserIdAndAuctionClosed(String mviOfficeCode,String mviUserId,boolean auctionClosed);
	Optional<AuctionDetailsDTO> findById(String id);
	List<AuctionDetailsDTO> findByVehicleDetailsPrNoIn(String prNo);
	List<AuctionDetailsDTO> findByVehicleDetailsTrNoIn(String trNo);
	List<AuctionDetailsDTO> findByDtcOfficeCodeAndDtcUserIdAndAuctionClosedAndDtcCompleted(String dtcOfficeCode,String dtcUserId,boolean auctionClosed,boolean dtcCompleted);
}
