# ---- Stage 1: build and package ----
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn -B dependency:go-offline
COPY src ./src
RUN mvn -B clean package -DskipTests

# ---- Stage 2: small runtime image ----
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=build /app/target/even-odd.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
CMD ["10"]
