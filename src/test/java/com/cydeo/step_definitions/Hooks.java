package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("Before Scenario is running");
    }

    @After
    public void tearDown(){
        System.out.println("After Scenario is running");
    }
}
