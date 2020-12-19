package com.example.demo;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

@DisplayName("Junit nested test case")
public class TestClass {
    @BeforeAll
    static void beforeAll(){
        System.out.println("Before All");
    }

    @BeforeEach
    static void beforeEach()
    {
        System.out.println("Before Each ");
    }

    @AfterEach
    static void afterEach(){
        System.out.println("After Each");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After All");
    }

}
