package com.upgenix.step_definations;

import com.upgenix.pages.LoginPage;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinations {
    LoginPage loginPage=new LoginPage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("v");
    }
    @When("user enters SalesManager username")
    public void user_enters_sales_manager_username() {

    }
    @When("user enters SalesManager password")
    public void user_enters_sales_manager_password() {

    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {

    }

    @When("user enters PosManager username")
    public void user_enters_pos_manager_username() {

    }
    @When("user enters PosManager password")
    public void user_enters_pos_manager_password() {

    }



}
