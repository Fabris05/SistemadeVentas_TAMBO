-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: tambo
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `Codigo` varchar(10) NOT NULL,
  `Producto` varchar(50) DEFAULT NULL,
  `Categoria` varchar(50) DEFAULT NULL,
  `Descripcion` varchar(125) DEFAULT NULL,
  `Stock` int DEFAULT NULL,
  `Precio` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`Codigo`),
  KEY `Categoria` (`Categoria`),
  CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`Categoria`) REFERENCES `categoria` (`Categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES ('P0001','Enrollado de Jamón y Queso \"El Cedro\"','Comidas','1 und',50,8.90),('P0002','Enrollado de Lechón \"El Cedro\"','Comidas','1 und',50,8.50),('P0003','Enrollado de Pollo \"El Cedro\"','Comidas','1 und',50,8.90),('P0004','Pizzas Familiar Americana Tambo','Comidas','2 und Combo',50,25.80),('P0005','Pizzas Familiar Carnivora Tambo','Comidas','2 und Combo',50,25.85),('P0006','Pizzas Familiar Hawaiana Tambo','Comidas','2 und Combo',50,27.80),('P0007','Pizzas Familiar Pepperoni Tambo','Comidas','2 und Combo',50,29.80),('P0008','Empanadas de Pollo + Coca Cola','Comidas','6 empanadas + Coca Cola 1 Lt.',50,11.90),('P0009','Hamburguesa de Res + Inka Cola','Comidas','2 hamburguesas + Inka Cola 1 Lt.',50,7.90),('P0010','Hamburguesa Parrillera + Coca Cola','Comidas','2 hamburguesas + Coca Cola 1 Lt.',50,16.40),('P0011','Empandas Mixtas','Comidas','5 empanadas mixtas',50,8.50),('P0012','Torta Selva Negra','Comidas','2 trozos de torta Selva Negra',50,5.90),('P0013','Arroz Chaufa Tugou','Comidas','1 und',50,3.90),('P0014','Causa Rellena Tugou','Comidas','1 und',50,3.90),('P0015','Pollo Rostizado + Inka Cola','Comidas','1 pollo rostizado + Inka Cola 1 Lt.',50,24.50),('P0016','Cerveza Tres Cruces Lager','Bebidas Alcoholicas','1 botella x 650 ml.',50,5.50),('P0017','Corona Tropical Frutos Rojos','Bebidas Alcoholicas','1 lata x 355 ml.',50,6.90),('P0018','Smirmoff Ice Green Apple','Bebidas Alcoholicas','1 lata x 350 ml.',50,6.90),('P0019','Four Loko Gold','Bebidas Alcoholicas','1 lata x 473 ml.',50,11.00),('P0020','Mikes Hard Lemonade','Bebidas Alcoholicas','1 lata x 355 ml.',50,19.90),('P0021','Cerveza Pilsen Callao Six Pack ','Bebidas Alcoholicas','6 latas x 355 ml.',50,21.90),('P0022','Cerveza Corona Six Pack ','Bebidas Alcoholicas','6 botellas x 355 ml.',50,28.90),('P0023','Cerveza Corona Six Pack ','Bebidas Alcoholicas','6 latas x 355 ml.',50,21.90),('P0024','Cerveza Pilsen Callao Six Pack ','Bebidas Alcoholicas','6 latas x 473 ml.',50,22.90),('P0025','Cerveza Tres Cruces Six Pack','Bebidas Alcoholicas','6 botellas x 355 ml.',50,19.90),('P0026','Cerveza Budweiser Six Pack ','Bebidas Alcoholicas','6 botellas x 343 ml.',50,21.90),('P0027','Cerveza Cristal Six Pack ','Bebidas Alcoholicas','6 latas x 355 ml.',50,17.90);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-04 23:25:36
