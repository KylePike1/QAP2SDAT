#FROM eclipse-temurin:22
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY . /app
RUN ./mvnw package
EXPOSE 8080
CMD ["java", "-jar", "target/app.jar"]