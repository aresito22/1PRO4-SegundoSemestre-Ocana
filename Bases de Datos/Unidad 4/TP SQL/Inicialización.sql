USE facturacion;

INSERT INTO localidades (codpostal, localidad) VALUES (1000, 'Capital Federal');
INSERT INTO localidades (codpostal, localidad) VALUES (1001, 'CABA');
INSERT INTO localidades (codpostal, localidad) VALUES (5500, 'Mendoza');
INSERT INTO localidades (codpostal, localidad) VALUES (5501, 'Godoy Cruz');
INSERT INTO localidades (codpostal, localidad) VALUES (5502, 'Mendoza');
INSERT INTO localidades (codpostal, localidad) VALUES (5503, 'San Francisco del Monte');
INSERT INTO localidades (codpostal, localidad) VALUES (5519, 'Dorrego');
INSERT INTO localidades (codpostal, localidad) VALUES (1002, 'CABA');

INSERT INTO clientes (codcliente, apellido, nombre, codpostal, tipodoc, nrodoc, tipocliente)
VALUES
(100, 'Perez', 'Gabriel', 5500, 'dni', 32050454, 'preferencial'),
(101, 'Gonzalez', 'Catalina', 5501, 'dni', 42005454, 'regular'),
(102, 'Barroso', 'Lautaro', 5500, 'dni', 45047891, 'regular'),
(103, 'Balmaceda', 'Juan', 5502, 'dni', 48090328, 'preferencial'),
(104, 'Baez', 'Juan', 5502, 'dni', 32132765, 'transitorio'),
(105, 'Baez', 'Carlos', 5501, 'dni', 33175202, 'regular'),
(106, 'Balmaceda', 'Juan', 5502, 'pasaporte', 99214879, 'regular'),
(107, 'Fabres', 'Juan', 1001, 'pasaporte', 99457891, 'transitorio'),
(108, 'Bustos', 'Elio', 1001, 'pasaporte', 99587941, 'preferencial'),
(110, 'Martinez', 'Marcela', 1002, 'dni', 33258798, 'transitorio'),
(111, 'Cabo', 'Andres', 5500, 'pasaporte', 99001998, 'transitorio');


