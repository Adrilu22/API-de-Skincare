# 1. Imagen de Java 21
FROM eclipse-temurin:21-jdk

# 2. Carpeta de trabajo
WORKDIR /app

# 3. Ruta correcta desde la raíz del proyecto
COPY backend/target/api-skincare-0.0.1-SNAPSHOT.jar app.jar

# 4. Puerto
EXPOSE 8080

# 5. Ejecución
ENTRYPOINT ["java", "-jar", "app.jar"]