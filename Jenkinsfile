pipeline {
    agent any

    stages {
        stage('Input') {
            steps {
                input('message') {
                    message 'Do you want to proceed?'
                }
            }
        }

        stage('If Proceed is clicked') {
            steps {
                print('hello')
            }
        }
    }

    /*stages {
        stage('Choose profile') {
            steps {
                script {
                    echo("from choose profile stage")
                }
            }
        }

        stage('Build') {
            steps {
                sh "mvn clean install -Pdev"
            }
        }
    }*/

}