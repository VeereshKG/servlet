package com.xworkz.service;

import com.xworkz.dao.VehicleInsuranceDAO;
import com.xworkz.dao.VehicleInsuranceDAOImpl;
import com.xworkz.dto.VehicleInsuranceDTO;
import com.xworkz.exception.DataInvalidException;

public class VehicleInsuranceServiceImpl implements VehicleInsuranceService{

VehicleInsuranceDAO vehicleInsuranceDAO = new VehicleInsuranceDAOImpl();
    @Override
    public void validate(VehicleInsuranceDTO vehicleInsuranceDTO) throws DataInvalidException {


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
            boolean save =  vehicleInsuranceDAO.save(vehicleInsuranceDTO);
            System.out.println("Save data through SurveyDAO "+save);
        }
    }

}

