pipeline {
    agent any

    stages {
        stage("Choose profiles") {
            steps {
                /*input (
                  message: "provide profiles",
                  parameters: {
                    extendedChoice bindings: '', groovyClasspath: '', groovyScript: 'return ["release", "prod", "dev"]', multiSelectDelimiter: ',', name: 'profiles', quoteValue: false, saveJSONParameterToFile: false, type: 'PT_CHECKBOX', visibleItemCount: 5
                  )
                }*/
                input (message: "Provide profiles")
            }
        }

        stage('Build') {
            steps {
                echo "Start building"
                //sh "mvn clean install -Prelease,dev"
            }
        }
    }
    /* działający fragment do zapisania wyniku
    post {
        success {
        archiveArtifacts  artifacts: 'target/*.jar', followSymlinks: false, onlyIfSuccessful: true
        }
    }*/

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