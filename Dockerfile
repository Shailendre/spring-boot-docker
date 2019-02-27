FROM openjdk:8
MAINTAINER goforsunny1993@gmail.com
ADD target/spring-boot-docker.jar data/spring-boot-docker.jar
EXPOSE 8080
# this set of cmd is run when container is started.. preceded over by CMD
ENTRYPOINT ["java", "-jar", "data/spring-boot-docker.jar"]
