SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


CREATE DATABASE `facturacion`;
USE `facturacion`;
--
-- Base de datos: `facturacion`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulos`
--

CREATE TABLE `articulos` (
  `codart` int(11) NOT NULL,
  `detalle` varchar(80) DEFAULT NULL,
  `unidad` char(4) DEFAULT NULL,
  `precio` decimal(10,0) DEFAULT NULL,
  `iva` float DEFAULT NULL,
  `stock` float DEFAULT NULL,
  `minimo` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `articulos`
--

INSERT INTO `articulos` (`codart`, `detalle`, `unidad`, `precio`, `iva`, `stock`, `minimo`) VALUES
(200, 'Tornillo rosca madera 1x20', 'un', 35, 0.21, 500, 50),
(300, 'Masilla sintética uso madera', 'kg', 1580, 0.21, 20, 10),
(400, 'Somier 1 1/2 plaza', 'un', 35000, 0.21, 5, 1),
(500, 'silla metálica tapizada gris', 'un', 2500, 0.21, 20, 6),
(502, 'Silla de roble color natural estilo Luis XV', 'un', 19000, 0.21, 24, 6),
(503, 'Silla laqueda color blanco', 'un', 16800, 0.21, 12, 6),
(600, 'Mesa circular tapa de vidrio', 'un', 15246, 0.21, 3, 1),
(601, 'Mesa rectangular de madera de roble color natural', 'un', 28921, 0.21, 1, 1),
(605, 'Barniz color cedro x 1 ', 'lt', 2500, 0.15, 50, 10),
(606, 'Barniz color cedro x 2', 'lt', 2600, 0.15, 20, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `codcliente` int(11) NOT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `codpostal` int(11) DEFAULT NULL,
  `credito` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Tabla con datos de los clientes';

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`codcliente`, `apellido`, `nombre`, `codpostal`, `credito`) VALUES
(100, 'Perez', 'Gabriel', 5500, 500000),
(101, 'Gomez', 'Catalina', 5501, 800000),
(102, 'Barroso', 'Lautaro', 5500, 550000),
(103, 'Balmaceda', 'Juan', 5502, 490000),
(104, 'Baez', 'Juan', 5502, 820000),
(105, 'Baez', 'Carlos', 5501, 700000),
(106, 'Balmaceda', 'Juan', 5502, 450000),
(107, 'Fabres', 'Juan', 1001, 350000),
(108, 'Rios', 'Martin', 1000, 800000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `envios`
--

CREATE TABLE `envios` (
  `codtransp` int(11) NOT NULL,
  `codpostal` int(11) NOT NULL,
  `costo` decimal(5,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `nrofact` int(11) NOT NULL,
  `codcliente` int(11) DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `codven` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Describe la cabecera de la factura';

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`nrofact`, `codcliente`, `fecha`, `hora`, `codven`) VALUES
(1000, 100, '2023-03-29 00:00:00', '10:00:00', 1),
(1001, 101, '2023-03-29 00:00:00', '10:15:00', 4),
(1002, 102, '2023-03-30 00:00:00', '10:20:00', 2),
(1003, 101, '2023-03-30 00:00:00', '09:20:00', 3),
(1004, 102, '2023-03-29 00:00:00', '09:00:00', 4),
(1005, 104, '2023-03-30 00:00:00', '09:10:00', 1),
(1006, 101, '2023-04-01 00:00:00', '10:30:00', 1),
(1007, 103, '2023-04-01 00:00:00', '10:35:00', 3),
(1008, 105, '2023-04-01 00:00:00', '11:00:00', 4),
(1010, 102, '2023-03-23 00:00:00', '09:00:00', 2),
(1011, 108, '2023-04-12 00:00:00', '10:00:00', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura_cuerpo`
--

