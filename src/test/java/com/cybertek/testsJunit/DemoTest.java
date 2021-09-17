package com.cybertek.testsJunit;

import org.junit.jupiter.api.*;

public class DemoTest {

    @BeforeAll
    public static void init(){
        System.out.println("@BeforeAll run once before all tests");
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("@AfterAll run once after all tests");
    }

    @BeforeEach
    public void setup(){
        System.out.println("@BeforeEach run before each test");
    }

    @AfterEach
    public void tearDown(){
        System.out.println("@AfterEach run after each test");
    }

    @Test
    public void test1(){
        System.out.println("test 1 is running");
    }

    @Test
    public void test2(){
        System.out.println("test 2 is running");
    }
}
