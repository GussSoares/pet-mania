-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 29-Nov-2018 às 03:19
-- Versão do servidor: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bancops`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `loginadm`
--

CREATE TABLE `loginadm` (
  `nome` varchar(200) NOT NULL,
  `senha` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `loginadm`
--

INSERT INTO `loginadm` (`nome`, `senha`) VALUES
('admin', 'qpzm10');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE `produtos` (
  `produto` varchar(50) NOT NULL,
  `preco` double NOT NULL,
  `qtd` int(11) NOT NULL,
  `id` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `produtos`
--

INSERT INTO `produtos` (`produto`, `preco`, `qtd`, `id`) VALUES
('Osso de nó', 10, 18, 28),
('Ração Pedygreee', 120, 30, 29),
('Bola de hamster', 15, 4, 30),
('Coleira', 8, 21, 31);

-- --------------------------------------------------------

--
-- Estrutura da tabela `servicos`
--

CREATE TABLE `servicos` (
  `id` int(11) NOT NULL,
  `nome` varchar(500) NOT NULL,
  `especie` varchar(50) NOT NULL,
  `altura` double NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `servico` varchar(200) NOT NULL,
  `obs` varchar(1000) NOT NULL,
  `valorserv` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `servicos`
--

INSERT INTO `servicos` (`id`, `nome`, `especie`, `altura`, `sexo`, `servico`, `obs`, `valorserv`) VALUES
(24, 'Bolt', 'Cachorro', 70, 'Masculino', 'Banho e tosa', 'Tem uma pequena ferida na pata esquerda da frente, e tá gripado.', 30),
(25, 'Bolt', 'Cachorro', 70, 'Masculino', 'Banho e tosa', 'Tem uma pequena ferida na pata esquerda da frente, e tá gripado.', 30),
(32, 'Airton', 'Ave', 0.6, 'Masculino', 'Reparo de bico', 'O seu bico está quebrado', 60);

-- --------------------------------------------------------

--
-- Estrutura da tabela `status`
--

CREATE TABLE `status` (
  `tvendas` int(10) NOT NULL,
  `tservicos` int(10) NOT NULL,
  `investimento` double NOT NULL,
  `lucro` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `status`
--

INSERT INTO `status` (`tvendas`, `tservicos`, `investimento`, `lucro`) VALUES
(11, 12, 0, 203);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `nome` varchar(500) NOT NULL,
  `email` varchar(300) NOT NULL,
  `senha` varchar(10) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `telefone` varchar(17) NOT NULL,
  `endereco` varchar(400) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuarios`
--

INSERT INTO `usuarios` (`id`, `nome`, `email`, `senha`, `cpf`, `telefone`, `endereco`) VALUES
(3, 'Davi Nunes', 'davinunes@gmail.com', '123456', '102.384.928-39', ' (38) 92938-4782', 'rua saint louis'),
(4, 'gegyge', 'aaaaaaaa', '123', '111.111.111-11', ' (11) 91111-1111', '11111111111111'),
(5, 'Guilherme Severino', 'guilhermeseverinog@gmail.com', '310501gg', '111.111.111-11', ' (11) 91111-1111', 'Rua Torreon P.Potira'),
(6, 'daaa', 'adas', '123', '111.111.111-11', ' (11) 91111-1111', '11111'),
(7, 'Marquitos', 'marcolino@htmail.com', '123', '222.231.414-14', ' (11) 91111-1111', 'Rua Valmir Perícles');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `servicos`
--
ALTER TABLE `servicos`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `status`
--
ALTER TABLE `status`
  ADD PRIMARY KEY (`lucro`);

--
-- Indexes for table `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `produtos`
--
ALTER TABLE `produtos`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT for table `servicos`
--
ALTER TABLE `servicos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
