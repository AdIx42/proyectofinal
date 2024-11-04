pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                bat 'docker build -f Dockerfile.test -t adix42/proyectofinaltest .'
            }
        }
        stage('Build') {
            steps {
                script {                   
                   bat 'docker build -f Dockerfile -t adix42/proyectofinal .'
            }
        }
    }
}
}