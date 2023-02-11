FROM openjdk:11
COPY /build/libs/core-0.0.1-SNAPSHOT.jar /core.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "core.jar"]