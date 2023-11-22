/*
SQLyog - Free MySQL GUI v5.17
Host - 8.0.33 : Database - dbbank
*********************************************************************
Server version : 8.0.33
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `dbbank`;

USE `dbbank`;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `tbaccount` */

DROP TABLE IF EXISTS `tbaccount`;

CREATE TABLE `tbaccount` (
  `accno` int NOT NULL,
  `cname` varchar(50) DEFAULT NULL,
  `cadd` varchar(50) DEFAULT NULL,
  `cgen` varchar(50) DEFAULT NULL,
  `cmob` varchar(50) DEFAULT NULL,
  `odate` varchar(50) DEFAULT NULL,
  `balance` int DEFAULT NULL,
  PRIMARY KEY (`accno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbaccount` */

insert into `tbaccount` (`accno`,`cname`,`cadd`,`cgen`,`cmob`,`odate`,`balance`) values (1,'Ram','fzr','Male','9000012346','11-08-22',390),(2,'Alia','kkp','Female','9811452610','12-08-22',371),(3,'Veena','ldh','Female','70099886219','15-08-22',390),(4,'Fark','gss','Male','65373','21-04-23',409);

/*Table structure for table `tbadmin` */

DROP TABLE IF EXISTS `tbadmin`;

CREATE TABLE `tbadmin` (
  `admid` varchar(50) NOT NULL,
  `admpwd` varchar(50) DEFAULT NULL,
  `admsecques` varchar(50) DEFAULT NULL,
  `admsecans` varchar(50) DEFAULT NULL,
  `admname` varchar(50) DEFAULT NULL,
  `admadd` varchar(50) DEFAULT NULL,
  `admemail` varchar(50) DEFAULT NULL,
  `admphno` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`admid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbadmin` */

insert into `tbadmin` (`admid`,`admpwd`,`admsecques`,`admsecans`,`admname`,`admadd`,`admemail`,`admphno`) values ('hitin','hitin','place of birth','fzr','hitin','fzr','hitin161@gmail.com','9781617777');

/*Table structure for table `tbtransaction` */

DROP TABLE IF EXISTS `tbtransaction`;

CREATE TABLE `tbtransaction` (
  `transid` int NOT NULL,
  `transsrcaccno` int DEFAULT NULL,
  `transdestaccno` int DEFAULT NULL,
  `transtype` varchar(50) DEFAULT NULL,
  `transamt` int DEFAULT NULL,
  `transdate` varchar(50) DEFAULT NULL,
  `transtime` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`transid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbtransaction` */

insert into `tbtransaction` (`transid`,`transsrcaccno`,`transdestaccno`,`transtype`,`transamt`,`transdate`,`transtime`) values (1,3,-1,'Deposit',400,'15-08-22','06:47:58'),(2,1,-2,'Withdraw',100,'15-08-22','06:48:44'),(3,1,3,'Transfer',200,'15-08-22','06:50:56'),(4,2,1,'Transfer',100,'15-08-22','06:51:16'),(5,1,-1,'Deposit',200,'15-08-22','07:13:48'),(6,3,-1,'Deposit',100,'15-08-22','07:14:11'),(7,2,-2,'Withdraw',100,'15-08-22','07:14:54'),(8,1,2,'Transfer',400,'15-08-22','07:16:05'),(9,2,3,'Transfer',500,'15-08-22','07:26:29'),(10,1,-1,'Deposit',700,'15-08-22','07:27:42'),(11,2,-1,'Deposit',200,'15-08-22','07:29:48'),(12,1,2,'Transfer',200,'15-08-22','07:30:44'),(13,4,-1,'Deposit',100,'21-04-23','09:12:23'),(14,4,-2,'Withdraw',10,'21-04-23','09:12:37'),(15,2,4,'Transfer',19,'21-04-23','09:13:46');

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
