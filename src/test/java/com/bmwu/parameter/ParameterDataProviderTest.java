package com.bmwu.parameter;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by michael on 3/3/17.
 */
public class ParameterDataProviderTest {

    @Test(dataProvider = "provideNumbers")
    public void test(int number, int expected) {
        Assert.assertEquals(number, expected);
    }

    @DataProvider(name = "provideNumbers")
    public Object[][] provideData() {
        return new Object[][] {
                {10, 10},
                {100, 110},
                {200, 210}
        };
    }

    @Test(dataProvider = "dbconfig")
    public void testConnection(Map<String, String> map) {

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("[Key]: " + entry.getKey()
                                + " [Value]: " + entry.getValue());
        }
    }

    @DataProvider(name = "dbconfig")
    public Object[][] provideDBConfig() {
        Map<String, String> map = readDBConfig();
        return new Object[][] { { map } };
    }

    public Map<String, String> readDBConfig() {
        Properties prop = new Properties();
        InputStream input = getClass().getClassLoader().getResourceAsStream("db.properties");

        Map<String, String> map = new HashMap<String, String>();
        try {
            prop.load(input);
            map.put("jdbc.driver", prop.getProperty("jdbc.driver"));
            map.put("jdbc.url", prop.getProperty("jdbc.url"));
            map.put("jdbc.username", prop.getProperty("jdbc.username"));
            map.put("jdbc.password", prop.getProperty("jdbc.password"));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return map;
    }
}
