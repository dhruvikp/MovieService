pipeline {
    agent {
        docker {
            image 'maven:3.8.8-openjdk-17' // Use Maven Docker image with JDK 17
        }
    }
    environment {
        DOCKER_IMAGE = "dhruviksparikh/movieservice:latest"
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Build Docker Image') {
            steps {
                sh '''
                docker build -t $DOCKER_IMAGE .
                docker login -u dhruviksparikh -p drk@2511990
                docker push $DOCKER_IMAGE
                '''
            }
        }
        stage('Run Application') {
            steps {
                sh '''
                docker stop spring-boot-app || true
                docker rm spring-boot-app || true
                docker run -d --name spring-boot-app -p 8081:9093 $DOCKER_IMAGE
                '''
            }
        }
    }
}
