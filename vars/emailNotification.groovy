#!/usr/bin/env groovy

def call(Map config = [:]) {
    emailext body: "${currentBuild.currentResult}: Job ${env.JOB_NAME} build ${env.BUILD_NUMBER}\n More info at: ${env.BUILD_URL}",
                  recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']],
                  subject: "Jenkins Job: ${env.JOB_NAME} Build Number: ${env.BUILD_NUMBER} Status: ${currentBuild.currentResult}: "
}
