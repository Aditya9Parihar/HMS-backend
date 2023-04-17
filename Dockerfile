FROM openjdk:17
EXPOSE 8090
ADD target/hotel-management-system.jar hotel-management-system.jar
ENTRYPOINT ["java", "-jar", "/hotel-management-system.jar"]