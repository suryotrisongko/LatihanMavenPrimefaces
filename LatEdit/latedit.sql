-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 17, 2015 at 06:58 AM
-- Server version: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `latedit`
--

-- --------------------------------------------------------

--
-- Table structure for table `bulan`
--

CREATE TABLE IF NOT EXISTS `bulan` (
  `bulan_id` int(11) NOT NULL,
  `bulan_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bulan`
--

INSERT INTO `bulan` (`bulan_id`, `bulan_name`) VALUES
(1, 'januari'),
(2, 'februari'),
(3, 'maret'),
(4, 'april'),
(5, 'mei'),
(6, 'juni'),
(7, 'juli'),
(8, 'agustus'),
(9, 'september'),
(10, 'oktober'),
(11, 'november'),
(12, 'desember');

-- --------------------------------------------------------

--
-- Table structure for table `histori_total_pasien_tahunan`
--

CREATE TABLE IF NOT EXISTS `histori_total_pasien_tahunan` (
  `id` int(11) NOT NULL,
  `tahun_id` int(11) NOT NULL,
  `puskesmas_id` int(11) NOT NULL,
  `bulan_id` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `histori_total_pasien_tahunan`
--

INSERT INTO `histori_total_pasien_tahunan` (`id`, `tahun_id`, `puskesmas_id`, `bulan_id`, `jumlah`) VALUES
(13, 2015, 1, 1, 42),
(14, 2015, 1, 2, 124),
(15, 2015, 1, 3, 42),
(16, 2015, 1, 4, 44),
(17, 2015, 1, 5, 66),
(18, 2015, 1, 6, 88),
(19, 2015, 1, 7, 99),
(20, 2015, 1, 8, 37),
(21, 2015, 1, 9, 86),
(22, 2015, 1, 10, 143),
(23, 2015, 1, 11, 46),
(24, 2015, 1, 12, 99),
(25, 2015, 2, 1, 32),
(26, 2015, 2, 2, 154),
(27, 2015, 2, 3, 82),
(28, 2015, 2, 4, 46),
(29, 2015, 2, 5, 56),
(30, 2015, 2, 6, 83),
(31, 2015, 2, 7, 29),
(32, 2015, 2, 8, 67),
(33, 2015, 2, 9, 116),
(34, 2015, 2, 10, 13),
(35, 2015, 2, 11, 66),
(36, 2015, 2, 12, 199),
(37, 2015, 3, 1, 12),
(38, 2015, 3, 2, 124),
(39, 2015, 3, 3, 32),
(40, 2015, 3, 4, 46),
(41, 2015, 3, 5, 66),
(42, 2015, 3, 6, 43),
(43, 2015, 3, 7, 29),
(44, 2015, 3, 8, 87),
(45, 2015, 3, 9, 76),
(46, 2015, 3, 10, 113),
(47, 2015, 3, 11, 66),
(48, 2015, 3, 12, 59),
(49, 2015, 4, 1, 72),
(50, 2015, 4, 2, 94),
(51, 2015, 4, 3, 72),
(52, 2015, 4, 4, 16),
(53, 2015, 4, 5, 86),
(54, 2015, 4, 6, 113),
(55, 2015, 4, 7, 129),
(56, 2015, 4, 8, 47),
(57, 2015, 4, 9, 96),
(58, 2015, 4, 10, 13),
(59, 2015, 4, 11, 6),
(60, 2015, 4, 12, 9),
(61, 2014, 1, 1, 142),
(62, 2014, 1, 2, 124),
(63, 2014, 1, 3, 142),
(64, 2014, 1, 4, 144),
(65, 2014, 1, 5, 166),
(66, 2014, 1, 6, 188),
(67, 2014, 1, 7, 199),
(68, 2014, 1, 8, 137),
(69, 2014, 1, 9, 186),
(70, 2014, 1, 10, 143),
(71, 2014, 1, 11, 146),
(72, 2014, 1, 12, 199),
(73, 2014, 2, 1, 132),
(74, 2014, 2, 2, 154),
(75, 2014, 2, 3, 182),
(76, 2014, 2, 4, 146),
(77, 2014, 2, 5, 156),
(78, 2014, 2, 6, 183),
(79, 2014, 2, 7, 129),
(80, 2014, 2, 8, 167),
(81, 2014, 2, 9, 116),
(82, 2014, 2, 10, 113),
(83, 2014, 2, 11, 166),
(84, 2014, 2, 12, 199),
(85, 2014, 3, 1, 112),
(86, 2014, 3, 2, 124),
(87, 2014, 3, 3, 132),
(88, 2014, 3, 4, 146),
(89, 2014, 3, 5, 166),
(90, 2014, 3, 6, 143),
(91, 2014, 3, 7, 129),
(92, 2014, 3, 8, 187),
(93, 2014, 3, 9, 176),
(94, 2014, 3, 10, 113),
(95, 2014, 3, 11, 166),
(96, 2014, 3, 12, 159),
(97, 2014, 4, 1, 172),
(98, 2014, 4, 2, 194),
(99, 2014, 4, 3, 172),
(100, 2014, 4, 4, 116),
(101, 2014, 4, 5, 186),
(102, 2014, 4, 6, 113),
(103, 2014, 4, 7, 129),
(104, 2014, 4, 8, 147),
(105, 2014, 4, 9, 196),
(106, 2014, 4, 10, 113),
(107, 2014, 4, 11, 116),
(108, 2014, 4, 12, 119),
(109, 2013, 1, 1, 242),
(110, 2013, 1, 2, 224),
(111, 2013, 1, 3, 242),
(112, 2013, 1, 4, 244),
(113, 2013, 1, 5, 266),
(114, 2013, 1, 6, 288),
(115, 2013, 1, 7, 299),
(116, 2013, 1, 8, 237),
(117, 2013, 1, 9, 286),
(118, 2013, 1, 10, 243),
(119, 2013, 1, 11, 246),
(120, 2013, 1, 12, 299),
(121, 2013, 2, 1, 232),
(122, 2013, 2, 2, 254),
(123, 2013, 2, 3, 282),
(124, 2013, 2, 4, 246),
(125, 2013, 2, 5, 256),
(126, 2013, 2, 6, 283),
(127, 2013, 2, 7, 229),
(128, 2013, 2, 8, 267),
(129, 2013, 2, 9, 216),
(130, 2013, 2, 10, 213),
(131, 2013, 2, 11, 266),
(132, 2013, 2, 12, 299),
(133, 2013, 3, 1, 212),
(134, 2013, 3, 2, 224),
(135, 2013, 3, 3, 232),
(136, 2013, 3, 4, 246),
(137, 2013, 3, 5, 266),
(138, 2013, 3, 6, 243),
(139, 2013, 3, 7, 229),
(140, 2013, 3, 8, 287),
(141, 2013, 3, 9, 276),
(142, 2013, 3, 10, 213),
(143, 2013, 3, 11, 266),
(144, 2013, 3, 12, 259),
(145, 2013, 4, 1, 272),
(146, 2013, 4, 2, 294),
(147, 2013, 4, 3, 272),
(148, 2013, 4, 4, 216),
(149, 2013, 4, 5, 286),
(150, 2013, 4, 6, 213),
(151, 2013, 4, 7, 229),
(152, 2013, 4, 8, 247),
(153, 2013, 4, 9, 296),
(154, 2013, 4, 10, 213),
(155, 2013, 4, 11, 216),
(156, 2013, 4, 12, 219);

-- --------------------------------------------------------

--
-- Table structure for table `penyakit`
--

CREATE TABLE IF NOT EXISTS `penyakit` (
  `penyakit_id` int(11) NOT NULL,
  `penyakit_name` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penyakit`
--

INSERT INTO `penyakit` (`penyakit_id`, `penyakit_name`) VALUES
(1, 'pilek'),
(2, 'flu'),
(3, 'batuk'),
(4, 'meriang'),
(5, 'panu'),
(6, 'pegal linu'),
(7, 'kutu air'),
(8, 'panu'),
(9, 'ambeien'),
(10, 'diare');

-- --------------------------------------------------------

--
-- Table structure for table `penyakit_jk`
--

CREATE TABLE IF NOT EXISTS `penyakit_jk` (
  `idp` int(11) NOT NULL,
  `penyakit_id` int(11) NOT NULL,
  `puskesmas_id` int(11) NOT NULL,
  `tahun_id` int(11) NOT NULL,
  `bulan_id` int(11) NOT NULL,
  `laki` int(11) NOT NULL,
  `prm` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penyakit_jk`
--

INSERT INTO `penyakit_jk` (`idp`, `penyakit_id`, `puskesmas_id`, `tahun_id`, `bulan_id`, `laki`, `prm`) VALUES
(1, 1, 1, 2015, 1, 79, 113),
(2, 2, 1, 2015, 1, 101, 99),
(3, 3, 1, 2015, 1, 81, 106),
(4, 4, 1, 2015, 1, 89, 83),
(5, 5, 1, 2015, 1, 74, 86),
(6, 6, 1, 2015, 1, 102, 87),
(7, 7, 1, 2015, 1, 78, 94),
(8, 8, 1, 2015, 1, 89, 75),
(9, 9, 1, 2015, 1, 88, 99),
(10, 10, 1, 2015, 1, 91, 84);

-- --------------------------------------------------------

--
-- Table structure for table `puskesmas`
--

CREATE TABLE IF NOT EXISTS `puskesmas` (
  `puskesmas_id` int(11) NOT NULL,
  `puskesmas_name` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `puskesmas`
--

INSERT INTO `puskesmas` (`puskesmas_id`, `puskesmas_name`) VALUES
(1, 'semua puskesmas'),
(2, 'sukorame'),
(3, 'ngampel'),
(4, 'mrican');

-- --------------------------------------------------------

--
-- Table structure for table `tahun`
--

CREATE TABLE IF NOT EXISTS `tahun` (
  `tahun_id` int(11) NOT NULL,
  `tahun_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tahun`
--

INSERT INTO `tahun` (`tahun_id`, `tahun_name`) VALUES
(2013, '2013'),
(2014, '2014'),
(2015, '2015');

-- --------------------------------------------------------

--
-- Stand-in structure for view `v_histori_total_pasien_tahunan`
--
CREATE TABLE IF NOT EXISTS `v_histori_total_pasien_tahunan` (
`id` int(11)
,`tahun` varchar(255)
,`puskesmas` varchar(255)
,`bulan` varchar(255)
,`jumlah` int(11)
);

-- --------------------------------------------------------

--
-- Structure for view `v_histori_total_pasien_tahunan`
--
DROP TABLE IF EXISTS `v_histori_total_pasien_tahunan`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_histori_total_pasien_tahunan` AS select `histori_total_pasien_tahunan`.`id` AS `id`,`tahun`.`tahun_name` AS `tahun`,`puskesmas`.`puskesmas_name` AS `puskesmas`,`bulan`.`bulan_name` AS `bulan`,`histori_total_pasien_tahunan`.`jumlah` AS `jumlah` from (((`histori_total_pasien_tahunan` join `tahun`) join `puskesmas`) join `bulan`) where ((`histori_total_pasien_tahunan`.`tahun_id` = `tahun`.`tahun_id`) and (`histori_total_pasien_tahunan`.`bulan_id` = `bulan`.`bulan_id`) and (`histori_total_pasien_tahunan`.`puskesmas_id` = `puskesmas`.`puskesmas_id`));

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bulan`
--
ALTER TABLE `bulan`
  ADD PRIMARY KEY (`bulan_id`);

--
-- Indexes for table `histori_total_pasien_tahunan`
--
ALTER TABLE `histori_total_pasien_tahunan`
  ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `tahun_id_2` (`tahun_id`,`puskesmas_id`,`bulan_id`), ADD KEY `tahun_id` (`tahun_id`), ADD KEY `puskesmas_id` (`puskesmas_id`), ADD KEY `bulan_id` (`bulan_id`);

--
-- Indexes for table `penyakit`
--
ALTER TABLE `penyakit`
  ADD PRIMARY KEY (`penyakit_id`);

--
-- Indexes for table `penyakit_jk`
--
ALTER TABLE `penyakit_jk`
  ADD PRIMARY KEY (`idp`);

--
-- Indexes for table `puskesmas`
--
ALTER TABLE `puskesmas`
  ADD PRIMARY KEY (`puskesmas_id`);

--
-- Indexes for table `tahun`
--
ALTER TABLE `tahun`
  ADD PRIMARY KEY (`tahun_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `histori_total_pasien_tahunan`
--
ALTER TABLE `histori_total_pasien_tahunan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=157;
--
-- AUTO_INCREMENT for table `penyakit`
--
ALTER TABLE `penyakit`
  MODIFY `penyakit_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `penyakit_jk`
--
ALTER TABLE `penyakit_jk`
  MODIFY `idp` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `puskesmas`
--
ALTER TABLE `puskesmas`
  MODIFY `puskesmas_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
