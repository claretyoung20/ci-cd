pipeline {

    agent any

    tools{
        maven 'maven'
    }

    options {
        timeout(time: 1, unit: 'MINUTES')
        retry(count: 2)
    }

    triggers{
        pollSCM 
    }

    stages{

        stage('Build') {

            steps{
                script {
                    def name = "nne"
                    if(name == "nne") {
                        echo "Hi, $name"
                    } else {
                        echo "Hi, no body"
                    }
                }
            }

        }

        stage('Build') {

            steps{
                script {
                    def name = "nne"
                    if(name == "nne") {
                        echo "Hi, $name"
                    } else {
                        echo "Hi, no body"
                    }
                }
            }

        }

        stage('retry step level') {

            steps{
                retry(3) {
                     sh 'exit 1'
                }
            }

        }
        stage('retry stage level') {
            options {
                retry(count: 1)
            }

            steps{
               sh 'exit 1'
            }

        }

        stage('timeout step level') {

            steps{
                timeout(time: 1, unit: 'MINUTES') {
                     sh 'exit 1'
                }
            }

        }
        stage('timeout stage level') {
            options {
                timeout(time: 1, unit: 'MINUTES')
            }

            steps{
               sh 'exit 1'
            }

        }

    }
}
