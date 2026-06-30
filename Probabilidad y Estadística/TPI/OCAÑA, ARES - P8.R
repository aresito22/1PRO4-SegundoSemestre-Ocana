library(readxl)

datos <- read_excel("TUPAD-2025-EST-TPI-planilla1.xlsx")

# Población
poblacion <- datos$`ESTATURA CM.`

# Parámetro de población
media_poblacional <- mean(poblacion)
print(media_poblacional)

cat("Media poblacional:", media_poblacional, "\n")

# Configuración de muestra
set.seed(123)

cantidad_muestras <- 6
tamanio_muestra <- 20

lista_muestras <- list()
medias_muestrales <- numeric(cantidad_muestras)

for(i in 1:cantidad_muestras){
  
  muestra_i <- sample(
    poblacion,
    tamanio_muestra,
    replace = FALSE
  )
  
  lista_muestras[[i]] <- muestra_i
  
  medias_muestrales[i] <- mean(muestra_i)
}

resultado <- data.frame(
  muestra = paste0("Muestra_",1:cantidad_muestras),
  media_muestral = round(medias_muestrales,2)
)

resultado$diferencia_respecto_poblacion <-
  round(
    resultado$media_muestral -
      media_poblacional,
    2
  )

print(resultado)