#FROM openjdk:15-alpine
FROM openjdk:15
ADD ./target/*.jar app.jar
COPY ./wait.sh wait.sh
RUN chmod +x ./wait.sh
#CMD ["java", "-jar", "/app.jar", "--spring.profiles.active=native"]
ENTRYPOINT [ "/bin/bash", "-c", "/wait.sh localhost:8088/actuator/health -- java -jar /app.jar" ]
#CMD ["./wait.sh","-h" "localhost", "-p", "8088","--", "java", "-jar", "/app.jar", "--spring.profiles.active=native"]

EXPOSE 8090