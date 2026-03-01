# Use official Maven image with JDK
FROM maven:3.8.4-openjdk-11

# Copy source code
COPY . /app
WORKDIR /app

# Run the application
EXPOSE 8080
CMD ["java", "-jar", "target/second-test-pipelines-1.0-SNAPSHOT.jar"]