package com.test;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    @Given("account balance is {double}")
    public void givenAccountBalance1(Double initialBalance) {
        System.out.println("account balance is {double}");
    }
    @When("the account is credited with {double}")
    public void givenAccountBalance2(Double initialBalance) {
        System.out.println("the account is credited with {double}");
    }
    @Then("account should have a balance of {double}")
    public void givenAccountBalance3(Double initialBalance) {
        System.out.println("account should have a balance of {double}");
    }
}
