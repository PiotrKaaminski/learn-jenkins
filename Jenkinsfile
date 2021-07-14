def gv
pipeline {
    agent any

    stages {
        stage('Choose branch') {
            steps {
                script{
                    /*AVAILABLE_BRANCHES = sh (
                        script: 'git branch -r | sed "s/origin\\///" | tr -d " "',
                        returnStdout: true
                    )

                    env.BRANCH = input message: 'Choose branch', ok: 'Checkout',
                    parameters: [choice(name: 'BRANCH', description: 'Choose source branch', choices: AVAILABLE_BRANCHES)]*/

                    sh 'git checkout main'
                    sh 'git pull'
                }
                sh "echo 'choosing branch'"
            }
        }

        stage('Choose profiles') {
            steps {
                script {
                    gv = load "JenkinsUtils.groovy"
                    Map<String, String> valuesMap = gv.profiles()
                    Map<String, String> PROFILES = new HashMap<>()
                    PROFILES = input message: 'Choose profiles', ok: 'Build',
                    parameters: [
                        extendedChoice(name: 'PROF', value: valuesMap.get("buildProfiles"), multiSelectDelimiter: ',', description: 'Choose building profiles', type: 'PT_CHECKBOX'),
                        extendedChoice(name: 'MODUL', value: valuesMap.get("modules"), multiSelectDelimiter: ',', description: 'Choose related modules', type: 'PT_CHECKBOX')
                    ]
                    echo PROFILES
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