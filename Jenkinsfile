pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        withMaven(mavenOpts: MAVEN_OPTS, maven: 'M3', mavenLocalRepo: MAVEN_LOCAL_REPOSITORY, mavenSettingsConfig: MAVEN_SETTINGS) {
            sh "mvn package"
        }
      }
    }
  }
}