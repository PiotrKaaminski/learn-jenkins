pipeline {
    agent any

    tools {
        maven "M3"
        jdk "jdk11"
    }

    stages {
        stage('Choose profile') {
            steps {
                sh "mvn help:all-profiles"
            }
        }
    }

}