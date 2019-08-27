-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.6-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for merchantdb
DROP DATABASE IF EXISTS `merchantdb`;
CREATE DATABASE IF NOT EXISTS `merchantdb` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `merchantdb`;

-- Dumping structure for table merchantdb.enrolledmerchant_tbl
DROP TABLE IF EXISTS `enrolledmerchant_tbl`;
CREATE TABLE IF NOT EXISTS `enrolledmerchant_tbl` (
  `enmerch_id` varchar(20) NOT NULL,
  `merch_id` varchar(20) DEFAULT NULL,
  `accountnumber` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`enmerch_id`),
  KEY `merch_id` (`merch_id`),
  CONSTRAINT `enrolledmerchant_tbl_ibfk_1` FOREIGN KEY (`merch_id`) REFERENCES `merchant_tbl` (`merch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table merchantdb.hibernate_sequence
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_not_cached_value` bigint(21) NOT NULL,
  `minimum_value` bigint(21) NOT NULL,
  `maximum_value` bigint(21) NOT NULL,
  `start_value` bigint(21) NOT NULL COMMENT 'start value when sequences is created or value if RESTART is used',
  `increment` bigint(21) NOT NULL COMMENT 'increment value',
  `cache_size` bigint(21) unsigned NOT NULL,
  `cycle_option` tinyint(1) unsigned NOT NULL COMMENT '0 if no cycles are allowed, 1 if the sequence should begin a new cycle when maximum_value is passed',
  `cycle_count` bigint(21) NOT NULL COMMENT 'How many cycles have been done'
) ENGINE=InnoDB SEQUENCE=1;

-- Data exporting was unselected.
-- Dumping structure for table merchantdb.merchant_tbl
DROP TABLE IF EXISTS `merchant_tbl`;
CREATE TABLE IF NOT EXISTS `merchant_tbl` (
  `merch_id` varchar(20) NOT NULL,
  `merch_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`merch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table merchantdb.transaction_tbl
DROP TABLE IF EXISTS `transaction_tbl`;
CREATE TABLE IF NOT EXISTS `transaction_tbl` (
  `trans_id` varchar(20) NOT NULL,
  `merch_id` varchar(20) DEFAULT NULL,
  `amount` double NOT NULL,
  `accountnumber` varchar(20) NOT NULL,
  `trans_date` date NOT NULL,
  PRIMARY KEY (`trans_id`),
  KEY `merch_id` (`merch_id`),
  CONSTRAINT `transaction_tbl_ibfk_1` FOREIGN KEY (`merch_id`) REFERENCES `merchant_tbl` (`merch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
