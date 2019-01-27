package com.gabriel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class HelloWorldTest {

    @Test
    void getHello() {
        HelloWorld helloWorld =new HelloWorld();
        assertEquals("Hello World",helloWorld.getHello());
    }
}