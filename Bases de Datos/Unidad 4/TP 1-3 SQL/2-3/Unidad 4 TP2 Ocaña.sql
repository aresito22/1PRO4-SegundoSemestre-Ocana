USE facturacion;

-- 1
SELECT nrofact, DATEDIFF(NOW(), fecha) AS "Dias_Transcurridos"
FROM factura;
-- 2
SELECT nrofact, DATE_ADD(fecha, INTERVAL 45 DAY)
FROM factura;
-- 3
SELECT nrofact, MONTHNAME(fecha), YEAR(fecha)
FROM factura
WHERE MONTH(fecha) = 3;
-- 4
SELECT hora, ADDTIME(hora, '02:30:00') AS "Hora_Entrega_Estimada"
FROM factura;
-- 5
SELECT CONCAT(DATE_FORMAT(fecha, '%d/%m/%Y'), ' - ', DATE_FORMAT(hora, '%H:%i')) AS "Auditoria"
FROM factura;
-- 6
SELECT DAYNAME(fecha) 
FROM factura
WHERE DAY(fecha) = 3;
-- 7
SELECT nrofact, TIMEDIFF(fecha, '12:00:00')
FROM factura;
-- 8
SELECT nrofact, DATEDIFF(fecha, '2000-01-01') AS "Antigüedad"
FROM factura;
-- 9
SELECT hora, ADDTIME(hora, '-01:00:00') AS "Hora_Ajustada"
FROM factura;
-- 10
SELECT nrofact, fecha
FROM factura
WHERE fecha BETWEEN '2023-03-20' AND '2023-04-05'
ORDER BY fecha DESC;
-- 11
SELECT CONCAT(apellido, ', ', nombre) AS "Nombre_Completo"
FROM clientes;
-- 12
SELECT CONCAT(codart, ' - ', detalle)
FROM articulos;
-- 13
SELECT CONCAT(detalle, ' $', precio) AS "Precio"
FROM articulos;
-- 14
SELECT CONCAT(LEFT(credito, 3), '.', RIGHT(credito, 3)) AS "Credito_Formateado"
FROM clientes;
-- 15
SELECT CONCAT(UPPER(LEFT(detalle, 3), LENGTH(detalle) AS "Codigo_Seguridad"))
FROM articulos;
-- 16
SELECT RPAD(apellido, 20, '.') AS "Apellido"
FROM clientes;
-- 17
SELECT CONCAT(codcliente, '@empresa.com') AS "Correo"
FROM clientes;
-- 18
SELECT CONCAT('$ ', precio * 1.21, ' (', unidad, ')') AS "Precio_IVA"
FROM articulos;
-- 19
SELECT REPLACE(LOWER(detalle), ' ', '_')
FROM articulos;
-- 20
SELECT CONCAT(REVERSE(nrodoc), LEFT(apellido, 1))
FROM clientes;
