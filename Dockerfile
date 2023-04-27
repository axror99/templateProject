#FROM maven:3.8.2-jdk-17 AS build
#COPY . .
#RUN mvn clean package -DskipTests
##
## Package stage
##
FROM openjdk:17-alpine
ADD target/templateProject.jar temporary.jar
ENTRYPOINT ["java","-jar","temporary.jar"]
EXPOSE 8080