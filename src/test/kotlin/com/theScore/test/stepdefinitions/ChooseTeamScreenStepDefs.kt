package com.theScore.test.stepdefinitions

import com.theScore.test.pageobjects.ChooseTeamScreen
import cucumber.api.java.en.Then
import io.appium.java_client.AppiumDriver
import org.openqa.selenium.WebElement
import org.junit.Assert.*

class ChooseTeamScreenStepDefs {
    private var driver:AppiumDriver<WebElement> = Hooks.driver!!
    private val chooseTeam = ChooseTeamScreen(driver)

    @Then("^Verify that team \"([^\"]*)\" is displayed$")
    fun verify_team_is_displayed(team: String) {
        assertTrue("Team $team is not present",chooseTeam.isTeamPresent(team))

    }

    @Then("^User clicks on \"([^\"]*)\" team$")
    fun user_clicks_on_team(team: String) {
        chooseTeam.clickTeam(team)
    }

    @Then("^User clicks on continue on choose team$")
    fun user_clicks_on_continue_on_choose_team() {
        chooseTeam.clickContinue()
    }
}