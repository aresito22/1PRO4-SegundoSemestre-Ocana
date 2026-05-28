USE facturacion;

-- 1
SELECT nombre, apellido
FROM clientes;
-- 2
SELECT codcliente AS "Identificación", nombre AS "Nombre_Cliente"
FROM clientes;
-- 3
SELECT apellido, credito * 1.21 AS "Credito_con_IVA"
FROM clientes;
-- 4
SELECT nombre, CONCAT('$ ', credito) AS credito
FROM clientes;
-- 5
SELECT apellido
FROM clientes
WHERE codpostal <> 5500;
-- 6
SELECT SQRT(credito), POWER(credito, 2)
FROM clientes
WHERE codcliente > 105;
-- 7
SELECT apellido, CEILING(credito + 350.75)
FROM clientes
WHERE tipodoc = "pasaporte";
-- 8
SELECT TRUNCATE(credito / 3, 2)
FROM clientes;
-- 9
SELECT POW(ABS(10 - 5), 2);
-- 10
SELECT nrodoc % 2
FROM clientes;
-- 11
SELECT *
FROM clientes
WHERE codpostal = 5502 AND nombre = "Juan";
-- 12
SELECT *
FROM clientes
WHERE apellido = "Perez" OR apellido = "Gonzalez";
-- 13
SELECT *
FROM clientes
WHERE tipodoc <> "dni";
-- 14
SELECT *
FROM clientes
WHERE codpostal BETWEEN 5500 AND 5505;
-- 15
SELECT *
FROM clientes
WHERE codpostal IN (5500, 5501, 1001);
-- 16
SELECT *
FROM clientes
WHERE apellido LIKE 'B%';
-- 17
SELECT *
FROM clientes
WHERE nombre LIKE '%ez%';
-- 18
SELECT *
FROM clientes
WHERE nombre LIKE 'Marcel_';
-- 19
SELECT *
FROM clientes
WHERE apellido REGEXP '^F';
-- 20
SELECT *
FROM clientes
WHERE nombre REGEXP 's$';
-- 21
SELECT *
FROM clientes
WHERE nombre REGEXP '[l-z]';
-- 22
SELECT *
FROM clientes
WHERE apellido REGEXP '^.{4}$';
-- 23
SELECT CURDATE() AS "Fecha_Hoy";
-- 24
SELECT YEAR(CURDATE()), MONTHNAME(CURDATE()); 
-- 25
SELECT DATE_FORMAT(NOW(), '%d/%m/%Y %H:%i');
-- 26
SELECT DATE_ADD('1958-09-29', INTERVAL 6 MONTH);
-- 27
SELECT COUNT(credito)
FROM clientes;
-- 28
SELECT CONCAT('$ ', SUM(credito)), CONCAT('$ ', AVG(credito))
FROM clientes;
-- 29
SELECT codpostal, COUNT(*)
FROM clientes
GROUP BY codpostal;
-- 30
SELECT codpostal, COUNT(*)
FROM clientes
GROUP BY codpostal
HAVING COUNT(*) > 2;