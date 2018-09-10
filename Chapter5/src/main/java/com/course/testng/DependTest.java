package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by Tyc on 2018-09-04
 */
public class DependTest {

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
