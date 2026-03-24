FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copiamos el .jar que ya fue generado por el paso de Maven en el YAML
COPY backend/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]