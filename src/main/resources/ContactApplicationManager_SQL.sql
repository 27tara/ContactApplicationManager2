-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.0.13-rc-nt - Official MySQL binary
-- Server OS:                    Win32
-- HeidiSQL Version:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for rest3
CREATE DATABASE IF NOT EXISTS `rest3` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `rest3`;

-- Dumping structure for table rest3.user
CREATE TABLE IF NOT EXISTS `user` (
  `userId` int(11) NOT NULL auto_increment,
  `addressCity` varchar(255) default NULL,
  `contactNumber` int(11) NOT NULL,
  `name` varchar(255) default NULL,
  PRIMARY KEY  (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table rest3.user: ~6 rows (approximately)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
REPLACE INTO `user` (`userId`, `addressCity`, `contactNumber`, `name`) VALUES
	(1, 'Bhopal', 789516510, 'Tarang'),
	(2, 'Bhopal', 956251560, 'Xyz'),
	(3, 'BHopal', 987654321, 'Lmp'),
	(4, 'Bhopal', 654879123, 'Mno'),
	(5, 'Bhopal', 87654321, 'qwerty123'),
	(6, 'Bhopal', 8765421, 'userAddedData'),
	(7, 'Bhopal', 689516510, 'newUSer'),
	(8, 'Bhopal', 689516510, 'newUSer'),
	(9, 'Bhopal', 8765421, 'AddedByUser'),
	(10, 'Bhopal', 8765421, 'AddedByUser1');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
