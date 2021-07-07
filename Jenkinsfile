pipeline {
    agent any

    input {
        message 'Choose profile'
        parameters {
            choice choices: ['release', 'prod', 'dev'], name: 'profile'
        }
    }


    stages {
        stage('Build') {
            steps {
                sh "mvn clean install -P$profile"
            }
        }
    }

}