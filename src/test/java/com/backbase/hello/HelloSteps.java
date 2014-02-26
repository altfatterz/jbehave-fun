package com.backbase.hello;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * @author Ton van Bart
 * @since 1/15/14 11:30 AM
 */
public class HelloSteps {

    Hello hello;
    String greeting;

    private static final boolean LOG = false;

    @Given("a new Hello instance")
    public void given() {
        log("given()");
        hello = new Hello();
    }

    @When("hello is called without argument")
    public void callHello() {
        log("callHello()");
        greeting = hello.greet();
    }

    @Then("the message should be $value")
    public void check(String value) {
        log("check("+value+")");
        assertThat(greeting, is(value));
    }

    private void log(String message) {
        // poor man's conditional compilation:
        // if LOG==false, the compiler is clever enough to make this method empty.
        if (LOG) {
            System.out.println(message);
        }
    }
}
