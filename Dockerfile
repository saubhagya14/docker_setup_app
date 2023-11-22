FROM openjdk:17

COPY target/docker_app.jar /usr/app/docker_app.jar

WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "docker_app.jar"]