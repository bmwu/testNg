package com.bmwu.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * Created by michael on 3/3/17.
 */
public class GroupTest {
    @BeforeGroups("do")
    public void setup() {
        System.out.println("setup");
    }

    @AfterGroups("do")
    public void clean() {
        System.out.println("clean");
    }

    @Test(groups = "group-test")
    public void runGroup1Test1() {
        System.out.println("runGroup1Test1");
    }

    @Test(groups = "group-test")
    public void runGroup1Test2() {
        System.out.println("runGroup1Test2");
    }

    @Test(groups = "do")
    public void runDoTest1() {
        System.out.println("runDoTest1");
    }

    @Test(dependsOnGroups = { "do", "group-test"})
    public void runFinal() {
        System.out.println("runFinal");
    }
}