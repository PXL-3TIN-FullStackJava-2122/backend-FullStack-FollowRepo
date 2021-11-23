FROM openjdk:15-alpine

ADD ./target/*.jar app.jar

CMD ["java", "-jar", "/app.jar", "--spring.profiles.active=native"]


EXPOSE 8088