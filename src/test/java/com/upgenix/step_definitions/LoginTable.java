package com.upgenix.step_definitions;

import com.upgenix.pages.Login_Logout_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginTable {
    Login_Logout_Page loginLogoutPage =new Login_Logout_Page();

    @Given("user write valid {string}")
    public void userWriteValid(String username) {
        loginLogoutPage.username.sendKeys(username);
    }

    @When("User types valid {string}")
    public void userTypesValid(String password) {
        loginLogoutPage.password.sendKeys(password);
    }


    @Then("User sees {string} is in the username")
    public void userSeesIsInTheUsername(String expectedTitle) {
        Assert.assertEquals(loginLogoutPage.actualusername.getText(),expectedTitle);
    }
}
