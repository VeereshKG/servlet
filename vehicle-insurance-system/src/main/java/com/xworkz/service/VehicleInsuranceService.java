package com.xworkz.service;

import com.xworkz.dto.VehicleInsuranceDTO;
import com.xworkz.exception.DataInvalidException;

public interface VehicleInsuranceService {

    void validate(VehicleInsuranceDTO vehicleInsuranceDTO) throws DataInvalidException;
}
