package com.xworkz.dao;

import com.xworkz.dto.VehicleInsuranceDTO;

public interface VehicleInsuranceDAO {

    void save(VehicleInsuranceDTO vehicleInsuranceDTO);

    boolean checkVehicleNumber(VehicleInsuranceDTO vehicleInsuranceDTO);
}
