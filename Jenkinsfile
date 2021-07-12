def gv
pipeline {
    agent any

    stages {
        stage('Choose profiles') {
            steps {
                script {
                    gv = load "listAvailableProfiles.groovy"
                    parameters: [extendedChoice(name: 'PROFILES', value: gv.availableProfiles(), multiSelectDelimiter: ',', description: 'Choose building profiles', type: 'PT_CHECKBOX')]
                }
            }
        }
        stage('Build') {
            echo "Start building"
            sh "mvn clean install -P$PROFILES"
        }
    }

    //działający fragment do zapisania wyniku
    post {
        success {
        archiveArtifacts  artifacts: 'target/*.jar', followSymlinks: false, onlyIfSuccessful: true
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