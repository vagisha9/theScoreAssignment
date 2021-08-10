package com.theScore.test.pageobjects

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.PageFactory

open class LeagueDetailsScreen(driver: AppiumDriver<WebElement>): StandardScreen(driver) {

    @AndroidFindBy(id = "titleTextView")
    private val title: WebElement? = null

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
        isScreenLoaded(title!!.isDisplayed)
    }

    fun getTitle(): String {
        return title!!.text
    }

    fun clickLeagueDetailsTab(tab: String): Any {
        driver.findElementByXPath("//android.widget.TextView[@text='$tab']").click()
        return when(tab){
            "STANDINGS"-> StandingsScreen(driver)
            else-> LeagueDetailsScreen(driver)
        }
    }

    class StandingsScreen(driver: AppiumDriver<WebElement>) : LeagueDetailsScreen(driver) {

        init {
           isScreenLoaded(isStandingsTabSelected())
        }

        fun getStandingsTeamName(team: String): String{
            return when(team){
                "Montreal Canadiens" -> "MTL Canadiens"
                else-> "Team name not found"
            }
        }

        fun isStandingsTabSelected(): Boolean {
            return driver.findElementByXPath("//android.widget.TextView[@text='STANDINGS']").isSelected
        }

        fun isTeamDisplayed(teamName: String): Boolean {
            val standingsTeam = getStandingsTeamName(teamName)
            return isElementPresent(By.xpath("//android.widget.TextView[@text='$standingsTeam']"))
        }

        fun clickStandingsBack(): HomeScreen{
            driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Navigate up']").click()
            return HomeScreen(driver)
        }
    }
}