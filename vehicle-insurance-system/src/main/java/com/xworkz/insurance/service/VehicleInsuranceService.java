package com.xworkz.insurance.service;

import com.xworkz.insurance.dto.SearchDTO;
import com.xworkz.insurance.dto.SearchTypeDTO;
import com.xworkz.insurance.dto.VehicleInsuranceDTO;
import com.xworkz.insurance.exception.DataInvalidException;
import com.xworkz.insurance.exception.DataNotSavedException;

import java.util.List;
import java.util.Optional;

public interface VehicleInsuranceService {

    void validate(VehicleInsuranceDTO vehicleInsuranceDTO) throws DataInvalidException, DataNotSavedException;

    Optional<VehicleInsuranceDTO> search(SearchDTO searchDTO) throws DataInvalidException ;

    default List<VehicleInsuranceDTO> findByType(SearchTypeDTO searchTypeDTO){

        return java.util.Collections.emptyList();
    }
    }

