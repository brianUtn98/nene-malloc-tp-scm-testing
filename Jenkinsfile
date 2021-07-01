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
                sh "bash ./gradlew sonarqube   -Dsonar.projectKey=sonar.host.url   -Dsonar.host.url=http://localhost:9000   -Dsonar.login=f879d51f3297d524f653b1965cda824f281b701b"
            }
        }
        stage('Coverage') {
            steps {
                sh "bash ./gradlew -i test jacocoTestReport"
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
		}
        
  }
}