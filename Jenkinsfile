pipeline {
    agent any

    tools {
        maven "MAVEN_HOME"
    }

    parameters {
        string(name: 'branch', defaultValue: env.BRANCH_NAME)
        choice(name: 'mavenCommand',
            defaultValue: "mvn clean package -Dmaven.javadoc.skip=true -Dmaven.test.skip=true",
            choices: [
                "mvn clean compile",
                "mvn clean test",
                "mvn clean package -Dmaven.javadoc.skip=true -Dmaven.test.skip=true"
            ],
            description: 'What we need to run ?')
    }

    stages {
        stage('Build') {
            steps {
                echo "BRANCH_NAME => ${branch}"
                echo "Running command: ${mavenCommand}"
                git 'https://github.com/zvozdin/jenkins-learning.git'

                bat "${mavenCommand}"
            }
        }
    }
}
