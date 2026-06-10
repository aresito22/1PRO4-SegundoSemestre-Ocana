-- 1
SELECT
    l.legajo,
    l.apellido,
    l.nombre,
    s.basico
FROM legajos l
         INNER JOIN sueldos s
                    ON l.legajo = s.legajo;

-- 2
SELECT
    p.nombrepoyecto,
    SUM(peh.hstrabajadas) AS total_horas
FROM proyectos p
         LEFT JOIN proy_equipo_hs peh
                   ON p.nroproyecto = peh.idproyecto
GROUP BY p.nroproyecto, p.nombrepoyecto;

-- 3
SELECT legajo
FROM legajos

UNION

SELECT idlegajo
FROM equipolegajo;

-- 4
SELECT legajo
FROM sueldos
WHERE departamento = 100

UNION ALL

SELECT legajo
FROM adelantosueldos;

-- 5
SELECT e.nombreequipo
FROM equipos e
WHERE EXISTS (
    SELECT 1
    FROM proy_equipo_hs peh
             INNER JOIN proyectos p
                        ON peh.idproyecto = p.nroproyecto
    WHERE peh.idequipo = e.idequipo
      AND p.presproyecto > 20000
);

-- 6
SELECT
    legajo,
    basico
FROM sueldos
WHERE basico >= ANY (
    SELECT basico
    FROM sueldos
    WHERE departamento = 200
);

-- 7
WITH AcumuladoAdelantos AS (
    SELECT
        legajo,
        SUM(monto) AS total_adelantos
    FROM adelantosueldos
    GROUP BY legajo
)
SELECT
    l.legajo,
    l.apellido,
    l.nombre,
    s.basico,
    COALESCE(a.total_adelantos, 0) AS total_adelantos,
    s.basico - COALESCE(a.total_adelantos, 0) AS sueldo_neto
FROM legajos l
         INNER JOIN sueldos s
                    ON l.legajo = s.legajo
         LEFT JOIN AcumuladoAdelantos a
                   ON l.legajo = a.legajo;

-- 8
WITH TotalHorasPorProyecto AS (
    SELECT
        idproyecto,
        SUM(hstrabajadas) AS horas_proyecto
    FROM proy_equipo_hs
    GROUP BY idproyecto
),
     PromedioGlobalHoras AS (
         SELECT AVG(horas_proyecto) AS promedio_global
         FROM TotalHorasPorProyecto
     )
SELECT
    p.nombrepoyecto,
    th.horas_proyecto
FROM proyectos p
         INNER JOIN TotalHorasPorProyecto th
                    ON p.nroproyecto = th.idproyecto
         CROSS JOIN PromedioGlobalHoras pg
WHERE th.horas_proyecto > pg.promedio_global;