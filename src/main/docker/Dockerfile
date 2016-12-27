FROM openjdk:8
ADD demo-tests.jar app.jar
ENTRYPOINT ["java","-Dspring.profiles.active=container","-jar","/app.jar"]