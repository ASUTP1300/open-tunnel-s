FROM openjdk:17-oracle
ARG JAR_FILE=target/open-tunnel-s-0.0.1.jar
WORKDIR /opt/app
COPY ${JAR_FILE} open-tunnel-s.jar
ENTRYPOINT ["java", "-jar", "open-tunnel-s.jar"]