pipeline {
    agent {
        docker {
            image 'maven:3.8.3-openjdk-17'
            args '-u root'
        }
    }
    stages {
        stage('Test') {
            steps {
                sh 'mvn clean test'
            }
            post {
                always {
                    // Publish the TestNG report
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}