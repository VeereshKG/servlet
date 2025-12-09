package com.xworkz.drivinglicence.dao;

import com.xworkz.drivinglicence.dto.DrivingLicenceDTO;
import com.xworkz.drivinglicence.dto.SearchDTO;


import java.util.Optional;

public interface DrivingLicenceDAO {
    void save(DrivingLicenceDTO dto);

    boolean checkAadhar(DrivingLicenceDTO dto);

    Optional<DrivingLicenceDTO> searchByAadhar(SearchDTO dto);

}
