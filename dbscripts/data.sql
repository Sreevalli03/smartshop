-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: smartshop
-- ------------------------------------------------------
-- Server version	5.7.10-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (7);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES ('101','1','hp','2019-02-02','2022-05-04','2017-05-05','https://images.unsplash.com/photo-1496181133206-80ce9b88a853?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60','Laptop','electronics','55000','1','35'),('103','1','Sony','2019-11-15','2026-06-05','2019-09-03','https://images.unsplash.com/photo-1568200717312-9f9bb27c00f9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60','Headset','Electronics','2500','3','0'),('201','2','LeeCooper','2019-05-09','2022-05-04','2017-05-05','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTyVecP2ceqrcnFRRt5d6HGwORCn_AfJuNPlI2NsZu1Q4iDJdvMoQ&s','Hoodie','Clothing','800','4','75'),('302','3','Vegetables','2019-11-29','2019-12-18','2019-11-28','https://images.unsplash.com/photo-1445282768818-728615cc910a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60','Carrot','Grocery','5','2','150'),('102','1','Apple','2019-11-30','2027-12-24','2019-11-29','https://images.unsplash.com/photo-1509741102003-ca64bfe5f069?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60','iPhone X','Electronics','80000','2','25'),('402','4','IKEA','2019-11-30','2025-12-30','2019-11-28','https://images.unsplash.com/photo-1484101403633-562f891dc89a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60','Sofa','Furniture','25000','2','20'),('401','5','Kurl-On','2019-11-06','2019-11-08','2019-11-07','https://images.unsplash.com/photo-1553114552-c4ece3a33c93?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60','Cushion','Furniture','550','3','20'),('202','2','Van Heusen','2019-11-30','2025-11-30','2019-11-30','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSrV5rAJgHnPSBBE2rahQ4555-Y6AMUpCDfQIqal2g-fSvykBfn&s','Blazer','Clothing','10000','2','10');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `purchase_history`
--

LOCK TABLES `purchase_history` WRITE;
/*!40000 ALTER TABLE `purchase_history` DISABLE KEYS */;
INSERT INTO `purchase_history` VALUES (1,'2019-11-28',2,'101','1'),(2,'2019-11-30',1,'102','sree'),(3,'2019-12-01',2,'102','1'),(4,'2019-12-01',5,'201','1'),(5,'2019-12-01',2,'401','sree'),(6,'2019-12-01',2,'401','sree');
/*!40000 ALTER TABLE `purchase_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'user'),(2,'admin'),(3,'superuser');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('sreevalli','mogulluri',22,'female','9845261257','1','$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK','U','A'),('aadmin3','a',24,'Male','9876543210','admin3','$2a$10$0Ro.qX5a.9XNvf/uUmpv6eIJY009Rh9ooGQfPfvI.HJK70Vkd4FOi','A','D'),('admin4','a',44,'Male','9841256234','admin4','$2a$10$GoJXanexJD.gqYnlRZxJmO6tFz9vWv3SmwghBlm9BzEHNcBK.GVym','A','A'),('manager','m',45,'Male','9012345678','manager','$2a$10$z85RW5cSoU871Egs8M4JTuMM3dnbBrQYuUv2skIEAeSj2rlgelGZy','A','A'),('sree','m',25,'Male','5463451230','sree','$2a$10$qi.6ymzWslBzDBoe0mKnP.B3qUx3mjKVYoTZye.jJAUcC3mxGzFH.','U','A'),('superuser','sree',30,'female','9874521368','superuser','$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK','A','A');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` VALUES (1,'1',1),(3,'sree',1),(6,'manager',2),(7,'superuser',3),(9,'admin3',2),(10,'admin4',2);
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-01 20:02:04
