library(readxl)
datos <- read_excel("TUPAD-2025-EST-TPI-planilla1.xlsx")

# Análisis de tiempo semanal de estudio

tiempo <- datos$`TIEMPO SEMANAL en HS. DEDIC. EST.`

media   <- mean(tiempo)
mediana <- median(tiempo)

tabla_tiempo <- table(tiempo)
moda <- as.numeric(names(tabla_tiempo[tabla_tiempo == max(tabla_tiempo)]))

desvio  <- sd(tiempo)
cv      <- (desvio / media) * 100
cuartiles <- quantile(tiempo)

media
mediana
moda
desvio
cv
cuartiles

# Análisis de nivel de satisfacción con la carrera

satisfaccion <- datos$`SATISFACCIÓN CON LA CARRERA`

tabla_satisfaccion <- table(satisfaccion)
moda_sat    <- names(tabla_satisfaccion[tabla_satisfaccion == max(tabla_satisfaccion)])

mediana_sat <- median(satisfaccion)

cuartiles_sat <- quantile(satisfaccion)

moda_sat
mediana_sat
cuartiles_sat

# Gráficos

hist(tiempo,
     main = "Tiempo semanal dedicado al estudio",
     xlab = "Horas semanales",
     ylab = "Frecuencia absoluta",
     col = "blue",
     border = "white")

tabla_sat <- table(satisfaccion)
porcentajes <- round(prop.table(tabla_sat) * 100, 1)
etiquetas <- c("Muy satisfecho", "Satisfecho", "Poco satisfecho", "Insatisfecho")
etiquetas_completas <- paste(etiquetas, porcentajes, "%")

pie(tabla_sat,
    labels = etiquetas_completas,
    main = "Nivel de satisfacción con la carrera",
    col = c("purple", "blue", "orange", "red"))
