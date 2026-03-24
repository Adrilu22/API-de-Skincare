FROM eclipse-temurin:21-jdk
WORKDIR /app

# Le decimos: "Entra a backend, luego a target y agarra el jar"
COPY backend/target/api-skincare-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]