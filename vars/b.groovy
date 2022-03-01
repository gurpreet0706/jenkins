#!/usr/bin/env groovy

def call() {
    properties([parameters([choice(choices: ['master', 'cdp', 'gdp'], name: 'a'), choice(choices: [''], name: '')])])
    echo "Hello."
    echo "Hello World."


}
