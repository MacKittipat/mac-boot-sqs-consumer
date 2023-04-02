FROM eclipse-temurin:11-alpine

WORKDIR /app

ADD ./target/dependencies ./
ADD ./target/spring-boot-loader ./
ADD ./target/snapshot-dependencies ./
ADD ./target/application ./

EXPOSE 8080

ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]
