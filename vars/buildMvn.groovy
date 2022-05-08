#!/usr/bin/env groovy

def call(Map config = [:]) {
  sh 'mvn clean install'
}
