pipeline {
  agent any
    stages {
        stage('Build') {
            steps {
                sh "git pull origin master"
   				sh 'bash ./gradlew clean build'
                sh "bash ./gradlew bootRun"
            }
        }
        stage('Test') {
            steps {
                sh "bash ./gradlew test"
            }
        }
        stage('Validate') {
            steps {
                echo 'Validate....'
            }
        }
        stage('Analize') {
            steps {
                echo 'Analizing...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
		}
        
  }
}