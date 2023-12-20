FROM openjdk:17
COPY target/cluster-1.0-SNAPSHOT.jar /app.jar
EXPOSE 80
CMD ["java", "-jar", "/app.jar"]
