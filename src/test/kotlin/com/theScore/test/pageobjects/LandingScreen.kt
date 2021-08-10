package com.theScore.test.pageobjects

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.PageFactory

class LandingScreen(driver: AppiumDriver<WebElement>): StandardScreen(driver) {

    @AndroidFindBy(id="action_button_text")
    private val getStarted: WebElement? = null

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver),this)
        isScreenLoaded(getStarted!!.isDisplayed)
    }

    fun clickGetStarted(){
        getStarted!!.click()
    }
}