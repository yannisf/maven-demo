package com.trasysgroup.maven;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GreetingHelperTest {

    private static final Logger LOG = Logger.getLogger(GreetingHelperTest.class);

    @Test
    public void testGreeting() {
        LOG.debug("Testing GreetingHelper");
        GreetingHelper helper = new GreetingHelper("Yannis");
        String actual = helper.createGreeting();
        String expected = "Hello, Yannis!";
        Assert.assertEquals(actual, expected);
    }

}
