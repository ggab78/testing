package com.gabriel;

import org.junit.jupiter.api.Test; //junit5 testing framework for Java

import static org.junit.jupiter.api.Assertions.*;

class JUnit5HelloWorldTest {

    @Test
    void getHello() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World",helloWorld.getHello());
    }
}