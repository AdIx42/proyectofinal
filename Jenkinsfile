pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                bat 'docker build -f Dockerfile.test -t AdIx42/proyectofinaltest .'
            }
        }
        stage('Build') {
            steps {
                bat 'docker build -f Dockerfile -t AdIx42/proyectofinal .'
            }
        }
    }
}