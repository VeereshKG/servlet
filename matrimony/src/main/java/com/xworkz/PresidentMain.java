package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PresidentMain {
    public static void main(String[] args) {
        System.out.println("main started");

        String url = "jdbc:mysql://localhost:3306/matrimonydb";
        String userName = "root";
        String pwd = "Veeresh@2002";

        try {
            Connection connection = DriverManager.getConnection(url, userName, pwd);
            System.out.println("Connection -->" + connection);

            System.out.println("Insertion started");

            String insert = "INSERT INTO president VALUES" +
                    "(1,'Alexander Grant','USA',58,'Male',2010,2018,'Unity Party','MBA','20 years politics','Economic reforms','Leadership Award','American','New York')," +
                    "(2,'Maria Estevez','Spain',62,'Female',2008,2012,'People Party','PhD History','25 years government','Cultural expansion','Golden Star','Spanish','Madrid')," +
                    "(3,'Kenji Watanabe','Japan',55,'Male',2016,2020,'Progressive Front','Engineering','18 years administration','Technology growth','Nation Pride Medal','Japanese','Tokyo')," +
                    "(4,'Lara Schmidt','Germany',60,'Female',2012,2016,'Freedom Alliance','Masters Sociology','30 years service','Health reforms','Excellence Award','German','Berlin')," +
                    "(5,'Victor Oliveira','Brazil',57,'Male',2014,2018,'Unity Workers','MBA Banking','22 years politics','Agriculture boost','Public Honor','Brazilian','Rio')," +
                    "(6,'Sofia Romano','Italy',61,'Female',2006,2010,'National Front','PhD Philosophy','28 years service','Education upgrade','Honor Shield','Italian','Rome')," +
                    "(7,'Ivan Petrov','Russia',59,'Male',2011,2015,'National Unity','Masters Finance','20 years govt','Economic balance','Presidential Medal','Russian','Moscow')," +
                    "(8,'Adrian Clarke','UK',63,'Male',2013,2017,'Labor Party','Masters Law','25 years parliament','Tax reforms','Royal Star','British','London')," +
                    "(9,'Chen Ming','China',64,'Male',2007,2013,'Central Party','Political Science','30 years leadership','Industrial growth','Dragon Honor','Chinese','Beijing')," +
                    "(10,'Arjun Mehta','India',58,'Male',2014,2019,'Democratic Party','MBA HR','20 years public service','Road development','Bharat Ratna','Indian','Delhi')," +
                    "(11,'Grace Walker','Canada',56,'Female',2015,2020,'Liberal Group','Masters Psychology','18 years policy work','Social welfare','Star of Canada','Canadian','Toronto')," +
                    "(12,'Henry Adams','Australia',60,'Male',2011,2016,'People Coalition','Agriculture Science','25 years govt','Water management','Honor Crest','Australian','Sydney')," +
                    "(13,'Carlos Mendes','Portugal',62,'Male',2010,2014,'Green Party','Masters History','22 years service','Forest rebuilding','Earth Award','Portuguese','Lisbon')," +
                    "(14,'Nora Svensson','Sweden',57,'Female',2013,2018,'People Reform','PhD Literature','20 years welfare','Gender equality','Peace Prize','Swedish','Stockholm')," +
                    "(15,'Ethan Brooks','USA',54,'Male',2018,2024,'Unity Party','Masters Business','15 years politics','Defense upgrades','Liberty Honor','American','Chicago')," +
                    "(16,'Mila Novak','Croatia',59,'Female',2012,2017,'Democratic Force','Masters Law','24 years service','Tourism improvement','Golden Flag','Croatian','Zagreb')," +
                    "(17,'Ruben Flores','Mexico',63,'Male',2009,2015,'National Unity','Masters Economics','30 years govt','Trade expansion','Union Medal','Mexican','Mexico City')," +
                    "(18,'Tanya Kovac','Slovenia',55,'Female',2014,2019,'Reform League','PhD Economics','19 years service','Business support','Merit Star','Slovenian','Ljubljana')," +
                    "(19,'Jin Soo Park','South Korea',58,'Male',2013,2017,'Democratic League','Engineering','22 years leadership','Tech innovation','Korean Medal','Korean','Seoul')," +
                    "(20,'Olivia Müller','Austria',60,'Female',2011,2016,'People Party','PhD Music','27 years welfare','Arts growth','Cultural Medal','Austrian','Vienna')," +
                    "(21,'Samir Khan','Pakistan',61,'Male',2008,2012,'People Movement','Commerce','26 years politics','Energy expansion','National Shield','Pakistani','Lahore')," +
                    "(22,'Hasan Ali','Turkey',57,'Male',2015,2020,'National Alliance','Political Science','20 years govt','Military reforms','Crescent Honor','Turkish','Ankara')," +
                    "(23,'Eva Jansen','Netherlands',56,'Female',2013,2018,'Reform Party','PhD Agriculture','22 years parliament','Farming growth','Green Leaf Medal','Dutch','Amsterdam')," +
                    "(24,'Leo Martin','France',59,'Male',2010,2014,'Republic Group','Masters Law','25 years govt','Railway upgrade','French Star','French','Paris')," +
                    "(25,'Daniel Hart','New Zealand',55,'Male',2016,2020,'Liberal League','PhD Environment','18 years govt','Clean energy success','Ocean Medal','Kiwi','Wellington')," +
                    "(26,'Willem Koch','Belgium',62,'Male',2007,2011,'National Reform','Masters Sociology','30 years parliament','Labour reforms','King Honor','Belgian','Brussels')," +
                    "(27,'Chloe Martin','France',54,'Female',2018,2022,'Republic Group','PhD Politics','15 years service','Equal rights act','Star of Freedom','French','Lyon')," +
                    "(28,'Oscar Pinto','Argentina',63,'Male',2009,2014,'Justice Union','Business Studies','29 years govt','Industrial support','Liberty Cross','Argentinian','Buenos Aires')," +
                    "(29,'Maya Rostov','Ukraine',58,'Female',2012,2016,'People Front','Masters Law','21 years govt','Defense strengthening','Freedom Medal','Ukrainian','Kyiv')," +
                    "(30,'Stefan Weber','Switzerland',60,'Male',2011,2015,'Federal Unity','Banking','28 years politics','Banking reform','Swiss Honor','Swiss','Bern')," +
                    "(31,'Clara Ruiz','Chile',57,'Female',2015,2020,'Reform Party','PhD Sociology','20 years welfare','Education act','National Star','Chilean','Santiago')," +
                    "(32,'Elias Omar','Egypt',62,'Male',2010,2014,'Unity Front','Engineering','27 years politics','Transport development','Desert Honor','Egyptian','Cairo')," +
                    "(33,'Victor Hugo','Peru',61,'Male',2008,2013,'Liberal Front','Business Admin','22 years govt','Mining reforms','Gold Crest','Peruvian','Lima')," +
                    "(34,'Lina Sorenson','Denmark',55,'Female',2014,2019,'Reform League','PhD Humanities','18 years govt','Cultural unity','Peace Shield','Danish','Copenhagen')," +
                    "(35,'George West','USA',53,'Male',2020,2024,'Unity Party','MBA Finance','14 years service','Trade boost','Honor Cross','American','Boston')," +
                    "(36,'Ahmed Faisal','UAE',59,'Male',2011,2016,'Royal Union','Masters Business','24 years govt','Tourism growth','Desert Star','Emirati','Dubai')," +
                    "(37,'Rina Patel','India',58,'Female',2019,2024,'Democratic Party','Masters Economics','16 years public service','Startup boost','Shourya Medal','Indian','Mumbai')," +
                    "(38,'Gabriel Costa','Colombia',62,'Male',2010,2015,'People Action','Law','30 years politics','Healthcare act','Sun Honor','Colombian','Bogota')," +
                    "(39,'Yuichi Sato','Japan',56,'Male',2017,2021,'New Vision','Engineering','20 years leadership','Bullet train upgrade','Tiger Medal','Japanese','Osaka')," +
                    "(40,'Monica Reis','Brazil',57,'Female',2015,2019,'Workers Front','MBA HR','25 years welfare','Women rights act','Brazil Star','Brazilian','Salvador')," +
                    "(41,'Anders Berg','Norway',60,'Male',2009,2013,'Green Movement','Marine Science','26 years service','Ocean protection','Northern Honor','Norwegian','Oslo')," +
                    "(42,'Katarina Novak','Czech Republic',59,'Female',2013,2017,'Reform Union','PhD Politics','21 years govt','Education improvement','Lion Award','Czech','Prague')," +
                    "(43,'Hassan Rahman','Bangladesh',61,'Male',2010,2014,'National Party','Commerce','28 years politics','Flood control','Delta Medal','Bangladeshi','Dhaka')," +
                    "(44,'Miguel Vargas','Venezuela',63,'Male',2008,2013,'Unity Force','Business','24 years service','Oil industry reform','Eagle Honor','Venezuelan','Caracas')," +
                    "(45,'Sangeeta Rao','Sri Lanka',56,'Female',2015,2019,'People Alliance','PhD Sociology','19 years govt','Peace agreement','Island Medal','Sri Lankan','Colombo')," +
                    "(46,'David Cook','Ireland',58,'Male',2012,2016,'Freedom Party','Masters Law','22 years politics','Tax simplification','Celtic Star','Irish','Dublin')," +
                    "(47,'Helena Petrova','Serbia',60,'Female',2010,2014,'Reform League','Masters History','25 years govt','Trade agreements','Honor Crest','Serbian','Belgrade')," +
                    "(48,'Kofi Mensah','Ghana',62,'Male',2008,2012,'People Congress','Agriculture','28 years service','Farm improvement','Africa Medal','Ghanaian','Accra')," +
                    "(49,'Amina Yusuf','Nigeria',55,'Female',2016,2020,'Justice Movement','PhD Education','18 years govt','School development','Golden Eagle','Nigerian','Lagos')," +
                    "(50,'Marco Rossi','Italy',58,'Male',2018,2023,'National Front','MBA','22 years politics','Economic reforms','Crown Medal','Italian','Florence')," +
                    "(51,'Olga Ivanova','Russia',61,'Female',2011,2014,'Unity Party','Masters Physics','26 years govt','Energy reforms','Silver Honor','Russian','St Petersburg')," +
                    "(52,'Robert King','USA',57,'Male',2006,2010,'Republic Group','Law','20 years govt','Market reforms','Freedom Crest','American','Houston')," +
                    "(53,'Farid Zahir','Morocco',63,'Male',2007,2011,'Unity Coalition','Masters Finance','30 years govt','Tourism expansion','Royal Medal','Moroccan','Rabat')," +
                    "(54,'Helena Silva','Portugal',56,'Female',2016,2021,'Green Party','PhD Politics','20 years parliament','Forest act','Earth Shield','Portuguese','Porto')," +
                    "(55,'Adam Wilson','Canada',59,'Male',2012,2017,'Liberal Group','MBA','23 years govt','Employment growth','Star Crest','Canadian','Ottawa')," +
                    "(56,'Selin Kaya','Turkey',57,'Female',2014,2018,'People Alliance','Masters Sociology','21 years service','Women welfare','Crescent Honor','Turkish','Izmir')," +
                    "(57,'Jason Black','Australia',55,'Male',2016,2020,'People Coalition','MBA','19 years govt','Defense funding','Honor Star','Australian','Melbourne')," +
                    "(58,'Maria Gutierrez','Mexico',60,'Female',2009,2013,'National Unity','PhD Administration','28 years govt','Trade reforms','Nation Medal','Mexican','Guadalajara')," +
                    "(59,'Rex Campbell','New Zealand',58,'Male',2011,2015,'Liberal League','Political Science','24 years govt','Green energy','Ocean Crest','Kiwi','Auckland')," +
                    "(60,'Anita Kapoor','India',57,'Female',2015,2020,'Democratic Party','Masters Business','18 years public work','Road renovation','Padma Shri','Indian','Pune')," +
                    "(61,'Carlos Rojas','Chile',62,'Male',2010,2014,'Reform Party','Law','27 years govt','Oil industry reform','Honor Seal','Chilean','Valparaiso')," +
                    "(62,'Jens Muller','Germany',60,'Male',2016,2021,'Freedom Alliance','PhD Chemistry','29 years govt','Medical innovation','Golden Crown','German','Hamburg')," +
                    "(63,'Elena Popescu','Romania',56,'Female',2013,2017,'People Reform','Masters Law','20 years govt','Anti corruption act','Star Medal','Romanian','Bucharest')," +
                    "(64,'Daniel Meyer','Switzerland',59,'Male',2009,2013,'Federal Unity','Banking','28 years govt','Finance boost','Swiss Crest','Swiss','Zurich')," +
                    "(65,'Rosa Delgado','Spain',61,'Female',2012,2016,'People Party','Masters Education','26 years govt','Education act','Golden Leaf','Spanish','Barcelona')," +
                    "(66,'Henry Brown','UK',57,'Male',2015,2019,'Labor Party','Law','24 years service','Infrastructure act','Royal Honor','British','Manchester')," +
                    "(67,'Ahmed Nasser','Egypt',62,'Male',2010,2015,'Unity Front','Engineering','27 years govt','Power grid growth','Desert Medal','Egyptian','Giza')," +
                    "(68,'Paula Ferrer','Argentina',55,'Female',2016,2020,'Justice Union','MBA','18 years govt','Finance act','Sun Medal','Argentinian','Cordoba')," +
                    "(69,'John Miller','USA',54,'Male',2021,2024,'Unity Party','MBA','15 years public service','Startup reforms','Liberty Medal','American','Texas')," +
                    "(70,'Natalia Kozlova','Ukraine',58,'Female',2011,2015,'People Front','PhD Politics','21 years service','Defense expansion','Lion Crest','Ukrainian','Odessa')," +
                    "(71,'Omar Saleh','Saudi Arabia',63,'Male',2008,2013,'Royal Union','Business','30 years govt','Oil export growth','Royal Star','Saudi','Riyadh')," +
                    "(72,'Tamara Ivanic','Croatia',56,'Female',2014,2018,'Democratic Force','PhD Sociology','19 years govt','Tourism promotion','National Star','Croatian','Split')," +
                    "(73,'George Silva','Peru',60,'Male',2013,2017,'Liberal Front','MBA','25 years govt','Mining reforms','Gold Crest','Peruvian','Cusco')," +
                    "(74,'Lilian Scott','Canada',55,'Female',2019,2024,'Liberal Group','Masters Law','17 years govt','Child welfare','Maple Honor','Canadian','Vancouver')," +
                    "(75,'Jorge Castillo','Mexico',62,'Male',2007,2012,'People Congress','History','29 years govt','Agriculture reforms','Sun Crest','Mexican','Monterrey');";

            Statement statement = connection.createStatement();
//            int rowsAffected = statement.executeUpdate(insert);
//            System.out.println("affectedRows--> " + rowsAffected);

            System.out.println("Insertion ended");

            System.out.println("UPDATE started");

            String update = "UPDATE president SET name = 'Alexander G. Grant' WHERE id = 1";
            int executeUpdate = statement.executeUpdate(update);
            System.out.println("UpdatedRows -- >" + executeUpdate);

            String update1 = "UPDATE president SET political_party = 'Reform Union' WHERE id = 10";
            int executeUpdate1 = statement.executeUpdate(update1);
            System.out.println("UpdatedRows -- >" + executeUpdate1);

            String update2 = "UPDATE president SET nationality = 'Canadian' WHERE id = 27";
            int executeUpdate2 = statement.executeUpdate(update2);
            System.out.println("UpdatedRows -- >" + executeUpdate2);

            String update3 = "UPDATE president SET country = 'Japan' WHERE id = 24";
            int executeUpdate3 = statement.executeUpdate(update3);
            System.out.println("UpdatedRows -- >" + executeUpdate3);

            System.out.println("UPDATE ended");

            System.out.println("DELETE started");
            String delete = "DELETE FROM president WHERE id = 5";
            int executeDelete = statement.executeUpdate(delete);
            System.out.println("rowsAffected--> " + executeDelete);

            String delete1 = "DELETE FROM president WHERE country = 'India'";
            int executeDelete1 = statement.executeUpdate(delete1);
            System.out.println("rowsAffected--> " + executeDelete1);

            System.out.println("DELETE ended");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("main ended");
    }
}
