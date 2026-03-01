pipeline {
    agent any
    tools {
            maven 'Maven'
            jdk 'jdk-21'
        }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build & Test') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Unit Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Build Docker Image') {
            steps {
                bat 'docker build -t second-test-pipelines-1.0-SNAPSHOT.jar .'
            }
        }
        stage('Deploy') {
            steps {
                bat 'docker run -d -p 8081:8080 second-test-pipelines'
            }
        }
    }
}