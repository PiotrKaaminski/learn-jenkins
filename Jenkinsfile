pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                echo "Start building"
                //sh "mvn clean install"
            }
        }
        stage('SSH scripts') {
            steps {
                sh "chmod 777 ssh-script.sh"
                sh "./ssh-script.sh"
            }
        }
    }

    post {
        success {
        archiveArtifacts  artifacts: 'target/*.jar', followSymlinks: false, onlyIfSuccessful: true, allowEmptyArchive: true
        }
    }

}