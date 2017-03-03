package com.bmwu.testng;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

/**
 * Created by michael on 3/2/17.
 */
public class HelloWorld {

    @Test
    public void helloworldTest() {
        String email = new emailGenerator().generate();
        assertNotNull(email);
        assertEquals(email, "x@gmail.com");
    }

    class emailGenerator {

        public String generate() {
            return "x@gmail.com";
        }
    }
}


