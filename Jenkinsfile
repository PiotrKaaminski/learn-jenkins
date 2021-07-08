pipeline {
    agent any
    parameters {
        choice(
            name: 'CHOICE',
            choices: ['one', 'two', 'three'],
            description: ''
        )
    }
    stages {
        stage('Example') {
            steps {
                echo "Choice: ${params.CHOICE}"
                sh "echo Choice: ${params.CHOICE}"
                sh 'echo Choice: $CHOICE'
            }
        }
    }

   /* agent any

    stages {
        stage('Input') {
            steps {
                input (
                    message: "Do you want to proceed?"
                )
            }
        }

        stage('If Proceed is clicked') {
            steps {
                print('hello')
            }
        }
    }

    stages {
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