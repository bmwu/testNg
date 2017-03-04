package com.bmwu.spring;

import com.bmwu.service.EmailGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * todo: 熟悉bean文件配置 XmlBeanDefinitionReader.class
 *
 * /Users/michael/.m2/repository/org/springframework/spring-beans/4.1.6.RELEASE/spring-beans-4.1.6.RELEASE.jar!/org/springframework/beans/factory/xml/XmlBeanDefinitionReader.class
 *
 * Created by michael on 3/5/17.
 */
@Test
@ContextConfiguration(locations = "classpath:spring-test-config.xml")
public class SpringTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private EmailGenerator emailGenerator;

    @Test()
    public void EmailGeneratorTest() {

        String email = emailGenerator.generateEmail();
        System.out.println(email);

        Assert.assertNotNull(email);
        Assert.assertEquals(email, "bmwu.hz@gmail.com");


    }


}
