pipeline {
    agent any

    tools {
        maven "MAVEN_HOME"
    }
    
    
    stages {
        stage('Build') {
            steps {
                git 'https://github.com/zvozdin/jenkins-learning.git'

                bat "mvn clean test"
            }
        }
    }
}
