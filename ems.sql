-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 23, 2025 at 11:23 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ems`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_bookings`
--

CREATE TABLE `tbl_bookings` (
  `b_id` int(50) NOT NULL,
  `u_id` int(50) NOT NULL,
  `e_id` int(50) NOT NULL,
  `b_date` date NOT NULL,
  `b_status` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_events`
--

CREATE TABLE `tbl_events` (
  `e_id` int(11) NOT NULL,
  `e_name` varchar(100) NOT NULL,
  `e_location` varchar(100) NOT NULL,
  `e_price` varchar(100) NOT NULL,
  `e_capacity` varchar(100) NOT NULL,
  `e_status` varchar(100) NOT NULL,
  `e_image` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_events`
--

INSERT INTO `tbl_events` (`e_id`, `e_name`, `e_location`, `e_price`, `e_capacity`, `e_status`, `e_image`) VALUES
(1001, 'Happy Birthday!', 'City of Naga, Cebu', '10,000', '500', 'Available', ''),
(1002, 'dfsgrdg', 'rgrhg', '200', '40', 'Available', '');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `u_id` int(20) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `u_password` varchar(50) NOT NULL,
  `u_type` varchar(50) NOT NULL,
  `u_status` varchar(50) NOT NULL,
  `u_image` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_fname`, `u_lname`, `u_email`, `u_username`, `u_password`, `u_type`, `u_status`, `u_image`) VALUES
(7, 'Vivian', 'Torrenueva', 'viviantrrnv01@gmail.com', 'Bibyan', '12345', 'User', 'Active', ''),
(24, 'dsdefsr', 'frgreg', 'sdef@gmail.com', 'hahaha', 'Jakeee@123', 'Admin', 'Active', ''),
(25, 'scsdefvwsdr', 'rrvgergvrdsf', 'efwgfregreg@gmail.com', 'hahahasdbes', 'Hahaha@12345', 'Admin', 'Active', ''),
(28, 'testetds', 'efef', 'testretest@gmail.com', 'testest', 'bZh6OR2Q/CRRdRsruFiQ/G5FK8BX85qF2NH9VS+WX7I=', 'Admin', 'pending', NULL),
(29, 'vivian', 'vv', 'vvv@gmail.com', 'viviannn', '65/QPER1euhD5WopbsHLq2M5L8w0uumcwoIqVkplvUE=', 'Admin', 'Active', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_bookings`
--
ALTER TABLE `tbl_bookings`
  ADD PRIMARY KEY (`b_id`),
  ADD KEY `uid` (`u_id`),
  ADD KEY `e_id` (`e_id`);

--
-- Indexes for table `tbl_events`
--
ALTER TABLE `tbl_events`
  ADD PRIMARY KEY (`e_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_bookings`
--
ALTER TABLE `tbl_bookings`
  MODIFY `b_id` int(50) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_events`
--
ALTER TABLE `tbl_events`
  MODIFY `e_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1003;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_bookings`
--
ALTER TABLE `tbl_bookings`
  ADD CONSTRAINT `e_id` FOREIGN KEY (`e_id`) REFERENCES `tbl_events` (`e_id`),
  ADD CONSTRAINT `uid` FOREIGN KEY (`u_id`) REFERENCES `tbl_user` (`u_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
