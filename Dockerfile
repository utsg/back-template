# Build stage
FROM maven:3.6.0-jdk-11-slim AS build
WORKDIR /home/app
COPY src .
COPY pom.xml .
RUN ls -la
RUN mvn clean package

# Package stage
FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/back-template-0.0.1-SNAPSHOT.jar /usr/local/lib/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/app.jar"]