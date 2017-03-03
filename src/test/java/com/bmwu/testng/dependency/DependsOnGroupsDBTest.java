package com.bmwu.testng.dependency;

import org.testng.annotations.Test;

/**
 * Created by michael on 3/3/17.
 */
public class DependsOnGroupsDBTest {

    @Test(groups = "db", dependsOnGroups = "deploy")
    public void initDB() {
        System.out.println("initDB");
    }

    @Test(groups = "db", dependsOnMethods = "initDB")
    public void testConnection() {
        System.out.println("testConnection()");
    }
}
