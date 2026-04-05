library(readxl)
df <- read_excel("/Users/aresito/Universidad/Probabilidad y Estadística/Datos Práctica Tabla de Frecuencias en R (V Nominal).xlsx")

fi <- table(df$Plataforma_Trabajo)
fr <- round(prop.table(fi), 3)

tabla_plataforma <- data.frame(
  Plataforma = names(fi),
  Frec_Abs   = as.vector(fi),
  Frec_Rel   = as.vector(fr)
)

print(tabla_plataforma, row.names = FALSE)


fi <- table(df$Tickets_Soporte)
F  <- cumsum(fi)
fr <- round(prop.table(fi), 3)
Fr <- round(cumsum(fr), 3)

tabla_tickets <- data.frame(
  Tickets       = names(fi),
  Frec_Abs      = as.vector(fi),
  Frec_Acum     = as.vector(F),
  Frec_Rel      = as.vector(fr),
  Frec_Rel_Acum = as.vector(Fr)
)

print(tabla_tickets, row.names = FALSE)


rango    <- range(df$Tiempo_Conexion)
n        <- length(df$Tiempo_Conexion)
k        <- ceiling(1 + 3.322 * log10(n))
amplitud <- ceiling((rango[2] - rango[1]) / k)

breaks <- seq(floor(rango[1]), ceiling(rango[2]) + amplitud, by = amplitud)
clases <- cut(df$Tiempo_Conexion, breaks = breaks, right = FALSE)

fi <- table(clases)
F  <- cumsum(fi)
fr <- round(prop.table(fi), 3)
Fr <- round(cumsum(fr), 3)

tabla_tiempo <- data.frame(
  Intervalo     = levels(clases),
  Frec_Abs      = as.vector(fi),
  Frec_Acum     = as.vector(F),
  Frec_Rel      = as.vector(fr),
  Frec_Rel_Acum = as.vector(Fr)
)

print(tabla_tiempo, row.names = FALSE)