package com.xworkz.drivinglicence.service;

import com.xworkz.drivinglicence.dto.DrivingLicenceDTO;
import com.xworkz.drivinglicence.dto.SearchDTO;
import com.xworkz.drivinglicence.exception.DataInvalidException;
import com.xworkz.drivinglicence.exception.DataNotSavedException;

import java.util.Optional;

public interface DrivingLicenceService {

    void validate(DrivingLicenceDTO dto) throws DataInvalidException, DataNotSavedException;

    Optional<DrivingLicenceDTO> search(SearchDTO searchDTO) throws DataInvalidException;

}
