package com.theScore.test.pageobjects

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.PageFactory

class ChooseTeamScreen(driver: AppiumDriver<WebElement>): StandardScreen(driver) {

    @AndroidFindBy(id="action_button_text")
    private val continueBtn: WebElement? = null

    @AndroidFindBy(id="action_button_text")
    private val done: WebElement? = null

    @AndroidFindBy(id="title_onboarding")
    private val title: WebElement? = null

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver),this)
        isScreenLoaded(title!!.isDisplayed)
    }

    fun isTeamPresent(team: String): Boolean{
        return isElementPresent(By.xpath("//android.widget.TextView[@text='$team']"))
    }

    fun clickTeam(team: String){
        if(isTeamPresent(team)){
            driver.findElementByXPath("//android.widget.TextView[@text='$team']").click()
        }
    }

    fun clickContinue(){
        continueBtn!!.click()
        done!!.click()
    }
}