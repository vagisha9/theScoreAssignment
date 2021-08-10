package com.theScore.test.common

import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.DesiredCapabilities
import java.io.File
import java.net.URL

class DriverFactory @Throws(InterruptedException::class) constructor() {
    var driver: AppiumDriver<WebElement>? = null
    private var selectedPlatform :String = Properties()["platform"].toString()
    private var deviceName :String = Properties()["deviceName"].toString()
    private var appPath :String = Properties()["appPath"].toString()
    private var udid :String = Properties()["udid"].toString()

    init {
        println("Selected Platform ==> $selectedPlatform")

        if (selectedPlatform == "Android") {

            val app = File(appPath)
            val capabilities = DesiredCapabilities()
            capabilities.setCapability("platformName", selectedPlatform)
            capabilities.setCapability("deviceName", deviceName)
            capabilities.setCapability("udid", udid)
            capabilities.setCapability("automationName", "UIAutomator2")
            capabilities.setCapability("newCommandTimeout", "100")
            capabilities.setCapability("app", app.absolutePath)
            driver = AndroidDriver<WebElement>(URL("http://0.0.0.0:4723/wd/hub"), capabilities)
        }
    }
}

fun DriverFactory.destroyDriver() {
    driver?.quit()
    driver = null
}