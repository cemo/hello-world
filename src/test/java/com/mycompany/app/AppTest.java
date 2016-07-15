package com.mycompany.app;

import java.util.Map;
import java.util.Properties;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest
    extends TestCase
{
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp()
    {

        Properties properties = System.getProperties();

        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            //System.out.println(entry.getKey().toString() + " " + entry.getValue().toString());
        }

        Map<String, String> env = System.getenv();

        for (Map.Entry<String , String> entry : env.entrySet()) {
            //System.out.println(entry.getKey() + " " + entry.getValue());
        }

        assertTrue( true );
    }
}
