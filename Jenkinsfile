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

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    // junit '**/target/TEST-*.xml'
                    // archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
