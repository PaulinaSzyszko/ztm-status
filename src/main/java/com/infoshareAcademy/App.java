package com.infoshareAcademy;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class App {
    private WebDriver driver;
    private ZtmSelectors selectors;

    //odpalenie strony internetowej
    @Before
    public void startBrowser() {
        String url = "https://ztm.gda.pl/hmvc/";
        driver = new ChromeDriver();
        driver.get(url);
        selectors = new ZtmSelectors();

    }

    @After
    public void closedBrowser() {
        driver.quit();
    }

    @Test
    public void checkTimetables() {
        WebElement line12Button = driver.findElement(selectors.getLinia12Selector());
        line12Button.click();
        WebElement tetmajeraButton = driver.findElement(selectors.getTetmajeraStation());
        tetmajeraButton.click();

        List<WebElement> timetables = driver.findElements(selectors.getTimetable());
        Assert.assertEquals(3,timetables.size());

    }
}
