package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SportsMain {

    public static void main(String[] args) {

        System.out.println("main started");

        String url = "jdbc:mysql://localhost:3306/matrimonydb";
        String user = "root";
        String pwd = "Veeresh@2002";

        try {
            Connection connection = DriverManager.getConnection(url, user, pwd);
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

            Statement statement = connection.createStatement();
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

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("main ended");
    }
}
