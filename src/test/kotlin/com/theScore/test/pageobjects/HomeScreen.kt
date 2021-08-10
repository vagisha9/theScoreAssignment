package com.theScore.test.pageobjects

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.PageFactory

class HomeScreen(driver: AppiumDriver<WebElement>): StandardScreen(driver) {

    @AndroidFindBy(id="label")
    private val labels: List<WebElement>? = null

    @AndroidFindBy(id="search_bar_text_view")
    private val searchBar: WebElement? = null

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver),this)
        isScreenLoaded(searchBar!!.isDisplayed)
    }

    val isFavouritesIconDisplayed: Boolean
        get() = isElementPresent(By.xpath("//android.widget.TextView[@text='Favorites']"))

    val isFavouritesScreenSelected: Boolean
        get() = driver.findElementByXPath("//android.widget.TextView[@text='Favorites']").isSelected

    fun clickLeague(leagueLabel: String){
        labels?.forEach{ label ->
            if(label.text.equals(leagueLabel))
                label.click()
        }
    }

    fun isLabelPresent(leagueLabel: String): Boolean{
        labels?.forEach{ label ->
            if(label.text.equals(leagueLabel))
                return true
        }
        return false
    }

    val isSearchBarDisplayed: Boolean
        get()=searchBar!!.isDisplayed

}