package com.bmwu.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by michael on 3/3/17.
 */
public class ParameterXMLTest {

    private Connection connection;

    @Test
    @Parameters({"dbconfig", "poolsize"})
    public void createConnection(String dbconfig, int poolsize) {

        System.out.println("dbconfig: " + dbconfig);
        System.out.println("poolsize: " + poolsize);

        Properties prop = new Properties();
        InputStream input = null;

        input = getClass().getClassLoader().getResourceAsStream(dbconfig);

        try {
            prop.load(input);
            String driver = prop.getProperty("jdbc.driver");
            String url = prop.getProperty("jdbc.url");
            String username = prop.getProperty("jdbc.username");
            String password = prop.getProperty("jdbc.password");

            System.out.println("driver: "+ driver);
            System.out.println("url: "+ url);
            System.out.println("username: "+ username);
            System.out.println("password: "+ password);

            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
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
    }
}
