FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/api-skincare-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

# 🔥 IMPORTANTE
ENV JAVA_TOOL_OPTIONS="-Djava.net.preferIPv4Stack=true"

ENTRYPOINT ["java","-jar","/app/app.jar"]