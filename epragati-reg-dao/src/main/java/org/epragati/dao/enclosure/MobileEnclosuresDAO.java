package org.epragati.dao.enclosure;

import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.dto.enclosure.MobileEnclosuresDTO;

public interface MobileEnclosuresDAO extends BaseRepository<MobileEnclosuresDTO, String>{

	Optional<MobileEnclosuresDTO> findByAadharNoAndDeviceNoAndMobileNo(String mobileNo, String deviceNo, String aadharNo);

	//Optional<CitizenEnclosuresDTO>findByAadharNoAndDeviceNoAndMobileNoAndEnclosuresValueImageStaus(String aadharNo,String deviceNo, String mobileNo, String description);

}
