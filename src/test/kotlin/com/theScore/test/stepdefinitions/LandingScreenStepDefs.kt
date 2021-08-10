package com.theScore.test.stepdefinitions

import com.theScore.test.pageobjects.LandingScreen
import cucumber.api.java.en.Then
import io.appium.java_client.AppiumDriver
import org.openqa.selenium.WebElement

open class LandingScreenStepDefs {
    protected var driver:AppiumDriver<WebElement> = Hooks.driver!!
    private val landingScreen = LandingScreen(driver)

    @Then("^User clicks on get started button$")
    @Throws(Throwable::class)
    fun user_clicks_on_get_started_button() {
        landingScreen.clickGetStarted()
    }
}