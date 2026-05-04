#!/bin/bash
mvn clean package
java -cp target/maven-ci-automation-1.0-SNAPSHOT.jar com.example.App
