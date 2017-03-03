package com.bmwu.testng.suite;

import org.testng.annotations.Test;

/**
 * Created by michael on 3/3/17.
 */
public class DatabaseTest {

    @Test(groups = "db")
    public void testConnectOracle() {
        System.out.println("testConnectOracle");
    }

    @Test(groups = "db")
    public void testConnectMsSQL() {
        System.out.println("testConnectMsSQL");
    }

    @Test(groups = "no-nosql")
    public void testConnectMongoDB() {
        System.out.println("testConnectMongoDB");
    }

    @Test(groups = {"db", "brokenTests"})
    public void testConnectMySQL() {
        System.out.println("testConnectMySQL");
    }

}
