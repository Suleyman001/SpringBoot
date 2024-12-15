-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 12, 2024 at 06:30 AM
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
-- Database: `eclass`
--

-- --------------------------------------------------------

--
-- Table structure for table `contact_messages`
--

CREATE TABLE `contact_messages` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `message` text DEFAULT NULL,
  `sent_at` timestamp NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

CREATE TABLE `marks` (
  `id` int(11) NOT NULL,
  `studentid` int(11) NOT NULL,
  `mdate` date NOT NULL,
  `mark` int(11) NOT NULL,
  `type` varchar(50) NOT NULL,
  `subjectid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `marks`
--

INSERT INTO `marks` (`id`, `studentid`, `mdate`, `mark`, `type`, `subjectid`) VALUES
(1, 140, '2010-09-08', 4, 'oral assessment', 13),
(2, 105, '2010-09-08', 5, 'oral assessment', 13),
(3, 105, '2010-09-08', 4, 'oral assessment', 13),
(4, 345, '2010-09-07', 5, 'oral assessment', 6),
(5, 390, '2010-09-07', 5, 'oral assessment', 6),
(6, 365, '2010-09-07', 5, 'lesson work', 6),
(7, 351, '2010-09-06', 5, 'oral assessment', 5),
(8, 366, '2010-09-06', 5, 'oral assessment', 3),
(9, 365, '2010-09-06', 5, 'oral assessment', 3),
(10, 360, '2010-09-06', 5, 'oral assessment', 3),
(11, 83, '2010-09-06', 5, 'oral assessment', 18),
(12, 419, '2010-09-03', 5, 'lesson work', 19),
(13, 408, '2010-09-03', 5, 'lesson work', 19),
(14, 140, '2010-09-08', 5, 'quiz', 13),
(15, 183, '2010-09-08', 5, 'oral assessment', 13),
(16, 155, '2010-09-08', 5, 'oral assessment', 13),
(17, 113, '2010-09-08', 4, 'oral assessment', 13),
(18, 129, '2010-09-08', 5, 'oral assessment', 13),
(19, 103, '2010-09-08', 5, 'oral assessment', 13),
(20, 150, '2010-09-08', 5, 'oral assessment', 13),
(21, 172, '2010-09-08', 5, 'oral assessment', 13),
(22, 297, '2010-09-08', 4, 'oral assessment', 13),
(23, 297, '2010-09-08', 5, 'oral assessment', 13),
(24, 262, '2010-09-08', 4, 'oral assessment', 13),
(25, 253, '2010-09-08', 5, 'quiz', 13),
(26, 274, '2010-09-08', 5, 'quiz', 13),
(27, 272, '2010-09-08', 5, 'oral assessment', 13),
(28, 27, '2010-09-08', 5, 'oral assessment', 3),
(29, 334, '2010-09-09', 4, 'oral assessment', 6),
(30, 324, '2010-09-09', 5, 'lesson work', 6),
(31, 319, '2010-09-09', 5, 'quiz', 12),
(32, 262, '2010-09-09', 5, 'quiz', 12),
(33, 216, '2010-09-09', 4, 'quiz', 12),
(34, 263, '2010-09-09', 4, 'quiz', 12),
(35, 253, '2010-09-09', 4, 'quiz', 12),
(36, 288, '2010-09-09', 4, 'quiz', 12),
(37, 238, '2010-09-09', 5, 'quiz', 12),
(38, 215, '2010-09-09', 4, 'quiz', 12),
(39, 244, '2010-09-09', 5, 'quiz', 12),
(40, 216, '2010-09-09', 5, 'quiz', 12),
(41, 288, '2010-09-09', 5, 'quiz', 12),
(42, 383, '2010-09-09', 3, 'oral assessment', 6),
(43, 299, '2010-09-09', 4, 'oral assessment', 10),
(44, 180, '2010-09-09', 5, 'oral assessment', 10),
(45, 367, '2010-09-09', 4, 'oral assessment', 3),
(46, 359, '2010-09-09', 5, 'oral assessment', 10),
(47, 24, '2010-09-09', 5, 'home test', 13),
(48, 388, '2010-09-10', 1, 'lesson work', 1),
(49, 84, '2010-09-10', 5, 'oral assessment', 14),
(50, 23, '2010-09-10', 4, 'oral assessment', 14),
(51, 298, '2010-09-10', 5, 'oral assessment', 10),
(52, 78, '2010-09-11', 4, 'oral assessment', 3),
(53, 131, '2010-09-12', 4, 'oral assessment', 3),
(54, 283, '2010-09-13', 5, 'oral assessment', 18),
(55, 307, '2010-09-13', 4, 'quiz', 12),
(56, 222, '2010-09-13', 5, 'quiz', 12),
(57, 270, '2010-09-13', 4, 'quiz', 12),
(58, 309, '2010-09-13', 4, 'quiz', 12),
(59, 292, '2010-09-13', 5, 'quiz', 12),
(60, 285, '2010-09-13', 5, 'quiz', 12),
(61, 256, '2010-09-13', 3, 'quiz', 12),
(62, 272, '2010-09-13', 5, 'quiz', 12),
(63, 299, '2010-09-13', 4, 'quiz', 12),
(64, 237, '2010-09-13', 4, 'oral assessment', 10),
(65, 42, '2010-09-13', 4, 'oral assessment', 10),
(66, 397, '2010-09-13', 5, 'oral assessment', 3),
(67, 388, '2010-09-13', 3, 'oral assessment', 19),
(68, 356, '2010-09-13', 5, 'oral assessment', 19),
(69, 56, '2010-09-13', 5, 'quiz', 5),
(70, 19, '2010-09-13', 5, 'quiz', 5),
(71, 92, '2010-09-13', 5, 'quiz', 5),
(72, 54, '2010-09-13', 5, 'quiz', 5),
(73, 4, '2010-09-13', 5, 'quiz', 5),
(74, 363, '2010-09-14', 3, 'oral assessment', 6),
(75, 301, '2010-09-14', 5, 'oral assessment', 18),
(76, 379, '2010-09-14', 5, 'oral assessment', 10),
(77, 303, '2010-09-14', 5, 'oral assessment', 4),
(78, 164, '2010-09-14', 5, 'oral assessment', 10),
(79, 116, '2010-09-14', 5, 'oral assessment', 10),
(80, 58, '2010-09-14', 5, 'oral assessment', 3),
(81, 172, '2010-09-14', 5, 'oral assessment', 12),
(82, 41, '2010-09-14', 5, 'quiz', 10),
(83, 6, '2010-09-14', 5, 'quiz', 10),
(84, 80, '2010-09-14', 4, 'quiz', 10),
(85, 102, '2010-09-14', 3, 'quiz', 10),
(86, 53, '2010-09-14', 4, 'quiz', 10),
(87, 83, '2010-09-14', 5, 'quiz', 10),
(88, 212, '2010-09-14', 4, 'quiz', 10),
(89, 84, '2010-09-14', 5, 'quiz', 10),
(90, 85, '2010-09-14', 5, 'quiz', 10),
(91, 81, '2010-09-14', 4, 'quiz', 10),
(92, 89, '2010-09-14', 4, 'quiz', 10),
(93, 94, '2010-09-14', 5, 'quiz', 10),
(94, 82, '2010-09-14', 3, 'quiz', 10),
(95, 15, '2010-09-14', 5, 'quiz', 10),
(96, 77, '2010-09-14', 5, 'quiz', 10),
(97, 79, '2010-09-14', 3, 'quiz', 10),
(98, 76, '2010-09-14', 5, 'quiz', 10),
(99, 16, '2010-09-14', 2, 'quiz', 10),
(100, 38, '2010-09-14', 4, 'quiz', 10),
(101, 63, '2010-09-14', 3, 'quiz', 10),
(102, 62, '2010-09-14', 5, 'quiz', 10),
(103, 61, '2010-09-14', 4, 'quiz', 10),
(104, 67, '2010-09-14', 3, 'quiz', 10),
(105, 65, '2010-09-14', 5, 'quiz', 10),
(106, 95, '2010-09-14', 3, 'quiz', 10),
(107, 25, '2010-09-14', 5, 'quiz', 10),
(108, 26, '2010-09-14', 5, 'quiz', 10),
(109, 35, '2010-09-14', 5, 'quiz', 10),
(110, 73, '2010-09-14', 5, 'quiz', 10),
(111, 68, '2010-09-14', 5, 'quiz', 10),
(112, 33, '2010-09-14', 5, 'quiz', 10),
(113, 87, '2010-09-14', 5, 'quiz', 10),
(114, 154, '2010-09-14', 4, 'topic test', 14),
(115, 289, '2010-09-14', 3, 'topic test', 17),
(116, 223, '2010-09-14', 1, 'topic test', 17),
(117, 228, '2010-09-14', 5, 'topic test', 17),
(118, 236, '2010-09-14', 2, 'topic test', 17),
(119, 240, '2010-09-14', 1, 'topic test', 17),
(120, 241, '2010-09-14', 3, 'topic test', 17),
(121, 242, '2010-09-14', 1, 'topic test', 17),
(122, 294, '2010-09-14', 3, 'topic test', 17),
(123, 141, '2010-09-15', 5, 'quiz', 14),
(124, 127, '2010-09-15', 3, 'quiz', 14),
(125, 186, '2010-09-15', 3, 'quiz', 14),
(126, 130, '2010-09-15', 2, 'quiz', 14),
(127, 133, '2010-09-15', 4, 'quiz', 14),
(128, 171, '2010-09-15', 2, 'quiz', 14),
(129, 161, '2010-09-15', 3, 'quiz', 14),
(130, 136, '2010-12-28', 3, 'topic test', 3),
(131, 156, '2010-12-28', 4, 'topic test', 3),
(132, 143, '2010-12-28', 1, 'topic test', 3),
(133, 142, '2010-12-28', 5, 'topic test', 3),
(134, 126, '2010-12-28', 1, 'topic test', 3),
(135, 114, '2010-12-28', 5, 'topic test', 4),
(136, 104, '2010-12-28', 5, 'topic test', 4),
(137, 140, '2010-12-28', 5, 'topic test', 4),
(138, 178, '2010-12-28', 4, 'topic test', 4),
(139, 146, '2010-12-28', 5, 'topic test', 4),
(140, 139, '2010-12-28', 4, 'topic test', 4),
(141, 205, '2010-12-28', 4, 'topic test', 4),
(142, 108, '2010-12-28', 5, 'topic test', 4),
(143, 153, '2010-12-28', 5, 'topic test', 4),
(144, 138, '2010-12-28', 5, 'topic test', 4),
(145, 147, '2010-12-28', 3, 'topic test', 4),
(146, 137, '2010-12-28', 5, 'topic test', 4),
(147, 175, '2010-12-28', 5, 'topic test', 4),
(148, 192, '2010-12-28', 4, 'topic test', 4),
(149, 154, '2010-12-28', 5, 'topic test', 4),
(150, 167, '2010-12-28', 4, 'topic test', 4),
(151, 148, '2010-12-28', 4, 'topic test', 4),
(152, 179, '2010-12-28', 5, 'topic test', 4),
(153, 168, '2010-12-28', 5, 'topic test', 4),
(154, 152, '2010-12-28', 4, 'topic test', 4),
(155, 144, '2010-12-28', 5, 'topic test', 4),
(156, 136, '2010-12-28', 5, 'topic test', 4),
(157, 156, '2010-12-28', 4, 'topic test', 4),
(158, 157, '2010-12-28', 4, 'topic test', 4),
(159, 123, '2010-12-28', 4, 'topic test', 4),
(160, 143, '2010-12-28', 4, 'topic test', 4),
(161, 142, '2010-12-28', 5, 'topic test', 4),
(162, 126, '2010-12-28', 2, 'topic test', 4),
(163, 178, '2010-12-28', 5, 'quiz', 4),
(164, 167, '2010-12-28', 5, 'quiz', 4),
(165, 158, '2010-12-29', 1, 'topic test', 14),
(166, 164, '2010-12-29', 4, 'topic test', 14),
(167, 185, '2010-12-29', 2, 'topic test', 14),
(168, 134, '2010-12-29', 1, 'topic test', 14),
(169, 208, '2010-12-29', 2, 'topic test', 14),
(170, 190, '2010-12-29', 3, 'topic test', 14),
(171, 166, '2010-12-29', 4, 'topic test', 14),
(172, 104, '2010-12-30', 4, 'topic test', 19),
(173, 140, '2010-12-30', 5, 'topic test', 19),
(174, 146, '2010-12-30', 5, 'topic test', 19),
(175, 108, '2010-12-30', 4, 'topic test', 19),
(176, 153, '2010-12-30', 3, 'topic test', 19),
(177, 426, '2010-12-30', 5, 'topic test', 19),
(178, 119, '2010-12-30', 2, 'topic test', 19),
(179, 137, '2010-12-30', 5, 'topic test', 19),
(180, 175, '2010-12-30', 5, 'topic test', 19),
(181, 167, '2010-12-30', 4, 'topic test', 19),
(182, 179, '2010-12-30', 5, 'topic test', 19),
(183, 168, '2010-12-30', 2, 'topic test', 19),
(184, 152, '2010-12-30', 5, 'topic test', 19),
(185, 136, '2010-12-30', 4, 'topic test', 19),
(186, 156, '2010-12-30', 4, 'topic test', 19),
(187, 143, '2010-12-30', 4, 'topic test', 19),
(188, 96, '2010-12-30', 4, 'topic test', 19),
(189, 142, '2010-12-30', 5, 'topic test', 19),
(190, 126, '2010-12-30', 1, 'topic test', 19),
(191, 57, '2010-12-30', 5, 'home test', 1),
(192, 41, '2010-12-30', 3, 'topic test', 3),
(193, 31, '2010-12-30', 5, 'topic test', 3),
(194, 6, '2010-12-30', 4, 'topic test', 3),
(195, 102, '2010-12-30', 2, 'topic test', 3),
(196, 53, '2010-12-30', 4, 'topic test', 3),
(197, 83, '2010-12-30', 4, 'topic test', 3),
(198, 84, '2010-12-30', 5, 'topic test', 3),
(199, 85, '2010-12-30', 4, 'topic test', 3),
(200, 81, '2010-12-30', 4, 'topic test', 3),
(201, 89, '2010-12-30', 5, 'topic test', 3),
(202, 46, '2010-12-30', 4, 'topic test', 3),
(203, 94, '2010-12-30', 5, 'topic test', 3),
(204, 101, '2010-12-30', 4, 'topic test', 3),
(205, 77, '2010-12-30', 3, 'topic test', 3),
(206, 76, '2010-12-30', 4, 'topic test', 3),
(207, 16, '2010-12-30', 3, 'topic test', 3),
(208, 38, '2010-12-30', 3, 'topic test', 3),
(209, 62, '2010-12-30', 5, 'topic test', 3),
(210, 67, '2010-12-30', 5, 'topic test', 3),
(211, 65, '2010-12-30', 5, 'topic test', 3),
(212, 24, '2010-12-30', 5, 'topic test', 3),
(213, 25, '2010-12-30', 4, 'topic test', 3),
(214, 26, '2010-12-30', 4, 'topic test', 3),
(215, 35, '2010-12-30', 5, 'topic test', 3),
(216, 33, '2010-12-30', 5, 'topic test', 3),
(217, 78, '2010-12-31', 4, 'home test', 1),
(218, 69, '2010-12-31', 4, 'quiz', 3),
(219, 93, '2010-12-31', 3, 'quiz', 3),
(220, 10, '2010-12-31', 5, 'quiz', 3),
(221, 52, '2010-12-31', 5, 'quiz', 3),
(222, 51, '2010-12-31', 4, 'quiz', 3),
(223, 59, '2010-12-31', 5, 'quiz', 3),
(224, 12, '2010-12-31', 5, 'quiz', 3),
(225, 28, '2010-12-31', 3, 'quiz', 3),
(226, 17, '2010-12-31', 5, 'quiz', 3),
(227, 37, '2010-12-31', 5, 'quiz', 3),
(228, 88, '2010-12-31', 4, 'quiz', 3),
(229, 23, '2010-12-31', 3, 'quiz', 3),
(230, 40, '2010-12-31', 4, 'quiz', 3),
(231, 60, '2010-12-31', 2, 'quiz', 3),
(232, 40, '2010-12-31', 5, 'quiz', 3),
(233, 28, '2010-12-31', 4, 'quiz', 3),
(234, 40, '2010-12-31', 5, 'lesson work', 3),
(235, 69, '2010-12-31', 5, 'home test', 3),
(236, 17, '2010-12-31', 5, 'home test', 19),
(237, 7, '2010-12-31', 3, 'topic test', 5),
(238, 22, '2010-12-31', 4, 'topic test', 5),
(239, 7, '2010-12-31', 4, 'oral assessment', 5),
(240, 44, '2010-12-31', 5, 'oral assessment', 5),
(241, 42, '2010-12-31', 4, 'oral assessment', 5),
(242, 74, '2010-12-31', 4, 'oral assessment', 5),
(243, 13, '2010-12-31', 3, 'oral assessment', 5),
(244, 48, '2010-12-31', 5, 'oral assessment', 5),
(245, 97, '2010-12-31', 3, 'oral assessment', 5),
(246, 71, '2010-12-31', 3, 'oral assessment', 5),
(247, 34, '2010-12-31', 5, 'oral assessment', 5),
(248, 29, '2010-12-31', 4, 'oral assessment', 5),
(249, 20, '2010-12-31', 4, 'oral assessment', 5),
(250, 22, '2010-12-31', 5, 'oral assessment', 5),
(251, 57, '2010-12-31', 5, 'oral assessment', 5),
(252, 58, '2010-12-31', 2, 'oral assessment', 5),
(253, 75, '2010-12-31', 5, 'oral assessment', 5),
(254, 45, '2010-12-31', 4, 'oral assessment', 5),
(255, 55, '2010-12-23', 5, 'home test', 1),
(256, 249, '2010-12-23', 4, 'topic test', 4),
(257, 218, '2010-12-23', 4, 'topic test', 4),
(258, 221, '2010-12-23', 5, 'topic test', 4),
(259, 251, '2010-12-23', 5, 'topic test', 4),
(260, 291, '2010-12-23', 5, 'topic test', 4),
(261, 223, '2010-12-23', 5, 'topic test', 4),
(262, 225, '2010-12-23', 5, 'topic test', 4),
(263, 254, '2010-12-23', 5, 'topic test', 4),
(264, 255, '2010-12-23', 5, 'topic test', 4),
(265, 228, '2010-12-23', 5, 'topic test', 4),
(266, 293, '2010-12-23', 5, 'topic test', 4),
(267, 305, '2010-12-23', 5, 'topic test', 4),
(268, 279, '2010-12-23', 5, 'topic test', 4),
(269, 274, '2010-12-23', 5, 'topic test', 4),
(270, 245, '2010-12-23', 5, 'topic test', 4),
(271, 237, '2010-12-23', 4, 'topic test', 4),
(272, 257, '2010-12-23', 5, 'topic test', 4),
(273, 314, '2010-12-23', 4, 'topic test', 4),
(274, 258, '2010-12-23', 4, 'topic test', 4),
(275, 315, '2010-12-23', 3, 'topic test', 4),
(276, 311, '2010-12-23', 5, 'topic test', 4),
(277, 215, '2010-12-23', 4, 'topic test', 4),
(278, 213, '2010-12-23', 5, 'topic test', 4),
(279, 301, '2010-12-23', 5, 'topic test', 4),
(280, 306, '2010-12-23', 4, 'topic test', 4),
(281, 261, '2010-12-23', 5, 'topic test', 4),
(282, 241, '2010-12-23', 5, 'topic test', 4),
(283, 220, '2010-12-23', 5, 'topic test', 4),
(284, 242, '2010-12-23', 3, 'topic test', 4),
(285, 214, '2010-12-23', 5, 'topic test', 4),
(286, 259, '2010-12-23', 1, 'oral assessment', 4),
(287, 259, '2010-12-23', 4, 'topic test', 4),
(288, 20, '2010-12-24', 5, 'home test', 1),
(289, 91, '2010-12-25', 5, 'home test', 1),
(290, 75, '2010-12-26', 5, 'home test', 1),
(291, 417, '2010-12-27', 3, 'topic test', 3),
(292, 327, '2010-12-27', 3, 'topic test', 3),
(293, 358, '2010-12-27', 3, 'topic test', 3);

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `id` int(11) NOT NULL,
  `sname` varchar(255) NOT NULL,
  `class` varchar(10) NOT NULL,
  `boy` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`id`, `sname`, `class`, `boy`) VALUES
(1, 'Pék Roland', '12/B', -1),
(2, 'Illin Zita', '12/C', 0),
(3, 'Ördögh Dániel', '12/B', -1),
(4, 'Barta Ildikó', '12/C', 0),
(5, 'Simony Kata', '12/B', 0),
(6, 'Csepreg Natália', '12/A', 0),
(7, 'Nagy Petra', '12/B', 0),
(8, 'Vörös Dóra', '12/C', 0),
(9, 'Varga Boldizsár', '12/C', -1),
(10, 'Szilágyi Réka', '12/C', 0),
(11, 'Helle Ágnes', '12/B', 0),
(12, 'Gyömbér Anna', '12/C', 0),
(13, 'Farkas Dária', '12/B', 0),
(14, 'Barta Zsuzsanna', '12/C', 0),
(15, 'Schiss Bence', '12/A', -1),
(16, 'Szabó Attila', '12/A', -1),
(17, 'Nagy Dorottya', '12/C', 0),
(18, 'Lengyel Lilla', '11/B', 0),
(19, 'Csiszár Nikolett', '12/C', 0),
(20, 'Kond Lili', '12/B', 0),
(21, 'Fehér Orsolya', '12/C', 0),
(22, 'Haskó Fanni', '12/B', 0),
(23, 'Pék Roland', '12/B', -1),
(24, 'Illin Zita', '12/C', 0),
(25, 'Ördögh Dániel', '12/B', -1),
(26, 'Barta Ildikó', '12/C', 0),
(27, 'Simony Kata', '12/B', 0),
(28, 'Csepreg Natália', '12/A', 0),
(29, 'Nagy Petra', '12/B', 0),
(30, 'Vörös Dóra', '12/C', 0),
(31, 'Varga Boldizsár', '12/C', -1),
(32, 'Szilágyi Réka', '12/C', 0),
(33, 'Helle Ágnes', '12/B', 0),
(34, 'Gyömbér Anna', '12/C', 0),
(35, 'Farkas Dária', '12/B', 0),
(36, 'Barta Zsuzsanna', '12/C', 0),
(37, 'Schiss Bence', '12/A', -1),
(38, 'Szabó Attila', '12/A', -1),
(39, 'Nagy Dorottya', '12/C', 0),
(40, 'Lengyel Lilla', '11/B', 0),
(41, 'Csiszár Nikolett', '12/C', 0),
(42, 'Kond Lili', '12/B', 0),
(43, 'Fehér Orsolya', '12/C', 0),
(44, 'Haskó Fanni', '12/B', 0),
(45, 'Sós Gábor', '12/C', -1),
(46, 'Kondász Ferenc', '12/A', -1),
(47, 'Magyari Tekla', '12/A', 0),
(48, 'Nagy Enikő', '12/A', 0),
(49, 'Kónya Barbara', '12/B', 0),
(50, 'Kollár Zóra', '12/C', 0),
(51, 'Petrás Lili', '12/B', 0),
(52, 'Lucza Kata', '12/B', 0),
(53, 'Szabad Eta', '12/A', 0),
(54, 'Iványi Gréta', '12/B', 0),
(55, 'Ráskai Kata', '12/A', 0),
(56, 'Toldi Viktória', '12/B', 0),
(57, 'Török Róbert', '12/A', -1),
(58, 'Oláh Soma', '12/B', -1),
(59, 'Pintér Tímea', '12/C', 0),
(60, 'Kasznár Henrietta', '12/A', 0),
(61, 'Bodó Bence', '12/B', -1),
(62, 'Ádám Bella', '12/C', 0),
(63, 'Hegyközi Martin', '12/A', -1),
(64, 'Kiss Dorina', '12/B', 0),
(65, 'Háló Ildikó', '12/C', 0),
(66, 'Ficzak Lili', '12/B', 0),
(67, 'Juhász Viktor', '12/B', -1),
(68, 'Dombovári Anna', '12/A', 0),
(69, 'Marosi Mercédesz', '12/B', 0),
(70, 'Bozóki Gábor', '12/B', -1),
(71, 'Szabó Lilla', '12/C', 0),
(72, 'Csank János', '12/C', -1),
(73, 'Kárpáti Ádám', '12/C', -1),
(74, 'Peregi Petra', '12/C', 0),
(75, 'Sebők Dániel', '12/A', -1),
(76, 'Balassa Viktor', '12/C', -1),
(77, 'Kovács Anett', '12/B', 0),
(78, 'Papp Viola', '12/C', 0),
(79, 'Lehóczky Nanetta', '12/B', 0),
(80, 'Gajda Blanka', '12/B', 0),
(81, 'Buzás Fabióla', '12/C', 0),
(82, 'Takács Márkó', '12/C', -1),
(83, 'Varga Mónika', '12/A', 0),
(84, 'Papp Evelin', '12/A', 0),
(85, 'Kovács Alexandra', '12/A', 0),
(86, 'Árpás Soma', '12/C', -1),
(87, 'Erdélyi Réka', '12/A', 0),
(88, 'Kahi Zsanett', '12/C', 0),
(89, 'Betyák Éva', '12/A', 0),
(90, 'Bozó Noémi', '12/A', 0),
(91, 'Kerényi Zsuzsanna', '12/C', 0),
(92, 'István Luca', '12/B', 0),
(93, 'Rideg Emília', '12/B', 0),
(94, 'Szurovecz Nóra', '12/B', 0),
(95, 'Józsa Sára', '12/A', 0),
(96, 'Thury Lilla', '12/B', 0),
(97, 'Hajdú Zília', '12/B', 0),
(98, 'Kertész Bence', '12/A', -1),
(99, 'Bánfi Bernadett', '12/A', 0),
(100, 'Ormódi Viktor', '12/B', -1),
(101, 'Szolnoki Martin', '12/A', -1),
(102, 'Szabó Vivien', '12/A', 0),
(103, 'Böröcz Mónika', '12/A', 0),
(104, 'Gyémánt Péter', '12/A', -1),
(105, 'Halász Anett', '12/A', 0),
(106, 'Lengyel Dóra', '12/A', 0),
(107, 'Czirok Anna', '12/A', 0),
(108, 'Kovács Norbert', '12/B', -1),
(109, 'Borbás Géza', '12/A', -1),
(110, 'Elek Miklós', '12/C', -1),
(111, 'Nagy Renáta', '12/A', 0),
(112, 'Ádám Izolda', '12/B', 0),
(113, 'Kis Beáta', '12/B', 0),
(114, 'Bóna Zsuzsanna', '12/C', 0),
(115, 'Kertész András', '12/C', -1),
(116, 'Kimler Nikolett', '12/A', 0),
(117, 'Molnár Ádám', '12/A', -1),
(118, 'Bodza Tamás', '11/C', -1),
(119, 'Fülöp Blanka', '12/B', 0),
(120, 'Tombácz Miklós', '11/B', -1),
(121, 'Kenderesi Máté', '12/B', -1),
(122, 'Alföldi Annamária', '12/B', 0),
(123, 'Mihalcsik Dániel', '12/A', -1),
(124, 'Farkas Anett', '12/A', 0),
(125, 'Takács Rebeka', '11/B', 0),
(126, 'Lajkó Réka', '11/C', 0),
(127, 'Guba Anna', '11/B', 0),
(128, 'Molnár Márton', '11/A', -1),
(129, 'Balogh Lili', '11/A', 0),
(130, 'Selmeci Dóra', '11/C', 0),
(131, 'Dancs György', '11/B', -1),
(132, 'Mészáros Emese', '11/B', 0),
(133, 'Vásárhelyi Tamás', '11/A', -1),
(134, 'Gyuris Zsófia', '11/B', 0),
(135, 'Kis Antal', '11/A', -1),
(136, 'Karácsonyi Zsófia', '11/C', 0),
(137, 'Hódi Lőrinc', '11/B', -1),
(138, 'Szántó Johanna', '11/A', 0),
(139, 'Balog Kristóf', '11/A', -1),
(140, 'Firge Nóra', '11/B', 0),
(141, 'Májer Orsolya', '11/C', 0),
(142, 'Papp Éva', '11/C', 0),
(143, 'Nagy Fanni', '11/A', 0),
(144, 'Dávid Bettina', '11/B', 0),
(145, 'Csernyik Sára', '11/C', 0),
(146, 'Ludányi Flóra', '11/A', 0),
(147, 'Kovács László', '11/B', -1),
(148, 'Deák István', '11/C', -1),
(149, 'Sisák Andrea', '11/B', 0),
(150, 'Erdélyi Krisztina', '11/A', 0),
(151, 'Schulcz Daniella', '11/B', 0),
(152, 'Engi Zsuzsanna', '11/B', 0),
(153, 'Koltay Emese', '11/A', 0),
(154, 'Vári Lívia', '11/A', 0),
(155, 'Szamosközi Gergely', '11/B', -1),
(156, 'Somogyi Márk', '11/A', -1),
(157, 'Bakai József', '11/C', -1),
(158, 'Gábor Katalin', '11/C', 0),
(159, 'Jónás Ágota', '11/C', 0),
(160, 'Barta Tamás', '11/C', -1),
(161, 'Juhász Ákos', '11/C', -1),
(162, 'Szántó Kornélia', '11/C', 0),
(163, 'Petrik Zsófia', '11/B', 0),
(164, 'Durczás Réka', '11/C', 0),
(165, 'Dancs Richárd', '11/C', -1),
(166, 'Arany Péter', '11/C', -1),
(167, 'Hart Alíz', '11/B', 0),
(168, 'Mészáros Renáta', '11/C', 0),
(169, 'Fröhlich Zsombor', '11/C', -1),
(170, 'Biró Nóra', '11/C', 0),
(171, 'Peták Helga', '11/A', 0),
(172, 'Kerti Borbála', '11/B', 0),
(173, 'Szántó Ákos', '11/C', -1),
(174, 'Nyári Péter', '11/C', -1),
(175, 'Jak Balázs', '11/C', -1),
(176, 'Sikk Dániel', '11/C', -1),
(177, 'Mészáros Flóra', '11/A', 0),
(178, 'Szerencsés Zsófia', '11/C', 0),
(179, 'Pesti Richárd', '11/C', -1),
(180, 'Bertók Dániel', '11/A', -1),
(181, 'Tomka Máté', '11/A', -1),
(182, 'Végh Vanessa', '11/A', 0),
(183, 'Vass András', '11/B', -1),
(184, 'Forgó Annamária', '11/A', 0),
(185, 'Skót Tamara', '11/A', 0),
(186, 'Bozó Dániel', '11/A', -1),
(187, 'Korom Viola', '11/B', 0),
(188, 'Kovács Dominika', '11/A', 0),
(189, 'Farkas Máté', '11/C', -1),
(190, 'Vezsi Attila', '11/C', -1),
(191, 'Zsikai Krisztina', '11/B', 0),
(192, 'Neuer Benedek', '11/B', -1),
(193, 'Nagy Máté', '11/B', -1),
(194, 'Farkas Stella', '11/A', 0),
(195, 'Kristóf Réka', '11/A', 0),
(196, 'Bodnár Kinga', '11/A', 0),
(197, 'Patonai Dóra', '11/C', 0),
(198, 'Font Bernadett', '11/A', 0),
(199, 'Boldizsár Tas', '11/B', -1),
(200, 'Szabó Dorottya', '11/C', 0),
(201, 'Benkő Tünde', '11/C', 0),
(202, 'Zsolczai Balázs', '11/A', -1),
(203, 'Szepes Edit', '10/A', 0),
(204, 'Tóth Luca', '11/B', 0),
(205, 'Kiss Nikolett', '11/B', 0),
(206, 'Mészáros Zsuzsanna', '11/A', 0),
(207, 'Janka Csanád', '11/A', -1),
(208, 'Csete Boglárka', '11/B', 0),
(209, 'Rabi Szimonetta', '11/B', 0),
(210, 'Fődi Noémi', '11/B', 0),
(211, 'Gyulai Noémi', '11/B', 0),
(212, 'Fodor Viktória', '11/A', 0),
(213, 'Földesi Tamás', '11/B', -1),
(214, 'Kovács Bence', '11/C', -1),
(215, 'Siklósi Jolán', '11/B', 0),
(216, 'Mészáros Réka', '11/B', 0),
(217, 'Rácz Elza', '11/A', 0),
(218, 'Horváth Viktória', '11/A', 0),
(219, 'Lehoczky Máté', '11/B', -1),
(220, 'Kovács Kata', '11/B', 0),
(221, 'Bozsó Zsófia', '11/A', 0),
(222, 'Jójárt Nóra', '11/C', 0),
(223, 'Marosi Zsanett', '11/C', 0),
(224, 'Bajus Fruzsina', '11/C', 0),
(225, 'Ördög Lili', '11/B', 0),
(226, 'Alsó Dóra', '11/B', 0),
(227, 'Honti Viktória', '11/C', 0),
(228, 'Matuska Zita', '11/C', 0);

-- --------------------------------------------------------

--
-- Table structure for table `subjects`
--

CREATE TABLE `subjects` (
  `id` int(11) NOT NULL,
  `sname` varchar(255) NOT NULL,
  `category` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `subjects`
--

INSERT INTO `subjects` (`id`, `sname`, `category`) VALUES
(1, 'Information Technology', 'information technology'),
(2, 'Earth and Environmental Science', 'science'),
(3, 'Literature', 'humanities'),
(4, 'History', 'humanities'),
(5, 'Mathematics', 'mathematics'),
(6, 'Physics', 'science'),
(7, 'Singing and Music', 'arts'),
(8, 'Drawing and Visual Culture', 'arts'),
(9, 'Philosophy', 'humanities'),
(10, 'Biology', 'science'),
(11, 'Chemistry', 'science'),
(12, 'English Language', 'languages'),
(13, 'French Language', 'languages'),
(14, 'German Language', 'languages'),
(15, 'Italian Language', 'languages'),
(16, 'Russian Language', 'languages'),
(17, 'Spanish Language', 'languages'),
(18, 'Latin Language', 'languages'),
(19, 'Hungarian Language', 'humanities'),
(20, 'Arts', 'arts');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `role` varchar(255) NOT NULL DEFAULT 'guest'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `marks`
--
ALTER TABLE `marks`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `subjects`
--
ALTER TABLE `subjects`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `marks`
--
ALTER TABLE `marks`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=294;

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=229;

--
-- AUTO_INCREMENT for table `subjects`
--
ALTER TABLE `subjects`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
