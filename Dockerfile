FROM openjdk:17-jdk

COPY target/MovieService-0.0.1-SNAPSHOT.jar .

ENTRYPOINT ["java","-jar","MovieService-0.0.1-SNAPSHOT.jar"]