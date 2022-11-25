FROM openjdk:11
COPY /build/libs/parsing-processor-0.0.1-SNAPSHOT.jar /parsing-processor.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "parsing-processor.jar"]