package com.theScore.test.stepdefinitions

import com.theScore.test.common.DriverFactory
import com.theScore.test.common.destroyDriver
import cucumber.api.java.After
import cucumber.api.java.Before
import io.appium.java_client.AppiumDriver
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.io.IOException

class Hooks {
    private val driverFactory: DriverFactory = DriverFactory()

    @Before
    @Throws(InterruptedException::class)
    fun startUp() {
        driver = driverFactory.driver
        try{
            WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("action_button_text")))
        }catch (e: Exception) {
            println("No alert present")
        }
    }

    @After
    @Throws(IOException::class, InterruptedException::class)
    fun tearDown() {
        driverFactory.destroyDriver()
    }

    companion object {
        var driver: AppiumDriver<WebElement>? = null
    }
}