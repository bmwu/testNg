package com.bmwu.testng.ignore;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by michael on 3/3/17.
 */
public class IgnoreTest {

    @Test  //default enabled = true
    public void test1() {
        Assert.assertEquals(true, true);
    }

    @Test(enabled = true)
    public void test2() {
        Assert.assertEquals(true, true);
    }

    @Test(enabled = false)
    public void test3() {
        Assert.assertEquals(true, true);
    }
}
