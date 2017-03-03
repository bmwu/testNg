package com.bmwu.parameter;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * Created by michael on 3/3/17.
 */
public class ParameterDataProviderMethodTest {

    @Test(dataProvider = "dataProvider")
    public void test1(int number, int expected) {
        Assert.assertEquals(number, expected);
    }

    @Test(dataProvider = "dataProvider")
    public void test2(String email, String expected) {
        Assert.assertEquals(email, expected);
    }

    @DataProvider(name = "dataProvider")
    public Object[][] provideData(Method method) {
        Object[][] result = null;

        if (method.getName().equals("test1")) {
            result = new Object[][] {
                    {1, 1},
                    {20, 20}
            };
        } else if (method.getName().equals("test2")) {
            result = new Object[][] {
                    { "x@163.com", "x@163.com" },
                    { "x@gmail.com", "x@gmail.com" }
            };
        }
        return result;
    }
}
