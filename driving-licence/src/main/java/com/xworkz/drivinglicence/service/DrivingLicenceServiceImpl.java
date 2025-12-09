package com.xworkz.drivinglicence.service;

import com.xworkz.drivinglicence.dao.DrivingLicenceDAO;
import com.xworkz.drivinglicence.dao.DrivingLicenceDAOImpl;
import com.xworkz.drivinglicence.dto.DrivingLicenceDTO;
import com.xworkz.drivinglicence.dto.SearchDTO;
import com.xworkz.drivinglicence.exception.DataInvalidException;
import com.xworkz.drivinglicence.exception.DataNotSavedException;

import java.util.Optional;

public class DrivingLicenceServiceImpl implements DrivingLicenceService {

    DrivingLicenceDAO dao = new DrivingLicenceDAOImpl();

    @Override
    public void validate(DrivingLicenceDTO dto)
            throws DataInvalidException, DataNotSavedException {

        boolean isInvalid = false;

        if (dto == null) {
            isInvalid = true;

        } else if (dto.getName() == null || dto.getName().trim().length() < 3) {
            isInvalid = true;

        } else if (dto.getAge() <= 18 || dto.getAge() > 100) {
            isInvalid = true;

        } else if (dto.getAddress() == null || dto.getAddress().trim().isEmpty()) {
            isInvalid = true;

        } else if (String.valueOf(dto.getAadhar()).length() != 12) {
            isInvalid = true;

        } else if (String.valueOf(dto.getMobile()).length() != 10) {
            isInvalid = true;
        }

        if (isInvalid) {
            throw new DataInvalidException("Entered Data is Invalid");
        } else {
            if (!dao.checkAadhar(dto)) {
                dao.save(dto);
            } else {
                System.out.println("Aadhar Number is not available");
                throw new DataNotSavedException("data not saved exception");
            }
        }
    }

    @Override
    public Optional<DrivingLicenceDTO> search(SearchDTO searchDTO) throws DataInvalidException {

        if (searchDTO.getAadhar() != 0) {
            return dao.searchByAadhar(searchDTO);
        } else {
            throw new DataInvalidException("aadhar number is invalid");
        }
    }
    
}
