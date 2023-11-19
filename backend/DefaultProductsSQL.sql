-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: gocart
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Dumping data for table `images`
--

LOCK TABLES `images` WRITE;
/*!40000 ALTER TABLE `images` DISABLE KEYS */;
INSERT INTO `images` VALUES (1,'Monitor Concórdia 23.8 Pol. LED Full HD','Monitor Concórdia 23.8 Pol. LED Full HD','https://images.kabum.com.br/produtos/fotos/sync_mirakl/459542/Monitor-Conc-rdia-23-8-Pol-LED-Full-HD-75Hz-Freesync-HDMI-e-VGA-Com-Vesa-H238f_1698854294_gg.jpg'),(2,'Placa de Vídeo RTX 4060 Ti Eagle ','Placa de Vídeo RTX 4060 Ti Eagle ','https://images.kabum.com.br/produtos/fotos/462167/placa-de-video-rtx-4060-ti-gigabyte-gv-n406teagle-8gd-g10_1684841706_gg.jpg');
/*!40000 ALTER TABLE `images` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'Com uma qualidade de imagem incrível e ótima para o dia a dia, o monitor da concórdia tem tela de 23,8\" led full hd conta com a tela de tecnologia va para você ter cores mais vivas e vibrantes e um maior ângulo de visão. Tudo isso com um tempo de resposta de 5 ms para você obter o melhor em tudo o que faz, seja jogando, trabalhando ou estudando!  ','Monitor Concórdia 23.8 Pol. LED Full HD, 75Hz, Freesync, HDMI e VGA, Com Vesa - H238f',430,1),(2,'O sistema de resfriamento WINDFORCE possui três Coolers exclusivos de 80 mm, com rotação alternada, 3 tubos de calor de cobre composto diretamente na GPU, coolers ativos 3D e resfriamento de tela, que juntos fornecem dissipação de calor de alta eficiência.','Placa de Vídeo RTX 4060 Ti Eagle Gigabyte NVIDIA GeForce, 8 GB GDDR6, DLSS, Ray Tracing - GV-N406TEAGLE-8GD G10',2649,2);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-19 18:52:05
