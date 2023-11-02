FROM openjdk:11-jdk-slim
WORKDIR /app
COPY target/Java_Spring_REST_API-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java","-jar","app.jar"]