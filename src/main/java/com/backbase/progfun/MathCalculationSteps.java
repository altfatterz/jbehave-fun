package com.backbase.progfun;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MathCalculationSteps {

    int x;

    @Given("a variable x with value $value")
    public void given(int value) {
        x = value;
    }

    @When("is x multiplied by $value")
    public void multiply(int value) {
        x = x * value;
    }

    @Then("x should equal $value")
    public void check(int value) {
        assertThat(x, is(value));
    }

}
