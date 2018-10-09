pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        withMaven() {
            sh "mvnw clean install dockerfile:build"
        }
      }
    }
  }
}