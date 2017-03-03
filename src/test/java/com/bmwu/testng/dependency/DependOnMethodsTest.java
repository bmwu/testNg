package com.bmwu.testng.dependency;

import org.testng.annotations.Test;

/**
 * Created by michael on 3/3/17.
 */
public class DependOnMethodsTest {

    @Test
    public void runTest1() {
        System.out.println("runTest1");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = "runTest1")
    public void runTest2() {
        System.out.println("runTest2");
    }

    @Test(dependsOnMethods = {"runTest1", "runTest2"})
    public void runTest3() {
        System.out.println("runTest3");
    }
}
