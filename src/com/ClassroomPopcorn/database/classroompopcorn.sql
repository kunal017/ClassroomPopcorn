-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: classroompopcorn
-- ------------------------------------------------------
-- Server version	5.7.12-log

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
-- Table structure for table `currentuserlog`
--

DROP TABLE IF EXISTS `currentuserlog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `currentuserlog` (
  `username` varchar(100) NOT NULL,
  `fullName` varchar(100) NOT NULL,
  `loggedIn` varchar(5) NOT NULL,
  PRIMARY KEY (`loggedIn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `currentuserlog`
--

LOCK TABLES `currentuserlog` WRITE;
/*!40000 ALTER TABLE `currentuserlog` DISABLE KEYS */;
INSERT INTO `currentuserlog` VALUES ('q','q','1');
/*!40000 ALTER TABLE `currentuserlog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `moviedetail`
--

DROP TABLE IF EXISTS `moviedetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `moviedetail` (
  `idmovieDetail` int(11) NOT NULL,
  `movieName` varchar(100) NOT NULL,
  `yearOfRelease` int(11) NOT NULL,
  `genre` varchar(100) NOT NULL,
  `IMDB` double NOT NULL,
  `likes` int(11) NOT NULL,
  `downloads` int(11) NOT NULL,
  `description` varchar(5000) NOT NULL,
  `director` varchar(500) NOT NULL,
  `cast` varchar(1000) NOT NULL,
  `movieLink` varchar(1000) NOT NULL,
  `trailerLink` varchar(1000) NOT NULL,
  `ImageURL` varchar(1000) NOT NULL,
  PRIMARY KEY (`idmovieDetail`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `moviedetail`
--

LOCK TABLES `moviedetail` WRITE;
/*!40000 ALTER TABLE `moviedetail` DISABLE KEYS */;
INSERT INTO `moviedetail` VALUES (1,'The Shawshank Redemption',1994,'Action / Crime / Drama',9.3,1083,575868,' Chronicles the experiences of a formerly successful banker as a prisoner in the gloomy jailhouse of Shawshank after being found guilty of a crime he did not commit. The film portrays the man\'s unique way of dealing with his new, torturous life; along the way he befriends a number of fellow prisoners, most notably a wise long-term inmate named Red. ','Frank Darabont','Morgan Freeman as Ellis Boyd \'Red\' Redding / 	Tim Robbins as Andy Dufresne / Clancy Brown as Captain Hadley / Rita Hayworth as Gilda Mundson Farrell','https://1llr41.oloadcdn.net/dl/l/Qt51mm7LjssPkwCm/czvZHnbXbwk/movie_6488.mp4?mime=true&autoplay=1','https://www.youtube.com/watch?v=NmzuHjWmXOc','https://s-media-cache-ak0.pinimg.com/236x/44/6b/20/446b203829a07ee70125555695a4cfc7--the-shawshank-redemption-movieposter.jpg'),(2,'Hachi: A Dog\'s Tale',2009,'Action / Drama / Family',8.1,250,225968,'In Bedridge, Professor Parker Wilson finds an abandoned dog at the train station and takes it home with the intention of returning the animal to its owner. He finds that the dog is an Akita and names it Hachiko. However, nobody claims the dog so his family decides to keep Hachi.','	Lasse Hallström','Cary-Hiroyuki Tagawa as Ken / 	Richard Gere as Parker Wilson / Joan Allen as Cate Wilson / Sarah Roemer as Andy','https://r1---sn-qxa7sn7s.c.drive.google.com/videoplayback?id=50d0ee3f1d7343e8&itag=22&source=webdrive&begin=0&requiressl=yes&mm=30&mn=sn-qxa7sn7s&ms=nxu&mv=m&pl=23&sc=yes&ei=YqdzWaS9B8HioQPNuoDIDg&susci=o-AIrezY8DCftFBoyKx9G7BrjaoA3f0c8XKKfmBNFMdnNpyoE&mime=video/mp4&lmt=1500667698659325&mt=1500751595&ip=103.37.201.45&ipbits=8&expire=1500780514&sparams=ip,ipbits,expire,id,itag,source,requiressl,mm,mn,ms,mv,pl,sc,ei,susci,mime,lmt&signature=B8344178C1B1BEC973B4498D9961202374EEB428.1718216672D835A97301B337D0CF36977767BDEA&key=ck2','https://youtu.be/Y6U7mAnPtw4','https://images-na.ssl-images-amazon.com/images/M/MV5BNGIxZDBjNjAtMDUxMi00YzM3LWIyNzYtZTJjNjNhMzA4NjE2XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SY1000_CR0,0,666,1000_AL_.jpg'),(3,'Into the Wild',2007,'Action / Adventure / Biography / Drama / Romance',8.1,376,306990,'Based on a true story. After graduating from Emory University, Christopher McCandless abandoned his possessions, gave his entire savings account to charity, and hitchhiked to Alaska to live in the wilderness. Along the way, Christopher encounters a series of characters who shape his life.','Sean Penn','Jena Malone as Carine McCandless / Additional Narrator / 	Kristen Stewart as Tracy Tatro / Marcia Gay Harden as Billie McCandless / Merritt Wever as Lori','https://r5---sn-qxa7sn7z.c.drive.google.com/videoplayback?id=f947c85f24222c62&itag=59&source=webdrive&begin=0&requiressl=yes&mm=30&mn=sn-qxa7sn7z&ms=nxu&mv=m&pl=23&sc=yes&ei=IKhzWbD-EoOeowPGzZb4Dw&susci=o-AB24mBLbPCL0ZvYQaJOMS9g-0gps6YzhcEn0ED41PUZoXw4&mime=video/mp4&lmt=1500682212250172&mt=1500751841&ip=103.37.201.45&ipbits=8&expire=1500780704&sparams=ip,ipbits,expire,id,itag,source,requiressl,mm,mn,ms,mv,pl,sc,ei,susci,mime,lmt&signature=9BED0D2028CA22259E1DA0C1A55C88030DEDE820.A407039DE5AB8504C26A81BFBA419DF1E4E0D5&key=ck2','https://youtu.be/g7ArZ7VD-QQ','https://images-na.ssl-images-amazon.com/images/M/MV5BMTAwNDEyODU1MjheQTJeQWpwZ15BbWU2MDc3NDQwNw@@._V1_UX182_CR0,0,182,268_AL_.jpg');
/*!40000 ALTER TABLE `moviedetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userdetail`
--

DROP TABLE IF EXISTS `userdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userdetail` (
  `fullName` varchar(500) NOT NULL,
  `username` varchar(500) NOT NULL,
  `emailId` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userdetail`
--

LOCK TABLES `userdetail` WRITE;
/*!40000 ALTER TABLE `userdetail` DISABLE KEYS */;
INSERT INTO `userdetail` VALUES ('shubham','IITRShubham','subm07@gmail.com','aa'),('Shubham Madheysia','madHEYsia','submiitr07@gmail.com','iitr'),('q','q','q@qqq.qq','q'),('shruti','Shruti Mehta','shruti@gmail.com','shruti');
/*!40000 ALTER TABLE `userdetail` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-24  1:26:17
