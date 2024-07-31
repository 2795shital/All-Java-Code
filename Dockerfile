# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory
WORKDIR /usr/src/app

# Copy the Java source file into the container
COPY Prime.java .

# Compile the Java source code
RUN javac Prime.java

# Set the default command to run the Java program
ENTRYPOINT ["java", "Prime"]
