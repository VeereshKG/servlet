package com.xworkz;

import java.sql.*;

public class MatrimonyMain {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/matrimonydb";
        String user = "root";
        String password = "Veeresh@2002";

        System.out.println("main started");
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection -->" + connection);

//            String sql = "INSERT INTO matrimony_info VALUES(4,'pramod@outlook.in','son','Male','2003-07-16','kannada','Hindu','single',5.4),(3,'chethan@gmail.com','daughter','Female','2003-08-17','Kannada','Hindu','single',5.0); ;";
//            Statement statement = connection.createStatement();
//            int rowsAffected = statement.executeUpdate(sql);
//            System.out.println("rowsAffected -->" + rowsAffected);

//            String select = "select * from matrimony_info ; ";
            Statement statement = connection.createStatement();
//          ResultSet set = statement.executeQuery(select);
//            System.out.println("ResultSet --->"+set);

          String update =  "UPDATE matrimony_info  SET height = 6.0 WHERE m_id = 2;";
         int rows = statement.executeUpdate(update);
            System.out.println("Rows Affected-->"+rows);

            String delete =  "DELETE FROM matrimony_info WHERE m_id = 2;";
            int deleterows = statement.executeUpdate(delete);
            System.out.println("Rows affected-->"+ deleterows);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }


        System.out.println("After handling exception..........");

        System.out.println("main ended");
    }
}