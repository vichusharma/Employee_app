package com.example.demo;

import org.junit.*;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpringTest {

    @BeforeEach
    public static void beforeEach()
    {
        System.out.println("before each execution");
    }



    @BeforeClass
    public static void beforeClass(){
        System.out.println("before execution");
    }


    @Test
    public void TestAssertEquals()
    {
        System.out.println("test 1");
        int ActualOutput= Math.min(10,5);
        int ExpectedOutput=5;
        assertEquals(ActualOutput,ExpectedOutput);
    }
    @Test
    public void TestStringAssert()
    {
        System.out.println("test 2");
        String value="abcdefg";
        String ActualOutput= value.toUpperCase();
        String ExpectedOutput="ABCDEFG";
        assertEquals(ActualOutput,ExpectedOutput);

    }

    @Test(expected = NullPointerException.class)
    public void TestStringAssertNullPointer()
    {
        System.out.println("test 3");
        String value=null;
        String ActualOutput= value.toUpperCase();
        String ExpectedOutput="ABCDEFG";
        assertEquals(ActualOutput,ExpectedOutput);

    }
    @Test
    public void test4()
    {
        System.out.println("test4");
      assertTrue(true);
    }

    @AfterClass
    public static void AfterClass(){
        System.out.println("after execution");
    }


}
