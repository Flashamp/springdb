FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/sprigdb-0.0.1-SNAPSHOT.jar /app/greetings.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "greetings.jar"]
