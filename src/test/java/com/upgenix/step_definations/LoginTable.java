package com.upgenix.step_definations;

import com.upgenix.pages.LoginPage;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginTable {
    LoginPage loginPage=new LoginPage();

    @Given("user write valid {string}")
    public void userWriteValid(String username) {
        loginPage.username.sendKeys(username);
    }

    @When("User types valid {string}")
    public void userTypesValid(String password) {
        loginPage.password.sendKeys(password);
    }


    @Then("User sees {string} is in the username")
    public void userSeesIsInTheUsername(String expectedTitle) {
        Assert.assertEquals(loginPage.actualusername.getText(),expectedTitle);
    }
}
