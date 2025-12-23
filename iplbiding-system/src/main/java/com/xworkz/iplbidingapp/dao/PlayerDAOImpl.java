package com.xworkz.iplbidingapp.dao;

import com.xworkz.iplbidingapp.constant.DBConstant;
import com.xworkz.iplbidingapp.dto.CompanyDTO;
import com.xworkz.iplbidingapp.dto.PlayerDTO;
import com.xworkz.iplbidingapp.dto.SearchDTO;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PlayerDAOImpl implements PlayerDAO {
    @Override
    @SneakyThrows
    public void save(PlayerDTO playerDTO) {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String insertQuery =
                "INSERT INTO player (player_name, age, player_type, state, batting_avg, bowling_avg, stumps) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getPropertis(), DBConstant.USERNAME.getPropertis(), DBConstant.PASSWORD.getPropertis());
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

            preparedStatement.setString(1, playerDTO.getPlayerName());
            preparedStatement.setInt(2, playerDTO.getAge());
            preparedStatement.setString(3, playerDTO.getPlayerType());
            preparedStatement.setString(4, playerDTO.getState());
            preparedStatement.setDouble(5, playerDTO.getBattingAvg());
            preparedStatement.setDouble(6, playerDTO.getBowlingAvg());
            preparedStatement.setInt(7, playerDTO.getStumps());

            preparedStatement.executeUpdate();

            System.out.println(playerDTO);
            System.out.println("in dao");
        }
    }

    @Override
    @SneakyThrows
    public boolean nameCheck(PlayerDTO playerDTO) {
        boolean isPresent = false;

        Class.forName("com.mysql.cj.jdbc.Driver");

        String checkQuery = "SELECT 1 FROM player WHERE player_name = ?";

        try (Connection connection = DriverManager.getConnection(
                DBConstant.URL.getPropertis(), DBConstant.USERNAME.getPropertis(), DBConstant.PASSWORD.getPropertis());
             PreparedStatement preparedStatement = connection.prepareStatement(checkQuery)) {

            preparedStatement.setString(1, playerDTO.getPlayerName());

            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                isPresent = true;
            }
        }
        return isPresent;
    }

    @Override
    @SneakyThrows
    public Optional<CompanyDTO> searchByEmail(CompanyDTO companyDTO) {

        System.out.println("start of searchByEmail");
        Class.forName("com.mysql.cj.jdbc.Driver");

        String query = "SELECT * FROM email WHERE company_email = ?";

        try (Connection connection = DriverManager.getConnection(
                DBConstant.URL.getPropertis(), DBConstant.USERNAME.getPropertis(), DBConstant.PASSWORD.getPropertis());
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, companyDTO.getEmail());
            System.out.println("Email-->" + companyDTO.getEmail());

            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                String email = rs.getString(2);
                String company = rs.getString(3);

                CompanyDTO companyDTO1 = new CompanyDTO(email, company);

                System.out.println("Email -->" + email);
                System.out.println("company -->" + company);

                return Optional.of(companyDTO1);
            }
        }

        return Optional.empty();
    }

    @Override
    @SneakyThrows
    public List<PlayerDTO> searchForPlayers(SearchDTO searchDTO) {

        List<PlayerDTO> list = new ArrayList<>();

        Class.forName("com.mysql.cj.jdbc.Driver");

        String selectQuery = "SELECT * FROM player WHERE player_type= ? AND batting_avg >= ? AND  bowling_avg >= ? AND  stumps >= ?";

        try (Connection connection = DriverManager.getConnection(
                DBConstant.URL.getPropertis(), DBConstant.USERNAME.getPropertis(), DBConstant.PASSWORD.getPropertis());
             PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {

            preparedStatement.setString(1, searchDTO.getPlayerType());
            preparedStatement.setDouble(2, searchDTO.getBattingAvg());
            preparedStatement.setDouble(3, searchDTO.getBowlingAvg());
            preparedStatement.setInt(4, searchDTO.getStumps());
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                PlayerDTO dto = new PlayerDTO();
                dto.setPlayerName(rs.getString("player_name"));
                dto.setAge(rs.getInt("age"));
                dto.setPlayerType(rs.getString("player_type"));
                dto.setState(rs.getString("state"));
                dto.setBattingAvg(rs.getDouble("batting_avg"));
                dto.setBowlingAvg(rs.getDouble("bowling_avg"));
                dto.setStumps(rs.getInt("stumps"));

                list.add(dto);
            }
        }

        return list;
    }

    @Override
    @SneakyThrows
    public boolean saveBidAmount(String playerName, String companyName, double amount) {
        System.out.println("start to save in db");
        Class.forName("com.mysql.cj.jdbc.Driver");

        String sql = "INSERT INTO bid (player_name, company_name, bid_amount) VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(
                DBConstant.URL.getPropertis(), DBConstant.USERNAME.getPropertis(), DBConstant.PASSWORD.getPropertis());
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, playerName);
            preparedStatement.setString(2, companyName);
            preparedStatement.setDouble(3, amount);

            int update = preparedStatement.executeUpdate();
            System.out.println("Affected rows-->" + update);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}

