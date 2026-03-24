# 1. Usamos la imagen de Java 21 (Temurin es la oficial recomendada)
FROM eclipse-temurin:21-jdk

# 2. Creamos una carpeta de trabajo dentro del contenedor
WORKDIR /app

# 3. Copiamos el archivo JAR exacto que generó Maven
# IMPORTANTE: No usamos asteriscos para evitar errores de "no source files"
COPY target/api-skincare-0.0.1-SNAPSHOT.jar app.jar

# 4. Exponemos el puerto 8080 (el que usa Spring Boot por defecto)
EXPOSE 8080

# 5. Comando de arranque optimizado para Cloud Run
# Agregamos la propiedad server.port para que Cloud Run pueda asignar el puerto dinámicamente
ENTRYPOINT ["java", "-Dserver.port=${PORT:8080}", "-jar", "app.jar"]
