pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                echo "Start building"
                sh "mvn clean install"
            }
        }
    }

    post {
        success {
        archiveArtifacts  artifacts: 'target/*.jar', followSymlinks: false, onlyIfSuccessful: true, allowEmptyArchive: true
        }
    }

}