FROM eclipse-temurin:21-jdk
WORKDIR /app

# Como el YAML entrará a la carpeta 'backend', el JAR está en 'target/'
COPY target/api-skincare-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

# Usamos el puerto dinámico de Cloud Run y optimizamos el arranque
ENTRYPOINT ["java", "-Dserver.port=${PORT:8080}", "-jar", "app.jar"]