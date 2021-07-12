pipeline {
    agent any

    stages {
        stage('Choose branch') {
            steps {
                AVAILABLE_BRANCHES = sh (
                script: 'git branch -r | tr \'origin/\' \'\' | tr \'\\n\' \',\'',
                returnStdout: true
                )

            }
        }

        /*stage('Choose profiles') {
            steps {
                script {
                    AVAILABLE_PROFILES = sh (
                        script: 'mvn help:all-profiles | grep "Profile Id:" | awk \'{print $3}\' | tr \'\\n\' \',\'',
                        returnStdout: true
                    )
                    env.PROFILES = input message: 'Choose profiles', ok: 'Build',
                    parameters: [extendedChoice(name: 'PROFILES', value: AVAILABLE_PROFILES, multiSelectDelimiter: ',', description: 'Choose building profiles', type: 'PT_CHECKBOX')]

                }
            }
        }

        stage('Build') {
            steps {
                echo "Start building"
                sh "mvn clean install -P$PROFILES"
            }
        }*/
    }

    post {
        success {
        archiveArtifacts  artifacts: 'target/*.jar', followSymlinks: false, onlyIfSuccessful: true
        }
    }

}