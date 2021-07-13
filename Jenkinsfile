def gv
pipeline {
    agent any

    stages {
        stage('Choose branch') {
            steps {
                /*script{
                    AVAILABLE_BRANCHES = sh (
                        script: 'git branch -r | sed "s/origin\\///" | tr -d " "',
                        returnStdout: true
                    )

                    env.BRANCH = input message: 'Choose branch', ok: 'Checkout',
                    parameters: [choice(name: 'BRANCH', description: 'Choose source branch', choices: AVAILABLE_BRANCHES)]

                    sh 'git checkout $BRANCH'
                }*/
                sh "echo 'choosing branch'"
            }
        }

        stage('Choose profiles') {
            steps {
                script {
                    gv = load "JenkinsUtils.groovy"
                    /*AVAILABLE_PROFILES = sh (
                        script: 'mvn help:all-profiles | grep "Profile Id:" | awk \'{print $3}\' | tr \'\\n\' \',\'',
                        returnStdout: true
                    )*/
                    /*env.PROFILES = input message: 'Choose profiles', ok: 'Build',
                    parameters: [
                        extendedChoice(name: 'PROFILES', value: gv.profiles(), multiSelectDelimiter: ',', description: 'Choose building profiles', type: 'PT_CHECKBOX'),
                        extendedChoice(name: 'MODULES', value: gv.modules(), multiSelectDelimiter: ',', description: 'Choose related modules', type: 'PT_CHECKBOX')
                    ]*/
                    sh 'echo ${WORKSPACE}'
                    sh 'chmod +x readProfiles.sh'
                    sh 'ls -l'
                    echo gv.profiles()
                }
            }
        }

        stage('Build') {
            steps {
                echo "Start building"
                //sh "mvn clean install -P$PROFILES"
            }
        }
    }

    post {
        success {
        archiveArtifacts  artifacts: 'target/*.jar', followSymlinks: false, onlyIfSuccessful: true, allowEmptyArchive: true
        }
    }

}