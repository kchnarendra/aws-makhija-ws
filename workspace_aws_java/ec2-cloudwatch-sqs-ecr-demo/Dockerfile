FROM openjdk:17-oracle
LABEL maintainer="test_user@gmail.com"
EXPOSE 8080
COPY target/ec2-cloudwatch-sqs-ecr-demo-0.0.1-SNAPSHOT.jar ec2-cloudwatch-sqs-ecr-demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/ec2-cloudwatch-sqs-ecr-demo-0.0.1-SNAPSHOT.jar"]