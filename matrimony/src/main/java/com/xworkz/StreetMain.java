package com.xworkz;

import com.xworkz.constants.DBConstant;

import java.sql.*;

public class StreetMain {
    public static void main(String[] args) {

        System.out.println("main started");

        try(Connection connection = DriverManager.getConnection(DBConstant.URL.getPropertis(),DBConstant.USERNAME.getPropertis(),DBConstant.PASSWORD.getPropertis());
            Statement statement = connection.createStatement(); ) {

            System.out.println("Connection -->" + connection);
            System.out.println("Insertion started");

            String insert = "INSERT INTO street_info VALUES" +
                    "(1,'MG Road','CBD','Bengaluru','Karnataka',560001,'Trinity Circle',3.2,20.0,'High','Clean','Good')," +
                    "(2,'Brigade Road','CBD','Bengaluru','Karnataka',560025,'Brigade Junction',1.5,18.0,'High','Moderate','Good')," +
                    "(3,'Church Street','CBD','Bengaluru','Karnataka',560001,'Metro Station',1.2,12.0,'Medium','Good','Excellent')," +
                    "(4,'Residency Road','CBD','Bengaluru','Karnataka',560025,'Richmond Circle',2.1,16.0,'Medium','Clean','Good')," +
                    "(5,'Commercial Street','Shivajinagar','Bengaluru','Karnataka',560051,'Police Station',1.0,10.0,'High','Moderate','Average')," +
                    "(6,'Linking Road','Bandra','Mumbai','Maharashtra',400050,'Near Hill Road',2.8,22.0,'High','Good','Good')," +
                    "(7,'Marine Drive Road','South Mumbai','Mumbai','Maharashtra',400002,'Queens Necklace',3.6,30.0,'Medium','Clean','Excellent')," +
                    "(8,'Colaba Causeway','Colaba','Mumbai','Maharashtra',400005,'Gateway of India',1.7,14.0,'High','Moderate','Average')," +
                    "(9,'FC Road','Deccan','Pune','Maharashtra',411004,'Goodluck Cafe',2.4,18.0,'Medium','Good','Good')," +
                    "(10,'JM Road','Shivaji Nagar','Pune','Maharashtra',411005,'Sakal Office',2.2,20.0,'High','Clean','Good')," +
                    "(11,'Banjara Hills Road','Banjara Hills','Hyderabad','Telangana',500034,'LV Prasad Eye Institute',4.1,28.0,'Medium','Good','Excellent')," +
                    "(12,'Hitech City Road','Madhapur','Hyderabad','Telangana',500081,'Cyber Towers',5.0,32.0,'High','Clean','Good')," +
                    "(13,'Charminar Road','Old City','Hyderabad','Telangana',500002,'Charminar',1.5,12.0,'High','Moderate','Average')," +
                    "(14,'Park Street','Central','Kolkata','West Bengal',700016,'Park Hotel',2.6,20.0,'Medium','Good','Good')," +
                    "(15,'Esplanade Road','Chowringhee','Kolkata','West Bengal',700069,'New Market',3.0,24.0,'High','Clean','Good')," +
                    "(16,'VIP Road','Baguiati','Kolkata','West Bengal',700059,'Haldiram',4.5,30.0,'High','Moderate','Average')," +
                    "(17,'RK Salai','Mylapore','Chennai','Tamil Nadu',600004,'Marina Beach',2.8,22.0,'Medium','Clean','Good')," +
                    "(18,'Mount Road','Teynampet','Chennai','Tamil Nadu',600018,'LIC Building',5.0,32.0,'High','Moderate','Average')," +
                    "(19,'Pondy Bazaar Road','T Nagar','Chennai','Tamil Nadu',600017,'Panagal Park',1.8,16.0,'High','Moderate','Average')," +
                    "(20,'Law College Road','Erandwane','Pune','Maharashtra',411004,'SNDT College',3.0,20.0,'Low','Good','Good')," +
                    "(21,'Nehru Road','Vile Parle','Mumbai','Maharashtra',400057,'Station Road',2.2,18.0,'High','Clean','Good')," +
                    "(22,'Sarjapur Road','Sarjapur','Bengaluru','Karnataka',560102,'Wipro Office',8.0,30.0,'High','Moderate','Average')," +
                    "(23,'Bellary Road','Hebbal','Bengaluru','Karnataka',560024,'Airport Road',10.0,35.0,'High','Good','Good')," +
                    "(24,'Baner Road','Baner','Pune','Maharashtra',411045,'Balewadi',3.5,24.0,'Low','Clean','Excellent')," +
                    "(25,'Sinhagad Road','Sinhagad','Pune','Maharashtra',411051,'Sinhagad Fort',6.0,22.0,'High','Moderate','Average')," +
                    "(26,'DLF Phase 3 Road','DLF 3','Gurgaon','Haryana',122010,'Cyber Hub',4.2,26.0,'High','Good','Excellent')," +
                    "(27,'Golf Course Road','Sector 43','Gurgaon','Haryana',122002,'One Horizon',6.0,34.0,'High','Clean','Good')," +
                    "(28,'MG Road','Sector 29','Gurgaon','Haryana',122001,'MGF Mall',3.3,22.0,'High','Moderate','Average')," +
                    "(29,'Anna Salai','Guindy','Chennai','Tamil Nadu',600032,'Guindy Bridge',4.0,28.0,'High','Clean','Good')," +
                    "(30,'Shanti Path','Chanakyapuri','Delhi','Delhi',110021,'Embassy Area',3.5,30.0,'Low','Clean','Excellent')," +
                    "(31,'Ring Road','South Delhi','Delhi','Delhi',110024,'AIIMS',8.5,40.0,'High','Moderate','Good')," +
                    "(32,'Outer Ring Road','Marathahalli','Bengaluru','Karnataka',560037,'Ecospace',12.0,40.0,'High','Moderate','Average')," +
                    "(33,'Queens Road','Vasanth Nagar','Bengaluru','Karnataka',560052,'Coffee Board',1.4,14.0,'Low','Clean','Good')," +
                    "(34,'ITPL Road','Whitefield','Bengaluru','Karnataka',560066,'ITPL',9.0,36.0,'High','Moderate','Average')," +
                    "(35,'Station Road','Majestic','Bengaluru','Karnataka',560009,'Railway Station',2.6,16.0,'High','Moderate','Average')," +
                    "(36,'Lalbagh Road','Lalbagh','Bengaluru','Karnataka',560004,'Garden Gate',3.0,18.0,'Low','Clean','Good')," +
                    "(37,'Hudson Lane','GTB Nagar','Delhi','Delhi',110009,'North Campus',2.0,14.0,'Medium','Moderate','Average')," +
                    "(38,'Dhaula Kuan Road','Delhi Cantonment','Delhi','Delhi',110010,'Army Base',3.5,24.0,'Medium','Clean','Good')," +
                    "(39,'Karol Bagh Road','Karol Bagh','Delhi','Delhi',110005,'Ajmal Khan Road',1.5,12.0,'High','Moderate','Average')," +
                    "(40,'Lajpat Nagar Road','Lajpat Nagar','Delhi','Delhi',110024,'Central Market',1.8,14.0,'High','Moderate','Average')," +
                    "(41,'BKC Road','Bandra East','Mumbai','Maharashtra',400051,'BKC Complex',5.5,28.0,'High','Clean','Excellent')," +
                    "(42,'Sion Trombay Road','Chembur','Mumbai','Maharashtra',400071,'RBK School',4.0,26.0,'Medium','Good','Good')," +
                    "(43,'SV Road','Andheri','Mumbai','Maharashtra',400058,'Andheri Market',6.0,24.0,'High','Moderate','Average')," +
                    "(44,'Hill Road','Bandra','Mumbai','Maharashtra',400050,'St Peters Church',2.3,18.0,'High','Moderate','Average')," +
                    "(45,'Link Road','Malad','Mumbai','Maharashtra',400064,'Inorbit Mall',7.0,30.0,'High','Moderate','Average')," +
                    "(46,'New BEL Road','RMV 2nd Stage','Bengaluru','Karnataka',560054,'MS Ramaiah',3.2,20.0,'Low','Clean','Good')," +
                    "(47,'Sankey Road','Sadashivanagar','Bengaluru','Karnataka',560080,'Sankey Tank',2.0,16.0,'Low','Clean','Excellent')," +
                    "(48,'Kamanahalli Main Road','Kalyan Nagar','Bengaluru','Karnataka',560043,'Café Coffee Day',3.8,20.0,'High','Moderate','Average')," +
                    "(49,'Hosur Road','Bommanahalli','Bengaluru','Karnataka',560068,'Elevated Road',10.0,34.0,'High','Moderate','Average')," +
                    "(50,'Indiranagar 100ft Road','Indiranagar','Bengaluru','Karnataka',560038,'CMH Road',2.5,18.0,'High','Clean','Good')," +
                    "(51,'Mylapore Tank Road','Mylapore','Chennai','Tamil Nadu',600004,'Kapaleeshwarar Temple',1.4,14.0,'Low','Good','Good')," +
                    "(52,'OMR Road','Sholinganallur','Chennai','Tamil Nadu',600119,'Infosys',20.0,40.0,'High','Moderate','Average')," +
                    "(53,'ECR Road','Neelankarai','Chennai','Tamil Nadu',600115,'Beach Side',30.0,26.0,'Low','Clean','Excellent')," +
                    "(54,'Nungambakkam High Road','Nungambakkam','Chennai','Tamil Nadu',600034,'Ispahani Centre',3.0,20.0,'High','Moderate','Average')," +
                    "(55,'Kodambakkam Road','Kodambakkam','Chennai','Tamil Nadu',600024,'Meenakshi College',2.0,16.0,'Medium','Moderate','Good')," +
                    "(56,'College Road','Nungambakkam','Chennai','Tamil Nadu',600034,'Womens College',1.8,14.0,'Medium','Clean','Good')," +
                    "(57,'Chetpet Road','Chetpet','Chennai','Tamil Nadu',600031,'Chetpet Lake',2.2,18.0,'Low','Clean','Excellent')," +
                    "(58,'Ring Road','Ahmedabad','Ahmedabad','Gujarat',380051,'Iscon Circle',15.0,36.0,'High','Good','Good')," +
                    "(59,'SG Highway','Sola','Ahmedabad','Gujarat',380060,'Zydus Hospital',12.0,34.0,'High','Moderate','Average')," +
                    "(60,'Ashram Road','Navrangpura','Ahmedabad','Gujarat',380009,'Sabarmati River',8.0,30.0,'Medium','Good','Good')," +
                    "(61,'VIP Road','Vadodara','Vadodara','Gujarat',390022,'VUDA Circle',4.0,22.0,'Medium','Moderate','Average')," +
                    "(62,'Race Course Road','Vadodara','Vadodara','Gujarat',390007,'Race Course',3.5,20.0,'Low','Clean','Excellent')," +
                    "(63,'Teen Batti Road','Jamnagar','Jamnagar','Gujarat',361001,'City Center',2.1,16.0,'Medium','Moderate','Average')," +
                    "(64,'VIP Road','Raipur','Raipur','Chhattisgarh',492001,'Magneto Mall',5.0,28.0,'Medium','Good','Good')," +
                    "(65,'Gandhi Road','Coimbatore','Coimbatore','Tamil Nadu',641001,'Town Hall',3.0,20.0,'Medium','Moderate','Average')," +
                    "(66,'Avinashi Road','Coimbatore','Coimbatore','Tamil Nadu',641004,'PSG College',10.0,30.0,'High','Moderate','Average')," +
                    "(67,'Race Course Road','Coimbatore','Coimbatore','Tamil Nadu',641018,'Race Club',3.5,18.0,'Low','Clean','Excellent')," +
                    "(68,'Nehru Street','Ram Nagar','Coimbatore','Tamil Nadu',641009,'Gandhipuram',1.8,14.0,'High','Moderate','Average')," +
                    "(69,'Kalavasal Road','Madurai','Madurai','Tamil Nadu',625009,'Kalavasal Junction',3.0,18.0,'Medium','Moderate','Good')," +
                    "(70,'Goripalayam Road','Madurai','Madurai','Tamil Nadu',625002,'Mosque',2.4,16.0,'Medium','Clean','Good')," +
                    "(71,'KK Nagar Road','Madurai','Madurai','Tamil Nadu',625020,'KK Nagar Market',2.2,16.0,'Medium','Moderate','Average')," +
                    "(72,'Thillai Nagar Road','Tiruchirappalli','Trichy','Tamil Nadu',620018,'Thillai Nagar Market',3.5,20.0,'Low','Clean','Excellent')," +
                    "(73,'Gandhi Market Road','Trichy','Trichy','Tamil Nadu',620008,'Main Market',1.8,14.0,'High','Moderate','Average')," +
                    "(74,'BHEL Road','Kailasapuram','Trichy','Tamil Nadu',620014,'BHEL Township',5.2,24.0,'Low','Clean','Good')," +
                    "(75,'Anna Nagar Main Road','Trichy','Trichy','Tamil Nadu',620026,'Anna Nagar Park',2.8,18.0,'Medium','Good','Good');";


//            int rowsAffected = statement.executeUpdate(insert);
//            System.out.println("affectedRows--> " + rowsAffected);

            System.out.println("Insertion ended");

            System.out.println("UPDATE started");

            String update = "UPDATE street_info SET traffic_level='Low' WHERE city='Pune'";
           int rowsAffected = statement.executeUpdate(update);
            System.out.println("rowsAffected -->"+rowsAffected);

            String update1 = "UPDATE street_info SET cleanliness_status='Excellent' WHERE state='Delhi'";
            int rowsAffected1 = statement.executeUpdate(update1);
            System.out.println("rowsAffected -->"+rowsAffected1);

            String update2 = "UPDATE street_info SET road_condition='Poor' WHERE length_km>10";
            int rowsAffected2 = statement.executeUpdate(update2);
            System.out.println("rowsAffected -->"+ rowsAffected2);


            String  update3 = "UPDATE street_info SET width_m=25.0 WHERE area='CBD'";
            int rowsAffected3 = statement.executeUpdate(update3);
            System.out.println("rowsAffected -->"+ rowsAffected3);

            System.out.println("UPDATE ended");

            System.out.println("DELETE started");
            String delete = "DELETE FROM street_info WHERE id=1";
            int rowsDeleted = statement.executeUpdate(delete);
            System.out.println("rowsAffected -->"+ rowsDeleted);

            String delete1 = "DELETE FROM street_info WHERE city='Trichy'";
            int rowsDeleted1 = statement.executeUpdate(delete1);
            System.out.println("rowsAffected -->"+ rowsDeleted1);

            System.out.println("DELETE ended");

            System.out.println("SELECT started");

            System.out.println("Select all rows");
            String selectAll = "SELECT * FROM street_info";
            ResultSet rsAll = statement.executeQuery(selectAll);
            while (rsAll.next()) {
                System.out.println(rsAll.getInt("id") + "\t" +
                        rsAll.getString("street_name") + "\t" +
                        rsAll.getString("area") + "\t" +
                        rsAll.getString("city") + "\t" +
                        rsAll.getString("state") + "\t" +
                        rsAll.getInt("pincode") + "\t" +
                        rsAll.getString("landmark") + "\t" +
                        rsAll.getDouble("length_km") + "\t" +
                        rsAll.getDouble("width_m") + "\t" +
                        rsAll.getString("traffic_level") + "\t" +
                        rsAll.getString("cleanliness_status") + "\t" +
                        rsAll.getString("road_condition"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select one row");
            String selectOneRow = "SELECT * FROM street_info WHERE id=2";
            ResultSet rsOneRow = statement.executeQuery(selectOneRow);
            while (rsOneRow.next()) {
                System.out.println(rsOneRow.getInt("id") + "\t" + rsOneRow.getString("street_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select one row 1 column");
            String selectOneColumn = "SELECT street_name FROM street_info WHERE id=3";
            ResultSet rsOneColumn = statement.executeQuery(selectOneColumn);
            while (rsOneColumn.next()) {
                System.out.println(rsOneColumn.getString("street_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select two rows");
            String selectTwoRows = "SELECT * FROM street_info LIMIT 2";
            ResultSet rsTwoRows = statement.executeQuery(selectTwoRows);
            while (rsTwoRows.next()) {
                System.out.println(rsTwoRows.getInt("id") + "\t" + rsTwoRows.getString("street_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select three rows");
            String selectThreeRows = "SELECT * FROM street_info LIMIT 3";
            ResultSet rsThreeRows = statement.executeQuery(selectThreeRows);
            while (rsThreeRows.next()) {
                System.out.println(rsThreeRows.getInt("id") + "\t" + rsThreeRows.getString("street_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select one column all rows");
            String selectOneColumnAll = "SELECT street_name FROM street_info";
            ResultSet rsOneColumnAll = statement.executeQuery(selectOneColumnAll);
            while (rsOneColumnAll.next()) {
                System.out.println(rsOneColumnAll.getString("street_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select distinct cities");
            String selectDistinct = "SELECT DISTINCT city FROM street_info";
            ResultSet rsDistinct = statement.executeQuery(selectDistinct);
            while (rsDistinct.next()) {
                System.out.println(rsDistinct.getString("city"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select count(*)");
            String selectCount = "SELECT COUNT(*) AS total FROM street_info";
            ResultSet rsCount = statement.executeQuery(selectCount);
            while (rsCount.next()) {
                System.out.println("Total rows: " + rsCount.getInt("total"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select latest row");
            String selectLatest = "SELECT * FROM street_info ORDER BY id DESC LIMIT 1";
            ResultSet rsLatest = statement.executeQuery(selectLatest);
            while (rsLatest.next()) {
                System.out.println(rsLatest.getInt("id") + "\t" + rsLatest.getString("street_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select 2 max id rows");
            String select2Max = "SELECT * FROM street_info ORDER BY id DESC LIMIT 2";
            ResultSet rs2Max = statement.executeQuery(select2Max);
            while (rs2Max.next()) {
                System.out.println(rs2Max.getInt("id") + "\t" + rs2Max.getString("street_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select 5 min id rows");
            String select5Min = "SELECT * FROM street_info ORDER BY id ASC LIMIT 5";
            ResultSet rs5Min = statement.executeQuery(select5Min);
            while (rs5Min.next()) {
                System.out.println(rs5Min.getInt("id") + "\t" + rs5Min.getString("street_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select oldest row (by length_km)");
            String selectOldest = "SELECT * FROM street_info ORDER BY length_km DESC LIMIT 1";
            ResultSet rsOldest = statement.executeQuery(selectOldest);
            while (rsOldest.next()) {
                System.out.println(rsOldest.getString("street_name") + " --> Length: " + rsOldest.getDouble("length_km"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select all rows order by id desc");
            String selectOrderDesc = "SELECT * FROM street_info ORDER BY id DESC";
            ResultSet rsOrderDesc = statement.executeQuery(selectOrderDesc);
            while (rsOrderDesc.next()) {
                System.out.println(rsOrderDesc.getInt("id") + "\t" + rsOrderDesc.getString("street_name"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select with group by city");
            String selectGroupBy = "SELECT city, COUNT(*) AS total FROM street_info GROUP BY city";
            ResultSet rsGroupBy = statement.executeQuery(selectGroupBy);
            while (rsGroupBy.next()) {
                System.out.println(rsGroupBy.getString("city") + " --> " + rsGroupBy.getInt("total"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("Select with group by city having count > 2");
            String selectGroupByHaving = "SELECT city, COUNT(*) AS total FROM street_info GROUP BY city HAVING total > 2";
            ResultSet rsGroupByHaving = statement.executeQuery(selectGroupByHaving);
            while (rsGroupByHaving.next()) {
                System.out.println(rsGroupByHaving.getString("city") + " --> " + rsGroupByHaving.getInt("total"));
            }
            System.out.println("-------------------------------------------------------");

            System.out.println("SELECT ended");



        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("main ended");
    }
}
