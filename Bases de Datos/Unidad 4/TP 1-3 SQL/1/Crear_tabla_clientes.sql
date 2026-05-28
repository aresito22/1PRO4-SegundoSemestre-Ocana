USE facturacion;

CREATE TABLE `clientes` (
  `codcliente` int(4) NOT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `codpostal` int(4) DEFAULT NULL,
  `tipodoc` enum('dni','pasaporte','ce','ci','tramite') DEFAULT NULL,
  `nrodoc` int(8) DEFAULT NULL,
  `tipocliente` set('preferencial','regular','transitorio') DEFAULT NULL COMMENT 'Define el tipo de cliente',
  
  PRIMARY KEY (`codcliente`),
  KEY `idx_apellido` (`apellido`),
  KEY `idx_codpostal` (`codpostal`),
  KEY `idx_tipodoc` (`tipodoc`),
  KEY `idx_nrodoc` (`nrodoc`),

  CONSTRAINT `fk_clientes1_codpostal`
    FOREIGN KEY (`codpostal`)
    REFERENCES `localidades` (`codpostal`)
)
ENGINE=InnoDB 
DEFAULT CHARSET=utf8 
COLLATE=utf8_bin 
COMMENT='Tabla con datos de los clientes';

