package com.xworkz;

import com.xworkz.constants.DBConstant;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SportsMain {

    public static void main(String[] args) {

        System.out.println("main started");

//        String url = "jdbc:mysql://localhost:3306/matrimonydb";
//        String user = "root";
//        String pwd = "Veeresh@2002";

        try(Connection connection = DriverManager.getConnection(DBConstant.URL.getPropertis(),DBConstant.USERNAME.getPropertis(),DBConstant.PASSWORD.getPropertis());
            Statement statement = connection.createStatement(); ) {

            System.out.println("Connection --> " + connection);

            System.out.println("Insertion started");

            String insert = "INSERT INTO sports VALUES(1,'Cricket','Outdoor',11,'England','All','Yes','John')," +
                    "(2,'Football','Outdoor',11,'England','All','Yes','Alex')," +
                    "(3,'Hockey','Outdoor',11,'India','All','Yes','Prasad')," +
                    "(4,'Kabaddi','Outdoor',7,'India','All','Yes','Mahesh')," +
                    "(5,'Basketball','Indoor',5,'USA','All','Yes','Steven')," +
                    "(6,'Volleyball','Outdoor',6,'USA','All','Yes','Chris')," +
                    "(7,'Baseball','Outdoor',9,'USA','All','Yes','Adam')," +
                    "(8,'Tennis','Outdoor',1,'France','All','Yes','Roger')," +
                    "(9,'Badminton','Indoor',1,'China','All','Yes','Lee')," +
                    "(10,'TableTennis','Indoor',1,'China','All','Yes','Chen')," +
                    "(11,'Swimming','WaterSport',1,'Australia','All','Yes','Oliver')," +
                    "(12,'Boxing','Combat',1,'Greece','Adult','Yes','Tyson')," +
                    "(13,'Wrestling','Combat',1,'Greece','Adult','Yes','Roman')," +
                    "(14,'Cycling','Outdoor',1,'France','All','Yes','Victor')," +
                    "(15,'Running','Outdoor',1,'Kenya','All','Yes','Kipchoge')," +
                    "(16,'Gymnastics','Indoor',1,'Germany','Kids','Yes','Miller')," +
                    "(17,'Skating','Indoor',1,'USA','Kids','No','Ryan')," +
                    "(18,'Chess','Indoor',1,'India','All','No','Anand')," +
                    "(19,'Carrom','Indoor',2,'India','All','No','Suresh')," +
                    "(20,'Throwball','Outdoor',7,'India','All','No','Kamala')," +
                    "(21,'Archery','Outdoor',1,'Korea','All','Yes','Minho')," +
                    "(22,'Rugby','Outdoor',15,'England','All','Yes','Henry')," +
                    "(23,'Surfing','WaterSport',1,'Hawaii','All','Yes','Kai')," +
                    "(24,'Diving','WaterSport',1,'China','All','Yes','Jin')," +
                    "(25,'Fencing','Combat',1,'France','Adult','Yes','Louis')," +
                    "(26,'Judo','Combat',1,'Japan','Adult','Yes','Kenzo')," +
                    "(27,'Karate','Combat',1,'Japan','Kids','Yes','Hiro')," +
                    "(28,'Taekwondo','Combat',1,'Korea','Adult','Yes','Soo')," +
                    "(29,'Shooting','Indoor',1,'Russia','Adult','Yes','Dimitri')," +
                    "(30,'Golf','Outdoor',1,'Scotland','Adult','Yes','Smith')," +
                    "(31,'Snooker','Indoor',1,'UK','Adult','No','Ronnie')," +
                    "(32,'HorseRiding','Outdoor',1,'Spain','All','Yes','Marco')," +
                    "(33,'Kayaking','WaterSport',1,'Canada','All','Yes','George')," +
                    "(34,'Rowing','WaterSport',1,'UK','All','Yes','Thomas')," +
                    "(35,'Handball','Indoor',7,'Germany','All','Yes','Jurgen')," +
                    "(36,'Softball','Outdoor',9,'USA','All','Yes','Linda')," +
                    "(37,'Polo','Outdoor',4,'India','Adult','Yes','Raja')," +
                    "(38,'Skateboarding','Outdoor',1,'USA','Kids','No','Tony')," +
                    "(39,'Parkour','Outdoor',1,'France','Youth','No','Pierre')," +
                    "(40,'Bowling','Indoor',1,'USA','All','No','Kevin')," +
                    "(41,'IceHockey','Indoor',6,'Canada','All','Yes','Jackson')," +
                    "(42,'Skiing','Outdoor',1,'Switzerland','All','Yes','Felix')," +
                    "(43,'Snowboarding','Outdoor',1,'USA','All','Yes','Logan')," +
                    "(44,'MotoRacing','Outdoor',1,'Italy','Adult','No','Rossi')," +
                    "(45,'Formula1','Outdoor',1,'Germany','Adult','Yes','Schumacher')," +
                    "(46,'Darts','Indoor',1,'UK','Adult','No','Michael')," +
                    "(47,'E-Sports','Indoor',1,'Korea','Youth','No','Faker')," +
                    "(48,'RowingDouble','WaterSport',2,'UK','All','Yes','Carl')," +
                    "(49,'RelayRace','Outdoor',4,'Jamaica','All','Yes','Blake')," +
                    "(50,'LongJump','Outdoor',1,'USA','Adult','Yes','Mike');";

//            Statement statement = connection.createStatement();

//           int rowsAffected =  statement.executeUpdate(insert);
//            System.out.println("rowsAffected--> "+rowsAffected);
            System.out.println("Insertion ended");

            System.out.println("UPDATE started");

            String update1 = "UPDATE sports SET sports_name = 'Cricket' WHERE age_group ='Adult'";
            int u1 = statement.executeUpdate(update1);
            System.out.println("UpdatedRows --> " + u1);

            String update2 = "UPDATE sports SET coach_name = 'Felix' WHERE category = 'Indoor' ";
            int u2 = statement.executeUpdate(update2);
            System.out.println("UpdatedRows --> " + u2);

            String update3 = "UPDATE sports SET age_group = 'Adult' WHERE origin_country = 'USA'";
            int u3 = statement.executeUpdate(update3);
            System.out.println("UpdatedRows --> " + u3);

            String update4 = "UPDATE sports SET sports_name = 'Football' WHERE id = 2";
            int u4 = statement.executeUpdate(update4);
            System.out.println("UpdatedRows --> " + u4);

            System.out.println("UPDATE ended");

            System.out.println("DELETE started");

            String delete = "DELETE FROM sports WHERE id = 5";
            int d1 = statement.executeUpdate(delete);
            System.out.println("rowsAffected --> " + d1);

            String delete3 = "DELETE FROM sports WHERE category = 'Indoor'";
            int d3 = statement.executeUpdate(delete3);
            System.out.println("rowsAffected --> " + d3);

       System.out.println("DELETE ended");
            System.out.println("SELECT started");

            System.out.println("Select all rows");
            String selectAll = "SELECT * FROM sports";
            ResultSet rsAll = statement.executeQuery(selectAll);
            while (rsAll.next()) {
                System.out.println(rsAll.getInt("id") + "\t" +
                        rsAll.getString("sports_name") + "\t" +
                        rsAll.getString("category") + "\t" +
                        rsAll.getInt("no_of_players") + "\t" +
                        rsAll.getString("origin_country") + "\t" +
                        rsAll.getString("age_group") + "\t" +
                        rsAll.getString("isolympic_sport") + "\t" +
                        rsAll.getString("coach_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select one row");
            String selectOneRow = "SELECT * FROM sports WHERE id = 1";
            ResultSet rsOneRow = statement.executeQuery(selectOneRow);
            while (rsOneRow.next()) {
                System.out.println(rsOneRow.getInt("id") + "\t" + rsOneRow.getString("sports_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select one row 1 column");
            String selectOneColumn = "SELECT sports_name FROM sports WHERE id = 2";
            ResultSet rsOneColumn = statement.executeQuery(selectOneColumn);
            while (rsOneColumn.next()) {
                System.out.println(rsOneColumn.getString("sports_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select two rows");
            String selectTwoRows = "SELECT * FROM sports LIMIT 2";
            ResultSet rsTwoRows = statement.executeQuery(selectTwoRows);
            while (rsTwoRows.next()) {
                System.out.println(rsTwoRows.getInt("id") + "\t" + rsTwoRows.getString("sports_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select three rows");
            String selectThreeRows = "SELECT * FROM sports LIMIT 3";
            ResultSet rsThreeRows = statement.executeQuery(selectThreeRows);
            while (rsThreeRows.next()) {
                System.out.println(rsThreeRows.getInt("id") + "\t" + rsThreeRows.getString("sports_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select one column all rows");
            String selectOneColumnAll = "SELECT sports_name FROM sports";
            ResultSet rsOneColumnAll = statement.executeQuery(selectOneColumnAll);
            while (rsOneColumnAll.next()) {
                System.out.println(rsOneColumnAll.getString("sports_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select distinct categories");
            String selectDistinct = "SELECT DISTINCT category FROM sports";
            ResultSet rsDistinct = statement.executeQuery(selectDistinct);
            while (rsDistinct.next()) {
                System.out.println(rsDistinct.getString("category"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select count(*)");
            String selectCount = "SELECT COUNT(*) AS total FROM sports";
            ResultSet rsCount = statement.executeQuery(selectCount);
            while (rsCount.next()) {
                System.out.println("Total rows: " + rsCount.getInt("total"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select latest row");
            String selectLatest = "SELECT * FROM sports ORDER BY id DESC LIMIT 1";
            ResultSet rsLatest = statement.executeQuery(selectLatest);
            while (rsLatest.next()) {
                System.out.println(rsLatest.getInt("id") + "\t" + rsLatest.getString("sports_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select 2 max id rows");
            String select2Max = "SELECT * FROM sports ORDER BY id DESC LIMIT 2";
            ResultSet rs2Max = statement.executeQuery(select2Max);
            while (rs2Max.next()) {
                System.out.println(rs2Max.getInt("id") + "\t" + rs2Max.getString("sports_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select 5 min id rows");
            String select5Min = "SELECT * FROM sports ORDER BY id ASC LIMIT 5";
            ResultSet rs5Min = statement.executeQuery(select5Min);
            while (rs5Min.next()) {
                System.out.println(rs5Min.getInt("id") + "\t" + rs5Min.getString("sports_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select oldest row (by no_of_players)");
            String selectOldest = "SELECT * FROM sports ORDER BY no_of_players DESC LIMIT 1";
            ResultSet rsOldest = statement.executeQuery(selectOldest);
            while (rsOldest.next()) {
                System.out.println(rsOldest.getString("sports_name") + " --> Players: " + rsOldest.getInt("no_of_players"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select all rows order by id desc");
            String selectOrderDesc = "SELECT * FROM sports ORDER BY id DESC";
            ResultSet rsOrderDesc = statement.executeQuery(selectOrderDesc);
            while (rsOrderDesc.next()) {
                System.out.println(rsOrderDesc.getInt("id") + "\t" + rsOrderDesc.getString("sports_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select with group by category");
            String selectGroupBy = "SELECT category, COUNT(*) AS total FROM sports GROUP BY category";
            ResultSet rsGroupBy = statement.executeQuery(selectGroupBy);
            while (rsGroupBy.next()) {
                System.out.println(rsGroupBy.getString("category") + " --> " + rsGroupBy.getInt("total"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select with group by category having count > 2");
            String selectGroupByHaving = "SELECT category, COUNT(*) AS total FROM sports GROUP BY category HAVING total > 2";
            ResultSet rsGroupByHaving = statement.executeQuery(selectGroupByHaving);
            while (rsGroupByHaving.next()) {
                System.out.println(rsGroupByHaving.getString("category") + " --> " + rsGroupByHaving.getInt("total"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("SELECT ended");


        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("main ended");
    }
}
