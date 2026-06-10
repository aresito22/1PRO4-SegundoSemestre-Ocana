library(readxl)

datos <- read_excel("TUPAD-2025-EST-TPI-planilla1.xlsx")

tabla_satisfaccion <- table(datos$`SATISFACCIÓN CON LA CARRERA`)

total <- sum(tabla_satisfaccion)

p_muy_satis <- tabla_satisfaccion["1"] / total
p_satis <- tabla_satisfaccion["2"] / total
p_insatis <- tabla_satisfaccion["3"] / total
p_muy_insatis <- tabla_satisfaccion["4"] / total

# Ejercicio 5
prob_5a <- 1 - pbinom(9, 16, p_muy_satis)

prob_5b <- pbinom(8, 16, p_satis) -
  pbinom(3, 16, p_satis)

prob_5c <- pbinom(4, 16, p_insatis)

prob_5d <- dbinom(10, 16, p_muy_insatis)

prob_5a
prob_5b
prob_5c
prob_5d

# Ejercicio 6
prob_6a <- 1 - ppois(5, 10)

prob_6b <- ppois(12, 20)

prob_6c <- ppois(9, 15) -
  ppois(7, 15)

prob_6a
prob_6b
prob_6c

# Ejercicio 7
media <- mean(datos[["ESTATURA CM."]])
desvio <- sd(datos[["ESTATURA CM."]])

prob_7a <- 1 - pnorm(179, media, desvio)

prob_7b <- pnorm(172, media, desvio) -
  pnorm(147, media, desvio)

valor_7c <- qnorm(0.975, media, desvio)

prob_7a
prob_7b
valor_7c