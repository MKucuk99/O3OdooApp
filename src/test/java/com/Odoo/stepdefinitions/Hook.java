package com.Odoo.stepdefinitions;

import com.Odoo.utilities.Driver;
import io.cucumber.core.api.Scenario;
import org.junit.After;
import org.junit.Before;

public class Hook {

    //Launching and maximizing window
    @Before
    public void setup(){
        System.out.println("###############################");
        System.out.println("Test Setup!");
        Driver.get().manage().window().maximize();
    }

    //Closing windows and passing results to test suite
    @After
    public void teardown(Scenario scenario){
        if(scenario.isFailed()){
            System.out.println("Test Failed!");
        }else{
            System.out.println("Cleaning up...");
            System.out.println("Test Passed!");
        }
        System.out.println("###############################");
        Driver.close();
    }
}
