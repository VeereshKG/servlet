package com.xworkz.drivinglicence.dao;

import com.xworkz.drivinglicence.constants.DBConstant;
import com.xworkz.drivinglicence.dto.DrivingLicenceDTO;

import com.xworkz.drivinglicence.dto.SearchDTO;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.Optional;

public class DrivingLicenceDAOImpl implements DrivingLicenceDAO {

    public DrivingLicenceDAOImpl() {
        System.out.println("running DrivingLicenceDAOImpl");
    }

    @Override
    @SneakyThrows
    public void save(DrivingLicenceDTO dto) {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String insert = "INSERT INTO driving_licence (name, age, address, aadhar, mobile) VALUES (?,?,?,?,?)";
        try (Connection con = DriverManager.getConnection(DBConstant.URL.getPropertis(),
                DBConstant.USERNAME.getPropertis(),
                DBConstant.PASSWORD.getPropertis());
             PreparedStatement preparedStatement = con.prepareStatement(insert)) {

            preparedStatement.setString(1, dto.getName());
            preparedStatement.setInt(2, dto.getAge());
            preparedStatement.setString(3, dto.getAddress());
            preparedStatement.setLong(4, dto.getAadhar());
            preparedStatement.setLong(5, dto.getMobile());

            int rows = preparedStatement.executeUpdate();
            System.out.println("RowsAffected --> " + rows);
        }
    }

    @Override
    @SneakyThrows
    public boolean checkAadhar(DrivingLicenceDTO dto) {
        boolean isPresent = false;
        Class.forName("com.mysql.cj.jdbc.Driver");

        String checkAadhar = "SELECT 1 FROM driving_licence WHERE aadhar = ?";

        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getPropertis(),
                DBConstant.USERNAME.getPropertis(),
                DBConstant.PASSWORD.getPropertis());
             PreparedStatement preparedStatement = connection.prepareStatement(checkAadhar)) {
            preparedStatement.setLong(1, dto.getAadhar());
            ResultSet duplicateAadhar = preparedStatement.executeQuery();
            if (duplicateAadhar.next()) {
                isPresent = true;
            }
        }
        return isPresent;
    }


    @Override
    @SneakyThrows
    public Optional<DrivingLicenceDTO> searchByAadhar(SearchDTO searchDTO) {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String search = "SELECT * FROM driving_licence WHERE aadhar = ?";
        try (Connection con = DriverManager.getConnection(
                DBConstant.URL.getPropertis(),
                DBConstant.USERNAME.getPropertis(),
                DBConstant.PASSWORD.getPropertis());
             PreparedStatement preparedStatement = con.prepareStatement(search)) {

            preparedStatement.setLong(1, searchDTO.getAadhar());

            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {

                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                long aadhar = rs.getLong("aadhar");
                long mobile = rs.getLong("mobile");

                DrivingLicenceDTO dto =
                        new DrivingLicenceDTO(name, age, address, aadhar, mobile);

                return Optional.of(dto);
            }
        }
        return Optional.empty();
    }

}