package com.xworkz.service;

import com.xworkz.dto.VehicleInsuranceDTO;
import com.xworkz.exception.DataInvalidException;
import com.xworkz.exception.DataNotSavedException;

public interface VehicleInsuranceService {

    void validate(VehicleInsuranceDTO vehicleInsuranceDTO) throws DataInvalidException , DataNotSavedException;
}
