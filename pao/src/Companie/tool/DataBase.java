package Companie.tool;

import java.sql.*;

public class DataBase {
    public static void Hello(){
        try(Connection c= DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "Miruna", "parola");) {
            Statement s=c.createStatement();
            //PRIMA TABELA
            String string= "DROP TABLE rute IF EXISTS";
            s.executeUpdate(string);
            string="CREATE TABLE rute (strada_plecare varchar2(30), nr_plecare number(3), oras_plecare varchar2(30), strada_sosire varchar2(30), nr_sosire number(3), oras_sosire varchar2(30), marca_masina varchar2(10), model_masina varchar2(20), nr_locuri number(2), id_sofer number(5))";
            s.executeUpdate(string);
            string="INSERT INTO rute VALUES('Theodor Pallady',17,'Constanta','Orhideelor',4,'Bucuresti','Mercedes','Tourismo',52,5482)";
            s.executeUpdate(string);
            string="INSERT INTO rute VALUES('Viorelelor',4,'Oradea','Constantin Brancoveanu',7,'Brasov','Volvo','SC7',35,4728)";
            s.executeUpdate(string);
            string="INSERT INTO rute VALUES('Ion Creanga',2,'Cluj','Mihai Bravu',23,'Covasna','Irizar','i6',70,8293)";
            s.executeUpdate(string);
            string="INSERT INTO rute VALUES('Titu Maiorescu',16,'Buzau','Mihail Sadoveanu',19,'Bacau','Volvo','9700',55,9010)";
            s.executeUpdate(string);
            string="INSERT INTO rute VALUES('Crangasi',4,'Suceava','Timpuri noi',32,'Focsani','Scania','Century',70,5453)";
            s.executeUpdate(string);
            string="INSERT INTO rute VALUES('Scolii',8,'Faurei','Prizonierilor',29,'Mangalia','Iveco','Cygnus',65,3456)";
            s.executeUpdate(string);
            string="INSERT INTO rute VALUES('Dambovitei',71,'Timisoara','Tudor Vladimirescu',67,'Arad','Setra','S415',90,8210)";
            s.executeUpdate(string);
            string="INSERT INTO rute VALUES('Gheorghe Duca',10,'Dambovita','Trapezului',6,'Baia Mare','Mercedes','Citaro',67,7432)";
            s.executeUpdate(string);
            string="INSERT INTO rute VALUES('Gheorghe Costin',7,'Galati','Dunarei',7,'Braila','Ivenci','Cygnus',65,2341)";
            s.executeUpdate(string);
            string="INSERT INTO rute VALUES('Afinelor',60,'Teleorman','Tudor Vladimirescu',4,'Roman','Volvo','9700',55,9001)";
            s.executeUpdate(string);

            //A DOUA TABELA
            string="DROP TABLE soferi IF EXISTS";
            s.executeUpdate(string);
            string="CREATE TABLE soferi (nume varchar2(30), strada varchar2(30), numar_strada number(3), id number(5), categorie_permis varchar2(2), experienta number(2))";
            s.executeUpdate(string);
            string="INSERT INTO soferi VALUES('Anton Popa','Orhideelor',17,1564,'C',7)";
            s.executeUpdate(string);
            string="INSERT INTO soferi VALUES('Vlad Stefan','Promenadei',25,6372,'D',5)";
            s.executeUpdate(string);
            string="INSERT INTO soferi VALUES('Mircea Alexandru','Ion Creanga',6,8392,'C',7)";
            s.executeUpdate(string);
            string="INSERT INTO soferi VALUES('Alin Razmerita','Mircea Voda',2,4326,'D',9)";
            s.executeUpdate(string);
            string="INSERT INTO soferi VALUES('George Anania','Roman Voda',54,9402,'B',8)";
            s.executeUpdate(string);
            string="INSERT INTO soferi VALUES('Petru Bandur','Bogdan Dragos',56,4323,'B',18)";
            s.executeUpdate(string);
            string="INSERT INTO soferi VALUES('Radu Sbera','Dr.Hook',10,4164,'B',25)";
            s.executeUpdate(string);
            string="INSERT INTO soferi VALUES('Felix Severin','Ghirlandei',19,7283,'D',2)";
            s.executeUpdate(string);
            string="INSERT INTO soferi VALUES('Emil Zota','Splaiul Independentei',81,1263,'C',4)";
            s.executeUpdate(string);
            string="INSERT INTO soferi VALUES('Claudia Tudorache','Trapezului',11,7001,'C',5)";
            s.executeUpdate(string);
            string="INSERT INTO soferi VALUES('Cristian Popescu','Tudor Vladimirescu',36,2534,'D',1)";
            s.executeUpdate(string);
            string="INSERT INTO soferi VALUES('Marin Ionescu','Mircea Voda',12,4500,'D',6)";
            s.executeUpdate(string);
            string="INSERT INTO soferi VALUES('Ioan Stefanescu','Magnoliei',8,6000,'C',34)";
            s.executeUpdate(string);
            string="INSERT INTO soferi VALUES('Miron Chiriac','Viorelelor',32,4889,'D',8)";
            s.executeUpdate(string);
            string="INSERT INTO soferi VALUES('Dana Cojocariu','Smaranditei',5,5454,'C',5)";
            s.executeUpdate(string);

            //A TREIA TABELA
            string="DROP TABLE personalauxiliar IF EXISTS";
            s.executeUpdate(string);
            string="CREATE TABLE personalauxiliar(nume varchar2(30), strada varchar2(30), nr number(3), id number(5), meserie varchar2(30))";
            s.executeUpdate(string);
            string="INSERT INTO personalauxiliar VALUES('Valerian Simion','Ion Crainicul',8,8221,'Instalator')";
            s.executeUpdate(string);
            string="INSERT INTO personalauxiliar VALUES('Simon Ionescu','Dumbrava Minunata',19,7478,'Mecanic')";
            s.executeUpdate(string);
            string="INSERT INTO personalauxiliar VALUES('Virgil Costel','Sarpelui',29,7339,'Om de serviciu')";
            s.executeUpdate(string);
            string="INSERT INTO personalauxiliar VALUES('Silviu Georgescu','Bulevardul Republicii',54,8392,'Mecanic')";
            s.executeUpdate(string);
            string="INSERT INTO personalauxiliar VALUES('Eduard Cristea','Ecaterina Teodoroiu',8,2722,'Instalator')";
            s.executeUpdate(string);
            string="INSERT INTO personalauxiliar VALUES('Lucian Enea','Ana Blandiana',15,6272,'Om de serviciu')";
            s.executeUpdate(string);
            string="INSERT INTO personalauxiliar VALUES('Mihai Hristei','Anton Pann',21,8888,'Instalator')";
            s.executeUpdate(string);
            string="INSERT INTO personalauxiliar VALUES('Madalin Corbu','George Cojbuc',62,3322,'Om de serviciu')";
            s.executeUpdate(string);
            string="INSERT INTO personalauxiliar VALUES('Florin Enescu','Tudor Arghezi',8,3221,'Mecanic')";
            s.executeUpdate(string);

            //A PATRA TABELA
            string="DROP TABLE sedii IF EXISTS";
            s.executeUpdate(string);
            string="CREATE TABLE sedii(strada varchar2(30), numar number(3), nume varchar2(30), nr_angajeti number(4))";
            s.executeUpdate(string);
            string="INSERT INTO sedii VALUES('Ion Creanga',2,'Ilfov',70)";
            s.executeUpdate(string);
            string="INSERT INTO sedii VALUES('Titu Maiorescu',65,'Teleorman',26)";
            s.executeUpdate(string);
            string="INSERT INTO sedii VALUES('Crangasi',45,'Covasna',40)";
            s.executeUpdate(string);
            string="INSERT INTO sedii VALUES('Scolii',8,'Alba',19)";
            s.executeUpdate(string);
            string="INSERT INTO sedii VALUES('Dambovitei',78,'Vulcani',62)";
            s.executeUpdate(string);
            string="INSERT INTO sedii VALUES('Gheorghe Duca',16,'Timisoara',79)";
            s.executeUpdate(string);
            string="INSERT INTO sedii VALUES('Gheorghe Costin',7,'Caracal',25)";
            s.executeUpdate(string);
            string="INSERT INTO sedii VALUES('Afinelor',60,'Tulcea',20)";
            s.executeUpdate(string);
            string="INSERT INTO sedii VALUES('Teiolor',52,'Galati',40)";
            s.executeUpdate(string);
            string="INSERT INTO sedii VALUES('Caiselor',17,'Maramures',27)";
            s.executeUpdate(string);
            string="INSERT INTO sedii VALUES('Miron Cozma',24,'Arges',35)";
            s.executeUpdate(string);
            string="INSERT INTO sedii VALUES('Miron Costin',23,'Pitesti',18)";
            s.executeUpdate(string);
            string="INSERT INTO sedii VALUES('Renovatorilor',56,'Ploiesti',32)";
            s.executeUpdate(string);
            string="INSERT INTO sedii VALUES('Tamplarilor',17,'Falticeni',50)";
            s.executeUpdate(string);

            //A CINCEA TABELA
            string="DROP TABLE garaje IF EXISTS";
            s.executeUpdate(string);
            string="CREATE TABLE garaje(strada varchar2(30), numar number(3), oras varchar2(15), nr_masini number(3), nr_soferi number(3))";
            s.executeUpdate(string);
            string="INSERT INTO garaje VALUES('Magurele',17,'Arad',10,23)";
            s.executeUpdate(string);
            string="INSERT INTO garaje VALUES('Bradului',60,'Oradea',19,54)";
            s.executeUpdate(string);
            string="INSERT INTO garaje VALUES('Unirii',4,'Bucuresti',103,200)";
            s.executeUpdate(string);
            string="INSERT INTO garaje VALUES('Cimitirului',53,'Constanta',17,50)";
            s.executeUpdate(string);
            string="INSERT INTO garaje VALUES('Therodor Pallady',8,'Piatra Neamt',8,17)";
            s.executeUpdate(string);
            string="INSERT INTO garaje VALUES('Orhideelor',6,'Iasi',10,23)";
            s.executeUpdate(string);
            string="INSERT INTO garaje VALUES('Ceasului',40,'Vaslui',14,30)";
            s.executeUpdate(string);
            string="INSERT INTO garaje VALUES('Profesorului',17,'Caras Severin',29,60)";
            s.executeUpdate(string);
            string="INSERT INTO garaje VALUES('Mihai Eminescu',75,'Timis',29,70)";
            s.executeUpdate(string);
            string="INSERT INTO garaje VALUES('Tudor Vladimirescu',12,'Satu Mare',15,35)";
            s.executeUpdate(string);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}