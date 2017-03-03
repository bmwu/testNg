package com.bmwu.testng.configurationannotations;

import org.testng.annotations.*;

/**
 * Created by michael on 3/2/17.
 */
public class ConfigurationTest {

    @BeforeGroups("exercise")
    public void beforeGroups() {
        System.out.println("@BeforeGroups");
    }

    @AfterGroups("exercise")
    public void afterGroups() {
        System.out.println("@AfterGroups");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("@AfterClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("@BeforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("@AfterMethod");
    }

    @Test(groups = "exercise")
    public void test1() {
        System.out.println("@Test - test1 Groups");
    }

    @Test
    public void test2() {
        System.out.println("@Test - test2");
    }
}
