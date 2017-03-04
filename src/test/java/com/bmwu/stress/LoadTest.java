package com.bmwu.stress;

import org.testng.annotations.Test;

/**
 * Created by michael on 3/4/17.
 */
public class LoadTest {

    @Test(invocationCount = 10)
    public void repeatThis() {
        System.out.println("repeatThis");
    }
}
