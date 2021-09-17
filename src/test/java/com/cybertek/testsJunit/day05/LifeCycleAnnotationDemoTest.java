package com.cybertek.testsJunit.day05;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LifeCycleAnnotationDemoTest {

    @BeforeAll
    public static void init(){
        System.out.println("HEY IM FIRST");
    }

    @BeforeEach

    @AfterAll
    public static void cleanup(){
        System.out.println("CLEANING");
    }

    @Test
    public void test1(){
        System.out.println("Test 1 method is running");
    }

    @Test
    public void test2(){
        System.out.println("Test 2 method is running");
    }


}
