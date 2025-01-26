FROM eclipse-temurin:21

LABEL maintainer="thinh@gmail.com"

WORKDIR /app

COPY ./pomodoro-gateway/build/libs/pomodoro-gateway-0.0.1-SNAPSHOT.jar /app/pomodoro-gateway.jar

ENTRYPOINT ["java", "-jar", "pomodoro-gateway.jar"]