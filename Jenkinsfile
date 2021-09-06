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
                bat "mvn clean test"
            }
        }
        stage('Archive') {
            steps {
                archiveArtifacts artifacts: '*.jar', onlyIfSuccessful: true
            }
        }
    }
}
