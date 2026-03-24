FROM eclipse-temurin:21-jdk
WORKDIR /app

# Copiamos el JAR generado por Maven
COPY target/api-skincare-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

# Puerto dinámico para Cloud Run
ENTRYPOINT ["java", "-Dserver.port=${PORT:8080}", "-jar", "app.jar"]