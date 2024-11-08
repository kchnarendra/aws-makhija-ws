# Use a base image with Java 17 installed
FROM openjdk:17-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container
COPY target/alb-ec2-docker-demo-0.0.1-SNAPSHOT.jar /app/alb-ec2-docker-demo-0.0.1-SNAPSHOT.jar

# Expose the port your application runs on
EXPOSE 8080

# Specify the command to run your application
CMD ["java", "-jar", "alb-ec2-docker-demo-0.0.1-SNAPSHOT.jar"]

