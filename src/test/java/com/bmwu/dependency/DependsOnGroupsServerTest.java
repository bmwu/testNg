package com.bmwu.dependency;

import org.testng.annotations.Test;

/**
 * Created by michael on 3/3/17.
 */
@Test(groups = "deploy")
public class DependsOnGroupsServerTest {

    @Test
    public void deployServer() {
        System.out.println("Deploying server...");
    }

    @Test(dependsOnMethods = "deployServer")
    public void deployBackUpServer() {
        System.out.println("Deploying Backup Server...");
    }
}
