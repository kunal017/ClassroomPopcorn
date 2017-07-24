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
INSERT INTO `moviedetail` VALUES (1,'The Shawshank Redemption',1994,'Action / Crime / Drama',9.3,1083,575868,' Chronicles the experiences of a formerly successful banker as a prisoner in the gloomy jailhouse of Shawshank after being found guilty of a crime he did not commit. The film portrays the man\'s unique way of dealing with his new, torturous life; along the way he befriends a number of fellow prisoners, most notably a wise long-term inmate named Red. ','Frank Darabont','Morgan Freeman as Ellis Boyd \'Red\' Redding / 	Tim Robbins as Andy Dufresne / Clancy Brown as Captain Hadley / Rita Hayworth as Gilda Mundson Farrell','https://3.bp.blogspot.com/dKFFHbf8pFb3BeA7y-kF_P9dyLTeK5XpV4qyj-CoV1RUap4Sd9wqabMCJwsd2qXCnfL2u79ZGw=m22','https://www.youtube.com/embed/NmzuHjWmXOc','https://s-media-cache-ak0.pinimg.com/236x/44/6b/20/446b203829a07ee70125555695a4cfc7--the-shawshank-redemption-movieposter.jpg'),(2,'Hachi: A Dog\'s Tale',2009,'Action / Drama / Family',8.1,250,225968,'In Bedridge, Professor Parker Wilson finds an abandoned dog at the train station and takes it home with the intention of returning the animal to its owner. He finds that the dog is an Akita and names it Hachiko. However, nobody claims the dog so his family decides to keep Hachi.','	Lasse Hallström','Cary-Hiroyuki Tagawa as Ken / 	Richard Gere as Parker Wilson / Joan Allen as Cate Wilson / Sarah Roemer as Andy','https://3.bp.blogspot.com/FRPc7V4tAabHKN78Q3UBFRBfwa1TzGYV1IOrLV0UgF5oweMHEVmzqLBo8fn1PhwAQwYo6dpGDQ=m22','https://www.youtube.com/embed/Y6U7mAnPtw4','https://images-na.ssl-images-amazon.com/images/M/MV5BNGIxZDBjNjAtMDUxMi00YzM3LWIyNzYtZTJjNjNhMzA4NjE2XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SY1000_CR0,0,666,1000_AL_.jpg'),(3,'Into the Wild',2007,'Action / Adventure / Biography / Drama / Romance',8.1,376,306990,'Based on a true story. After graduating from Emory University, Christopher McCandless abandoned his possessions, gave his entire savings account to charity, and hitchhiked to Alaska to live in the wilderness. Along the way, Christopher encounters a series of characters who shape his life.','Sean Penn','Jena Malone as Carine McCandless / Additional Narrator / 	Kristen Stewart as Tracy Tatro / Marcia Gay Harden as Billie McCandless / Merritt Wever as Lori','https://3.bp.blogspot.com/5ftWHacioDFXdhVzhvVk-WR0k5AyaWJZnq8ID4r287te01W6ReL_Dnh49QMY_T-tKtGHLQ5H7Q=m59','https://www.youtube.com/embed/g7ArZ7VD-QQ','https://images-na.ssl-images-amazon.com/images/M/MV5BMTAwNDEyODU1MjheQTJeQWpwZ15BbWU2MDc3NDQwNw@@._V1_UX182_CR0,0,182,268_AL_.jpg'),(4,'The Dark Knight',2008,'Action / Adventure / Crime / Drama / Thriller',9,343,813715,'Set within a year after the events of Batman Begins, Batman, Lieutenant James Gordon, and new district attorney Harvey Dent successfully begin to round up the criminals that plague Gotham City until a mysterious and sadistic criminal mastermind known only as the Joker appears in Gotham, creating a new wave of chaos. Batman\'s struggle against the Joker becomes deeply personal, forcing him to \"confront everything he believes\" and improve his technology to stop him. A love triangle develops between Bruce Wayne, Dent and Rachel Dawes.','	Christopher Nolan','Christian Bale as Bruce / Wayne Cillian Murphy  as Scarecrow / Heath Ledger as Joker','https://nt0pwm.oloadcdn.net/dl/l/qUOnAbXZge-XyfwB/Y2R_4DAXKiA/The.Dark.Knight.2008.720p.BluRay.x264.YIFY.mp4?mime=true','https://www.youtube.com/embed/EXeTwQWrcwY','https://iwiz-movies.c.yimg.jp/c/movies/pict/p/p/75/be/147311_01.jpg'),(5,'Despicable Me',2009,'Action / Adventure / Animation / Comedy / Family',7.7,710,315571,'In a happy suburban neighborhood surrounded by white picket fences with flowering rose bushes, sits a black house with a dead lawn. Unbeknownst to the neighbors, hidden beneath this home is a vast secret hideout. Surrounded by a small army of minions, we discover Gru, planning the biggest heist in the history of the world. He is going to steal the moon. (Yes, the moon!) Gru delights in all things wicked. Armed with his arsenal of shrink rays, freeze rays, and battle-ready vehicles for land and air, he vanquishes all who stand in his way. Until the day he encounters the immense will of three little orphaned girls who look at him and see something that no one else has ever seen: a potential Dad. The world\'s greatest villain has just met his greatest challenge: three little girls named Margo, Edith and Agnes.','Pierre Coffin','Kristen Wiig as Lucy / Kristen Schaal as Shannon / Steve Carell as Gru / Miranda Cosgrove as Margo','https://3.bp.blogspot.com/9fAnjjtCh6KSgoma110HfmUcDboMELU6o9bZVg_IlTKbRF3q2oHHnYA7Ec1s1r9yBfmA-47h=m22','https://www.youtube.com/embed/TZkAcKCFIVo','http://3.bp.blogspot.com/-91TdqHAX2ng/UbrvY35b19I/AAAAAAAAAJk/V9_lsIXXsvw/s1600/23p104344027.jpg');
/*!40000 ALTER TABLE `moviedetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recomendedmovies`
--

DROP TABLE IF EXISTS `recomendedmovies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recomendedmovies` (
  `userId` int(10) NOT NULL,
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
  PRIMARY KEY (`userId`,`movieName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recomendedmovies`
--

LOCK TABLES `recomendedmovies` WRITE;
/*!40000 ALTER TABLE `recomendedmovies` DISABLE KEYS */;
INSERT INTO `recomendedmovies` VALUES (1,'\'The Shawshank Redemption\'',1994,'Action / Crime / Drama',9.3,1083,575868,' Chronicles the experiences of a formerly successful banker as a prisoner in the gloomy jailhouse of Shawshank after being found guilty of a crime he did not commit. The film portrays the man\'s unique way of dealing with his new, torturous life; along the way he befriends a number of fellow prisoners, most notably a wise long-term inmate named Red. ','Frank Darabont','Morgan Freeman as Ellis Boyd \'Red\' Redding / 	Tim Robbins as Andy Dufresne / Clancy Brown as Captain Hadley / Rita Hayworth as Gilda Mundson Farrell','https://3.bp.blogspot.com/dKFFHbf8pFb3BeA7y-kF_P9dyLTeK5XpV4qyj-CoV1RUap4Sd9wqabMCJwsd2qXCnfL2u79ZGw=m22','https://www.youtube.com/embed/NmzuHjWmXOc','https://s-media-cache-ak0.pinimg.com/236x/44/6b/20/446b203829a07ee70125555695a4cfc7--the-shawshank-redemption-movieposter.jpg'),(1,'\'The Shawshank Redemption2\'',1994,'Action / Crime / Drama',9.3,1083,575868,' Chronicles the experiences of a formerly successful banker as a prisoner in the gloomy jailhouse of Shawshank after being found guilty of a crime he did not commit. The film portrays the man\'s unique way of dealing with his new, torturous life; along the way he befriends a number of fellow prisoners, most notably a wise long-term inmate named Red. ','Frank Darabont','Morgan Freeman as Ellis Boyd \'Red\' Redding / 	Tim Robbins as Andy Dufresne / Clancy Brown as Captain Hadley / Rita Hayworth as Gilda Mundson Farrell','https://3.bp.blogspot.com/dKFFHbf8pFb3BeA7y-kF_P9dyLTeK5XpV4qyj-CoV1RUap4Sd9wqabMCJwsd2qXCnfL2u79ZGw=m22','https://www.youtube.com/embed/NmzuHjWmXOc','https://s-media-cache-ak0.pinimg.com/236x/44/6b/20/446b203829a07ee70125555695a4cfc7--the-shawshank-redemption-movieposter.jpg'),(1,'\'The Shawshank Redemption3\'',1994,'Action / Crime / Drama',9.3,1083,575868,' Chronicles the experiences of a formerly successful banker as a prisoner in the gloomy jailhouse of Shawshank after being found guilty of a crime he did not commit. The film portrays the man\'s unique way of dealing with his new, torturous life; along the way he befriends a number of fellow prisoners, most notably a wise long-term inmate named Red. ','Frank Darabont','Morgan Freeman as Ellis Boyd \'Red\' Redding / 	Tim Robbins as Andy Dufresne / Clancy Brown as Captain Hadley / Rita Hayworth as Gilda Mundson Farrell','https://3.bp.blogspot.com/dKFFHbf8pFb3BeA7y-kF_P9dyLTeK5XpV4qyj-CoV1RUap4Sd9wqabMCJwsd2qXCnfL2u79ZGw=m22','https://www.youtube.com/embed/NmzuHjWmXOc','https://s-media-cache-ak0.pinimg.com/236x/44/6b/20/446b203829a07ee70125555695a4cfc7--the-shawshank-redemption-movieposter.jpg'),(1,'\'The Shawshank Redemption4\'',1994,'Action / Crime / Drama',9.3,1083,575868,' Chronicles the experiences of a formerly successful banker as a prisoner in the gloomy jailhouse of Shawshank after being found guilty of a crime he did not commit. The film portrays the man\'s unique way of dealing with his new, torturous life; along the way he befriends a number of fellow prisoners, most notably a wise long-term inmate named Red. ','Frank Darabont','Morgan Freeman as Ellis Boyd \'Red\' Redding / 	Tim Robbins as Andy Dufresne / Clancy Brown as Captain Hadley / Rita Hayworth as Gilda Mundson Farrell','https://3.bp.blogspot.com/dKFFHbf8pFb3BeA7y-kF_P9dyLTeK5XpV4qyj-CoV1RUap4Sd9wqabMCJwsd2qXCnfL2u79ZGw=m22','https://www.youtube.com/embed/NmzuHjWmXOc','https://s-media-cache-ak0.pinimg.com/236x/44/6b/20/446b203829a07ee70125555695a4cfc7--the-shawshank-redemption-movieposter.jpg');
/*!40000 ALTER TABLE `recomendedmovies` ENABLE KEYS */;
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
INSERT INTO `userdetail` VALUES ('shubham','IITRShubham','subm07@gmail.com','aa'),('Shubham Madheysia','madHEYsia','submiitr07@gmail.com','iitr'),('q','q','q@qqq.qq','q');
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

-- Dump completed on 2017-07-24 18:41:53
