package com.xworkz.insurance.dao;

import com.xworkz.insurance.constants.DBConstant;
import com.xworkz.insurance.dto.SearchDTO;
import com.xworkz.insurance.dto.SearchTypeDTO;
import com.xworkz.insurance.dto.VehicleInsuranceDTO;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;


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

    @Override
    @SneakyThrows
    public Optional<VehicleInsuranceDTO> searchByVehicleNumber(SearchDTO searchDTO) {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String searchQuery = "SELECT * from insurance where vehicleNumber = ?";

        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getPropertis(), DBConstant.USERNAME.getPropertis(), DBConstant.PASSWORD.getPropertis());
             PreparedStatement preparedStatement = connection.prepareStatement(searchQuery)) {
            preparedStatement.setString(1, searchDTO.getVehicleNumber());

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String ownerName = resultSet.getString(2);
                String vehicleNumber = resultSet.getString(3);
                String vehicleType = resultSet.getString(4);
                String insuranceType = resultSet.getString(5);
                double amount = resultSet.getDouble(6);
                VehicleInsuranceDTO vehicleInsuranceDTO = new VehicleInsuranceDTO(id,ownerName, vehicleNumber, vehicleType, insuranceType, amount);
                return Optional.of(vehicleInsuranceDTO);
            }
        }
        return Optional.empty();
    }

    @Override
    @SneakyThrows
    public List<VehicleInsuranceDTO> searchByVehicleType(String type) {
        Class.forName("com.mysql.cj.jdbc.Driver");

        SearchTypeDTO searchTypeDTO = new SearchTypeDTO();
        System.out.println("running searchByVehicleType in DAO");
        List<VehicleInsuranceDTO> dtoList = new ArrayList<>();
        String searchsql = "SELECT * from insurance where vehicleType = ?";

        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getPropertis(), DBConstant.USERNAME.getPropertis(), DBConstant.PASSWORD.getPropertis());
             PreparedStatement preparedStatement = connection.prepareStatement(searchsql)) {

            preparedStatement.setString(1, type);

            ResultSet set = preparedStatement.executeQuery();


            while (set.next()) {

                int id = set.getInt(1);
                String ownerName = set.getString(2);
                String vehicleNumber = set.getString(3);
                String vehicleType = set.getString(4);
                String insuranceType = set.getString(5);
                Double amount = set.getDouble(6);

                VehicleInsuranceDTO vehicleInsuranceDTO = new VehicleInsuranceDTO(id,ownerName, vehicleNumber, vehicleType, insuranceType, amount);

                dtoList.add(vehicleInsuranceDTO);
            }

        }

        return dtoList;
    }
}
