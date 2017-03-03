package com.bmwu.parameter;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by michael on 3/3/17.
 */
public class ParameterDataProviderITestContentTest {

    @Test(dataProvider = "dataProvider", groups = {"groupA"})
    public void test1(int number) {
        Assert.assertEquals(number, 1);
    }

    @Test(dataProvider = "dataProvider", groups = "groupB")
    public void test2(int number) {
        Assert.assertEquals(number, 2);
    }

    @DataProvider(name = "dataProvider")
    public Object[][] provideData(ITestContext context) {

        Object[][] result = null;

        for (String group : context.getIncludedGroups()) {
            System.out.println("group: " + group);

            if ("groupA".equals(group)) {
                result = new Object[][] {{1}};
                break;
            }
        }

        if (result == null) {
            result = new Object[][] {{2}};
        }
        return result;
    }
}
