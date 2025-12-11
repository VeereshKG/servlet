package com.xworkz.insurance.dao;

import com.xworkz.insurance.dto.SearchDTO;
import com.xworkz.insurance.dto.VehicleInsuranceDTO;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public interface VehicleInsuranceDAO {

    void save(VehicleInsuranceDTO vehicleInsuranceDTO);

    boolean checkVehicleNumber(VehicleInsuranceDTO vehicleInsuranceDTO);

    Optional<VehicleInsuranceDTO> searchByVehicleNumber(SearchDTO searchDTO);

    default List<VehicleInsuranceDTO> searchByVehicleType(String type) {
        return Collections.emptyList();
    }
}
