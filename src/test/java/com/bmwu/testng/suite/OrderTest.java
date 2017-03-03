package com.bmwu.testng.suite;

import org.testng.annotations.Test;

/**
 * Created by michael on 3/3/17.
 */
public class OrderTest {

    @Test(groups = {"orderBo", "save"})
    public void testMakeOrder() {
        System.out.println("testMakeOrder");
    }

    @Test(groups = {"orderBo", "save"})
    public void testMakeEmptyOrder() {
        System.out.println("testMakeEmptyOrder");
    }

    @Test(groups = "orderBo")
    public void testUpdateOrder() {
        System.out.println("testUpdateOrder");
    }

    @Test(groups = "orderBo")
    public void testFindOrder() {
        System.out.println("testFindOrder");
    }

}
