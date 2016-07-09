-- MySQL dump 10.13  Distrib 5.6.23, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: deutsche_akademie
-- ------------------------------------------------------
-- Server version	5.7.7-rc-log

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
-- Table structure for table `area_d_the_modern_world`
--

DROP TABLE IF EXISTS `area_d_the_modern_world`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `area_d_the_modern_world` (
  `word_id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(45) DEFAULT NULL,
  `german_word` varchar(60) NOT NULL,
  `german_word_type` varchar(8) DEFAULT NULL,
  `english_word` varchar(60) NOT NULL,
  PRIMARY KEY (`word_id`)
) ENGINE=InnoDB AUTO_INCREMENT=222 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `area_d_the_modern_world`
--

LOCK TABLES `area_d_the_modern_world` WRITE;
/*!40000 ALTER TABLE `area_d_the_modern_world` DISABLE KEYS */;
INSERT INTO `area_d_the_modern_world` VALUES (1,'CAASI','Angriff','m','attack'),(2,'CAASI','arbeitslos',NULL,'unemployed'),(3,'CAASI','bekommen',NULL,'to receive'),(4,'CAASI','besprechen',NULL,'to discuss'),(5,'CAASI','Champion',NULL,'champion'),(6,'CAASI','Meister',NULL,'champion'),(7,'CAASI','Debatte','f','debate'),(8,'CAASI','Demonstration','f','demonstration'),(9,'CAASI','Demonstrant','m','demonstrator'),(10,'CAASI','Demonstrantin','f','demonstrator'),(11,'CAASI','Der Deutsche Filmpreis',NULL,'German ‘Oscar’'),(12,'CAASI','die aktuellen Nachrichten','pl','current affairs'),(13,'CAASI','die aktuellen Nachrichten','pl','news'),(14,'CAASI','die Olympischen Spiele','pl','Olympic Games'),(15,'CAASI','Droge','f','drug'),(16,'CAASI','Drogenkonsum','m','drug-taking'),(17,'CAASI','entdecken',NULL,'to discover'),(18,'CAASI','Entdeckung','f','discovery'),(19,'CAASI','Epidemie','f','epidemic'),(20,'CAASI','Seuche','f','epidemic'),(21,'CAASI','Forscher','m','researcher'),(22,'CAASI','Forscherin','f','researcher'),(23,'CAASI','Grenze','f','border'),(24,'CAASI','harte Drogen',NULL,'hard drugs'),(25,'CAASI','Königin','f','queen'),(26,'CAASI','König','m','king'),(27,'CAASI','(Bürger)krieg','m','(civil) war'),(28,'CAASI','Bürger','m','civil'),(29,'CAASI','krieg','m','war'),(30,'CAASI','Krise','f','crisis'),(31,'CAASI','Medaille','f','medal'),(32,'CAASI','Menschenrechte','pl','human rights'),(33,'CAASI','Nobelpreis','m','Nobel Prize'),(34,'CAASI','Politik','f','politics'),(35,'CAASI','Politik','f','policy'),(36,'CAASI','Preis','m','prize'),(37,'CAASI','Premierminister','m','prime minister'),(38,'CAASI','Premierministerin','f','prime minister'),(39,'CAASI','Rakete','f','rocket'),(40,'CAASI','Soldat','m','soldier'),(41,'CAASI','Soldatin','f','soldier'),(42,'CAASI','Spion','m','spy'),(43,'CAASI','Spionin','f','spy'),(44,'CAASI','Tagesschau','f','television news'),(45,'CAASI','weiche Drogen',NULL,'soft drugs'),(46,'CAASI','Weißes Haus','n','White House'),(47,'CAASI','Weltraum','m','space'),(48,'EI','Angst haben',NULL,'to be afraid'),(49,'EI','(Atom)kraft','f','(nuclear) energy'),(50,'EI','kraft','f','energy'),(51,'EI','Atom','f','nuclear'),(52,'EI','Benzin','n','petrol'),(53,'EI','Dürre','f','drought'),(54,'EI','Energie','f','energy'),(55,'EI','Erdbeben','n','earthquake'),(56,'EI','Erde','f','earth'),(57,'EI','Erde','f','world'),(58,'EI','Erdöl','n','crude oil'),(59,'EI','Erdöl','n','petroleum'),(60,'EI','Erwärmung','f','warming'),(61,'EI','global',NULL,'global'),(62,'EI','Holz','m','wood'),(63,'EI','Holz','m','timber'),(64,'EI','Katastrophe','f','catastrophe'),(65,'EI','Kohle','f','coal'),(66,'EI','Öl','n','oil'),(67,'EI','Ölteppich','m','oil slick'),(68,'EI','ökologisch',NULL,'ecological'),(69,'EI','Opfer','n','victim'),(70,'EI','organisch',NULL,'organic'),(71,'EI','Recycling','n','recycling'),(72,'EI','Regenwald','m','rainforest'),(73,'EI','retten',NULL,'to save'),(74,'EI','sauber',NULL,'clean'),(75,'EI','Sauerregen','m','acid rain'),(76,'EI','schmutzig',NULL,'dirty'),(77,'EI','steigen',NULL,'to go up (temperature)'),(78,'EI','töten',NULL,'to kill'),(79,'EI','Tierart','f','animal species'),(80,'EI','Tornado','m','tornado'),(81,'EI','Treibhauseffekt','m','greenhouse effect'),(82,'EI','Überschwemmung','f','flood'),(83,'EI','Umwelt','f','environment'),(84,'EI','umweltbewusst',NULL,'environmentally aware'),(85,'EI','Verkehr','m','traffic'),(86,'EI','Verkehrsstau','m','traffic jam'),(87,'EI','verschmutzt',NULL,'polluted'),(88,'EI','vom Aussterben bedroht',NULL,'endangered'),(89,'EI','brand','m','fire'),(90,'EI','Wald','m','forest'),(91,'EI','(Wald)brand','m','(forest) fire'),(92,'EI','Welle','f','wave'),(93,'EI','Welt','f','world'),(94,'EI','zerstören',NULL,'to destroy'),(95,'TM','anfangen',NULL,'to begin'),(96,'TM','anfangen',NULL,'start'),(97,'TM','anschauen',NULL,'look at'),(98,'TM','anschauen',NULL,'to watch'),(99,'TM','berühmt',NULL,'famous'),(100,'TM','beschreiben',NULL,'to describe'),(101,'TM','besichtigen',NULL,'to visit'),(102,'TM','besichtigen',NULL,'to look at'),(103,'TM','besichtigen',NULL,'to look around'),(104,'TM','Bilderroman','m','graphic novel'),(105,'TM','buchen',NULL,'to book'),(106,'TM','Dokumentation','f','documentary'),(107,'TM','Doku','f','documentary'),(108,'TM','Eingang','m','entrance'),(109,'TM','Eintritt','m','admission'),(110,'TM','Eintritt','m','entry'),(111,'TM','Eintritt','m','entrance fee'),(112,'TM','Eintrittspreis','m','admission'),(113,'TM','Eintrittspreis','m','entrance fee'),(114,'TM','Ende','n','end'),(115,'TM','enden',NULL,'finish'),(116,'TM','enden',NULL,'to end'),(117,'TM','erwachsen',NULL,'adult'),(118,'TM','Erwachsene','m','adult'),(119,'TM','Erwachsene','f','adult'),(120,'TM','Fan','m','fan'),(121,'TM','fernsehen',NULL,'to watch television'),(122,'TM','Fernsehsendung','f','television programme'),(123,'TM','Fernseher','m','television'),(124,'TM','Gameshow','f','game show'),(125,'TM','Gruselfilm','m','horror film'),(126,'TM','herumzappen',NULL,'to channel hop'),(127,'TM','hören',NULL,'to hear'),(128,'TM','hören',NULL,'to listen to'),(129,'TM','Karte','f','ticket'),(130,'TM','komisch',NULL,'funny'),(131,'TM','Komödie','f','comedy'),(132,'TM','kosten',NULL,'to cost'),(133,'TM','lesen',NULL,'to read'),(134,'TM','Lied','n','song'),(135,'TM','lustig',NULL,'funny'),(136,'TM','lustig',NULL,'amusing'),(137,'TM','mit Untertiteln',NULL,'subtitled'),(138,'TM','Mode','f','fashion'),(139,'TM','Moderator','m','presenter'),(140,'TM','Moderatorin','f','presenter'),(141,'TM','Nachrichten','pl','news'),(142,'TM','Nachrichtensendung','f','news broadcast'),(143,'TM','Nachrichtensprecher','m','newsreader'),(144,'TM','Nachrichtensprecherin','f','newsreader'),(145,'TM','Platz','m','seat'),(146,'TM','Preis','m','price'),(147,'TM','Preisliste','f','list of prices'),(148,'TM','Programm','n','programme'),(149,'TM','Programm','n','channel'),(150,'TM','Prominente','f','celebrity'),(151,'TM','Prominenter','m','celebrity'),(152,'TM','Radio','n','radio'),(153,'TM','Reality-TV','n','reality television'),(154,'TM','romantisch',NULL,'romantic'),(155,'TM','rührend',NULL,'moving'),(156,'TM','Sänger','m','singer'),(157,'TM','Sängerin','f','singer'),(158,'TM','Schauspiel','n','play'),(159,'TM','Schauspieler/in','m/f','actor/actress'),(160,'TM','Seifenoper','f','soap opera'),(161,'TM','Sender','m','broadcaster, station'),(162,'TM','Sendung','f','programme, broadcast'),(163,'TM','Serie','f','series'),(164,'TM','singen',NULL,'to sing'),(165,'TM','Sitcom','f','sitcom'),(166,'TM','Sitz','m','seat'),(167,'TM','Spezialeffekte','pl','special effects'),(168,'TM','(Sport)bericht','m','(sports) report'),(169,'TM','Sport','m','sports'),(170,'TM','bericht','m','report'),(171,'TM','Star','m','star'),(172,'TM','Student','m','student'),(173,'TM','Studentin','f','student'),(174,'TM','synchronisiert',NULL,'dubbed'),(175,'TM','Tagesschau','f','television news'),(176,'TM','Theaterstück','n','play'),(177,'TM','traurig',NULL,'sad'),(178,'TM','Trickfilm','m','cartoon'),(179,'TM','Vorstellung','f','performance'),(180,'TM','Vorstellung','f','showing'),(181,'TM','vorzeigen',NULL,'to show'),(182,'TM','Werbespot','m','advertisement'),(183,'TM','Werbespot','m','advert'),(184,'TM','wie viel',NULL,'how much'),(185,'TM','wie viele',NULL,'how many'),(186,'TM','zeigen',NULL,'to show'),(187,'TM','Zeitung','f','newspaper'),(188,'TM','zuhören',NULL,'to listen'),(189,'ICT','ausschneiden',NULL,'to cut'),(190,'ICT','Bildschirm','m','screen'),(191,'ICT','Bildschirm','m','monitor'),(192,'ICT','Chatroom','m','chat room'),(193,'ICT','chatten',NULL,'to chat'),(194,'ICT','Computer','m','computer'),(195,'ICT','Cursor','m','cursor'),(196,'ICT','downloaden',NULL,'to download'),(197,'ICT','herunterladen',NULL,'to download'),(198,'ICT','DVD-Spieler','m','DVD player'),(199,'ICT','E-mail','f','email'),(200,'ICT','E-mail','n','email'),(201,'ICT','einfügen',NULL,'to paste'),(202,'ICT','Handy','n','mobile phone'),(203,'ICT','helfen',NULL,'to help'),(204,'ICT','hochladen',NULL,'to upload'),(205,'ICT','klicken',NULL,'to click'),(206,'ICT','kopieren',NULL,'to copy'),(207,'ICT','Laptop','m','laptop'),(208,'ICT','Laptop','n','laptop'),(209,'ICT','Maus','f','mouse'),(210,'ICT','Mobiltelefon','n','mobile phone'),(211,'ICT','Musik','f','music'),(212,'ICT','online',NULL,'online'),(213,'ICT','Passwort','n','password'),(214,'ICT','plaudern',NULL,'to chat'),(215,'ICT','Satellitenfernsehen','n','satellite TV'),(216,'ICT','SMS','f','text message'),(217,'ICT','Software','f','software'),(218,'ICT','soziales Netz','n','social network'),(219,'ICT','surfen',NULL,'to surf the internet'),(220,'ICT','Tastatur','f','keyboard'),(221,'ICT','Website','f','website');
/*!40000 ALTER TABLE `area_d_the_modern_world` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-05-01  2:58:39
