pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build World'
            }
        }
        stage('Test') {
            steps {
                echo 'Test App'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy App'
            }
        }
    }
    post {
        always {
            emailext body: 'hello from jenkins', subject: 'Pipeline Status', to: 'zvyozdin@gmail.com'
        }
    }
}
