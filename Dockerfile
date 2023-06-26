


FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/person_api-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","/app/person_api-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080