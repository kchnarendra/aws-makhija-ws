docker build -t aws-alb-spring-boot-docker-img .                                                       Creates image on local machine 
docker run -d -p 8080:8080 aws-alb-spring-boot-docker-img                                              Create container test test on local machine
docker tag aws-alb-spring-boot-docker-img <your_docker_hub_id>/aws-alb-spring-boot-docker-img:1.0      Creates tag so then we can push tag to docker hub
docker push kchnarendra/aws-alb-spring-boot-docker-img:1.0 

#!/bin/bash

# Update the packages on your instance
sudo yum update -y

# Install Docker
sudo yum install docker -y

# Start the Docker Service
sudo service docker start

# Add the ec2-user to the docker group
sudo usermod -aG docker ec2-user 
docker pull kchnarendra/aws-alb-spring-boot-docker-img:1.0
docker run -d -p 8080:8080 kchnarendra/aws-alb-spring-boot-docker-img:1.0
