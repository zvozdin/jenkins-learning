pipeline {
    agent any

    tools {
        maven "MAVEN_HOME"
    }
    parameters {
        string(name: 'branch', defaultValue: env.BRANCH_NAME)
        choice(name: 'mavenCommand',
            choices: [
                "mvn clean compile",
                "mvn clean test",
                "mvn clean package -Dmaven.javadoc.skip=true"
            ],
            description: 'What we need to run ?')
    }
    
    stages {
        stage('Build') {
            steps {
                echo "BRANCH_NAME => ${branch}"
                echo "Running command: ${mavenCommand}"
                bat "${mavenCommand}"
            }
        }
    }
}
