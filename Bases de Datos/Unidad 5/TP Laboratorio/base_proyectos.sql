SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

-- Base de datos: `proyectos`
CREATE DATABASE IF NOT EXISTS `proyectos`;
USE `proyectos`;

-- --------------------------------------------------------
-- Tablas Principales (Sin dependencias)
-- --------------------------------------------------------

CREATE TABLE `legajos` (
  `legajo` int(11) NOT NULL,
  `apellido` varchar(40) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `domicilio` varchar(60) NOT NULL,
  `cp` int(4) NOT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  `celular` varchar(14) DEFAULT NULL,
  PRIMARY KEY (`legajo`),
  KEY `cp` (`cp`),
  KEY `telefono` (`telefono`),
  KEY `celular` (`celular`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `equipos` (
  `idequipo` int(11) NOT NULL AUTO_INCREMENT,
  `nombreequipo` varchar(60) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`idequipo`)
) ENGINE=InnoDB DEFAULT CHARSET=ascii COLLATE=ascii_bin AUTO_INCREMENT=4001;

CREATE TABLE `proyectos` (
  `nroproyecto` int(11) NOT NULL,
  `nombrepoyecto` varchar(60) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `porcproyecto` float NOT NULL,
  `fechaproyecto` date NOT NULL,
  `presproyecto` float(15,2) NOT NULL,
  `duracion` int(11) NOT NULL,
  PRIMARY KEY (`nroproyecto`)
) ENGINE=InnoDB DEFAULT CHARSET=ascii COLLATE=ascii_bin;

-- --------------------------------------------------------
-- Tablas Dependientes (Con Claves Foráneas)
-- --------------------------------------------------------

CREATE TABLE `adelantosueldos` (
  `legajo` int(11) NOT NULL,
  `monto` decimal(10,2) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  KEY `indice_adelanto_legajo` (`legajo`),
  CONSTRAINT `fk_adelantos_legajo` FOREIGN KEY (`legajo`) REFERENCES `legajos` (`legajo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `equipolegajo` (
  `idequipo` int(11) NOT NULL,
  `idlegajo` int(11) NOT NULL,
  PRIMARY KEY (`idequipo`,`idlegajo`),
  CONSTRAINT `fk_eqleg_equipo` FOREIGN KEY (`idequipo`) REFERENCES `equipos` (`idequipo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_eqleg_legajo` FOREIGN KEY (`idlegajo`) REFERENCES `legajos` (`legajo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='vincula los componentes de los equipos';

CREATE TABLE `hs_trabajadas` (
  `legajo` int(11) NOT NULL,
  `dia` date NOT NULL,
  `horaentrada` time NOT NULL,
  `horasalida` time NOT NULL,
  KEY `legajo` (`legajo`),
  CONSTRAINT `fk_hs_legajo` FOREIGN KEY (`legajo`) REFERENCES `legajos` (`legajo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=ascii COLLATE=ascii_bin;

CREATE TABLE `proy_equipo_hs` (
  `idproyecto` int(11) NOT NULL DEFAULT 0,
  `idequipo` int(11) NOT NULL DEFAULT 0,
  `hstrabajadas` int(4) DEFAULT NULL,
  PRIMARY KEY (`idproyecto`,`idequipo`),
  CONSTRAINT `fk_peh_proyecto` FOREIGN KEY (`idproyecto`) REFERENCES `proyectos` (`nroproyecto`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_peh_equipo` FOREIGN KEY (`idequipo`) REFERENCES `equipos` (`idequipo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=ascii COLLATE=ascii_bin;

CREATE TABLE `sueldos` (
  `legajo` int(11) NOT NULL,
  `basico` float DEFAULT NULL,
  `conyugue` tinyint(1) NOT NULL DEFAULT 0,
  `hijos` int(10) UNSIGNED DEFAULT NULL,
  `departamento` int(4) NOT NULL,
  PRIMARY KEY (`legajo`),
  CONSTRAINT `fk_sueldos_legajo` FOREIGN KEY (`legajo`) REFERENCES `legajos` (`legajo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=ascii COLLATE=ascii_bin;

-- --------------------------------------------------------
-- Vistas Corregidas
-- --------------------------------------------------------

DROP VIEW IF EXISTS `salarios`;
CREATE VIEW `salarios` AS 
SELECT `l`.`apellido` AS `apellido`, `s`.`basico` AS `basico` 
FROM (`legajos` `l` JOIN `sueldos` `s`) 
WHERE `l`.`legajo` = `s`.`legajo`;

DROP VIEW IF EXISTS `vista_e`;
CREATE VIEW `vista_e` AS 
SELECT `t1`.`idequipo` AS `idequipo`, `t1`.`nombreequipo` AS `nombreequipo`, `t3`.`nombrepoyecto` AS `nombrepoyecto` 
FROM `equipos` `t1` 
JOIN `proy_equipo_hs` `t2` ON `t1`.`idequipo` = `t2`.`idequipo`
JOIN `proyectos` `t3` ON `t2`.`idproyecto` = `t3`.`nroproyecto`;

-- --------------------------------------------------------
-- Volcado de Datos (Inserts)
-- --------------------------------------------------------

INSERT INTO `legajos` (`legajo`, `apellido`, `nombre`, `domicilio`, `cp`, `telefono`, `celular`) VALUES
(100, 'Caballero', 'Juan', 'San Martín 600', 5500, '4499090', '2615040504'),
(101, 'Caballero', 'Ignacio', 'San Martín 600', 5500, '4499090', '2615040504'),
(102, 'Martinez', 'Alberto', 'San Martín 605', 5500, '4249099', '2615040504'),
(103, 'Cantero', 'Andrea', 'Bolivar 3300', 5501, '4215866', '2615040504'),
(104, 'Muñoz', 'Andreina', 'Cerro San Juan', 5515, NULL, '2616887799'),
(105, 'Gabrielli', 'Carolina', 'Sarmiento 52', 5505, NULL, '115897744'),
(106, 'Cabaña', 'Juan', 'Catamarca 124', 5501, '4312287', '2648877211'),
(107, 'Llorens', 'Juan', 'Lavalle 304', 5500, NULL, NULL),
(108, 'Llorens', 'Juan', 'Rivadavia 500', 5515, NULL, '2615054789');

INSERT INTO `equipos` (`idequipo`, `nombreequipo`) VALUES
(1000, 'Análisis'),
(2000, 'Desarrollo'),
(3000, 'Calidad'),
(4000, 'Seguridad'),
(5000, 'Ventas');

INSERT INTO `proyectos` (`nroproyecto`, `nombrepoyecto`, `porcproyecto`, `fechaproyecto`, `presproyecto`, `duracion`) VALUES
(1000, 'Facturación', 75, '2021-02-16', 15000.00, 450),
(1001, 'Gestión de Venas', 40, '2022-06-01', 25000.00, 1200),
(1002, 'Gestión Veterinaria', 70, '2020-03-20', 25000.00, 1800),
(1003, 'Facturación Hiper', 100, '2020-02-25', 75000.00, 2500),
(1004, 'Ventas on line', 50, '2022-04-13', 250000.00, 2800);

INSERT INTO `adelantosueldos` (`legajo`, `monto`, `fecha`) VALUES
(100, 2000.00, '2020-02-03'),
(107, 1500.00, '2020-03-18'),
(103, 900.00, '2020-02-10'),
(105, 500.00, '2020-05-18'),
(106, 900.00, '2020-02-15'),
(103, 1000.00, '2023-03-10'),
(107, 550.00, '2023-02-19'),
(103, 3000.00, '2026-04-14'),
(107, 2500.00, '2026-03-19');

INSERT INTO `equipolegajo` (`idequipo`, `idlegajo`) VALUES
(1000, 100), (1000, 102), (1000, 103), (1000, 104),
(2000, 100), (2000, 105), (2000, 106), (2000, 107),
(3000, 100), (3000, 102),
(4000, 100), (4000, 102), (4000, 106);

INSERT INTO `hs_trabajadas` (`legajo`, `dia`, `horaentrada`, `horasalida`) VALUES
(100, '2018-06-02', '07:00:00', '15:00:00'),
(100, '2018-06-03', '07:00:00', '15:00:00'),
(101, '2018-06-02', '07:00:00', '15:00:00'),
(101, '2018-06-03', '07:00:00', '15:00:00'),
(102, '2018-06-02', '07:00:00', '15:00:00'),
(102, '2018-06-03', '07:00:00', '15:00:00'),
(100, '2018-06-02', '07:00:00', '18:00:00'),
(100, '2018-06-03', '07:00:00', '18:00:00'),
(101, '2018-06-04', '07:00:00', '18:00:00'),
(102, '2018-06-04', '07:00:00', '18:00:00'),
(103, '2018-06-04', '07:00:00', '15:00:00'),
(101, '2018-05-24', '07:00:00', '15:00:00'),
(102, '2018-05-20', '08:00:00', '19:00:00'),
(103, '2018-06-17', '07:30:00', '18:35:00'),
(104, '2018-06-17', '08:00:00', '17:45:00'),
(105, '2018-06-17', '08:15:00', '18:00:00'),
(106, '2018-06-17', '08:20:00', '18:20:00'),
(107, '2018-06-17', '08:10:00', '18:00:00'),
(100, '2018-06-18', '07:20:00', '17:00:00'),
(101, '2018-06-18', '08:00:00', '16:00:00'),
(102, '2018-06-18', '08:10:00', '17:00:00'),
(103, '2018-06-18', '08:20:00', '17:00:00'),
(104, '2018-06-18', '08:00:00', '16:00:00'),
(105, '2018-06-18', '08:00:00', '17:10:00'),
(106, '2018-06-18', '09:00:00', '18:00:00'),
(107, '2018-06-18', '08:10:00', '16:00:00');

INSERT INTO `proy_equipo_hs` (`idproyecto`, `idequipo`, `hstrabajadas`) VALUES
(1000, 1000, 890), (1000, 3000, 150), (1000, 4000, 300),
(1001, 1000, 280), (1001, 2000, 1250), (1001, 3000, 150), (1001, 4000, 250),
(1002, 1000, 200), (1002, 2000, 100), (1002, 3000, 210), (1002, 4000, 100),
(1003, 3000, 120),
(1004, 2000, 920);

INSERT INTO `sueldos` (`legajo`, `basico`, `conyugue`, `hijos`, `departamento`) VALUES
(100, 15000, 1, 2, 100),
(101, 13000, 0, NULL, 100),
(102, 18000, 1, 3, 200),
(103, 17500, 0, NULL, 100),
(104, 13000, 1, 1, 200),
(105, 15000, 0, 1, 100),
(106, 18500, 0, NULL, 200),
(107, 17000, 1, NULL, 200);

COMMIT;