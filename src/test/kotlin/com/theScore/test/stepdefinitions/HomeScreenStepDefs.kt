package com.theScore.test.stepdefinitions

import com.theScore.test.pageobjects.HomeScreen
import cucumber.api.java.en.Then
import io.appium.java_client.AppiumDriver
import org.assertj.core.api.SoftAssertions
import org.openqa.selenium.WebElement
import org.junit.Assert.*

class HomeScreenStepDefs {
    private var driver:AppiumDriver<WebElement> = Hooks.driver!!
    private val homeScreen = HomeScreen(driver)
    protected var softAssertions = SoftAssertions()

    @Then("^User should be on favourites tab on home screen$")
    fun user_should_be_on_favourites_tab_n_home_screen() {
        softAssertions.assertThat(homeScreen.isFavouritesIconDisplayed).isTrue
        softAssertions.assertThat(homeScreen.isFavouritesScreenSelected).isTrue
        softAssertions.assertAll()
    }

    @Then("^User clicks on \"([^\"]*)\" label$")
    fun user_clicks_on_label(label: String) {
        homeScreen.clickLeague(label)
    }

    @Then("^User should see label \"([^\"]*)\" is present$")
    fun user_should_see_label_is_present(label: String) {
        homeScreen.isLabelPresent(label)
    }

    @Then("^User should see search bar$")
    fun user_should_see_search_bar() {
        assertTrue("Search bar is not displayed", homeScreen.isSearchBarDisplayed)
    }

}