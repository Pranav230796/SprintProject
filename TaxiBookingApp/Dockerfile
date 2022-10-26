FROM openjdk:17-oracle
COPY target/TaxiBookingApp-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8080/tcp
ENTRYPOINT ["java","-jar","/app.jar"]