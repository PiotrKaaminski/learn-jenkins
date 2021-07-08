pipeline {
    agent any

    stages {
        stage("Choose profiles") {
            input (
              message 'fdsafdsa'
              parameters {
                extendedChoice bindings: '', groovyClasspath: '', groovyScript: 'return ["release", "prod", "dev"]', multiSelectDelimiter: ',', name: 'profiles', quoteValue: false, saveJSONParameterToFile: false, type: 'PT_CHECKBOX', visibleItemCount: 5
              )
            }
        }

        stage('Build') {
            steps {
                sh "mvn clean install -P$profiles"
            }
        }

        post {
            success {
                archiveArtifacts  artifacts: 'target/*.jar', followSymlinks: false, onlyIfSuccessful: true
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