FROM wrisk/cimg-jdk17.0-arm64-aws
WORKDIR /app
COPY target/restfullApi-0.0.1.jar /app/restfullApi-0.0.1.jar
ENTRYPOINT ["java", "-jar", "/app/restfullApi-0.0.1.jar"]