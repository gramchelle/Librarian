-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: lims
-- ------------------------------------------------------
-- Server version	8.3.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=90188 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (90004,'Elif Karagöz','elifkaragoz@gmail.com','ElifKaragoz5.'),(90031,'Kadir Doğan','kadirdogan@gmail.com','Kadir78dogan'),(90035,'Ahmet Yılmaz','ahmetyilmaz@gmail.com','YilmazAhmet67'),(90036,'Mustafa Arslan','mustafaarslan@gmail.com','Mustafa43'),(90041,'Esra Taşkın','esrataskin@gmail.com','Esrataskin1'),(90052,'Tuncay Serbest','tuncayserbest@gmail.com','SerbestTuncay456'),(90055,'Yasemin Toprak','yasemintoprak@gmail.com','Yasemin1234Tprk'),(90057,'Ayşe Kaya','aysekara@gmail.com','Aysekara467'),(90067,'İlayda Özdemir','ilaydaozdemir@gmail.com','ilaydaaa33'),(90069,'Merve Yavuz','merveyavuz@gmail.com','Merve35Yvz*'),(90072,'Barış Şahin','barissahin@gmail.com','Brsshn23'),(90079,'Mehmet Demir','mehmetdemir@gmail.com','MehmetDMR81*'),(90098,'Fatma Çelik','fatmacelik@gmail.com','Celikfatma.123'),(90103,'Hatice Güneş','haticegunes@gmail.com','Hatice123gunes'),(90111,'İsmail Korkmaz','ismailkorkmaz@gmail.com','Ismail2krkmz.'),(90112,'Deniz Yıldız','denizyildiz@gmail.com','DenizYildiz54'),(90113,'Zeynep Tekin','zeyneptekin@gmail.com','Zeyneptekin5'),(90122,'Ebru Arıkan','ebruarikan@gmail.com','Ebruarikan46'),(90124,'Ali Öztürk','aliozturk@gmail.com','Aliozturk.'),(90128,'Onur Can','onurcan@gmail.com','Onurcan467'),(90143,'Nazlı Karadeniz','nazlikaradeniz@gmail.com','Nzlkaradeniz57.'),(90156,'Emine Aksoy','emineaksoy@gmail.com','EmineAksoy123.'),(90165,'Cemal Kara','cemalkara@gmail.com','Karacemal78'),(90167,'Serkan Kocabaş','serkankocabas@gmail.com','Serkankcbs45'),(90176,'İbrahim Yıldırım','ibrahimyildirim@gmail.com','ibrahim34yldrm');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-17 13:31:44
