pipeline {
    agent any
    environment {
        DOCKER_HUB_CREDENTIALS = credentials('docker-hub-credentials')
    }
    stages {
        stage('Test and Build') {
            steps {
                sh 'docker build -f Dockerfile.build -t adanbrooks/devopsfinal .'
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
                sh 'docker push adanbrooks/devopsfinal'
            }
        }
        stage('Deploy') {
            steps {
                sh 'docker run -p 8080:8082 -v C:\\Users\\Adan\\Desktop\\Volume:/app adanbrooks/devopsfinal'
            }
        }
    }
}