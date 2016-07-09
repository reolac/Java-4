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
-- Table structure for table `area_c_house_home_and_daily_routine`
--

DROP TABLE IF EXISTS `area_c_house_home_and_daily_routine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `area_c_house_home_and_daily_routine` (
  `word_id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(45) DEFAULT NULL,
  `german_word` varchar(60) NOT NULL,
  `german_word_type` varchar(8) DEFAULT NULL,
  `english_word` varchar(60) NOT NULL,
  PRIMARY KEY (`word_id`)
) ENGINE=InnoDB AUTO_INCREMENT=515 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `area_c_house_home_and_daily_routine`
--

LOCK TABLES `area_c_house_home_and_daily_routine` WRITE;
/*!40000 ALTER TABLE `area_c_house_home_and_daily_routine` DISABLE KEYS */;
INSERT INTO `area_c_house_home_and_daily_routine` VALUES (1,'TOH','angenehm',NULL,'pleasant'),(2,'TOH','Bad','n','bath'),(3,'TOH','Badewanne','f','bath tub'),(4,'TOH','Badezimmer','n','bathroom'),(5,'TOH','Bauernhof','m','farm'),(6,'TOH','Bett','n','bed'),(7,'TOH','bequem',NULL,'comfortable'),(8,'TOH','Boden','m','floor'),(9,'TOH','Bratpfanne','f','frying pan'),(10,'TOH','Büro','n','office'),(11,'TOH','Dach','n','roof'),(12,'TOH','Decke','f','ceiling'),(13,'TOH','Decke','f','blanket'),(14,'TOH','Dosenöffner','m','tin opener'),(15,'TOH','duschen',NULL,'to shower'),(16,'TOH','Einfamilienhaus','n','detached house'),(17,'TOH','Erdgeschoss','n','ground floor'),(18,'TOH','Esszimmer','n','dining room'),(19,'TOH','Fenster','n','window'),(20,'TOH','Flaschenöffner','m','bottle opener'),(21,'TOH','Flur','m','hall'),(22,'TOH','Flur','m','hallway'),(23,'TOH','Fußboden','m','floor'),(24,'TOH','Gardine','f','net curtain'),(25,'TOH','Garten','m','garden'),(26,'TOH','Gas','n','gas'),(27,'TOH','Gefrierschrank','m','freezer'),(28,'TOH','Geschirrspülmaschine','f','dishwasher'),(29,'TOH','Glas','n','glass'),(30,'TOH','Hahn','m','tap'),(31,'TOH','Haus','n','house'),(32,'TOH','Herd','m','cooker'),(33,'TOH','im ersten Stock',NULL,'on the first floor'),(34,'TOH','Keller','m','cellar'),(35,'TOH','Klo','n','loo'),(36,'TOH','Küche','f','kitchen'),(37,'TOH','Kühlschrank','m','fridge'),(38,'TOH','leben',NULL,'to live'),(39,'TOH','Licht','n','light'),(40,'TOH','Mauer','f','wall (outside, external)'),(41,'TOH','Messer','n','knife'),(42,'TOH','Mikrowelle','f','microwave'),(43,'TOH','Mikrowellenherd','m','microwave oven'),(44,'TOH','Möbel','pl','furniture'),(45,'TOH','Möbelstück','n','piece of furniture'),(46,'TOH','Pflanze','f','plant'),(47,'TOH','Rasen','m','lawn'),(48,'TOH','Schlafzimmer','n','bedroom'),(49,'TOH','Schlüssel','m','key'),(50,'TOH','Sessel','m','armchair'),(51,'TOH','Sessel','m','easy chair'),(52,'TOH','Sofa','n','sofa'),(53,'TOH','Sofa','n','settee'),(54,'TOH','Spülmaschine','f','dishwasher'),(55,'TOH','Stereoanlage','f','stereo system'),(56,'TOH','Stock','m','storey'),(57,'TOH','Stock','m','floor'),(58,'TOH','Stuhl','m','chair'),(59,'TOH','Tasse','f','cup'),(60,'TOH','Teppichboden','m','fitted carpet'),(61,'TOH','Teppichboden','m','wall-to-wall carpeting'),(62,'TOH','Teppich','m','carpet'),(63,'TOH','Terrasse','f','patio'),(64,'TOH','Terrasse','f','terrace'),(65,'TOH','Tiefkühltruhe','f','freezer'),(66,'TOH','Toilette','f','toilet'),(67,'TOH','Treppe','f','stairs'),(68,'TOH','Tür','f','door'),(69,'TOH','Vorhang','m','curtain'),(70,'TOH','Wand','f','wall (internal, inside)'),(71,'TOH','Waschbecken','n','washbasin'),(72,'TOH','Waschmaschine','f','washing machine'),(73,'TOH','Wasserhahn','m','tap'),(74,'TOH','wohnen',NULL,'to live'),(75,'TOH','Wohnung','f','flat'),(76,'TOH','Wohnzimmer','n','sitting room'),(77,'TOH','Wohnzimmer','n','living room'),(78,'TOH','Zimmer','n','room'),(79,'SFAF','adoptiert',NULL,'adopted'),(80,'SFAF','Adresse','f','address'),(81,'SFAF','alt',NULL,'old'),(82,'SFAF','älter',NULL,'older'),(83,'SFAF','ältest',NULL,'oldest'),(84,'SFAF','angenehm',NULL,'pleasant'),(85,'SFAF','angenehm',NULL,'nice'),(86,'SFAF','angenehm',NULL,'kind'),(87,'SFAF','anstrengend',NULL,'tiring'),(88,'SFAF','Baby','n','baby'),(89,'SFAF','Bart','m','beard'),(90,'SFAF','blau',NULL,'blue'),(91,'SFAF','blond',NULL,'blonde'),(92,'SFAF','braun',NULL,'brown'),(93,'SFAF','Brille','f','glasses'),(94,'SFAF','Brille','f','spectacles'),(95,'SFAF','Bruder','m','brother'),(96,'SFAF','Cousin','m','cousin'),(97,'SFAF','Cousine','f','cousin'),(98,'SFAF','dumm',NULL,'stupid'),(99,'SFAF','dünn',NULL,'thin'),(100,'SFAF','ehrlich',NULL,'honest'),(101,'SFAF','ehrlich',NULL,'decent'),(102,'SFAF','ehrlich',NULL,'fair'),(103,'SFAF','Einzelkind','n','only child'),(104,'SFAF','einzig',NULL,'only'),(105,'SFAF','Eltern','pl','parents'),(106,'SFAF','Familie','f','family'),(107,'SFAF','Familienname','m','surname'),(108,'SFAF','faul',NULL,'lazy'),(109,'SFAF','faulenzen',NULL,'to laze about'),(110,'SFAF','Frau','f','woman'),(111,'SFAF','Frau','f','wife'),(112,'SFAF','Freund','m','friend'),(113,'SFAF','Freundin','f','friend'),(114,'SFAF','freundlich',NULL,'friendly'),(115,'SFAF','freundlich',NULL,'kind'),(116,'SFAF','freundlich',NULL,'nice'),(117,'SFAF','Freundschaft','f','friendship'),(118,'SFAF','geboren',NULL,'born'),(119,'SFAF','geboren sein',NULL,'to be born'),(120,'SFAF','geschieden',NULL,'divorced'),(121,'SFAF','geschwätzig',NULL,'chatty'),(122,'SFAF','geschwätzig',NULL,'talkative'),(123,'SFAF','Glatze','f','bald head'),(124,'SFAF','glücklich',NULL,'happy'),(125,'SFAF','glücklich',NULL,'pleased'),(126,'SFAF','glücklich',NULL,'glad'),(127,'SFAF','Goldfisch','m','goldfish'),(128,'SFAF','groß',NULL,'tall'),(129,'SFAF','groß',NULL,'big'),(130,'SFAF','Großmutter','f','grandmother'),(131,'SFAF','Großvater','m','grandfather'),(132,'SFAF','großzügig',NULL,'generous'),(133,'SFAF','Haar','n','hair'),(134,'SFAF','Haare','pl','hair'),(135,'SFAF','Halbbruder','m','half-brother'),(136,'SFAF','Halbschwester','f','half-sister'),(137,'SFAF','hässlich',NULL,'ugly'),(138,'SFAF','Hausfrau','f','housewife'),(139,'SFAF','Haustier','n','pet'),(140,'SFAF','heiraten',NULL,'to marry'),(141,'SFAF','höflich',NULL,'polite'),(142,'SFAF','hübsch',NULL,'pretty'),(143,'SFAF','Hund','m','dog'),(144,'SFAF','Junge','m','boy'),(145,'SFAF','jünger',NULL,'younger'),(146,'SFAF','kennen lernen',NULL,'to meet'),(147,'SFAF','Kaninchen','n','rabbit'),(148,'SFAF','Katze','f','cat'),(149,'SFAF','kennen',NULL,'to know'),(150,'SFAF','Kind','n','child'),(151,'SFAF','klein',NULL,'small'),(152,'SFAF','klein',NULL,'short'),(153,'SFAF','klug',NULL,'clever'),(154,'SFAF','lachen',NULL,'to laugh'),(155,'SFAF','lang',NULL,'long'),(156,'SFAF','ledig',NULL,'single'),(157,'SFAF','ledig',NULL,'unmarried'),(158,'SFAF','lieben',NULL,'to love'),(159,'SFAF','lockig',NULL,'curly'),(160,'SFAF','Mädchen','n','girl'),(161,'SFAF','Mann','m','man'),(162,'SFAF','Mann','m','husband'),(163,'SFAF','Maus','f','mouse'),(164,'SFAF','Meerschweinchen','n','guinea pig'),(165,'SFAF','müde',NULL,'tired'),(166,'SFAF','Müdigkeit',NULL,'tiredness'),(167,'SFAF','Mund','m','mouth'),(168,'SFAF','Mutter','f','mother'),(169,'SFAF','Mutti','f','mum'),(170,'SFAF','Nachbar/in','m/f','neighbour'),(171,'SFAF','Nachname','m','surname'),(172,'SFAF','Name','m','name'),(173,'SFAF','Neffe','m','nephew'),(174,'SFAF','Nichte','f','niece'),(175,'SFAF','Oma','f','grandma'),(176,'SFAF','Onkel','m','uncle'),(177,'SFAF','Opa','m','granddad'),(178,'SFAF','Schildkröte','f','tortoise'),(179,'SFAF','schlank',NULL,'slim'),(180,'SFAF','Schwester','f','sister'),(181,'SFAF','schüchtern',NULL,'shy'),(182,'SFAF','selbstsicher',NULL,'self-confident'),(183,'SFAF','selbstsüchtig',NULL,'selfish'),(184,'SFAF','Sohn','m','son'),(185,'SFAF','sportlich',NULL,'sporty'),(186,'SFAF','Staatsangehörigkeit','f','nationality'),(187,'SFAF','Stimme','f','voice'),(188,'SFAF','süß',NULL,'sweet'),(189,'SFAF','sympathisch',NULL,'nice'),(190,'SFAF','Tante','f','aunt'),(191,'SFAF','teilen','f','to share'),(192,'SFAF','Tochter','f','daughter'),(193,'SFAF','toll',NULL,'mad'),(194,'SFAF','toll',NULL,'crazy'),(195,'SFAF','tot',NULL,'dead'),(196,'SFAF','traurig',NULL,'sad'),(197,'SFAF','treffen',NULL,'to meet'),(198,'SFAF','unartig',NULL,'naughty'),(199,'SFAF','unhöflich',NULL,'rude'),(200,'SFAF','unhöflich',NULL,'impolite'),(201,'SFAF','Vater','m','father'),(202,'SFAF','Vati','m','dad'),(203,'SFAF','verheiratet',NULL,'married'),(204,'SFAF','verliebt sein',NULL,'to be in love'),(205,'SFAF','verlieren',NULL,'to lose'),(206,'SFAF','Verwandte','pl','relatives'),(207,'SFAF','Verwandtschaft','f','relations'),(208,'SFAF','Verwandtschaft','f','relatives'),(209,'SFAF','verwöhnt',NULL,'spoilt'),(210,'SFAF','Vorname','m','first name'),(211,'SFAF','wissen',NULL,'to know'),(212,'SFAF','Zwilling','m','twin'),(213,'HATH','Abfall','m','rubbish'),(214,'HATH','abspülen',NULL,'to wash up'),(215,'HATH','abwaschen',NULL,'to wash up'),(216,'HATH','Anhänger','m','pendant'),(217,'HATH','anziehen','sich','to get dressed'),(218,'HATH','arbeiten',NULL,'to work'),(219,'HATH','Armbanduhr','f','wristwatch'),(220,'HATH','aufräumen',NULL,'to tidy up'),(221,'HATH','aufstehen',NULL,'to get up'),(222,'HATH','aufwachen',NULL,'to wake up'),(223,'HATH','ausgehen',NULL,'to go out'),(224,'HATH','ausmachen',NULL,'to switch off'),(225,'HATH','ausmachen',NULL,'to turn off'),(226,'HATH','Baumwolle','f','cotton'),(227,'HATH','bedienen',NULL,'to serve'),(228,'HATH','Bettdecke','f','blanket'),(229,'HATH','Bettdecke','f','duvet'),(230,'HATH','Bettlaken','n','sheet'),(231,'HATH','Blume','f','flower'),(232,'HATH','Brille','f','glasses'),(233,'HATH','Brille','f','spectacles'),(234,'HATH','bügeln',NULL,'to iron'),(235,'HATH','bürsten',NULL,'to brush'),(236,'HATH','das Bett frisch beziehen',NULL,'to change the bed'),(237,'HATH','das Bett machen',NULL,'to make the bed'),(238,'HATH','Decke','f','blanket'),(239,'HATH','decken',NULL,'to set (the table)'),(240,'HATH','decken',NULL,'lay (the table), to cover'),(241,'HATH','decken',NULL,'to cover'),(242,'HATH','die Zähne putzen','sich','to clean one’s teeth'),(243,'HATH','Dosenöffner','m','can opener'),(244,'HATH','Durst haben',NULL,'to be thirsty'),(245,'HATH','duschen','sich','to shower'),(246,'HATH','eingießen',NULL,'to pour'),(247,'HATH','Einkäufe machen',NULL,'to do one’s shopping'),(248,'HATH','einkaufen gehen',NULL,'to go shopping'),(249,'HATH','ein Paar','n','a couple'),(250,'HATH','ein Paar','n','a pair'),(251,'HATH','Flaschenöffner','m','bottle opener'),(252,'HATH','früh',NULL,'early'),(253,'HATH','frühstücken',NULL,'to have breakfast'),(254,'HATH','Gabel','f','fork'),(255,'HATH','Geschirrspüler','m','dishwasher'),(256,'HATH','Gesicht','n','face'),(257,'HATH','Glas','n','glass'),(258,'HATH','Gürtel','m','belt'),(259,'HATH','Haarbürste','f','hairbrush'),(260,'HATH','Handschuh','m','glove'),(261,'HATH','Handtasche','f','handbag'),(262,'HATH','helfen',NULL,'to help'),(263,'HATH','Hose','f','pair of trousers'),(264,'HATH','Hunger haben',NULL,'to be hungry'),(265,'HATH','ins Bett gehen',NULL,'to go to bed'),(266,'HATH','Jacke','f','jacket'),(267,'HATH','Jeans','pl','jeans'),(268,'HATH','Kaffeemaschine','f','coffee maker'),(269,'HATH','Kleidungsstück','n','garment'),(270,'HATH','Kleidungsstück','n','article of clothing'),(271,'HATH','kochen',NULL,'to cook'),(272,'HATH','Kochtopf','m','saucepan'),(273,'HATH','Kopfkissen','n','pillow'),(274,'HATH','leeren',NULL,'to empty'),(275,'HATH','Lippenstift','m','lipstick'),(276,'HATH','Löffel','m','spoon'),(277,'HATH','manchmal',NULL,'sometimes'),(278,'HATH','Messer','n','knife'),(279,'HATH','mir ist kalt',NULL,'I am cold'),(280,'HATH','mir ist warm',NULL,'I am warm'),(281,'HATH','mir ist warm',NULL,'I am hot'),(282,'HATH','montags',NULL,'on Mondays'),(283,'HATH','dienstags',NULL,'on Tuesdays'),(284,'HATH','morgens',NULL,'in the mornings'),(285,'HATH','Müll','m','rubbish'),(286,'HATH','Müll','m','refuse'),(287,'HATH','Mülleimer','m','dustbin'),(288,'HATH','nach Hause gehen',NULL,'to go home'),(289,'HATH','nach oben gehen',NULL,'to go upstairs'),(290,'HATH','nach unten gehen',NULL,'to go downstairs'),(291,'HATH','nachmittags',NULL,'in the afternoons'),(292,'HATH','oft',NULL,'often'),(293,'HATH','Ohrringe','pl','earrings'),(294,'HATH','Pulli','m','sweater'),(295,'HATH','Pulli','m','pullover'),(296,'HATH','Pullover','m','sweater'),(297,'HATH','Pullover','m','pullover'),(298,'HATH','putzen',NULL,'to clean'),(299,'HATH','rasieren','sich','to shave'),(300,'HATH','Regal','n','shelf'),(301,'HATH','Regal','n','shelving'),(302,'HATH','Ring','m','ring'),(303,'HATH','Sakko','n','jacket'),(304,'HATH','sauber machen',NULL,'to clean'),(305,'HATH','Schlafanzug','m','pyjamas'),(306,'HATH','Schlüsselbund','m','key ring'),(307,'HATH','Schminke','f','makeup'),(308,'HATH','Schüssel','f','bowl'),(309,'HATH','schneiden',NULL,'to cut'),(310,'HATH','Schrank','m','cupboard'),(311,'HATH','Schublade','f','drawer'),(312,'HATH','seiden',NULL,'made of silk'),(313,'HATH','Seife','f','soap'),(314,'HATH','selten',NULL,'rarely'),(315,'HATH','selten',NULL,'rare'),(316,'HATH','Shampoo','n','shampoo'),(317,'HATH','spät',NULL,'late'),(318,'HATH','Spaß haben',NULL,'to have fun'),(319,'HATH','Spaß','machen','to be fun'),(320,'HATH','Spülbecken','n','kitchen sink'),(321,'HATH','Staub saugen',NULL,'to vacuum'),(322,'HATH','Staubsauger','m','vacuum cleaner'),(323,'HATH','Strumpfhose','f','tights'),(324,'HATH','Sweatshirt','n','sweatshirt'),(325,'HATH','T-Shirt','n','T-shirt'),(326,'HATH','Tasse','f','cup'),(327,'HATH','Teller','m','plate'),(328,'HATH','Tischdecke','f','tablecloth'),(329,'HATH','Topf','m','saucepan'),(330,'HATH','Topf','m','pot'),(331,'HATH','Trainingsanzug','m','tracksuit'),(332,'HATH','auf etwas vorbereiten','sich','to get ready for'),(333,'HATH','Uhr','f','watch'),(334,'HATH','Uhr','f','clock'),(335,'HATH','waschen','sich','to wash'),(336,'HATH','wecken',NULL,'to wake'),(337,'HATH','Wecker','m','alarm clock'),(338,'HATH','Zahnbürste','f','toothbrush'),(339,'HATH','zu Hause',NULL,'at home'),(340,'FAD','Abendessen','n','evening meal'),(341,'FAD','Abendessen','n','supper'),(342,'FAD','Aufschnitt','m','assorted sliced cold meats'),(343,'FAD','Ananas','f','pineapple'),(344,'FAD','Apfel','m','apple'),(345,'FAD','Apfelsine','f','orange'),(346,'FAD','Apfelwein','m','cider'),(347,'FAD','Aprikose','f','apricot'),(348,'FAD','Banane','f','banana'),(349,'FAD','bedienen',NULL,'to serve'),(350,'FAD','besser',NULL,'better'),(351,'FAD','Bier','n','beer'),(352,'FAD','Bier vom Fass',NULL,'draft beer'),(353,'FAD','Blumenkohl','m','cauliflower'),(354,'FAD','Blutwurst','f','black pudding'),(355,'FAD','Bonbon','m','sweet'),(356,'FAD','Bratkartoffeln','pl','fried potatoes'),(357,'FAD','Bratwurst','f','fried sausage'),(358,'FAD','Brot','n','bread'),(359,'FAD','Brötchen','n','bread roll'),(360,'FAD','Butter','f','butter'),(361,'FAD','Butterbrot','n','sandwich'),(362,'FAD','Champignon','m','mushroom'),(363,'FAD','Chips','pl','crisps'),(364,'FAD','Cola','f','coke'),(365,'FAD','Dose','f','tin'),(366,'FAD','Dose','f','can'),(367,'FAD','Ei','n','egg'),(368,'FAD','Eintopf','m','stew'),(369,'FAD','Eis','n','ice'),(370,'FAD','Eis','n','ice cream'),(371,'FAD','Birne','f','pear'),(372,'FAD','Ente','f','duck'),(373,'FAD','Entenfleisch','n','duck'),(374,'FAD','Erbsen','pl','peas'),(375,'FAD','Erdbeere','f','strawberry'),(376,'FAD','Espresso','m','espresso'),(377,'FAD','essen',NULL,'to eat'),(378,'FAD','Essen','n','food'),(379,'FAD','Essig','m','vinegar'),(380,'FAD','Fisch','m','fish'),(381,'FAD','Fischhändler','m','fishmonger'),(382,'FAD','Fischhändlerin','f','fishmonger'),(383,'FAD','Fleisch','n','meat'),(384,'FAD','fressen',NULL,'to eat'),(385,'FAD','fressen',NULL,'to scoff'),(386,'FAD','frisch',NULL,'fresh'),(387,'FAD','frisch',NULL,'cool'),(388,'FAD','Frühstück','n','breakfast'),(389,'FAD','Frühstückscerealien','pl','breakfast cereals'),(390,'FAD','Gebäck','n','biscuits'),(391,'FAD','Gebäck','n','pastries'),(392,'FAD','Gemüse','n','vegetables'),(393,'FAD','geräuchert',NULL,'smoked'),(394,'FAD','Geschmack','m','flavour'),(395,'FAD','Getränk','n','drink'),(396,'FAD','Glas','n','glass'),(397,'FAD','Gurke','f','cucumber'),(398,'FAD','gut',NULL,'good'),(399,'FAD','Guten Appetit!',NULL,'Enjoy your meal!'),(400,'FAD','Hähnchen','n','chicken'),(401,'FAD','Hammelfleisch','n','mutton'),(402,'FAD','Hauptgericht','n','main course'),(403,'FAD','Himbeere','f','raspberry'),(404,'FAD','Imbiss','m','snack'),(405,'FAD','Joghurt','m','yoghurt'),(406,'FAD','Kaffee','m','coffee'),(407,'FAD','Kaffee und Kuchen',NULL,'coffee and cake'),(408,'FAD','Kalbfleisch','n','veal'),(409,'FAD','Kaninchen','n','rabbit'),(410,'FAD','Kartoffel','f','potato'),(411,'FAD','Karotte','f','carrot'),(412,'FAD','Käse','m','cheese'),(413,'FAD','Käsebrot','n','cheese sandwich'),(414,'FAD','Kirsche','f','cherry'),(415,'FAD','Kohl','m','cabbage'),(416,'FAD','kohlensäurehaltiges Getränk','n','fizzy drink'),(417,'FAD','Konditorei','f','cake shop'),(418,'FAD','Kotelett','n','chop'),(419,'FAD','Kotelett','n','cutlet'),(420,'FAD','Krabbe','f','shrimp'),(421,'FAD','Krabbe','f','prawn'),(422,'FAD','Kuchen','m','cake'),(423,'FAD','kühl',NULL,'cool'),(424,'FAD','Lachs','m','salmon'),(425,'FAD','Lammfleisch','n','lamb'),(426,'FAD','Lebensmittel','pl','food'),(427,'FAD','Lebensmittel','pl','groceries'),(428,'FAD','Leberwurst','f','liver sausage'),(429,'FAD','lecker',NULL,'delicious'),(430,'FAD','lecker',NULL,'tasty'),(431,'FAD','Limonade','f','lemonade'),(432,'FAD','Mahlzeit','f','meal'),(433,'FAD','Marmelade','f','jam'),(434,'FAD','Meeresfrüchte','pl','seafood'),(435,'FAD','Mehl','n','flour'),(436,'FAD','Mineralwasser','n','mineral water'),(437,'FAD','Metzgerei','f','butcher’s'),(438,'FAD','Milch','f','milk'),(439,'FAD','Mittagessen','n','lunch'),(440,'FAD','Muscheln','pl','mussels'),(441,'FAD','Nachspeise','f','dessert'),(442,'FAD','Nudeln','pl','pasta'),(443,'FAD','Nudeln','pl','noodles'),(444,'FAD','Öl','n','oil'),(445,'FAD','Omelett','n','omelette'),(446,'FAD','Orange','f','orange'),(447,'FAD','Pastete','f','paté'),(448,'FAD','Pfannkuchen','m','pancake'),(449,'FAD','Pfeffer','m','pepper'),(450,'FAD','Pfirsich','m','peach'),(451,'FAD','Pflaume','f','plum'),(452,'FAD','Pommes','pl','chips'),(453,'FAD','Frites','pl','fries'),(454,'FAD','Pute','f','turkey'),(455,'FAD','Reis','m','rice'),(456,'FAD','Rettich','m','radish'),(457,'FAD','Rezept','n','recipe'),(458,'FAD','Rindfleisch','n','beef'),(459,'FAD','Rosenkohl','m','sprouts'),(460,'FAD','Rotkohl','m','red cabbage'),(461,'FAD','Rotwein','m','red wine'),(462,'FAD','Saft','m','juice'),(463,'FAD','Sahne','f','cream'),(464,'FAD','Salat','m','lettuce'),(465,'FAD','Salat','m','salad'),(466,'FAD','Salz','n','salt'),(467,'FAD','Sauerbraten','m','marinated beef pot roast'),(468,'FAD','Sauerkraut','n','pickled cabbage'),(469,'FAD','Scheibe','f','slice'),(470,'FAD','Schinken','m','ham'),(471,'FAD','Schinkenbrot','n','ham sandwich'),(472,'FAD','schmecken',NULL,'to taste'),(473,'FAD','Schnitzel','n','escalope'),(474,'FAD','Schokolade','f','chocolate'),(475,'FAD','Schweinebraten','m','joint of pork'),(476,'FAD','Schweinebraten','m','roast pork'),(477,'FAD','Schweinefilet','n','pork fillet'),(478,'FAD','Schweinefleisch','n','pork'),(479,'FAD','Senf','m','mustard'),(480,'FAD','Speck','m','bacon'),(481,'FAD','Speise','f','meal'),(482,'FAD','Speise','f','food'),(483,'FAD','Spiegelei','n','fried egg'),(484,'FAD','Sprudel','m','sparkling mineral water'),(485,'FAD','Stück','n','piece'),(486,'FAD','Suppe','f','soup'),(487,'FAD','süß',NULL,'sweet'),(488,'FAD','Süßigkeiten','pl','sweets'),(489,'FAD','Süßwarengeschäft','n','sweet shop'),(490,'FAD','Tagesgericht','n','today’s special'),(491,'FAD','Tee','m','tea'),(492,'FAD','Thunfisch','m','tuna'),(493,'FAD','Toast','m','toast'),(494,'FAD','Tomate','f','tomato'),(495,'FAD','Torte','f','gateau'),(496,'FAD','Torte','f','flan'),(497,'FAD','Traube','f','grape'),(498,'FAD','trinken',NULL,'to drink'),(499,'FAD','Vegetarier','m','vegetarian'),(500,'FAD','Vegetarierin','f','vegetarian'),(501,'FAD','voll gar',NULL,'well cooked'),(502,'FAD','voll gar',NULL,'well done'),(503,'FAD','Vorspeise','f','starter'),(504,'FAD','Waffel','f','waffle'),(505,'FAD','Wasser','n','water'),(506,'FAD','Wein','m','wine'),(507,'FAD','Weißwein','m','white wine'),(508,'FAD','Wurst','f','sausage'),(509,'FAD','Würstchen','n','little sausage'),(510,'FAD','Würstchen','n','frankfurter sausage'),(511,'FAD','Würstchen','n','hot dog'),(512,'FAD','Zitrone','f','lemon'),(513,'FAD','Zucker','m','sugar'),(514,'FAD','Zwiebel','f','onion');
/*!40000 ALTER TABLE `area_c_house_home_and_daily_routine` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-05-01  2:58:40
