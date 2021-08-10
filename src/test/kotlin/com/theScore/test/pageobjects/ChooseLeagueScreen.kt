package com.theScore.test.pageobjects

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.PageFactory

class ChooseLeagueScreen(driver: AppiumDriver<WebElement>): StandardScreen(driver) {

    @AndroidFindBy(id="action_button_text")
    private val continueBtn: WebElement? = null

    @AndroidFindBy(id="btn_disallow")
    private val locationLater: WebElement? = null

    @AndroidFindBy(id="title_onboarding")
    private val title: WebElement? = null

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver),this)
        isScreenLoaded(title!!.isDisplayed)
    }

    fun isLeaguePresent(league: String): Boolean{
        return isElementPresent(By.xpath("//android.widget.TextView[@text='$league']"))
    }

    fun clickLeague(league: String){
        if(isLeaguePresent(league)){
            driver.findElementByXPath("//android.widget.TextView[@text='$league']").click()
        }
    }

    fun clickContinue() {
        continueBtn!!.click()
    }

    fun clickLocationLater(): ChooseTeamScreen{
        locationLater!!.click()
        return ChooseTeamScreen(driver)
    }
}