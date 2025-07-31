# TODO: Integrate Dockerfile
# Dont really know how but figure it out

FROM openjdk:17-jdk-alpine
WORKDIR /app
ARG JAR_FILE=target/starter-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} starter-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "starter-0.0.1-SNAPSHOT.jar"]