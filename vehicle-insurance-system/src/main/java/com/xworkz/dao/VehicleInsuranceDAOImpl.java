package com.xworkz.dao;

import com.xworkz.constants.DBConstant;
import com.xworkz.dto.VehicleInsuranceDTO;
import lombok.SneakyThrows;

import java.sql.*;


public class VehicleInsuranceDAOImpl implements VehicleInsuranceDAO {

    @Override
    @SneakyThrows
    public void save(VehicleInsuranceDTO dto) {


        Class.forName("com.mysql.cj.jdbc.Driver");

        String insert = "INSERT INTO insurance (owner_name, vehicleNumber, vehicleType, insuranceType,  premium_Amount) VALUES (?,?,?,?,?)";
        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getPropertis(), DBConstant.USERNAME.getPropertis(), DBConstant.PASSWORD.getPropertis());
             PreparedStatement preparedStatement = connection.prepareStatement(insert)) {
            preparedStatement.setString(1, dto.getOwnerName());
            preparedStatement.setString(2, dto.getVehicleNumber());
            preparedStatement.setString(3, dto.getVehicleType());
            preparedStatement.setString(4, dto.getInsuranceType());
            preparedStatement.setDouble(5, dto.getAmount());

            int rows = preparedStatement.executeUpdate();

        }

    }

    @Override
    @SneakyThrows
    public boolean checkVehicleNumber(VehicleInsuranceDTO vehicleInsuranceDTO) {
        boolean isPresent = false;
        Class.forName("com.mysql.cj.jdbc.Driver");
        String checkVehicleNumber = "SELECT 1 from insurance where vehicleNumber = ?";
        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getPropertis(), DBConstant.USERNAME.getPropertis(), DBConstant.PASSWORD.getPropertis());
             PreparedStatement preparedStatement = connection.prepareStatement(checkVehicleNumber)) {
            preparedStatement.setString(1, vehicleInsuranceDTO.getVehicleNumber());
            ResultSet duplicateVehicleNumber = preparedStatement.executeQuery();
                if (duplicateVehicleNumber.next()) {
                    isPresent = true;
                }

            }
        return isPresent;
    }

}
