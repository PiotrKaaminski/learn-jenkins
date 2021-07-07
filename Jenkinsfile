pipeline {
    agent any

    stages {
        stage('Choose profile') {
            steps {
                input {
                    message 'Choose profile'
                    parameters {
                        choice choices: ['release', 'prod', 'dev'], name: 'profile'
                    }
                }
            }
        }

        stage('Build') {
            steps {
                sh "mvn clean install -P$profile"
            }
        }
    }

}