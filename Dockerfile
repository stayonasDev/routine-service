FROM openjdk:17-jdk-slim AS build

WORKDIR /app

COPY gradlew .
COPY gradle gradle
COPY build.gradle settings.gradle ./

COPY src src
RUN ./gradlew bootJar --no-daemon


FROM openjdk:17-jdk-slim AS final

RUN groupadd -r spring && useradd -r -g spring spring
USER spring

WORKDIR /app

COPY --from=build /app/build/libs/*.jar app.jar


ENTRYPOINT ["java", "-jar", "/app/app.jar"]