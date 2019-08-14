FROM openjdk:8-jdk-alpine
EXPOSE 8080
VOLUME /tmp
ADD *.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"] 
