pipeline {
    agent any
//    environment {
//        DOCKER_HUB_CREDENTIALS = credentials('docker-hub-credentials')
//    }
    stages {
        stage('Testing') {
            steps {
                script {
                    //cualquier sh que vean, en windows es bat
					bat 'docker build -t AdIx42/proyectofinal -f Dockerfile.test .'
                }
            }
        }
        stage('Build') {
            steps {
                script {
                    bat 'docker build -t AdIx42/proyectofinal -f Dockerfile .'
                }
            }
        }
       
    }
}  