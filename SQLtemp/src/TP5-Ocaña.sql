-- 1
INSERT INTO usuarios (nombre, email, edad, ciudad)
VALUES ('Lucía Fernández', 'lucia@example.com', 27, 'Madrid');

-- 2
UPDATE usuarios
SET edad = 29
WHERE nombre = 'Ana Torres';

-- 3
UPDATE usuarios
SET ciudad = 'Valencia'
WHERE nombre = 'María López';

-- 4
UPDATE usuarios
SET edad = edad + 1;

-- 5
DELETE FROM usuarios
WHERE nombre = 'Carlos Sánchez';

-- 6
INSERT INTO usuarios (nombre, email, edad, ciudad)
VALUES ('Elena Rodríguez', 'elena@example.com', 33, 'Málaga');

-- 7
UPDATE usuarios
SET email = 'juan.perez@example.com'
WHERE nombre = 'Juan Pérez';

-- 8
UPDATE usuarios
SET edad = edad + 2
WHERE ciudad = 'Barcelona';

-- 9
DELETE FROM usuarios
WHERE edad < 27;

-- 10
INSERT INTO usuarios (nombre, email, edad, ciudad)
VALUES
    ('Luis Méndez', 'luis@example.com', 31, 'Madrid'),
    ('Paula Díaz', 'paula@example.com', 26, 'Sevilla');

-- 11
UPDATE usuarios
SET ciudad = 'Madrid'
WHERE nombre = 'Pedro Gómez'
  AND ciudad = 'Bilbao';

-- 12
DELETE FROM usuarios
WHERE email LIKE '%example.com';