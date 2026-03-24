FROM eclipse-temurin:21-jdk
WORKDIR /app

# Usamos el nombre exacto del archivo que vimos en tu carpeta target
COPY target/api-skincare-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

# Configuramos el puerto dinámico para que Cloud Run no falle al iniciar
ENTRYPOINT ["java", "-Dserver.port=${PORT:8080}", "-jar", "app.jar"]