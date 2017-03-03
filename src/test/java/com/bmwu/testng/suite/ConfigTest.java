package com.bmwu.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * Created by michael on 3/3/17.
 */
public class ConfigTest {

    @BeforeSuite
    public void testBeforeSuite() {
        System.out.println("testBeforeSuite");
    }

    @AfterSuite
    public void testAfterSuite() {
        System.out.println("testAfterSuite");
    }

    @BeforeTest
    public void testBeforeTest() {
        System.out.println("testBeforeTest");
    }

    @AfterTest
    public void testAfterTest() {
        System.out.println("testAfterTest");
    }
}
