USE proyectos;
SET SQL_SAFE_UPDATES = 0;
-- 1
INSERT INTO legajos (legajo, apellido, nombre, domicilio, cp, telefono, celular)
VALUES
	(109, 'Gimenez', 'Sabrina', 'Sarmiento 100', 5519, NULL, NULL),
	(110, 'Saleme', 'Ismael', 'Mitre 200', 5515, NULL, NULL),
	(111, 'Maron', 'Mercedes', 'Lujan 33', 5500, NULL, NULL),
	(112, 'Campos', 'Francisco', 'Tucuman 1500', 5501, NULL, NULL),
	(113, 'Bagoros', 'Katia', 'Godoy Cruz 710', 5502, NULL, NULL);
    
-- 2
INSERT INTO equipolegajo (idequipo, idlegajo)
VALUES
	(5000, 109),
	(5000, 110),
	(4000, 111),
	(2000, 112),
	(3000, 113);
    
-- 3
INSERT INTO proyectos (nroproyecto, nombrepoyecto, porcproyecto, fechaproyecto, presproyecto, duracion)
VALUES
	(1005, 'Gestión de vuelos', 40, '2025-05-19', 50000, 1000),
	(1006, 'Interfaz de usuario', 40, '2024-03-21', 60000, 1000),
	(1007, 'Campus universitario', 60, '2023-09-22', 35000, 500),
	(1008, 'Sistema de análisis', 90, '2022-06-05', 300000, 3000),
	(1009, 'Facturación cine', 35, '2026-01-15', 15000, 390);

-- 4
INSERT INTO hs_trabajadas (legajo, dia, horaentrada, horasalida)
VALUES
	(108, '2026-01-02', '09:00:10', '18:00:10'),
	(109, '2026-02-10', '08:00:00', '16:00:00'),
	(110, '2026-03-05', '07:30:00', '15:30:00'),
	(111, '2026-04-01', '08:15:00', '17:00:00'),
	(112, '2026-04-20', '09:00:00', '18:00:00'),
	(113, '2026-05-10', '07:00:00', '15:00:00');
    
-- 5
UPDATE hs_trabajadas
SET dia = DATE_ADD(dia, INTERVAL 7 YEAR)
WHERE YEAR(dia) = 2018;

-- 6
UPDATE hs_trabajadas
SET horaentrada = '08:00:10'
WHERE horaentrada = '09:00:10';

UPDATE equipolegajo
SET idlegajo = 108
WHERE idequipo = 5000 AND idlegajo = 109;

-- 7
CREATE TABLE proyectos_backup LIKE proyectos;

INSERT INTO proyectos_backup
SELECT * FROM proyectos;

ALTER TABLE proyectos
ADD COLUMN dias DECIMAL(10,2);

UPDATE proyectos
SET dias = duracion / 24;

-- 8
SELECT l.apellido, p.nombrepoyecto, p.fechaproyecto, ht.dia
FROM hs_trabajadas ht
JOIN equipolegajo el ON ht.legajo = el.idlegajo
JOIN proy_equipo_hs peh ON el.idequipo = peh.idequipo
JOIN proyectos p ON peh.idproyecto = p.nroproyecto
JOIN legajos l ON ht.legajo = l.legajo
WHERE ht.dia < p.fechaproyecto;

-- 10
INSERT INTO sueldos (legajo, basico, conyugue, hijos, departamento)
VALUES
    (109, 20000, 0, NULL, 100),
    (110, 20000, 0, NULL, 100),
    (111, 20000, 0, NULL, 100),
    (112, 20000, 0, NULL, 100),
    (113, 20000, 0, NULL, 100);

-- 11
ALTER TABLE sueldos
DROP COLUMN departamentos;

-- 12
DELETE FROM proyectos
WHERE fechaproyecto < '2020-01-01';

-- 13
CREATE VIEW v_horas_empleado_proyecto AS
SELECT l.apellido, l.nombre, p.nombrepoyecto, peh.hstrabajadas
FROM legajos l
JOIN equipolegajo el ON l.legajo = el.idlegajo
JOIN proy_equipo_hs peh ON el.idequipo = peh.idequipo
JOIN proyectos p ON peh.idproyecto = p.nroproyecto;