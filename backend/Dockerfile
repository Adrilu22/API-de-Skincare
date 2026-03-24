FROM eclipse-temurin:21-jdk
WORKDIR /app

# Al estar ya dentro de backend, target/ está aquí mismo
COPY target/api-skincare-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

# Usamos el puerto dinámico de Cloud Run
ENTRYPOINT ["java", "-Dserver.port=${PORT:8080}", "-jar", "app.jar"]