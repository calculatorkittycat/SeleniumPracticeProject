package com.cybertek.testsJunit;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

    @Test
    public void testAddition(){//a void method, does not return anything, does not have parmenters

        System.out.println("Hello World Addition");
        int num1 = 2;
        int num2 = 6;
        int expectedResult = 5;

        assertEquals(expectedResult, num1+num2);
        //assertEquals("abc","abc");

    }
    @Test
    public void testString(){
        System.out.println("message from testString");
        String name = "Junit1";
        assertEquals("Junit",name);
    }



}
