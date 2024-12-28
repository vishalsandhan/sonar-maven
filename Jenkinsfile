pipeline {
    agent any
    tools {
        maven 'sonarmaven'
    }
    environment {
        SONAR_TOKEN = credentials('sonar-token')
        // JAVA_HOME = 'C:\\Program Files\\Java\\jdk-17'
        // PATH = "${JAVA_HOME}\\bin;$(env.PATH)"
    }
    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('sonarqube') {
                    bat """
                    mvn clean verify sonar:sonar \
                    -Dsonar.projectKey=sonarmaven \
                    -Dsonar.projectName='sonarmaven' \
                    -Dsonar.host.url=http://localhost:9000 \
                    -Dsonar.token=$SONAR_TOKEN
                    """
                }
            }
        }
    }
    post {
        success {
            echo 'Pipeline completed successfully.'
        }
        failure {
            echo 'Pipeline failed.'
        }
    }
}

