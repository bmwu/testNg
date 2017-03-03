package com.bmwu.groups;

import org.testng.annotations.Test;

/**
 * Created by michael on 3/3/17.
 */
@Test(groups = "group-test")
public class GroupOnClassTest {

    public void runGroupOnClass() {
        System.out.println("runGroupClass");
    }
}
