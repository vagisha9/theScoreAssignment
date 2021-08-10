package com.theScore.test.stepdefinitions

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(features = ["src/test/resources/features"], plugin = ["pretty", "html:target/cucumber-html-report", "junit:target/cucumber-junit-report/report.xml", "json:target/cucumber-json-report.json"])
class RunCukesTest