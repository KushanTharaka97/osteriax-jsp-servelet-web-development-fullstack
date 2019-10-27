-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 26, 2019 at 11:30 PM
-- Server version: 10.1.33-MariaDB
-- PHP Version: 7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `osteriax`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(4) NOT NULL,
  `username` varchar(20) NOT NULL DEFAULT 'uname N/A',
  `nic` varchar(20) NOT NULL DEFAULT 'nic N/A',
  `telnum` varchar(10) NOT NULL DEFAULT 'telnum N/A',
  `email` varchar(30) NOT NULL DEFAULT 'email N/A',
  `pass` varchar(20) NOT NULL DEFAULT 'password N/A',
  `accept` int(3) NOT NULL DEFAULT '0' COMMENT 'decisions in future things ',
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `nic`, `telnum`, `email`, `pass`, `accept`, `time`) VALUES
(6, 'new Admin', '8976345V', '073672890', 'Admin@gmail.com', 'Admin', 0, '2019-10-18 06:58:18'),
(7, 'testAdmin', '96738723V', '033422424', 'adminal@gmail.com', 'admin', 0, '2019-10-18 06:59:34'),
(8, 'bfdb', '456789V', '083726784', 'nalakaPerera@gmail.com', 'eee', 0, '2019-10-18 07:02:27'),
(9, 'Hello', 'bffb', '7868923646', 'nalakaPerera@gmail.com', 'yyy', 0, '2019-10-22 04:55:53');

-- --------------------------------------------------------

--
-- Table structure for table `clinic`
--

CREATE TABLE `clinic` (
  `id` int(20) NOT NULL COMMENT 'id',
  `clinicname` varchar(30) NOT NULL DEFAULT 'clinic N/A' COMMENT 'business name',
  `username` varchar(30) NOT NULL DEFAULT 'user N/A',
  `nic` varchar(20) NOT NULL DEFAULT 'nic N/A',
  `telnum` varchar(15) NOT NULL DEFAULT ' N/A',
  `email` varchar(20) NOT NULL DEFAULT 'email N/A',
  `city` varchar(15) NOT NULL DEFAULT 'city N/A' COMMENT 'city or province',
  `pass` varchar(10) NOT NULL DEFAULT 'pass N/A',
  `accept` int(3) NOT NULL DEFAULT '0' COMMENT 'request scenario',
  `regdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'get registered date '
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clinic`
--

INSERT INTO `clinic` (`id`, `clinicname`, `username`, `nic`, `telnum`, `email`, `city`, `pass`, `accept`, `regdate`) VALUES
(3, 'SunClinic', 'shiromi ', '8673678V', '072345678', 'shiro@gmail.com', 'Colombo', 'shiro', 1, '2019-10-18 01:44:22'),
(8, 'Ijisando', 'vsdvsd', '89922V', '2592951', 'bfxb@gmail.com', 'Trincomalee', 'll', 1, '2019-10-22 04:42:58'),
(85, 'Kils', 'fwefwe', '88625236589V', '4357654869', 'tehtbd', 'Colombo', 'pass N/A', 0, '2019-10-23 14:49:20'),
(966, 'gerA', 'eheth', 'hteh', 'heh', 'thte', 'heh', 'pass N/A', 1, '2019-10-23 14:50:00'),
(967, 'DogClin', 'rty', '98656434V', '01548425648156', 'LAwan@hamail.com', 'Colombo', 'yy', 0, '2019-10-24 10:13:08');

-- --------------------------------------------------------

--
-- Table structure for table `ques`
--

CREATE TABLE `ques` (
  `id` int(5) NOT NULL,
  `user` varchar(20) NOT NULL DEFAULT 'user N/A',
  `question` varchar(120) NOT NULL DEFAULT 'question N/A',
  `acc` int(3) NOT NULL DEFAULT '0',
  `asking` varchar(20) NOT NULL DEFAULT 'Anyone',
  `category` varchar(20) DEFAULT 'no',
  `reply` varchar(150) DEFAULT 'Pending...'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ques`
--

INSERT INTO `ques` (`id`, `user`, `question`, `acc`, `asking`, `category`, `reply`) VALUES
(3, 'user@123', 'How to make vaccination?', 0, 'Anyone', 'no', 'Pending...'),
(9, 'user@345', 'How to Neuter correctly', 0, 'Anyone', '2', 'JK'),
(10, 'vdsv', 'vvvv', 0, 'SunClinic\r\n', '4', 'bfb'),
(889, 'user ', 'question N/A', 0, 'Anyone', '1', 'dqwd'),
(890, 'Sanu', 'How much?', 0, 'SunClinic\r\n', '2', 'hello world'),
(891, 'Sanu', 'How much?', 0, 'SunClinic\r\n', '2', 'Pending...'),
(892, 'ggg', 'ggg', 0, 'SunClinic\r\n', '3', 'Pending...'),
(893, 'Jk rew', 'dcdcdc', 0, 'SunClinic\r\n', '2', 'Pending...'),
(894, 'IOu', 'How to feed my dog', 0, 'Ijisando\r\n', '3', 'Pending...'),
(895, 'jionn', 'I need check up from @sunBark', 0, 'SunClinic\r\n', '2', 'Pending...'),
(896, 'gfnnnfn', 'How was the duration ?', 0, 'Ijisando\r\n', '4', 'fbxbfs'),
(897, 'cdsc', 'cds', 0, 'Ijisando\r\n', '2', 'Pending...'),
(898, 'testing', 'How to feed?', 0, 'Ijisando\r\n', '3', 'Pending...');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `clinic`
--
ALTER TABLE `clinic`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ques`
--
ALTER TABLE `ques`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `clinic`
--
ALTER TABLE `clinic`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT COMMENT 'id', AUTO_INCREMENT=968;

--
-- AUTO_INCREMENT for table `ques`
--
ALTER TABLE `ques`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=899;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
