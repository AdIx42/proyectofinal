pipeline {
    agent any
    
    stages {
        stage('Test') {
            steps {
                script {
                    //cualquier sh que vean, en windows es bat
                    bat 'docker build -f Dockerfile.test jjsainfo/devopsfinaltests .'
                }
            }
        }
        stage('Build') {
            steps {
                script {
                    //cualquier sh que vean, en windows es bat
                    bat 'docker build -f Dockerfile -t jjsainfo/devopsfinal .'
                }
            }
        }
        
    }
}