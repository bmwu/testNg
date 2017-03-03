package com.bmwu.testng.dependency;

import org.testng.annotations.Test;

/**
 * Created by michael on 3/3/17.
 */
public class DependsOnGroupsAppTest {

    @Test(dependsOnGroups = {"deploy", "db"})
    public void method1() {
        System.out.println("method1");
    }

    @Test(dependsOnMethods = "method1")
    public void method2() {
        System.out.println("method2");
    }
}
