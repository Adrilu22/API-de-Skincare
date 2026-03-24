FROM eclipse-temurin:21-jdk

WORKDIR /app

# El doble asterisco busca el archivo jar en cualquier subcarpeta 'target'
COPY **/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]