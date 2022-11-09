package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatingCucumber {
    @Given("John is hungry")
    public void john_is_hungry() {
        System.out.println("It is from Given");

    }
    @When("he eats some cucumbers")
    public void he_eats_some_cucumbers() {
        System.out.println("It is from When");
    }
    @Then("he will be full")
    public void he_will_be_full() {
        System.out.println("It is from Then");
    }

    @Given("{string} is hungry")
    public void is_hungry(String name) {
        System.out.println("It is from sting name param");
    }
    @When("he eats {int} cucumbers")
    public void he_eats_cucumbers(Integer count) {
        System.out.println("It is from in cucumber count");

    }


}