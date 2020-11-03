FROM openjdk:14-alpine
COPY target/micrometer-configurer-*.jar micrometer-configurer.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "micrometer-configurer.jar"]