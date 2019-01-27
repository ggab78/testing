package com.gabriel;

import org.junit.Test; //junit4 testing framework for Java
import static org.junit.Assert.assertEquals;

public class JUnit4HelloWorldTest {

    @Test
    public void getHello() {
        HelloWorld helloWorld = new HelloWorld();
    assertEquals("Hello World",helloWorld.getHello());
    }
}