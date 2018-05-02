FROM hub.c.163.com/library/java:8-alpine

MAINTAINER wiki0

ADD target/*.jar app.jar

EXPOSE 8760

ENTRYPOINT ["java", "-jar", "/app.jar"]