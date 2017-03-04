package com.bmwu.stress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by michael on 3/4/17.
 */
public class MultipleThreadsTest {

    /**
     * todo: 深入了解 "Only local connections are allowed."
     * @throws MalformedURLException
     */
    @Test(invocationCount = 5, threadPoolSize = 3, timeOut = 50000)
    public void loadTestThisWebSite() throws MalformedURLException {

        System.out.printf("%n[START] Thread Id : %s is started!\n", Thread.currentThread().getId());

        System.setProperty("webdriver.chrome.driver", "/Users/michael/michael/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://localhost");
        System.out.println("This driver is " + webDriver.getTitle());
        Assert.assertEquals("localhost", webDriver.getTitle());
        webDriver.quit();

        System.out.printf("%n[END] Thread Id : %s\n", Thread.currentThread().getId());
    }
}
