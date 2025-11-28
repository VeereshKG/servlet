package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HospitalMain {
    public static void main(String[] args) {

        System.out.println("main started");

        String url = "jdbc:mysql://localhost:3306/matrimonydb";
        String userName = "root";
        String pwd = "Veeresh@2002";

        try {
            Connection connection = DriverManager.getConnection(url, userName, pwd);
            System.out.println("Connection --> " + connection);

            System.out.println("Insertion started");

            String insert = "INSERT INTO hospital VALUES" +
                    "(1,'CityCare Hospital','MultiSpeciality','Bangalore','9876543210',2001,150,'Cardiology,Neurology,Ortho','Dr. Prakash',4.5)," +
                    "(2,'Rainbow Clinic','Children','Mysore','9876501234',2010,80,'Pediatrics,General','Dr. Shalini',4.2)," +
                    "(3,'Apex Hospital','General','Hubli','9876412345',1998,120,'General,Ortho','Dr. Manjunath',4.0)," +
                    "(4,'LifeCare Hospital','MultiSpeciality','Chennai','9876321450',2005,200,'Cardiology,ENT,Ortho','Dr. Venkat',4.6)," +
                    "(5,'Sunrise Hospital','EyeCare','Hyderabad','9876235410',2012,60,'Ophthalmology','Dr. Reddy',4.1)," +
                    "(6,'Narayana Health','MultiSpeciality','Bangalore','8884501234',2000,500,'Cardiology,Oncology','Dr. Devi Shetty',4.9)," +
                    "(7,'Manipal Hospital','MultiSpeciality','Mangalore','7776523410',1995,300,'Cardiology,Ortho,Neuro','Dr. Kumar',4.7)," +
                    "(8,'Columbia Asia','General','Bangalore','9998452100',2004,180,'General,Ortho','Dr. Ajay',4.3)," +
                    "(9,'Fortis Hospital','MultiSpeciality','Delhi','9877896543',2001,400,'Cardiology,Oncology,Neuro','Dr. Singh',4.8)," +
                    "(10,'Apollo Hospital','MultiSpeciality','Chennai','9756321540',1990,450,'Cardiology,Ortho,Nephrology','Dr. Raman',4.9)," +
                    "(11,'Global Hospital','Neuro','Mumbai','9856321001',2011,220,'Neurology,Spine','Dr. Peter',4.4)," +
                    "(12,'KIMS','General','Hyderabad','9956234100',2003,260,'General,Ortho','Dr. Harish',4.2)," +
                    "(13,'Vijaya Hospital','General','Chennai','9988776655',1985,300,'General,Cardiology','Dr. Aravind',4.1)," +
                    "(14,'Sparsh Hospital','Ortho','Bangalore','9090909090',2013,150,'Ortho,Trauma','Dr. Rajesh',4.5)," +
                    "(15,'Sagar Hospital','General','Bangalore','8080808080',2005,200,'General,ENT','Dr. Poornima',4.3)," +
                    "(16,'Jayadeva Hospital','Cardiology','Mysore','9876012345',1996,350,'Cardiology','Dr. Shankar',4.8)," +
                    "(17,'Shatayu Hospital','Ayurveda','Udupi','9876254120',2017,100,'Ayurveda,Naturopathy','Dr. Ravi',4.0)," +
                    "(18,'Nethradhama','EyeCare','Bangalore','9009009009',2008,90,'Ophthalmology','Dr. Sudeep',4.7)," +
                    "(19,'Sanjeevini Clinic','General','Tumkur','9898989898',2015,60,'General','Dr. Ramesh',4.1)," +
                    "(20,'Medplus Hospital','General','Bangalore','9123456780',2020,75,'General,ENT','Dr. Latha',4.0)," +
                    "(21,'Prime Hospital','MultiSpeciality','Mumbai','9561234780',2010,250,'Cardiology,Ortho,ENT','Dr. Fernandes',4.4)," +
                    "(22,'Unity Hospital','General','Bangalore','9234567810',2007,130,'General,Ortho','Dr. Swamy',4.2)," +
                    "(23,'Hope Hospital','CancerCare','Delhi','9345678210',2014,180,'Oncology','Dr. Bose',4.6)," +
                    "(24,'Aster Clinic','General','Kochi','9123450987',2002,160,'General,ENT','Dr. Nair',4.3)," +
                    "(25,'Vasan Eye Care','EyeCare','Mangalore','9001234567',2006,80,'Ophthalmology','Dr. George',4.2)," +
                    "(26,'Healing Touch','General','Pune','9991122334',2010,95,'General','Dr. Vinay',4.1)," +
                    "(27,'GreenLeaf Hospital','Ayurveda','Shimoga','9887766554',2018,120,'Ayurveda,Massage','Dr. Arjun',4.3)," +
                    "(28,'Wellness Clinic','General','Gulbarga','9870001234',2019,70,'General','Dr. Vivek',4.0)," +
                    "(29,'Royal Hospital','MultiSpeciality','Mysore','9877777777',2003,240,'Cardiology,Neuro','Dr. Jacob',4.5)," +
                    "(30,'Capital Hospital','General','Delhi','9899001122',1999,280,'General,Ortho','Dr. Lakshmi',4.3)," +
                    "(31,'Trinity Hospital','Neuro','Bangalore','9888123456',2009,210,'Neuro,Spine','Dr. Mohan',4.4)," +
                    "(32,'NorthStar Hospital','General','Delhi','9005671234',2004,150,'General','Dr. Anil',4.1)," +
                    "(33,'WellCare Hospital','WomenCare','Bangalore','9875612345',2012,140,'Gynecology','Dr. Jyothi',4.5)," +
                    "(34,'Maternity Home','WomenCare','Mangalore','9777123456',1995,110,'Gynecology','Dr. Devika',4.2)," +
                    "(35,'BabyCare Clinic','Children','Pune','9666234511',2018,60,'Pediatrics','Dr. Sneha',4.3)," +
                    "(36,'Smile Dental','Dental','Bangalore','9555123410',2014,30,'Dental','Dr. Praveen',4.4)," +
                    "(37,'Prime Dental','Dental','Chennai','9444234512',2019,40,'Dental','Dr. Karthik',4.2)," +
                    "(38,'Max Health','MultiSpeciality','Hyderabad','9333123411',2001,300,'Cardiology,Ortho,ENT','Dr. Naresh',4.6)," +
                    "(39,'Metro Hospital','General','Delhi','9222123410',2007,190,'General','Dr. Ritu',4.2)," +
                    "(40,'Rural Hospital','General','Hassan','9111123409',1990,100,'General','Dr. Pavan',3.9)," +
                    "(41,'City Clinic','General','Mandya','9001123456',2016,50,'General','Dr. Arun',4.0)," +
                    "(42,'Universal Hospital','MultiSpeciality','Bangalore','9990008888',2008,320,'Cardiology,Neuro,ENT','Dr. Rajeev',4.7)," +
                    "(43,'Star Hospital','General','Hyderabad','9877001122',2011,220,'General,Ortho','Dr. Aditya',4.3)," +
                    "(44,'HopeWell Clinic','General','Chennai','8887001122',2019,90,'General','Dr. Aswin',4.0)," +
                    "(45,'Divine Hospital','Ayurveda','Mysore','7777001122',2017,110,'Ayurveda','Dr. Keshav',4.2)," +
                    "(46,'Remedy Hospital','General','Bijapur','6667001122',2013,130,'General,ENT','Dr. Nagaraj',4.1)," +
                    "(47,'CarePlus Hospital','General','Belgaum','9555001122',2005,180,'General,Ortho','Dr. Milan',4.3)," +
                    "(48,'Lotus Hospital','WomenCare','Bangalore','9333001122',2002,160,'Gynecology','Dr. Shilpa',4.4)," +
                    "(49,'HealingHands Clinic','General','Davangere','9222001122',2018,75,'General','Dr. Krishna',4.0)," +
                    "(50,'Sparsha Hospital','Children','Bangalore','9444001122',2015,90,'Pediatrics','Dr. Megha',4.2);";

            Statement statement = connection.createStatement();
//            int rowsAffected = statement.executeUpdate(insert);
//            System.out.println("rowsAffected--> "+rowsAffected);
            System.out.println("Insertion ended");

            System.out.println("UPDATE started");

            String update = "UPDATE hospital SET rating = 4.9 WHERE id = 10";
            int u1 = statement.executeUpdate(update);
            System.out.println("UpdatedRows --> " + u1);

            String update1 = "UPDATE hospital SET head_doctor = 'Dr. Newly Updated' WHERE id = 25";
            int u2 = statement.executeUpdate(update1);
            System.out.println("UpdatedRows --> " + u2);

            String update2 = "UPDATE hospital SET bed_count = 500 WHERE location = 'Bangalore'";
            int u3 = statement.executeUpdate(update2);
            System.out.println("UpdatedRows --> " + u3);

            String update3 = "UPDATE hospital SET hospital_type = 'SuperSpeciality' WHERE id = 40";
            int u4 = statement.executeUpdate(update3);
            System.out.println("UpdatedRows --> " + u4);

            System.out.println("UPDATE ended");

            System.out.println("DELETE started");

            String delete1 = "DELETE FROM hospital WHERE id = 1";
            int d1 = statement.executeUpdate(delete1);
            System.out.println("rowsAffected --> " + d1);

            String delete2 = "DELETE FROM hospital WHERE location = 'Delhi'";
            int d2 = statement.executeUpdate(delete2);
            System.out.println("rowsAffected --> " + d2);
            System.out.println("DELETE ended");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("main ended");
    }
}
