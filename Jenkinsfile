pipeline {
    agent any
    environment {
        DOCKER_HUB_CREDENTIALS = credentials('docker-hub-credentials')
    }
    stages {
        stage('Test and Build') {
            steps {
                sh 'docker build -f Dockerfile.build -t adix42/proyectofinal .'
            }
        }
        stage('Dockerhub login') {
            steps {
                script {
                    sh 'echo ${DOCKER_HUB_CREDENTIALS_PSW} | docker login -u ${DOCKER_HUB_CREDENTIALS_USR} --password-stdin'
                }
            }
        }
        stage('Push') {
            steps {
                sh 'docker push adix42/proyectofinal'
            }
        }
    }
}