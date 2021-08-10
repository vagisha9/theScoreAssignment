package com.theScore.test.stepdefinitions

import com.theScore.test.pageobjects.*
import cucumber.api.java.en.Then
import io.appium.java_client.AppiumDriver
import org.openqa.selenium.WebElement
import org.junit.Assert.*

class LeagueDetailsScreenStepDefs {
    private var driver:AppiumDriver<WebElement> = Hooks.driver!!
    private val leagueDetailsScreen = LeagueDetailsScreen(driver)


    @Then("^User should see title \"([^\"]*)\" as expected$")
    fun user_should_see_title_as_expected(title: String) {
        assertEquals("Title displayed on league details screen does nto match with expected",title.uppercase(),leagueDetailsScreen.getTitle())
    }

    @Then("^User clicks on standings tab$")
    fun user_clicks_on_standings_tab() {
        leagueDetailsScreen.clickLeagueDetailsTab("STANDINGS")
    }

    class StandingsScreenStepDefs {
        private var driver: AppiumDriver<WebElement> = Hooks.driver!!
        private val standingsScreen = LeagueDetailsScreen.StandingsScreen(driver)

        @Then("^User should see that standings tab is selected$")
        fun user_should_see_that_standings_tab_is_selected() {
            assertTrue("Standings tab is not selected", standingsScreen.isStandingsTabSelected())
        }

        @Then("^User should see that team \"([^\"]*)\" standings is displayed$")
        fun user_should_see_that_team_standings_is_displayed(team: String) {
            assertTrue("Selected team $team standing is not displayed", standingsScreen.isTeamDisplayed(team))
        }

        @Then("^User clicks back button from standings$")
        fun user_clicks_back_button_from_standings() {
            standingsScreen.clickStandingsBack()
        }
    }
}