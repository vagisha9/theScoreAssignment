package com.theScore.test.pageobjects

import io.appium.java_client.AppiumDriver
import org.junit.Assert
import org.openqa.selenium.By
import org.openqa.selenium.NoSuchElementException
import org.openqa.selenium.WebElement

open class StandardScreen(var driver: AppiumDriver<WebElement>) {

    protected fun isElementPresent(locatorKey: By): Boolean {
        try {
            driver.findElement(locatorKey)
            return true
        } catch (e: NoSuchElementException) {
            return false
        }
    }

    protected fun isScreenLoaded(booleanCondition: Boolean) {
        Assert.assertTrue(this.javaClass.name + " not loaded.", booleanCondition)
    }
}