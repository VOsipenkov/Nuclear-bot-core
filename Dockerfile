FROM openjdk:11
COPY /build/libs/core-0.0.1-SNAPSHOT.jar /core.jar
EXPOSE 8080
#RUN apt-get update
#RUN apt-get install -y gcc
#RUN apt-get install -y curl
#ENTRYPOINT ["java","$JAVA_OPTS", "-jar", "core.jar"]
ENTRYPOINT java $JAVA_OPTS -jar core.jar