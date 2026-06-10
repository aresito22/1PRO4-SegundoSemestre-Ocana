-- 1
SELECT
    COUNT(*) AS TotalVuelos,
    MAX(AirTime) AS MayorDuracion,
    MIN(AirTime) AS MenorDuracion,
    AVG(AirTime) AS DuracionPromedio
FROM vuelos_sample;

-- 2
SELECT
    Airline,
    COUNT(*) AS CantidadVuelos,
    AVG(AirTime) AS DuracionPromedio,
    AVG(DepDelay) AS RetrasoSalidaPromedio
FROM vuelos_sample
GROUP BY Airline
ORDER BY CantidadVuelos DESC;

-- 3
SELECT
    v.Airline,
    ao.AirportName AS AeropuertoOrigen,
    ad.AirportName AS AeropuertoDestino
FROM vuelos_sample v
INNER JOIN Airports ao
    ON v.Origin = ao.AirportCode
INNER JOIN Airports ad
    ON v.Dest = ad.AirportCode
ORDER BY v.ArrDelayMinutes DESC
LIMIT 10;

-- 4
SELECT
    Airline,
    AVG(DepDelay) AS RetrasoPromedio
FROM vuelos_sample
GROUP BY Airline
HAVING AVG(DepDelay) >
(
    SELECT AVG(DepDelay)
    FROM vuelos_sample
);

-- 5
WITH RetrasosPorVuelo AS (
    SELECT
        FlightDate,
        Airline,
        Origin,
        Dest,
        DepDelay,
        ArrDelayMinutes,
        DepDelay + ArrDelayMinutes AS RetrasoTotal
    FROM vuelos_sample
)
SELECT *
FROM RetrasosPorVuelo
ORDER BY RetrasoTotal DESC
LIMIT 5;

-- 6
SELECT
    Origin,
    COUNT(*) AS CantidadVuelosRetrasados
FROM vuelos_sample
WHERE DepDelay > 30
GROUP BY Origin
HAVING COUNT(*) > 100;

-- 7
SELECT
    a.Modelo,
    AVG(v.AirTime) AS DuracionPromedio
FROM vuelos_sample v
INNER JOIN Aircraft a
    ON v.AircraftModel = a.Modelo
GROUP BY a.Modelo;

-- 8
SELECT *
FROM vuelos_sample v
WHERE ArrDelayMinutes >
(
    SELECT AVG(v2.ArrDelayMinutes)
    FROM vuelos_sample v2
    WHERE v2.Airline = v.Airline
);

-- 9
WITH VuelosPorAerolinea AS (
    SELECT
        Airline,
        COUNT(*) AS TotalVuelos
    FROM vuelos_sample
    GROUP BY Airline
)
SELECT
    Airline,
    TotalVuelos,
    ROUND(
        TotalVuelos * 100.0 /
        (SELECT COUNT(*) FROM vuelos_sample),
        2
    ) AS PorcentajeVuelos
FROM VuelosPorAerolinea
ORDER BY PorcentajeVuelos DESC;

-- 10
SELECT *
FROM vuelos_sample
WHERE DepDelay > 30;

SELECT
    Airline,
    AVG(DepDelay) AS RetrasoPromedio
FROM vuelos_sample
GROUP BY Airline
HAVING AVG(DepDelay) > 30;