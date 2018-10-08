pipeline {
    agent any

    stages {
     stages {
         stage('Build') {
             steps {
                 mvn 'clean install -DskipTests'
                 archiveArtifacts '**/target/*.*ar'
             }
         }
     }
}