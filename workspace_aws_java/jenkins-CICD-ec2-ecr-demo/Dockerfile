FROM openjdk:17-oracle
LABEL maintainer="narendra@gmail.com"
EXPOSE 8090
COPY target/jenkins-CICD-ec2-ecr-demo-0.0.1-SNAPSHOT.jar jenkins-CICD-ec2-ecr-demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/jenkins-CICD-ec2-ecr-demo-0.0.1-SNAPSHOT.jar"]
