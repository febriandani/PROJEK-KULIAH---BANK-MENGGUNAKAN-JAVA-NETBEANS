-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 27, 2021 at 04:04 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_bank`
--

-- --------------------------------------------------------

--
-- Table structure for table `antar_bank`
--

CREATE TABLE `antar_bank` (
  `nomor_rekening` int(11) NOT NULL,
  `nama_lengkap` varchar(50) NOT NULL,
  `nama_bank` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `antar_bank`
--

INSERT INTO `antar_bank` (`nomor_rekening`, `nama_lengkap`, `nama_bank`) VALUES
(6765823, 'Andin', 'BCA'),
(676890234, 'Ana', 'BCA');

-- --------------------------------------------------------

--
-- Table structure for table `histori`
--

CREATE TABLE `histori` (
  `no` int(11) NOT NULL,
  `dari_rekening` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `keterangan` varchar(50) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `biaya_admin` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `histori`
--

INSERT INTO `histori` (`no`, `dari_rekening`, `tanggal`, `keterangan`, `jumlah`, `biaya_admin`) VALUES
(9, 1359159127, '2021-12-27', 'Transfer ke Andin', 93000, 7500);

-- --------------------------------------------------------

--
-- Table structure for table `login_akses`
--

CREATE TABLE `login_akses` (
  `nik` varchar(16) NOT NULL,
  `nomor_rekening` varchar(40) NOT NULL,
  `nama_lengkap` varchar(30) NOT NULL,
  `kode_akses` varchar(6) NOT NULL,
  `saldo_awal` varchar(40) NOT NULL,
  `jenis_kartu` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login_akses`
--

INSERT INTO `login_akses` (`nik`, `nomor_rekening`, `nama_lengkap`, `kode_akses`, `saldo_awal`, `jenis_kartu`) VALUES
('367405170200005', '1359159127', 'muhammad febri a', 'f3bry1', '892500', 'BLACK'),
('4621673124678425', '1591149170', 'syahwa rahma a', 'sy4hwa', '1319000', 'GOLD');

-- --------------------------------------------------------

--
-- Table structure for table `nasabah`
--

CREATE TABLE `nasabah` (
  `nomor_rekening` varchar(40) NOT NULL,
  `nik` varchar(16) NOT NULL,
  `nama_lengkap` varchar(40) NOT NULL,
  `jenis_kelamin` varchar(15) NOT NULL,
  `alamat` varchar(40) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `no_handphone` varchar(15) NOT NULL,
  `email` varchar(40) NOT NULL,
  `jenis_kartu` varchar(40) NOT NULL,
  `saldo` varchar(40) NOT NULL,
  `pin` int(6) NOT NULL,
  `kode_akses` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nasabah`
--

INSERT INTO `nasabah` (`nomor_rekening`, `nik`, `nama_lengkap`, `jenis_kelamin`, `alamat`, `tanggal_lahir`, `no_handphone`, `email`, `jenis_kartu`, `saldo`, `pin`, `kode_akses`) VALUES
('1359159127', '367405170200005', 'muhammad febri a', 'PRIA', 'poncol', '2021-12-16', '0895123', 'febrianddaini@gmail', 'BLACK', '892500', 301021, 'f3bry1'),
('1591149170', '4621673124678425', 'syahwa rahma a', 'WANITA', 'poncol raya', '2021-12-17', '0985612228', 'syahwa@gmail', 'GOLD', '1319000', 301021, 'syh4wa');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `antar_bank`
--
ALTER TABLE `antar_bank`
  ADD PRIMARY KEY (`nomor_rekening`);

--
-- Indexes for table `histori`
--
ALTER TABLE `histori`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `login_akses`
--
ALTER TABLE `login_akses`
  ADD PRIMARY KEY (`kode_akses`),
  ADD UNIQUE KEY `nomor rekening` (`nomor_rekening`);

--
-- Indexes for table `nasabah`
--
ALTER TABLE `nasabah`
  ADD PRIMARY KEY (`nomor_rekening`),
  ADD UNIQUE KEY `nik` (`nik`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `histori`
--
ALTER TABLE `histori`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
