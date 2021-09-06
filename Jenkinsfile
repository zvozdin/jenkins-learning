pipeline {
    agent any

    tools {
        maven "MAVEN_HOME"
    }

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/zvozdin/jenkins-learning.git'
                echo 'We are building artifacts for ${BUILD_NUMBER}'
                bat "mvn clean package"
            }
        }
        stage('Archive') {
            steps {
                sh """
                    cd /mnt/d/JAVA/study/jenkins-learning/build/libs
                """
                archiveArtifacts artifacts: '**', onlyIfSuccessful: true
            }
        }
    }
}
