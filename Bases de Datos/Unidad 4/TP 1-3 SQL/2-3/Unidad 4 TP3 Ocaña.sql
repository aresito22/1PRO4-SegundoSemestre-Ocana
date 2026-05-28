USE facturacion;

-- 1
SELECT nrofact, hora,
IF(hora < '12:00:00', 'Turno Mañana', 'Turno Tarde') AS "Turno"
FROM factura;
-- 2
SELECT apellido, credito,
IF(credito IS NULL, 'Sin Asignar', 
    CASE 
        WHEN credito > 600000 THEN 'Crédito Alto' 
        ELSE 'Crédito Estándar' 
    END) AS "Estado"
FROM clientes;
-- 3
SELECT nrofact, fecha,
IF(MONTH(DATE_ADD(fecha, INTERVAL 30 DAY)) = 12, 
    CONCAT('Recargo $ ', 10000 * 0.15), 
    CONCAT('Recargo $ ', 10000 * 0.05)) AS "Recargo"
FROM factura;
-- 4
SELECT codven, COUNT(*) AS total,
CASE
    WHEN COUNT(*) = 1 THEN 'Nivel Inicial'
    WHEN COUNT(*) BETWEEN 2 AND 3 THEN 'Nivel Medio'
    WHEN COUNT(*) > 3 THEN 'Nivel Experto'
END AS "Nivel"
FROM factura
GROUP BY codven;
-- 5
SELECT nrofact, fecha,
IF(DATEDIFF(CURDATE(), fecha) > 1000, 'Venta Histórica',
    IF(DATEDIFF(CURDATE(), fecha) BETWEEN 500 AND 1000, 'Venta Antigua', 'Reciente')) AS "Antigüedad"
FROM factura;
-- 6
SELECT apellido, comision,
IF(comision > 0.50 AND apellido LIKE 'S%', comision * 1.20, comision) AS "Comision_Final"
FROM vendedores;
-- 7
SELECT nrofact, hora,
IF(hora > '11:00:00', CONCAT('Retraso ', TIMEDIFF(hora, '11:00:00')), 'Sin Retraso') AS "Estado"
FROM factura;
-- 8
SELECT stock, minimo,
IF(stock < minimo, CONCAT('REPONER URGENTE: ', minimo - stock), 'Stock OK') AS "Estado"
FROM articulos;
-- 9
SELECT fecha,
IF(DAYNAME(fecha) = 'Wednesday', 
    CONCAT('$ ', 1000 * 0.90), 
    CONCAT('$ ', 1000)) AS "Precio_Final"
FROM factura;
-- 10
SELECT apellido, codpostal,
CASE
    WHEN codpostal = 5500 THEN UPPER(apellido)
    WHEN codpostal = 5501 THEN LOWER(apellido)
    ELSE REVERSE(apellido)
END AS "Apellido_Formato"
FROM clientes;