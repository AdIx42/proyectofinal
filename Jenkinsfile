pipeline {
    agent any
    stages {
        stage('Test and Build') {
            steps {
                bat 'docker build -f Dockerfile.build -t adix42/proyectofinal .'
            }
        }
        stage('Run') {
            steps {
                bat 'docker run --name=proyectofinal -v D:/devenv/docker/proyectofinal:/app/target adix42/proyectofinal'
            }
        }
//        stage('Dockerhub Login') {
//            steps {
//                bat 'echo ${DOCKER_HUB_CREDENTIALS_PSW} | docker login -u ${DOCKER_HUB_CREDENTIALS_USR} --password-stdin'
//            }
//        }
//        stage('Push') {
//            steps {
//                bat 'docker push adix42/proyectofinal .'
//            }
//        }
}
}