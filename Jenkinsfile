pipeline {
    agent any

    stages {
        stage('Choose profile') {
            steps {
                sh "mvn help:all-profiles"
            }
        }
    }

}