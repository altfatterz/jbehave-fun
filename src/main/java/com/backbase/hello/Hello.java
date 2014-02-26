package com.backbase.hello;

/**
 * @author Ton van Bart
 * @since 1/15/14 11:28 AM
 */
public class Hello {

    public String greet() {
        return "Hello, World!";
    }

    public String greet(String name) {
        return String.format("Hello, %s!", name);
    }

}