CREATE TABLE `factura_cuerpo` (
  `nrofact` int(11) NOT NULL,
  `codart` int(11) NOT NULL,
  `cantidad` decimal(8,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `factura_cuerpo`
--

INSERT INTO `factura_cuerpo` (`nrofact`, `codart`, `cantidad`) VALUES
(1000, 200, 25.00),
(1000, 300, 50.00),
(1001, 500, 10.00),
(1002, 400, 30.00),
(1002, 503, 25.00),
(1003, 200, 10.00),
(1003, 606, 8.00),
(1004, 400, 1.00),
(1005, 605, 15.00),
(1005, 606, 10.00),
(1007, 200, 35.00),
(1008, 605, 8.00),
(1008, 606, 5.00),
(1010, 300, 4.00),
(1010, 400, 1.00),
(1010, 500, 2.00),
(1011, 601, 1.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `localidades`
--

CREATE TABLE `localidades` (
  `codpostal` int(11) NOT NULL,
  `localidad` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `localidades`
--

INSERT INTO `localidades` (`codpostal`, `localidad`) VALUES
(1000, 'Cap Federal'),
(5501, 'Godoy Cruz'),
(1110, 'Gran Bs As'),
(5502, 'Lujan de Cuyo'),
(5515, 'Maipú'),
(5500, 'Mendoza'),
(1001, 'Zona 1'),
(1002, 'Zona 2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `transportes`
--

CREATE TABLE `transportes` (
  `codtransp` int(11) NOT NULL,
  `nombretransporte` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `transportes`
--

INSERT INTO `transportes` (`codtransp`, `nombretransporte`) VALUES
(1, 'Buenos Aires'),
(2, 'El cordobés'),
(3, 'Independencia'),
(4, 'Furlán'),
(5, 'Correo Argentino'),
(6, 'Andreanni'),
(7, 'OCA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedores`
--

CREATE TABLE `vendedores` (
  `legajo` int(11) NOT NULL,
  `apellido` varchar(40) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `codep` int(4) NOT NULL,
  `comision` decimal(6,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vendedores`
--

INSERT INTO `vendedores` (`legajo`, `apellido`, `nombre`, `codep`, `comision`) VALUES
(1, 'Perez', 'Juan', 10, 0.50),
(2, 'Estevez', 'Marcela', 10, 0.50),
(3, 'Suarez', 'Virginia', 12, 0.60),
(4, 'Martinez', 'Elizabet', 11, 0.40),
(5, 'Gimenez', 'Eduardo', 11, 0.40),
(6, 'Ramirez', 'Julio', 10, 0.50),
(7, 'Estevez', 'Gabriela', 10, 0.50),
(8, 'Muñoz', 'Martín', 12, 0.60),
(9, 'Soloa', 'Rodrigo', 12, 0.60),
(10, 'Cortes', 'andres', 1, 0.02);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `articulos`
--
ALTER TABLE `articulos`
  ADD PRIMARY KEY (`codart`),
  ADD KEY `detalleArticulos` (`detalle`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`codcliente`),
  ADD KEY `apellido` (`apellido`),
  ADD KEY `odpostal` (`codpostal`);

--
-- Indices de la tabla `envios`
--
ALTER TABLE `envios`
  ADD PRIMARY KEY (`codtransp`,`codpostal`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`nrofact`);

--
-- Indices de la tabla `factura_cuerpo`
--
ALTER TABLE `factura_cuerpo`
  ADD PRIMARY KEY (`nrofact`,`codart`);

--
-- Indices de la tabla `localidades`
--
ALTER TABLE `localidades`
  ADD PRIMARY KEY (`codpostal`),
  ADD KEY `Localidades` (`localidad`);

--
-- Indices de la tabla `transportes`
--
ALTER TABLE `transportes`
  ADD PRIMARY KEY (`codtransp`);

--
-- Indices de la tabla `vendedores`
--
ALTER TABLE `vendedores`
  ADD PRIMARY KEY (`legajo`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD CONSTRAINT `clientes_ibfk_1` FOREIGN KEY (`codpostal`) REFERENCES `localidades` (`codpostal`);
COMMIT;


