FROM eclipse-temurin:21-jdk
WORKDIR /app

# Esta es la ruta correcta cuando Docker mira desde la raíz del proyecto
COPY backend/target/api-skincare-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

# Comando optimizado para Cloud Run
ENTRYPOINT ["java", "-Dserver.port=${PORT:8080}", "-jar", "app.jar"]
 