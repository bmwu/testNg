package com.bmwu.testng.groups;

import org.testng.annotations.Test;

/**
 * 一个test方法可以属于多个groups
 *
 * Created by michael on 3/3/17.
 */
public class MiscGroupTest {

    @Test(groups = {"do", "group-test"})
    public void runMiscGroupTest() {
        System.out.println("runMiscGroupTest");
    }
}
