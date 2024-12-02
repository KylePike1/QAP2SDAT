FROM maven:3.9.4-eclipse-temurin-17 AS builder

# Set the working directory
WORKDIR /usr/src/app

# Copy the Maven project files
COPY pom.xml ./
COPY src ./src

# Build the application using Maven
RUN mvn clean package -DskipTests

# Use a lightweight Java image to run the application
FROM eclipse-temurin:17-jre

# Set the working directory
WORKDIR /app

# Copy the built JAR file from the builder stage
COPY --from=builder /usr/src/app/target/*.jar app.jar

# Expose the application's port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]