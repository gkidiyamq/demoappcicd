pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        withMaven() {
            sh "mvn clean install dockerfile:build"
        }
      }
    }
  }
}