pipeline {
    agent any
    stages {
    stages {
        stage('Test') {
            steps {
                bat 'docker build -f Dockerfile.test -t AdIx42/proyectofinaltest .'
            }
        }
        stage('Build') {
            steps {
                script {                   
                   bat 'docker build -f Dockerfile -t AdIx42/proyectofinal .'
            }
        }
    }
}
