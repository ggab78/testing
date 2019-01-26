package com.gabriel;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void getHello() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World",helloWorld.getHello());
    }
}