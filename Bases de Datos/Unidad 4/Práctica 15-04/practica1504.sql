-- 1)
SELECT * FROM cliente

-- 2)
SELECT apellido, nombre
FROM cliente

-- 3)
INSERT INTO cliente (apellido, nombre, dni, direccion, telefono)
VALUES ('García', 'Marta', 25998457, 'San Martín 77', NULL)

SELECT * FROM cliente
WHERE apellido = 'García'

-- 4)
SELECT * FROM articulo
WHERE precio > 10000

-- 5)
SELECT * FROM articulo
WHERE precio BETWEEN 50000 AND 200000

-- 6)
SELECT * FROM cliente
WHERE direccion LIKE '%San%'

-- 7)
SELECT * FROM articulo
WHERE cantidad < 10

-- 8)
SELECT * FROM cliente
WHERE dni IN ('20123456', '25998457', '30999888')

-- 9)
SELECT * FROM articulo
WHERE nombre LIKE 'A%'

-- 10)
SELECT * FROM cliente
WHERE telefono IS NULL