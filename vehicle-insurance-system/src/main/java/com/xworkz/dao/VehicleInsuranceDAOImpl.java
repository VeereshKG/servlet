package com.xworkz.dao;

import com.xworkz.dto.VehicleInsuranceDTO;

public class VehicleInsuranceDAOImpl implements VehicleInsuranceDAO {
    @Override
    public boolean save(VehicleInsuranceDTO vehicleInsuranceDTO) {
        System.out.println("Running save method in VehicleInsuranceDAOImpl");
        return false;
    }
}
