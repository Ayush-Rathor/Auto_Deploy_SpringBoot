FROM openjdk:17-jdk-alpine
COPY target/mathapp-0.0.1-SNAPSHOT.jar mathapp.jar
ENTRYPOINT ["java", "-jar", "/mathapp.jar"]