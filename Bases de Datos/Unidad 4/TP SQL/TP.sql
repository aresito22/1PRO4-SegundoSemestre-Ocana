USE facturacion;

-- 1
SELECT * 
FROM clientes
WHERE codpostal = 5500;

-- 2
SELECT * 
FROM clientes
WHERE apellido = 'Baez';

-- 3
SELECT apellido, nombre 
FROM clientes
WHERE codcliente > 105;

-- 4
SELECT codcliente, apellido, nrodoc, tipocliente
FROM clientes
WHERE tipodoc = 'pasaporte';

-- 5
SELECT codcliente, apellido
FROM clientes
WHERE codpostal IN (1000, 1001, 1002);

-- 6
SELECT codcliente, apellido
FROM clientes
WHERE codpostal NOT IN (1000, 1001, 1002);

-- 7
SELECT *
FROM clientes
WHERE codcliente BETWEEN 103 AND 110;

-- 8 
SELECT *
FROM clientes
WHERE codcliente <= 110;

-- 9
SELECT apellido, nombre, nrodoc
FROM clientes
WHERE tipocliente = 'regular' AND codpostal = 5500;

-- 10
SELECT apellido, nombre, nrodoc
FROM clientes
WHERE tipocliente = 'regular' AND codpostal IN (5500, 5501, 1001);

-- 11
SELECT COUNT(*) 
FROM clientes;

-- 12
SELECT COUNT(*)
FROM clientes
WHERE codpostal = 5500;

-- 13
SELECT COUNT(codpostal)
FROM clientes;

-- 14
SELECT COUNT(*)
FROM clientes
WHERE codpostal IS NULL;

-- 15
SELECT MAX(codpostal), MIN(codpostal)
FROM clientes;

-- 16
SELECT codpostal, COUNT(*)
FROM clientes
GROUP BY codpostal;

-- 17
SELECT codpostal, COUNT(*)
FROM clientes
GROUP BY codpostal
HAVING COUNT(*) > 2;




