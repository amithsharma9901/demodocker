FROM openjdk:17
COPY target/demo.jar demo.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "/demo.jar"]

#deines how to build docker image