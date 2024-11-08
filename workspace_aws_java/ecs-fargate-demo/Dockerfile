FROM openjdk:17-oracle
LABEL maintainer="test_user@gmail.com"
EXPOSE 8080
COPY target/ecs-fargate-demo-0.0.1-SNAPSHOT.jar ecs-fargate-demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/ecs-fargate-demo-0.0.1-SNAPSHOT.jar"]