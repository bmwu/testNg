package com.bmwu.expectedexception;

import org.testng.annotations.Test;

/**
 * Created by michael on 3/3/17.
 */
public class RuntimeTest {

    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWIthException() {
        int i = 1 / 0;
    }
}
