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
        stage('Deploy') {
            steps {
                sshPublisher(publishers: [
                    sshPublisherDesc(configName: '10.0.6.21', transfers: [
                        sshTransfer(cleanRemote: true, execTimeout: 120000, flatten: true, makeEmptyDirs: false, remoteDirectory: 'upload-test', sourceFiles: 'target/*.jar')
                    ])
                ])
            }
        }
    }

    post {
        success {
        archiveArtifacts  artifacts: 'target/*.jar', followSymlinks: false, onlyIfSuccessful: true, allowEmptyArchive: true
        }
    }

}