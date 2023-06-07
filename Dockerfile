FROM openjdk:11
COPY /build/libs/core-0.0.1-SNAPSHOT.jar /core.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "core.jar"]