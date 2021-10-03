pipeline {
  agent any
  stages {
    stage('Dev Code') {
      steps {
        git(url: 'https://github.com/TestLeafInc/WebApp', branch: 'master')
      }
    }

    stage('Dev build') {
      steps {
        echo 'dev build'
      }
    }

    stage('QA deploy') {
      steps {
        echo 'QA deploy'
      }
    }

    stage('QA test') {
      parallel {
        stage('QA test') {
          steps {
            echo 'QA test'
          }
        }

        stage('UI test') {
          steps {
            echo 'UI test'
          }
        }

        stage('API test') {
          steps {
            echo 'API test'
          }
        }

      }
    }

    stage('QA certify') {
      steps {
        input 'Do you want to certify?'
      }
    }

    stage('UAT deploy') {
      steps {
        echo 'UAT deploy'
      }
    }

    stage('UAT cert') {
      steps {
        input 'Do you want to certify?'
      }
    }

    stage('Prod deploy') {
      steps {
        echo 'Prod deploy'
      }
    }

  }
}