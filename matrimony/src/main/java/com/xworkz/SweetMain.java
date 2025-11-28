package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SweetMain {

    public static void main(String[] args) {

        System.out.println("main started");

        String url = "jdbc:mysql://localhost:3306/matrimonydb";
        String userName = "root";
        String pwd = "Veeresh@2002";

        try {
            Connection connection = DriverManager.getConnection(url, userName, pwd);
            System.out.println("Connection -->" + connection);

            System.out.println("Insertion started");
            String insert = "INSERT INTO sweet_info VALUES" +
                    "(1,'MysorePak','Traditional',25.0,'Besan',50,'Haldirams')," +
                    "(2,'Ladoo','Traditional',15.0,'Boondi',40,'AnandSweets')," +
                    "(3,'Jalebi','Fried',20.0,'Sugar',60,'BengalHouse')," +
                    "(4,'Rasgulla','Bengali',30.0,'Milk',45,'BengalHouse')," +
                    "(5,'KajuKatli','Premium',55.0,'Kaju',30,'Haldirams')," +
                    "(6,'Barfi','MilkBased',25.0,'Milk',35,'SweetWorld')," +
                    "(7,'ChamCham','Bengali',28.0,'Milk',25,'BengalHouse')," +
                    "(8,'GulabJamun','Fried',22.0,'Khoya',50,'AnandSweets')," +
                    "(9,'Halwa','Traditional',18.0,'Wheat',48,'Haldirams')," +
                    "(10,'Peda','MilkBased',20.0,'Milk',52,'DharwadPeda')," +
                    "(11,'Kheer','MilkBased',15.0,'Rice',20,'SweetWorld')," +
                    "(12,'Sandesh','Bengali',26.0,'Milk',40,'BengalHouse')," +
                    "(13,'SoanPapdi','Flaky',18.0,'Cardamom',80,'Haldirams')," +
                    "(14,'MotichoorLadoo','Dry',35.0,'Boondi',30,'SweetWorld')," +
                    "(15,'Malpua','Fried',25.0,'Flour',28,'AnandSweets')," +
                    "(16,'Kalkand','SugarCandy',10.0,'Sugar',90,'Haldirams')," +
                    "(17,'PaneerJalebi','Special',40.0,'Paneer',20,'BengalHouse')," +
                    "(18,'Basundi','MilkBased',32.0,'Milk',22,'AnandSweets')," +
                    "(19,'Payasam','SouthIndian',15.0,'Jaggery',25,'SweetWorld')," +
                    "(20,'Obbattu','SouthIndian',12.0,'Dal',30,'Haldirams')," +
                    "(21,'DharwadPeda','Premium',50.0,'Milk',40,'DharwadPeda')," +
                    "(22,'Nankhatai','Baked',14.0,'Wheat',55,'Haldirams')," +
                    "(23,'BadamHalwa','Premium',45.0,'Badam',18,'AnandSweets')," +
                    "(24,'CarrotHalwa','Traditional',20.0,'Carrot',22,'SweetWorld')," +
                    "(25,'DryFruitLadoo','Premium',60.0,'DryFruits',15,'Haldirams')," +
                    "(26,'Chikki','Crunchy',10.0,'Groundnut',70,'AnandSweets')," +
                    "(27,'MilkCake','MilkBased',25.0,'Milk',32,'SweetWorld')," +
                    "(28,'Balushahi','NorthIndian',28.0,'Flour',26,'Haldirams')," +
                    "(29,'KesarPeda','Premium',40.0,'Kesar',35,'Haldirams')," +
                    "(30,'Rabri','MilkBased',30.0,'Milk',18,'SweetWorld')," +
                    "(31,'CoconutBarfi','Traditional',20.0,'Coconut',48,'AnandSweets')," +
                    "(32,'ChocolateBarfi','Modern',22.0,'Chocolate',40,'SweetWorld')," +
                    "(33,'TilLadoo','Traditional',15.0,'Sesame',38,'Haldirams')," +
                    "(34,'PalKova','MilkBased',30.0,'Milk',20,'BengalHouse')," +
                    "(35,'PalkovaSweet','MilkBased',34.0,'Milk',22,'SweetWorld')," +
                    "(36,'DryJamun','Fried',24.0,'Khoya',36,'AnandSweets')," +
                    "(37,'HoneyCake','Bakery',18.0,'Honey',30,'Haldirams')," +
                    "(38,'KesariBath','SouthIndian',10.0,'Rava',45,'SweetWorld')," +
                    "(39,'RavaLadoo','Traditional',12.0,'Rava',52,'Haldirams')," +
                    "(40,'WheatHalwa','Traditional',22.0,'Wheat',28,'SweetWorld')," +
                    "(41,'Athirasam','SouthIndian',18.0,'Jaggery',20,'BengalHouse')," +
                    "(42,'Jangri','SouthIndian',20.0,'UradDal',35,'SweetWorld')," +
                    "(43,'KajuRoll','Premium',55.0,'Kaju',25,'Haldirams')," +
                    "(44,'BombayHalwa','Special',28.0,'Cornflour',22,'AnandSweets')," +
                    "(45,'ElluMittu','SouthIndian',14.0,'Sesame',40,'SweetWorld')," +
                    "(46,'ChumChum','Bengali',26.0,'Milk',28,'BengalHouse')," +
                    "(47,'SweetModak','Festive',20.0,'Coconut',24,'AnandSweets')," +
                    "(48,'Kozhukattai','SouthIndian',12.0,'Rice',32,'SweetWorld')," +
                    "(49,'KheerKadambu','SouthIndian',16.0,'Jaggery',26,'BengalHouse')," +
                    "(50,'BlackHalwa','Kerala',30.0,'Rice',20,'Haldirams')," +
                    "(51,'BananaHalwa','Traditional',18.0,'Banana',22,'SweetWorld')," +
                    "(52,'RoseMilkCake','Modern',24.0,'Rose',30,'AnandSweets')," +
                    "(53,'PistaBarfi','Premium',50.0,'Pista',20,'Haldirams')," +
                    "(54,'DatesLadoo','Healthy',45.0,'Dates',18,'SweetWorld')," +
                    "(55,'DryFruitBurfi','Premium',55.0,'DryFruits',15,'Haldirams')," +
                    "(56,'KesariLadoo','SouthIndian',14.0,'Rava',40,'AnandSweets')," +
                    "(57,'MilkMysorePak','MilkBased',28.0,'Milk',20,'SweetWorld')," +
                    "(58,'GheeMysorePak','Premium',45.0,'Ghee',22,'Haldirams')," +
                    "(59,'RoyalJalebi','Fried',30.0,'Sugar',26,'SweetWorld')," +
                    "(60,'PaneerBarfi','Modern',26.0,'Paneer',25,'AnandSweets')," +
                    "(61,'KajuApple','Premium',60.0,'Kaju',18,'Haldirams')," +
                    "(62,'KesarBarfi','Premium',35.0,'Kesar',28,'SweetWorld')," +
                    "(63,'CoconutLadoo','Traditional',15.0,'Coconut',35,'AnandSweets')," +
                    "(64,'ChocolateLadoo','Modern',18.0,'Chocolate',40,'SweetWorld')," +
                    "(65,'GulabBurfi','MilkBased',22.0,'Rose',30,'Haldirams')," +
                    "(66,'JaggeryCake','Traditional',16.0,'Jaggery',28,'SweetWorld')," +
                    "(67,'AnjeerBarfi','Premium',55.0,'Anjeer',20,'Haldirams')," +
                    "(68,'DatesBarfi','Healthy',48.0,'Dates',18,'AnandSweets')," +
                    "(69,'OrangeBarfi','Modern',20.0,'Orange',25,'SweetWorld')," +
                    "(70,'PineappleSweet','Modern',18.0,'Pineapple',32,'Haldirams')," +
                    "(71,'AppleHalwa','Modern',22.0,'Apple',26,'SweetWorld')," +
                    "(72,'GheeLadoo','Premium',32.0,'Ghee',28,'AnandSweets')," +
                    "(73,'SabudanaLadoo','Traditional',14.0,'Sabudana',38,'SweetWorld')," +
                    "(74,'MysorePak','Traditional',25.0,'Besan',50,'Haldirams')," +
                    "(75,'RagiLadoo','Healthy',16.0,'Ragi',36,'Haldirams');";

            Statement statement = connection.createStatement();
//            int rowsAffected = statement.executeUpdate(insert);
//            System.out.println("affectedRows--> " + rowsAffected);
            System.out.println("Insertion ended");

            System.out.println("UPDATE started");
            String update = "UPDATE sweet_info SET sweet_name = 'MysorePak Special' WHERE shop_name  = 'AnandSweets'";
           int executeUpdate = statement.executeUpdate(update);
            System.out.println("UpdatedRows -- >"+ executeUpdate);

            String update1 = "UPDATE sweet_info SET sweet_pricel = 10.0 WHERE sweet_id  = 50";
            int executeUpdate1 = statement.executeUpdate(update1);
            System.out.println("UpdatedRows -- >"+ executeUpdate1);

            String update2 = "UPDATE sweet_info SET shop_name = 'Haldirams' WHERE sweet_name  = 'BananaHalwa'";
            int executeUpdate2 = statement.executeUpdate(update2);
            System.out.println("UpdatedRows -- >"+ executeUpdate2);

            String update3 = "UPDATE sweet_info SET sweet_flavor = 'Pista' WHERE sweet_quantity  = 20";
            int executeUpdate3 = statement.executeUpdate(update3);
            System.out.println("UpdatedRows -- >"+ executeUpdate3);
            System.out.println("UPDATE ended");

            String delete = "DELETE from sweet_info WHERE sweet_id = 1";
           int executeDelete =  statement.executeUpdate(delete);
            System.out.println("rowsAffected--> "+executeDelete);

            String delete1 = "DELETE from sweet_info WHERE shop_name = 'BengalHouse'";
            int executeDelete1 =  statement.executeUpdate(delete1);
            System.out.println("rowsAffected--> "+ executeDelete1);

            String delete2 = "DELETE from sweet_info WHERE shop_name = 'AnandSweets'";
            int executeDelete2 =  statement.executeUpdate(delete2);
            System.out.println("rowsAffected--> "+ executeDelete2);

            System.out.println("DELETE ended");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("main ended");
    }
}
