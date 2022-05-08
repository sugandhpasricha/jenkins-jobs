#!/usr/bin/env groovy

def call(String git_branch = 'human', git_url = 'url') {
  git branch: '${git_branch}', credentialsId: '2c8ee9e0-6907-4525-88f7-1ebc505f89a0', url: '${git_url}'
}
