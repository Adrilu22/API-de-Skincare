FROM eclipse-temurin:21-jdk

WORKDIR /app

# Cambiamos la ruta para que Docker la encuentre desde la raíz
COPY backend/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]