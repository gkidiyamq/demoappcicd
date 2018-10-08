pipeline {
    agent any

    stages {
         stage('Build') {
             steps {
                 mvn 'clean install -DskipTests'
                 archiveArtifacts '**/target/*.*ar'
             }
         }
     }
}