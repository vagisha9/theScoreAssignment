package com.theScore.test.stepdefinitions

import com.theScore.test.pageobjects.ChooseLeagueScreen
import cucumber.api.java.en.Then
import io.appium.java_client.AppiumDriver
import org.openqa.selenium.WebElement
import org.junit.Assert.*

class ChooseLeagueScreenStepDefs {
    private var driver:AppiumDriver<WebElement> = Hooks.driver!!
    private val chooseLeague = ChooseLeagueScreen(driver)

    @Then("^Verify that league \"([^\"]*)\" is displayed$")
    fun verify_league_is_displayed(league: String) {
        assertTrue("League $league is not present",chooseLeague.isLeaguePresent(league))

    }

    @Then("^User clicks on \"([^\"]*)\" league$")
    fun user_clicks_on_league(league: String) {
        chooseLeague.clickLeague(league)
    }

    @Then("^User clicks on continue$")
    fun user_clicks_on_continue() {
        chooseLeague.clickContinue()
        chooseLeague.clickLocationLater()
    }
}