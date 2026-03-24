FROM eclipse-temurin:21-jdk
WORKDIR /app

# Como ya estamos dentro de la carpeta backend, solo necesitamos entrar a target
COPY target/api-skincare-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]