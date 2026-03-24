# 🔥 Etapa 1: construir el JAR
FROM maven:3.9.6-eclipse-temurin-21 AS builder

WORKDIR /app

# Copiamos solo el backend
COPY backend ./backend

WORKDIR /app/backend

RUN mvn clean package -DskipTests

# 🔥 Etapa 2: ejecutar la app
FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY --from=builder /app/backend/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-Dserver.port=${PORT}", "-jar", "app.jar"]