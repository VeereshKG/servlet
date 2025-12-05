package com.xworkz.service;

import com.xworkz.dao.VehicleInsuranceDAO;
import com.xworkz.dao.VehicleInsuranceDAOImpl;
import com.xworkz.dto.VehicleInsuranceDTO;
import com.xworkz.exception.DataInvalidException;
import com.xworkz.exception.DataNotSavedException;

public class VehicleInsuranceServiceImpl implements VehicleInsuranceService{

VehicleInsuranceDAO vehicleInsuranceDAO = new VehicleInsuranceDAOImpl();
    @Override
    public void validate(VehicleInsuranceDTO vehicleInsuranceDTO) throws DataInvalidException , DataNotSavedException {


        boolean isInvalid = false;

        if (vehicleInsuranceDTO == null) {
            isInvalid = true;
        } else if (vehicleInsuranceDTO.getOwnerName() == null || vehicleInsuranceDTO.getOwnerName().length() < 3) {
            isInvalid = true;
        } else if (vehicleInsuranceDTO.getVehicleNumber() == null) {
            isInvalid = true;
        } else if (vehicleInsuranceDTO.getVehicleType() == null) {
            isInvalid = true;
        } else if (vehicleInsuranceDTO.getInsuranceType() == null) {
            isInvalid = true;
        }else if (vehicleInsuranceDTO.getAmount() == 0.0){
            isInvalid = true;
        }
        if (isInvalid) {
            throw new DataInvalidException("Entered Data is Invalid");
        }else {
            if (!vehicleInsuranceDAO.checkVehicleNumber(vehicleInsuranceDTO)){
                vehicleInsuranceDAO.save(vehicleInsuranceDTO);
            }else {
                System.out.println("Vehicle number is not available");
                throw new DataNotSavedException("data not saved exception");
            }
        }
    }

}

