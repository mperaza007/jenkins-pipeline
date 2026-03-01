pipeline {
    agent any
    tools {
            maven 'Maven'
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
                sh 'docker build -t mperazaravelo/app:${BUILD_NUMBER} .'
            }
        }
        stage('Deploy') {
            steps {
                sh 'docker run -d -p 8080:8080 mperazaravelo/app:${BUILD_NUMBER}'
            }
        }
    }
}