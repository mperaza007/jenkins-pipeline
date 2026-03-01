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
                sh 'mvn clean package'
            }
        }
        stage('Unit Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Build Docker Image') {
            steps {
                sh 'docker build -t second-test-pipelines .'
            }
        }
        stage('Deploy') {
            steps {
                sh 'docker run -d -p 8081:8080 second-test-pipelines'
            }
        }
    }
}