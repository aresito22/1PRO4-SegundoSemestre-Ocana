USE facturacion;
CREATE TABLE `localidades` (   
             `codpostal` int(4) NOT NULL, 
             `localidad` varchar(30) NOT NULL,
              PRIMARY KEY (`codpostal`)) 
              ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Tabla con datos de códigos postales y localidades'

CREATE TABLE `clientes` (
  `codcliente` int(4) NOT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `codpostal` int(4) DEFAULT NULL,
  `tipodoc` enum('dni','pasaporte','ce','ci','tramite') DEFAULT NULL,
  `nrodoc` int(8) DEFAULT NULL,
  `tipocliente` set('preferencial','regular','transitorio') DEFAULT NULL COMMENT 'Define el tipo de cliente',
  PRIMARY KEY (`codcliente`),
  KEY `apellido` (`apellido`),
  KEY `odpostal` (`codpostal`),
  KEY `tipodoc` (`tipodoc`),
  KEY `nrodoc` (`nrodoc`),
  CONSTRAINT `clientes_ibfk_1` FOREIGN KEY (`codpostal`) REFERENCES `localidades` (`codpostal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Tabla con datos de los clientes'

