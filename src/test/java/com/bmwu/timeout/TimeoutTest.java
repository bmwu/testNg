package com.bmwu.timeout;

import org.testng.annotations.Test;

/**
 * Created by michael on 3/3/17.
 */
public class TimeoutTest {

    @Test(timeOut = 5000) // time in mulliseconds
    public void testThisShouldPass() throws InterruptedException {
        Thread.sleep(4000);
    }

    @Test(timeOut = 1000)
    public void testThisShouldFail() {
        while(true);
    }
}
