#Template for setting up project

##Dependencies
* cucumber-java
* cucumber-junit
* junit
* assertj-core

Appium
* io.appium:java-client

##Plugins
* Cucumber-Java
* Gherkin

##Versions
* Appium: 1.21.0
* Gradle: 7.1
* Kotlin: 1.5.21

##Project Framework
* Cucumber with junit
* Page Object Model
* Language Used- Kotlin

##Driver Class
Main core of Appium Project
It triggers Appium server and instantiates Android driver

##Page Object Classes
Add cucumber step definitions and call methods defined in page object classes
Put all assertions in step definition class

##Feature Files
Feature files can be found in resources->features
Feature file name: LeagueTest.feature

##test.properties file
Properties file can be found in resources->properties
* Provide device name, udid, apk path

##Run Tests
* Should have .apk file in app folder
* Can run feature file directly from the IDE
* Gradle version is taken from gradle wrapper
* Command line execution: Gradle command to execute tests: ./gradlew test
* It runs RunCukesTest class which is in step definitions folder
* It also runs generateCucumberReports task that generates cucumber html report
* To check cucumber report (overview-features.html), got to src->test->resources->cucumber-html-report