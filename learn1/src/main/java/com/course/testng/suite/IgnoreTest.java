package com.course.testng.suite;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();

    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
