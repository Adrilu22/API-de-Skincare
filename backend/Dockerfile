FROM eclipse-temurin:21-jdk

WORKDIR /app

# Usamos **/target para que Docker busque en todas las subcarpetas hasta hallar el jar
COPY **/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]