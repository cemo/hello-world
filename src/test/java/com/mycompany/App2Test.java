package com.mycompany;

import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class App2Test
{
    /**
     * Rigourous Test :-)
     */

    @Test
    public void test_method_2() {
        if (1==1){
            System.out.println("@Test - test_method_2");
        }
    }
    /**
     * Rigourous Test :-)
     */

    @Test
    public void test_method_3() {
        String name = getName();
    }

    public String getName() {
        return "Test";
    }
}
