-- 1
CREATE TABLE vuelos AS
SELECT
    FlightDate AS fecha_vuelo,
    Airline AS aerolinea,
    Origin AS origen,
    Dest AS destino,
    Cancelled AS cancelado,
    Diverted AS desviado,
    DepTime AS hora_salida,
    DepDelay AS retraso_salida,
    ArrTime AS hora_llegada,
    ArrDelay AS retraso_llegada,
    AirTime AS tiempo_de_vuelo,
    Distance AS distancia_recorrida,
    OriginAirportID AS id_local_aeropuerto_de_origen,
    OriginCityName AS ciudad_origen,
    OriginState AS siglas_estado_origen,
    OriginStateFips AS id_estado_origen,
    OriginStateName AS estado_origen,
    OriginWAC AS id_global_aeropuerto_origen,
    DestAirportID AS id_local_aeropuerto_destino,
    DestCityName AS ciudad_destino,
    DestState AS siglas_estado_destino,
    DestStateFips AS id_estado_destino,
    DestStateName AS estado_destino,
    DestWAC AS id_global_aeropuerto_destino
FROM vuelos_original;

-- 2
DESCRIBE vuelos;

-- 4
SELECT *
FROM vuelos
WHERE cancelado = TRUE;

-- 5
SELECT *
FROM vuelos
WHERE estado_origen = 'Alabama';

-- 6
SELECT *
FROM vuelos
WHERE estado_origen = 'Alabama'
  AND cancelado = TRUE;

-- 7
SELECT *
FROM vuelos
WHERE estado_origen LIKE 'Ma%';

-- 8
SELECT DISTINCT estado_origen
FROM vuelos
ORDER BY estado_origen ASC;

-- 9
SELECT COUNT(*) AS cantidad_vuelos
FROM vuelos;

-- 10
SELECT COUNT(*) AS cantidad_vuelos_cancelados
FROM vuelos
WHERE cancelado = TRUE;

-- 11
SELECT SUM(distancia_recorrida) AS distancia_total
FROM vuelos;

-- 12
SELECT AVG(distancia_recorrida) AS distancia_promedio
FROM vuelos;

-- 13
SELECT
    MIN(distancia_recorrida) AS distancia_minima,
    MAX(distancia_recorrida) AS distancia_maxima
FROM vuelos;

-- 14a
SELECT COUNT(*) AS cantidad_vuelos
FROM vuelos
WHERE estado_origen = 'Texas'
  AND estado_destino = 'Colorado';

-- 14b
SELECT COUNT(*) AS cantidad_vuelos_cancelados
FROM vuelos
WHERE cancelado = TRUE;

-- 14c (salidas)
SELECT AVG(retraso_salida) AS retraso_promedio_salida
FROM vuelos;

-- 14c (llegadas)
SELECT AVG(retraso_llegada) AS retraso_promedio_llegada
FROM vuelos;

-- 14d
SELECT AVG(distancia_recorrida / tiempo_de_vuelo) AS velocidad_promedio
FROM vuelos
WHERE tiempo_de_vuelo > 0;

-- 14e (10 rutas más largas)
SELECT
    origen,
    destino,
    distancia_recorrida
FROM vuelos
ORDER BY distancia_recorrida DESC
    LIMIT 10;

-- 14e (10 rutas más cortas)
SELECT
    origen,
    destino,
    distancia_recorrida
FROM vuelos
ORDER BY distancia_recorrida ASC
    LIMIT 10;