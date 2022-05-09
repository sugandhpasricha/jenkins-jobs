#!/usr/bin/env groovy

def call(Map config = [:]){
  git branch: "${config.git_branch}", credentialsId: '2c8ee9e0-6907-4525-88f7-1ebc505f89a0', url: "${config.git_url}"
}
