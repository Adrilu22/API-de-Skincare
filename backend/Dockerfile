# 1. Usamos una imagen ligera de Java 21
FROM eclipse-temurin:21-jdk

# 2. Creamos la carpeta de trabajo dentro del contenedor
WORKDIR /app

# 3. COPIAMOS el archivo .jar usando la ruta desde la raíz del proyecto
# Es importante que incluya "backend/target/" porque Docker está mirando desde afuera
COPY backend/target/api-skincare-0.0.1-SNAPSHOT.jar app.jar

# 4. Exponemos el puerto que usa Spring Boot
EXPOSE 8080

# 5. Comando para arrancar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]