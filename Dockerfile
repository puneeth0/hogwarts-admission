# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the application JAR file
COPY target/hogwarts-admission.jar /app/hogwarts-admission.jar

# Expose the application port
EXPOSE 8082

# Command to run the application
CMD ["java", "-jar", "hogwarts-admission.jar"]