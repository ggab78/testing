package com.gabriel;

public class HelloWorldTest {

    public void testGetHello() {
        HelloWorld helloWorld = new HelloWorld();
        assert ("Hello World".equals(helloWorld.getHello()));
    }
}